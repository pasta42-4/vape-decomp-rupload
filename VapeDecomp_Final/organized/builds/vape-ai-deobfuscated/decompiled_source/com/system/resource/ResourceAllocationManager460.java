/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.text.transformation.StringTransformationEngine;
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

public class ResourceAllocationManager460
extends CryptoProtocolEngine {
    private final ReflectionUtilityService v;
    private static final Integer[] d;
    private static final long b;
    private static final Map e;
    private static final String[] g;
    private final ReflectionUtilityService a;
    private ReflectionUtilityService p;
    private static final Object[] f;
    private static final long[] c;

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00df' || c == 'G' || c == 'E' || c == '\u00e4') {
                field = ResourceAllocationManager460.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00df' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceAllocationManager460.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ResourceAllocationManager460.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceAllocationManager460.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceAllocationManager460.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceAllocationManager460.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private Object G(Object object) {
        return this.a.Z(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7780;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/mO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceAllocationManager460.d[n2] = n3;
        }
        return d[n2];
    }

    private static Method h(long l, long l2) {
        int n = ResourceAllocationManager460.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceAllocationManager460.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceAllocationManager460.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceAllocationManager460.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceAllocationManager460.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceAllocationManager460.f(522008286650491L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceAllocationManager460.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceAllocationManager460.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceAllocationManager460.f(522008286650491L, 0L);
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

    private Object U(Object object) {
        return this.p.Z(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    int h(Object object) {
        return this.v.R(object);
    }

    /*
     * Unable to fully structure code
     */
    public ResourceAllocationManager460() {
        block33: {
            block31: {
                block29: {
                    block26: {
                        block28: {
                            var1_1 = ResourceAllocationManager460.b ^ 70507241798841L;
                            v0 = StringTransformationEngine.q();
                            super(ReflectionMetadataResolver.rZ);
                            var3_2 = v0;
                            try {
                                block27: {
                                    try {
                                        try {
                                            try {
                                                v1 = GeometryCalculator.C();
                                                if (var3_2 == null) break block26;
                                                if (v1 >= 15) {
                                                }
                                                ** GOTO lbl34
                                            }
                                            catch (CustomSystemException v2) {
                                                throw ResourceAllocationManager460.a(v2);
                                            }
                                            if (GeometryCalculator.C() < 37) break block27;
                                        }
                                        catch (CustomSystemException v3) {
                                            throw ResourceAllocationManager460.a(v3);
                                        }
                                        this.a = ResourceAllocationManager460.c("\u00ec", (Object)this, (Object)ResourceAllocationManager460.c("\u00d8", (int)ResourceAllocationManager460.b("r", (int)6977, (long)(5461292095065256392L ^ var1_1)), (long)-7131358670504100013L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rR, (long)-7131382994408515244L, (long)var1_1);
                                        if (var3_2 != null) break block28;
                                    }
                                    catch (CustomSystemException v4) {
                                        throw ResourceAllocationManager460.a(v4);
                                    }
                                }
                                this.a = ResourceAllocationManager460.c("\u00ec", (Object)this, (Object)ResourceAllocationManager460.c("\u00d8", (int)ResourceAllocationManager460.b("r", (int)27157, (long)(506555234847424666L ^ var1_1)), (long)-7131358670504100013L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Fz, (long)-7131382994408515244L, (long)var1_1);
                            }
                            catch (CustomSystemException v5) {
                                throw ResourceAllocationManager460.a(v5);
                            }
                        }
                        try {
                            this.v = ResourceAllocationManager460.c("\u00ec", (Object)this, (Object)ResourceAllocationManager460.c("\u00d8", (int)ResourceAllocationManager460.b("r", (int)19392, (long)(609984752136659274L ^ var1_1)), (long)-7131358670504100013L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-7131382994408515244L, (long)var1_1);
                            if (var3_2 != null) break block29;
lbl34:
                            // 2 sources

                            v1 = (int)ObjectLifecycleTracker.U.d();
                        }
                        catch (CustomSystemException v6) {
                            throw ResourceAllocationManager460.a(v6);
                        }
                    }
                    try {
                        block30: {
                            try {
                                if (v1 == 0) break block30;
                                this.a = ResourceAllocationManager460.c("\u00ec", (Object)this, (Object)ResourceAllocationManager460.c("\u00d8", (int)ResourceAllocationManager460.b("r", (int)25358, (long)(3677519954418272645L ^ var1_1)), (long)-7131358670504100013L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Fz, (long)-7131382994408515244L, (long)var1_1);
                                this.v = ResourceAllocationManager460.c("\u00ec", (Object)this, (Object)ResourceAllocationManager460.c("\u00d8", (int)ResourceAllocationManager460.b("r", (int)14923, (long)(3273844139550167239L ^ var1_1)), (long)-7131358670504100013L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-7131382994408515244L, (long)var1_1);
                                if (var3_2 != null) break block29;
                            }
                            catch (CustomSystemException v7) {
                                throw ResourceAllocationManager460.a(v7);
                            }
                        }
                        this.a = ResourceAllocationManager460.c("\u00ec", (Object)this, (Object)ResourceAllocationManager460.c("\u00d8", (int)ResourceAllocationManager460.b("r", (int)20838, (long)(7596240878601911272L ^ var1_1)), (long)-7131358670504100013L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.Fz, (long)-7131382994408515244L, (long)var1_1);
                        this.v = ResourceAllocationManager460.c("\u00ec", (Object)this, (Object)ResourceAllocationManager460.c("\u00d8", (int)ResourceAllocationManager460.b("r", (int)31930, (long)(2273197667983070776L ^ var1_1)), (long)-7131358670504100013L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (long)-7131382994408515244L, (long)var1_1);
                    }
                    catch (CustomSystemException v8) {
                        throw ResourceAllocationManager460.a(v8);
                    }
                }
                try {
                    block32: {
                        try {
                            try {
                                try {
                                    v9 = GeometryCalculator.C();
                                    v10 = 35;
                                    if (var3_2 == null) break block31;
                                    if (v9 < v10) break block32;
                                }
                                catch (CustomSystemException v11) {
                                    throw ResourceAllocationManager460.a(v11);
                                }
                                if (GeometryCalculator.C() >= 50) break block33;
                            }
                            catch (CustomSystemException v12) {
                                throw ResourceAllocationManager460.a(v12);
                            }
                            this.p = ResourceAllocationManager460.c("\u00ec", (Object)this, (Object)ResourceAllocationManager460.c("\u00d8", (int)ResourceAllocationManager460.b("r", (int)8399, (long)(7808444772746611266L ^ var1_1)), (long)-7131358670504100013L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (long)-7131382994408515244L, (long)var1_1);
                            if (var3_2 != null) break block33;
                        }
                        catch (CustomSystemException v13) {
                            throw ResourceAllocationManager460.a(v13);
                        }
                    }
                    v9 = GeometryCalculator.C();
                    v10 = GeometryCalculator.z;
                }
                catch (CustomSystemException v14) {
                    throw ResourceAllocationManager460.a(v14);
                }
            }
            try {
                if (v9 >= v10) {
                    this.p = ResourceAllocationManager460.c("\u00ec", (Object)this, (Object)ResourceAllocationManager460.c("\u00d8", (int)ResourceAllocationManager460.b("r", (int)10651, (long)(8297385472056771347L ^ var1_1)), (long)-7131358670504100013L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (long)-7131382994408515244L, (long)var1_1);
                }
            }
            catch (CustomSystemException v15) {
                throw ResourceAllocationManager460.a(v15);
            }
        }
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "?;U";
        objectArray[1] = Integer.TYPE;
        ResourceAllocationManager460.g[1] = "java/lang/Integer";
        objectArray[2] = "\u0012\u001d\f\nb\u0002\u0019\u0012\u001dE\u001f\u001a\n\u0015\u0014\f";
        objectArray[3] = ")\u0001wv";
        objectArray[4] = Boolean.TYPE;
        ResourceAllocationManager460.g[4] = "java/lang/Boolean";
        objectArray[5] = "#+\u001fcW3($\u000e,:3(9\u001a";
        objectArray[6] = "\u0015dc\u0001";
        objectArray[7] = "T\u007fo\u0000\b\r_p~Oi\u0003T{z\u0015";
        objectArray[8] = "C\u0001\u0002\u0018\u001d\bB\u001e\u001aX`my\\\u0019\u000b\u0005_C\u000f\u001a\b\u001a6C\u001e\u0004\u0005\u001dQ\u0000\f\u000e\n`\r\u001e^\u001fZ\u001cT\u0019\u000f\u0007a\\S\u0007U\u001b\u0010\\S\u0003\t`";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "Q9s\u00106M\u0003 {)mP?.m\u0018mA\u0006<+R\u0006\u0012F8r@<AE;m)";
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static Object m(ResourceAllocationManager460 resourceAllocationManager460, Object object) {
        return resourceAllocationManager460.U(object);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 43;
                break;
            }
            case 1: {
                n3 = 7;
                break;
            }
            case 2: {
                n3 = 32;
                break;
            }
            case 3: {
                n3 = 9;
                break;
            }
            case 4: {
                n3 = 11;
                break;
            }
            case 5: {
                n3 = 59;
                break;
            }
            case 6: {
                n3 = 46;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 44;
                break;
            }
            case 9: {
                n3 = 14;
                break;
            }
            case 10: {
                n3 = 28;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 3;
                break;
            }
            case 13: {
                n3 = 1;
                break;
            }
            case 14: {
                n3 = 52;
                break;
            }
            case 15: {
                n3 = 63;
                break;
            }
            case 16: {
                n3 = 48;
                break;
            }
            case 17: {
                n3 = 8;
                break;
            }
            case 18: {
                n3 = 40;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 20: {
                n3 = 21;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 53;
                break;
            }
            case 23: {
                n3 = 41;
                break;
            }
            case 24: {
                n3 = 15;
                break;
            }
            case 25: {
                n3 = 54;
                break;
            }
            case 26: {
                n3 = 45;
                break;
            }
            case 27: {
                n3 = 17;
                break;
            }
            case 28: {
                n3 = 36;
                break;
            }
            case 29: {
                n3 = 0;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 31;
                break;
            }
            case 32: {
                n3 = 2;
                break;
            }
            case 33: {
                n3 = 62;
                break;
            }
            case 34: {
                n3 = 13;
                break;
            }
            case 35: {
                n3 = 35;
                break;
            }
            case 36: {
                n3 = 29;
                break;
            }
            case 37: {
                n3 = 20;
                break;
            }
            case 38: {
                n3 = 49;
                break;
            }
            case 39: {
                n3 = 5;
                break;
            }
            case 40: {
                n3 = 50;
                break;
            }
            case 41: {
                n3 = 37;
                break;
            }
            case 42: {
                n3 = 19;
                break;
            }
            case 43: {
                n3 = 16;
                break;
            }
            case 44: {
                n3 = 60;
                break;
            }
            case 45: {
                n3 = 25;
                break;
            }
            case 46: {
                n3 = 42;
                break;
            }
            case 47: {
                n3 = 61;
                break;
            }
            case 48: {
                n3 = 33;
                break;
            }
            case 49: {
                n3 = 55;
                break;
            }
            case 50: {
                n3 = 12;
                break;
            }
            case 51: {
                n3 = 18;
                break;
            }
            case 52: {
                n3 = 58;
                break;
            }
            case 53: {
                n3 = 39;
                break;
            }
            case 54: {
                n3 = 26;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 38;
                break;
            }
            case 57: {
                n3 = 6;
                break;
            }
            case 58: {
                n3 = 24;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 56;
                break;
            }
            case 61: {
                n3 = 57;
                break;
            }
            case 62: {
                n3 = 34;
                break;
            }
            default: {
                n3 = 51;
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
        ResourceAllocationManager460.g[n4] = new String(cArray);
        return n4;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceAllocationManager460.b = MultiContainerRegistry.a(-5861214770081213803L, 3769198419541138712L, MethodHandles.lookup().lookupClass()).a(214048856731046L);
                ResourceAllocationManager460.f = new Object[10];
                ResourceAllocationManager460.g = new String[10];
                ResourceAllocationManager460.a();
                ResourceAllocationManager460.e = new HashMap<K, V>(13);
                var0 = ResourceAllocationManager460.b ^ 20081294224240L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = ".;n/\u00cb\u00c5\u009c\u009c\u00daYe\u000b9x\u0092\u00a0\u0005\u00fe\u00dc/\u00a9\u00965\u0003\u0096M\u00e9\u00b8@<>G\u0086E\u008c\u00a9\u00baI\u00b8;0\u00cd;H\u00e8\u0090\u009de\u00e9YB\u0090@\u00dd]\u0012";
                var7_6 = ".;n/\u00cb\u00c5\u009c\u009c\u00daYe\u000b9x\u0092\u00a0\u0005\u00fe\u00dc/\u00a9\u00965\u0003\u0096M\u00e9\u00b8@<>G\u0086E\u008c\u00a9\u00baI\u00b8;0\u00cd;H\u00e8\u0090\u009de\u00e9YB\u0090@\u00dd]\u0012".length();
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
                    var6_5 = "\u00c7^\r\u00fajy\u0004P\\}\u009d\u00a94E\u00d2t";
                    var7_6 = "\u00c7^\r\u00fajy\u0004P\\}\u009d\u00a94E\u00d2t".length();
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
        ResourceAllocationManager460.c = var8_3;
        ResourceAllocationManager460.d = new Integer[9];
    }

    void H(Object object, int n) {
        this.v.t(object, n);
    }

    static Object C(ResourceAllocationManager460 resourceAllocationManager460, Object object) {
        return resourceAllocationManager460.G(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceAllocationManager460.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceAllocationManager460.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceAllocationManager460.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceAllocationManager460.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field g(long l, long l2) {
        int n = ResourceAllocationManager460.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceAllocationManager460.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceAllocationManager460.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceAllocationManager460.c(clazz3, string2, clazz2)) != null) {
                    ResourceAllocationManager460.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceAllocationManager460.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceAllocationManager460.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceAllocationManager460.f(522008286650491L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceAllocationManager460.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ResourceAllocationManager460.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

