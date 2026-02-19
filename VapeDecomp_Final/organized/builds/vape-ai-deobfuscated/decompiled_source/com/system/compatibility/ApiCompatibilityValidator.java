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

public abstract class ApiCompatibilityValidator {
    private static final Integer[] e;
    private static final Map g;
    protected final int U;
    private static final long[] d;
    protected ApiCompatibilityValidator p;
    private static final long a;

    protected ApiCompatibilityValidator(int n, ApiCompatibilityValidator apiCompatibilityValidator) {
        long l;
        block16: {
            l = a ^ 0x20A48B41B6EBL;
            if (n != ApiCompatibilityValidator.a(15717, 0x7A6A8D1A7DD23498L ^ l)) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n == ApiCompatibilityValidator.a(17850, 0x2CE5445126594C4CL ^ l) || n == ApiCompatibilityValidator.a(13596, 0xE334C7C7B65BCE0L ^ l)) break block16;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ApiCompatibilityValidator.a(illegalArgumentException);
                                    }
                                    if (n == ApiCompatibilityValidator.a(25010, 0x3CC66AE1EECD684BL ^ l)) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ApiCompatibilityValidator.a(illegalArgumentException);
                                }
                                if (n == ApiCompatibilityValidator.a(12315, 0x3EA0B4479B1339E5L ^ l)) break block16;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ApiCompatibilityValidator.a(illegalArgumentException);
                            }
                            if (n == ApiCompatibilityValidator.a(5946, 0x6DE9C975C0F19EC5L ^ l)) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ApiCompatibilityValidator.a(illegalArgumentException);
                        }
                        if (n == ApiCompatibilityValidator.a(13050, 0x1459561CCB4EBB01L ^ l)) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ApiCompatibilityValidator.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException("Unsupported api " + n);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ApiCompatibilityValidator.a(illegalArgumentException);
                }
            }
        }
        try {
            if (n == ApiCompatibilityValidator.a(15572, 0x3E3D34853F87352CL ^ l)) {
                BytecodeMetadataAnalyzer1072.h(this);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ApiCompatibilityValidator.a(illegalArgumentException);
        }
        this.U = n;
        this.p = apiCompatibilityValidator;
    }

    public void a(CryptoContextManager1052 cryptoContextManager1052) {
        try {
            if (this.p != null) {
                this.p.a(cryptoContextManager1052);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ApiCompatibilityValidator.a(illegalArgumentException);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4014;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/I1", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ApiCompatibilityValidator.e[n2] = n3;
        }
        return e[n2];
    }

    public ExtendedApiResolver q(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        long l = a ^ 0x1CCD32809A0FL;
        try {
            if (this.U < ApiCompatibilityValidator.a(23871, 0x70C329BBB0D07821L ^ l)) {
                throw new UnsupportedOperationException("This feature requires ASM5");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ApiCompatibilityValidator.a(illegalArgumentException);
        }
        try {
            if (this.p != null) {
                return this.p.q(n, errorDiagnosticTracker, string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ApiCompatibilityValidator.a(illegalArgumentException);
        }
        return null;
    }

    protected ApiCompatibilityValidator(int n) {
        this(n, null);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ApiCompatibilityValidator.a = MultiContainerRegistry.a(173387331130005718L, 1256222139805827691L, null).a(4361825548541L);
                ApiCompatibilityValidator.g = new HashMap<K, V>(13);
                var0 = ApiCompatibilityValidator.a ^ 97210874241884L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "%\u001e\u00e3+\u00fb\u0089z\u00bb\b\u009a\u0093\u00f8(\u000e\u00c1\u00e6\u00ca\u0092\u00f2\u009egd\u00cd\u00b4|\u0081k\u00d3Y\u00af\u00e2\u00c8Hm[}\u00c3r\u00ab(\u00bb\u00ef<\u0099\u00fb\u001b\u0084&\u00f4\u0017\u0019\u008c\u008c\u00d8\u00c29";
                var7_6 = "%\u001e\u00e3+\u00fb\u0089z\u00bb\b\u009a\u0093\u00f8(\u000e\u00c1\u00e6\u00ca\u0092\u00f2\u009egd\u00cd\u00b4|\u0081k\u00d3Y\u00af\u00e2\u00c8Hm[}\u00c3r\u00ab(\u00bb\u00ef<\u0099\u00fb\u001b\u0084&\u00f4\u0017\u0019\u008c\u008c\u00d8\u00c29".length();
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
                    var6_5 = "f\u00b2+7\u00dc\u00a3V^\u008c\u001f\u00bb5\u00b5k\u0087\u00c5";
                    var7_6 = "f\u00b2+7\u00dc\u00a3V^\u008c\u001f\u00bb5\u00b5k\u0087\u00c5".length();
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
        ApiCompatibilityValidator.d = var8_3;
        ApiCompatibilityValidator.e = new Integer[9];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public ExtendedApiResolver N(String string, boolean bl) {
        try {
            if (this.p != null) {
                return this.p.N(string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ApiCompatibilityValidator.a(illegalArgumentException);
        }
        return null;
    }

    public void c() {
        try {
            if (this.p != null) {
                this.p.c();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ApiCompatibilityValidator.a(illegalArgumentException);
        }
    }
}

