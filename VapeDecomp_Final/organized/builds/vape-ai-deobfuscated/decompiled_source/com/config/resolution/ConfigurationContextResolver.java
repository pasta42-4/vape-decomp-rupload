/*
 * Decompiled with CFR 0.152.
 */
package com.config.resolution;

import a.HK;
import com.collections.management.MultiContainerRegistry;
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
public class ConfigurationContextResolver
extends CryptoProtocolEngine {
    private final HK d;
    private static final Object[] g;
    private static final long[] c;
    private final ReflectionUtilityService E;
    private static final Map f;
    private final ReflectionUtilityService J;
    private final ReflectionUtilityService p;
    private final ReflectionUtilityService O;
    private final ReflectionUtilityService u;
    private final HK i;
    private final HK b;
    private final HK h;
    private final HK r;
    private static int[] W;
    private static final Integer[] e;
    private static final String[] j;
    private static final long a;

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ConfigurationContextResolver.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConfigurationContextResolver.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static void n(ConfigurationContextResolver configurationContextResolver, Object object, boolean bl) {
        configurationContextResolver.B(object, bl);
    }

    public ConfigurationContextResolver() {
        block11: {
            CallSite callSite;
            block9: {
                long l = a ^ 0x11E6C9DA0FFL;
                super(ReflectionMetadataResolver.Pn);
                this.h = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)22042, (long)(0x43B0B45E2AE3B15L ^ l)), (long)-3426379110660863353L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[0], (long)-3426474950326219411L, (long)l);
                this.E = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)13571, (long)(0x4DB83956C90580DL ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l);
                this.O = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)30566, (long)(0x16CE1C04C7AE1A6BL ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l);
                this.J = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)28464, (long)(0x226CED1EBD038236L ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l);
                this.u = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)18197, (long)(0x26D1603942052A10L ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l);
                this.p = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)28944, (long)(0x17F03BA624049C19L ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Boolean.TYPE, (long)-3426431248981610371L, (long)l);
                int[] nArray = ConfigurationContextResolver.n();
                try {
                    ConfigurationContextResolver configurationContextResolver;
                    block10: {
                        try {
                            try {
                                this.i = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)13301, (long)(0x3CF2B88FE1EDDEFEL ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-3426474950326219411L, (long)l);
                                this.r = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)11737, (long)(0x3B3CC419A989C0D1L ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-3426474950326219411L, (long)l);
                                configurationContextResolver = this;
                                callSite = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)15131, (long)(0x6D501674207FD611L ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3426474950326219411L, (long)l);
                                if (nArray != null) break block9;
                                configurationContextResolver.b = callSite;
                                if (GeometryCalculator.C() < 35) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ConfigurationContextResolver.a(customSystemException);
                            }
                            this.d = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)24028, (long)(0x586B4B6E60F0B0D8L ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3426474950326219411L, (long)l);
                            if (nArray == null) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationContextResolver.a(customSystemException);
                        }
                    }
                    configurationContextResolver = this;
                    callSite = ConfigurationContextResolver.c("\u00e4", (Object)this, (Object)ConfigurationContextResolver.c("\u00fd", (int)ConfigurationContextResolver.b("l", (int)19515, (long)(0xFC6F6B1DA80A137L ^ l)), (long)-3426379110660863353L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)-3426474950326219411L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationContextResolver.a(customSystemException);
                }
            }
            configurationContextResolver.d = callSite;
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                ConfigurationContextResolver.W(new int[1]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationContextResolver.a(customSystemException);
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3D7C;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
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
                throw new RuntimeException("a/U9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationContextResolver.e[n2] = n3;
        }
        return e[n2];
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "I'7.";
        objectArray[1] = ".3x\u001f?\u0013%<iPB\u000b6;`\u0019";
        objectArray[2] = Boolean.TYPE;
        ConfigurationContextResolver.j[2] = "java/lang/Boolean";
        objectArray[3] = "\u0007\u001f\u001f#M9\f\u0010\u000el 9\f\r\u001a";
        objectArray[4] = "I#NQ^\u0017<\u0003E^OXQ\u0003EC[M";
        objectArray[5] = ":CL\f";
        objectArray[6] = "L\u001ap";
        objectArray[7] = Integer.TYPE;
        ConfigurationContextResolver.j[7] = "java/lang/Integer";
        objectArray[8] = "<1\u0005\u0000";
        objectArray[9] = "*s;<y$!|*s\u0018**w.)";
        objectArray[10] = "\u0013s>R2\r\u0003x16J`\u0001aiRw\u000b\n\"#67X\u000ej!\r2\u000b@zX\fl\u000eN}5\u0006<\fM\u0013cXb_\byhH\u007f\u001eq(?W6\t\bh>Uc`";
        objectArray[11] = "bZ@-\u0005\u001arQOIawpH\u0017-@\u001c{\u000b]I\u0000O\u007fC_r\u0005\u001c1S&s[\u0019?TKy\u000b\u001b<:\u001b,SLg\u0000@5Y\u001c\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "B\fpxO\u000e\u0011\b!l#\u000e\u0005ww)@\\\u0011\u00101\"\\_~\u00078\"G\u001f\u0015\f{h#";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/U9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static boolean s(ConfigurationContextResolver configurationContextResolver, Object object) {
        return configurationContextResolver.o(object);
    }

    private boolean g(Object object) {
        return this.u.R(object);
    }

    private void B(Object object, boolean bl) {
        this.p.B(object, bl);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private Object n() {
        return this.h.A(new Object[0]);
    }

    static void E(ConfigurationContextResolver configurationContextResolver, Object object, float f) {
        configurationContextResolver.d(object, f);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConfigurationContextResolver.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConfigurationContextResolver.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConfigurationContextResolver.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void u(Object object, float f) {
        this.b.l(object, Float.valueOf(f));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static boolean D(ConfigurationContextResolver configurationContextResolver, Object object) {
        return configurationContextResolver.g(object);
    }

    static boolean G(ConfigurationContextResolver configurationContextResolver, Object object) {
        return configurationContextResolver.A(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ConfigurationContextResolver.a = MultiContainerRegistry.a(-5516462241715674752L, -3777424537792377115L, MethodHandles.lookup().lookupClass()).a(179626676741861L);
                ConfigurationContextResolver.g = new Object[13];
                ConfigurationContextResolver.j = new String[13];
                ConfigurationContextResolver.a();
                ConfigurationContextResolver.f = new HashMap<K, V>(13);
                var0 = ConfigurationContextResolver.a ^ 36021269232852L;
                ConfigurationContextResolver.W(null);
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "y\rYpB\u001e\u0093\u0019^Pe\u0010\u00bd\u00e0Y\t\u00cf\u009f\u00e4Q\u00c1\u0082\u00e5\u00ebW8\u009bP\u00e2U\u00c7\u0017\u009bJ\u0096\u00e7\u0095g#f\u0084F\u00a0t\u00b5,\u00fa\u009b4\u001a\u00b5\u00853\u001e\u00e3B\u00f5\u0096^\u00bd\u00ec\u00af\u00b1Q\u0002n\u00fe\u0013\u00006\u0088t";
                var7_6 = "y\rYpB\u001e\u0093\u0019^Pe\u0010\u00bd\u00e0Y\t\u00cf\u009f\u00e4Q\u00c1\u0082\u00e5\u00ebW8\u009bP\u00e2U\u00c7\u0017\u009bJ\u0096\u00e7\u0095g#f\u0084F\u00a0t\u00b5,\u00fa\u009b4\u001a\u00b5\u00853\u001e\u00e3B\u00f5\u0096^\u00bd\u00ec\u00af\u00b1Q\u0002n\u00fe\u0013\u00006\u0088t".length();
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
                    var6_5 = "\u001d4\u008b\u00cd\u0018U7\u000eQ\u0015\u0014\u00c2\u0003\u0095eC";
                    var7_6 = "\u001d4\u008b\u00cd\u0018U7\u000eQ\u0015\u0014\u00c2\u0003\u0095eC".length();
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
        ConfigurationContextResolver.c = var8_3;
        ConfigurationContextResolver.e = new Integer[11];
    }

    private float b(Object object) {
        return this.r.p(object, new Object[0]);
    }

    private void d(Object object, float f) {
        this.d.l(object, Float.valueOf(f));
    }

    static float n(ConfigurationContextResolver configurationContextResolver, Object object) {
        return configurationContextResolver.b(object);
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

    private boolean Q(Object object) {
        return this.p.R(object);
    }

    private static Field g(long l, long l2) {
        int n = ConfigurationContextResolver.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = ConfigurationContextResolver.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConfigurationContextResolver.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConfigurationContextResolver.c(clazz3, string2, clazz2)) != null) {
                    ConfigurationContextResolver.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConfigurationContextResolver.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConfigurationContextResolver.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConfigurationContextResolver.f(675105134308296L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private float V(Object object) {
        return this.i.p(object, new Object[0]);
    }

    public static int[] n() {
        return W;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/U9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void t(Object object, boolean bl) {
        this.J.B(object, bl);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == '\u00f5' || c == '\u00cc' || c == '\u00f0') {
                field = ConfigurationContextResolver.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConfigurationContextResolver.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean o(Object object) {
        return this.O.R(object);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConfigurationContextResolver.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                ConfigurationContextResolver.g[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static Object z(ConfigurationContextResolver configurationContextResolver) {
        return configurationContextResolver.n();
    }

    static void U(ConfigurationContextResolver configurationContextResolver, Object object, float f) {
        configurationContextResolver.u(object, f);
    }

    static float k(ConfigurationContextResolver configurationContextResolver, Object object) {
        return configurationContextResolver.V(object);
    }

    static void c(ConfigurationContextResolver configurationContextResolver, Object object, boolean bl) {
        configurationContextResolver.t(object, bl);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 11;
                break;
            }
            case 1: {
                n3 = 3;
                break;
            }
            case 2: {
                n3 = 63;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 4: {
                n3 = 10;
                break;
            }
            case 5: {
                n3 = 45;
                break;
            }
            case 6: {
                n3 = 42;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 12;
                break;
            }
            case 9: {
                n3 = 27;
                break;
            }
            case 10: {
                n3 = 44;
                break;
            }
            case 11: {
                n3 = 61;
                break;
            }
            case 12: {
                n3 = 24;
                break;
            }
            case 13: {
                n3 = 62;
                break;
            }
            case 14: {
                n3 = 37;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 23;
                break;
            }
            case 17: {
                n3 = 28;
                break;
            }
            case 18: {
                n3 = 46;
                break;
            }
            case 19: {
                n3 = 43;
                break;
            }
            case 20: {
                n3 = 36;
                break;
            }
            case 21: {
                n3 = 33;
                break;
            }
            case 22: {
                n3 = 7;
                break;
            }
            case 23: {
                n3 = 20;
                break;
            }
            case 24: {
                n3 = 55;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 18;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 47;
                break;
            }
            case 29: {
                n3 = 41;
                break;
            }
            case 30: {
                n3 = 57;
                break;
            }
            case 31: {
                n3 = 26;
                break;
            }
            case 32: {
                n3 = 40;
                break;
            }
            case 33: {
                n3 = 4;
                break;
            }
            case 34: {
                n3 = 56;
                break;
            }
            case 35: {
                n3 = 13;
                break;
            }
            case 36: {
                n3 = 59;
                break;
            }
            case 37: {
                n3 = 22;
                break;
            }
            case 38: {
                n3 = 32;
                break;
            }
            case 39: {
                n3 = 25;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 16;
                break;
            }
            case 42: {
                n3 = 53;
                break;
            }
            case 43: {
                n3 = 17;
                break;
            }
            case 44: {
                n3 = 15;
                break;
            }
            case 45: {
                n3 = 52;
                break;
            }
            case 46: {
                n3 = 2;
                break;
            }
            case 47: {
                n3 = 30;
                break;
            }
            case 48: {
                n3 = 14;
                break;
            }
            case 49: {
                n3 = 9;
                break;
            }
            case 50: {
                n3 = 8;
                break;
            }
            case 51: {
                n3 = 60;
                break;
            }
            case 52: {
                n3 = 48;
                break;
            }
            case 53: {
                n3 = 58;
                break;
            }
            case 54: {
                n3 = 39;
                break;
            }
            case 55: {
                n3 = 49;
                break;
            }
            case 56: {
                n3 = 29;
                break;
            }
            case 57: {
                n3 = 34;
                break;
            }
            case 58: {
                n3 = 19;
                break;
            }
            case 59: {
                n3 = 35;
                break;
            }
            case 60: {
                n3 = 54;
                break;
            }
            case 61: {
                n3 = 31;
                break;
            }
            case 62: {
                n3 = 38;
                break;
            }
            default: {
                n3 = 1;
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
        ConfigurationContextResolver.j[n4] = new String(cArray);
        return n4;
    }

    private boolean A(Object object) {
        return this.E.R(object);
    }

    static boolean c(ConfigurationContextResolver configurationContextResolver, Object object) {
        return configurationContextResolver.S(object);
    }

    static boolean U(ConfigurationContextResolver configurationContextResolver, Object object) {
        return configurationContextResolver.Q(object);
    }

    private boolean S(Object object) {
        return this.J.R(object);
    }

    private static Method h(long l, long l2) {
        int n = ConfigurationContextResolver.e(l, l2);
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
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = ConfigurationContextResolver.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConfigurationContextResolver.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConfigurationContextResolver.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConfigurationContextResolver.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConfigurationContextResolver.f(675105134308296L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConfigurationContextResolver.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConfigurationContextResolver.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConfigurationContextResolver.f(675105134308296L, 0L);
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigurationContextResolver.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static void W(int[] nArray) {
        W = nArray;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigurationContextResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ConfigurationContextResolver.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

