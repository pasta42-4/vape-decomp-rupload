/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoParameterGenerator {
    private static final float[] H;
    private static final float[] p;
    private static final int w;
    private static final float Z = 1.5707964f;
    private static final int E;
    private static final float[] k;
    private static final float[] D;
    private static final float I = (float)Math.PI;
    private static final float[] m;
    private static final float[] x;
    private static final float[] C;
    private static final float[] h;
    private static final float[] F;

    public static float o(float f, float f2) {
        block16: {
            block17: {
                block18: {
                    try {
                        try {
                            try {
                                if (!(f < 0.0f)) break block16;
                                if (!(f2 < 0.0f)) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoParameterGenerator.a(customSystemException);
                            }
                            if (!(f < f2)) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoParameterGenerator.a(customSystemException);
                        }
                        return D[(int)(f2 / f * 100000.0f)];
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoParameterGenerator.a(customSystemException);
                    }
                }
                return p[(int)(f / f2 * 100000.0f)];
            }
            f = -f;
            try {
                if (f > f2) {
                    return h[(int)(f2 / f * 100000.0f)];
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoParameterGenerator.a(customSystemException);
            }
            return C[(int)(f / f2 * 100000.0f)];
        }
        if (f2 < 0.0f) {
            f2 = -f2;
            try {
                if (f > f2) {
                    return x[(int)(f2 / f * 100000.0f)];
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoParameterGenerator.a(customSystemException);
            }
            return k[(int)(f / f2 * 100000.0f)];
        }
        try {
            if (f > f2) {
                return H[(int)(f2 / f * 100000.0f)];
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoParameterGenerator.a(customSystemException);
        }
        return m[(int)(f / f2 * 100000.0f)];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                var11 = MultiContainerRegistry.a(-2247395363707451824L, -3821557692513133702L, MethodHandles.lookup().lookupClass()).a(53023605449955L) ^ 109063055634938L;
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[5];
                var4_4 = 0;
                var5_5 = "\u00d7~\u00a4\u00e1\u001a\u00b6o\u00be\u0015z\u008e>\u00b2\u00f6\u0016R\u00a1n\u000f\u001b%\u00f5w,";
                var6_6 = "\u00d7~\u00a4\u00e1\u001a\u00b6o\u00be\u0015z\u008e>\u00b2\u00f6\u0016R\u00a1n\u000f\u001b%\u00f5w,".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block9;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u00a8|\u0099\u00bc\u00efo\u00b4\u00d2\u008b\u00b37\u00ccr\u0010)\u00a0";
                    var6_6 = "\u00a8|\u0099\u00bc\u00efo\u00b4\u00d2\u008b\u00b37\u00ccr\u0010)\u00a0".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block9;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block10;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl50:
                // 1 sources

                ** continue;
            }
        }
        CryptoParameterGenerator.E = (int)var0_3[0];
        CryptoParameterGenerator.w = (int)var0_3[1];
        CryptoParameterGenerator.m = new float[(int)var0_3[2]];
        CryptoParameterGenerator.k = new float[(int)var0_3[3]];
        CryptoParameterGenerator.C = new float[(int)var0_3[3]];
        CryptoParameterGenerator.p = new float[(int)var0_3[3]];
        CryptoParameterGenerator.H = new float[(int)var0_3[3]];
        CryptoParameterGenerator.x = new float[(int)var0_3[3]];
        CryptoParameterGenerator.h = new float[(int)var0_3[3]];
        CryptoParameterGenerator.D = new float[(int)var0_3[3]];
        for (var13_11 = 0; var13_11 <= (int)var0_3[4]; ++var13_11) {
            var14_12 = (double)var13_11 / 100000.0;
            var16_13 = 1.0;
            var18_14 = var16_13 * var14_12;
            CryptoParameterGenerator.m[var13_11] = var20_15 = (float)Math.atan2(var18_14, var16_13);
            CryptoParameterGenerator.k[var13_11] = 3.1415927f - var20_15;
            CryptoParameterGenerator.C[var13_11] = -var20_15;
            CryptoParameterGenerator.p[var13_11] = -3.1415927f + var20_15;
            CryptoParameterGenerator.H[var13_11] = 1.5707964f - var20_15;
            CryptoParameterGenerator.x[var13_11] = 1.5707964f + var20_15;
            CryptoParameterGenerator.h[var13_11] = -1.5707964f + var20_15;
            CryptoParameterGenerator.D[var13_11] = -1.5707964f - var20_15;
        }
        CryptoParameterGenerator.F = new float[]{-0.33333147f, 0.19993551f, -0.142089f, 0.10656264f, 1.5707964f};
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static float b(float f) {
        float f2;
        float f3 = Math.abs(f);
        if (f3 < 1.0f) {
            float f4 = f * f;
            f2 = f * (1.0f + f4 * (F[0] + f4 * (F[1] + f4 * (F[2] + f4 * F[3]))));
        } else {
            float f5 = 1.0f / f3;
            float f6 = f5 * f5;
            float f7 = f5 * (1.0f + f6 * (F[0] + f6 * (F[1] + f6 * (F[2] + f6 * F[3]))));
            f2 = Math.copySign(F[4], f) - f7;
        }
        return f2;
    }
}

