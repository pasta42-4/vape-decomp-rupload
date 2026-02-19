/*
 * Decompiled with CFR 0.152.
 */
package com.processing.sequence;

import a.KD;
import a.KT;
import a.a;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolResolver;
import com.reflection.utils.ReflectionMetadataResolver1004;
import com.security.cipher.CipherConfigurationManager806;
import com.security.crypto.AdvancedCryptoOrchestrator;
import com.security.crypto.CryptographicContextManager1042;
import com.security.exchange.SecureDataExchanger1038;
import com.security.transformation.SecureDataTransformer1025;
import com.system.orchestration.SystemOrchestrationManager;
import com.system.resources.ResourceAllocationManager2603;
import com.ui.rendering.GraphicalRenderingController;
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

public class TransformationSequenceController
extends NetworkProtocolResolver {
    private static final String[] m;
    private static final Integer[] h;
    private static int Z;
    private static final Map i;
    private static final long b;
    private static final long[] g;
    private static final Object[] l;

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TransformationSequenceController.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = TransformationSequenceController.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TransformationSequenceController.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public TransformationSequenceController() {
        long l = b ^ 0x1407481566A6L;
        super(a.cs((int)TransformationSequenceController.b("e", (int)6036, (long)(0x628EF0C7A549FE91L ^ l))));
        this.E(new AdvancedCryptoOrchestrator((AbstractComputationKernel)GraphicalRenderingController.G, ResourceAllocationManager2603.class, (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)4087, (long)(0x414A9F27904966E1L ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)8166, (long)(0x12FD0B99ED9D76E1L ^ l)), (long)-2661295675435505922L, (long)l)), false).m(CipherConfigurationManager806.RIGHT));
        this.E(new AdvancedCryptoOrchestrator((AbstractComputationKernel)GraphicalRenderingController.G, new CryptographicContextManager1042(this, ResourceAllocationManager2603.class), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)11218, (long)(0x5F880FCB1B9942D4L ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)14300, (long)(0x12B54DF96EC0DED1L ^ l)), (long)-2661295675435505922L, (long)l)), true).m(CipherConfigurationManager806.RIGHT));
        this.E(new AdvancedCryptoOrchestrator((AbstractComputationKernel)GraphicalRenderingController.s4, SystemOrchestrationManager.class, (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)7387, (long)(0x2EB5CACB0ECFF5DFL ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)13231, (long)(0x50D0F8E74FCA5AA1L ^ l)), (long)-2661295675435505922L, (long)l)), false).m(CipherConfigurationManager806.RIGHT));
        this.E(new AdvancedCryptoOrchestrator((AbstractComputationKernel)GraphicalRenderingController.s4, new SecureDataExchanger1038(this, SystemOrchestrationManager.class), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)11269, (long)(0x421407AEC59C4504L ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)13465, (long)(0x762F9EDCCE1FDD96L ^ l)), (long)-2661295675435505922L, (long)l)), false).m(CipherConfigurationManager806.RIGHT));
        this.E(new AdvancedCryptoOrchestrator((AbstractComputationKernel)GraphicalRenderingController.s4, new KD(this, SystemOrchestrationManager.class), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)19487, (long)(0x607C1878C21EA51DL ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)23004, (long)(0x7FDB15303783B0D0L ^ l)), (long)-2661295675435505922L, (long)l)), true).m(CipherConfigurationManager806.RIGHT));
        this.E(new AdvancedCryptoOrchestrator((AbstractComputationKernel)GraphicalRenderingController.s4, new KT(this, SystemOrchestrationManager.class), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)18168, (long)(0x1FA6FDFA68C3AFF2L ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)9723, (long)(0x68292A9F05BFCCEFL ^ l)), (long)-2661295675435505922L, (long)l)), false).H((String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)3109, (long)(0x728D41CE8A71E52EL ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)11989, (long)(0x1CB97D71467747DDL ^ l)), (long)-2661295675435505922L, (long)l))).m(CipherConfigurationManager806.RIGHT));
        this.E(new AdvancedCryptoOrchestrator((AbstractComputationKernel)GraphicalRenderingController.s4, new SecureDataTransformer1025(this, SystemOrchestrationManager.class), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)23590, (long)(0x12ACBB202FF9B52FL ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)13237, (long)(0x17C8DA64391CDAA2L ^ l)), (long)-2661295675435505922L, (long)l)), true).m(CipherConfigurationManager806.RIGHT));
        this.E(new AdvancedCryptoOrchestrator((AbstractComputationKernel)GraphicalRenderingController.s4, new ReflectionMetadataResolver1004(this, SystemOrchestrationManager.class), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)492, (long)(0x737960627FAF68F9L ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)1770, (long)(0x43793FA0DFED6FE9L ^ l)), (long)-2661295675435505922L, (long)l)), false).H((String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)23861, (long)(0x57EF7F656513B435L ^ l)), (long)-2661295675435505922L, (long)l)), (String)((Object)TransformationSequenceController.d("Z", (int)TransformationSequenceController.b("e", (int)11125, (long)(0x7851E1C9971C4267L ^ l)), (long)-2661295675435505922L, (long)l))).Z(true).m(CipherConfigurationManager806.RIGHT));
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3216;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/WD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TransformationSequenceController.h[n2] = n3;
        }
        return h[n2];
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int m() {
        return Z;
    }

    private static Field g(long l, long l2) {
        int n = TransformationSequenceController.e(l, l2);
        Object object = TransformationSequenceController.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = TransformationSequenceController.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TransformationSequenceController.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TransformationSequenceController.c(clazz3, string2, clazz2)) != null) {
                    TransformationSequenceController.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TransformationSequenceController.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TransformationSequenceController.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TransformationSequenceController.f(226219688735170L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/WD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TransformationSequenceController.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TransformationSequenceController.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fd' || c == 'x' || c == 'f' || c == '\u00d1') {
                field = TransformationSequenceController.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TransformationSequenceController.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void i(int n) {
        Z = n;
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

    public static int L() {
        int n = TransformationSequenceController.m();
        try {
            if (n == 0) {
                return 84;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransformationSequenceController.a(customSystemException);
        }
        return 0;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TransformationSequenceController.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = TransformationSequenceController.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 15;
                break;
            }
            case 1: {
                n3 = 55;
                break;
            }
            case 2: {
                n3 = 49;
                break;
            }
            case 3: {
                n3 = 50;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 5: {
                n3 = 7;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 7: {
                n3 = 11;
                break;
            }
            case 8: {
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 5;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 37;
                break;
            }
            case 12: {
                n3 = 14;
                break;
            }
            case 13: {
                n3 = 29;
                break;
            }
            case 14: {
                n3 = 18;
                break;
            }
            case 15: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 46;
                break;
            }
            case 17: {
                n3 = 6;
                break;
            }
            case 18: {
                n3 = 62;
                break;
            }
            case 19: {
                n3 = 54;
                break;
            }
            case 20: {
                n3 = 27;
                break;
            }
            case 21: {
                n3 = 45;
                break;
            }
            case 22: {
                n3 = 30;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 22;
                break;
            }
            case 25: {
                n3 = 21;
                break;
            }
            case 26: {
                n3 = 19;
                break;
            }
            case 27: {
                n3 = 33;
                break;
            }
            case 28: {
                n3 = 52;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 35;
                break;
            }
            case 31: {
                n3 = 42;
                break;
            }
            case 32: {
                n3 = 36;
                break;
            }
            case 33: {
                n3 = 20;
                break;
            }
            case 34: {
                n3 = 43;
                break;
            }
            case 35: {
                n3 = 58;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 10;
                break;
            }
            case 38: {
                n3 = 32;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 9;
                break;
            }
            case 41: {
                n3 = 24;
                break;
            }
            case 42: {
                n3 = 23;
                break;
            }
            case 43: {
                n3 = 38;
                break;
            }
            case 44: {
                n3 = 57;
                break;
            }
            case 45: {
                n3 = 16;
                break;
            }
            case 46: {
                n3 = 59;
                break;
            }
            case 47: {
                n3 = 26;
                break;
            }
            case 48: {
                n3 = 34;
                break;
            }
            case 49: {
                n3 = 12;
                break;
            }
            case 50: {
                n3 = 47;
                break;
            }
            case 51: {
                n3 = 28;
                break;
            }
            case 52: {
                n3 = 0;
                break;
            }
            case 53: {
                n3 = 17;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 60;
                break;
            }
            case 56: {
                n3 = 44;
                break;
            }
            case 57: {
                n3 = 51;
                break;
            }
            case 58: {
                n3 = 48;
                break;
            }
            case 59: {
                n3 = 53;
                break;
            }
            case 60: {
                n3 = 41;
                break;
            }
            case 61: {
                n3 = 3;
                break;
            }
            case 62: {
                n3 = 56;
                break;
            }
            default: {
                n3 = 13;
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
        TransformationSequenceController.m[n4] = new String(cArray);
        return n4;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/WD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = TransformationSequenceController.e(l, l2);
        Object object = TransformationSequenceController.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = TransformationSequenceController.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TransformationSequenceController.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TransformationSequenceController.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        TransformationSequenceController.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TransformationSequenceController.f(226219688735170L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TransformationSequenceController.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TransformationSequenceController.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TransformationSequenceController.f(226219688735170L, 0L);
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
            int n = TransformationSequenceController.e(l, l2);
            object = TransformationSequenceController.l[n];
            try {
                if (!(object instanceof String)) break block2;
                TransformationSequenceController.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TransformationSequenceController.b = MultiContainerRegistry.a(-7684902976218658051L, -1279651621338378792L, MethodHandles.lookup().lookupClass()).a(22354040249437L);
                TransformationSequenceController.l = new Object[5];
                TransformationSequenceController.m = new String[5];
                TransformationSequenceController.b();
                TransformationSequenceController.i = new HashMap<K, V>(13);
                var0 = TransformationSequenceController.b ^ 16153395382184L;
                TransformationSequenceController.i(119);
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
                var8_3 = new long[21];
                var5_4 = 0;
                var6_5 = "\u00bd\u00e5j\u00f6\u00fc\u00c6\u00d6\u00f2+!d@\u00a9\u00fat7S\u0001\u0087i\u008e\u00beb\u0002\u00a1>O\u00fd\u00f3lD,\u0097\u007f\u00e8 \u000b-0\u00a7b\u00f9\u00a7\u00b6\u0090\u001d6>\u00c8'>\u00b3st\u00a3\u00be\u00b1rl\u000f\u00b2X\u00f68l\u00a5%\u00fa\u00a6\u0095\u00e4\u00f1\u00fed\u00b7\u00dd\u008b\u00cf0b\u00da\u0097Yo\u0005\u00cb\u00c0\u0082<-VN=u\u00a6T\u00c9\u00d6\u00d3k\u0016\u00a1\u00e9\u008b\u00a5\u009e\u0090\u00a5\u00c7\u00d2\u0080V\t\u00d1\u0002\u0085\u00f7\u001c\u00b3t\u00fcV-\u0001o\u00c63\u00be\b\u008fF\u00b9\u00a3\u0005\u00e7qg\u0012\u00daV\u0007\u00e7\u00d1L\u00d1\u00cdzX`\u001e\\\u00b4";
                var7_6 = "\u00bd\u00e5j\u00f6\u00fc\u00c6\u00d6\u00f2+!d@\u00a9\u00fat7S\u0001\u0087i\u008e\u00beb\u0002\u00a1>O\u00fd\u00f3lD,\u0097\u007f\u00e8 \u000b-0\u00a7b\u00f9\u00a7\u00b6\u0090\u001d6>\u00c8'>\u00b3st\u00a3\u00be\u00b1rl\u000f\u00b2X\u00f68l\u00a5%\u00fa\u00a6\u0095\u00e4\u00f1\u00fed\u00b7\u00dd\u008b\u00cf0b\u00da\u0097Yo\u0005\u00cb\u00c0\u0082<-VN=u\u00a6T\u00c9\u00d6\u00d3k\u0016\u00a1\u00e9\u008b\u00a5\u009e\u0090\u00a5\u00c7\u00d2\u0080V\t\u00d1\u0002\u0085\u00f7\u001c\u00b3t\u00fcV-\u0001o\u00c63\u00be\b\u008fF\u00b9\u00a3\u0005\u00e7qg\u0012\u00daV\u0007\u00e7\u00d1L\u00d1\u00cdzX`\u001e\\\u00b4".length();
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
                    var6_5 = "C(\t\u00a2\u00ff\u00af?9\u00d2\u00c1\u008c\u0001\u0015\u0083;\u001d";
                    var7_6 = "C(\t\u00a2\u00ff\u00af?9\u00d2\u00c1\u008c\u0001\u0015\u0083;\u001d".length();
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
        TransformationSequenceController.g = var8_3;
        TransformationSequenceController.h = new Integer[21];
    }

    private static void b() {
        Object[] objectArray = l;
        l[0] = "\u0015\u0006O";
        objectArray[1] = Integer.TYPE;
        TransformationSequenceController.m[1] = "java/lang/Integer";
        objectArray[2] = "\u00049\u0018!~k\u000f6\tn\u0003s\u001c1\u0000'";
        objectArray[3] = "q3\u0013EiJz<\u0002\n\bDq7\u0006P";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "(3nx\u007fMb>u\u001a)N\u0019$-z>Hc6+jB\fzei 0Mga*\u001a";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TransformationSequenceController.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(TransformationSequenceController.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

