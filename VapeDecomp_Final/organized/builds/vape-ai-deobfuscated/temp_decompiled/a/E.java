/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.FR;
import a.Iy;
import a.KP;
import a.WB;
import a._r;
import a.d8;
import a.ej;
import a.iK;
import a.iU;
import a.kd;
import a.z1;
import a.z6;
import a.zZ;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class e {
    private float M = 1.0f;
    private ej j = null;
    private boolean y;
    private static final Map e;
    private int[] Q;
    private Supplier<Void> d = null;
    private int h;
    private _r F;
    public kd N;
    public int z = 0;
    private static final String[] g;
    private final iK U;
    private static final long a;
    private final FR X;
    private Supplier<Void> T = null;
    private static final Integer[] c;
    private z1 m = null;
    private float[] P;
    private static final long[] b;
    private static final Object[] f;
    private WB E;
    private final iU O = new iU(0.0f, 0.0f);
    public int q = 0;
    private Iy l;

    public Supplier<Void> e() {
        return this.d;
    }

    public e f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Color color) {
        long l10 = a ^ 0x113ED495C026L;
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.LINES);
        this.p(f16);
        this.q(9.0f, f10, f11, f12, iK2);
        this.q(9.0f, f13, f14, f15, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)32042, (long)(0x5412D39D8B2FCE35L ^ l10)), (long)8925019985030460449L, (long)l10)));
        return this;
    }

    public e S(float f10, float f11, zZ zZ2, Color color, float f12) {
        long l10 = a ^ 0x4A33EA0417A5L;
        float f13 = f10 + zZ2.P * f12;
        float f14 = f10 + zZ2.R * f12;
        float f15 = f11 + zZ2.j * f12;
        float f16 = f11 + zZ2.I * f12;
        this.D(z6.p);
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.B(11.0f, f13, f15, 0.0f, zZ2.h, zZ2.q, iK2);
        this.B(11.0f, f13, f16, 0.0f, zZ2.h, zZ2.m, iK2);
        this.B(11.0f, f14, f15, 0.0f, zZ2.w, zZ2.q, iK2);
        this.B(11.0f, f14, f16, 0.0f, zZ2.w, zZ2.m, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)29541, (long)(0x41106362C66517E3L ^ l10)), (long)-6026008241302838366L, (long)l10)));
        return this;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (g[n5] != null) {
            return n5;
        }
        Object object = f[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 39;
                break;
            }
            case 1: {
                n4 = 33;
                break;
            }
            case 2: {
                n4 = 14;
                break;
            }
            case 3: {
                n4 = 12;
                break;
            }
            case 4: {
                n4 = 25;
                break;
            }
            case 5: {
                n4 = 34;
                break;
            }
            case 6: {
                n4 = 4;
                break;
            }
            case 7: {
                n4 = 26;
                break;
            }
            case 8: {
                n4 = 30;
                break;
            }
            case 9: {
                n4 = 43;
                break;
            }
            case 10: {
                n4 = 7;
                break;
            }
            case 11: {
                n4 = 6;
                break;
            }
            case 12: {
                n4 = 3;
                break;
            }
            case 13: {
                n4 = 24;
                break;
            }
            case 14: {
                n4 = 57;
                break;
            }
            case 15: {
                n4 = 37;
                break;
            }
            case 16: {
                n4 = 52;
                break;
            }
            case 17: {
                n4 = 41;
                break;
            }
            case 18: {
                n4 = 58;
                break;
            }
            case 19: {
                n4 = 55;
                break;
            }
            case 20: {
                n4 = 5;
                break;
            }
            case 21: {
                n4 = 59;
                break;
            }
            case 22: {
                n4 = 42;
                break;
            }
            case 23: {
                n4 = 48;
                break;
            }
            case 24: {
                n4 = 2;
                break;
            }
            case 25: {
                n4 = 18;
                break;
            }
            case 26: {
                n4 = 27;
                break;
            }
            case 27: {
                n4 = 17;
                break;
            }
            case 28: {
                n4 = 44;
                break;
            }
            case 29: {
                n4 = 47;
                break;
            }
            case 30: {
                n4 = 50;
                break;
            }
            case 31: {
                n4 = 15;
                break;
            }
            case 32: {
                n4 = 16;
                break;
            }
            case 33: {
                n4 = 36;
                break;
            }
            case 34: {
                n4 = 38;
                break;
            }
            case 35: {
                n4 = 0;
                break;
            }
            case 36: {
                n4 = 8;
                break;
            }
            case 37: {
                n4 = 54;
                break;
            }
            case 38: {
                n4 = 62;
                break;
            }
            case 39: {
                n4 = 1;
                break;
            }
            case 40: {
                n4 = 60;
                break;
            }
            case 41: {
                n4 = 29;
                break;
            }
            case 42: {
                n4 = 31;
                break;
            }
            case 43: {
                n4 = 51;
                break;
            }
            case 44: {
                n4 = 19;
                break;
            }
            case 45: {
                n4 = 49;
                break;
            }
            case 46: {
                n4 = 63;
                break;
            }
            case 47: {
                n4 = 13;
                break;
            }
            case 48: {
                n4 = 53;
                break;
            }
            case 49: {
                n4 = 22;
                break;
            }
            case 50: {
                n4 = 10;
                break;
            }
            case 51: {
                n4 = 56;
                break;
            }
            case 52: {
                n4 = 21;
                break;
            }
            case 53: {
                n4 = 23;
                break;
            }
            case 54: {
                n4 = 40;
                break;
            }
            case 55: {
                n4 = 28;
                break;
            }
            case 56: {
                n4 = 61;
                break;
            }
            case 57: {
                n4 = 11;
                break;
            }
            case 58: {
                n4 = 45;
                break;
            }
            case 59: {
                n4 = 46;
                break;
            }
            case 60: {
                n4 = 20;
                break;
            }
            case 61: {
                n4 = 32;
                break;
            }
            case 62: {
                n4 = 9;
                break;
            }
            default: {
                n4 = 35;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        a.e.g[n5] = new String(cArray);
        return n5;
    }

    public e v(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, Color color) {
        float f20;
        long l10 = a ^ 0x7D1F8F06E538L;
        if (f12 == f13) {
            f20 = f14 / f15;
            f12 *= f20;
        }
        f20 = f10 + f12;
        float f21 = f11 + f13;
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.B(14.0f, f10, f11, 0.0f, f16, f17, iK2);
        this.B(14.0f, f10, f21, 0.0f, f16, f19, iK2);
        this.B(14.0f, f20, f11, 0.0f, f18, f17, iK2);
        this.B(14.0f, f20, f21, 0.0f, f18, f19, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)5417, (long)(0x289B77893E49832EL ^ l10)), (long)6828132422569398591L, (long)l10)));
        return this;
    }

    private void O(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, iK iK2, iU iU2) {
        FR fR2 = new FR(f11, f12, f13);
        iU iU3 = new iU(f14, f15);
        this.a(f10, fR2, iU3, this.U, 0.0f, f16, this.O, 0.0f, 0.0f, iU2, this.O, iK2, new FR(f18, f17, 0.0f), f19, this.U);
    }

    public e(int n2, Iy iy2, boolean bl2) {
        this.X = new FR(0.0f, 0.0f, 0.0f);
        this.U = new iK(0.0f, 0.0f, 0.0f, 0.0f);
        this.l = iy2;
        this.N = z6.D.i().f();
        if (z6.i != null) {
            this.j = new ej(z6.i.e, z6.i.j, z6.i.u, z6.i.D);
        }
        this.y = bl2;
        this.h = n2;
        this.F = z6.N.E();
    }

    public e K(float f10, float f11, float f12, float f13, float f14, float f15, Color color) {
        long l10 = a ^ 0x7EACF746C269L;
        float f16 = f10 - f14;
        float f17 = f10 + f12 + f14;
        float f18 = f11 - f14;
        float f19 = f11 + f13 + f14;
        iK iK2 = new iK(f10, f11, f12, f13);
        iK iK3 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.e(8.0f, f16, f18, 0.0f, iK2, f14, f15, iK3);
        this.e(8.0f, f16, f19, 0.0f, iK2, f14, f15, iK3);
        this.e(8.0f, f17, f18, 0.0f, iK2, f14, f15, iK3);
        this.e(8.0f, f17, f19, 0.0f, iK2, f14, f15, iK3);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)212, (long)(0x5449B14B7038B19BL ^ l10)), (long)8760457788591945326L, (long)l10)));
        return this;
    }

    private void V(float f10, float f11, float f12, float f13, float f14, float f15, iU iU2, iK iK2) {
        this.G(f10, f11, f12, f13, 0.0f, 0.0f, f14, f15, iU2, iK2);
    }

    public e k(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, Color color, Color color2) {
        long l10 = a ^ 0x6E65A4D7D23AL;
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        iK iK3 = new iK(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
        this.H(z1.QUADS);
        this.q(9.0f, f13, f14, f15, iK2);
        this.q(9.0f, f10, f11, f12, iK2);
        this.q(9.0f, f16, f17, f18, iK3);
        this.q(9.0f, f19, f20, f21, iK3);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)20378, (long)(0x3976708425976E84L ^ l10)), (long)7620219456333194813L, (long)l10)));
        return this;
    }

    private void A(float f10, float f11, float f12, float f13, float f14, iK iK2, float f15, iK iK3, iK iK4) {
        FR fR2 = new FR(f11, f12, f13);
        this.a(f10, fR2, this.O, iK3, 0.0f, 0.0f, this.O, 0.0f, 0.0f, this.O, this.O, iK2, new FR(f14, 0.0f, 0.0f), f15, iK4);
    }

    public WB I() {
        return this.E;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.e.a = d8.a(5126230801543126905L, -4197702595782077656L, MethodHandles.lookup().lookupClass()).a(51516835068296L);
                a.e.f = new Object[5];
                a.e.g = new String[5];
                a.e.b();
                a.e.e = new HashMap<K, V>(13);
                var0 = a.e.a ^ 42103074447533L;
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
                var8_3 = new long[21];
                var5_4 = 0;
                var6_5 = "\u0097\u009b\u0086\u00f4\rN\u000b\u0018s>\u0018\u00c7\u00bf\u00b3O\u001e/\u00abf\u00cf\u00c20\u00d0\u00c0\u00ca\u00d8<4($\u00b4\u0091\u00f1p\u00dd\u0018\u00f3\u00cc3\u00d1\u0097P\u00c5\u007f6{\u007f\u00e4\u0099\u00d0@\u00b7\u00afl\u00019\u00b2\u0014\u00cf\u0012\u00b3\u0084F\u001d\u00ff\u0002\u00e6\u00c1\u0096\u00f9\u00bco\u0001\u00e5\u00abF\u00a1\u0007\u00bc\u0088\u0017C\u00be\u00fbBv\u00e5\u007f\u00e3P=nKdN\b\u001c\u00ef[\u00a0p\u00b0I&\n_N\u0083\u00ff\u0012\u0090tT\u0098\u00ec?\u008c\u00c4'\u009f\u008d\u00c7\u00a31\u00e8\u00d6\u00f8\u00bf\u00e5\u00ee@\u0090\u00a0<\u00a2\u00eb\u00be15\u0088G\u00c8vw\u0000\u008a\u0010{\u001bU\u0006\u00d8";
                var7_6 = "\u0097\u009b\u0086\u00f4\rN\u000b\u0018s>\u0018\u00c7\u00bf\u00b3O\u001e/\u00abf\u00cf\u00c20\u00d0\u00c0\u00ca\u00d8<4($\u00b4\u0091\u00f1p\u00dd\u0018\u00f3\u00cc3\u00d1\u0097P\u00c5\u007f6{\u007f\u00e4\u0099\u00d0@\u00b7\u00afl\u00019\u00b2\u0014\u00cf\u0012\u00b3\u0084F\u001d\u00ff\u0002\u00e6\u00c1\u0096\u00f9\u00bco\u0001\u00e5\u00abF\u00a1\u0007\u00bc\u0088\u0017C\u00be\u00fbBv\u00e5\u007f\u00e3P=nKdN\b\u001c\u00ef[\u00a0p\u00b0I&\n_N\u0083\u00ff\u0012\u0090tT\u0098\u00ec?\u008c\u00c4'\u009f\u008d\u00c7\u00a31\u00e8\u00d6\u00f8\u00bf\u00e5\u00ee@\u0090\u00a0<\u00a2\u00eb\u00be15\u0088G\u00c8vw\u0000\u008a\u0010{\u001bU\u0006\u00d8".length();
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
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "%\u00e1\u0083/E\u00edW!:\u0006\u0014\u00ed\u0019\u008d\u00bex";
                    var7_6 = "%\u00e1\u0083/E\u00edW!:\u0006\u0014\u00ed\u0019\u008d\u00bex".length();
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
lbl42:
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        a.e.b = var8_3;
        a.e.c = new Integer[21];
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = a.e.a(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                a.e.f[n2] = clazz = Class.forName(g[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void G(float f10, float f11, float f12, float f13, FR fR2, iK iK2, iK iK3) {
        FR fR3 = new FR(f11, f12, f13);
        this.a(f10, fR3, this.O, iK3, 0.0f, 0.0f, this.O, 0.0f, 0.0f, this.O, this.O, iK2, fR2, 0.0f, this.U);
    }

    private void A(float f10, float f11, float f12, float f13, float f14, float f15, float f16, iK iK2, float f17, iK iK3) {
        FR fR2 = new FR(f11, f12, f13);
        iU iU2 = new iU(f14, f15);
        this.a(f10, fR2, iU2, iK3, 0.0f, 0.0f, this.O, 0.0f, 0.0f, this.O, this.O, iK2, new FR(f16, 0.0f, 0.0f), f17, this.U);
    }

    private void a(float f10, FR fR2, iU iU2, iK iK2, float f11, float f12, iU iU3, float f13, float f14, iU iU4, iU iU5, iK iK3, FR fR3, float f15, iK iK4) {
        float f16 = 0.003921569f;
        float[] fArray = new float[]{f10, fR2.S, fR2.p, fR2.D, iU2.p, iU2.j, iK2.F * f16, iK2.s * f16, iK2.X * f16, iK2.n * f16, f11, f12, iU3.p, iU3.j, f13, f14, iU4.p, iU4.j, iU5.p, iU5.j, iK3.F, iK3.s, iK3.X, iK3.n, fR3.S, fR3.p, fR3.D, f15, iK4.F, iK4.s, iK4.X, iK4.n};
        int n2 = this.q * KP.x().t().O();
        System.arraycopy(fArray, 0, this.P, n2, fArray.length);
        ++this.q;
    }

    public e Q(Supplier<Void> supplier) {
        this.T = supplier;
        return this;
    }

    private void e(float f10, float f11, float f12, float f13, iK iK2, float f14, float f15, iK iK3) {
        FR fR2 = new FR(f11, f12, f13);
        FR fR3 = new FR(f15, 0.0f, 0.0f);
        this.a(f10, fR2, this.O, iK3, 0.0f, 0.0f, this.O, 0.0f, 0.0f, this.O, this.O, iK2, fR3, f14, this.U);
    }

    private void B(float f10, float f11, float f12, float f13, float f14, float f15, iK iK2) {
        this.A(f10, f11, f12, f13, f14, f15, 0.0f, this.U, 0.0f, iK2);
    }

    private void y(float f10, float f11, float f12, float f13, iK iK2, float f14, iK iK3) {
        this.e(f10, f11, f12, f13, iK2, f14, 0.0f, iK3);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public e f(float f10, float f11, float f12, float f13, float f14, float f15, int n2, Color color) {
        float f16;
        iK iK2;
        iK iK3;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        float f17 = 0.5f;
        if (f14 <= 0.0f) {
            f17 = 0.0f;
        }
        float f18 = f15;
        float f19 = Math.max(0.0f, (f14 += f17 * 2.0f) - f18);
        if (f14 > 0.0f) {
            f10 = (float)((double)f10 - ((double)f18 - 0.5));
            f11 -= f18;
            f13 = (float)((double)f13 + (double)f18 * 1.5);
            f12 += f18 * 1.0f;
        }
        float f20 = f10 + f17;
        float f21 = f10 + f12 - f17;
        float f22 = f11 + f17;
        float f23 = f11 + f13 - f17;
        try {
            bl5 = (n2 & 1) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        boolean bl6 = bl5;
        try {
            bl4 = (n2 & 2) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        boolean bl7 = bl4;
        try {
            bl3 = (n2 & 4) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        boolean bl8 = bl3;
        try {
            bl2 = (n2 & 8) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        boolean bl9 = bl2;
        try {
            iK iK4;
            iK3 = iK4;
            iK2 = iK4;
            f16 = bl6 ? 1.0f : 0.0f;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        iK3(f16, bl7 ? 1.0f : 0.0f, bl8 ? 1.0f : 0.0f, bl9 ? 1.0f : 0.0f);
        iK iK5 = iK2;
        iK iK6 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        iK iK7 = new iK(f10 + f14, f11 + f14, f10 + f12 - f14, f11 + f13 - f14);
        this.L(12.0f, f20, f22, 0.0f, iK7, f19, f18, iK5, iK6);
        this.L(12.0f, f20, f23, 0.0f, iK7, f19, f18, iK5, iK6);
        this.L(12.0f, f21, f22, 0.0f, iK7, f19, f18, iK5, iK6);
        this.L(12.0f, f21, f23, 0.0f, iK7, f19, f18, iK5, iK6);
        return this;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x48D6;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/e", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            a.e.c[n3] = n4;
        }
        return c[n3];
    }

    private void m(String string) {
        this.y(string, KP.x().E(this.y));
    }

    public e z(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, Color color, Color color2) {
        long l10 = a ^ 0x2E99C62FDE3EL;
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        iK iK3 = new iK(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
        this.H(z1.QUADS);
        this.q(9.0f, f13, f14, f15, iK2);
        this.q(9.0f, f10, f11, f12, iK2);
        this.q(9.0f, f16, f17, f18, iK3);
        this.q(9.0f, f19, f20, f21, iK3);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)22258, (long)(0x7EBB35CF9516FBE1L ^ l10)), (long)7333045212144118329L, (long)l10)));
        return this;
    }

    public Supplier<Void> V() {
        return this.T;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00a2' || c10 == '\u00ec' || c10 == 'U' || c10 == 'L') {
                field = a.e.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00a2' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = a.e.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = a.e.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = a.e.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public e r(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, Color color) {
        long l10 = a ^ 0xE26D16E7EBCL;
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.TRIANGLES);
        this.q(9.0f, f13, f14, f15, iK2);
        this.q(9.0f, f10, f11, f12, iK2);
        this.q(9.0f, f16, f17, f18, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)20195, (long)(0x53639A85D7D1C363L ^ l10)), (long)-4231671178739381573L, (long)l10)));
        return this;
    }

    public e W(float f10, float f11, float f12, float f13, Color color, float f14, float f15, float f16) {
        long l10 = a ^ 0x390D711E94CDL;
        float f17 = 0.5f;
        f10 = (float)((double)f10 - ((double)f16 - 0.5));
        f13 = (float)((double)f13 + (double)f16 * 1.5);
        float f18 = f10 + f17;
        float f19 = f10 + (f12 += f16 * 1.0f) - f17;
        float f20 = (f11 -= f16) + f17;
        float f21 = f11 + f13 - f17;
        FR fR2 = new FR(f14, f16, f15);
        iK iK2 = new iK(f10 + f14 + f15, f11 + f14 + f15, f10 + f12 - (f14 + f15), f11 + f13 - (f14 + f15));
        iK iK3 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.G(6.0f, f18, f20, 0.0f, fR2, iK2, iK3);
        this.G(6.0f, f18, f21, 0.0f, fR2, iK2, iK3);
        this.G(6.0f, f19, f20, 0.0f, fR2, iK2, iK3);
        this.G(6.0f, f19, f21, 0.0f, fR2, iK2, iK3);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)32060, (long)(0x7205A02942D9ADBL ^ l10)), (long)3402225770906247370L, (long)l10)));
        return this;
    }

    public e S(float f10, float f11, float f12, float f13, Color color) {
        long l10 = a ^ 0x5A7512D87D6FL;
        f10 -= f13 / 2.0f;
        f11 -= f13 / 2.0f;
        float f14 = f12 += f13;
        float f15 = f12;
        if (color == null) {
            color = Color.WHITE;
        }
        float f16 = f10 + f14;
        float f17 = f11 + f15;
        float f18 = f12 / 2.0f;
        iU iU2 = new iU(f10 + f14 / 2.0f, f11 + f15 / 2.0f);
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 1.0f;
        float f22 = 1.0f;
        this.G(4.0f, f10, f11, 0.0f, f19, f20, f18, f13, iU2, iK2);
        this.G(4.0f, f10, f17, 0.0f, f19, f22, f18, f13, iU2, iK2);
        this.G(4.0f, f16, f11, 0.0f, f21, f20, f18, f13, iU2, iK2);
        this.G(4.0f, f16, f17, 0.0f, f21, f22, f18, f13, iU2, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)28619, (long)(0x7845182FD9BAE18CL ^ l10)), (long)-4137329040546789016L, (long)l10)));
        return this;
    }

    public e D(WB wB2) {
        this.E = wB2;
        return this;
    }

    private void q(float f10, float f11, float f12, float f13, iK iK2) {
        this.y(f10, f11, f12, f13, this.U, 0.0f, iK2);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public e j(float f10, float f11, float f12, float f13, Color color) {
        long l10 = a ^ 0x497553661CC2L;
        float f14 = f10 + f12;
        float f15 = f11 + f13;
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.q(9.0f, f10, f11, 0.0f, iK2);
        this.q(9.0f, f10, f15, 0.0f, iK2);
        this.q(9.0f, f14, f11, 0.0f, iK2);
        this.q(9.0f, f14, f15, 0.0f, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)3123, (long)(0x7D48FC0F87BE3DAL ^ l10)), (long)-6397272937938589499L, (long)l10)));
        return this;
    }

    public e j(float f10, float f11, float f12, float f13, float f14, float f15, Color color) {
        long l10;
        block6: {
            l10 = a ^ 0x5855E026AA5CL;
            try {
                try {
                    if (f12 != 0.0f && f13 != 0.0f) break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw a.e.a(illegalArgumentException);
                }
                return null;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw a.e.a(illegalArgumentException);
            }
        }
        float f16 = 0.5f;
        if (f14 == 0.0f) {
            f16 = 0.0f;
        }
        float f17 = Math.max(0.0f, (f14 += f16 * 2.0f) - f15);
        if (f14 != 0.0f) {
            f10 = (float)((double)f10 - ((double)f15 - 0.5));
            f11 -= f15;
            f13 = (float)((double)f13 + (double)f15 * 1.5);
            f12 += f15 * 1.0f;
        }
        float f18 = f10 + f12;
        float f19 = f11 + f13;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 1.0f;
        float f23 = 1.0f;
        iK iK2 = new iK(f10 + f14, f11 + f14, f10 + f12 - f14, f11 + f13 - f14);
        iK iK3 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.A(7.0f, f10, f11, 0.0f, f20, f21, f17, iK2, f15, iK3);
        this.A(7.0f, f10, f19, 0.0f, f20, f23, f17, iK2, f15, iK3);
        this.A(7.0f, f18, f11, 0.0f, f22, f21, f17, iK2, f15, iK3);
        this.A(7.0f, f18, f19, 0.0f, f22, f23, f17, iK2, f15, iK3);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)18393, (long)(0x25BDB8832D621EA7L ^ l10)), (long)1271777648727809627L, (long)l10)));
        return this;
    }

    private void L(float f10, float f11, float f12, float f13, iK iK2, float f14, float f15, iK iK3, iK iK4) {
        FR fR2 = new FR(f11, f12, f13);
        FR fR3 = new FR(f14, 0.0f, 0.0f);
        this.a(f10, fR2, this.O, iK4, 0.0f, f15, this.O, 0.0f, 0.0f, this.O, this.O, iK2, fR3, 0.0f, iK3);
    }

    private void b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, iU iU2, float f17, float f18, iK iK2) {
        FR fR2 = new FR(f11, f12, f13);
        this.a(f10, fR2, this.O, iK2, f14, f16, iU2, f17, f18, this.O, this.O, this.U, new FR(f15, 0.0f, 0.0f), 0.0f, this.U);
    }

    public float[] D() {
        return this.P;
    }

    public e H(float f10, float f11, float f12, float f13, Color color, float f14, float f15, int n2) {
        float f16;
        iK iK2;
        iK iK3;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        long l10 = a ^ 0x8F24CF75B18L;
        float f17 = 0.5f;
        if (f14 <= 0.0f) {
            f17 = 0.0f;
        }
        float f18 = Math.max(0.0f, (f14 += f17 * 2.0f) - f15);
        if (f14 > 0.0f) {
            f10 -= f15 - 0.5f;
            f11 -= f15;
            f13 += f15 * 1.0f;
            f12 += f15 * 1.0f;
        }
        float f19 = f10 + f17;
        float f20 = f10 + f12 - f17;
        float f21 = f11 + f17;
        float f22 = f11 + f13 - f17;
        try {
            bl5 = (n2 & 1) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        boolean bl6 = bl5;
        try {
            bl4 = (n2 & 2) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        boolean bl7 = bl4;
        try {
            bl3 = (n2 & 4) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        boolean bl8 = bl3;
        try {
            bl2 = (n2 & 8) != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        boolean bl9 = bl2;
        try {
            iK iK4;
            iK3 = iK4;
            iK2 = iK4;
            f16 = bl6 ? 1.0f : 0.0f;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        iK3(f16, bl7 ? 1.0f : 0.0f, bl8 ? 1.0f : 0.0f, bl9 ? 1.0f : 0.0f);
        iK iK5 = iK2;
        iK iK6 = new iK(f10 + f14, f11 + f14, f10 + f12 - f14, f11 + f13 - f14);
        iK iK7 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.A(5.0f, f19, f21, 0.0f, f18, iK6, f15, iK7, iK5);
        this.A(5.0f, f19, f22, 0.0f, f18, iK6, f15, iK7, iK5);
        this.A(5.0f, f20, f21, 0.0f, f18, iK6, f15, iK7, iK5);
        this.A(5.0f, f20, f22, 0.0f, f18, iK6, f15, iK7, iK5);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)21202, (long)(0x662C2DA32737AEBL ^ l10)), (long)-2242208021509689569L, (long)l10)));
        return this;
    }

    public e Q(float f10, float f11, float f12, float f13, Color color) {
        return this.H(f10, f11, f12, f13, color, 1.5f, 1.0f, 0);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/e" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l10, long l11) {
        int n2 = a.e.a(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = a.e.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = a.e.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = a.e.a(clazz3, string2, clazz2)) != null) {
                    a.e.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = a.e.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        a.e.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = a.e.b(222230160601734L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = a.e.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = a.e.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public e H(z1 z12) {
        return this.P(z12, KP.x().t().O());
    }

    public e E(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, Color color) {
        float f20;
        long l10 = a ^ 0x3A79D11E3DB3L;
        if (f12 == f13) {
            f20 = f14 / f15;
            f12 *= f20;
        }
        f20 = f10 + f12;
        float f21 = f11 + f13;
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.B(10.0f, f10, f11, 0.0f, f16, f17, iK2);
        this.B(10.0f, f10, f21, 0.0f, f16, f19, iK2);
        this.B(10.0f, f20, f11, 0.0f, f18, f17, iK2);
        this.B(10.0f, f20, f21, 0.0f, f18, f19, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)201, (long)(0x155B4EC17D284E44L ^ l10)), (long)-8770442357728654924L, (long)l10)));
        return this;
    }

    public e o(float f10, float f11, float f12, float f13, float f14, Color color) {
        long l10 = a ^ 0x29609386FEE3L;
        float f15 = f12 += f14;
        float f16 = f12;
        float f17 = (f10 -= f14 / 2.0f) + f15;
        float f18 = (f11 -= f14 / 2.0f) + f16;
        float f19 = f12 / 2.0f;
        float f20 = f19 - f13;
        iU iU2 = new iU(f10 + f15 / 2.0f, f11 + f16 / 2.0f);
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.N(3.0f, f10, f11, 0.0f, f20, f19, f14, iU2, iK2);
        this.N(3.0f, f10, f18, 0.0f, f20, f19, f14, iU2, iK2);
        this.N(3.0f, f17, f11, 0.0f, f20, f19, f14, iU2, iK2);
        this.N(3.0f, f17, f18, 0.0f, f20, f19, f14, iU2, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)191, (long)(0x2A21316CAAF50D73L ^ l10)), (long)4979066104804772580L, (long)l10)));
        return this;
    }

    private static void b() {
        Object[] objectArray = f;
        f[0] = "|\"\u0011";
        objectArray[1] = Integer.TYPE;
        a.e.g[1] = "java/lang/Integer";
        objectArray[2] = "8J\u000fR\u0013x3E\u001e\u001dn` B\u0017T";
        objectArray[3] = "S4\u0012tu\u0010X;\u0003;\u0014\u001eS0\u0007a";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "2\u0004\u0011w\u00068`\u0004\u0014H\u0017\"_BV7\u0000)oE^&\u0005Yf\u0007^9\u00006b\u0006\u00020|";
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public e O(float f10, float f11, float f12, float f13, Color color, float f14) {
        return this.H(f10, f11, f12, f13, color, f14, 1.0f, 0);
    }

    public int[] q() {
        return this.Q;
    }

    public e B(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Color color) {
        long l10 = a ^ 0x48336B8EDB33L;
        float f17 = (f12 += f14 * 4.0f) / 2.0f;
        iU iU2 = new iU((f10 -= f14 * 2.0f) + f17, (f11 -= f14 * 2.0f) + f17);
        f17 = f17 - (f13 /= 2.0f) - 1.0f;
        float f18 = f17 - f13;
        float f19 = f10 + f12;
        float f20 = f11 + f12;
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        if (f16 != -360.0f) {
            f16 %= 360.0f;
        }
        float f21 = f15 % 360.0f + f16 * 0.5f;
        this.H(z1.QUADS);
        this.b(0.0f, f10, f11, 0.0f, f18, f17, f14, iU2, f21, f16, iK2);
        this.b(0.0f, f10, f20, 0.0f, f18, f17, f14, iU2, f21, f16, iK2);
        this.b(0.0f, f19, f11, 0.0f, f18, f17, f14, iU2, f21, f16, iK2);
        this.b(0.0f, f19, f20, 0.0f, f18, f17, f14, iU2, f21, f16, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)26444, (long)(0x443F613265044F58L ^ l10)), (long)6974197229906800436L, (long)l10)));
        return this;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = a.e.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public _r n() {
        return this.F;
    }

    public z1 B() {
        return this.m;
    }

    public e E(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        long l10 = a ^ 0x5EA82AF1D3E0L;
        float f18 = 0.0f;
        float f19 = 1.0f;
        float f20 = 1.0f;
        float f21 = 0.0f;
        float f22 = f10 + f12;
        float f23 = f11 + f13;
        iK iK2 = new iK(f10 + f15, f11 + f15, f10 + f12 - f15, f11 + f13 - f15);
        iU iU2 = new iU(f12, f13);
        this.H(z1.QUADS);
        this.O(1.0f, f10, f11, 0.0f, f18, f19, f16, f14, f15, f17, iK2, iU2);
        this.O(1.0f, f10, f23, 0.0f, f18, f21, f16, f14, f15, f17, iK2, iU2);
        this.O(1.0f, f22, f11, 0.0f, f20, f19, f16, f14, f15, f17, iK2, iU2);
        this.O(1.0f, f22, f23, 0.0f, f20, f21, f16, f14, f15, f17, iK2, iU2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)22151, (long)(0x4FB0E1D2C99E7642L ^ l10)), (long)7501385049038956519L, (long)l10)));
        return this;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    private void N(float f10, float f11, float f12, float f13, float f14, float f15, float f16, iU iU2, iK iK2) {
        FR fR2 = new FR(f11, f12, f13);
        this.a(f10, fR2, this.O, iK2, f14, f16, iU2, 0.0f, 0.0f, this.O, this.O, this.U, new FR(f15, 0.0f, 0.0f), 0.0f, this.U);
    }

    public e p(float f10) {
        this.M = f10;
        return this;
    }

    public e b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, Color color) {
        return this.z(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, color, color);
    }

    public e W(float f10, float f11, float f12, float f13, Color color) {
        long l10 = a ^ 0x58DB8BBF0CBAL;
        float f14 = f12 += f13;
        float f15 = f12;
        float f16 = (f10 -= f13 / 2.0f) + f14;
        float f17 = (f11 -= f13 / 2.0f) + f15;
        float f18 = f12 / 2.0f;
        iU iU2 = new iU(f10 + f14 / 2.0f, f11 + f15 / 2.0f);
        iK iK2 = new iK(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        this.H(z1.QUADS);
        this.V(2.0f, f10, f11, 0.0f, f18, f13, iU2, iK2);
        this.V(2.0f, f10, f17, 0.0f, f18, f13, iU2, iK2);
        this.V(2.0f, f16, f11, 0.0f, f18, f13, iU2, iK2);
        this.V(2.0f, f16, f17, 0.0f, f18, f13, iU2, iK2);
        this.m((String)((Object)a.e.b("v", (int)a.e.a("o", (int)10869, (long)(0x1B65874473D6D5E3L ^ l10)), (long)-5242115719660144451L, (long)l10)));
        return this;
    }

    public e P(z1 z12, int n2) {
        try {
            if (this.m != null) {
                return this;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw a.e.a(illegalArgumentException);
        }
        this.m = z12;
        this.P = new float[n2 * this.h];
        this.Q = new int[z12.indicesCount];
        return this;
    }

    public e() {
        this(4);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = a.e.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method d(long l10, long l11) {
        int n2 = a.e.a(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n2];
                int n4 = string2.indexOf(8);
                clazz3 = a.e.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = a.e.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = a.e.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        a.e.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = a.e.b(222230160601734L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = a.e.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        a.e.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = a.e.b(222230160601734L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    public void p(int n2, float f10) {
        this.P[n2] = f10;
    }

    /*
     * Exception decompiling
     */
    public void y(String var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public e W(Supplier<Void> supplier) {
        this.d = supplier;
        this.H(z1.QUADS);
        return this;
    }

    public float a() {
        return this.M;
    }

    public e(Iy iy2, boolean bl2) {
        this(4, iy2, bl2);
    }

    public ej A() {
        return this.j;
    }

    public Iy V() {
        return this.l;
    }

    private void G(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, iU iU2, iK iK2) {
        FR fR2 = new FR(f11, f12, f13);
        iU iU3 = new iU(f14, f15);
        this.a(f10, fR2, iU3, iK2, 0.0f, f17, iU2, 0.0f, 0.0f, this.O, this.O, this.U, new FR(f16, 0.0f, 0.0f), 0.0f, this.U);
    }

    public e(int n2) {
        this(n2, Iy.DEFAULT, false);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(e.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

