/*
 * Decompiled with CFR 0.152.
 */
package com.system.extensions;

import com.bytecode.analysis.BytecodeMetadataAnalyzer1072;
import com.collections.management.MultiContainerRegistry;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class ExtendedApiResolver {
    protected ExtendedApiResolver Q;
    private static final long a;
    private static final Integer[] g;
    private static final long[] f;
    private static final Map h;
    protected final int N;

    public ExtendedApiResolver B(String string, String string2) {
        try {
            if (this.Q != null) {
                return this.Q.B(string, string2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ExtendedApiResolver.a(illegalArgumentException);
        }
        return null;
    }

    protected ExtendedApiResolver(int n, ExtendedApiResolver extendedApiResolver) {
        long l;
        block16: {
            l = a ^ 0xB6C5AB9FF2EL;
            if (n != ExtendedApiResolver.a(22598, 0x438937C6DD9987B7L ^ l)) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n == ExtendedApiResolver.a(9475, 0x26B8D1CBE1097AF1L ^ l) || n == ExtendedApiResolver.a(24977, 0x64359D1C16173E65L ^ l)) break block16;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw ExtendedApiResolver.a(illegalArgumentException);
                                    }
                                    if (n == ExtendedApiResolver.a(17157, 0x31186DECD9AB1CF5L ^ l)) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ExtendedApiResolver.a(illegalArgumentException);
                                }
                                if (n == ExtendedApiResolver.a(14750, 0x5834E5D210616668L ^ l)) break block16;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ExtendedApiResolver.a(illegalArgumentException);
                            }
                            if (n == ExtendedApiResolver.a(28452, 0x70D22C754698B0D7L ^ l)) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ExtendedApiResolver.a(illegalArgumentException);
                        }
                        if (n == ExtendedApiResolver.a(5358, 0x69E693CCAE71CB1BL ^ l)) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ExtendedApiResolver.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException("Unsupported api " + n);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ExtendedApiResolver.a(illegalArgumentException);
                }
            }
        }
        try {
            if (n == ExtendedApiResolver.a(27974, 0x253E38A948F532B1L ^ l)) {
                BytecodeMetadataAnalyzer1072.h(this);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ExtendedApiResolver.a(illegalArgumentException);
        }
        this.N = n;
        this.Q = extendedApiResolver;
    }

    public void l(String string, Object object) {
        try {
            if (this.Q != null) {
                this.Q.l(string, object);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ExtendedApiResolver.a(illegalArgumentException);
        }
    }

    protected ExtendedApiResolver(int n) {
        this(n, null);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5AB2;
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
                throw new RuntimeException("a/aa", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ExtendedApiResolver.g[n2] = n3;
        }
        return g[n2];
    }

    public void P() {
        try {
            if (this.Q != null) {
                this.Q.P();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ExtendedApiResolver.a(illegalArgumentException);
        }
    }

    public void n(String string, String string2, String string3) {
        try {
            if (this.Q != null) {
                this.Q.n(string, string2, string3);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ExtendedApiResolver.a(illegalArgumentException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ExtendedApiResolver.a = MultiContainerRegistry.a(-8359674269723916495L, -6518089878971055541L, null).a(170399425884275L);
                ExtendedApiResolver.h = new HashMap<K, V>(13);
                var0 = ExtendedApiResolver.a ^ 27471184377708L;
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
                var6_5 = "c\u00e4\u0001\u00a6\u00d0\u00f7h\u00cd\u000b\u0083\u0002\u00ede\u00e4/\u00f7\"*9v4H\u00901\u0013\u00837\u00f92;ld\n\u00c1\u00aa\u00fe\u00fbTI\u00ed\u00fb=\u00caC\u00c3.0\u00d7";
                var7_6 = "c\u00e4\u0001\u00a6\u00d0\u00f7h\u00cd\u000b\u0083\u0002\u00ede\u00e4/\u00f7\"*9v4H\u00901\u0013\u00837\u00f92;ld\n\u00c1\u00aa\u00fe\u00fbTI\u00ed\u00fb=\u00caC\u00c3.0\u00d7".length();
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
                    var6_5 = ";{\u0090\u00fb\u009as\u00e6\u00e7\u0086\u008e\u0019\u0019\u0006\u00d7ie";
                    var7_6 = ";{\u0090\u00fb\u009as\u00e6\u00e7\u0086\u008e\u0019\u0019\u0006\u00d7ie".length();
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
        ExtendedApiResolver.f = var8_3;
        ExtendedApiResolver.g = new Integer[8];
    }

    public ExtendedApiResolver d(String string) {
        try {
            if (this.Q != null) {
                return this.Q.d(string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw ExtendedApiResolver.a(illegalArgumentException);
        }
        return null;
    }
}

