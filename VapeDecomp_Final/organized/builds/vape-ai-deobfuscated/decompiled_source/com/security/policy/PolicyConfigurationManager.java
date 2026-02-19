/*
 * Decompiled with CFR 0.152.
 */
package com.security.policy;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.config.dynamic.DynamicConfigurationResolver;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class PolicyConfigurationManager
extends CryptoProtocolEngine {
    private HK W;
    private HK G;
    private HK T;
    private ReflectionUtilityService d;
    private static final long a;
    private final HK z;
    private static final Integer[] c;
    private static final Map f;
    private static final long[] b;
    private static final Object[] g;
    private static final String[] h;
    private final HK N;
    private ReflectionUtilityService e;

    static boolean m(PolicyConfigurationManager policyConfigurationManager, Object object) {
        return policyConfigurationManager.r(object);
    }

    public Object T(Object object, int n, int n2) {
        return this.W.A(object, n, n2);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = PolicyConfigurationManager.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                PolicyConfigurationManager.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static Object i(PolicyConfigurationManager policyConfigurationManager, Object object) {
        return policyConfigurationManager.L(object);
    }

    static int m(PolicyConfigurationManager policyConfigurationManager, Object object) {
        return policyConfigurationManager.h(object);
    }

    static Object X(PolicyConfigurationManager policyConfigurationManager, int n, int n2, int n3) {
        return policyConfigurationManager.z(n, n2, n3);
    }

    private static Field g(long l, long l2) {
        int n = PolicyConfigurationManager.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = PolicyConfigurationManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = PolicyConfigurationManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = PolicyConfigurationManager.c(clazz3, string2, clazz2)) != null) {
                    PolicyConfigurationManager.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = PolicyConfigurationManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        PolicyConfigurationManager.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = PolicyConfigurationManager.f(702438483733874L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private int h(Object object) {
        return this.G.R(object, new Object[0]);
    }

    private Object L(Object object) {
        return this.e.Z(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 's' || c == 'w' || c == '\u00d0' || c == '\u00ba') {
                field = PolicyConfigurationManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = PolicyConfigurationManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = PolicyConfigurationManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = PolicyConfigurationManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private Object z(int n, int n2, int n3) {
        return this.T.A(n, n2, n3);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 17;
                break;
            }
            case 3: {
                n3 = 41;
                break;
            }
            case 4: {
                n3 = 33;
                break;
            }
            case 5: {
                n3 = 18;
                break;
            }
            case 6: {
                n3 = 63;
                break;
            }
            case 7: {
                n3 = 26;
                break;
            }
            case 8: {
                n3 = 23;
                break;
            }
            case 9: {
                n3 = 27;
                break;
            }
            case 10: {
                n3 = 55;
                break;
            }
            case 11: {
                n3 = 37;
                break;
            }
            case 12: {
                n3 = 46;
                break;
            }
            case 13: {
                n3 = 39;
                break;
            }
            case 14: {
                n3 = 14;
                break;
            }
            case 15: {
                n3 = 2;
                break;
            }
            case 16: {
                n3 = 31;
                break;
            }
            case 17: {
                n3 = 61;
                break;
            }
            case 18: {
                n3 = 51;
                break;
            }
            case 19: {
                n3 = 58;
                break;
            }
            case 20: {
                n3 = 42;
                break;
            }
            case 21: {
                n3 = 1;
                break;
            }
            case 22: {
                n3 = 44;
                break;
            }
            case 23: {
                n3 = 5;
                break;
            }
            case 24: {
                n3 = 21;
                break;
            }
            case 25: {
                n3 = 11;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 35;
                break;
            }
            case 28: {
                n3 = 54;
                break;
            }
            case 29: {
                n3 = 62;
                break;
            }
            case 30: {
                n3 = 8;
                break;
            }
            case 31: {
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 3;
                break;
            }
            case 33: {
                n3 = 34;
                break;
            }
            case 34: {
                n3 = 22;
                break;
            }
            case 35: {
                n3 = 25;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 20;
                break;
            }
            case 38: {
                n3 = 24;
                break;
            }
            case 39: {
                n3 = 52;
                break;
            }
            case 40: {
                n3 = 13;
                break;
            }
            case 41: {
                n3 = 30;
                break;
            }
            case 42: {
                n3 = 40;
                break;
            }
            case 43: {
                n3 = 43;
                break;
            }
            case 44: {
                n3 = 19;
                break;
            }
            case 45: {
                n3 = 7;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 9;
                break;
            }
            case 48: {
                n3 = 0;
                break;
            }
            case 49: {
                n3 = 60;
                break;
            }
            case 50: {
                n3 = 10;
                break;
            }
            case 51: {
                n3 = 48;
                break;
            }
            case 52: {
                n3 = 29;
                break;
            }
            case 53: {
                n3 = 56;
                break;
            }
            case 54: {
                n3 = 53;
                break;
            }
            case 55: {
                n3 = 47;
                break;
            }
            case 56: {
                n3 = 4;
                break;
            }
            case 57: {
                n3 = 28;
                break;
            }
            case 58: {
                n3 = 15;
                break;
            }
            case 59: {
                n3 = 59;
                break;
            }
            case 60: {
                n3 = 38;
                break;
            }
            case 61: {
                n3 = 49;
                break;
            }
            case 62: {
                n3 = 32;
                break;
            }
            default: {
                n3 = 16;
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
        PolicyConfigurationManager.h[n4] = new String(cArray);
        return n4;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean r(Object object) {
        return this.d.R(object);
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = ";|/g";
        objectArray[1] = "M\u001d\u0004s0\u000eF\u0012\u0015<M\u0016U\u0015\u001cu";
        objectArray[2] = Boolean.TYPE;
        PolicyConfigurationManager.h[2] = "java/lang/Boolean";
        objectArray[3] = "\u0007=z\u0013Pu\f2k\\=u\f/\u007f";
        objectArray[4] = "(v_xdD]VTwu\u000b0VTja\u001e";
        objectArray[5] = "$/P\u0015";
        objectArray[6] = ")\u001a\u0003";
        objectArray[7] = Integer.TYPE;
        PolicyConfigurationManager.h[7] = "java/lang/Integer";
        objectArray[8] = "qil&";
        objectArray[9] = "DG\u0003d\u0003)OH\u0012+b'DC\u0016q";
        objectArray[10] = "PVhh$ W\u000e=\u0003\u001dG\n\u0002bo',YTfhZ~CEnhg$XTh\u0003`(AS`j&6_\u0006\u000781+\fO9c9!\\?;8:+]\u0005eo%y3";
        objectArray[11] = "Mi10\\\u0011J1d[yv\u0017=;7_\u001dDk?0\"O^z70\u001f\u0015Ek1[\u0018\u0019\\l92^\u0007B9^f^\b\u0010:?0]\u000bV\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "N%i\u0015\u001d\u0000\u001co`\ny\u000b\t\u0014%\u0007\u0015\nH~a\u0010\u0004\u001ar-$\u0012\u0015\u001d\u0019~r\u0016\u0012`";
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x42C;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/PC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            PolicyConfigurationManager.c[n2] = n3;
        }
        return c[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = PolicyConfigurationManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method h(long l, long l2) {
        int n = PolicyConfigurationManager.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = PolicyConfigurationManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = PolicyConfigurationManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = PolicyConfigurationManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        PolicyConfigurationManager.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = PolicyConfigurationManager.f(702438483733874L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = PolicyConfigurationManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        PolicyConfigurationManager.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = PolicyConfigurationManager.f(702438483733874L, 0L);
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

    static int d(PolicyConfigurationManager policyConfigurationManager, Object object) {
        return policyConfigurationManager.A(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = PolicyConfigurationManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private int A(Object object) {
        return this.N.R(object, new Object[0]);
    }

    /*
     * Unable to fully structure code
     */
    public PolicyConfigurationManager() {
        block25: {
            block21: {
                block24: {
                    block22: {
                        var1_1 = PolicyConfigurationManager.a ^ 67323288982852L;
                        v0 = DynamicConfigurationResolver.K();
                        super(ReflectionMetadataResolver.Pj);
                        var3_2 = v0;
                        try {
                            try {
                                try {
                                    try {
                                        if (var3_2 != null) break block21;
                                        if (GeometryCalculator.C() >= 23) {
                                        }
                                        ** GOTO lbl57
                                    }
                                    catch (CustomSystemException v1) {
                                        throw PolicyConfigurationManager.a(v1);
                                    }
                                    v2 = GeometryCalculator.C();
                                    v3 = 35;
                                    if (var3_2 != null) break block22;
                                }
                                catch (CustomSystemException v4) {
                                    throw PolicyConfigurationManager.a(v4);
                                }
                                if (v2 >= v3) {
                                }
                                ** GOTO lbl51
                            }
                            catch (CustomSystemException v5) {
                                throw PolicyConfigurationManager.a(v5);
                            }
                            v2 = GeometryCalculator.C();
                            v3 = 50;
                        }
                        catch (CustomSystemException v6) {
                            throw PolicyConfigurationManager.a(v6);
                        }
                    }
                    try {
                        block23: {
                            try {
                                if (v2 < v3) break block23;
                                this.W = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)12274, (long)(6533849627061575154L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rM, Integer.TYPE, Integer.TYPE}, (long)8516196003441773918L, (long)var1_1);
                                if (var3_2 == null) break block24;
                            }
                            catch (CustomSystemException v7) {
                                throw PolicyConfigurationManager.a(v7);
                            }
                        }
                        this.W = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)26956, (long)(2474250829591845707L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.tp, Integer.TYPE, Integer.TYPE}, (long)8516196003441773918L, (long)var1_1);
                    }
                    catch (CustomSystemException v8) {
                        throw PolicyConfigurationManager.a(v8);
                    }
                }
                try {
                    try {
                        this.e = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)20717, (long)(1044397479435838185L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.tp, (long)8516293614480429875L, (long)var1_1);
                        this.d = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)20446, (long)(6896131870274272735L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)8516293614480429875L, (long)var1_1);
                        if (var3_2 == null) break block25;
lbl51:
                        // 2 sources

                        this.W = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)23721, (long)(1009538724709805729L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rY, Integer.TYPE, Integer.TYPE}, (long)8516196003441773918L, (long)var1_1);
                        this.e = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)15899, (long)(7764838435675786265L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rY, (long)8516293614480429875L, (long)var1_1);
                        if (var3_2 == null) break block25;
                    }
                    catch (CustomSystemException v9) {
                        throw PolicyConfigurationManager.a(v9);
                    }
lbl57:
                    // 2 sources

                    this.T = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)4904, (long)(7721865598726594861L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)8516196003441773918L, (long)var1_1);
                }
                catch (CustomSystemException v10) {
                    throw PolicyConfigurationManager.a(v10);
                }
            }
            this.G = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)1346, (long)(5372729392914855745L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)8516196003441773918L, (long)var1_1);
        }
        try {
            this.z = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)21805, (long)(7258877178024961835L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)8516196003441773918L, (long)var1_1);
            this.N = PolicyConfigurationManager.c("\u00d1", (Object)this, (Object)PolicyConfigurationManager.c("\u00c7", (int)PolicyConfigurationManager.b("m", (int)1367, (long)(7648775796907079518L ^ var1_1)), (long)8515761627698294282L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)8516196003441773918L, (long)var1_1);
            if (AbstractComputationKernel.J() != null) {
                DynamicConfigurationResolver.s(new AbstractComputationKernel[4]);
            }
        }
        catch (CustomSystemException v11) {
            throw PolicyConfigurationManager.a(v11);
        }
    }

    private int G(Object object) {
        return this.z.R(object, new Object[0]);
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static int X(PolicyConfigurationManager policyConfigurationManager, Object object) {
        return policyConfigurationManager.G(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = PolicyConfigurationManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = PolicyConfigurationManager.d(classArray[i], string, clazz2);
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
                PolicyConfigurationManager.a = MultiContainerRegistry.a(-1232360213499879283L, 8290606590960245616L, MethodHandles.lookup().lookupClass()).a(119900351408420L);
                PolicyConfigurationManager.g = new Object[13];
                PolicyConfigurationManager.h = new String[13];
                PolicyConfigurationManager.a();
                PolicyConfigurationManager.f = new HashMap<K, V>(13);
                var0 = PolicyConfigurationManager.a ^ 49305357638166L;
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
                var6_5 = "\u00b3\u00a9\u00f6\u00ae\u00a3y60+\u0082\"\u00d0\u00c7\u001dm\u00b4t\u00d5Ki+g\u00d6}\u00f5\u000e&X\u001b\u00a9R\u00ea\u00ea\n\u00d0\u00bf\u00eb\u00a4k\u00a9t\t0\u009e\u00d4\u00a5\u00c3\u00cc\u00b10\u00ee\u0013\u00ea\u00f5y\u00d5\u008f \u0086\u009c\u00f1\u00f8\u00c2D";
                var7_6 = "\u00b3\u00a9\u00f6\u00ae\u00a3y60+\u0082\"\u00d0\u00c7\u001dm\u00b4t\u00d5Ki+g\u00d6}\u00f5\u000e&X\u001b\u00a9R\u00ea\u00ea\n\u00d0\u00bf\u00eb\u00a4k\u00a9t\t0\u009e\u00d4\u00a5\u00c3\u00cc\u00b10\u00ee\u0013\u00ea\u00f5y\u00d5\u008f \u0086\u009c\u00f1\u00f8\u00c2D".length();
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
                    var6_5 = "\u00a6\u00fc\u008cO\u00d4\u0080\u00f6\u00af\u0097\u0087\u000b\u00c8\u00e0$\u00ea\u00d3";
                    var7_6 = "\u00a6\u00fc\u008cO\u00d4\u0080\u00f6\u00af\u0097\u0087\u000b\u00c8\u00e0$\u00ea\u00d3".length();
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
        PolicyConfigurationManager.b = var8_3;
        PolicyConfigurationManager.c = new Integer[10];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PolicyConfigurationManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(PolicyConfigurationManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

