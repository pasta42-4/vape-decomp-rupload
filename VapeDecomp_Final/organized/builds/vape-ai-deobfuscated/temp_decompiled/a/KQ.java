/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 */
package a;

import a.O_;
import a.a;
import a.d8;
import a.ko;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;

public class kq
extends ko {
    private int n;
    private static final String g = "#version 430 compatibility\nprecision highp float;\n\nlayout(location = 0) uniform vec4 u_InnerRect;         // Rectangle bounds\nlayout(location = 1) uniform vec4 u_Spread;            // Spread (sigma)\nlayout(location = 2) uniform vec4 u_ShadowColor;       // Shadow color (r, g, b, a)\nlayout(location = 3) uniform vec4 u_StrokeColor;       // Stroke color (r, g, b, a)\nlayout(location = 4) uniform vec4 u_RectColor;         // Black rectangle color (r, g, b, a)\nlayout(location = 5) uniform vec4 u_CornerRadius;      // Corner radius\nlayout(location = 6) uniform vec4 u_ShadowOffset;      // Shadow offset (x, y)\nlayout(location = 7) uniform vec4 u_StrokeWidth;       // Stroke width\nlayout(location = 8) uniform vec4 u_DrawCircle;        // DrawCircle (1/0)\nlayout(location = 9) uniform vec4 u_CircleThickness;   // Circle thickness\nlayout(location = 10) uniform vec4 u_CircleColor;      // Circle stroke color (r, g, b, a)\nlayout(location = 11) uniform vec4 u_CircleYOffset;    // Circle Y offset\nlayout(location = 12) uniform vec4 u_DisableShader;    // DisableShader (1/0)\n\nlayout(location = 13) uniform sampler2D u_Texture;     // Texture sampler\n\nin vec2 f_Position;\nout vec4 fragColor;\n\n// Helper function to draw the shadow\nvec4 drawRectShadow(vec2 pos, vec4 rect, vec4 color, float sigma, float cornerRadius) {\n    vec2 shadowOffsetPos = pos - rect.xy - rect.zw * 0.5;\n    float shadowDist = length(max(abs(shadowOffsetPos) - rect.zw * 0.5 + vec2(cornerRadius), 0.0));\n    float shadowMask = 1.0 - smoothstep(0.0, sigma, shadowDist);\n    return vec4(color.rgb, color.a * shadowMask);\n}\n\n// Calculate distance to the outer edge of the rounded rectangle\nfloat distToRoundedRect(vec2 p, vec4 rect, float r) {\n    vec2 d = abs(p - rect.xy - rect.zw * 0.5) - rect.zw * 0.5 + vec2(r);\n    return length(max(d, 0.0)) - r;\n}\n\n// Function to draw a circle stroke\nvec4 drawCircleStroke(vec2 pos, vec2 center, float radius, float thickness, vec4 strokeColor) {\n    float dist = length(pos - center);\n    float outerEdge = radius + thickness * 0.5;\n    float innerEdge = radius - thickness * 0.5;\n    float strokeAlpha = smoothstep(innerEdge - 0.5, innerEdge, dist) * (1.0 - smoothstep(outerEdge, outerEdge + 0.5, dist));\n    return vec4(strokeColor.rgb, strokeColor.a * strokeAlpha);\n}\n\nvoid main() {\n    if (u_DisableShader.x == 1.0) {\n        vec2 coords = gl_TexCoord[0].xy;\n        fragColor = texture2D(u_Texture, coords);  // Output the texture color\n        return;\n    }\n\n    float sigma = u_Spread.x;\n    float cornerRadius = u_CornerRadius.x;\n    vec2 shadowOffset = u_ShadowOffset.xy;\n    float strokeWidth = u_StrokeWidth.x;\n\n    vec4 rect = u_InnerRect;\n    vec4 shadowRect = vec4(vec2(rect.x + shadowOffset.x, rect.y + shadowOffset.y), vec2(rect.z, rect.w));\n    vec4 shadowColor = u_ShadowColor;\n    vec3 strokeColor = u_StrokeColor.rgb;\n    vec3 blackColor = u_RectColor.rgb;\n    float blackAlpha = u_RectColor.a;\n    float strokeAlpha = u_StrokeColor.a;\n\n    vec2 offsetPos = f_Position - shadowOffset;\n    vec4 result = drawRectShadow(offsetPos, shadowRect, shadowColor, sigma, cornerRadius);\n\n    float dist = distToRoundedRect(f_Position, rect, cornerRadius);\n    float aaWidth = 0.05 * sigma;\n\n    float strokeOuterEdge = strokeWidth;\n    float strokeInnerEdge = 0.0;\n\n    if (dist <= 0.0) {\n        result.rgb = blackColor;\n        result.a = blackAlpha;\n    } else if (dist > 0.0 && dist <= strokeOuterEdge) {\n        float innerStrokeAlpha = smoothstep(strokeInnerEdge, strokeInnerEdge + 0.5, dist);\n        result.rgb = mix(blackColor, strokeColor, innerStrokeAlpha);\n        result.a = mix(blackAlpha, 1.0, innerStrokeAlpha);\n    } else if (dist > strokeOuterEdge && dist <= (strokeOuterEdge + aaWidth)) {\n        float outerStrokeAlpha = smoothstep(strokeOuterEdge, strokeOuterEdge + aaWidth, dist);\n        result.rgb = mix(strokeColor, shadowColor.rgb, outerStrokeAlpha);\n        result.a = mix(1.0, result.a, outerStrokeAlpha);\n    } else {\n        float outerCornerSmoothing = smoothstep(0.0, aaWidth, dist);\n        result.rgb = mix(blackColor, shadowColor.rgb, outerCornerSmoothing);\n        result.a = mix(blackAlpha, result.a, outerCornerSmoothing);\n    }\n\n    if (u_DrawCircle.x == 1.0) {\n        // Draw a circle stroke in the middle of the black rectangle\n        vec2 circleCenter = rect.xy + rect.zw * 0.5 + vec2(0.0, u_CircleYOffset.x);\n        vec4 circleStroke = drawCircleStroke(f_Position, circleCenter, 5.0, u_CircleThickness.x, u_CircleColor);\n\n        // Blend the circle stroke with the black rectangle color\n        result.rgb = mix(result.rgb, circleStroke.rgb, circleStroke.a);\n        result.a = mix(result.a, blackAlpha, circleStroke.a);\n    }\n\n    fragColor = result;\n}\n";
    private boolean x;
    private static final Integer[] h;
    private static final int P;
    private ByteBuffer u;
    private static final String c = "#version 430 compatibility\nout vec2 f_Position;\nvoid main() {\n    f_Position = gl_Vertex.xy;\n    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\n    gl_FrontColor = gl_Color;\n    gl_TexCoord[0] = gl_TextureMatrix[0] * gl_MultiTexCoord0;\n}\n";
    private static final long[] f;
    private boolean v;
    private static final Map i;
    private static final long b;

    public kq() {
        long l10 = b ^ 0x3F07FB0BC9B9L;
        super(a.cs((int)kq.b("g", (int)15687, (long)(0x7A690E717C293C95L ^ l10))), a.cs((int)kq.b("g", (int)14378, (long)(0x338C7537826D39FCL ^ l10))));
        this.v = false;
    }

    @Override
    public void m() {
        long l10 = b ^ 0x3BDD55822ED8L;
        try {
            if (this.u != null) {
                GL15.glUnmapBuffer((int)kq.b("g", (int)30272, (long)(0x548059E447C110F1L ^ l10)));
                this.u = null;
            }
        }
        catch (O_ o_2) {
            throw kq.a(o_2);
        }
        GL15.glBindBuffer((int)kq.b("g", (int)5879, (long)(0x794A4DBCBCC6F047L ^ l10)), (int)0);
        super.m();
    }

    public void W(float f10) {
        GL20.glUniform4f((int)1, (float)f10, (float)0.0f, (float)0.0f, (float)0.0f);
    }

    @Override
    public boolean s() {
        super.s();
        this.R();
        return true;
    }

    public void R() {
        try {
            if (this.v) {
                return;
            }
        }
        catch (O_ o_2) {
            throw kq.a(o_2);
        }
        this.v = true;
        this.W(12.0f);
        this.E(new Color(0, 0, 0, 170));
        this.L(new Color(0, 0, 0, 150));
        this.C(new Color(45, 45, 45, 255));
        this.G(6.0f);
        this.a(1.0f);
        this.V(0.8f);
        this.X(new Color(51, 51, 51, 255));
        this.l(false);
    }

    public void w(float f10, float f11, float f12, float f13) {
        GL20.glUniform4f((int)0, (float)f10, (float)f11, (float)f12, (float)f13);
    }

    public void G(float f10) {
        GL20.glUniform4f((int)5, (float)f10, (float)0.0f, (float)0.0f, (float)0.0f);
    }

    public void X(Color color) {
        GL20.glUniform4f((int)10, (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public void C(Color color) {
        GL20.glUniform4f((int)3, (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public void a(float f10) {
        GL20.glUniform4f((int)7, (float)f10, (float)0.0f, (float)0.0f, (float)0.0f);
    }

    public void E(Color color) {
        GL20.glUniform4f((int)4, (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/kq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7A9D;
        if (h[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = f[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/kq", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            kq.h[n3] = n4;
        }
        return h[n3];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = kq.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void W(boolean bl2, boolean bl3) {
        float f10;
        int n2;
        float f11;
        int n3;
        try {
            n3 = 8;
            f11 = bl2 ? 1.0f : 0.0f;
        }
        catch (O_ o_2) {
            throw kq.a(o_2);
        }
        try {
            GL20.glUniform4f((int)n3, (float)f11, (float)0.0f, (float)0.0f, (float)0.0f);
            n2 = 11;
            f10 = bl3 ? 4.0f : 0.0f;
        }
        catch (O_ o_3) {
            throw kq.a(o_3);
        }
        GL20.glUniform4f((int)n2, (float)f10, (float)0.0f, (float)0.0f, (float)0.0f);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                kq.b = d8.a(-8821083127423115651L, -1548928320926596159L, MethodHandles.lookup().lookupClass()).a(182950207526686L);
                kq.i = new HashMap<K, V>(13);
                var0 = kq.b ^ 99356367090668L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00a6\u00bd\u000b\u00a5R*\u00bcME\u00ee\u00e7\t?\u0096\u00bb\u0089\u00ab2\u00f45B6~\u00f3";
                var7_6 = "\u00a6\u00bd\u000b\u00a5R*\u00bcME\u00ee\u00e7\t?\u0096\u00bb\u0089\u00ab2\u00f45B6~\u00f3".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00cf\u00f6~\u009e\u0015\u00f4+Hj\u0097\u00b0\u00ba\u00a9\u00a1\u0010\u00e9";
                    var7_6 = "\u00cf\u00f6~\u009e\u0015\u00f4+Hj\u0097\u00b0\u00ba\u00a9\u00a1\u0010\u00e9".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        kq.f = var8_3;
        kq.h = new Integer[5];
        kq.P = (int)kq.b("g", (int)13500, (long)(var0 ^ 6443154349914165050L));
    }

    public void L(Color color) {
        GL20.glUniform4f((int)2, (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public void V(float f10) {
        GL20.glUniform4f((int)9, (float)f10, (float)0.0f, (float)0.0f, (float)0.0f);
    }

    public void v(float f10, float f11) {
        GL20.glUniform4f((int)6, (float)f10, (float)f11, (float)0.0f, (float)0.0f);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void l(boolean bl2) {
        float f10;
        int n2;
        try {
            n2 = 12;
            f10 = bl2 ? 1.0f : 0.0f;
        }
        catch (O_ o_2) {
            throw kq.a(o_2);
        }
        GL20.glUniform4f((int)n2, (float)f10, (float)0.0f, (float)0.0f, (float)0.0f);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(kq.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

