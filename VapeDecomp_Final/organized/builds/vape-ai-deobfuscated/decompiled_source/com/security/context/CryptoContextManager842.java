/*
 * Decompiled with CFR 0.152.
 */
package com.security.context;

import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.conversion.TypeConversionOrchestrator439;
import com.runtime.reflection.ReflectionUtilityService;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoContextManager842
extends CryptoProtocolEngine {
    private static final String[] d;
    private static final long a;
    private static final long b;
    private static final Object[] c;
    private ReflectionUtilityService Q;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "rDj";
        objectArray[1] = Integer.TYPE;
        CryptoContextManager842.d[1] = "java/lang/Integer";
        objectArray[2] = "\u0003K\u0004c\u001cK\bD\u0015,aS\u001bC\u001ce";
        objectArray[3] = "?pB\u0010";
        objectArray[4] = Boolean.TYPE;
        CryptoContextManager842.d[4] = "java/lang/Boolean";
        objectArray[5] = "\u0013R)\r\u000b\f\u0018]8Bf\f\u0018@,";
        objectArray[6] = "@x9^";
        objectArray[7] = "^T\u000b\u0004O\u0013U[\u001aK.\u001d^P\u001e\u0011";
        objectArray[8] = "J\nD\rW8\u0015\u0004O\u00017\u000bpWI\u0000[-\n\u0010_\u0006\u0006FJ\u0012H\u001e\\x\u000f\u0013\u0017\u001d7}\t\u0005\u0015\u001fG(\u000bU@g\u000b-\u001a\u000f]\nW,\u0019\u0011/";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "-X\u0019w\fM)\u000bG\u001cVKL\u0018]~\u0006\tu\u0006\u001a\"=\t*\u0002MwGN<\u0004\u0010\u001c";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(4873979520166713577L, -7246858276716391735L, MethodHandles.lookup().lookupClass()).a(73754113776710L);
        c = new Object[10];
        d = new String[10];
        CryptoContextManager842.a();
        long l = a ^ 0x1D52A4D39B9BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -1321395648924031592L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (d[n4] != null) {
            return n4;
        }
        Object object = c[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 27;
                break;
            }
            case 2: {
                n3 = 47;
                break;
            }
            case 3: {
                n3 = 9;
                break;
            }
            case 4: {
                n3 = 10;
                break;
            }
            case 5: {
                n3 = 5;
                break;
            }
            case 6: {
                n3 = 24;
                break;
            }
            case 7: {
                n3 = 19;
                break;
            }
            case 8: {
                n3 = 43;
                break;
            }
            case 9: {
                n3 = 18;
                break;
            }
            case 10: {
                n3 = 34;
                break;
            }
            case 11: {
                n3 = 62;
                break;
            }
            case 12: {
                n3 = 30;
                break;
            }
            case 13: {
                n3 = 42;
                break;
            }
            case 14: {
                n3 = 49;
                break;
            }
            case 15: {
                n3 = 25;
                break;
            }
            case 16: {
                n3 = 54;
                break;
            }
            case 17: {
                n3 = 2;
                break;
            }
            case 18: {
                n3 = 7;
                break;
            }
            case 19: {
                n3 = 41;
                break;
            }
            case 20: {
                n3 = 16;
                break;
            }
            case 21: {
                n3 = 0;
                break;
            }
            case 22: {
                n3 = 28;
                break;
            }
            case 23: {
                n3 = 36;
                break;
            }
            case 24: {
                n3 = 55;
                break;
            }
            case 25: {
                n3 = 60;
                break;
            }
            case 26: {
                n3 = 38;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 3;
                break;
            }
            case 29: {
                n3 = 45;
                break;
            }
            case 30: {
                n3 = 46;
                break;
            }
            case 31: {
                n3 = 11;
                break;
            }
            case 32: {
                n3 = 32;
                break;
            }
            case 33: {
                n3 = 52;
                break;
            }
            case 34: {
                n3 = 37;
                break;
            }
            case 35: {
                n3 = 53;
                break;
            }
            case 36: {
                n3 = 1;
                break;
            }
            case 37: {
                n3 = 63;
                break;
            }
            case 38: {
                n3 = 58;
                break;
            }
            case 39: {
                n3 = 29;
                break;
            }
            case 40: {
                n3 = 35;
                break;
            }
            case 41: {
                n3 = 50;
                break;
            }
            case 42: {
                n3 = 40;
                break;
            }
            case 43: {
                n3 = 15;
                break;
            }
            case 44: {
                n3 = 51;
                break;
            }
            case 45: {
                n3 = 8;
                break;
            }
            case 46: {
                n3 = 6;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 12;
                break;
            }
            case 49: {
                n3 = 4;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 22;
                break;
            }
            case 53: {
                n3 = 57;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 23;
                break;
            }
            case 56: {
                n3 = 48;
                break;
            }
            case 57: {
                n3 = 44;
                break;
            }
            case 58: {
                n3 = 56;
                break;
            }
            case 59: {
                n3 = 17;
                break;
            }
            case 60: {
                n3 = 31;
                break;
            }
            case 61: {
                n3 = 14;
                break;
            }
            case 62: {
                n3 = 13;
                break;
            }
            default: {
                n3 = 39;
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
        CryptoContextManager842.d[n4] = new String(cArray);
        return n4;
    }

    public CryptoContextManager842() {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    long l = a ^ 0x7A20F11B1DC6L;
                    super(ReflectionMetadataResolver.I);
                    this.Q = CryptoContextManager842.b("\u00d9", (Object)this, (Object)CryptoContextManager842.b("\u00ce", (int)((int)b), (long)555384107754101773L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.FC, (long)555443447078527968L, (long)l);
                    boolean bl2 = TypeConversionOrchestrator439.l();
                    try {
                        try {
                            if (AbstractComputationKernel.J() == null) break block4;
                            if (!bl2) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoContextManager842.a(customSystemException);
                        }
                        bl = false;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoContextManager842.a(customSystemException);
                    }
                }
                bl = true;
            }
            TypeConversionOrchestrator439.O(bl);
        }
    }

    private static Field g(long l, long l2) {
        int n = CryptoContextManager842.e(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoContextManager842.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoContextManager842.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoContextManager842.c(clazz3, string2, clazz2)) != null) {
                    CryptoContextManager842.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoContextManager842.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoContextManager842.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoContextManager842.f(512736190462869L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoContextManager842.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoContextManager842.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoContextManager842.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'v' || c == '\u00eb' || c == '\u00ea' || c == '\u00e9') {
                field = CryptoContextManager842.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoContextManager842.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public Object G() {
        return this.Q.Z(null);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptoContextManager842.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoContextManager842.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = CryptoContextManager842.e(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptoContextManager842.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoContextManager842.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoContextManager842.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoContextManager842.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoContextManager842.f(512736190462869L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoContextManager842.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoContextManager842.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoContextManager842.f(512736190462869L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoContextManager842.e(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoContextManager842.c[n] = clazz = Class.forName(d[n]);
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
            return MethodHandles.lookup().findStatic(CryptoContextManager842.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

