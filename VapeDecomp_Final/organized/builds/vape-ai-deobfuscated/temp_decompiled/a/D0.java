/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package a;

import a.D1;
import a.D6;
import a.D7;
import a.DH;
import a.DI;
import a.DK;
import a.DR;
import a.DT;
import a.DW;
import a.Do;
import a.Du;
import a.EI;
import a.EO;
import a.Eh;
import a.Hc;
import a.Na;
import a.QF;
import a.QS;
import a.QU;
import a.Ql;
import a.d8;
import a.eM;
import a.ht;
import a.kX;
import a.lh;
import a.oM;
import a.oN;
import a.oQ;
import a.oa;
import a.ok;
import a.on;
import a.oy;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class D0
extends Hc {
    private static final Map d;
    private static final long a;
    private static ht[] q;
    private static final Object[] e;
    private static final String[] h;
    private static final long[] b;
    private static final Integer[] c;

    public float T() {
        return D0.U.u().da.p(this.H);
    }

    public DI d(DK dK) {
        return new DI(D0.U.u().da.S(this.H, dK.M()));
    }

    public void u(float f10) {
        D0.U.u().da.R(this.H, f10);
    }

    public DI z(int n2, int n3) {
        return new DI(lh.A(D0.U.u().da, this.H, n2, n3));
    }

    private List Z() {
        Iterable iterable = D0.U.u().da.P(this.H);
        ArrayList arrayList = new ArrayList();
        for (Object t10 : iterable) {
            try {
                if (!eM.UQ.isInstance(t10)) continue;
                arrayList.add(t10);
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw D0.a(unsupportedOperationException);
            }
        }
        return arrayList;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = D0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = D0.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean b(QF qF2, oQ oQ2, BiPredicate biPredicate) {
        return D0.U.u().da.o(this.H, qF2.M(), oQ2.M(), biPredicate);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = D0.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                D0.e[n2] = clazz = Class.forName(h[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = D0.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public int O() {
        try {
            if (Na.MC_1_21_4.H()) {
                return lh.w(D0.U.u().da, this.H);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        return 0;
    }

    public D0(Object object) {
        super(object);
    }

    public int Q(int n2, int n3, int n4) {
        return lh.b(D0.U.u().da, this.H, n2, n3, n4);
    }

    public ok g(D1 d1) {
        long l10 = a ^ 0x66A9692D93DL;
        try {
            if (Na.MC_1_20_6.H()) {
                return new ok(D0.U.u().da.G(this.H, d1.M()));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        throw new UnsupportedOperationException((String)((Object)D0.b("p", (int)D0.a("k", (int)10079, (long)(0x400EAAD1DF5D0E0BL ^ l10)), (long)-4372881413602495395L, (long)l10)));
    }

    private static boolean lambda$getEntitiesWithinAABBExcludingEntity$1(Object object) {
        return true;
    }

    public boolean b(QF qF2, oQ oQ2) {
        try {
            if (Na.MC_1_21_4.H()) {
                return lh.H(D0.U.u().da, this.H, qF2.M(), oQ2.M());
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        return false;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (h[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 5;
                break;
            }
            case 1: {
                n4 = 14;
                break;
            }
            case 2: {
                n4 = 62;
                break;
            }
            case 3: {
                n4 = 44;
                break;
            }
            case 4: {
                n4 = 11;
                break;
            }
            case 5: {
                n4 = 24;
                break;
            }
            case 6: {
                n4 = 60;
                break;
            }
            case 7: {
                n4 = 46;
                break;
            }
            case 8: {
                n4 = 13;
                break;
            }
            case 9: {
                n4 = 1;
                break;
            }
            case 10: {
                n4 = 20;
                break;
            }
            case 11: {
                n4 = 0;
                break;
            }
            case 12: {
                n4 = 37;
                break;
            }
            case 13: {
                n4 = 59;
                break;
            }
            case 14: {
                n4 = 8;
                break;
            }
            case 15: {
                n4 = 6;
                break;
            }
            case 16: {
                n4 = 58;
                break;
            }
            case 17: {
                n4 = 30;
                break;
            }
            case 18: {
                n4 = 31;
                break;
            }
            case 19: {
                n4 = 4;
                break;
            }
            case 20: {
                n4 = 55;
                break;
            }
            case 21: {
                n4 = 7;
                break;
            }
            case 22: {
                n4 = 21;
                break;
            }
            case 23: {
                n4 = 39;
                break;
            }
            case 24: {
                n4 = 3;
                break;
            }
            case 25: {
                n4 = 61;
                break;
            }
            case 26: {
                n4 = 23;
                break;
            }
            case 27: {
                n4 = 54;
                break;
            }
            case 28: {
                n4 = 25;
                break;
            }
            case 29: {
                n4 = 16;
                break;
            }
            case 30: {
                n4 = 50;
                break;
            }
            case 31: {
                n4 = 45;
                break;
            }
            case 32: {
                n4 = 34;
                break;
            }
            case 33: {
                n4 = 28;
                break;
            }
            case 34: {
                n4 = 56;
                break;
            }
            case 35: {
                n4 = 2;
                break;
            }
            case 36: {
                n4 = 40;
                break;
            }
            case 37: {
                n4 = 52;
                break;
            }
            case 38: {
                n4 = 36;
                break;
            }
            case 39: {
                n4 = 27;
                break;
            }
            case 40: {
                n4 = 42;
                break;
            }
            case 41: {
                n4 = 18;
                break;
            }
            case 42: {
                n4 = 53;
                break;
            }
            case 43: {
                n4 = 12;
                break;
            }
            case 44: {
                n4 = 47;
                break;
            }
            case 45: {
                n4 = 32;
                break;
            }
            case 46: {
                n4 = 17;
                break;
            }
            case 47: {
                n4 = 63;
                break;
            }
            case 48: {
                n4 = 49;
                break;
            }
            case 49: {
                n4 = 26;
                break;
            }
            case 50: {
                n4 = 29;
                break;
            }
            case 51: {
                n4 = 48;
                break;
            }
            case 52: {
                n4 = 51;
                break;
            }
            case 53: {
                n4 = 9;
                break;
            }
            case 54: {
                n4 = 22;
                break;
            }
            case 55: {
                n4 = 35;
                break;
            }
            case 56: {
                n4 = 57;
                break;
            }
            case 57: {
                n4 = 19;
                break;
            }
            case 58: {
                n4 = 43;
                break;
            }
            case 59: {
                n4 = 15;
                break;
            }
            case 60: {
                n4 = 33;
                break;
            }
            case 61: {
                n4 = 10;
                break;
            }
            case 62: {
                n4 = 38;
                break;
            }
            default: {
                n4 = 41;
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
        D0.h[n5] = new String(cArray);
        return n5;
    }

    public boolean k(int n2, int n3, int n4, int n5, int n6, int n7) {
        try {
            if (Na.MC_1_7_10.J()) {
                return lh.a(D0.U.u().da, this.H, n2, n3, n4, n5, n6, n7);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        return lh.R(D0.U.u().da, this.H, DK.t(n2, n3, n4), DK.t(n5, n6, n7));
    }

    public void P(int n2, int n3, int n4, int n5, int n6, int n7) {
        lh.C(D0.U.u().da, this.H, n2, n3, n4, n5, n6, n7);
    }

    public List P(QF qF2, oQ oQ2, Object object) {
        return D0.U.u().da.C(this.H, qF2.M(), oQ2.M(), object);
    }

    public Eh R(double d2, double d3, double d4) {
        try {
            if (Na.MC_1_7_10.J()) {
                return new Eh(D0.U.u().da.B(this.H, (int)d2, (int)d3, (int)d4));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        DK dK = DK.L(d2, d3, d4);
        EI eI2 = new EI(D0.U.u().da.U(this.H, dK.M()));
        return eI2.I();
    }

    private static Field g(long l10, long l11) {
        int n2 = D0.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = h[n2];
            int n3 = string.indexOf(8);
            Class clazz = D0.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = D0.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = D0.c(clazz3, string2, clazz2)) != null) {
                    D0.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = D0.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        D0.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = D0.f(260543135791918L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(7620867056449796927L, -4970581235519416804L, MethodHandles.lookup().lookupClass()).a(185311956165913L);
        e = new Object[5];
        h = new String[5];
        D0.b();
        d = new HashMap(13);
        D0.V(null);
        long l10 = a ^ 0x721D74A58688L;
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
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "\u001e\u00f9\u0091(?\u00c3\u00b1\u00bai]+\u00b2\u00f9C\u0012O";
        int n3 = "\u001e\u00f9\u0091(?\u00c3\u00b1\u00bai]+\u00b2\u00f9C\u0012O".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        b = lArray;
        c = new Integer[2];
    }

    public boolean O(oQ oQ2, EO eO2) {
        return D0.U.u().da.e(this.M(), oQ2.M(), eO2.M());
    }

    public DI n(int n2, int n3) {
        try {
            if (Na.MC_1_7_10.C()) {
                return this.d(DK.t(n2, 0, n3));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        return new DI(D0.U.u().da.q(this.H, n2, n3));
    }

    public List L() {
        try {
            if (Na.MC_1_16_5.H()) {
                return this.w();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        return D0.U.u().da.k(this.H);
    }

    public void d(QF qF2) {
        try {
            if (kX.C() >= 37) {
                qF2.m();
                lh.l(D0.U.u().da, this.H, qF2.X(), QS.y().M());
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        try {
            if (Na.MC_1_16_5.H()) {
                qF2.m();
                lh.t(D0.U.u().da, this.H, qF2.M());
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        lh.t(D0.U.u().da, this.H, qF2.M());
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = D0.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = D0.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static boolean lambda$getEntitiesWithinAABBExcludingEntity$0(Object object) {
        return true;
    }

    public Object r() {
        return D0.U.u().da.q(this.H);
    }

    public void U(float f10) {
        D0.U.u().da.j(this.H, f10);
    }

    @Override
    public List M() {
        try {
            if (Na.MC_1_16_5.H()) {
                return this.Z();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        return D0.U.u().da.E(this.H);
    }

    public static void V(ht[] htArray) {
        q = htArray;
    }

    public boolean p(int n2, int n3, int n4) {
        return lh.i(D0.U.u().da, this.H, n2, n3, n4);
    }

    public D6 G() {
        return new D6(D0.U.u().da.p(this.H));
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/D0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private List w() {
        Iterable iterable = D0.U.u().da.P(this.H);
        ArrayList arrayList = new ArrayList();
        for (Object t10 : iterable) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    public oM K(DK dK) {
        return new oM(D0.U.u().da.K(this.H, dK.M()));
    }

    public QF I(int n2) {
        return new QF(lh.w(D0.U.u().da, this.H, n2));
    }

    public Ql G() {
        long l10 = a ^ 0x1A04E5103292L;
        try {
            if (Na.MC_1_21_4.H()) {
                return new Ql(D0.U.u().da.i(this.H));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        throw new UnsupportedOperationException((String)((Object)D0.b("p", (int)D0.a("k", (int)4225, (long)(0x3F65DD2C6AEAD27BL ^ l10)), (long)2954216132691779570L, (long)l10)));
    }

    private static Method h(long l10, long l11) {
        int n2 = D0.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n2];
                int n4 = string2.indexOf(8);
                clazz3 = D0.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = D0.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = D0.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        D0.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = D0.f(260543135791918L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = D0.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        D0.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = D0.f(260543135791918L, 0L);
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

    public Du X(DK dK) {
        return new Du(D0.U.u().da.q(this.H, dK.M()));
    }

    public DW B() {
        try {
            if (Na.MC_1_16_5.H()) {
                return null;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        return new DW(D0.U.u().da.k(this.H));
    }

    public boolean s() {
        return lh.g(D0.U.u().da, this.H);
    }

    public boolean P(DK dK) {
        try {
            if (kX.C() >= 37) {
                return D0.U.u().da.q(this.H, dK.o() >> 4, dK.j() >> 4);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        return D0.U.u().da.x(this.H, dK.M());
    }

    public QU V(DK dK) {
        return new QU(D0.U.u().da.g(this.H, dK.M()));
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'S' || c10 == '\u00db' || c10 == 'I' || c10 == '\u00aa') {
                field = D0.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'S' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00db' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = D0.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6A04;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/D0", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            D0.c[n3] = n4;
        }
        return c[n3];
    }

    private static void b() {
        Object[] objectArray = e;
        e[0] = "[h3";
        objectArray[1] = Integer.TYPE;
        D0.h[1] = "java/lang/Integer";
        objectArray[2] = "CC}I\u000eWHLl\u0006sO[KeO";
        objectArray[3] = "e6/JIsn9>\u0005(}e2:_";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "]U0+\u0000f\u001d^4\u0014\ntmV!tZv\u0007\u0010~~a6\u0000Ru*\u001b5UB~\u0014";
    }

    public float Z() {
        return D0.U.u().da.X(this.H);
    }

    public static ht[] V() {
        return q;
    }

    public on g(DT dT, DT dT2, boolean bl2, boolean bl3, boolean bl4, QF qF2) {
        block8: {
            oy oy2;
            oN oN2;
            block10: {
                block9: {
                    try {
                        try {
                            if (!Na.MC_1_16_5.H()) break block8;
                            if (!bl3) break block9;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw D0.a(unsupportedOperationException);
                        }
                        oN2 = oN.m();
                        break block10;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw D0.a(unsupportedOperationException);
                    }
                }
                try {
                    oN2 = bl4 ? oN.i() : oN.k();
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw D0.a(unsupportedOperationException);
                }
            }
            oN oN3 = oN2;
            try {
                oy2 = bl2 ? oy.W() : oy.a();
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw D0.a(unsupportedOperationException);
            }
            oy oy3 = oy2;
            oa oa2 = oa.T(dT, dT2, oN3, oy3, qF2);
            return new on(D0.U.u().da.M(this.H, oa2.M()));
        }
        return new on(D0.U.u().da.h(this.H, dT.M(), dT2.M(), bl2, bl3, bl4));
    }

    public List R(QF qF2, oQ oQ2) {
        if (Na.MC_1_20_6.H()) {
            Predicate<Object> predicate = D0::lambda$getEntitiesWithinAABBExcludingEntity$0;
            return D0.U.u().da.Y(this.H, qF2.M(), oQ2.M(), predicate);
        }
        if (Na.MC_1_16_5.H()) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            lh lh2;
            com.google.common.base.Predicate predicate = D0::lambda$getEntitiesWithinAABBExcludingEntity$1;
            try {
                lh2 = D0.U.u().da;
                object4 = this.H;
                object3 = qF2.M();
                object2 = oQ2.M();
                object = kX.C() >= 37 ? predicate : null;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw D0.a(unsupportedOperationException);
            }
            return lh2.Y(object4, object3, object2, object);
        }
        if (Na.MC_1_12_2.H()) {
            Object object;
            Object object5;
            Object object6;
            Object object7;
            lh lh3;
            com.google.common.base.Predicate predicate = D0::lambda$getEntitiesWithinAABBExcludingEntity$2;
            try {
                lh3 = D0.U.u().da;
                object7 = this.H;
                object6 = qF2.M();
                object5 = oQ2.M();
                object = kX.C() >= 37 ? predicate : null;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                throw D0.a(unsupportedOperationException);
            }
            return lh3.Y(object7, object6, object5, object);
        }
        return D0.U.u().da.l(this.H, qF2.M(), oQ2.M());
    }

    public void j(float f10) {
        D0.U.u().da.T(this.H, f10);
    }

    public Eh N(int n2, int n3, int n4) {
        try {
            if (Na.MC_1_7_10.J()) {
                return new Eh(D0.U.u().da.B(this.H, n2, n3, n4));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        DK dK = DK.t(n2, n3, n4);
        EI eI2 = new EI(D0.U.u().da.U(this.H, dK.M()));
        return eI2.I();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    public List v() {
        if (kX.C() >= 37) {
            ArrayList arrayList = new ArrayList();
            ArrayList<DI> arrayList2 = new ArrayList<DI>();
            AtomicReferenceArray atomicReferenceArray = this.d().T().p();
            int n2 = 0;
            while (n2 < atomicReferenceArray.length()) {
                Iterator iterator = atomicReferenceArray.get(n2++);
                try {
                    if (iterator == null) continue;
                    arrayList2.add(new DI(iterator));
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw D0.a(unsupportedOperationException);
                }
            }
            for (DI dI : arrayList2) {
                arrayList.addAll(dI.R().values());
            }
            return arrayList;
        }
        return D0.U.u().da.S(this.H);
    }

    public void h(long l10) {
        try {
            if (Na.MC_1_16_5.Q()) {
                return;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        D0.U.u().da.Y(this.H, l10);
    }

    public EI T(DK dK) {
        return new EI(D0.U.u().da.U(this.H, dK.M()));
    }

    private static boolean lambda$getEntitiesWithinAABBExcludingEntity$2(Object object) {
        return true;
    }

    public DH g() {
        return new DH(lh.s(D0.U.u().da, this.H));
    }

    public List v(QF qF2, oQ oQ2) {
        ArrayList<oQ> arrayList = new ArrayList<oQ>();
        if (Na.MC_1_20_6.H()) {
            Iterable iterable = (Iterable)D0.U.u().da.n(this.H, qF2.M(), oQ2.M());
            for (Object t10 : iterable) {
                DR dR = new DR(t10);
                arrayList.add(new oQ(dR.y().M()));
            }
            return arrayList;
        }
        if (Na.MC_1_16_5.H()) {
            Stream stream = (Stream)D0.U.u().da.n(this.H, qF2.M(), oQ2.M());
            for (Object object : stream.toArray()) {
                DR dR = new DR(object);
                arrayList.add(new oQ(dR.y().M()));
            }
            return arrayList;
        }
        return (List)D0.U.u().da.n(this.H, qF2.M(), oQ2.M());
    }

    public D7 d() {
        Object object = D0.U.u().da.G(this.H);
        try {
            if (eM.VY.equals(object.getClass())) {
                return new D7(object);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw D0.a(unsupportedOperationException);
        }
        return null;
    }

    public float k() {
        return D0.U.u().da.e(this.H);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = D0.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public float a() {
        return D0.U.u().da.s(this.H);
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

    public Do N() {
        return new Do(D0.U.u().da.d(this.H));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/D0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void b(float f10) {
        D0.U.u().da.Z(this.H, f10);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(D0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(D0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

