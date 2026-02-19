/*
 * Decompiled with CFR 0.152.
 */
package com.security.cipher;

import a.a;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CryptographicTransformer1102 {
    public static final int w;
    public static final int B;
    public static final int t;
    public static final int P = 1;
    public static final int S;
    public static final int z;
    public static final int U;
    public static final int T = 1;

    public static void z(boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    a.smdp(1, 514);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformer1102.a(customSystemException);
                }
            }
            a.smd(1, 514);
        }
    }

    public static void F() {
        CryptographicTransformer1102.f(false);
    }

    public static void Q(boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    a.smdp(2, 516);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformer1102.a(customSystemException);
                }
            }
            a.smd(2, 516);
        }
    }

    public static void t(int n, boolean bl) {
        try {
            if (n == 0) {
                CryptographicTransformer1102.f(bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformer1102.a(customSystemException);
        }
        try {
            if (n == 1) {
                CryptographicTransformer1102.Q(bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformer1102.a(customSystemException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var1 = MultiContainerRegistry.a(-647501083891415183L, 577191824880389360L, MethodHandles.lookup().lookupClass()).a(217066407163184L) ^ 76268259222710L;
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
                var0_3 = new long[5];
                var6_4 = 0;
                var7_5 = "1t\u009eW\u0081\u00f5~P]\u00d6\u00ab\u00ba\u0011\u001b\u00d6\u0080\u00b1\u00d3~\u0004\u00e5\u00c7\u0089\u00f6";
                var8_6 = "1t\u009eW\u0081\u00f5~P]\u00d6\u00ab\u00ba\u0011\u001b\u00d6\u0080\u00b1\u00d3~\u0004\u00e5\u00c7\u0089\u00f6".length();
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
                    var7_5 = "\u00f1a-\u00df\u00bd\u00a1\u00f0kw\u0012\u00c3\u00ed]\u00e4\u00b0H";
                    var8_6 = "\u00f1a-\u00df\u00bd\u00a1\u00f0kw\u0012\u00c3\u00ed]\u00e4\u00b0H".length();
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
        CryptographicTransformer1102.z = (int)var0_3[2];
        CryptographicTransformer1102.w = (int)var0_3[3];
        CryptographicTransformer1102.t = (int)var0_3[0];
        CryptographicTransformer1102.S = (int)var0_3[4];
        CryptographicTransformer1102.B = (int)var0_3[1];
        CryptographicTransformer1102.U = (int)var0_3[2];
    }

    public static void G(boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    a.smdp(2, 517);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformer1102.a(customSystemException);
                }
            }
            a.smd(2, 517);
        }
    }

    public static void g() {
        CryptographicTransformer1102.Q(false);
    }

    public static void C() {
        CryptographicTransformer1102.G(false);
    }

    public static boolean F() {
        boolean bl;
        try {
            bl = (a.gks(1) & 0x100) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformer1102.a(customSystemException);
        }
        return bl;
    }

    public static void f(boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    a.smdp(1, 513);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicTransformer1102.a(customSystemException);
                }
            }
            a.smd(1, 513);
        }
    }

    public static void B() {
        CryptographicTransformer1102.z(false);
    }

    public static void B(int n, boolean bl) {
        try {
            if (n == 0) {
                CryptographicTransformer1102.z(bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformer1102.a(customSystemException);
        }
        try {
            if (n == 1) {
                CryptographicTransformer1102.G(bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformer1102.a(customSystemException);
        }
    }

    public static boolean A() {
        boolean bl;
        try {
            bl = (a.gks(2) & 0x100) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicTransformer1102.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

