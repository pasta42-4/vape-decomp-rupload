/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package com.network.protocol;

import a.a;
import com.collections.management.MultiContainerRegistry;
import com.crypto.configuration.CryptoConfigurationManager;
import java.awt.Color;
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

public class NetworkProtocolEncoder1043
extends CryptoConfigurationManager {
    private static final Integer[] g;
    private static final long c;
    private static final long[] f;
    private static final String b = "#version 430 compatibility\nprecision highp float;\nlayout(location = 0) uniform vec4 u_InnerRect;\nlayout(location = 1) uniform float u_Spread;\nlayout(location = 2) uniform vec4 u_Color;\nlayout(location = 3) uniform float u_CornerRadius; // Added uniform for corner radius\nlayout(location = 4) uniform vec2 u_ShadowOffset; // New uniform for shadow offset\n// blend two color by alpha\nvec4 blend(vec4 src, vec4 append) {\n  \treturn vec4(src.rgb + append.rgb,\n              1.0 - (1.0 - (src.a)) * (1.0 - append.a));\n}\n\n// approximation to the gaussian integral [x, infty)\nfloat gi(float x) {\n\tfloat i6 = 1.0 / 6.0;\n\tfloat i4 = 1.0 / 4.0;\n\tfloat i3 = 1.0 / 3.0;\n\n    if (x > 1.5) return 0.0;\n    if (x < -1.5) return 1.0;\n\n    float x2 = x * x;\n    float x3 = x2 * x;\n    \n    if (x >  0.5) return .5625  - ( x3 * i6 - 3. * x2 * i4 + 1.125 * x);\n    if (x > -0.5) return 0.5    - (0.75 * x - x3 * i3);\n    return 0.4375 + (-x3 * i6 - 3. * x2 * i4 - 1.125 * x);\n}\n\n// create a line shadow mask\nfloat lineShadow(vec2 border, float pos , float sigma) {\n    float t = (border.y - border.x) / sigma;\n    \n    float pos1 = ((border.x - pos) / sigma) * 1.5;\n    float pos2 = ((pos - border.y) / sigma) * 1.5;\n    \n  \treturn 1.0 - abs(gi(pos1) - gi(pos2));\n}\nfloat distToRoundedRect(vec2 p, vec4 rect, float r) {\n    vec2 d = abs(p - rect.xy - rect.zw * 0.5) - rect.zw * 0.5 + vec2(r);\n    return length(max(d, 0.0)) - r;\n}// create a rect shadow by two line shadow\nfloat rectShadow(vec4 rect, vec2 point, float sigma, float cornerRadius) {\n    float lineV = lineShadow(vec2(rect.x, rect.x + rect.z), point.x, sigma);\n    float lineH = lineShadow(vec2(rect.y, rect.y + rect.w), point.y, sigma);\n    return lineV * lineH;\n}// draw shadow\nvec4 drawRectShadow(vec2 pos, vec4 rect, vec4 color, float sigma, float cornerRadius) {\n    vec4 result = color;\n    float shadowMask = rectShadow(rect, pos, sigma, cornerRadius);\n    result.a *= shadowMask;\n    return result;\n}\nin vec2 f_Position;\nout vec4 fragColor;\nvoid main() {\n    float sigma = u_Spread;\n    float cornerRadius = u_CornerRadius;\n    vec2 shadowOffset = u_ShadowOffset; // Shadow offset as a vec2\n\n    vec4 rect = u_InnerRect;\n    vec4 shadowRect = vec4(vec2(rect.x + shadowOffset.x, rect.y + shadowOffset.y), vec2(rect.z, rect.w)); // Apply offset to shadow\n    vec4 shadowColor = u_Color;\n\n    // Calculate shadow with offset - Corrected\n    vec2 offsetPos = f_Position - shadowOffset; // Subtract vec2 from vec2\n    vec4 result = drawRectShadow(offsetPos, shadowRect, shadowColor, sigma, cornerRadius);\n\n    // Anti-aliasing for inner corners, based on original position\n    float dist = distToRoundedRect(f_Position, rect, cornerRadius);\n    float aaWidth = 0.1 * sigma;\n    float alpha = smoothstep(-aaWidth, aaWidth, dist);\n\n    result.a *= alpha;\n\n    fragColor = result;\n}";
    private static final String Z = "#version 430 compatibility\nout vec2 f_Position;\nvoid main() {\nf_Position = gl_Vertex.xy;\ngl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\ngl_FrontColor = gl_Color;\n}\n";
    private static final Map h;

    public void t(float f) {
        GL20.glUniform1f((int)1, (float)f);
    }

    public NetworkProtocolEncoder1043() {
        long l = c ^ 0x762DBAE856CBL;
        super(a.cs((int)NetworkProtocolEncoder1043.b("r", (int)10689, (long)(0x575E5382138A1F53L ^ l))), a.cs((int)NetworkProtocolEncoder1043.b("r", (int)28757, (long)(0x41E2DDC5887E46C6L ^ l))));
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x698F;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/kY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkProtocolEncoder1043.g[n2] = n3;
        }
        return g[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = MultiContainerRegistry.a(-6676019963779686411L, -8128307529117725136L, MethodHandles.lookup().lookupClass()).a(265857591741460L);
        h = new HashMap(13);
        long l = c ^ 0x18389417B712L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u009dG\u00b0\u000f\u00db\u00ca=\u0013\u0083\u00f0\u00cfuF-\u0010\u0086";
        int n2 = "\u009dG\u00b0\u000f\u00db\u00ca=\u0013\u0083\u00f0\u00cfuF-\u0010\u0086".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        f = lArray;
        g = new Integer[2];
    }

    public void O(float f, float f2) {
        GL20.glUniform2f((int)4, (float)f, (float)f2);
    }

    public void R(float f, float f2, float f3, float f4) {
        GL20.glUniform4f((int)0, (float)f, (float)f2, (float)f3, (float)f4);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/kY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkProtocolEncoder1043.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void D(float f) {
        GL20.glUniform1f((int)3, (float)f);
    }

    public void M(Color color) {
        GL20.glUniform4f((int)2, (float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkProtocolEncoder1043.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

