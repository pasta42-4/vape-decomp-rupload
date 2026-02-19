/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ce;
import a.O_;
import a.bE;
import a.bM;
import a.be;
import a.d8;
import a.ht;
import a.wu;
import a.yG;
import a.yh;
import a.zM;
import a.z_;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class wg
extends yG {
    private static final Object[] lb;
    private static final Map fb;
    private static final long[] bb;
    private static final Integer[] eb;
    private yG _D;
    private static final String[] mb;
    private bM _A;
    private yh _9;
    private static final long ab;
    private final z_ _p;
    private final wu _g;
    private static String _j;
    private Ce _4;
    private boolean _k;

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

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public Ce J() {
        return this._4;
    }

    @Override
    public double b() {
        return Math.max(this._9.b() + 3.0, this._D.b());
    }

    public static String a() {
        return _j;
    }

    public boolean X() {
        return this._k;
    }

    private static Field k(long l10, long l11) {
        int n2 = wg.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = wg.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = wg.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wg.e(clazz3, string2, clazz2)) != null) {
                    wg.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = wg.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        wg.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wg.j(227067387467864L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public yG E() {
        return this._D;
    }

    public wg(z_ z_2, wu wu2, boolean bl2) {
        block9: {
            ht ht2;
            ht[] htArray;
            yh yh2;
            block11: {
                block10: {
                    long l10 = ab ^ 0x5A52C9E2244CL;
                    super(0.0, 0.0);
                    this._9 = new yh(100.0);
                    this._D = new yG(18.0, 16.0);
                    this.i(false);
                    this._g = wu2;
                    this._k = z_2 instanceof zM;
                    this._p = z_2;
                    this._A = new be(this, z_2.j(), (String)((Object)wg.d("S", (int)wg.c("q", (int)2875, (long)(0x861E6C16F88903EL ^ l10)), (long)1475523145503765654L, (long)l10)), 74.0, 0.75, wg.M.w, false);
                    this._9.d().f((String)((Object)wg.d("S", (int)wg.c("q", (int)5156, (long)(0xB52002FA0DB8F22L ^ l10)), (long)1475523145503765654L, (long)l10)));
                    this._9.i(false);
                    this.Y(wu2.w());
                    this.P(wu2.F());
                    this._4 = new Ce(z_2, 8.0, 8.0);
                    this._D.i(false);
                    if (this._k) {
                        wu2.Q(wg.M.Y);
                        wu2.t(true);
                        this._9.d().f((String)((Object)wg.d("S", (int)wg.c("q", (int)19792, (long)(0x3F319E9D6850D657L ^ l10)), (long)1475523145503765654L, (long)l10)));
                        this._D.o(new bE(3.0, 1.0), this._4);
                        this.o(this._9, this._D);
                    } else {
                        wu2.Q(wg.M.F);
                        this._D.o(new bE(6.0, 1.0), this._4);
                        this.o(this._D, this._9);
                    }
                    try {
                        try {
                            if (!bl2) break block9;
                            yh2 = this._9;
                            ht[] htArray2 = new ht[1];
                            ht[] htArray3 = htArray2;
                            htArray = htArray2;
                            int n2 = 0;
                            if (!this.X()) break block10;
                        }
                        catch (O_ o_2) {
                            throw wg.a(o_2);
                        }
                        ht2 = new bE(1.0, 8.0);
                        break block11;
                    }
                    catch (O_ o_3) {
                        throw wg.a(o_3);
                    }
                }
                ht2 = this._A;
            }
            htArray3[n2] = ht2;
            yh2.o(htArray);
        }
        try {
            this._9.n(wu2, new Object[0]);
            if (!wu2.d()) {
                this._D.N(false);
            }
        }
        catch (O_ o_4) {
            throw wg.a(o_4);
        }
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = wg.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void d(String string) {
        _j = string;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = wg.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
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
                n4 = 7;
                break;
            }
            case 1: {
                n4 = 9;
                break;
            }
            case 2: {
                n4 = 36;
                break;
            }
            case 3: {
                n4 = 48;
                break;
            }
            case 4: {
                n4 = 41;
                break;
            }
            case 5: {
                n4 = 2;
                break;
            }
            case 6: {
                n4 = 39;
                break;
            }
            case 7: {
                n4 = 6;
                break;
            }
            case 8: {
                n4 = 16;
                break;
            }
            case 9: {
                n4 = 24;
                break;
            }
            case 10: {
                n4 = 18;
                break;
            }
            case 11: {
                n4 = 59;
                break;
            }
            case 12: {
                n4 = 40;
                break;
            }
            case 13: {
                n4 = 14;
                break;
            }
            case 14: {
                n4 = 61;
                break;
            }
            case 15: {
                n4 = 53;
                break;
            }
            case 16: {
                n4 = 42;
                break;
            }
            case 17: {
                n4 = 52;
                break;
            }
            case 18: {
                n4 = 51;
                break;
            }
            case 19: {
                n4 = 8;
                break;
            }
            case 20: {
                n4 = 26;
                break;
            }
            case 21: {
                n4 = 49;
                break;
            }
            case 22: {
                n4 = 63;
                break;
            }
            case 23: {
                n4 = 29;
                break;
            }
            case 24: {
                n4 = 21;
                break;
            }
            case 25: {
                n4 = 57;
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
                n4 = 22;
                break;
            }
            case 29: {
                n4 = 5;
                break;
            }
            case 30: {
                n4 = 34;
                break;
            }
            case 31: {
                n4 = 43;
                break;
            }
            case 32: {
                n4 = 31;
                break;
            }
            case 33: {
                n4 = 27;
                break;
            }
            case 34: {
                n4 = 47;
                break;
            }
            case 35: {
                n4 = 1;
                break;
            }
            case 36: {
                n4 = 28;
                break;
            }
            case 37: {
                n4 = 56;
                break;
            }
            case 38: {
                n4 = 0;
                break;
            }
            case 39: {
                n4 = 60;
                break;
            }
            case 40: {
                n4 = 45;
                break;
            }
            case 41: {
                n4 = 33;
                break;
            }
            case 42: {
                n4 = 30;
                break;
            }
            case 43: {
                n4 = 44;
                break;
            }
            case 44: {
                n4 = 25;
                break;
            }
            case 45: {
                n4 = 3;
                break;
            }
            case 46: {
                n4 = 19;
                break;
            }
            case 47: {
                n4 = 58;
                break;
            }
            case 48: {
                n4 = 37;
                break;
            }
            case 49: {
                n4 = 20;
                break;
            }
            case 50: {
                n4 = 50;
                break;
            }
            case 51: {
                n4 = 38;
                break;
            }
            case 52: {
                n4 = 32;
                break;
            }
            case 53: {
                n4 = 11;
                break;
            }
            case 54: {
                n4 = 62;
                break;
            }
            case 55: {
                n4 = 13;
                break;
            }
            case 56: {
                n4 = 17;
                break;
            }
            case 57: {
                n4 = 10;
                break;
            }
            case 58: {
                n4 = 4;
                break;
            }
            case 59: {
                n4 = 55;
                break;
            }
            case 60: {
                n4 = 12;
                break;
            }
            case 61: {
                n4 = 15;
                break;
            }
            case 62: {
                n4 = 46;
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
        wg.mb[n5] = new String(cArray);
        return n5;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = d8.a(-1422125024969766203L, 5554106141671377381L, MethodHandles.lookup().lookupClass()).a(179033344689323L);
        lb = new Object[5];
        mb = new String[5];
        wg.x();
        fb = new HashMap(13);
        wg.d(null);
        long l10 = ab ^ 0x1609CD97AB0L;
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
        String string = "\u00bf\u00d9\u0092\u00b5\u0017%\u0081\u0006\u00a1y0+q$\u0089c\u00ec\u00c1\u0096\u00fe1\u00b3or";
        int n3 = "\u00bf\u00d9\u0092\u00b5\u0017%\u0081\u0006\u00a1y0+q$\u0089c\u00ec\u00c1\u0096\u00fe1\u00b3or".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        bb = lArray;
        eb = new Integer[3];
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "F\u0019)";
        objectArray[1] = Integer.TYPE;
        wg.mb[1] = "java/lang/Integer";
        objectArray[2] = "\u001bdh\u0014\u0010-\u0010ky[m5\u0003lp\u0012";
        objectArray[3] = "@|'Z$^Ks6\u0015EP@x2O";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ";|\u0003ha*5w\bP{7Y\"Wjo1=p\u000e9mL`u\b>j!;zSh\u0010";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'z' || c10 == '\u00c3' || c10 == '\u00ed' || c10 == 'p') {
                field = wg.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wg.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'a' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'S' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public wg(z_ z_2, wu wu2) {
        this(z_2, wu2, true);
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = wg.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = wg.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method l(long l10, long l11) {
        int n2 = wg.i(l10, l11);
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
                clazz3 = wg.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = wg.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wg.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        wg.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wg.j(227067387467864L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = wg.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        wg.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wg.j(227067387467864L, 0L);
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

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = wg.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = wg.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public double w() {
        return this._9.w() + this._D.w();
    }

    @Override
    public void E() {
        double d2;
        yG yG2;
        try {
            super.E();
            yG2 = this._D;
            d2 = this._4.f() ? 18.0 : 6.0;
        }
        catch (O_ o_2) {
            throw wg.a(o_2);
        }
        yG2.Y(d2);
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = wg.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                wg.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0xF7C;
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
                throw new RuntimeException("a/wg", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wg.eb[n3] = n4;
        }
        return eb[n3];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wg.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(wg.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

