/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ik;
import a.N7;
import a.NV;
import a.O0;
import a.O_;
import a.d8;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lc {
    lc h;
    private int[] Z;
    short a;
    short t;
    private short R;
    short g;
    private static final long[] d;
    short C;
    short u;
    private static final long c;
    int n;
    private int[] o;
    N7 e;
    private static final Map i;
    static final lc z;
    Ik b;
    lc E;
    public Object O;
    private static final Integer[] f;

    private lc Q(lc lc2) {
        lc lc3 = lc2;
        N7 n7 = this.e;
        while (true) {
            block11: {
                boolean bl2;
                block10: {
                    block9: {
                        try {
                            try {
                                try {
                                    if (n7 == null) break;
                                    if ((this.C & 0x10) == 0) break block9;
                                }
                                catch (O_ o_2) {
                                    throw lc.a(o_2);
                                }
                                if (n7 != this.e.P) break block9;
                            }
                            catch (O_ o_3) {
                                throw lc.a(o_3);
                            }
                            bl2 = true;
                            break block10;
                        }
                        catch (O_ o_4) {
                            throw lc.a(o_4);
                        }
                    }
                    bl2 = false;
                }
                boolean bl3 = bl2;
                try {
                    if (bl3 || n7.n.E != null) break block11;
                }
                catch (O_ o_5) {
                    throw lc.a(o_5);
                }
                n7.n.E = lc3;
                lc3 = n7.n;
            }
            n7 = n7.P;
        }
        return lc3;
    }

    final void L(lc lc2) {
        lc lc3;
        lc lc4 = z;
        lc lc5 = this;
        lc5.E = z;
        while (lc5 != z) {
            block6: {
                lc3 = lc5;
                lc5 = lc3.E;
                lc3.E = lc4;
                lc4 = lc3;
                try {
                    try {
                        if ((lc3.C & 0x40) == 0 || lc3.a == lc2.a) break block6;
                    }
                    catch (O_ o_2) {
                        throw lc.a(o_2);
                    }
                    lc3.e = new N7(lc3.g, lc2.e.n, lc3.e);
                }
                catch (O_ o_3) {
                    throw lc.a(o_3);
                }
            }
            lc5 = lc3.Q(lc5);
        }
        while (lc4 != z) {
            lc3 = lc4.E;
            lc4.E = null;
            lc4 = lc3;
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }

    final boolean F(byte[] byArray, int n2) {
        long l10 = c ^ 0x40BFB3399CD2L;
        try {
            this.C = (short)(this.C | 4);
            this.n = n2;
            if (this.Z == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw lc.a(o_2);
        }
        boolean bl2 = false;
        for (int i10 = this.Z[0]; i10 > 0; i10 -= 2) {
            int n3;
            block10: {
                block12: {
                    int n4;
                    block11: {
                        n4 = this.Z[i10 - 1];
                        int n5 = this.Z[i10];
                        n3 = n2 - n4;
                        int n6 = n5 & lc.a(22109, 0x1CDB0FAC9B02167L ^ l10);
                        try {
                            try {
                                if ((n5 & lc.a(8867, 0x5912DF1929E0559CL ^ l10)) != lc.a(18043, 0x7B6F474A2C67B140L ^ l10)) break block10;
                                if (n3 < Short.MIN_VALUE) break block11;
                            }
                            catch (O_ o_3) {
                                throw lc.a(o_3);
                            }
                            if (n3 <= Short.MAX_VALUE) break block12;
                        }
                        catch (O_ o_4) {
                            throw lc.a(o_4);
                        }
                    }
                    int n7 = byArray[n4] & 0xFF;
                    try {
                        byArray[n4] = n7 < 198 ? (byte)(n7 + 49) : (byte)(n7 + 20);
                    }
                    catch (O_ o_5) {
                        throw lc.a(o_5);
                    }
                    bl2 = true;
                }
                byArray[n6++] = (byte)(n3 >>> 8);
                byArray[n6] = (byte)n3;
                continue;
            }
            byArray[n6++] = (byte)(n3 >>> 24);
            byArray[n6++] = (byte)(n3 >>> 16);
            byArray[n6++] = (byte)(n3 >>> 8);
            byArray[n6] = (byte)n3;
        }
        return bl2;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7949;
        if (f[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/lc", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lc.f[n3] = n4;
        }
        return f[n3];
    }

    private void a(int n2, int n3, int n4) {
        try {
            if (this.Z == null) {
                this.Z = new int[6];
            }
        }
        catch (O_ o_2) {
            throw lc.a(o_2);
        }
        int n5 = this.Z[0];
        if (n5 + 2 >= this.Z.length) {
            int[] nArray = new int[this.Z.length + 6];
            System.arraycopy(this.Z, 0, nArray, 0, this.Z.length);
            this.Z = nArray;
        }
        this.Z[++n5] = n2;
        this.Z[++n5] = n3 | n4;
        this.Z[0] = n5;
    }

    final void q(short s10) {
        lc lc2 = this;
        lc2.E = z;
        while (lc2 != z) {
            lc lc3 = lc2;
            lc2 = lc2.E;
            lc3.E = null;
            if (lc3.a != 0) continue;
            lc3.a = s10;
            lc2 = lc3.Q(lc2);
        }
    }

    final void D(O0 o02, int n2, boolean bl2) {
        block8: {
            block9: {
                block6: {
                    long l10;
                    block7: {
                        l10 = c ^ 0x4D2ADED90202L;
                        try {
                            try {
                                if ((this.C & 4) != 0) break block6;
                                if (!bl2) break block7;
                            }
                            catch (O_ o_2) {
                                throw lc.a(o_2);
                            }
                            this.a(n2, lc.a(13545, 0x2DBB637F9D295D01L ^ l10), o02.I);
                            o02.y(-1);
                            break block8;
                        }
                        catch (O_ o_3) {
                            throw lc.a(o_3);
                        }
                    }
                    this.a(n2, lc.a(9528, 0x7C97988E07C8CCD1L ^ l10), o02.I);
                    o02.f(-1);
                    break block8;
                }
                try {
                    if (!bl2) break block9;
                    o02.y(this.n - n2);
                    break block8;
                }
                catch (O_ o_4) {
                    throw lc.a(o_4);
                }
            }
            o02.f(this.n - n2);
        }
    }

    final void Q(NV nV, boolean bl2) {
        block7: {
            long l10 = c ^ 0x5B02B06FDC96L;
            try {
                try {
                    nV.z(this);
                    if (!bl2 || this.R == 0) break block7;
                }
                catch (O_ o_2) {
                    throw lc.a(o_2);
                }
                nV.E(this.R & lc.a(9960, 0x636B12AA9F4F9192L ^ l10), this);
                if (this.o == null) break block7;
            }
            catch (O_ o_3) {
                throw lc.a(o_3);
            }
            try {
                for (int i10 = 1; i10 <= this.o[0]; ++i10) {
                    nV.E(this.o[i10], this);
                }
            }
            catch (O_ o_4) {
                throw lc.a(o_4);
            }
        }
    }

    final void i(int n2) {
        block7: {
            block6: {
                try {
                    if (this.R != 0) break block6;
                    this.R = (short)n2;
                    break block7;
                }
                catch (O_ o_2) {
                    throw lc.a(o_2);
                }
            }
            try {
                if (this.o == null) {
                    this.o = new int[4];
                }
            }
            catch (O_ o_3) {
                throw lc.a(o_3);
            }
            this.o[0] = this.o[0] + 1;
            int n3 = this.o[0];
            if (n3 >= this.o.length) {
                int[] nArray = new int[this.o.length + 4];
                System.arraycopy(this.o, 0, nArray, 0, this.o.length);
                this.o = nArray;
            }
            this.o[n3] = n2;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                lc.c = d8.a(-8915645111045143560L, 7375810797049058169L, null).a(89085235349111L);
                lc.i = new HashMap<K, V>(13);
                var0 = lc.c ^ 54885373076034L;
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
                var6_5 = "P]\u001d\u00af\u00cd\u00f1\u00bbi\u009b\u00cc\u00a1Mk\u00b6\u00a2?e/\u00d7\u00aa\u00af\u0099\u00f8\u00e1\u00c3\u00de\u00f5\u0088\u00e0EE\u00d2";
                var7_6 = "P]\u001d\u00af\u00cd\u00f1\u00bbi\u009b\u00cc\u00a1Mk\u00b6\u00a2?e/\u00d7\u00aa\u00af\u0099\u00f8\u00e1\u00c3\u00de\u00f5\u0088\u00e0EE\u00d2".length();
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
                    var6_5 = "\u00ca\u0094\u00ce\u0003\u000e\u00b4\u00e6\u008d\u009ebj\u00b9\u0087\u00a9\u009b\u000f";
                    var7_6 = "\u00ca\u0094\u00ce\u0003\u000e\u00b4\u00e6\u008d\u009ebj\u00b9\u0087\u00a9\u009b\u000f".length();
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
        lc.d = var8_3;
        lc.f = new Integer[6];
        lc.z = new lc();
    }

    final lc a() {
        lc lc2;
        try {
            lc2 = this.b == null ? this : this.b.M;
        }
        catch (O_ o_2) {
            throw lc.a(o_2);
        }
        return lc2;
    }
}

