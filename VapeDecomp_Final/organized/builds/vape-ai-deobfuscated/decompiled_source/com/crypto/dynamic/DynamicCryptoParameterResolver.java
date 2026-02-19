/*
 * Decompiled with CFR 0.152.
 */
package com.crypto.dynamic;

import a.HK;
import a.qv;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.core.NetworkProtocolManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.security.transform.CryptographicTransformer;
import com.state.management.StatefulEventToggle;
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

public class DynamicCryptoParameterResolver
extends CryptoProtocolEngine {
    private static final Map d;
    private final HK t;
    private static final long a;
    private static final String[] f;
    private static final Object[] e;
    private static final Integer[] c;
    private final HK C;
    private static final long[] b;
    private ReflectionUtilityService n;
    private ReflectionUtilityService Q;

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DynamicCryptoParameterResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicCryptoParameterResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
            if (c == '\u00e4' || c == '\u00c2' || c == '\u00d2' || c == 'G') {
                field = DynamicCryptoParameterResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicCryptoParameterResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public DynamicCryptoParameterResolver() {
        block17: {
            Object object;
            block15: {
                DynamicCryptoParameterResolver dynamicCryptoParameterResolver;
                int n;
                int n2;
                String string;
                long l;
                block13: {
                    block14: {
                        l = a ^ 0x2851BFB21774L;
                        String string2 = qv.h();
                        super(ReflectionMetadataResolver.Et);
                        string = string2;
                        try {
                            try {
                                n2 = GeometryCalculator.C();
                                n = 15;
                                if (string == null) break block13;
                                if (n2 != n) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicCryptoParameterResolver.a(customSystemException);
                            }
                            this.Q = DynamicCryptoParameterResolver.c("\u00e3", (Object)this, (Object)ReflectionMetadataResolver.Et, (Object)DynamicCryptoParameterResolver.c("\u00b5", (int)DynamicCryptoParameterResolver.b("g", (int)31884, (long)(0x4396DF4C264A1CD3L ^ l)), (long)-8412027055819956649L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Y4, (long)-8411931255395614115L, (long)l);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicCryptoParameterResolver.a(customSystemException);
                        }
                    }
                    try {
                        dynamicCryptoParameterResolver = this;
                        object = ((StatefulEventToggle)((StatefulEventToggle)((NetworkProtocolManager)((Object)DynamicCryptoParameterResolver.c("\u00e3", (Object)this, (Object)DynamicCryptoParameterResolver.c("\u00b5", (int)DynamicCryptoParameterResolver.b("g", (int)23438, (long)(0x4BE9FEFC788B3BD7L ^ l)), (long)-8412027055819956649L, (long)l), (Object)ReflectionMetadataResolver.PE, (Object)new Class[]{Integer.TYPE}, (long)-8411985142191950861L, (long)l))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)((Object)DynamicCryptoParameterResolver.c("\u00b5", (int)DynamicCryptoParameterResolver.b("g", (int)25834, (long)(0xB54A362269A04B4L ^ l)), (long)-8412027055819956649L, (long)l)))).V(GameVersionEnumerator.MC_1_21_4.R(), ReflectionMetadataResolver.EV)).M();
                        if (string == null) break block15;
                        dynamicCryptoParameterResolver.t = object;
                        n2 = GeometryCalculator.C();
                        n = 35;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicCryptoParameterResolver.a(customSystemException);
                    }
                }
                try {
                    block16: {
                        try {
                            if (n2 < n) break block16;
                            this.C = DynamicCryptoParameterResolver.c("\u00e3", (Object)this, (Object)DynamicCryptoParameterResolver.c("\u00b5", (int)DynamicCryptoParameterResolver.b("g", (int)7929, (long)(0x29833C2EC17BFEA1L ^ l)), (long)-8412027055819956649L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, ReflectionMetadataResolver.PE}, (long)-8412155049451128018L, (long)l);
                            this.n = DynamicCryptoParameterResolver.c("\u00e3", (Object)this, (Object)ReflectionMetadataResolver.Et, (Object)DynamicCryptoParameterResolver.c("\u00b5", (int)DynamicCryptoParameterResolver.b("g", (int)25235, (long)(0x68092C93C19802CFL ^ l)), (long)-8412027055819956649L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.k, (long)-8411931255395614115L, (long)l);
                            if (string != null) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicCryptoParameterResolver.a(customSystemException);
                        }
                    }
                    dynamicCryptoParameterResolver = this;
                    object = DynamicCryptoParameterResolver.c("\u00e3", (Object)this, (Object)DynamicCryptoParameterResolver.c("\u00b5", (int)DynamicCryptoParameterResolver.b("g", (int)27967, (long)(0x794BFBEEAB4A0D62L ^ l)), (long)-8412027055819956649L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, ReflectionMetadataResolver.PE}, (long)-8412155049451128018L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicCryptoParameterResolver.a(customSystemException);
                }
            }
            dynamicCryptoParameterResolver.C = object;
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                qv.M("JT5P1b");
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicCryptoParameterResolver.a(customSystemException);
        }
    }

    public Object U(Object object, int n) {
        return this.t.T(object, n);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicCryptoParameterResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u001eOs\u0017";
        objectArray[1] = "n[\u001dB\u0015QeT\f\rhIvS\u0005D";
        objectArray[2] = Boolean.TYPE;
        DynamicCryptoParameterResolver.f[2] = "java/lang/Boolean";
        objectArray[3] = "68\u0006\u0011CU=7\u0017^.U=*\u0003";
        objectArray[4] = "_'y]xQ*\u0007rRi\u001eG\u0007rO}\u000b";
        objectArray[5] = "@E1\u007f";
        objectArray[6] = "\u0018\u0015O";
        objectArray[7] = Integer.TYPE;
        DynamicCryptoParameterResolver.f[7] = "java/lang/Integer";
        objectArray[8] = "\u000e\u0018,\u0003dt{8'\fu;\u00168'\u0011a.";
        objectArray[9] = "e\u000b\u0006l";
        objectArray[10] = "J\u000fa\u007f";
        objectArray[11] = "{\\\u0004`,7pS\u0015/M9{X\u0011u";
        objectArray[12] = "\u001d\u0014G\u001fj\u0004\u001c\u0006[|\u0010fGBA\u0019l\u0017\u0011\u0013T\u001dW_\u0018\u000f^G;\u001c\u000e\u001dX|m\u001f\u0017\u0000VM(^\u0019A;Bm\u000f\u001d\u001eV\u0005<\u0002\u0010}\u0000\u0002+VD\u0011R\u0018f\u0006~";
        objectArray[13] = "ft56a\u00008jou\f\u0013!\u0013cds\u0018+u\"{1AZ*asiC+|0fmx";
        objectArray[14] = "W\u0004I\u0016\\@V\u0016Uu\u0003\"\rRO\u0010ZS[\u0003Z\u0014a\u0018M\u0004H\u0018P]\f\n\tu_\u0018]\u000eV\u0018\u0018IP\u00035K\bL\u0004\u0006[\u0019\u0010@Im";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "5.HI9|4<T*U\u001el>]Wi/)\u007fS\u0016\u0004'i=Q\u0011uq8(U*=x$\"\u000fF~n6$4\u0010}w+*\u0005U<yjG\u000b\u0014ey&wWV\u007f|V";
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
                n3 = 63;
                break;
            }
            case 1: {
                n3 = 51;
                break;
            }
            case 2: {
                n3 = 45;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 40;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 49;
                break;
            }
            case 7: {
                n3 = 1;
                break;
            }
            case 8: {
                n3 = 41;
                break;
            }
            case 9: {
                n3 = 9;
                break;
            }
            case 10: {
                n3 = 47;
                break;
            }
            case 11: {
                n3 = 12;
                break;
            }
            case 12: {
                n3 = 46;
                break;
            }
            case 13: {
                n3 = 3;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 25;
                break;
            }
            case 16: {
                n3 = 48;
                break;
            }
            case 17: {
                n3 = 26;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 61;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 57;
                break;
            }
            case 22: {
                n3 = 29;
                break;
            }
            case 23: {
                n3 = 31;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 54;
                break;
            }
            case 26: {
                n3 = 59;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 5;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 36;
                break;
            }
            case 33: {
                n3 = 11;
                break;
            }
            case 34: {
                n3 = 0;
                break;
            }
            case 35: {
                n3 = 21;
                break;
            }
            case 36: {
                n3 = 19;
                break;
            }
            case 37: {
                n3 = 62;
                break;
            }
            case 38: {
                n3 = 7;
                break;
            }
            case 39: {
                n3 = 30;
                break;
            }
            case 40: {
                n3 = 14;
                break;
            }
            case 41: {
                n3 = 18;
                break;
            }
            case 42: {
                n3 = 10;
                break;
            }
            case 43: {
                n3 = 4;
                break;
            }
            case 44: {
                n3 = 55;
                break;
            }
            case 45: {
                n3 = 58;
                break;
            }
            case 46: {
                n3 = 8;
                break;
            }
            case 47: {
                n3 = 32;
                break;
            }
            case 48: {
                n3 = 42;
                break;
            }
            case 49: {
                n3 = 56;
                break;
            }
            case 50: {
                n3 = 6;
                break;
            }
            case 51: {
                n3 = 15;
                break;
            }
            case 52: {
                n3 = 52;
                break;
            }
            case 53: {
                n3 = 24;
                break;
            }
            case 54: {
                n3 = 27;
                break;
            }
            case 55: {
                n3 = 44;
                break;
            }
            case 56: {
                n3 = 34;
                break;
            }
            case 57: {
                n3 = 50;
                break;
            }
            case 58: {
                n3 = 23;
                break;
            }
            case 59: {
                n3 = 39;
                break;
            }
            case 60: {
                n3 = 53;
                break;
            }
            case 61: {
                n3 = 28;
                break;
            }
            case 62: {
                n3 = 22;
                break;
            }
            default: {
                n3 = 43;
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
        DynamicCryptoParameterResolver.f[n4] = new String(cArray);
        return n4;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B1D;
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
                throw new RuntimeException("a/q_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicCryptoParameterResolver.c[n2] = n3;
        }
        return c[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicCryptoParameterResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicCryptoParameterResolver.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicCryptoParameterResolver.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void t(Object object, int n, CryptographicTransformer cryptographicTransformer) {
        try {
            if (GeometryCalculator.C() >= 50) {
                this.C.l(object, cryptographicTransformer.M());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicCryptoParameterResolver.a(customSystemException);
        }
        this.C.l(object, n, cryptographicTransformer.M());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field g(long l, long l2) {
        int n = DynamicCryptoParameterResolver.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicCryptoParameterResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicCryptoParameterResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicCryptoParameterResolver.c(clazz3, string2, clazz2)) != null) {
                    DynamicCryptoParameterResolver.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicCryptoParameterResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicCryptoParameterResolver.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicCryptoParameterResolver.f(801979943554806L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public Object n(Object object) {
        return this.n.Z(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicCryptoParameterResolver.a = MultiContainerRegistry.a(1922755368670258653L, -4660501329375851142L, MethodHandles.lookup().lookupClass()).a(271390524848263L);
                DynamicCryptoParameterResolver.e = new Object[16];
                DynamicCryptoParameterResolver.f = new String[16];
                DynamicCryptoParameterResolver.a();
                DynamicCryptoParameterResolver.d = new HashMap<K, V>(13);
                var0 = DynamicCryptoParameterResolver.a ^ 36911977155828L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "79\u00dc\u00b6\u00b03\u0000\u00d42\u00f0\u00b3\u00cf\u00f5&C\u0095\u0098\u00be\u00dc\u00f1\u0006\u0086\u00809b\u00d8K?\u00c6\u00bc-\u00da";
                var7_6 = "79\u00dc\u00b6\u00b03\u0000\u00d42\u00f0\u00b3\u00cf\u00f5&C\u0095\u0098\u00be\u00dc\u00f1\u0006\u0086\u00809b\u00d8K?\u00c6\u00bc-\u00da".length();
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
                    var6_5 = "\u0080\u0080XZyC\u00fd7\u0001_\u0095v\u00ed\u00aaB!";
                    var7_6 = "\u0080\u0080XZyC\u00fd7\u0001_\u0095v\u00ed\u00aaB!".length();
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
        DynamicCryptoParameterResolver.b = var8_3;
        DynamicCryptoParameterResolver.c = new Integer[6];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicCryptoParameterResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicCryptoParameterResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object V(Object object) {
        return this.Q.Z(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l, long l2) {
        int n = DynamicCryptoParameterResolver.e(l, l2);
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
                clazz3 = DynamicCryptoParameterResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicCryptoParameterResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicCryptoParameterResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicCryptoParameterResolver.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicCryptoParameterResolver.f(801979943554806L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicCryptoParameterResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicCryptoParameterResolver.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicCryptoParameterResolver.f(801979943554806L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicCryptoParameterResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicCryptoParameterResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

