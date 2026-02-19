/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Ib;
import a.O_;
import a.d8;
import a.eM;
import a.ht;
import a.v2;
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

public class lx
extends v2 {
    private Ib r;
    private static int q;
    private Ib A;
    private HK g;
    private static final Object[] e;
    private Ib i;
    private Ib H;
    private Ib E;
    private static final Integer[] c;
    private Ib p;
    private static final String[] f;
    private Ib m;
    private static final long a;
    private static final long[] b;
    private static final Map d;

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5246;
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
                throw new RuntimeException("a/lx", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lx.c[n3] = n4;
        }
        return c[n3];
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (f[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 9;
                break;
            }
            case 1: {
                n4 = 61;
                break;
            }
            case 2: {
                n4 = 40;
                break;
            }
            case 3: {
                n4 = 30;
                break;
            }
            case 4: {
                n4 = 13;
                break;
            }
            case 5: {
                n4 = 6;
                break;
            }
            case 6: {
                n4 = 27;
                break;
            }
            case 7: {
                n4 = 38;
                break;
            }
            case 8: {
                n4 = 10;
                break;
            }
            case 9: {
                n4 = 14;
                break;
            }
            case 10: {
                n4 = 33;
                break;
            }
            case 11: {
                n4 = 18;
                break;
            }
            case 12: {
                n4 = 54;
                break;
            }
            case 13: {
                n4 = 1;
                break;
            }
            case 14: {
                n4 = 21;
                break;
            }
            case 15: {
                n4 = 19;
                break;
            }
            case 16: {
                n4 = 15;
                break;
            }
            case 17: {
                n4 = 52;
                break;
            }
            case 18: {
                n4 = 43;
                break;
            }
            case 19: {
                n4 = 22;
                break;
            }
            case 20: {
                n4 = 20;
                break;
            }
            case 21: {
                n4 = 5;
                break;
            }
            case 22: {
                n4 = 28;
                break;
            }
            case 23: {
                n4 = 25;
                break;
            }
            case 24: {
                n4 = 59;
                break;
            }
            case 25: {
                n4 = 41;
                break;
            }
            case 26: {
                n4 = 51;
                break;
            }
            case 27: {
                n4 = 48;
                break;
            }
            case 28: {
                n4 = 62;
                break;
            }
            case 29: {
                n4 = 56;
                break;
            }
            case 30: {
                n4 = 37;
                break;
            }
            case 31: {
                n4 = 57;
                break;
            }
            case 32: {
                n4 = 39;
                break;
            }
            case 33: {
                n4 = 60;
                break;
            }
            case 34: {
                n4 = 31;
                break;
            }
            case 35: {
                n4 = 8;
                break;
            }
            case 36: {
                n4 = 58;
                break;
            }
            case 37: {
                n4 = 49;
                break;
            }
            case 38: {
                n4 = 2;
                break;
            }
            case 39: {
                n4 = 26;
                break;
            }
            case 40: {
                n4 = 53;
                break;
            }
            case 41: {
                n4 = 12;
                break;
            }
            case 42: {
                n4 = 45;
                break;
            }
            case 43: {
                n4 = 50;
                break;
            }
            case 44: {
                n4 = 35;
                break;
            }
            case 45: {
                n4 = 16;
                break;
            }
            case 46: {
                n4 = 63;
                break;
            }
            case 47: {
                n4 = 34;
                break;
            }
            case 48: {
                n4 = 32;
                break;
            }
            case 49: {
                n4 = 44;
                break;
            }
            case 50: {
                n4 = 0;
                break;
            }
            case 51: {
                n4 = 3;
                break;
            }
            case 52: {
                n4 = 46;
                break;
            }
            case 53: {
                n4 = 11;
                break;
            }
            case 54: {
                n4 = 23;
                break;
            }
            case 55: {
                n4 = 4;
                break;
            }
            case 56: {
                n4 = 42;
                break;
            }
            case 57: {
                n4 = 29;
                break;
            }
            case 58: {
                n4 = 24;
                break;
            }
            case 59: {
                n4 = 17;
                break;
            }
            case 60: {
                n4 = 55;
                break;
            }
            case 61: {
                n4 = 7;
                break;
            }
            case 62: {
                n4 = 47;
                break;
            }
            default: {
                n4 = 36;
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
        lx.f[n5] = new String(cArray);
        return n5;
    }

    public void n(Object object, boolean bl2) {
        this.p.B(object, bl2);
    }

    public lx() {
        long l10 = a ^ 0xC80873A14AAL;
        super(eM.Yf);
        this.i = lx.c("\u00c5", (Object)this, (Object)lx.c("\u00ba", (int)lx.b("n", (int)23771, (long)(0x5DA995CDFCB505A6L ^ l10)), (long)-8412849554587327402L, (long)l10), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l10);
        this.E = lx.c("\u00c5", (Object)this, (Object)lx.c("\u00ba", (int)lx.b("n", (int)9443, (long)(0x122D22F415727D9AL ^ l10)), (long)-8412849554587327402L, (long)l10), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l10);
        this.m = lx.c("\u00c5", (Object)this, (Object)lx.c("\u00ba", (int)lx.b("n", (int)5522, (long)(0x72730671EDB0CCECL ^ l10)), (long)-8412849554587327402L, (long)l10), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l10);
        this.r = lx.c("\u00c5", (Object)this, (Object)lx.c("\u00ba", (int)lx.b("n", (int)17324, (long)(0x3B64ED7EFC6A9AD7L ^ l10)), (long)-8412849554587327402L, (long)l10), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l10);
        this.p = lx.c("\u00c5", (Object)this, (Object)lx.c("\u00ba", (int)lx.b("n", (int)25047, (long)(0x437CFDC9F7BF38AFL ^ l10)), (long)-8412849554587327402L, (long)l10), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l10);
        this.H = lx.c("\u00c5", (Object)this, (Object)lx.c("\u00ba", (int)lx.b("n", (int)30358, (long)(0x3B565CFD44A2FECL ^ l10)), (long)-8412849554587327402L, (long)l10), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l10);
        this.A = lx.c("\u00c5", (Object)this, (Object)lx.c("\u00ba", (int)lx.b("n", (int)27591, (long)(0x5AA99ECC3E3A32B8L ^ l10)), (long)-8412849554587327402L, (long)l10), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l10);
        this.g = lx.c("\u00c5", (Object)this, (Object)new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-8413205295783102142L, (long)l10);
        int n2 = lx.Z();
        try {
            if (n2 != 0) {
                ht.I(new String[4]);
            }
        }
        catch (O_ o_2) {
            throw lx.a(o_2);
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void g(Object object, boolean bl2) {
        this.A.B(object, bl2);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = lx.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = lx.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = lx.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public boolean g(Object object) {
        return this.r.R(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l10, long l11) {
        int n2 = lx.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = lx.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = lx.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = lx.c(clazz3, string2, clazz2)) != null) {
                    lx.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = lx.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        lx.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = lx.f(673095039401041L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public boolean B(Object object) {
        return this.p.R(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = lx.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method h(long l10, long l11) {
        int n2 = lx.e(l10, l11);
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
                String string2 = f[n2];
                int n4 = string2.indexOf(8);
                clazz3 = lx.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = lx.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = lx.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        lx.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = lx.f(673095039401041L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = lx.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        lx.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = lx.f(673095039401041L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'h' || c10 == 'W' || c10 == '\u00e2' || c10 == 'l') {
                field = lx.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'h' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = lx.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ba' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void P(int n2) {
        q = n2;
    }

    public boolean H(Object object) {
        return this.i.R(object);
    }

    public void e(Object object, boolean bl2) {
        this.H.B(object, bl2);
    }

    public boolean d(Object object) {
        return this.A.R(object);
    }

    public boolean k(Object object) {
        return this.E.R(object);
    }

    public static int Z() {
        return q;
    }

    public boolean C(Object object) {
        return this.H.R(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                lx.a = d8.a(4953157994642343910L, -5947763555024649582L, MethodHandles.lookup().lookupClass()).a(264815529278610L);
                lx.e = new Object[13];
                lx.f = new String[13];
                lx.a();
                lx.d = new HashMap<K, V>(13);
                lx.P(0);
                var0 = lx.a ^ 90705536071642L;
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
                var6_5 = "s\u00bax\u00ce\u00a6l\u0083\u0013\u00de\u00f5\u00ac\u00a8\u00dd\u00deR\u00ceC&&\u00c4\u00d6\u00d0\u0012\u008bx\r\u0001\n\u00df\u0005c\u00e0\u0002\u00d5\u0011\u007f\u0002\u00ec\u0004\u00ef";
                var7_6 = "s\u00bax\u00ce\u00a6l\u0083\u0013\u00de\u00f5\u00ac\u00a8\u00dd\u00deR\u00ceC&&\u00c4\u00d6\u00d0\u0012\u008bx\r\u0001\n\u00df\u0005c\u00e0\u0002\u00d5\u0011\u007f\u0002\u00ec\u0004\u00ef".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "L\u00d1\u008f\u00d4X\u009arS\u00b49Nc\u00ff\u0018'\u00c4";
                    var7_6 = "L\u00d1\u008f\u00d4X\u009arS\u00b49Nc\u00ff\u0018'\u00c4".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        lx.b = var8_3;
        lx.c = new Integer[7];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = lx.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = lx.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = lx.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                lx.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public boolean Q(Object object) {
        return this.m.R(object);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "G4^";
        objectArray[1] = Integer.TYPE;
        lx.f[1] = "java/lang/Integer";
        objectArray[2] = "SISK/\u0017XFB\u0004R\u000fKAKM";
        objectArray[3] = "\nzMV";
        objectArray[4] = Boolean.TYPE;
        lx.f[4] = "java/lang/Boolean";
        objectArray[5] = "Ap\u0013itfJ\u007f\u0002&\u0019fJb\u0016";
        objectArray[6] = "\u0012G!W";
        objectArray[7] = "\ff\u001fm\u0014\u000byF\u0014b\u0005D\u0014F\u0014\u007f\u0011Q";
        objectArray[8] = "5{8F";
        objectArray[9] = "6HzZaD=Gk\u0015\u0000J6LoO";
        objectArray[10] = "\u007foA<W\n&fSigjE2Bn\u001eJ\"m[,\u001d1\u007fp_m\u001aT{jNog\n5dR>\r_9nTW[\f7b\fg\u0000\b5l0";
        objectArray[11] = "%'b\u001c4\r9&*b0\u0013B$ \u00054\u0017<gr\u001d>h{o)\u001b \u000f$vk\u0018[";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "'\u000e\nPoA~\u0007\u0018\u0005_=\u001dW\u0012\u0001g\u0016l\tA[dz \u0013\t\u00078\u000bd\f\u0016K_";
    }

    public Object k(boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8) {
        return this.g.A(bl2, bl3, bl4, bl5, bl6, bl7, bl8);
    }

    public static int k() {
        int n2 = lx.Z();
        try {
            if (n2 == 0) {
                return 106;
            }
        }
        catch (O_ o_2) {
            throw lx.a(o_2);
        }
        return 0;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lx.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

