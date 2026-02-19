/*
 * Decompiled with CFR 0.152.
 */
package com.distributed.compute;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
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

public class DistributedComputationOrchestrator
extends CryptoProtocolEngine {
    private ReflectionUtilityService r;
    private static int q;
    private ReflectionUtilityService A;
    private HK g;
    private static final Object[] e;
    private ReflectionUtilityService i;
    private ReflectionUtilityService H;
    private ReflectionUtilityService E;
    private static final Integer[] c;
    private ReflectionUtilityService p;
    private static final String[] f;
    private ReflectionUtilityService m;
    private static final long a;
    private static final long[] b;
    private static final Map d;

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5246;
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
                throw new RuntimeException("a/lx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DistributedComputationOrchestrator.c[n2] = n3;
        }
        return c[n2];
    }

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
                n3 = 9;
                break;
            }
            case 1: {
                n3 = 61;
                break;
            }
            case 2: {
                n3 = 40;
                break;
            }
            case 3: {
                n3 = 30;
                break;
            }
            case 4: {
                n3 = 13;
                break;
            }
            case 5: {
                n3 = 6;
                break;
            }
            case 6: {
                n3 = 27;
                break;
            }
            case 7: {
                n3 = 38;
                break;
            }
            case 8: {
                n3 = 10;
                break;
            }
            case 9: {
                n3 = 14;
                break;
            }
            case 10: {
                n3 = 33;
                break;
            }
            case 11: {
                n3 = 18;
                break;
            }
            case 12: {
                n3 = 54;
                break;
            }
            case 13: {
                n3 = 1;
                break;
            }
            case 14: {
                n3 = 21;
                break;
            }
            case 15: {
                n3 = 19;
                break;
            }
            case 16: {
                n3 = 15;
                break;
            }
            case 17: {
                n3 = 52;
                break;
            }
            case 18: {
                n3 = 43;
                break;
            }
            case 19: {
                n3 = 22;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 5;
                break;
            }
            case 22: {
                n3 = 28;
                break;
            }
            case 23: {
                n3 = 25;
                break;
            }
            case 24: {
                n3 = 59;
                break;
            }
            case 25: {
                n3 = 41;
                break;
            }
            case 26: {
                n3 = 51;
                break;
            }
            case 27: {
                n3 = 48;
                break;
            }
            case 28: {
                n3 = 62;
                break;
            }
            case 29: {
                n3 = 56;
                break;
            }
            case 30: {
                n3 = 37;
                break;
            }
            case 31: {
                n3 = 57;
                break;
            }
            case 32: {
                n3 = 39;
                break;
            }
            case 33: {
                n3 = 60;
                break;
            }
            case 34: {
                n3 = 31;
                break;
            }
            case 35: {
                n3 = 8;
                break;
            }
            case 36: {
                n3 = 58;
                break;
            }
            case 37: {
                n3 = 49;
                break;
            }
            case 38: {
                n3 = 2;
                break;
            }
            case 39: {
                n3 = 26;
                break;
            }
            case 40: {
                n3 = 53;
                break;
            }
            case 41: {
                n3 = 12;
                break;
            }
            case 42: {
                n3 = 45;
                break;
            }
            case 43: {
                n3 = 50;
                break;
            }
            case 44: {
                n3 = 35;
                break;
            }
            case 45: {
                n3 = 16;
                break;
            }
            case 46: {
                n3 = 63;
                break;
            }
            case 47: {
                n3 = 34;
                break;
            }
            case 48: {
                n3 = 32;
                break;
            }
            case 49: {
                n3 = 44;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 3;
                break;
            }
            case 52: {
                n3 = 46;
                break;
            }
            case 53: {
                n3 = 11;
                break;
            }
            case 54: {
                n3 = 23;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 42;
                break;
            }
            case 57: {
                n3 = 29;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 17;
                break;
            }
            case 60: {
                n3 = 55;
                break;
            }
            case 61: {
                n3 = 7;
                break;
            }
            case 62: {
                n3 = 47;
                break;
            }
            default: {
                n3 = 36;
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
        DistributedComputationOrchestrator.f[n4] = new String(cArray);
        return n4;
    }

    public void n(Object object, boolean bl) {
        this.p.B(object, bl);
    }

    public DistributedComputationOrchestrator() {
        long l = a ^ 0xC80873A14AAL;
        super(ReflectionMetadataResolver.Yf);
        this.i = DistributedComputationOrchestrator.c("\u00c5", (Object)this, (Object)DistributedComputationOrchestrator.c("\u00ba", (int)DistributedComputationOrchestrator.b("n", (int)23771, (long)(0x5DA995CDFCB505A6L ^ l)), (long)-8412849554587327402L, (long)l), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l);
        this.E = DistributedComputationOrchestrator.c("\u00c5", (Object)this, (Object)DistributedComputationOrchestrator.c("\u00ba", (int)DistributedComputationOrchestrator.b("n", (int)9443, (long)(0x122D22F415727D9AL ^ l)), (long)-8412849554587327402L, (long)l), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l);
        this.m = DistributedComputationOrchestrator.c("\u00c5", (Object)this, (Object)DistributedComputationOrchestrator.c("\u00ba", (int)DistributedComputationOrchestrator.b("n", (int)5522, (long)(0x72730671EDB0CCECL ^ l)), (long)-8412849554587327402L, (long)l), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l);
        this.r = DistributedComputationOrchestrator.c("\u00c5", (Object)this, (Object)DistributedComputationOrchestrator.c("\u00ba", (int)DistributedComputationOrchestrator.b("n", (int)17324, (long)(0x3B64ED7EFC6A9AD7L ^ l)), (long)-8412849554587327402L, (long)l), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l);
        this.p = DistributedComputationOrchestrator.c("\u00c5", (Object)this, (Object)DistributedComputationOrchestrator.c("\u00ba", (int)DistributedComputationOrchestrator.b("n", (int)25047, (long)(0x437CFDC9F7BF38AFL ^ l)), (long)-8412849554587327402L, (long)l), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l);
        this.H = DistributedComputationOrchestrator.c("\u00c5", (Object)this, (Object)DistributedComputationOrchestrator.c("\u00ba", (int)DistributedComputationOrchestrator.b("n", (int)30358, (long)(0x3B565CFD44A2FECL ^ l)), (long)-8412849554587327402L, (long)l), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l);
        this.A = DistributedComputationOrchestrator.c("\u00c5", (Object)this, (Object)DistributedComputationOrchestrator.c("\u00ba", (int)DistributedComputationOrchestrator.b("n", (int)27591, (long)(0x5AA99ECC3E3A32B8L ^ l)), (long)-8412849554587327402L, (long)l), (boolean)true, Boolean.TYPE, (long)-8412729194674611885L, (long)l);
        this.g = DistributedComputationOrchestrator.c("\u00c5", (Object)this, (Object)new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-8413205295783102142L, (long)l);
        int n = DistributedComputationOrchestrator.Z();
        try {
            if (n != 0) {
                AbstractComputationKernel.I(new String[4]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedComputationOrchestrator.a(customSystemException);
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void g(Object object, boolean bl) {
        this.A.B(object, bl);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DistributedComputationOrchestrator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DistributedComputationOrchestrator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DistributedComputationOrchestrator.d(classArray2[i], string, clazz2, n, classArray);
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

    private static Field g(long l, long l2) {
        int n = DistributedComputationOrchestrator.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = DistributedComputationOrchestrator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DistributedComputationOrchestrator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DistributedComputationOrchestrator.c(clazz3, string2, clazz2)) != null) {
                    DistributedComputationOrchestrator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DistributedComputationOrchestrator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DistributedComputationOrchestrator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DistributedComputationOrchestrator.f(673095039401041L, 0L);
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
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DistributedComputationOrchestrator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method h(long l, long l2) {
        int n = DistributedComputationOrchestrator.e(l, l2);
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
                clazz3 = DistributedComputationOrchestrator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DistributedComputationOrchestrator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DistributedComputationOrchestrator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DistributedComputationOrchestrator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DistributedComputationOrchestrator.f(673095039401041L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DistributedComputationOrchestrator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DistributedComputationOrchestrator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DistributedComputationOrchestrator.f(673095039401041L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'h' || c == 'W' || c == '\u00e2' || c == 'l') {
                field = DistributedComputationOrchestrator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'h' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DistributedComputationOrchestrator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ba' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
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

    public static void P(int n) {
        q = n;
    }

    public boolean H(Object object) {
        return this.i.R(object);
    }

    public void e(Object object, boolean bl) {
        this.H.B(object, bl);
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
                DistributedComputationOrchestrator.a = MultiContainerRegistry.a(4953157994642343910L, -5947763555024649582L, MethodHandles.lookup().lookupClass()).a(264815529278610L);
                DistributedComputationOrchestrator.e = new Object[13];
                DistributedComputationOrchestrator.f = new String[13];
                DistributedComputationOrchestrator.a();
                DistributedComputationOrchestrator.d = new HashMap<K, V>(13);
                DistributedComputationOrchestrator.P(0);
                var0 = DistributedComputationOrchestrator.a ^ 90705536071642L;
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
        DistributedComputationOrchestrator.b = var8_3;
        DistributedComputationOrchestrator.c = new Integer[7];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DistributedComputationOrchestrator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DistributedComputationOrchestrator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DistributedComputationOrchestrator.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                DistributedComputationOrchestrator.e[n] = clazz = Class.forName(f[n]);
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
        DistributedComputationOrchestrator.f[1] = "java/lang/Integer";
        objectArray[2] = "SISK/\u0017XFB\u0004R\u000fKAKM";
        objectArray[3] = "\nzMV";
        objectArray[4] = Boolean.TYPE;
        DistributedComputationOrchestrator.f[4] = "java/lang/Boolean";
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

    public Object k(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        return this.g.A(bl, bl2, bl3, bl4, bl5, bl6, bl7);
    }

    public static int k() {
        int n = DistributedComputationOrchestrator.Z();
        try {
            if (n == 0) {
                return 106;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DistributedComputationOrchestrator.a(customSystemException);
        }
        return 0;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DistributedComputationOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DistributedComputationOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

