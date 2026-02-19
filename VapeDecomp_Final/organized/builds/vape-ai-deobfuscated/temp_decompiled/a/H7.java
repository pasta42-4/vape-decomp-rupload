/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.B9;
import a.F8;
import a.Gv;
import a.O_;
import a.Rs;
import a.X_;
import a.bM;
import a.bh;
import a.d8;
import a.hQ;
import a.rG;
import a.rx;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class h7
extends hQ {
    Color b;
    private static final String[] jb;
    private static final Object[] fb;
    private B9 Y;
    private Color Y4;
    private boolean YR;
    private static final Integer[] db;
    private final rx D;
    private static final long[] bb;
    private static final long ab;
    private int L;
    private static final Map eb;
    public bM V;

    public void x(boolean bl2) {
        this.YR = bl2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public boolean I() {
        return this.D.F();
    }

    public h7(B9 b92, Color color) {
        long l10 = ab ^ 0x74684CA9A8C0L;
        this.Y4 = new Color(255, 255, 255, 100);
        this.L = (int)h7.b("b", (int)30778, (long)(0x785A0FFD327D3B62L ^ l10));
        this.b = color;
        this.Y = b92;
        this.N(new Gv(this));
        this.D = new rG(this, this.g());
        this.V = new bM(b92 == null ? "" : b92.t(), (String)((Object)h7.c("D", (int)h7.b("b", (int)23869, (long)(0x766CC77F8AB39E61L ^ l10)), (long)-956397128026639173L, (long)l10)), "", 50.0, 0.8, color == null ? Rs.V() : color, false, false);
        this.o(this.V);
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x31E3;
        if (db[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/h7", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            h7.db[n3] = n4;
        }
        return db[n3];
    }

    public void b(B9 b92) {
        this.Y = b92;
        this.D.H(b92);
        this.V.d(b92.t());
    }

    @Override
    public void G() {
        double d2;
        double d3;
        block67: {
            Object object;
            block66: {
                Color color;
                block65: {
                    int n2;
                    int n3;
                    int n4;
                    int n5;
                    Color color2;
                    block64: {
                        block59: {
                            Color color3;
                            float f10;
                            float f11;
                            long l10;
                            block63: {
                                Color color4;
                                block62: {
                                    Object object2;
                                    double d4;
                                    double d5;
                                    double d6;
                                    double d7;
                                    int n6;
                                    int n7;
                                    int n8;
                                    int n9;
                                    Color color5;
                                    Color color6;
                                    block61: {
                                        block60: {
                                            block56: {
                                                CallSite callSite;
                                                float f12;
                                                float f13;
                                                Color color7;
                                                int n10;
                                                int n11;
                                                int n12;
                                                int n13;
                                                Color color8;
                                                Color color9;
                                                block58: {
                                                    block57: {
                                                        block54: {
                                                            block55: {
                                                                block53: {
                                                                    float f14;
                                                                    Color color10;
                                                                    block52: {
                                                                        block51: {
                                                                            Color color11;
                                                                            boolean bl2;
                                                                            bM bM2;
                                                                            block50: {
                                                                                block49: {
                                                                                    l10 = ab ^ 0x27E29BA92671L;
                                                                                    try {
                                                                                        try {
                                                                                            bM2 = this.V;
                                                                                            if (this.s() || this.D.F()) break block49;
                                                                                        }
                                                                                        catch (O_ o_2) {
                                                                                            throw h7.a(o_2);
                                                                                        }
                                                                                        bl2 = true;
                                                                                        break block50;
                                                                                    }
                                                                                    catch (O_ o_3) {
                                                                                        throw h7.a(o_3);
                                                                                    }
                                                                                }
                                                                                bl2 = false;
                                                                            }
                                                                            try {
                                                                                bM2.N(bl2);
                                                                                if (this.Y == null) {
                                                                                    return;
                                                                                }
                                                                            }
                                                                            catch (O_ o_4) {
                                                                                throw h7.a(o_4);
                                                                            }
                                                                            this.V.d(this.Y.t());
                                                                            d3 = this.V.K();
                                                                            d2 = this.V.u();
                                                                            try {
                                                                                color11 = this.b == null ? Rs.V() : this.b;
                                                                            }
                                                                            catch (O_ o_5) {
                                                                                throw h7.a(o_5);
                                                                            }
                                                                            color4 = color11;
                                                                            try {
                                                                                if (!this.YR) break block51;
                                                                                color10 = h7.M.I;
                                                                                break block52;
                                                                            }
                                                                            catch (O_ o_6) {
                                                                                throw h7.a(o_6);
                                                                            }
                                                                        }
                                                                        try {
                                                                            color10 = this.Y.v() ? color4 : h7.M.w;
                                                                        }
                                                                        catch (O_ o_7) {
                                                                            throw h7.a(o_7);
                                                                        }
                                                                    }
                                                                    Color color12 = color10;
                                                                    this.V.S(color12);
                                                                    this.getClass();
                                                                    f11 = 8.0f / 2.0f;
                                                                    try {
                                                                        f14 = this.w() != 10.0 ? (float)this.w() - 6.0f : f11;
                                                                    }
                                                                    catch (O_ o_8) {
                                                                        throw h7.a(o_8);
                                                                    }
                                                                    f10 = f14;
                                                                    try {
                                                                        if (!this.D.F()) break block53;
                                                                        this.Y(10.0);
                                                                        this.T(this.y());
                                                                        this.g((String)((Object)h7.c("D", (int)h7.b("b", (int)21851, (long)(0x525928CE841698B0L ^ l10)), (long)8938346100381989386L, (long)l10)));
                                                                        break block54;
                                                                    }
                                                                    catch (O_ o_9) {
                                                                        throw h7.a(o_9);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (this.V.B() != null && !this.V.B().isEmpty()) break block55;
                                                                    }
                                                                    catch (O_ o_10) {
                                                                        throw h7.a(o_10);
                                                                    }
                                                                    this.Y(10.0);
                                                                    this.T(this.y());
                                                                }
                                                                catch (O_ o_11) {
                                                                    throw h7.a(o_11);
                                                                }
                                                            }
                                                            object = h7.c("D", (int)h7.b("b", (int)31179, (long)(0x284A17072A85B421L ^ l10)), (long)8938346100381989386L, (long)l10);
                                                            bh bh2 = this.V.E() != null ? new bh(this, (String)object, 0.7, h7.M.w, false, this.V.E().y(), 0.8, h7.M.n, true) : new bh(this, (String)object, 0.7, h7.M.w, false);
                                                            this.i(bh2);
                                                        }
                                                        try {
                                                            try {
                                                                Color color13;
                                                                try {
                                                                    if (!this.s() && !this.D.F()) break block56;
                                                                }
                                                                catch (O_ o_12) {
                                                                    throw h7.a(o_12);
                                                                }
                                                                color9 = color13;
                                                                color8 = color13;
                                                                n13 = 255;
                                                                n12 = 255;
                                                                n11 = 255;
                                                                if (!this.Y.v()) break block57;
                                                            }
                                                            catch (O_ o_13) {
                                                                throw h7.a(o_13);
                                                            }
                                                            n10 = this.L;
                                                            break block58;
                                                        }
                                                        catch (O_ o_14) {
                                                            throw h7.a(o_14);
                                                        }
                                                    }
                                                    n10 = 17;
                                                }
                                                color9(n13, n12, n11, n10);
                                                object = color8;
                                                try {
                                                    F8.S(this.G(), this.W(), this.w(), this.b(), (Color)object);
                                                    color7 = this.Y.v() ? color4 : h7.M.n;
                                                }
                                                catch (O_ o_15) {
                                                    throw h7.a(o_15);
                                                }
                                                try {
                                                    f13 = (float)this.G() + f10 / 2.0f;
                                                    f12 = (float)this.W() + f11 / 2.0f;
                                                    callSite = this.D.F() ? h7.c("D", (int)h7.b("b", (int)31101, (long)(0x682C88A7F3C7B491L ^ l10)), (long)8938346100381989386L, (long)l10) : h7.c("D", (int)h7.b("b", (int)20497, (long)(0x78EE0E78C5B71DF9L ^ l10)), (long)8938346100381989386L, (long)l10);
                                                }
                                                catch (O_ o_16) {
                                                    throw h7.a(o_16);
                                                }
                                                X_.B(color7, f13, f12, (String)((Object)callSite), f11 * 1.5f, f11 * 1.5f, false);
                                                return;
                                            }
                                            try {
                                                try {
                                                    Color color14;
                                                    try {
                                                        if (this.V.B() != null && !this.V.B().isEmpty()) break block59;
                                                    }
                                                    catch (O_ o_17) {
                                                        throw h7.a(o_17);
                                                    }
                                                    color6 = color14;
                                                    color5 = color14;
                                                    n9 = 255;
                                                    n8 = 255;
                                                    n7 = 255;
                                                    if (!this.Y.v()) break block60;
                                                }
                                                catch (O_ o_18) {
                                                    throw h7.a(o_18);
                                                }
                                                n6 = this.L;
                                                break block61;
                                            }
                                            catch (O_ o_19) {
                                                throw h7.a(o_19);
                                            }
                                        }
                                        n6 = 17;
                                    }
                                    color6(n9, n8, n7, n6);
                                    object = color5;
                                    try {
                                        d7 = this.G();
                                        d6 = this.W();
                                        d5 = this.w();
                                        d4 = this.b();
                                        object2 = this.YR ? h7.M.i : object;
                                    }
                                    catch (O_ o_20) {
                                        throw h7.a(o_20);
                                    }
                                    try {
                                        F8.S(d7, d6, d5, d4, (Color)object2);
                                        if (!this.YR) break block62;
                                        color3 = h7.M.o;
                                        break block63;
                                    }
                                    catch (O_ o_21) {
                                        throw h7.a(o_21);
                                    }
                                }
                                try {
                                    color3 = this.Y.v() ? color4 : h7.M.w;
                                }
                                catch (O_ o_22) {
                                    throw h7.a(o_22);
                                }
                            }
                            X_.B(color3, (float)this.G() + f10 / 2.0f, (float)this.W() + f11 / 2.0f, (String)((Object)h7.c("D", (int)h7.b("b", (int)21664, (long)(0x79F2B1AC4E13994FL ^ l10)), (long)8938346100381989386L, (long)l10)), f11 * 1.5f, f11 * 1.5f, false);
                            return;
                        }
                        try {
                            if (!this.YR) break block64;
                            color = h7.M.i;
                            break block65;
                        }
                        catch (O_ o_23) {
                            throw h7.a(o_23);
                        }
                    }
                    try {
                        Color color15;
                        color2 = color15;
                        color = color15;
                        n5 = 255;
                        n4 = 255;
                        n3 = 255;
                        n2 = this.Y.v() ? this.L : 17;
                    }
                    catch (O_ o_24) {
                        throw h7.a(o_24);
                    }
                    color2(n5, n4, n3, n2);
                }
                object = color;
                try {
                    if (this.V.B().length() != 1) break block66;
                    this.Y(10.0);
                    this.T(this.y());
                    F8.S(this.G(), this.W(), this.w(), this.b(), (Color)object);
                    break block67;
                }
                catch (O_ o_25) {
                    throw h7.a(o_25);
                }
            }
            this.Y(d2 + 5.0);
            this.T(this.y());
            F8.S(this.G(), this.W(), this.w(), this.b(), (Color)object);
        }
        this.V.b(this.G() + this.w() / 2.0 - d2 / 2.0);
        this.V.M(this.W() + this.b() / 2.0 - d3 / 2.0);
    }

    public rx Q() {
        return this.D;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (jb[n5] != null) {
            return n5;
        }
        Object object = fb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 56;
                break;
            }
            case 1: {
                n4 = 4;
                break;
            }
            case 2: {
                n4 = 45;
                break;
            }
            case 3: {
                n4 = 12;
                break;
            }
            case 4: {
                n4 = 2;
                break;
            }
            case 5: {
                n4 = 18;
                break;
            }
            case 6: {
                n4 = 36;
                break;
            }
            case 7: {
                n4 = 34;
                break;
            }
            case 8: {
                n4 = 62;
                break;
            }
            case 9: {
                n4 = 61;
                break;
            }
            case 10: {
                n4 = 27;
                break;
            }
            case 11: {
                n4 = 44;
                break;
            }
            case 12: {
                n4 = 32;
                break;
            }
            case 13: {
                n4 = 57;
                break;
            }
            case 14: {
                n4 = 10;
                break;
            }
            case 15: {
                n4 = 15;
                break;
            }
            case 16: {
                n4 = 22;
                break;
            }
            case 17: {
                n4 = 43;
                break;
            }
            case 18: {
                n4 = 25;
                break;
            }
            case 19: {
                n4 = 35;
                break;
            }
            case 20: {
                n4 = 52;
                break;
            }
            case 21: {
                n4 = 9;
                break;
            }
            case 22: {
                n4 = 8;
                break;
            }
            case 23: {
                n4 = 6;
                break;
            }
            case 24: {
                n4 = 24;
                break;
            }
            case 25: {
                n4 = 23;
                break;
            }
            case 26: {
                n4 = 7;
                break;
            }
            case 27: {
                n4 = 29;
                break;
            }
            case 28: {
                n4 = 39;
                break;
            }
            case 29: {
                n4 = 63;
                break;
            }
            case 30: {
                n4 = 60;
                break;
            }
            case 31: {
                n4 = 13;
                break;
            }
            case 32: {
                n4 = 14;
                break;
            }
            case 33: {
                n4 = 38;
                break;
            }
            case 34: {
                n4 = 48;
                break;
            }
            case 35: {
                n4 = 21;
                break;
            }
            case 36: {
                n4 = 42;
                break;
            }
            case 37: {
                n4 = 31;
                break;
            }
            case 38: {
                n4 = 28;
                break;
            }
            case 39: {
                n4 = 37;
                break;
            }
            case 40: {
                n4 = 59;
                break;
            }
            case 41: {
                n4 = 33;
                break;
            }
            case 42: {
                n4 = 11;
                break;
            }
            case 43: {
                n4 = 41;
                break;
            }
            case 44: {
                n4 = 3;
                break;
            }
            case 45: {
                n4 = 40;
                break;
            }
            case 46: {
                n4 = 5;
                break;
            }
            case 47: {
                n4 = 20;
                break;
            }
            case 48: {
                n4 = 30;
                break;
            }
            case 49: {
                n4 = 50;
                break;
            }
            case 50: {
                n4 = 55;
                break;
            }
            case 51: {
                n4 = 16;
                break;
            }
            case 52: {
                n4 = 54;
                break;
            }
            case 53: {
                n4 = 46;
                break;
            }
            case 54: {
                n4 = 58;
                break;
            }
            case 55: {
                n4 = 26;
                break;
            }
            case 56: {
                n4 = 47;
                break;
            }
            case 57: {
                n4 = 51;
                break;
            }
            case 58: {
                n4 = 0;
                break;
            }
            case 59: {
                n4 = 49;
                break;
            }
            case 60: {
                n4 = 19;
                break;
            }
            case 61: {
                n4 = 17;
                break;
            }
            case 62: {
                n4 = 1;
                break;
            }
            default: {
                n4 = 53;
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
        h7.jb[n5] = new String(cArray);
        return n5;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/h7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double z() {
        return 10.0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                h7.ab = d8.a(6408315738359186174L, -5836260700306288503L, MethodHandles.lookup().lookupClass()).a(119732878793093L);
                h7.fb = new Object[5];
                h7.jb = new String[5];
                h7.i();
                h7.eb = new HashMap<K, V>(13);
                var0 = h7.ab ^ 101565189886189L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u0018#\u00a5\u00e4Gi\u00f76\u00a4!\u00d2\u00c0\u00a5\u00ef&x \u0091\u00ab\u00c2Am<5\u00a8\u00fb+\u009c\u00de\u00bcc\u00eeh>\u0081\t\u0012\u0085\"\u0017";
                var7_6 = "\u0018#\u00a5\u00e4Gi\u00f76\u00a4!\u00d2\u00c0\u00a5\u00ef&x \u0091\u00ab\u00c2Am<5\u00a8\u00fb+\u009c\u00de\u00bcc\u00eeh>\u0081\t\u0012\u0085\"\u0017".length();
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
                    var6_5 = "\u0017'\u0013\u0082\u0092/\u0084\u00d2\u00f8\u00fc\u00bb\u0015@H\u00fc\u00a5";
                    var7_6 = "\u0017'\u0013\u0082\u0092/\u0084\u00d2\u00f8\u00fc\u00bb\u0015@H\u00fc\u00a5".length();
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
        h7.bb = var8_3;
        h7.db = new Integer[7];
    }

    static rx I(h7 h72) {
        return h72.D;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = h7.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = h7.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = h7.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public boolean L() {
        return this.YR;
    }

    @Override
    public double e() {
        return 10.0;
    }

    private static Method h(long l10, long l11) {
        int n2 = h7.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = h7.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = h7.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = h7.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        h7.fb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = h7.f(279267011241158L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = h7.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        h7.fb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = h7.f(279267011241158L, 0L);
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

    public B9 g() {
        return this.Y;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = h7.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = h7.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public h7(B9 b92) {
        this(b92, null);
    }

    private static Field g(long l10, long l11) {
        int n2 = h7.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            String string = jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = h7.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = h7.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = h7.c(clazz3, string2, clazz2)) != null) {
                    h7.fb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = h7.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        h7.fb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = h7.f(279267011241158L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void n(int n2) {
        this.L = n2;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e5' || c10 == 'Z' || c10 == '\u00dc' || c10 == 'x') {
                field = h7.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e5' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'Z' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00dc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = h7.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'E' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = h7.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "f\n~";
        objectArray[1] = Integer.TYPE;
        h7.jb[1] = "java/lang/Integer";
        objectArray[2] = "Se\u0004x,\nXj\u00157Q\u0012Km\u001c~";
        objectArray[3] = "`HU,:}kGDc[s`L@9";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "na}\u0001:%<p{h04_op\u0001 s3mg\u0013[v\"u9\u000b)p<|ph";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/h7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = h7.e(l10, l11);
            object = fb[n2];
            try {
                if (!(object instanceof String)) break block2;
                h7.fb[n2] = clazz = Class.forName(jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(h7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(h7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

