/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Bc;
import a.Bg;
import a.EE;
import a.EP;
import a.Hw;
import a.NF;
import a.OY;
import a.O_;
import a.Oq;
import a.QV;
import a.QZ;
import a.Qc;
import a.Qf;
import a.Qg;
import a.SE;
import a.V3;
import a.V4;
import a._Y;
import a.a;
import a.cp;
import a.d8;
import a.eM;
import a.jU;
import a.jX;
import a.kX;
import a.kZ;
import a.or;
import a.pJ;
import a.p_;
import a.xi;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class jl
extends xi
implements kZ {
    private int w;
    private ArrayList<Integer> T;
    private final int[] l;
    private Bg o;
    private final int[] b;
    private final jU P;
    private static final Map x;
    private final Bg A;
    boolean B;
    private final jU Z;
    private Bg N;
    private final Bg n;
    private final int[] r;
    private boolean Y;
    private static final long e;
    private final jX h;
    boolean O;
    private final int[] t;
    private boolean z;
    private static final Integer[] v;
    private final cp d;
    private static final Object[] F;
    private static final long[] m;
    private static final String[] G;
    private final jU j;
    private final jU V;
    private Bc X;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                jl.e = d8.a(3125455474308298043L, 7021223865263083444L, MethodHandles.lookup().lookupClass()).a(28761978465435L);
                jl.F = new Object[5];
                jl.G = new String[5];
                jl.a();
                jl.x = new HashMap<K, V>(13);
                var0 = jl.e ^ 108019828972386L;
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
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "?\u000fUU}\u0095\u0085\u00bd\u00fd\u00b0\u00c8qu\u00cf\u00f1\u0087H\u00a2\f7\u00df\u00fcH\u00cek\u00af\u0001R\u008arP\u0090\u0085\u00c77^\u0006\u00b8h5\u00ff\u00e7\u00e8\u007f}\u00d4^\u00c6\u0007\u0000\u00e0\u00da\u0098\u00c2N\u00f7\u008c@-f[\tLzT\u00c3\u00c0\u00fd\u0017\u00b6\u001cL\u00d5\u0083G\u00f2\u00b0\u00cc\u0011\u00a8ZF\u0086\u0082\u0002f\u008f~\f\u00e9]\u00a3\u00f6q#\u001a\u009c%\u00851\u00f5@\u00d5b\u00c1\u00d5SX\u00db?\u00f4\u00b0}\u00af'4\u00b1\u008a@\u001e\u00fc\u00db\u00ebE\u00bf\u00ab\u0094\u00d4w[j\u0012\u00a4\u008de^\u00c5\u00cf?\u009a\u00adZ\u00fd\u00ed";
                var7_6 = "?\u000fUU}\u0095\u0085\u00bd\u00fd\u00b0\u00c8qu\u00cf\u00f1\u0087H\u00a2\f7\u00df\u00fcH\u00cek\u00af\u0001R\u008arP\u0090\u0085\u00c77^\u0006\u00b8h5\u00ff\u00e7\u00e8\u007f}\u00d4^\u00c6\u0007\u0000\u00e0\u00da\u0098\u00c2N\u00f7\u008c@-f[\tLzT\u00c3\u00c0\u00fd\u0017\u00b6\u001cL\u00d5\u0083G\u00f2\u00b0\u00cc\u0011\u00a8ZF\u0086\u0082\u0002f\u008f~\f\u00e9]\u00a3\u00f6q#\u001a\u009c%\u00851\u00f5@\u00d5b\u00c1\u00d5SX\u00db?\u00f4\u00b0}\u00af'4\u00b1\u008a@\u001e\u00fc\u00db\u00ebE\u00bf\u00ab\u0094\u00d4w[j\u0012\u00a4\u008de^\u00c5\u00cf?\u009a\u00adZ\u00fd\u00ed".length();
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
                    var6_5 = "\u0011k\u0089^hyoo\u00854\u00ec\u00f3N\u00fag\u00a4";
                    var7_6 = "\u0011k\u0089^hyoo\u00854\u00ec\u00f3N\u00fag\u00a4".length();
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
        jl.m = var8_3;
        jl.v = new Integer[20];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = jl.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = jl.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = jl.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void G(EE eE2) {
        long l10 = e ^ 0x32249ADC6ECDL;
        QV qV2 = eE2.o();
        for (int i10 = 0; i10 < qV2.c(); ++i10) {
            V4 v42 = qV2.s(i10);
            try {
                try {
                    try {
                        if (v42.Y() || v42.toString().contains((CharSequence)((Object)jl.c("\u00fc", (int)jl.a("f", (int)12962, (long)(0x7992F2FBB944E138L ^ l10)), (long)-5546725145892232304L, (long)l10)))) continue;
                    }
                    catch (O_ o_2) {
                        throw jl.a(o_2);
                    }
                    if (this.d.b(v42, true)) {
                        continue;
                    }
                }
                catch (O_ o_3) {
                    throw jl.a(o_3);
                }
            }
            catch (O_ o_4) {
                throw jl.a(o_4);
            }
            try {
                try {
                    if (v42.C().B(eM.Fl) && this.o(v42)) {
                        continue;
                    }
                }
                catch (O_ o_5) {
                    throw jl.a(o_5);
                }
            }
            catch (O_ o_6) {
                throw jl.a(o_6);
            }
            this.T.add(i10);
        }
    }

    private boolean b() {
        long l10 = e ^ 0x410F2A094B71L;
        QZ qZ2 = EP.U().t();
        for (int i10 = 9; i10 <= 44; ++i10) {
            V4 v42 = qZ2.T(i10).y();
            try {
                try {
                    if (!v42.Y() && !v42.toString().contains((CharSequence)((Object)jl.c("\u00fc", (int)jl.a("f", (int)28377, (long)(0x89FC0CA8E8E18FCL ^ l10)), (long)-7585642914562652628L, (long)l10)))) continue;
                }
                catch (O_ o_2) {
                    throw jl.a(o_2);
                }
                return false;
            }
            catch (O_ o_3) {
                throw jl.a(o_3);
            }
        }
        return true;
    }

    private static void a() {
        Object[] objectArray = F;
        F[0] = "??B";
        objectArray[1] = Integer.TYPE;
        jl.G[1] = "java/lang/Integer";
        objectArray[2] = "zuu\u0019&pqzdV[hb}m\u001f";
        objectArray[3] = "61o\u0013\u0016B=>~\\wL65z\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "vj-y\u001f^$k3I\u001a\u001c\u0019j1;\u001c\u0003vtu;q^{z!#\u0012\t)kwI";
    }

    private boolean o(V4 v42) {
        block13: {
            try {
                if (!v42.C().r() || !v42.C().B(eM.Fl)) break block13;
            }
            catch (O_ o_2) {
                throw jl.a(o_2);
            }
            Qc qc2 = new Qc(v42.C().M());
            for (Object e10 : qc2.Q(v42)) {
                V3 v32 = new V3(e10);
                try {
                    block14: {
                        try {
                            try {
                                try {
                                    try {
                                        if (v32.n() == 19 || v32.n() == 7) break block14;
                                    }
                                    catch (O_ o_3) {
                                        throw jl.a(o_3);
                                    }
                                    if (v32.n() == 2) break block14;
                                }
                                catch (O_ o_4) {
                                    throw jl.a(o_4);
                                }
                                if (v32.n() == 18) break block14;
                            }
                            catch (O_ o_5) {
                                throw jl.a(o_5);
                            }
                            if (v32.n() != 15) continue;
                        }
                        catch (O_ o_6) {
                            throw jl.a(o_6);
                        }
                    }
                    return true;
                }
                catch (O_ o_7) {
                    throw jl.a(o_7);
                }
            }
        }
        return false;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (G[n5] != null) {
            return n5;
        }
        Object object = F[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 25;
                break;
            }
            case 1: {
                n4 = 45;
                break;
            }
            case 2: {
                n4 = 4;
                break;
            }
            case 3: {
                n4 = 47;
                break;
            }
            case 4: {
                n4 = 49;
                break;
            }
            case 5: {
                n4 = 26;
                break;
            }
            case 6: {
                n4 = 16;
                break;
            }
            case 7: {
                n4 = 50;
                break;
            }
            case 8: {
                n4 = 62;
                break;
            }
            case 9: {
                n4 = 51;
                break;
            }
            case 10: {
                n4 = 0;
                break;
            }
            case 11: {
                n4 = 40;
                break;
            }
            case 12: {
                n4 = 30;
                break;
            }
            case 13: {
                n4 = 32;
                break;
            }
            case 14: {
                n4 = 31;
                break;
            }
            case 15: {
                n4 = 15;
                break;
            }
            case 16: {
                n4 = 58;
                break;
            }
            case 17: {
                n4 = 33;
                break;
            }
            case 18: {
                n4 = 2;
                break;
            }
            case 19: {
                n4 = 59;
                break;
            }
            case 20: {
                n4 = 27;
                break;
            }
            case 21: {
                n4 = 48;
                break;
            }
            case 22: {
                n4 = 22;
                break;
            }
            case 23: {
                n4 = 54;
                break;
            }
            case 24: {
                n4 = 9;
                break;
            }
            case 25: {
                n4 = 20;
                break;
            }
            case 26: {
                n4 = 52;
                break;
            }
            case 27: {
                n4 = 55;
                break;
            }
            case 28: {
                n4 = 29;
                break;
            }
            case 29: {
                n4 = 11;
                break;
            }
            case 30: {
                n4 = 38;
                break;
            }
            case 31: {
                n4 = 60;
                break;
            }
            case 32: {
                n4 = 61;
                break;
            }
            case 33: {
                n4 = 6;
                break;
            }
            case 34: {
                n4 = 53;
                break;
            }
            case 35: {
                n4 = 43;
                break;
            }
            case 36: {
                n4 = 14;
                break;
            }
            case 37: {
                n4 = 44;
                break;
            }
            case 38: {
                n4 = 63;
                break;
            }
            case 39: {
                n4 = 28;
                break;
            }
            case 40: {
                n4 = 36;
                break;
            }
            case 41: {
                n4 = 13;
                break;
            }
            case 42: {
                n4 = 42;
                break;
            }
            case 43: {
                n4 = 18;
                break;
            }
            case 44: {
                n4 = 12;
                break;
            }
            case 45: {
                n4 = 37;
                break;
            }
            case 46: {
                n4 = 19;
                break;
            }
            case 47: {
                n4 = 39;
                break;
            }
            case 48: {
                n4 = 23;
                break;
            }
            case 49: {
                n4 = 57;
                break;
            }
            case 50: {
                n4 = 34;
                break;
            }
            case 51: {
                n4 = 8;
                break;
            }
            case 52: {
                n4 = 5;
                break;
            }
            case 53: {
                n4 = 41;
                break;
            }
            case 54: {
                n4 = 24;
                break;
            }
            case 55: {
                n4 = 7;
                break;
            }
            case 56: {
                n4 = 10;
                break;
            }
            case 57: {
                n4 = 3;
                break;
            }
            case 58: {
                n4 = 21;
                break;
            }
            case 59: {
                n4 = 1;
                break;
            }
            case 60: {
                n4 = 35;
                break;
            }
            case 61: {
                n4 = 56;
                break;
            }
            case 62: {
                n4 = 46;
                break;
            }
            default: {
                n4 = 17;
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
        jl.G[n5] = new String(cArray);
        return n5;
    }

    public jl() {
        long l10 = e ^ 0x6B4AE97D02C3L;
        super(a.cs((int)jl.a("f", (int)26824, (long)(0x2CD7BB690528D75BL ^ l10))), -208, Oq.k, a.cs((int)jl.a("f", (int)30321, (long)(0x57AA000EF9E349EFL ^ l10))));
        this.V = jU.R(this, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)1482, (long)(0x579A10129EE93A5FL ^ l10)), (long)-2375565582272786530L, (long)l10)), false, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)26869, (long)(0x15B019705D1D5763L ^ l10)), (long)-2375565582272786530L, (long)l10)));
        this.Z = jU.R(this, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)9865, (long)(0x31511540E9D79919L ^ l10)), (long)-2375565582272786530L, (long)l10)), false, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)28126, (long)(0x5880AD1E81DED247L ^ l10)), (long)-2375565582272786530L, (long)l10)));
        this.P = jU.R(this, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)22297, (long)(0x681073DEB99D6882L ^ l10)), (long)-2375565582272786530L, (long)l10)), false, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)13863, (long)(0x4D4957D165FC09B8L ^ l10)), (long)-2375565582272786530L, (long)l10)));
        this.j = jU.R(this, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)6918, (long)(0xDE347CD9260A49EL ^ l10)), (long)-2375565582272786530L, (long)l10)), false, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)32716, (long)(0x47D75447FF724050L ^ l10)), (long)-2375565582272786530L, (long)l10)));
        this.h = jX.y(this, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)3016, (long)(0x350F1E28AA2BB459L ^ l10)), (long)-2375565582272786530L, (long)l10)), (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)16860, (long)(0x79BEE64E3736FE5AL ^ l10)), (long)-2375565582272786530L, (long)l10)), "", 50.0, 150.0, 200.0, 300.0, 5.0);
        this.d = cp.o(this, (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)21650, (long)(0x116C36B9FC65EB00L ^ l10)), (long)-2375565582272786530L, (long)l10)), (String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)30767, (long)(0x7AB4EA5B2CECC7AAL ^ l10)), (long)-2375565582272786530L, (long)l10)), cp.g, Collections.emptyList());
        this.A = new Bg();
        this.O = false;
        this.B = false;
        this.w = -1;
        this.T = new ArrayList();
        this.X = new Bc(this);
        this.n = new Bg();
        this.Y = false;
        this.N = new Bg();
        this.o = new Bg();
        this.N(this.V, this.Z, this.P, this.j, this.h, this.d);
        if (kX.C() >= 35) {
            this.b = new int[]{633, 629, 625, 641, 645, 637};
            this.t = new int[]{623, 627, 631, 635, 639, 643};
            this.l = new int[]{622, 630, 626, 634, 638, 642};
            this.r = new int[]{624, 632, 628, 636, 640, 644};
        } else {
            this.b = new int[]{313, 309, 317, 305, 301};
            this.t = new int[]{311, 307, 315, 303, 299};
            this.l = new int[]{310, 306, 314, 302, 298};
            this.r = new int[]{312, 308, 316, 304, 300};
        }
    }

    private void g() {
        Qg qg2 = EP.U();
        try {
            if (qg2.Y()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw jl.a(o_2);
        }
        for (int i10 = 0; i10 < 45; ++i10) {
            V4 v42 = qg2.t().T(i10).y();
            try {
                try {
                    if (v42.Y() || v42.C().Y()) {
                        continue;
                    }
                }
                catch (O_ o_3) {
                    throw jl.a(o_3);
                }
            }
            catch (O_ o_4) {
                throw jl.a(o_4);
            }
            this.X.G(v42, -1);
        }
    }

    static int f(jl jl2, V4 v42) {
        return jl2.d(v42);
    }

    private boolean X(EE eE2) {
        boolean bl2;
        block15: {
            block14: {
                long l10 = e ^ 0x2DEEC7E1ADAEL;
                QV qV2 = eE2.o();
                String string = eE2.H();
                if (kX.C() >= 35) {
                    boolean bl3;
                    block12: {
                        block11: {
                            String string2 = or.I((String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)24761, (long)(0x9A10E728D39F050L ^ l10)), (long)8098893885543031027L, (long)l10)), new Object[0]).i().toLowerCase();
                            String string3 = or.I((String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)17693, (long)(0x68C97747EBE6D5F7L ^ l10)), (long)8098893885543031027L, (long)l10)), new Object[0]).i().toLowerCase();
                            try {
                                try {
                                    if (!string.equalsIgnoreCase(string2) && !string.equalsIgnoreCase(string3)) break block11;
                                }
                                catch (O_ o_2) {
                                    throw jl.a(o_2);
                                }
                                bl3 = true;
                                break block12;
                            }
                            catch (O_ o_3) {
                                throw jl.a(o_3);
                            }
                        }
                        bl3 = false;
                    }
                    return bl3;
                }
                String string4 = or.I((String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)4215, (long)(0x241F44598CE30080L ^ l10)), (long)8098893885543031027L, (long)l10)), new Object[0]).u().toLowerCase();
                String string5 = or.I((String)((Object)jl.c("\u00fc", (int)jl.a("f", (int)17148, (long)(0x42C5E1320DAC520CL ^ l10)), (long)8098893885543031027L, (long)l10)), new Object[0]).u().toLowerCase();
                try {
                    block13: {
                        try {
                            try {
                                if (!qV2.o() || string.equalsIgnoreCase(string4)) break block13;
                            }
                            catch (O_ o_4) {
                                throw jl.a(o_4);
                            }
                            if (!string.equalsIgnoreCase(string5)) break block14;
                        }
                        catch (O_ o_5) {
                            throw jl.a(o_5);
                        }
                    }
                    bl2 = true;
                    break block15;
                }
                catch (O_ o_6) {
                    throw jl.a(o_6);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = jl.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method d(long l10, long l11) {
        int n2 = jl.a(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = G[n2];
                int n4 = string2.indexOf(8);
                clazz3 = jl.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = jl.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = jl.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        jl.F[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = jl.b(280848268059839L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = jl.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        jl.F[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = jl.b(280848268059839L, 0L);
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

    @OY
    public void J(p_ p_2) {
        block55: {
            EE eE2;
            block54: {
                block53: {
                    block50: {
                        block51: {
                            block52: {
                                block49: {
                                    block48: {
                                        block47: {
                                            try {
                                                try {
                                                    if (!SE.h.U().Z(jl.class) && !SE.h.a().p()) break block47;
                                                }
                                                catch (O_ o_2) {
                                                    throw jl.a(o_2);
                                                }
                                                this.O = false;
                                                return;
                                            }
                                            catch (O_ o_3) {
                                                throw jl.a(o_3);
                                            }
                                        }
                                        try {
                                            try {
                                                if (!EP.X().Y() && EP.X().B(eM.P)) break block48;
                                            }
                                            catch (O_ o_4) {
                                                throw jl.a(o_4);
                                            }
                                            this.B();
                                            return;
                                        }
                                        catch (O_ o_5) {
                                            throw jl.a(o_5);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!EP.U().Y() && !EP.c().Y()) break block49;
                                        }
                                        catch (O_ o_6) {
                                            throw jl.a(o_6);
                                        }
                                        return;
                                    }
                                    catch (O_ o_7) {
                                        throw jl.a(o_7);
                                    }
                                }
                                try {
                                    if (_Y.g().r()) {
                                        return;
                                    }
                                }
                                catch (O_ o_8) {
                                    throw jl.a(o_8);
                                }
                                try {
                                    if (!this.N.m(150L)) {
                                        return;
                                    }
                                }
                                catch (O_ o_9) {
                                    throw jl.a(o_9);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (!this.B) break block50;
                                                if (!this.A.m(NF.H(this.h) + 200)) break block51;
                                            }
                                            catch (O_ o_10) {
                                                throw jl.a(o_10);
                                            }
                                            if (!this.n.m(NF.H(this.h) + 200)) break block51;
                                        }
                                        catch (O_ o_11) {
                                            throw jl.a(o_11);
                                        }
                                        if (!EP.X().r()) break block52;
                                    }
                                    catch (O_ o_12) {
                                        throw jl.a(o_12);
                                    }
                                    EP.U().E();
                                }
                                catch (O_ o_13) {
                                    throw jl.a(o_13);
                                }
                            }
                            this.B();
                        }
                        return;
                    }
                    eE2 = new EE(EP.X());
                    try {
                        try {
                            if (!this.V.s().booleanValue() || this.X(eE2)) break block53;
                        }
                        catch (O_ o_14) {
                            throw jl.a(o_14);
                        }
                        this.B();
                        return;
                    }
                    catch (O_ o_15) {
                        throw jl.a(o_15);
                    }
                }
                try {
                    try {
                        if (this.P.s().booleanValue() || !this.b()) break block54;
                    }
                    catch (O_ o_16) {
                        throw jl.a(o_16);
                    }
                    this.B = true;
                    this.A.m();
                    this.n.m();
                    this.O = false;
                    return;
                }
                catch (O_ o_17) {
                    throw jl.a(o_17);
                }
            }
            try {
                if (!this.Y) {
                    this.Z();
                    return;
                }
            }
            catch (O_ o_18) {
                throw jl.a(o_18);
            }
            if (!this.T.isEmpty()) {
                int n2 = this.T.get(0);
                int n3 = this.C(this.w, n2);
                try {
                    if (!this.A.m(NF.H(this.h) + n3) || !this.n.m(NF.H(this.h) + 100)) break block55;
                }
                catch (O_ o_19) {
                    throw jl.a(o_19);
                }
                this.O = true;
                this.w = n2;
                Qf qf2 = eE2.R().T(n2);
                try {
                    if (qf2.H()) {
                        this.z = true;
                        this.o.m();
                        EP.n().e(eE2.R().D(), n2, 0, 1, EP.U());
                        this.z = false;
                    }
                }
                catch (O_ o_20) {
                    throw jl.a(o_20);
                }
                this.A.m();
                this.T.remove(0);
            } else {
                try {
                    this.O = false;
                    if (!this.P.s().booleanValue()) {
                        this.B = true;
                        this.A.m();
                    }
                }
                catch (O_ o_21) {
                    throw jl.a(o_21);
                }
                this.w = -1;
            }
        }
    }

    private void B() {
        this.n.m();
        this.A.m();
        this.T.clear();
        this.B = false;
        this.w = -1;
        this.O = false;
        this.Y = false;
    }

    @OY
    public void Z(pJ pJ2) {
        block4: {
            block5: {
                try {
                    try {
                        if (this.z) break block4;
                        if (this.o.m(100L)) break block5;
                    }
                    catch (O_ o_2) {
                        throw jl.a(o_2);
                    }
                    pJ2.setCanceled(true);
                }
                catch (O_ o_3) {
                    throw jl.a(o_3);
                }
            }
            this.N.m();
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'Y' || c10 == '\u00ea' || c10 == '\u00fb' || c10 == '\u00c8') {
                field = jl.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00fb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = jl.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'E' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = jl.a(l10, l11);
            object = F[n2];
            try {
                if (!(object instanceof String)) break block2;
                jl.F[n2] = clazz = Class.forName(G[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int C(int n2, int n3) {
        int n4 = n3 % 9;
        int n5 = (n3 - n4) / 9;
        int n6 = n2 % 9;
        int n7 = (n2 - n6) / 9;
        double d2 = _Y.y(n4, n5, n6, n7);
        if (d2 < 3.0) {
            d2 = 0.0;
        }
        return (int)(d2 * 30.0);
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

    @Override
    public boolean I() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || !this.O) break block4;
                    }
                    catch (O_ o_2) {
                        throw jl.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw jl.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = jl.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = jl.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x609D;
        if (v[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = m[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])x.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    x.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/jl", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jl.v[n3] = n4;
        }
        return v[n3];
    }

    /*
     * Loose catch block
     */
    private void Z() {
        block24: {
            block28: {
                EE eE2;
                block25: {
                    this.n.m();
                    this.A.m();
                    this.T.clear();
                    this.X.u();
                    eE2 = new EE(EP.X());
                    if (!this.Z.s().booleanValue()) break block25;
                    QV qV2 = eE2.o();
                    for (int i10 = 0; i10 < qV2.c(); ++i10) {
                        block23: {
                            V4 v42;
                            block27: {
                                block26: {
                                    block22: {
                                        v42 = qV2.s(i10);
                                        if (v42.Y()) continue;
                                        try {
                                            if (this.d.b(v42, true)) {
                                                continue;
                                            }
                                            break block22;
                                            catch (Exception exception) {
                                                throw jl.a(exception);
                                            }
                                        }
                                        catch (Exception exception) {
                                            throw jl.a(exception);
                                        }
                                    }
                                    if (this.X.G(v42, i10)) continue;
                                    if (!v42.C().r()) continue;
                                    break block26;
                                    catch (Exception exception) {
                                        throw jl.a(exception);
                                    }
                                }
                                if (!v42.C().B(eM.Fl)) break block23;
                                break block27;
                                catch (Exception exception) {
                                    throw jl.a(exception);
                                }
                            }
                            try {
                                if (this.o(v42)) {
                                    continue;
                                }
                                break block23;
                                catch (Exception exception) {
                                    throw jl.a(exception);
                                }
                            }
                            catch (Exception exception) {
                                throw jl.a(exception);
                            }
                        }
                        this.T.add(i10);
                    }
                    break block28;
                }
                this.G(eE2);
            }
            try {
                if (this.Z.s().booleanValue()) {
                    this.g();
                    this.T.addAll(this.X.C());
                }
            }
            catch (Exception exception) {
                throw jl.a(exception);
            }
            try {
                if (!this.j.s().booleanValue() || !this.j.s().booleanValue()) break block24;
            }
            catch (Exception exception) {
                throw jl.a(exception);
            }
            Collections.shuffle(this.T);
            try {
                this.T.sort(new Hw(this.w));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.Y = true;
    }

    private static Field c(long l10, long l11) {
        int n2 = jl.a(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            String string = G[n2];
            int n3 = string.indexOf(8);
            Class clazz = jl.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = jl.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = jl.a(clazz3, string2, clazz2)) != null) {
                    jl.F[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = jl.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        jl.F[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = jl.b(280848268059839L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int d(V4 v42) {
        int n2 = v42.C().O();
        for (int n3 : this.b) {
            try {
                if (n2 != n3) continue;
                return 8;
            }
            catch (O_ o_2) {
                throw jl.a(o_2);
            }
        }
        for (int n3 : this.r) {
            try {
                if (n2 != n3) continue;
                return 7;
            }
            catch (O_ o_3) {
                throw jl.a(o_3);
            }
        }
        for (int n3 : this.t) {
            try {
                if (n2 != n3) continue;
                return 6;
            }
            catch (O_ o_4) {
                throw jl.a(o_4);
            }
        }
        for (int n3 : this.l) {
            try {
                if (n2 != n3) continue;
                return 5;
            }
            catch (O_ o_5) {
                throw jl.a(o_5);
            }
        }
        return -1;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(jl.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(jl.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

