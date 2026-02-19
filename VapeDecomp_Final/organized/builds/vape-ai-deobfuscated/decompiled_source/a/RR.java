/*
 * Decompiled with CFR 0.152.
 */
package a;

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

public abstract class Rr {
    private static final Map f;
    private static final Integer[] e;
    private static final long b;
    private static final long[] d;
    protected Rr P;
    protected final int H;

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5DC4;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Rr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Rr.e[n2] = n3;
        }
        return e[n2];
    }

    public void N(String string) {
        try {
            if (this.P != null) {
                this.P.N(string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Rr.a(illegalArgumentException);
        }
    }

    protected Rr(int n, Rr rr) {
        long l;
        block16: {
            l = b ^ 0x3994C9765228L;
            if (n != Rr.a(13303, 0x7A98D2B8D8B0D6F8L ^ l)) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n == Rr.a(22674, 0x235B46BB8928BD99L ^ l) || n == Rr.a(907, 0x2EFF043EFB39E682L ^ l)) break block16;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw Rr.a(illegalArgumentException);
                                    }
                                    if (n == Rr.a(4920, 0x640DF3527AF07635L ^ l)) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw Rr.a(illegalArgumentException);
                                }
                                if (n == Rr.a(20824, 0x17697FABF4F53456L ^ l)) break block16;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw Rr.a(illegalArgumentException);
                            }
                            if (n == Rr.a(27299, 0x31B6F1AB72AB8FABL ^ l)) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw Rr.a(illegalArgumentException);
                        }
                        if (n == Rr.a(3909, 0x740C133DF8F56A49L ^ l)) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw Rr.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException("Unsupported api " + n);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw Rr.a(illegalArgumentException);
                }
            }
        }
        try {
            if (n == Rr.a(27052, 0x5DCB9F14C5548CA6L ^ l)) {
                BytecodeMetadataAnalyzer1072.h(this);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Rr.a(illegalArgumentException);
        }
        this.H = n;
        this.P = rr;
    }

    public void F(String string) {
        try {
            if (this.P != null) {
                this.P.F(string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Rr.a(illegalArgumentException);
        }
    }

    public void f(String string, int n, String ... stringArray) {
        try {
            if (this.P != null) {
                this.P.f(string, n, stringArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Rr.a(illegalArgumentException);
        }
    }

    public void w(String string, int n, String string2) {
        try {
            if (this.P != null) {
                this.P.w(string, n, string2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Rr.a(illegalArgumentException);
        }
    }

    public void J(String string, String ... stringArray) {
        try {
            if (this.P != null) {
                this.P.J(string, stringArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Rr.a(illegalArgumentException);
        }
    }

    public void P(String string) {
        try {
            if (this.P != null) {
                this.P.P(string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Rr.a(illegalArgumentException);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public void g() {
        try {
            if (this.P != null) {
                this.P.g();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Rr.a(illegalArgumentException);
        }
    }

    public void m(String string, int n, String ... stringArray) {
        try {
            if (this.P != null) {
                this.P.m(string, n, stringArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw Rr.a(illegalArgumentException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Rr.b = MultiContainerRegistry.a(903750144770133146L, 6823080538156652151L, null).a(93740628297059L);
                Rr.f = new HashMap<K, V>(13);
                var0 = Rr.b ^ 27039774597656L;
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
                var6_5 = "\u00cfxl\u00e6B\u00bd\u00b4QH4\u00ab\u0096\u0018?\u0096\u0098G\u00ee}\u00fa\u0005\u0092\u0001\u00a2\u00e6\u00edFC\u00ec\u00d96S\u00c0\u00f3H\u0084L\u0018\u00dcaD\u0018\u00ac\u00a4\u00d0\u0001\u00d2\u000f";
                var7_6 = "\u00cfxl\u00e6B\u00bd\u00b4QH4\u00ab\u0096\u0018?\u0096\u0098G\u00ee}\u00fa\u0005\u0092\u0001\u00a2\u00e6\u00edFC\u00ec\u00d96S\u00c0\u00f3H\u0084L\u0018\u00dcaD\u0018\u00ac\u00a4\u00d0\u0001\u00d2\u000f".length();
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
                    var6_5 = "+y\u0016\n4*\"y\u00c2\u00aa\u00f7\u00ec\u00cf|\u00a2\u00b7";
                    var7_6 = "+y\u0016\n4*\"y\u00c2\u00aa\u00f7\u00ec\u00cf|\u00a2\u00b7".length();
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
        Rr.d = var8_3;
        Rr.e = new Integer[8];
    }

    protected Rr(int n) {
        this(n, null);
    }
}

