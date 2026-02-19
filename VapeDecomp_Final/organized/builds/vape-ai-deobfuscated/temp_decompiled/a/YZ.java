/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.BZ;
import a.G4;
import a.OT;
import a.O_;
import a.Rt;
import a.SE;
import a.a2;
import a.d8;
import a.yG;
import a.yh;
import a.yo;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class yz
extends yh {
    private final BZ Kq;
    private static final Object[] ob;
    private final yo KY;
    private static final Integer[] lb;
    private static final long[] eb;
    private static final Map mb;
    private final yG K7;
    private static final long bb;
    private long Kk;
    private static final String[] pb;

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = yz.m(l10, l11);
            object = ob[n2];
            try {
                if (!(object instanceof String)) break block2;
                yz.ob[n2] = clazz = Class.forName(pb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        bb = d8.a(-7987294973217802020L, 4285475331146029199L, MethodHandles.lookup().lookupClass()).a(168391789449339L);
        ob = new Object[5];
        pb = new String[5];
        yz.D();
        mb = new HashMap(13);
        long l10 = bb ^ 0x6DAAC8EA41DDL;
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
        String string = "\u00d6\u00b4u<O\u000b\u0083)Yc\u00c7\u00817\u00b8\u008b\u0000";
        int n3 = "\u00d6\u00b4u<O\u000b\u0083)Yc\u00c7\u00817\u00b8\u008b\u0000".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        eb = lArray;
        lb = new Integer[2];
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5BA4;
        if (lb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = eb[n3];
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
                throw new RuntimeException("a/yz", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            yz.lb[n3] = n4;
        }
        return lb[n3];
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = yz.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = yz.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method p(long l10, long l11) {
        int n2 = yz.m(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = yz.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = yz.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yz.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        yz.ob[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yz.n(264069069400430L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = yz.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        yz.ob[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yz.n(264069069400430L, 0L);
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

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = yz.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = yz.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field o(long l10, long l11) {
        int n2 = yz.m(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            String string = pb[n2];
            int n3 = string.indexOf(8);
            Class clazz = yz.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = yz.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yz.g(clazz3, string2, clazz2)) != null) {
                    yz.ob[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = yz.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        yz.ob[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yz.n(264069069400430L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void D() {
        Object[] objectArray = ob;
        ob[0] = " \u0010~";
        objectArray[1] = Integer.TYPE;
        yz.pb[1] = "java/lang/Integer";
        objectArray[2] = "Yt\u007fB4YR{n\rIAA|gD";
        objectArray[3] = ",\u0017Oq=C'\u0018^>\\M,\u0013Zd";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "m.\u0004\nrmu4\u0004syt\u0004wA\u0002|s`.\u0000\u0001#\u000f=6\u0006\u0017-2:~FI\u0012";
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (pb[n5] != null) {
            return n5;
        }
        Object object = ob[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 43;
                break;
            }
            case 1: {
                n4 = 34;
                break;
            }
            case 2: {
                n4 = 50;
                break;
            }
            case 3: {
                n4 = 19;
                break;
            }
            case 4: {
                n4 = 48;
                break;
            }
            case 5: {
                n4 = 7;
                break;
            }
            case 6: {
                n4 = 28;
                break;
            }
            case 7: {
                n4 = 23;
                break;
            }
            case 8: {
                n4 = 5;
                break;
            }
            case 9: {
                n4 = 62;
                break;
            }
            case 10: {
                n4 = 36;
                break;
            }
            case 11: {
                n4 = 52;
                break;
            }
            case 12: {
                n4 = 14;
                break;
            }
            case 13: {
                n4 = 58;
                break;
            }
            case 14: {
                n4 = 11;
                break;
            }
            case 15: {
                n4 = 21;
                break;
            }
            case 16: {
                n4 = 41;
                break;
            }
            case 17: {
                n4 = 32;
                break;
            }
            case 18: {
                n4 = 55;
                break;
            }
            case 19: {
                n4 = 33;
                break;
            }
            case 20: {
                n4 = 31;
                break;
            }
            case 21: {
                n4 = 20;
                break;
            }
            case 22: {
                n4 = 18;
                break;
            }
            case 23: {
                n4 = 47;
                break;
            }
            case 24: {
                n4 = 17;
                break;
            }
            case 25: {
                n4 = 8;
                break;
            }
            case 26: {
                n4 = 16;
                break;
            }
            case 27: {
                n4 = 38;
                break;
            }
            case 28: {
                n4 = 57;
                break;
            }
            case 29: {
                n4 = 24;
                break;
            }
            case 30: {
                n4 = 12;
                break;
            }
            case 31: {
                n4 = 1;
                break;
            }
            case 32: {
                n4 = 0;
                break;
            }
            case 33: {
                n4 = 2;
                break;
            }
            case 34: {
                n4 = 4;
                break;
            }
            case 35: {
                n4 = 56;
                break;
            }
            case 36: {
                n4 = 9;
                break;
            }
            case 37: {
                n4 = 39;
                break;
            }
            case 38: {
                n4 = 60;
                break;
            }
            case 39: {
                n4 = 37;
                break;
            }
            case 40: {
                n4 = 22;
                break;
            }
            case 41: {
                n4 = 10;
                break;
            }
            case 42: {
                n4 = 44;
                break;
            }
            case 43: {
                n4 = 51;
                break;
            }
            case 44: {
                n4 = 27;
                break;
            }
            case 45: {
                n4 = 42;
                break;
            }
            case 46: {
                n4 = 54;
                break;
            }
            case 47: {
                n4 = 61;
                break;
            }
            case 48: {
                n4 = 53;
                break;
            }
            case 49: {
                n4 = 3;
                break;
            }
            case 50: {
                n4 = 25;
                break;
            }
            case 51: {
                n4 = 46;
                break;
            }
            case 52: {
                n4 = 26;
                break;
            }
            case 53: {
                n4 = 29;
                break;
            }
            case 54: {
                n4 = 6;
                break;
            }
            case 55: {
                n4 = 30;
                break;
            }
            case 56: {
                n4 = 35;
                break;
            }
            case 57: {
                n4 = 40;
                break;
            }
            case 58: {
                n4 = 49;
                break;
            }
            case 59: {
                n4 = 13;
                break;
            }
            case 60: {
                n4 = 63;
                break;
            }
            case 61: {
                n4 = 59;
                break;
            }
            case 62: {
                n4 = 45;
                break;
            }
            default: {
                n4 = 15;
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
        yz.pb[n5] = new String(cArray);
        return n5;
    }

    private void J() {
        this.K7.k();
        OT oT2 = this.Kq.X(false);
        if (oT2 != null) {
            ArrayList<Rt> arrayList = new ArrayList<Rt>();
            for (a2 a22 : oT2.x(false)) {
                arrayList.add(new Rt(105.0, this.Kq, oT2, a22));
            }
            this.K7.o(arrayList.toArray(new Rt[0]));
            this.KY.j(oT2);
        } else {
            this.KY.j((OT)null);
        }
    }

    @Override
    public void d() {
        try {
            if (!this.Kq.equals(SE.h.o().W())) {
                return;
            }
        }
        catch (O_ o_2) {
            throw yz.a(o_2);
        }
        long l10 = this.Kq.F();
        try {
            if (l10 != this.Kk) {
                this.Kk = l10;
                this.J();
            }
        }
        catch (O_ o_3) {
            throw yz.a(o_3);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = yz.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public yz(BZ bZ2, double d2, double d3) {
        long l10 = bb ^ 0x234AC93A1900L;
        super(d2);
        this.Kk = -1L;
        this.Kq = bZ2;
        this.i(false);
        this.d().f((String)((Object)yz.d("q", (int)yz.c("p", (int)11168, (long)(0x6B632F651576DB4CL ^ l10)), (long)3119154929070034035L, (long)l10)));
        this.K7 = new yG(d2, d3);
        this.K7.d().f((String)((Object)yz.d("q", (int)yz.c("p", (int)24322, (long)(0x14F0048047B7AFEFL ^ l10)), (long)3119154929070034035L, (long)l10)));
        this.K7.d().m(false);
        this.K7.i(this.K7.b());
        this.K7.i(false);
        this.K7.O(G4.OUTSIDE);
        this.KY = new yo(null, d2, false);
        this.n(this.KY, new Object[0]);
        this.n(this.K7, new Object[0]);
        this.J();
        this.Kk = bZ2.F();
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00ef' || c10 == 'y' || c10 == 'k' || c10 == '\u00cd') {
                field = yz.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yz.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e2' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = yz.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yz.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(yz.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

