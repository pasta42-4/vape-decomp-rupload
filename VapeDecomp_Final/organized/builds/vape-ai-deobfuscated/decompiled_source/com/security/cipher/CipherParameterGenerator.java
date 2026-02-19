/*
 * Decompiled with CFR 0.152.
 */
package com.security.cipher;

import a.a;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.network.clustering.ClusterNodeRegistry1151;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CipherParameterGenerator {
    public static final int z;
    public static final int R;
    public static final int M;
    public static final int y;
    public static final int S;
    public static final int a;
    public static final int F;
    public static final int j;
    public static final int B;

    public static void b(int n) {
        a.a.smpm(false, ClusterNodeRegistry1151.W().q(), 257, n, -1071775743L);
    }

    public static boolean F(int n) {
        boolean bl;
        try {
            bl = (a.a.gks(n) & 0x100) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherParameterGenerator.a(customSystemException);
        }
        return bl;
    }

    public static boolean X(int n) {
        boolean bl;
        try {
            bl = (a.a.gks(n) & 0x100) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherParameterGenerator.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void C(int n) {
        a.a.smpm(false, ClusterNodeRegistry1151.W().q(), 256, n, 0x1E0001L);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var1 = MultiContainerRegistry.a(-518624985619932798L, -4721551837950550445L, MethodHandles.lookup().lookupClass()).a(44881363039691L) ^ 3810672341365L;
                var3_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var1 >>> 56);
                for (var4_2 = 1; var4_2 < 8; ++var4_2) {
                    v2 = v2;
                    v2[var4_2] = (byte)(var1 << var4_2 * 8 >>> 56);
                }
                var3_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[9];
                var6_4 = 0;
                var7_5 = "y\u0010\u00c0\u00e1J'nA,g6\u0097\u00c0\u007f(\u000f\u00fe\u00ed\u00c3AK\u009d\u00d1\u00fcy\u00a6{!'\u00b2\u00c4%\u00c9\u00c3\u00f4\u009e)x@\u008e\u009f\u00fa\u001f\u009a\u00bdJ\u00b0\u00bd\u00b7\u0018\u00ca\u0086\u00067\"U";
                var8_6 = "y\u0010\u00c0\u00e1J'nA,g6\u0097\u00c0\u007f(\u000f\u00fe\u00ed\u00c3AK\u009d\u00d1\u00fcy\u00a6{!'\u00b2\u00c4%\u00c9\u00c3\u00f4\u009e)x@\u008e\u009f\u00fa\u001f\u009a\u00bdJ\u00b0\u00bd\u00b7\u0018\u00ca\u0086\u00067\"U".length();
                var5_7 = 0;
                while (true) {
                    var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var6_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var5_7 < var8_6) ** continue;
                    var7_5 = "<\u0013\u00ab\u00e2\u00dex\u00e2\u00e0\u00db\u00a6\u0010\u0000\u0011\u00e7\u00bc\u008d";
                    var8_6 = "<\u0013\u00ab\u00e2\u00dex\u00e2\u00e0\u00db\u00a6\u0010\u0000\u0011\u00e7\u00bc\u008d".length();
                    var5_7 = 0;
                    while (true) {
                        var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var6_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var5_7 < var8_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var3_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
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
        CipherParameterGenerator.z = (int)var0_3[8];
        CipherParameterGenerator.R = (int)var0_3[0];
        CipherParameterGenerator.B = (int)var0_3[4];
        CipherParameterGenerator.S = (int)var0_3[2];
        CipherParameterGenerator.F = (int)var0_3[3];
        CipherParameterGenerator.y = (int)var0_3[1];
        CipherParameterGenerator.a = (int)var0_3[6];
        CipherParameterGenerator.M = (int)var0_3[7];
        CipherParameterGenerator.j = (int)var0_3[5];
    }
}

