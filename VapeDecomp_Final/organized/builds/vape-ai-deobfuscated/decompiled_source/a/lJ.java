/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.data.transformation.DataTransformationEngine;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
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

public class lJ
extends CryptoProtocolEngine {
    private HK Y;
    private static final Object[] i;
    private ReflectionUtilityService c;
    private ReflectionUtilityService d;
    private static final String[] k;
    private ReflectionUtilityService e;
    private ReflectionUtilityService z;
    private static final Map h;
    private ReflectionUtilityService f;
    private ReflectionUtilityService Z;
    private HK G;
    private HK j;
    private HK v;
    private static final Integer[] g;
    private static final long a;
    private HK I;
    private static final long[] b;

    private void e(Object object, float f) {
        this.f.H(object, f);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = lJ.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = lJ.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static void i(lJ lJ2, Object object, float f) {
        lJ2.e(object, f);
    }

    private Object v(int n) {
        return this.v.A(n);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a4' || c == '\u00e4' || c == '\u00d5' || c == 'R') {
                field = lJ.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = lJ.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static Object K(lJ lJ2, Object object) {
        return lJ2.N(object);
    }

    private void i(Object object, float f) {
        this.Z.H(object, f);
    }

    static Object m(lJ lJ2, Object object, float f, float f2) {
        return lJ2.C(object, f, f2);
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    public lJ() {
        long l = a ^ 0x13DD543FC3AL;
        super(ReflectionMetadataResolver.rq);
        this.v = lJ.c("\u00fe", (Object)this, (Object)new Class[]{Integer.TYPE}, (long)3061101321237762554L, (long)l);
        this.I = lJ.c("\u00fe", (Object)this, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)19441, (long)(0x6841496ABDBA555EL ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, (Object)ReflectionMetadataResolver.rq, (Object)new Class[0], (long)3061369795631626249L, (long)l);
        this.j = lJ.c("\u00fe", (Object)this, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)15844, (long)(0x1DC17C8A8ECF2343L ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, (Object)ReflectionMetadataResolver.rq, (Object)new Class[0], (long)3061369795631626249L, (long)l);
        this.G = lJ.c("\u00fe", (Object)this, (Object)ReflectionMetadataResolver.bQ, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)29605, (long)(0x4076593D2CE9ED09L ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, (Object)ReflectionMetadataResolver.bQ, (Object)new Class[]{Float.TYPE, Float.TYPE}, (long)3061410131555511466L, (long)l);
        this.Y = lJ.c("\u00fe", (Object)this, (Object)ReflectionMetadataResolver.bQ, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)18015, (long)(0x18F7BAB3CFE258F2L ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, (Object)ReflectionMetadataResolver.bQ, (Object)new Class[]{Float.TYPE, Float.TYPE}, (long)3061410131555511466L, (long)l);
        int[] nArray = DataTransformationEngine.X();
        try {
            this.e = lJ.c("\u00fe", (Object)this, (Object)ReflectionMetadataResolver.bQ, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)31179, (long)(0x5F62049702A3676DL ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, Float.TYPE, (long)3061598596082771453L, (long)l);
            this.Z = lJ.c("\u00fe", (Object)this, (Object)ReflectionMetadataResolver.bQ, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)32537, (long)(0x1982D0319BF361B3L ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, Float.TYPE, (long)3061598596082771453L, (long)l);
            this.d = lJ.c("\u00fe", (Object)this, (Object)ReflectionMetadataResolver.bQ, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)4585, (long)(0x49064EAED30F8F47L ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, Float.TYPE, (long)3061598596082771453L, (long)l);
            this.f = lJ.c("\u00fe", (Object)this, (Object)ReflectionMetadataResolver.bQ, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)2938, (long)(0x3A68B60950EE95D2L ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, Float.TYPE, (long)3061598596082771453L, (long)l);
            this.z = lJ.c("\u00fe", (Object)this, (Object)ReflectionMetadataResolver.bQ, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)9933, (long)(0x511FF42B442DB866L ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, Float.TYPE, (long)3061598596082771453L, (long)l);
            this.c = lJ.c("\u00fe", (Object)this, (Object)ReflectionMetadataResolver.bQ, (Object)lJ.c("\u00ce", (int)lJ.b("m", (int)21062, (long)(0x248B7284EB93CCEFL ^ l)), (long)3061520017175754923L, (long)l), (boolean)false, Float.TYPE, (long)3061598596082771453L, (long)l);
            if (nArray != null) {
                AbstractComputationKernel.I(new String[3]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw lJ.a(customSystemException);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void q(Object object, float f) {
        this.c.H(object, f);
    }

    static void L(lJ lJ2, Object object, float f) {
        lJ2.q(object, f);
    }

    private Object G(Object object) {
        return this.j.T(object, new Object[0]);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private Object N(Object object) {
        return this.I.T(object, new Object[0]);
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "\u0003&pT";
        objectArray[1] = "oR\u001e\u007frsd]\u000f0\u000fkwZ\u0006y";
        objectArray[2] = Boolean.TYPE;
        lJ.k[2] = "java/lang/Boolean";
        objectArray[3] = "\u0016M\u0001,!\u007f\u001dB\u0010cL\u007f\u001d_\u0004";
        objectArray[4] = "\\\f\u0003=\"\u0012),\b23]D,\b/'H";
        objectArray[5] = "Qox\u001c";
        objectArray[6] = "Mt6\u00103,8T=\u001f\"cUT=\u00026v";
        objectArray[7] = "|\u0003>";
        objectArray[8] = Integer.TYPE;
        lJ.k[8] = "java/lang/Integer";
        objectArray[9] = "\nP\u000bU";
        objectArray[10] = "\u0013\u001d\u0005;crf=\u000e4r=\u000b=\u000e)f(";
        objectArray[11] = "\u0011SKSS\u001b\u001a\\Z\u001c2\u0015\u0011W^F";
        objectArray[12] = "h<\u000e\u001bf-5hI!L]hc\u0011Gt--l\fE\u000bd/0\fNw-19\u0019!1<1h\r_:b  s\u001fz 2i\u0011Qgm<RO\u0019;aokH\u0011l4Q";
        objectArray[13] = "H\r|\u001ec6\u0015Y;$CFK\u0002a\u001ep8@\\pV\u000e\u007f@\u0001g[~:O\u001ce$78\u0013\u001cnX~&\u001a\t\u0001\u001eo&K\u001d\u007f\u001517\u0003c?Us%J\u0001qH>+q_9\u00142xHX1CgF";
        objectArray[14] = "h\"5\u000f\u0001H$$0\u0017{A/\\n\n\u0016\u0010m..\f@JTeb\u0010\u001dU$ m\r\u001f*";
        objectArray[15] = "O\u0018_\r{y\u0012L\u00187G\tL\u0017B\rhwGISE\u00160G\u0014DHfuH\tF7/w\u0014\tMKfi\u001d\u001c\"\rwiL\b\\\u0006)x\u0004v\u001cIks\u000fN^\u000ed`v";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "d}\r\u000b\r\u000e9)J1'~cb\rR[\u001c-\u007f@\\`Be#L\u000fYEmt\u00191";
    }

    private Object W(Object object, float f, float f2) {
        return this.G.T(object, Float.valueOf(f), Float.valueOf(f2));
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = lJ.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static Object I(lJ lJ2, int n) {
        return lJ2.v(n);
    }

    static void h(lJ lJ2, Object object, float f) {
        lJ2.A(object, f);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = lJ.e(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                lJ.i[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = lJ.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = lJ.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void z(Object object, float f) {
        this.e.H(object, f);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x34D1;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/lJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            lJ.g[n2] = n3;
        }
        return g[n2];
    }

    static void z(lJ lJ2, Object object, float f) {
        lJ2.f(object, f);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n4] != null) {
            return n4;
        }
        Object object = i[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 20;
                break;
            }
            case 1: {
                n3 = 15;
                break;
            }
            case 2: {
                n3 = 34;
                break;
            }
            case 3: {
                n3 = 61;
                break;
            }
            case 4: {
                n3 = 60;
                break;
            }
            case 5: {
                n3 = 28;
                break;
            }
            case 6: {
                n3 = 33;
                break;
            }
            case 7: {
                n3 = 23;
                break;
            }
            case 8: {
                n3 = 12;
                break;
            }
            case 9: {
                n3 = 52;
                break;
            }
            case 10: {
                n3 = 24;
                break;
            }
            case 11: {
                n3 = 29;
                break;
            }
            case 12: {
                n3 = 41;
                break;
            }
            case 13: {
                n3 = 36;
                break;
            }
            case 14: {
                n3 = 2;
                break;
            }
            case 15: {
                n3 = 42;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 5;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 45;
                break;
            }
            case 22: {
                n3 = 53;
                break;
            }
            case 23: {
                n3 = 11;
                break;
            }
            case 24: {
                n3 = 7;
                break;
            }
            case 25: {
                n3 = 10;
                break;
            }
            case 26: {
                n3 = 48;
                break;
            }
            case 27: {
                n3 = 40;
                break;
            }
            case 28: {
                n3 = 17;
                break;
            }
            case 29: {
                n3 = 22;
                break;
            }
            case 30: {
                n3 = 19;
                break;
            }
            case 31: {
                n3 = 4;
                break;
            }
            case 32: {
                n3 = 43;
                break;
            }
            case 33: {
                n3 = 50;
                break;
            }
            case 34: {
                n3 = 54;
                break;
            }
            case 35: {
                n3 = 39;
                break;
            }
            case 36: {
                n3 = 63;
                break;
            }
            case 37: {
                n3 = 51;
                break;
            }
            case 38: {
                n3 = 49;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 46;
                break;
            }
            case 41: {
                n3 = 62;
                break;
            }
            case 42: {
                n3 = 21;
                break;
            }
            case 43: {
                n3 = 6;
                break;
            }
            case 44: {
                n3 = 25;
                break;
            }
            case 45: {
                n3 = 59;
                break;
            }
            case 46: {
                n3 = 9;
                break;
            }
            case 47: {
                n3 = 47;
                break;
            }
            case 48: {
                n3 = 57;
                break;
            }
            case 49: {
                n3 = 27;
                break;
            }
            case 50: {
                n3 = 1;
                break;
            }
            case 51: {
                n3 = 58;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 38;
                break;
            }
            case 54: {
                n3 = 30;
                break;
            }
            case 55: {
                n3 = 32;
                break;
            }
            case 56: {
                n3 = 26;
                break;
            }
            case 57: {
                n3 = 3;
                break;
            }
            case 58: {
                n3 = 8;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 44;
                break;
            }
            case 61: {
                n3 = 56;
                break;
            }
            case 62: {
                n3 = 37;
                break;
            }
            default: {
                n3 = 18;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        lJ.k[n4] = new String(cArray);
        return n4;
    }

    static void P(lJ lJ2, Object object, float f) {
        lJ2.i(object, f);
    }

    static Object Q(lJ lJ2, Object object) {
        return lJ2.G(object);
    }

    private void f(Object object, float f) {
        this.z.H(object, f);
    }

    private void A(Object object, float f) {
        this.d.H(object, f);
    }

    static Object i(lJ lJ2, Object object, float f, float f2) {
        return lJ2.W(object, f, f2);
    }

    private static Method h(long l, long l2) {
        int n = lJ.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = lJ.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = lJ.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = lJ.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        lJ.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = lJ.f(818155445191423L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = lJ.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        lJ.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = lJ.f(818155445191423L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    static void C(lJ lJ2, Object object, float f) {
        lJ2.z(object, f);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = lJ.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = lJ.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = lJ.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = lJ.c(clazz3, string2, clazz2)) != null) {
                    lJ.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = lJ.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        lJ.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = lJ.f(818155445191423L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                lJ.a = MultiContainerRegistry.a(-675872085120805170L, -578809650668683214L, MethodHandles.lookup().lookupClass()).a(14319362143261L);
                lJ.i = new Object[17];
                lJ.k = new String[17];
                lJ.a();
                lJ.h = new HashMap<K, V>(13);
                var0 = lJ.a ^ 123319064435643L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "5\u00bf\u00f0\u00bc\u0080\u00b2\u00c5\u00e1\u00ea\u00cb\u0001K\u00a6HEt\u0083E\u00ed\u0010n\u001d6\u00b5\u0003\u00e47\u009a\u00ed\u0098\u00ce\u009f\u000e\u00e37\\\u000eW\u001f\u00f6\u00a4ll/\u00bc\u0006g\u000e\u0096\u00ae\u00d0v\u0006'p\u00b9\u0002)\u0001\u00cf\u0087\u0082\u0013\u0089";
                var7_6 = "5\u00bf\u00f0\u00bc\u0080\u00b2\u00c5\u00e1\u00ea\u00cb\u0001K\u00a6HEt\u0083E\u00ed\u0010n\u001d6\u00b5\u0003\u00e47\u009a\u00ed\u0098\u00ce\u009f\u000e\u00e37\\\u000eW\u001f\u00f6\u00a4ll/\u00bc\u0006g\u000e\u0096\u00ae\u00d0v\u0006'p\u00b9\u0002)\u0001\u00cf\u0087\u0082\u0013\u0089".length();
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
                    var6_5 = "Y\u0007\u00cf{A\u00ec\u00e8$\u00d7\u0098\u00ae\u000b>|)\u00cf";
                    var7_6 = "Y\u0007\u00cf{A\u00ec\u00e8$\u00d7\u0098\u00ae\u000b>|)\u00cf".length();
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
        lJ.b = var8_3;
        lJ.g = new Integer[10];
    }

    private Object C(Object object, float f, float f2) {
        return this.Y.T(object, Float.valueOf(f), Float.valueOf(f2));
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = lJ.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lJ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(lJ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

