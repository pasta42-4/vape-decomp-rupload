/*
 * Decompiled with CFR 0.152.
 */
package com.system.compatibility;

import com.bytecode.analysis.BytecodeMetadataAnalyzer1072;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.security.crypto.CryptoContextManager1052;
import com.system.extensions.ExtendedApiResolver;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class LegacyApiInterceptor {
    private static final long b;
    protected LegacyApiInterceptor x;
    private static final Integer[] e;
    private static final Map i;
    private static final long[] d;
    protected final int u;

    public ExtendedApiResolver i(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        try {
            if (this.x != null) {
                return this.x.i(n, errorDiagnosticTracker, string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw LegacyApiInterceptor.a(illegalArgumentException);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                LegacyApiInterceptor.b = MultiContainerRegistry.a(-1214168343862716394L, -2910152474758753542L, null).a(119882967325331L);
                LegacyApiInterceptor.i = new HashMap<K, V>(13);
                var0 = LegacyApiInterceptor.b ^ 7647283586319L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "a\u00c5D\u00c3\u009c\u00dc\u00c0\u00de\u00da_\u00e3\u00f6e\u00dc\u00beq\u00c5\u00f5)\u00cc\u009e\u00a0\u00a2S\u001aZ\u00d2\u008f\u00fcxt]?3\u0015X\u00d7\u00dd+\u00ac\n\u00b1\u0081\u00f2\u00f9\u00b5{o";
                var7_6 = "a\u00c5D\u00c3\u009c\u00dc\u00c0\u00de\u00da_\u00e3\u00f6e\u00dc\u00beq\u00c5\u00f5)\u00cc\u009e\u00a0\u00a2S\u001aZ\u00d2\u008f\u00fcxt]?3\u0015X\u00d7\u00dd+\u00ac\n\u00b1\u0081\u00f2\u00f9\u00b5{o".length();
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
                    var6_5 = "\u00e7\u00c2O\u000bT\u007f\u00f6b*(\u0084\u00ab\u00ec4\u00df\u00e9";
                    var7_6 = "\u00e7\u00c2O\u000bT\u007f\u00f6b*(\u0084\u00ab\u00ec4\u00df\u00e9".length();
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
        LegacyApiInterceptor.d = var8_3;
        LegacyApiInterceptor.e = new Integer[8];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1521;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Sj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            LegacyApiInterceptor.e[n2] = n3;
        }
        return e[n2];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    protected LegacyApiInterceptor(int n, LegacyApiInterceptor legacyApiInterceptor) {
        long l;
        block16: {
            l = b ^ 0x6F0009035D95L;
            if (n != LegacyApiInterceptor.a(30901, 0x70A57DAE85590B86L ^ l)) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n == LegacyApiInterceptor.a(8163, 0x7B3BB0D1BF9AECD2L ^ l) || n == LegacyApiInterceptor.a(6586, 0xD600D5538A46A8DL ^ l)) break block16;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw LegacyApiInterceptor.a(illegalArgumentException);
                                    }
                                    if (n == LegacyApiInterceptor.a(13018, 0x501FA0A99CB941EAL ^ l)) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw LegacyApiInterceptor.a(illegalArgumentException);
                                }
                                if (n == LegacyApiInterceptor.a(24294, 0x1FFD6C75C8D2DD0L ^ l)) break block16;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw LegacyApiInterceptor.a(illegalArgumentException);
                            }
                            if (n == LegacyApiInterceptor.a(27261, 0x7CCA98391FF8194FL ^ l)) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw LegacyApiInterceptor.a(illegalArgumentException);
                        }
                        if (n == LegacyApiInterceptor.a(6577, 0x25A720294ED2EA84L ^ l)) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw LegacyApiInterceptor.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException("Unsupported api " + n);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw LegacyApiInterceptor.a(illegalArgumentException);
                }
            }
        }
        try {
            if (n == LegacyApiInterceptor.a(2352, 0x2CFCF056C7BF7A04L ^ l)) {
                BytecodeMetadataAnalyzer1072.h(this);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw LegacyApiInterceptor.a(illegalArgumentException);
        }
        this.u = n;
        this.x = legacyApiInterceptor;
    }

    protected LegacyApiInterceptor(int n) {
        this(n, null);
    }

    public ExtendedApiResolver h(String string, boolean bl) {
        try {
            if (this.x != null) {
                return this.x.h(string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw LegacyApiInterceptor.a(illegalArgumentException);
        }
        return null;
    }

    public void t(CryptoContextManager1052 cryptoContextManager1052) {
        try {
            if (this.x != null) {
                this.x.t(cryptoContextManager1052);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw LegacyApiInterceptor.a(illegalArgumentException);
        }
    }

    public void S() {
        try {
            if (this.x != null) {
                this.x.S();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw LegacyApiInterceptor.a(illegalArgumentException);
        }
    }
}

