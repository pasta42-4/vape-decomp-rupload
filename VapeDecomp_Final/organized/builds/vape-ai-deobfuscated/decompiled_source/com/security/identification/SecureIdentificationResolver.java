/*
 * Decompiled with CFR 0.152.
 */
package com.security.identification;

import a.HK;
import a.UB;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
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

public class SecureIdentificationResolver
extends CryptoProtocolEngine {
    private static final String[] f;
    private static final long a;
    private static final Integer[] c;
    private final HK w;
    private static final Object[] e;
    private static final long[] b;
    private static final Map d;

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 56;
                break;
            }
            case 1: {
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 27;
                break;
            }
            case 4: {
                n3 = 10;
                break;
            }
            case 5: {
                n3 = 60;
                break;
            }
            case 6: {
                n3 = 15;
                break;
            }
            case 7: {
                n3 = 34;
                break;
            }
            case 8: {
                n3 = 37;
                break;
            }
            case 9: {
                n3 = 24;
                break;
            }
            case 10: {
                n3 = 49;
                break;
            }
            case 11: {
                n3 = 4;
                break;
            }
            case 12: {
                n3 = 20;
                break;
            }
            case 13: {
                n3 = 39;
                break;
            }
            case 14: {
                n3 = 50;
                break;
            }
            case 15: {
                n3 = 12;
                break;
            }
            case 16: {
                n3 = 16;
                break;
            }
            case 17: {
                n3 = 35;
                break;
            }
            case 18: {
                n3 = 61;
                break;
            }
            case 19: {
                n3 = 38;
                break;
            }
            case 20: {
                n3 = 55;
                break;
            }
            case 21: {
                n3 = 40;
                break;
            }
            case 22: {
                n3 = 47;
                break;
            }
            case 23: {
                n3 = 5;
                break;
            }
            case 24: {
                n3 = 1;
                break;
            }
            case 25: {
                n3 = 42;
                break;
            }
            case 26: {
                n3 = 33;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 8;
                break;
            }
            case 29: {
                n3 = 51;
                break;
            }
            case 30: {
                n3 = 43;
                break;
            }
            case 31: {
                n3 = 0;
                break;
            }
            case 32: {
                n3 = 18;
                break;
            }
            case 33: {
                n3 = 32;
                break;
            }
            case 34: {
                n3 = 9;
                break;
            }
            case 35: {
                n3 = 62;
                break;
            }
            case 36: {
                n3 = 54;
                break;
            }
            case 37: {
                n3 = 45;
                break;
            }
            case 38: {
                n3 = 52;
                break;
            }
            case 39: {
                n3 = 26;
                break;
            }
            case 40: {
                n3 = 25;
                break;
            }
            case 41: {
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 21;
                break;
            }
            case 43: {
                n3 = 63;
                break;
            }
            case 44: {
                n3 = 57;
                break;
            }
            case 45: {
                n3 = 23;
                break;
            }
            case 46: {
                n3 = 28;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 30;
                break;
            }
            case 49: {
                n3 = 11;
                break;
            }
            case 50: {
                n3 = 44;
                break;
            }
            case 51: {
                n3 = 29;
                break;
            }
            case 52: {
                n3 = 31;
                break;
            }
            case 53: {
                n3 = 19;
                break;
            }
            case 54: {
                n3 = 36;
                break;
            }
            case 55: {
                n3 = 53;
                break;
            }
            case 56: {
                n3 = 6;
                break;
            }
            case 57: {
                n3 = 2;
                break;
            }
            case 58: {
                n3 = 41;
                break;
            }
            case 59: {
                n3 = 17;
                break;
            }
            case 60: {
                n3 = 22;
                break;
            }
            case 61: {
                n3 = 48;
                break;
            }
            case 62: {
                n3 = 7;
                break;
            }
            default: {
                n3 = 46;
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
        SecureIdentificationResolver.f[n4] = new String(cArray);
        return n4;
    }

    private Object z(Object object) {
        return this.w.T(object, new Object[0]);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureIdentificationResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ub" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public SecureIdentificationResolver() {
        block8: {
            long l;
            block7: {
                int[] nArray;
                block6: {
                    l = a ^ 0xD0E3491D55L;
                    int[] nArray2 = UB.e();
                    super(ReflectionMetadataResolver.bx);
                    nArray = nArray2;
                    try {
                        try {
                            if (nArray == null) break block6;
                            if (GeometryCalculator.C() < 35) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureIdentificationResolver.a(customSystemException);
                        }
                        this.w = SecureIdentificationResolver.c("\u00a3", (Object)this, (Object)SecureIdentificationResolver.c("\u00b5", (int)SecureIdentificationResolver.b("n", (int)31936, (long)(0x403372EE47EE45DL ^ l)), (long)-6951055256318553311L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[0], (long)-6951297313354816723L, (long)l);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureIdentificationResolver.a(customSystemException);
                    }
                }
                try {
                    if (nArray != null) break block8;
                    AbstractComputationKernel.I(new String[2]);
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureIdentificationResolver.a(customSystemException);
                }
            }
            this.w = SecureIdentificationResolver.c("\u00a3", (Object)this, (Object)SecureIdentificationResolver.c("\u00b5", (int)SecureIdentificationResolver.b("n", (int)10505, (long)(0x37F8E35A8F1A3195L ^ l)), (long)-6951055256318553311L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[0], (long)-6951297313354816723L, (long)l);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ub" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a2' || c == '\u00ea' || c == '\u00fa' || c == '\u00e8') {
                field = SecureIdentificationResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureIdentificationResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(long l, long l2) {
        int n = SecureIdentificationResolver.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureIdentificationResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureIdentificationResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureIdentificationResolver.c(clazz3, string2, clazz2)) != null) {
                    SecureIdentificationResolver.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureIdentificationResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureIdentificationResolver.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureIdentificationResolver.f(631595522824652L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureIdentificationResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureIdentificationResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureIdentificationResolver.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureIdentificationResolver.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static Object J(SecureIdentificationResolver secureIdentificationResolver, Object object) {
        return secureIdentificationResolver.z(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "JC-9";
        objectArray[1] = "M@PMQ=FOA\u0002,%UHHK";
        objectArray[2] = Boolean.TYPE;
        SecureIdentificationResolver.f[2] = "java/lang/Boolean";
        objectArray[3] = "\u0012\u0001\b&\n\u001a\u0019\u000e\u0019ig\u001a\u0019\u0013\r";
        objectArray[4] = "\u001a%>\u0004>bo\u00055\u000b/-\u0002\u00055\u0016;8";
        objectArray[5] = "}7O8";
        objectArray[6] = "XLV";
        objectArray[7] = Integer.TYPE;
        SecureIdentificationResolver.f[7] = "java/lang/Integer";
        objectArray[8] = "+\u0001<s\t, \u000e-<h\"+\u0005)f";
        objectArray[9] = "hC\u0018\u000e6lmNAp\u0017\u000ew@H\u0011ov6DEpi|jYI\u00199k1H#J)1mI\u001a\r>d3#\u0019\u00003juXL\u001290\n\u0018SJi0`\u0018S\u00101\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "g}\u0015mfP:m\u00102\u0018A \u0010P9a\u001a\"/W?&C[m\u000e9y\u0015#,\n4\u0018";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(1010074071900305749L, -4782564399062169190L, MethodHandles.lookup().lookupClass()).a(253359860542574L);
        e = new Object[11];
        f = new String[11];
        SecureIdentificationResolver.a();
        d = new HashMap(13);
        long l = a ^ 0x56729B2C72B5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00ad\u00ef\u009a\u00c5\u00df,\u0014\u00f3q\u00e6n\u00b3\u00d6\u00ac\u00a1\u00bc";
        int n2 = "\u00ad\u00ef\u009a\u00c5\u00df,\u0014\u00f3q\u00e6n\u00b3\u00d6\u00ac\u00a1\u00bc".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x717;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ub", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureIdentificationResolver.c[n2] = n3;
        }
        return c[n2];
    }

    private static Method h(long l, long l2) {
        int n = SecureIdentificationResolver.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecureIdentificationResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureIdentificationResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureIdentificationResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureIdentificationResolver.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureIdentificationResolver.f(631595522824652L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureIdentificationResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureIdentificationResolver.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureIdentificationResolver.f(631595522824652L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureIdentificationResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SecureIdentificationResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureIdentificationResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureIdentificationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(SecureIdentificationResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

