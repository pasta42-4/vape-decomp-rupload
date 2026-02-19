/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package com.algorithm.calibration;

import a.a;
import com.collections.management.MultiContainerRegistry;
import com.crypto.configuration.CryptoConfigurationManager;
import com.exception.system.CustomSystemException;
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

public class AlgorithmParameterCalibrator
extends CryptoConfigurationManager {
    public static final int V = 1;
    private static final long[] f;
    private static int J;
    public static final int Q;
    private static final Map h;
    private static final String G = "#version 430 compatibility\nout vec2 f_Position;\nvoid main() {\nf_Position = gl_Vertex.xy;\ngl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;\ngl_FrontColor = gl_Color;\n}\n";
    public static final int H;
    private static final long b;
    public static final int u;
    private static final String R = "#version 430 compatibility\nprecision highp float;\n\nlayout(location = 0) uniform float u_Radius;\nlayout(location = 1) uniform vec4 u_InnerRect;\nlayout(location = 2) uniform float u_Spread;\nlayout(location = 3) uniform vec4 u_Corners; // (topLeft, topRight, bottomRight, bottomLeft)\n\nin vec2 f_Position;\nout vec4 fragColor;\n\nvoid main() {\n    vec2 tl = u_InnerRect.xy - f_Position;\n    vec2 br = f_Position - u_InnerRect.zw;\n\n    vec2 dis = max(br, tl);\n\n    // Determine if the fragment is in one of the corners\n    bool inTopLeft = (f_Position.x <= u_InnerRect.x && f_Position.y <= u_InnerRect.y);\n    bool inTopRight = (f_Position.x >= u_InnerRect.z && f_Position.y <= u_InnerRect.y);\n    bool inBottomLeft = (f_Position.x <= u_InnerRect.x && f_Position.y >= u_InnerRect.w);\n    bool inBottomRight = (f_Position.x >= u_InnerRect.z && f_Position.y >= u_InnerRect.w);\n\n    // Check if the respective corner should be drawn based on u_Corners\n    bool drawTopLeft = inTopLeft && u_Corners.x > 0.5;\n    bool drawTopRight = inTopRight && u_Corners.y > 0.5;\n    bool drawBottomLeft = inBottomLeft && u_Corners.w > 0.5;\n    bool drawBottomRight = inBottomRight && u_Corners.z > 0.5;\n\n    bool inCorner = drawTopLeft || drawTopRight || drawBottomLeft || drawBottomRight;\n\n    float v = length(max(vec2(0.0), dis)) - u_Radius;\n    float a = inCorner ? 1.0 - smoothstep(0.0, u_Spread, v) : 1.0;\n\n    fragColor = gl_Color * vec4(1.0, 1.0, 1.0, a);\n}";
    private static final Integer[] g;
    public static final int v;

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1E4;
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
                throw new RuntimeException("a/kL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AlgorithmParameterCalibrator.g[n2] = n3;
        }
        return g[n2];
    }

    public static int H() {
        return J;
    }

    public void C(float f) {
        GL20.glUniform1f((int)2, (float)f);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AlgorithmParameterCalibrator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int u() {
        int n = AlgorithmParameterCalibrator.H();
        try {
            if (n == 0) {
                return 11;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AlgorithmParameterCalibrator.a(customSystemException);
        }
        return 0;
    }

    public static void V(int n) {
        J = n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AlgorithmParameterCalibrator.b = MultiContainerRegistry.a(8677225983777489382L, -7368638583692687725L, MethodHandles.lookup().lookupClass()).a(141632831595673L);
                AlgorithmParameterCalibrator.h = new HashMap<K, V>(13);
                AlgorithmParameterCalibrator.V(0);
                var0 = AlgorithmParameterCalibrator.b ^ 112776503594042L;
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
                var6_5 = "\u00ae7\u00e2FWD\u00c7\u0085f\u00aa\u001b(\u00be\u00a2\u0018\u00f2\u00dc\u0086\u009c\u001b\u0094\u0092xQzw$\u00c0)s\u00f6(";
                var7_6 = "\u00ae7\u00e2FWD\u00c7\u0085f\u00aa\u001b(\u00be\u00a2\u0018\u00f2\u00dc\u0086\u009c\u001b\u0094\u0092xQzw$\u00c0)s\u00f6(".length();
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
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00c4\u00edPKL\u008fT,p\u000e#\u008cE\u00cf\u0083\u00ff";
                    var7_6 = "\u00c4\u00edPKL\u008fT,p\u000e#\u008cE\u00cf\u0083\u00ff".length();
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
lbl40:
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
lbl53:
                // 1 sources

                ** continue;
            }
        }
        AlgorithmParameterCalibrator.f = var8_3;
        AlgorithmParameterCalibrator.g = new Integer[6];
        AlgorithmParameterCalibrator.H = (int)AlgorithmParameterCalibrator.b("l", (int)23348, (long)(var0 ^ 1373547801581040637L));
        AlgorithmParameterCalibrator.Q = (int)AlgorithmParameterCalibrator.b("l", (int)11101, (long)(var0 ^ 8232041068851381143L));
        AlgorithmParameterCalibrator.u = (int)AlgorithmParameterCalibrator.b("l", (int)2678, (long)(var0 ^ 6387079329227662014L));
        AlgorithmParameterCalibrator.v = (int)AlgorithmParameterCalibrator.b("l", (int)13542, (long)(var0 ^ 2815667013218491434L));
    }

    public void Q(float f, float f2, float f3, float f4) {
        GL20.glUniform4f((int)1, (float)f, (float)f2, (float)f3, (float)f4);
    }

    public void O(float f) {
        GL20.glUniform1f((int)0, (float)f);
    }

    public AlgorithmParameterCalibrator() {
        long l = b ^ 0x52AAF00A4919L;
        super(a.cs((int)AlgorithmParameterCalibrator.b("l", (int)1610, (long)(0x7877CBED45CA2BA2L ^ l))), a.cs((int)AlgorithmParameterCalibrator.b("l", (int)4695, (long)(0x1E9A995B05D0BFB9L ^ l))));
    }

    public void z(int n) {
        float f;
        float f2;
        float f3;
        float f4;
        int n2;
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        try {
            bl4 = (n & 1) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw AlgorithmParameterCalibrator.a(customSystemException);
        }
        boolean bl5 = bl4;
        try {
            bl3 = (n & 2) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw AlgorithmParameterCalibrator.a(customSystemException);
        }
        boolean bl6 = bl3;
        try {
            bl2 = (n & 4) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw AlgorithmParameterCalibrator.a(customSystemException);
        }
        boolean bl7 = bl2;
        try {
            bl = (n & 8) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw AlgorithmParameterCalibrator.a(customSystemException);
        }
        boolean bl8 = bl;
        try {
            n2 = 3;
            f4 = bl5 ? 1.0f : 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw AlgorithmParameterCalibrator.a(customSystemException);
        }
        try {
            f3 = bl6 ? 1.0f : 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw AlgorithmParameterCalibrator.a(customSystemException);
        }
        try {
            f2 = bl7 ? 1.0f : 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw AlgorithmParameterCalibrator.a(customSystemException);
        }
        try {
            f = bl8 ? 1.0f : 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw AlgorithmParameterCalibrator.a(customSystemException);
        }
        GL20.glUniform4f((int)n2, (float)f4, (float)f3, (float)f2, (float)f);
    }

    public AlgorithmParameterCalibrator(String string, String string2) {
        super(string, string2);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/kL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AlgorithmParameterCalibrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

