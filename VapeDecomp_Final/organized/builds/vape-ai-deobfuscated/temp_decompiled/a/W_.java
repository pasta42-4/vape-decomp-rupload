/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.B8;
import a.C_;
import a.F8;
import a.Gi;
import a.I_;
import a.JF;
import a.O_;
import a.SE;
import a.TE;
import a.TL;
import a.X_;
import a.Yr;
import a.bE;
import a.bM;
import a.d8;
import a.fB;
import a.fr;
import a.hr;
import a.hs;
import a.hy;
import a.vi;
import a.yG;
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

public class w_
extends yG {
    hr m5;
    yG mk;
    private boolean mD;
    private static final long[] bb;
    bE mc;
    private static final Object[] lb;
    private static final long ab;
    private bM mv;
    yG mR;
    private static final String[] mb;
    hs mP;
    private static final Map fb;
    private static final Integer[] eb;
    private final B8 mp;
    bE my;

    private static Field k(long l10, long l11) {
        int n2 = w_.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = w_.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = w_.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = w_.e(clazz3, string2, clazz2)) != null) {
                    w_.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = w_.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        w_.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = w_.j(267700923019691L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void T() {
        block7: {
            block9: {
                long l10;
                block8: {
                    l10 = ab ^ 0x5C888EABC625L;
                    try {
                        if (this.mD) {
                            return;
                        }
                    }
                    catch (O_ o_2) {
                        throw w_.a(o_2);
                    }
                    JF jF2 = SE.h.O().p().Q();
                    try {
                        try {
                            if (jF2 == null) break block7;
                            if (!jF2.R().equals(SE.h.O().n())) break block8;
                        }
                        catch (O_ o_3) {
                            throw w_.a(o_3);
                        }
                        this.r((String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)27182, (long)(0x3359532706D27A2BL ^ l10)), (long)573476358434761211L, (long)l10)));
                        break block9;
                    }
                    catch (O_ o_4) {
                        throw w_.a(o_4);
                    }
                }
                this.r((String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)28685, (long)(0x1ACB67CBB6F1E009L ^ l10)), (long)573476358434761211L, (long)l10)));
            }
            return;
        }
        this.mD = true;
        this.O();
    }

    private void lambda$acceptInvite$8(TL tL2) {
        block8: {
            long l10;
            block9: {
                block7: {
                    l10 = ab ^ 0x7B26F4851DDBL;
                    try {
                        if (tL2.w() != Yr.SUCCESSFULLY_ACCEPTED) break block7;
                        SE.h.O().p().H(this.mp);
                        break block8;
                    }
                    catch (O_ o_2) {
                        throw w_.a(o_2);
                    }
                }
                try {
                    if (tL2.w() != Yr.GROUP_FULL) break block9;
                    Gi.g(vi.ERROR, (String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)26830, (long)(0x4B9156181897A336L ^ l10)), (long)-2590904473170185723L, (long)l10)));
                    break block8;
                }
                catch (O_ o_3) {
                    throw w_.a(o_3);
                }
            }
            try {
                if (tL2.w() == Yr.FAILED) {
                    Gi.g(vi.ERROR, (String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)24459, (long)(0x2B504353AF9A1477L ^ l10)), (long)-2590904473170185723L, (long)l10)));
                }
            }
            catch (O_ o_4) {
                throw w_.a(o_4);
            }
        }
    }

    private void lambda$acceptInvite$9() {
        this.mD = false;
    }

    private void lambda$handleLeaveConfirmation$6(fB fB2) {
        Ao.z(fB2);
        I_.h().c().O(w_::lambda$null$4, this::lambda$null$5);
    }

    private void lambda$null$5() {
        this.O();
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "\u0004*\u001f";
        objectArray[1] = Integer.TYPE;
        w_.mb[1] = "java/lang/Integer";
        objectArray[2] = "h!Eriuc.T=\u0014mp)]t";
        objectArray[3] = "S8k\u001b\u0003\u0019X7zTb\u0017S<~\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "!a\u001cG82\"qT81vNk\u0015V0h\u007f,\u0011AZ47r\u0015\u0002&mwi\u00138";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (mb[n5] != null) {
            return n5;
        }
        Object object = lb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 30;
                break;
            }
            case 1: {
                n4 = 10;
                break;
            }
            case 2: {
                n4 = 42;
                break;
            }
            case 3: {
                n4 = 39;
                break;
            }
            case 4: {
                n4 = 14;
                break;
            }
            case 5: {
                n4 = 55;
                break;
            }
            case 6: {
                n4 = 15;
                break;
            }
            case 7: {
                n4 = 41;
                break;
            }
            case 8: {
                n4 = 2;
                break;
            }
            case 9: {
                n4 = 29;
                break;
            }
            case 10: {
                n4 = 13;
                break;
            }
            case 11: {
                n4 = 51;
                break;
            }
            case 12: {
                n4 = 48;
                break;
            }
            case 13: {
                n4 = 8;
                break;
            }
            case 14: {
                n4 = 23;
                break;
            }
            case 15: {
                n4 = 18;
                break;
            }
            case 16: {
                n4 = 1;
                break;
            }
            case 17: {
                n4 = 11;
                break;
            }
            case 18: {
                n4 = 38;
                break;
            }
            case 19: {
                n4 = 36;
                break;
            }
            case 20: {
                n4 = 31;
                break;
            }
            case 21: {
                n4 = 16;
                break;
            }
            case 22: {
                n4 = 19;
                break;
            }
            case 23: {
                n4 = 22;
                break;
            }
            case 24: {
                n4 = 52;
                break;
            }
            case 25: {
                n4 = 37;
                break;
            }
            case 26: {
                n4 = 58;
                break;
            }
            case 27: {
                n4 = 20;
                break;
            }
            case 28: {
                n4 = 57;
                break;
            }
            case 29: {
                n4 = 17;
                break;
            }
            case 30: {
                n4 = 27;
                break;
            }
            case 31: {
                n4 = 26;
                break;
            }
            case 32: {
                n4 = 45;
                break;
            }
            case 33: {
                n4 = 60;
                break;
            }
            case 34: {
                n4 = 43;
                break;
            }
            case 35: {
                n4 = 12;
                break;
            }
            case 36: {
                n4 = 49;
                break;
            }
            case 37: {
                n4 = 34;
                break;
            }
            case 38: {
                n4 = 24;
                break;
            }
            case 39: {
                n4 = 44;
                break;
            }
            case 40: {
                n4 = 9;
                break;
            }
            case 41: {
                n4 = 6;
                break;
            }
            case 42: {
                n4 = 4;
                break;
            }
            case 43: {
                n4 = 40;
                break;
            }
            case 44: {
                n4 = 61;
                break;
            }
            case 45: {
                n4 = 3;
                break;
            }
            case 46: {
                n4 = 62;
                break;
            }
            case 47: {
                n4 = 7;
                break;
            }
            case 48: {
                n4 = 63;
                break;
            }
            case 49: {
                n4 = 50;
                break;
            }
            case 50: {
                n4 = 5;
                break;
            }
            case 51: {
                n4 = 32;
                break;
            }
            case 52: {
                n4 = 21;
                break;
            }
            case 53: {
                n4 = 33;
                break;
            }
            case 54: {
                n4 = 53;
                break;
            }
            case 55: {
                n4 = 0;
                break;
            }
            case 56: {
                n4 = 46;
                break;
            }
            case 57: {
                n4 = 56;
                break;
            }
            case 58: {
                n4 = 47;
                break;
            }
            case 59: {
                n4 = 59;
                break;
            }
            case 60: {
                n4 = 54;
                break;
            }
            case 61: {
                n4 = 35;
                break;
            }
            case 62: {
                n4 = 28;
                break;
            }
            default: {
                n4 = 25;
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
        w_.mb[n5] = new String(cArray);
        return n5;
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$new$0() {
        this.T();
    }

    private void lambda$new$3(B8 b82) {
        try {
            if (this.mD) {
                return;
            }
        }
        catch (O_ o_2) {
            throw w_.a(o_2);
        }
        this.mD = true;
        I_.h().c().c(b82.k().s(), false, arg_0 -> w_.lambda$null$1(b82, arg_0), this::lambda$null$2);
    }

    public w_(B8 b82) {
        long l10 = ab ^ 0x5FDDE1338667L;
        super(100.0, 16.0);
        this.mR = new yG(18.0, 14.0);
        this.mk = new yG(14.0, 14.0);
        this.my = new bE(18.0, 16.0);
        this.mc = new bE(2.0, 16.0);
        this.m5 = new hr((String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)29469, (long)(0xE19DC05A252A355L ^ l10)), (long)5167712213046061497L, (long)l10)), 0.6, w_.M.Y, w_.M.u, 18.0, 8.0);
        this.mP = new hy((String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)4539, (long)(0x401D77A8707D41F0L ^ l10)), (long)5167712213046061497L, (long)l10)), 1.0, new Color(255, 255, 255, 0), new Color(255, 255, 255, 25), 8.0, 8.0);
        this.mD = false;
        this.mp = b82;
        this.mv = new bM(b82.k().j(), (String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)2294, (long)(0x114C7F8E391E58BAL ^ l10)), (long)5167712213046061497L, (long)l10)), 46.0, 0.8, w_.M.c, true);
        this.i(false);
        this.mR.i(false);
        this.mk.i(false);
        this.mR.d().J(true);
        this.mk.d().J(true);
        this.mP.g((String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)30303, (long)(0x183BE38EDB81A612L ^ l10)), (long)5167712213046061497L, (long)l10)));
        this.m5.N(this::lambda$new$0);
        this.mP.N(() -> this.lambda$new$3(b82));
        this.m5.q(false);
        this.m5.A(Color.WHITE);
        this.mR.o(this.m5);
        this.mk.o(this.mc, this.mP);
        this.o(this.my, this.mv, this.mR, this.mk);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = w_.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = w_.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void lambda$null$4(TE tE2) {
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = w_.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = w_.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                w_.ab = d8.a(8562745663992354856L, -4987390699385351212L, MethodHandles.lookup().lookupClass()).a(251876194103497L);
                w_.lb = new Object[5];
                w_.mb = new String[5];
                w_.x();
                w_.fb = new HashMap<K, V>(13);
                var0 = w_.ab ^ 27910807044032L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u00fcR\u00014<\u0096\u0086\u00b7 \u00df\u00cd\u008c)\u0007\u0002\u00f9\u008dx\u00d1m\u00a9\u00f4\u00c2\r\u00c7O^'\u008d\u0014fhT\u0018;\u00b0\u00ddbzd\u00c55\u00ec[\u00f1\u00beG\u00bbX\u00f6\u008f\u00b1\u0091\u0019\u001fs\u008f\u0098\u00fb2\u0016\u00ed\u0086\u0082r\u00b7\u00e3\u00ac\u0094\u008e\u00f2\u0096\u00c0i@\u0016FH\u00cf\u00d3.Z\u0088\u0097\u00e3yF\u0090";
                var7_6 = "\u00fcR\u00014<\u0096\u0086\u00b7 \u00df\u00cd\u008c)\u0007\u0002\u00f9\u008dx\u00d1m\u00a9\u00f4\u00c2\r\u00c7O^'\u008d\u0014fhT\u0018;\u00b0\u00ddbzd\u00c55\u00ec[\u00f1\u00beG\u00bbX\u00f6\u008f\u00b1\u0091\u0019\u001fs\u008f\u0098\u00fb2\u0016\u00ed\u0086\u0082r\u00b7\u00e3\u00ac\u0094\u008e\u00f2\u0096\u00c0i@\u0016FH\u00cf\u00d3.Z\u0088\u0097\u00e3yF\u0090".length();
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
                    var6_5 = "\u00c8\u009b\u001b\u00d3E\u00d1\u000f\u00c9\u00f3\u00d1P\u00b0j\u00c2\u00b3H";
                    var7_6 = "\u00c8\u009b\u001b\u00d3E\u00d1\u000f\u00c9\u00f3\u00d1P\u00b0j\u00c2\u00b3H".length();
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
        w_.bb = var8_3;
        w_.eb = new Integer[13];
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = w_.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                w_.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void O() {
        I_.h().c().c(this.mp.k().s(), true, this::lambda$acceptInvite$8, this::lambda$acceptInvite$9);
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static void lambda$null$1(B8 b82, TL tL2) {
        block6: {
            long l10;
            block5: {
                l10 = ab ^ 0x593628B41C58L;
                try {
                    if (tL2.w() != Yr.SUCCESSFULLY_DECLINED) break block5;
                    SE.h.O().p().H(b82);
                    break block6;
                }
                catch (O_ o_2) {
                    throw w_.a(o_2);
                }
            }
            try {
                if (tL2.w() == Yr.FAILED) {
                    Gi.g(vi.ERROR, (String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)18376, (long)(0x51335A0F91138DB9L ^ l10)), (long)-2483629594108136570L, (long)l10)));
                }
            }
            catch (O_ o_3) {
                throw w_.a(o_3);
            }
        }
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00d8' || c10 == '\u00e3' || c10 == '\u00d6' || c10 == '\u00ec') {
                field = w_.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00d8' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = w_.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00fa' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void r(String string) {
        long l10 = ab ^ 0x34D46388CA6BL;
        C_ c_2 = new C_(string, (String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)21692, (long)(0xE5E4D0B8BA048F5L ^ l10)), (long)845284650694059445L, (long)l10)), (String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)312, (long)(0x2901480E38471D7DL ^ l10)), (long)845284650694059445L, (long)l10)));
        fr fr2 = Ao.v(this.V(), c_2, fr.class);
        c_2.Z().N(() -> this.lambda$handleLeaveConfirmation$6(fr2));
        c_2.u().N(() -> this.lambda$handleLeaveConfirmation$7(fr2));
        fr2.r(this.V(), fr2);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = w_.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x17FA;
        if (eb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/w_", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            w_.eb[n3] = n4;
        }
        return eb[n3];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = w_.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private void lambda$null$2() {
        this.mD = false;
    }

    private static Method l(long l10, long l11) {
        int n2 = w_.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = w_.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = w_.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = w_.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        w_.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = w_.j(267700923019691L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = w_.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        w_.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = w_.j(267700923019691L, 0L);
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

    public B8 d() {
        return this.mp;
    }

    private void lambda$handleLeaveConfirmation$7(fB fB2) {
        Ao.z(fB2);
        this.mD = false;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void G() {
        long l10 = ab ^ 0x6951B431BDDBL;
        this.m5.q(false);
        F8.S(this.G(), this.W(), this.w(), this.b() - 2.0, w_.M.g.brighter());
        float f10 = (float)(this.G() + 6.0);
        float f11 = (float)(this.W() + 4.0);
        X_.B(w_.M.Y, f10, f11, (String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)31781, (long)(0x71235A391F7317D6L ^ l10)), (long)8938326312868434437L, (long)l10)), 7.0f, 6.3f, false);
        X_.B(w_.M.Y, (float)(this.G() + this.w() - 22.0), (float)this.W() - 0.5f, (String)((Object)w_.d("\u00c7", (int)w_.c("t", (int)15747, (long)(0x6705E840ABF25675L ^ l10)), (long)8938326312868434437L, (long)l10)), 14.5f, 14.5f, false);
        this.mv.M(this.W() + 5.0);
        this.mv.Y(this.w() - 18.0 - this.mP.w() - this.m5.w() - 4.0);
        this.mv.a(this.w() - 18.0 - this.mP.w() - this.m5.w() - 6.0);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(w_.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(w_.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

