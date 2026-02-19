/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package a;

import a.O_;
import a.a;
import a.d8;
import a.ko;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL20;

public class k8
extends ko {
    public static final int n;
    public static final int E;
    private static final Integer[] f;
    public static final int t;
    public static final int i;
    private static final long b;
    public static final int C = 1;
    private static final String k = "#version 430 compatibility\n\nout vec2 f_Position;\n\nvoid main() {\n    f_Position = gl_Vertex.xy;\n    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\n    gl_FrontColor = gl_Color;\n}";
    private static final String N = "#version 430 compatibility\nprecision highp float;\n\nlayout(location = 0) uniform float u_Radius;\nlayout(location = 1) uniform vec4 u_InnerRect;\nlayout(location = 2) uniform float u_Spread;\nlayout(location = 3) uniform vec4 u_Corners; // (topLeft, topRight, bottomRight, bottomLeft)\n\nin vec2 f_Position;\nout vec4 fragColor;\n\nvoid main() {\n    vec2 tl = u_InnerRect.xy - f_Position;\n    vec2 br = f_Position - u_InnerRect.zw;\n\n    vec2 dis = max(br, tl);\n\n    // Determine if the fragment is in one of the corners\n    bool inTopLeft = (f_Position.x <= u_InnerRect.x && f_Position.y <= u_InnerRect.y);\n    bool inBottomLeft = (f_Position.x <= u_InnerRect.x && f_Position.y >= u_InnerRect.w);\n    bool inTopRight = (f_Position.x >= u_InnerRect.z && f_Position.y <= u_InnerRect.y);\n    bool inBottomRight = (f_Position.x >= u_InnerRect.z && f_Position.y >= u_InnerRect.w);\n\n    // Check if the respective corner should be drawn based on u_Corners\n    bool drawTopLeft = inTopLeft && u_Corners.x > 0.5;\n    bool drawTopRight = inTopRight && u_Corners.y > 0.5;\n    bool drawBottomLeft = inBottomLeft && u_Corners.w > 0.5;\n    bool drawBottomRight = inBottomRight && u_Corners.z > 0.5;\n\n    bool inCorner = drawTopLeft || drawTopRight || drawBottomLeft || drawBottomRight;\n\n    float v = length(max(vec2(0.0), dis)) - u_Radius;\n    float a = inCorner ? 1.0 - smoothstep(0.0, u_Spread, v) : 0.0;\n\n    // Only draw the selected corners, nothing in the middle\n    fragColor = inCorner ? gl_Color * vec4(1.0, 1.0, 1.0, 1.0 - a) : vec4(0.0, 0.0, 0.0, 0.0);\n}";
    private static final Map g;
    private static final long[] c;

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = k8.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void z(float f10) {
        GL20.glUniform1f((int)2, (float)f10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                k8.b = d8.a(-1260962716315480345L, 5190731677538587765L, MethodHandles.lookup().lookupClass()).a(252410837558651L);
                k8.g = new HashMap<K, V>(13);
                var0 = k8.b ^ 44962407777597L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u001d\u00ee]\u0010\u00d2[\u00d2\u00cd,\u00f3\u00c8\u0016h!\n\u0086\u007f\u00c6{\u00dc\u00e4\u0004\u00cc\u00ca\u00d9\u0093X6Z\u00e12\u0089";
                var7_6 = "\u001d\u00ee]\u0010\u00d2[\u00d2\u00cd,\u00f3\u00c8\u0016h!\n\u0086\u007f\u00c6{\u00dc\u00e4\u0004\u00cc\u00ca\u00d9\u0093X6Z\u00e12\u0089".length();
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
                    var6_5 = "\u0081\u00dd\u00e0\u00c4C\u00ef\u00bcOjk\u00b1`\u00ee\u0080\"9";
                    var7_6 = "\u0081\u00dd\u00e0\u00c4C\u00ef\u00bcOjk\u00b1`\u00ee\u0080\"9".length();
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
        k8.c = var8_3;
        k8.f = new Integer[6];
        k8.i = (int)k8.b("z", (int)4943, (long)(var0 ^ 4659348475452645863L));
        k8.E = (int)k8.b("z", (int)26718, (long)(var0 ^ 2261720775572036343L));
        k8.n = (int)k8.b("z", (int)26304, (long)(var0 ^ 3418803775792452715L));
        k8.t = (int)k8.b("z", (int)5695, (long)(var0 ^ 4785152614576940176L));
    }

    public void p(float f10) {
        GL20.glUniform1f((int)0, (float)f10);
    }

    public void L(int n2) {
        float f10;
        float f11;
        float f12;
        float f13;
        int n3;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        try {
            bl5 = (n2 & 1) != 0;
        }
        catch (O_ o_2) {
            throw k8.a(o_2);
        }
        boolean bl6 = bl5;
        try {
            bl4 = (n2 & 2) != 0;
        }
        catch (O_ o_3) {
            throw k8.a(o_3);
        }
        boolean bl7 = bl4;
        try {
            bl3 = (n2 & 4) != 0;
        }
        catch (O_ o_4) {
            throw k8.a(o_4);
        }
        boolean bl8 = bl3;
        try {
            bl2 = (n2 & 8) != 0;
        }
        catch (O_ o_5) {
            throw k8.a(o_5);
        }
        boolean bl9 = bl2;
        try {
            n3 = 3;
            f13 = bl6 ? 1.0f : 0.0f;
        }
        catch (O_ o_6) {
            throw k8.a(o_6);
        }
        try {
            f12 = bl7 ? 1.0f : 0.0f;
        }
        catch (O_ o_7) {
            throw k8.a(o_7);
        }
        try {
            f11 = bl8 ? 1.0f : 0.0f;
        }
        catch (O_ o_8) {
            throw k8.a(o_8);
        }
        try {
            f10 = bl9 ? 1.0f : 0.0f;
        }
        catch (O_ o_9) {
            throw k8.a(o_9);
        }
        GL20.glUniform4f((int)n3, (float)f13, (float)f12, (float)f11, (float)f10);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void a(float f10, float f11, float f12, float f13) {
        GL20.glUniform4f((int)1, (float)f10, (float)f11, (float)f12, (float)f13);
    }

    public k8() {
        long l10 = b ^ 0x5D403CF2104CL;
        super(a.cs((int)k8.b("z", (int)16463, (long)(0x2DF82D77974BA790L ^ l10))), a.cs((int)k8.b("z", (int)15397, (long)(0x60BF4313C34FDBFEL ^ l10))));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/k8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public k8(String string, String string2) {
        super(string, string2);
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x27D3;
        if (f[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/k8", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            k8.f[n3] = n4;
        }
        return f[n3];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(k8.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

