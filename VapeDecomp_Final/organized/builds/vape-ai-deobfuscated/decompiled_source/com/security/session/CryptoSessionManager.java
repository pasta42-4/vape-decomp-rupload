/*
 * Decompiled with CFR 0.152.
 */
package com.security.session;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.type.registry.DynamicTypeRegistry;
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

public class CryptoSessionManager
extends CryptoProtocolEngine {
    private HK A;
    private static final long a;
    private ReflectionUtilityService C;
    private static final Integer[] c;
    private static final long[] b;
    private ReflectionUtilityService R;
    private ReflectionUtilityService M;
    private HK h;
    private static final String[] f;
    private static final Object[] e;
    private ReflectionUtilityService Z;
    private static final Map d;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Uc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoSessionManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private float w(Object object) {
        try {
            if (GameVersionEnumerator.MC_1_12_2.H()) {
                return this.Z.x(object);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoSessionManager.a(customSystemException);
        }
        return 0.0f;
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x587B;
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
                throw new RuntimeException("a/Uc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoSessionManager.c[n2] = n3;
        }
        return c[n2];
    }

    private Object Y(Object object) {
        return this.R.Z(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Uc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoSessionManager.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoSessionManager.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static float Q(CryptoSessionManager cryptoSessionManager, Object object) {
        return cryptoSessionManager.w(object);
    }

    public CryptoSessionManager() {
        int n;
        long l;
        block44: {
            block45: {
                String string;
                block38: {
                    int n2;
                    int n3;
                    block41: {
                        block39: {
                            block36: {
                                block37: {
                                    block33: {
                                        block34: {
                                            l = a ^ 0x908A97DA1C0L;
                                            String string2 = DynamicTypeRegistry.B();
                                            super(ReflectionMetadataResolver.Fv);
                                            string = string2;
                                            try {
                                                block35: {
                                                    try {
                                                        try {
                                                            try {
                                                                n3 = GameVersionEnumerator.MC_1_21_4.Q();
                                                                if (string != null) break block33;
                                                                if (n3 == 0) break block34;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptoSessionManager.a(customSystemException);
                                                            }
                                                            if (GeometryCalculator.C() < 50) break block35;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptoSessionManager.a(customSystemException);
                                                        }
                                                        this.h = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)7052, (long)(0x41E8B5B7AFF4972EL ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)-3109307329964186206L, (long)l);
                                                        if (string == null) break block34;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptoSessionManager.a(customSystemException);
                                                    }
                                                }
                                                this.C = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)22821, (long)(0x4ADB6032651CD586L ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, Integer.TYPE, (long)-3109174411869320804L, (long)l);
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptoSessionManager.a(customSystemException);
                                            }
                                        }
                                        n3 = GameVersionEnumerator.MC_1_21_0.H();
                                    }
                                    try {
                                        if (string != null) break block36;
                                        if (n3 == 0) break block37;
                                        break block38;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoSessionManager.a(customSystemException);
                                    }
                                }
                                n3 = GeometryCalculator.C();
                            }
                            try {
                                block40: {
                                    try {
                                        try {
                                            n2 = 50;
                                            if (string != null) break block39;
                                            if (n3 < n2) break block40;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoSessionManager.a(customSystemException);
                                        }
                                        this.R = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)7891, (long)(0x77A68FBA87129279L ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Pa, (long)-3109174411869320804L, (long)l);
                                        this.M = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)5229, (long)(0xA41DFB635D198CBL ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.rM, (long)-3109174411869320804L, (long)l);
                                        if (string == null) break block38;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoSessionManager.a(customSystemException);
                                    }
                                }
                                int n2 = GeometryCalculator.C();
                                n2 = 35;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoSessionManager.a(customSystemException);
                            }
                        }
                        try {
                            block42: {
                                try {
                                    try {
                                        if (string != null) break block41;
                                        if (n3 < n2) break block42;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoSessionManager.a(customSystemException);
                                    }
                                    this.R = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)26902, (long)(0x5A06ED817B7065B6L ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.VA, (long)-3109174411869320804L, (long)l);
                                    this.M = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)3346, (long)(0xCF40FB2E56801B3L ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.Yb, (long)-3109174411869320804L, (long)l);
                                    if (string == null) break block38;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoSessionManager.a(customSystemException);
                                }
                            }
                            int n2 = GeometryCalculator.C();
                            n2 = 23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoSessionManager.a(customSystemException);
                        }
                    }
                    try {
                        block43: {
                            try {
                                if (n3 < n2) break block43;
                                this.R = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)30252, (long)(0x39DCCC28F557FA87L ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.VA, (long)-3109174411869320804L, (long)l);
                                this.M = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)31336, (long)(0x6F4B1EAB4C6FF6CCL ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.En, (long)-3109174411869320804L, (long)l);
                                if (string == null) break block38;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoSessionManager.a(customSystemException);
                            }
                        }
                        this.R = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)6629, (long)(0xBFF0AF41D79954DL ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, Integer.TYPE, (long)-3109174411869320804L, (long)l);
                        this.M = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)20970, (long)(0x4B93B89E9F135D43L ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.En, (long)-3109174411869320804L, (long)l);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoSessionManager.a(customSystemException);
                    }
                }
                try {
                    try {
                        n = GeometryCalculator.C();
                        if (string != null) break block44;
                        if (n >= 50) break block45;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoSessionManager.a(customSystemException);
                    }
                    this.A = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)15340, (long)(0x7A194FA09693374BL ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)-3109307329964186206L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoSessionManager.a(customSystemException);
                }
            }
            n = GameVersionEnumerator.MC_1_12_2.H() ? 1 : 0;
        }
        try {
            if (n != 0) {
                this.Z = CryptoSessionManager.c("H", (Object)this, (Object)CryptoSessionManager.c("\u00d2", (int)CryptoSessionManager.b("z", (int)13217, (long)(0x5967AF1CCF8F3F04L ^ l)), (long)-3109706312542096770L, (long)l), (boolean)true, Float.TYPE, (long)-3109174411869320804L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoSessionManager.a(customSystemException);
        }
    }

    static int N(CryptoSessionManager cryptoSessionManager, Object object, Object object2) {
        return cryptoSessionManager.P(object, object2);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == 'e' || c == '\u00e0' || c == '\u00ee') {
                field = CryptoSessionManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoSessionManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoSessionManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptoSessionManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoSessionManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private int G(Object object) {
        return this.R.R(object);
    }

    static Object j(CryptoSessionManager cryptoSessionManager, Object object) {
        return cryptoSessionManager.Y(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoSessionManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoSessionManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = CryptoSessionManager.e(l, l2);
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
                clazz3 = CryptoSessionManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoSessionManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoSessionManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoSessionManager.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoSessionManager.f(638749747758170L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoSessionManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoSessionManager.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoSessionManager.f(638749747758170L, 0L);
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = " {Q\u0002";
        objectArray[1] = "\u001f7\u0010k!c\u00148\u0001$\\{\u0007?\bm";
        objectArray[2] = Boolean.TYPE;
        CryptoSessionManager.f[2] = "java/lang/Boolean";
        objectArray[3] = "\u001f=\u0001J\u001bn\u00142\u0010\u0005vn\u0014/\u0004";
        objectArray[4] = "os=?~;\u001aS60otwS6-{a";
        objectArray[5] = "UcUd";
        objectArray[6] = ",,A";
        objectArray[7] = Integer.TYPE;
        CryptoSessionManager.f[7] = "java/lang/Integer";
        objectArray[8] = "/i{o";
        objectArray[9] = "\u00076\u001bsyE\f9\n<\u0018K\u00072\u000ef";
        objectArray[10] = "B1G\u0000W+]:\u0006fyE\u0019<A\u000b\u00038GhCZ>|F:RVA<_0Sf\u0004.Y/\u0000\u000fC9C*?\\BxM.@\nR!AP\u0004\u0004_=\u001a4\u0007\u001c\u0007/ ";
        objectArray[11] = "O.f3O]P%'U}3\u0014#`8\u001bNJwbi&\nK%seYJR/rU\u001cXT0!<[ON5\u001eh]JD*f?C\rAO";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "I\u0007BvAI\u000fWFg*\u0019\u000ek\u001f-G\u000bKZKu\u0010\u001cuRNiGO\b\f\u001ak\u0016r";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoSessionManager.a = MultiContainerRegistry.a(-2041036446422820895L, -4411189961619039497L, MethodHandles.lookup().lookupClass()).a(171392288786469L);
                CryptoSessionManager.e = new Object[13];
                CryptoSessionManager.f = new String[13];
                CryptoSessionManager.a();
                CryptoSessionManager.d = new HashMap<K, V>(13);
                var0 = CryptoSessionManager.a ^ 16933014161841L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "\u0017\u00eb\u0090\u0018\u0097\u00821\u00ad\u00e1\u00df$ZE\u00a3\u00fcF\u00ba\u0085\u0092\u00b7\u00e9oHQ\u00e46\u00b8vgs\u00ffB\u000e\u008b_\u001f\u00f6\fl]^q\u00c9\u00fc:\u0018N\u0011\u008aw\u0005H\u00a0\u00c6;\u0097\u00ad\u00f5\u00e4\u0011\u00fb\u00d2\u00f2\u00efl-\u0087Q\u00ea\u009a\u00ea\u009d\u00e1rl\u0097\u00f0\u0093\u008a\u001e";
                var7_6 = "\u0017\u00eb\u0090\u0018\u0097\u00821\u00ad\u00e1\u00df$ZE\u00a3\u00fcF\u00ba\u0085\u0092\u00b7\u00e9oHQ\u00e46\u00b8vgs\u00ffB\u000e\u008b_\u001f\u00f6\fl]^q\u00c9\u00fc:\u0018N\u0011\u008aw\u0005H\u00a0\u00c6;\u0097\u00ad\u00f5\u00e4\u0011\u00fb\u00d2\u00f2\u00efl-\u0087Q\u00ea\u009a\u00ea\u009d\u00e1rl\u0097\u00f0\u0093\u008a\u001e".length();
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
                    var6_5 = "\u00f6Q\u00c9\u0084\u00b0\u00cc\u00c1\u00de\u0086n)E8?0B";
                    var7_6 = "\u00f6Q\u00c9\u0084\u00b0\u00cc\u00c1\u00de\u0086n)E8?0B".length();
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
        CryptoSessionManager.b = var8_3;
        CryptoSessionManager.c = new Integer[12];
    }

    static int o(CryptoSessionManager cryptoSessionManager, Object object) {
        return cryptoSessionManager.u(object);
    }

    static Object t(CryptoSessionManager cryptoSessionManager, Object object) {
        return cryptoSessionManager.U(object);
    }

    private int u(Object object) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return this.h.R(object, new Object[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoSessionManager.a(customSystemException);
        }
        return this.C.R(object);
    }

    private Object U(Object object) {
        return this.M.Z(object);
    }

    private int P(Object object, Object object2) {
        return this.A.R(object, object2);
    }

    private static Field g(long l, long l2) {
        int n = CryptoSessionManager.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoSessionManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoSessionManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoSessionManager.c(clazz3, string2, clazz2)) != null) {
                    CryptoSessionManager.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoSessionManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoSessionManager.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoSessionManager.f(638749747758170L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static int P(CryptoSessionManager cryptoSessionManager, Object object) {
        return cryptoSessionManager.G(object);
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
                n3 = 60;
                break;
            }
            case 1: {
                n3 = 7;
                break;
            }
            case 2: {
                n3 = 45;
                break;
            }
            case 3: {
                n3 = 47;
                break;
            }
            case 4: {
                n3 = 19;
                break;
            }
            case 5: {
                n3 = 35;
                break;
            }
            case 6: {
                n3 = 46;
                break;
            }
            case 7: {
                n3 = 2;
                break;
            }
            case 8: {
                n3 = 27;
                break;
            }
            case 9: {
                n3 = 30;
                break;
            }
            case 10: {
                n3 = 33;
                break;
            }
            case 11: {
                n3 = 8;
                break;
            }
            case 12: {
                n3 = 1;
                break;
            }
            case 13: {
                n3 = 43;
                break;
            }
            case 14: {
                n3 = 39;
                break;
            }
            case 15: {
                n3 = 52;
                break;
            }
            case 16: {
                n3 = 13;
                break;
            }
            case 17: {
                n3 = 49;
                break;
            }
            case 18: {
                n3 = 26;
                break;
            }
            case 19: {
                n3 = 42;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 21;
                break;
            }
            case 22: {
                n3 = 48;
                break;
            }
            case 23: {
                n3 = 23;
                break;
            }
            case 24: {
                n3 = 56;
                break;
            }
            case 25: {
                n3 = 36;
                break;
            }
            case 26: {
                n3 = 34;
                break;
            }
            case 27: {
                n3 = 54;
                break;
            }
            case 28: {
                n3 = 10;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 22;
                break;
            }
            case 31: {
                n3 = 9;
                break;
            }
            case 32: {
                n3 = 11;
                break;
            }
            case 33: {
                n3 = 37;
                break;
            }
            case 34: {
                n3 = 40;
                break;
            }
            case 35: {
                n3 = 17;
                break;
            }
            case 36: {
                n3 = 28;
                break;
            }
            case 37: {
                n3 = 53;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 38;
                break;
            }
            case 40: {
                n3 = 24;
                break;
            }
            case 41: {
                n3 = 62;
                break;
            }
            case 42: {
                n3 = 44;
                break;
            }
            case 43: {
                n3 = 55;
                break;
            }
            case 44: {
                n3 = 32;
                break;
            }
            case 45: {
                n3 = 6;
                break;
            }
            case 46: {
                n3 = 29;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 61;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 18;
                break;
            }
            case 51: {
                n3 = 58;
                break;
            }
            case 52: {
                n3 = 12;
                break;
            }
            case 53: {
                n3 = 31;
                break;
            }
            case 54: {
                n3 = 57;
                break;
            }
            case 55: {
                n3 = 0;
                break;
            }
            case 56: {
                n3 = 59;
                break;
            }
            case 57: {
                n3 = 14;
                break;
            }
            case 58: {
                n3 = 63;
                break;
            }
            case 59: {
                n3 = 3;
                break;
            }
            case 60: {
                n3 = 4;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 25;
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
        CryptoSessionManager.f[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoSessionManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoSessionManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

