/*
 * Decompiled with CFR 0.152.
 */
package com.crypto.registry;

import com.app.transformation.GenericDataTransformer;
import com.collections.management.MultiContainerRegistry;
import com.config.loader.BaseConfigurationLoader;
import com.core.resource.AbstractResourceDescriptor;
import com.data.contract.DataTransformationContract2366;
import com.security.encoding.SecurityEncodingRegistry;
import com.security.token.SecureTokenGenerator1501;
import com.token.management.TokenWorkflow;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoAlgorithmRegistry
extends Enum<CryptoAlgorithmRegistry> {
    private static final long[] b;
    private final Map<SecurityEncodingRegistry, List<Class<? extends DataTransformationContract2366>>> V = new HashMap<SecurityEncodingRegistry, List<Class<? extends DataTransformationContract2366>>>();
    private static final Object[] e;
    private static final Map d;
    public static final /* enum */ CryptoAlgorithmRegistry AUTHENTICATED;
    private static final Integer[] c;
    public static final /* enum */ CryptoAlgorithmRegistry UNAUTHENTICATED;
    private static final CryptoAlgorithmRegistry[] M;
    private static final String[] f;
    private static final long a;

    CryptoAlgorithmRegistry(BaseConfigurationLoader baseConfigurationLoader) {
        this();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptoAlgorithmRegistry.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoAlgorithmRegistry.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(long l, long l2) {
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
                n3 = 46;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 27;
                break;
            }
            case 3: {
                n3 = 9;
                break;
            }
            case 4: {
                n3 = 13;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 39;
                break;
            }
            case 7: {
                n3 = 0;
                break;
            }
            case 8: {
                n3 = 59;
                break;
            }
            case 9: {
                n3 = 18;
                break;
            }
            case 10: {
                n3 = 42;
                break;
            }
            case 11: {
                n3 = 58;
                break;
            }
            case 12: {
                n3 = 34;
                break;
            }
            case 13: {
                n3 = 35;
                break;
            }
            case 14: {
                n3 = 20;
                break;
            }
            case 15: {
                n3 = 40;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 32;
                break;
            }
            case 19: {
                n3 = 21;
                break;
            }
            case 20: {
                n3 = 33;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 5;
                break;
            }
            case 23: {
                n3 = 15;
                break;
            }
            case 24: {
                n3 = 41;
                break;
            }
            case 25: {
                n3 = 53;
                break;
            }
            case 26: {
                n3 = 51;
                break;
            }
            case 27: {
                n3 = 44;
                break;
            }
            case 28: {
                n3 = 54;
                break;
            }
            case 29: {
                n3 = 48;
                break;
            }
            case 30: {
                n3 = 37;
                break;
            }
            case 31: {
                n3 = 62;
                break;
            }
            case 32: {
                n3 = 25;
                break;
            }
            case 33: {
                n3 = 14;
                break;
            }
            case 34: {
                n3 = 43;
                break;
            }
            case 35: {
                n3 = 57;
                break;
            }
            case 36: {
                n3 = 28;
                break;
            }
            case 37: {
                n3 = 56;
                break;
            }
            case 38: {
                n3 = 29;
                break;
            }
            case 39: {
                n3 = 38;
                break;
            }
            case 40: {
                n3 = 2;
                break;
            }
            case 41: {
                n3 = 50;
                break;
            }
            case 42: {
                n3 = 24;
                break;
            }
            case 43: {
                n3 = 3;
                break;
            }
            case 44: {
                n3 = 19;
                break;
            }
            case 45: {
                n3 = 8;
                break;
            }
            case 46: {
                n3 = 60;
                break;
            }
            case 47: {
                n3 = 30;
                break;
            }
            case 48: {
                n3 = 6;
                break;
            }
            case 49: {
                n3 = 16;
                break;
            }
            case 50: {
                n3 = 31;
                break;
            }
            case 51: {
                n3 = 63;
                break;
            }
            case 52: {
                n3 = 17;
                break;
            }
            case 53: {
                n3 = 47;
                break;
            }
            case 54: {
                n3 = 12;
                break;
            }
            case 55: {
                n3 = 1;
                break;
            }
            case 56: {
                n3 = 7;
                break;
            }
            case 57: {
                n3 = 26;
                break;
            }
            case 58: {
                n3 = 4;
                break;
            }
            case 59: {
                n3 = 36;
                break;
            }
            case 60: {
                n3 = 10;
                break;
            }
            case 61: {
                n3 = 23;
                break;
            }
            case 62: {
                n3 = 61;
                break;
            }
            default: {
                n3 = 52;
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
        CryptoAlgorithmRegistry.f[n4] = new String(cArray);
        return n4;
    }

    private static Field c(long l, long l2) {
        int n = CryptoAlgorithmRegistry.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoAlgorithmRegistry.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoAlgorithmRegistry.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoAlgorithmRegistry.a(clazz3, string2, clazz2)) != null) {
                    CryptoAlgorithmRegistry.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoAlgorithmRegistry.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoAlgorithmRegistry.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoAlgorithmRegistry.b(273135098732854L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/s3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static CryptoAlgorithmRegistry[] values() {
        return (CryptoAlgorithmRegistry[])M.clone();
    }

    public static CryptoAlgorithmRegistry valueOf(String string) {
        return Enum.valueOf(CryptoAlgorithmRegistry.class, string);
    }

    private static Method d(long l, long l2) {
        int n = CryptoAlgorithmRegistry.a(l, l2);
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
                clazz3 = CryptoAlgorithmRegistry.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoAlgorithmRegistry.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoAlgorithmRegistry.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoAlgorithmRegistry.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoAlgorithmRegistry.b(273135098732854L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoAlgorithmRegistry.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoAlgorithmRegistry.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoAlgorithmRegistry.b(273135098732854L, 0L);
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

    public DataTransformationContract2366 F(SecurityEncodingRegistry securityEncodingRegistry, int n) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        List<Class<? extends DataTransformationContract2366>> list;
        long l;
        block7: {
            l = a ^ 0x263C418DB623L;
            list = this.V.get((Object)securityEncodingRegistry);
            try {
                try {
                    if (n >= 0 && n < list.size()) break block7;
                }
                catch (InstantiationException instantiationException) {
                    throw CryptoAlgorithmRegistry.a(instantiationException);
                }
                throw new RuntimeException((String)((Object)CryptoAlgorithmRegistry.b("\u00c8", (int)CryptoAlgorithmRegistry.a("l", (int)5577, (long)(0x23A2A41FA4ED7C1BL ^ l)), (long)8788571737968450420L, (long)l)) + n + (String)((Object)CryptoAlgorithmRegistry.b("\u00c8", (int)CryptoAlgorithmRegistry.a("l", (int)11518, (long)(0x6561785815D5C52AL ^ l)), (long)8788571737968450420L, (long)l)) + (Object)((Object)securityEncodingRegistry) + (String)((Object)CryptoAlgorithmRegistry.b("\u00c8", (int)CryptoAlgorithmRegistry.a("l", (int)27961, (long)(0x494BA2EAA38104EEL ^ l)), (long)8788571737968450420L, (long)l)));
            }
            catch (InstantiationException instantiationException) {
                throw CryptoAlgorithmRegistry.a(instantiationException);
            }
        }
        Class<? extends DataTransformationContract2366> clazz = list.get(n);
        try {
            if (clazz == null) {
                System.out.println((String)((Object)CryptoAlgorithmRegistry.b("\u00c8", (int)CryptoAlgorithmRegistry.a("l", (int)929, (long)(0x135F49082A1FEA74L ^ l)), (long)8788571737968450420L, (long)l)) + n);
                return null;
            }
        }
        catch (InstantiationException instantiationException) {
            throw CryptoAlgorithmRegistry.a(instantiationException);
        }
        return clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    private CryptoAlgorithmRegistry() {
        for (SecurityEncodingRegistry securityEncodingRegistry : SecurityEncodingRegistry.values()) {
            this.V.put(securityEncodingRegistry, new ArrayList());
        }
        this.Y(SecurityEncodingRegistry.CLIENT, GenericDataTransformer.class);
        this.Y(SecurityEncodingRegistry.SERVER, TokenWorkflow.class);
        this.Y(SecurityEncodingRegistry.CLIENT, SecureTokenGenerator1501.class);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "r0\u000e";
        objectArray[1] = Integer.TYPE;
        CryptoAlgorithmRegistry.f[1] = "java/lang/Integer";
        objectArray[2] = "\u0014\u001d)027\u001f\u00128\u007fO/\f\u001516";
        objectArray[3] = ":\u0007q\u0006+\u00151\b`IJ\u001b:\u0003d\u0013";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "#\u001f25~+!\u000e)Hi4FOq$:&8\u0013*%gO|N.!l7%\u0011|w\u0002";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoAlgorithmRegistry.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoAlgorithmRegistry.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
                CryptoAlgorithmRegistry.a = MultiContainerRegistry.a(-6326800481511960618L, 989228236623666846L, MethodHandles.lookup().lookupClass()).a(79283048427484L);
                var11 = CryptoAlgorithmRegistry.a ^ 124656593461125L;
                CryptoAlgorithmRegistry.e = new Object[5];
                CryptoAlgorithmRegistry.f = new String[5];
                CryptoAlgorithmRegistry.a();
                CryptoAlgorithmRegistry.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[6];
                var3_4 = 0;
                var4_5 = "ZF\\\r\u009eD\u00a5w\u00c4\u00b4\u00c5$\u0087%\u0097Jz_\u00d1\u0015/\\\r\u00e3\u00c419\n\u00b1\u00e0\u00be\u0018";
                var5_6 = "ZF\\\r\u009eD\u00a5w\u00c4\u00b4\u00c5$\u0087%\u0097Jz_\u00d1\u0015/\\\r\u00e3\u00c419\n\u00b1\u00e0\u00be\u0018".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00f11$\u0016\u0094R\u0003'\u0006\u008d\u0003L\u0000\u00eb\u009b\u001c";
                    var5_6 = "\u00f11$\u0016\u0094R\u0003'\u0006\u008d\u0003L\u0000\u00eb\u009b\u001c".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        CryptoAlgorithmRegistry.b = var6_3;
        CryptoAlgorithmRegistry.c = new Integer[6];
        CryptoAlgorithmRegistry.UNAUTHENTICATED = new BaseConfigurationLoader();
        CryptoAlgorithmRegistry.AUTHENTICATED = new AbstractResourceDescriptor();
        CryptoAlgorithmRegistry.M = new CryptoAlgorithmRegistry[]{CryptoAlgorithmRegistry.UNAUTHENTICATED, CryptoAlgorithmRegistry.AUTHENTICATED};
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoAlgorithmRegistry.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    protected void Y(SecurityEncodingRegistry securityEncodingRegistry, Class<? extends DataTransformationContract2366> clazz) {
        List<Class<? extends DataTransformationContract2366>> list = this.V.get((Object)securityEncodingRegistry);
        list.add(clazz);
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/s3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'G' || c == 'c' || c == '\u00f3' || c == '\u00fb') {
                field = CryptoAlgorithmRegistry.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'G' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoAlgorithmRegistry.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoAlgorithmRegistry.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoAlgorithmRegistry.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public int m(SecurityEncodingRegistry securityEncodingRegistry, DataTransformationContract2366 dataTransformationContract2366) {
        List<Class<? extends DataTransformationContract2366>> list = this.V.get((Object)securityEncodingRegistry);
        return list.indexOf(dataTransformationContract2366.getClass());
    }

    private static InstantiationException a(InstantiationException instantiationException) {
        return instantiationException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoAlgorithmRegistry.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1020;
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
                throw new RuntimeException("a/s3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoAlgorithmRegistry.c[n2] = n3;
        }
        return c[n2];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoAlgorithmRegistry.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptoAlgorithmRegistry.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

