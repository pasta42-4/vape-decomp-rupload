/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.Bg;
import a.EP;
import a.F8;
import a.K1;
import a.KE;
import a.OY;
import a.O_;
import a.QF;
import a.Qt;
import a.Qx;
import a.R5;
import a.RO;
import a.RP;
import a.RW;
import a.Ro;
import a.Rx;
import a.V4;
import a.Xu;
import a.Z3;
import a.ZB;
import a._Y;
import a.bE;
import a.bM;
import a.bk;
import a.bw;
import a.d8;
import a.eM;
import a.ht;
import a.on;
import a.pZ;
import a.pe;
import a.r;
import a.sM;
import a.wX;
import a.wr;
import a.yG;
import a.yh;
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class w9
extends wr
implements sM {
    private final R5 K6;
    private final Rx Ki;
    private final bE Kv;
    private static final long[] fb;
    private final yh K0;
    private static final long bb;
    private static final String[] rb;
    private final wX Kq;
    private static final Map mb;
    private final bw KH;
    private static final Object[] qb;
    private final Ro Kr;
    private final Bg KQ;
    private int K5;
    private final yh KE;
    private Qt KV;
    private final yh K1;
    private final yh Ks;
    private int K2;
    private final RO KW;
    private static String Km;
    private final RP KC;
    private final yG KO;
    private final yG KL;
    private final r KN;
    private static final int KB;
    private static final Integer[] lb;

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "It\u0016";
        objectArray[1] = Integer.TYPE;
        w9.rb[1] = "java/lang/Integer";
        objectArray[2] = "v`<-5M}o-bHUnh$+";
        objectArray[3] = "bd]\u001f\u0017XikLPvVb`H\n";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ":v\u0016\u007f\f=f(P\u000f\u001ey\u0000+Rh\u001cd?v\u0005q\f\u00029l\rf\bzi\"V4u";
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = w9.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = w9.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = w9.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = w9.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        bb = d8.a(2104800466920139098L, 4709424070447783384L, MethodHandles.lookup().lookupClass()).a(277664297856562L);
        qb = new Object[5];
        rb = new String[5];
        w9.T();
        mb = new HashMap(13);
        w9.s(null);
        long l10 = bb ^ 0x6B74DC8219B2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u00c5\u0018\u00c8\u0088\u0088\u00c7\u00a8\u00fa\u0085\u0091\u0090\u0002\u00a8\u009b\u0096)Z\u00d3\r\u0012\u0016N\u009c6";
        int n3 = "\u00c5\u0018\u00c8\u0088\u0088\u00c7\u00a8\u00fa\u0085\u0091\u0090\u0002\u00a8\u009b\u0096)Z\u00d3\r\u0012\u0016N\u009c6".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        fb = lArray;
        lb = new Integer[3];
        KB = (int)w9.c("r", (int)8292, (long)(l10 ^ 0x5488518F3F867F6BL));
    }

    @OY
    public void P(pZ pZ2) {
        block7: {
            try {
                if (!this.K()) {
                    this.d(null);
                    return;
                }
            }
            catch (O_ o_2) {
                throw w9.a(o_2);
            }
            QF qF2 = pZ2.getTarget();
            try {
                try {
                    if (!qF2.B(eM.Ut) || qF2.B(eM.PR)) break block7;
                }
                catch (O_ o_3) {
                    throw w9.a(o_3);
                }
                this.d(new Qt(qF2));
            }
            catch (O_ o_4) {
                throw w9.a(o_4);
            }
        }
    }

    private void X() {
        try {
            if (this.s() == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw w9.a(o_2);
        }
        this.Ki.Z((int)_Y.a(EP.U(), this.s()));
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void U() {
        this.E();
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Qt s() {
        Qt qt2;
        try {
            qt2 = this.E() ? EP.U() : this.KV;
        }
        catch (O_ o_2) {
            throw w9.a(o_2);
        }
        return qt2;
    }

    @OY
    public void i(KE kE2) {
        block19: {
            try {
                if (!this.K()) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw w9.a(o_2);
            }
            try {
                block18: {
                    try {
                        try {
                            if (this.s() == null || this.s().Y()) break block18;
                        }
                        catch (O_ o_3) {
                            throw w9.a(o_3);
                        }
                        if (!EP.U().Y()) break block19;
                    }
                    catch (O_ o_4) {
                        throw w9.a(o_4);
                    }
                }
                return;
            }
            catch (O_ o_5) {
                throw w9.a(o_5);
            }
        }
        try {
            if (EP.U().y(this.s()) > 6.0f) {
                return;
            }
        }
        catch (O_ o_6) {
            throw w9.a(o_6);
        }
        try {
            if (kE2.getEntity().M().equals(EP.U().M())) {
                this.K6.J();
                this.Kr.u();
            }
        }
        catch (O_ o_7) {
            throw w9.a(o_7);
        }
        try {
            if (kE2.getEntity().M().equals(this.s().M())) {
                this.K6.u();
                this.Kr.Y();
            }
        }
        catch (O_ o_8) {
            throw w9.a(o_8);
        }
    }

    private double L() {
        return this.W() + 2.0;
    }

    private boolean K() {
        boolean bl2;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Kq.F() || !EP.c().r()) break block4;
                    }
                    catch (O_ o_2) {
                        throw w9.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw w9.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = w9.m(l10, l11);
            object = qb[n2];
            try {
                if (!(object instanceof String)) break block2;
                w9.qb[n2] = clazz = Class.forName(rb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'f' || c10 == '\u00f8' || c10 == 'B' || c10 == 'M') {
                field = w9.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = w9.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'W' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void s(String string) {
        Km = string;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/w9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void m() {
        this.K6.N(this.Kq.v().N.s());
        this.KC.N(this.Kq.v().H.s());
        this.Kr.N(this.Kq.v().d.s());
        this.Ki.N(this.Kq.v().q.s());
        boolean bl2 = false;
        for (ht ht2 : this.Ks.A()) {
            if (!ht2.f()) continue;
            bl2 = true;
            break;
        }
        this.KL.N(bl2);
    }

    @OY
    public void p(pe pe2) {
        block14: {
            block13: {
                try {
                    if (!this.K()) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw w9.a(o_2);
                }
                try {
                    try {
                        if (this.s() != null && !this.s().Y()) break block13;
                    }
                    catch (O_ o_3) {
                        throw w9.a(o_3);
                    }
                    return;
                }
                catch (O_ o_4) {
                    throw w9.a(o_4);
                }
            }
            V4 v42 = pe2.getItemStack();
            try {
                try {
                    try {
                        if (!v42.r() || !eM.Fl.isInstance(v42.C().M())) break block14;
                    }
                    catch (O_ o_5) {
                        throw w9.a(o_5);
                    }
                    if (!Xu.d(v42)) break block14;
                }
                catch (O_ o_6) {
                    throw w9.a(o_6);
                }
                ++this.K2;
            }
            catch (O_ o_7) {
                throw w9.a(o_7);
            }
        }
    }

    @Override
    public void G() {
        this.y();
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (rb[n5] != null) {
            return n5;
        }
        Object object = qb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 1;
                break;
            }
            case 1: {
                n4 = 46;
                break;
            }
            case 2: {
                n4 = 53;
                break;
            }
            case 3: {
                n4 = 6;
                break;
            }
            case 4: {
                n4 = 43;
                break;
            }
            case 5: {
                n4 = 9;
                break;
            }
            case 6: {
                n4 = 47;
                break;
            }
            case 7: {
                n4 = 56;
                break;
            }
            case 8: {
                n4 = 4;
                break;
            }
            case 9: {
                n4 = 63;
                break;
            }
            case 10: {
                n4 = 40;
                break;
            }
            case 11: {
                n4 = 52;
                break;
            }
            case 12: {
                n4 = 19;
                break;
            }
            case 13: {
                n4 = 13;
                break;
            }
            case 14: {
                n4 = 27;
                break;
            }
            case 15: {
                n4 = 24;
                break;
            }
            case 16: {
                n4 = 17;
                break;
            }
            case 17: {
                n4 = 8;
                break;
            }
            case 18: {
                n4 = 37;
                break;
            }
            case 19: {
                n4 = 62;
                break;
            }
            case 20: {
                n4 = 7;
                break;
            }
            case 21: {
                n4 = 39;
                break;
            }
            case 22: {
                n4 = 48;
                break;
            }
            case 23: {
                n4 = 35;
                break;
            }
            case 24: {
                n4 = 23;
                break;
            }
            case 25: {
                n4 = 26;
                break;
            }
            case 26: {
                n4 = 5;
                break;
            }
            case 27: {
                n4 = 49;
                break;
            }
            case 28: {
                n4 = 29;
                break;
            }
            case 29: {
                n4 = 59;
                break;
            }
            case 30: {
                n4 = 54;
                break;
            }
            case 31: {
                n4 = 14;
                break;
            }
            case 32: {
                n4 = 41;
                break;
            }
            case 33: {
                n4 = 3;
                break;
            }
            case 34: {
                n4 = 50;
                break;
            }
            case 35: {
                n4 = 33;
                break;
            }
            case 36: {
                n4 = 58;
                break;
            }
            case 37: {
                n4 = 38;
                break;
            }
            case 38: {
                n4 = 10;
                break;
            }
            case 39: {
                n4 = 36;
                break;
            }
            case 40: {
                n4 = 15;
                break;
            }
            case 41: {
                n4 = 25;
                break;
            }
            case 42: {
                n4 = 44;
                break;
            }
            case 43: {
                n4 = 22;
                break;
            }
            case 44: {
                n4 = 11;
                break;
            }
            case 45: {
                n4 = 45;
                break;
            }
            case 46: {
                n4 = 31;
                break;
            }
            case 47: {
                n4 = 51;
                break;
            }
            case 48: {
                n4 = 30;
                break;
            }
            case 49: {
                n4 = 16;
                break;
            }
            case 50: {
                n4 = 32;
                break;
            }
            case 51: {
                n4 = 57;
                break;
            }
            case 52: {
                n4 = 12;
                break;
            }
            case 53: {
                n4 = 60;
                break;
            }
            case 54: {
                n4 = 42;
                break;
            }
            case 55: {
                n4 = 0;
                break;
            }
            case 56: {
                n4 = 18;
                break;
            }
            case 57: {
                n4 = 55;
                break;
            }
            case 58: {
                n4 = 2;
                break;
            }
            case 59: {
                n4 = 34;
                break;
            }
            case 60: {
                n4 = 28;
                break;
            }
            case 61: {
                n4 = 61;
                break;
            }
            case 62: {
                n4 = 21;
                break;
            }
            default: {
                n4 = 20;
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
        w9.rb[n5] = new String(cArray);
        return n5;
    }

    private void d(Qt qt2) {
        block10: {
            try {
                if (qt2 == null) {
                    this.l((Qt)null);
                    return;
                }
            }
            catch (O_ o_2) {
                throw w9.a(o_2);
            }
            try {
                try {
                    this.KE.N(true);
                    this.KQ.m();
                    if (this.s() == null || !this.s().equals(qt2)) break block10;
                }
                catch (O_ o_3) {
                    throw w9.a(o_3);
                }
                return;
            }
            catch (O_ o_4) {
                throw w9.a(o_4);
            }
        }
        int n2 = qt2.X();
        try {
            this.l(qt2);
            this.KW.J(qt2);
            if (n2 != this.K5) {
                this.K6.g(0);
                this.KC.Y(0);
                this.Kr.x(0);
            }
        }
        catch (O_ o_5) {
            throw w9.a(o_5);
        }
        this.K5 = n2;
        this.h(true);
    }

    public w9(wX wX2) {
        long l10 = bb ^ 0x2B3221974A10L;
        super(10.0, new yh(100.0));
        this.KQ = new Bg();
        this.KO = new yG(100.0, 10.0);
        this.K1 = new yh(100.0);
        this.K0 = new yh(90.0);
        this.Kv = new bE(12.0, 12.0);
        this.KH = new bk(this, 12.0, 12.0);
        this.KW = new RW(this, 100, 4);
        this.KN = new r(0, 0);
        this.KL = new yG(100.0, 14.0);
        this.Ks = new yh(100.0);
        this.Ki = new Rx();
        this.K6 = new R5();
        this.KC = new RP();
        this.Kr = new Ro();
        this.K5 = -1;
        this.Kq = wX2;
        this.KE = (yh)super.s();
        this.KE.n(new bE(1.0, 2.0), new Object[0]);
        this.KL.n(this.Ks, w9.e("W", (int)w9.c("r", (int)9313, (long)(0x24194453F1CFA8CFL ^ l10)), (long)-7636964867763433670L, (long)l10));
        this.KE.n(this.KL, new Object[0]);
        this.K0.n(this.Kv, new Object[0]);
        this.KO.n(this.KH, new Object[0]);
        this.KO.n(this.K0, new Object[0]);
        this.KE.o(this.KO);
        this.KE.n(new bE(100.0, 8.0), new Object[0]);
        this.K1.n(this.KW, new Object[0]);
        this.KE.o(this.K1);
        this.KE.i(false);
        this.KO.i(false);
        this.K0.i(false);
        this.K1.i(false);
        this.KL.i(false);
        this.K0.d().J(true);
        this.KO.d().J(true);
        this.Ks.i(false);
        this.Ks.n(this.K6, new Object[0]);
        this.Ks.n(this.KC, new Object[0]);
        this.Ks.n(this.Kr, new Object[0]);
        this.Ks.n(this.Ki, new Object[0]);
        Z3.s().A(this, new Predicate[0]);
    }

    static boolean b(w9 w92) {
        return w92.E();
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1AAA;
        if (lb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = fb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/w9", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            w9.lb[n3] = n4;
        }
        return lb[n3];
    }

    public void l(Qt qt2) {
        this.KV = qt2;
    }

    private static Method p(long l10, long l11) {
        int n2 = w9.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = w9.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = w9.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = w9.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        w9.qb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = w9.n(212421451394002L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = w9.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        w9.qb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = w9.n(212421451394002L, 0L);
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

    public static String x() {
        return Km;
    }

    private static Field o(long l10, long l11) {
        int n2 = w9.m(l10, l11);
        Object object = qb[n2];
        if (object instanceof String) {
            String string = rb[n2];
            int n3 = string.indexOf(8);
            Class clazz = w9.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = w9.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = w9.g(clazz3, string2, clazz2)) != null) {
                    w9.qb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = w9.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        w9.qb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = w9.n(212421451394002L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean E() {
        boolean bl2;
        try {
            bl2 = !Ao.K.P;
        }
        catch (O_ o_2) {
            throw w9.a(o_2);
        }
        return bl2;
    }

    @Override
    public void d() {
        block22: {
            on on2;
            block21: {
                try {
                    if (!this.K()) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw w9.a(o_2);
                }
                try {
                    try {
                        try {
                            try {
                                this.X();
                                this.m();
                                if (!this.KQ.m(1000L) || this.s() == null) break block21;
                            }
                            catch (O_ o_3) {
                                throw w9.a(o_3);
                            }
                            if (this.s().Y()) break block21;
                        }
                        catch (O_ o_4) {
                            throw w9.a(o_4);
                        }
                        if (!(this.s().e() <= 0.0f)) break block21;
                    }
                    catch (O_ o_5) {
                        throw w9.a(o_5);
                    }
                    this.d(null);
                }
                catch (O_ o_6) {
                    throw w9.a(o_6);
                }
            }
            try {
                if (this.KQ.m(3000L)) {
                    this.d(null);
                }
            }
            catch (O_ o_7) {
                throw w9.a(o_7);
            }
            if (this.Kq.v().C.s().booleanValue() && (on2 = EP.u()).r()) {
                QF qF2 = on2.l();
                try {
                    try {
                        try {
                            if (!qF2.r() || !qF2.B(eM.Ut)) break block22;
                        }
                        catch (O_ o_8) {
                            throw w9.a(o_8);
                        }
                        if (qF2.B(eM.PR)) break block22;
                    }
                    catch (O_ o_9) {
                        throw w9.a(o_9);
                    }
                    this.d(new Qt(qF2));
                }
                catch (O_ o_10) {
                    throw w9.a(o_10);
                }
            }
        }
    }

    private void y() {
        int n2;
        double d2;
        bM bM2;
        double d3;
        long l10;
        block17: {
            block16: {
                boolean bl2;
                yh yh2;
                block15: {
                    block14: {
                        l10 = bb ^ 0x66ECC0EFF57L;
                        try {
                            try {
                                yh2 = this.KE;
                                if (this.s() == null && !this.E()) break block14;
                            }
                            catch (O_ o_2) {
                                throw w9.a(o_2);
                            }
                            bl2 = true;
                            break block15;
                        }
                        catch (O_ o_3) {
                            throw w9.a(o_3);
                        }
                    }
                    bl2 = false;
                }
                try {
                    yh2.N(bl2);
                    if (!this.KE.f()) {
                        return;
                    }
                }
                catch (O_ o_4) {
                    throw w9.a(o_4);
                }
                try {
                    this.KH.N(this.s().B(eM.UQ));
                    if (!this.KL.f()) break block16;
                    this.U(5.0);
                    break block17;
                }
                catch (O_ o_5) {
                    throw w9.a(o_5);
                }
            }
            this.U(10.0);
        }
        this.h(true);
        this.KN.Z((int)this.w() * 2, (int)this.b() * 2);
        this.KN.q((int)this.G(), (int)this.L(), 20.0f, 3.0f);
        F8.o(this.G(), this.L(), this.w(), this.b(), new Color(18, 18, 18, 173), true, 3.0f, 1.0f);
        F8.U(this.G(), this.L(), this.w(), this.b(), new Color(48, 48, 48, 255), 3.0f, 1.0f, 1.0f);
        String string = this.W();
        String string2 = ZB.U(string);
        if (string2.isEmpty()) {
            string = "\u00a77(Empty Name)";
        }
        bM bM3 = new bM(string, (String)((Object)w9.e("W", (int)w9.c("r", (int)32151, (long)(0x339917AE795D447FL ^ l10)), (long)2540911683208690301L, (long)l10)), 80.0, 1.3, Color.WHITE, false);
        try {
            d3 = this.KH.f() ? this.KH.W() + this.KH.b() / 2.0 - bM3.K() / 2.0 : this.KO.W() + this.KO.b() / 2.0 - bM3.K() / 2.0;
        }
        catch (O_ o_6) {
            throw w9.a(o_6);
        }
        double d4 = d3;
        try {
            bM2 = bM3;
            d2 = this.Kv.G();
            n2 = this.KH.f() ? 5 : 2;
        }
        catch (O_ o_7) {
            throw w9.a(o_7);
        }
        bM2.y(d2 + (double)n2, d4);
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = w9.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = w9.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public String W() {
        try {
            if (this.s() == null) {
                return "";
            }
        }
        catch (O_ o_2) {
            throw w9.a(o_2);
        }
        return this.s().e();
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @OY
    public void y(K1 k12) {
        block22: {
            block21: {
                block20: {
                    block19: {
                        try {
                            if (!this.K()) {
                                return;
                            }
                        }
                        catch (O_ o_2) {
                            throw w9.a(o_2);
                        }
                        try {
                            block18: {
                                try {
                                    try {
                                        if (this.s() == null || this.s().Y()) break block18;
                                    }
                                    catch (O_ o_3) {
                                        throw w9.a(o_3);
                                    }
                                    if (!EP.U().Y()) break block19;
                                }
                                catch (O_ o_4) {
                                    throw w9.a(o_4);
                                }
                            }
                            return;
                        }
                        catch (O_ o_5) {
                            throw w9.a(o_5);
                        }
                    }
                    try {
                        if (!k12.getEntity().B(eM.F6)) {
                            return;
                        }
                    }
                    catch (O_ o_6) {
                        throw w9.a(o_6);
                    }
                    Qx qx2 = new Qx(k12.getEntity());
                    try {
                        try {
                            if (!qx2.a().Y() && Xu.d(qx2.a())) break block20;
                        }
                        catch (O_ o_7) {
                            throw w9.a(o_7);
                        }
                        return;
                    }
                    catch (O_ o_8) {
                        throw w9.a(o_8);
                    }
                }
                try {
                    if (this.K2 <= 0) break block21;
                    this.KC.D();
                    --this.K2;
                    break block22;
                }
                catch (O_ o_9) {
                    throw w9.a(o_9);
                }
            }
            this.KC.x();
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(w9.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(w9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

