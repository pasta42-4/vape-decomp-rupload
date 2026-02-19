/*
 * Decompiled with CFR 0.152.
 */
package com.config.mapping;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.security.resource.SecureResourceManager;
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

public class ConfigurationKeyMapper
extends CryptoProtocolEngine {
    private static final long b;
    private final ReflectionUtilityService d;
    private static final String[] h;
    private static final Map f;
    public final HK q;
    public final HK t;
    private static final long[] c;
    private static final Object[] g;
    private static final Integer[] e;
    public final HK i;
    public final HK T;
    public final HK O;
    public final HK a;
    public final HK y;
    public final HK n;
    public final HK N;

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'N' || c == '\u00dc' || c == 'x' || c == '\u00a4') {
                field = ConfigurationKeyMapper.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'N' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConfigurationKeyMapper.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ConfigurationKeyMapper.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConfigurationKeyMapper.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l, long l2) {
        int n = ConfigurationKeyMapper.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = ConfigurationKeyMapper.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConfigurationKeyMapper.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConfigurationKeyMapper.c(clazz3, string2, clazz2)) != null) {
                    ConfigurationKeyMapper.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConfigurationKeyMapper.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConfigurationKeyMapper.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConfigurationKeyMapper.f(690991870687521L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void A(Object object, boolean bl) {
        this.d.B(object, bl);
    }

    public ConfigurationKeyMapper() {
        long l = b ^ 0xFBCC1DF117EL;
        super(ReflectionMetadataResolver.Y7);
        this.d = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)13808, (long)(0x2120C56C9ED08078L ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Boolean.TYPE, (long)-2978611447413000616L, (long)l);
        this.O = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)6488, (long)(0x6497C78CCD032CD4L ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-2978685131889427507L, (long)l);
        this.N = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)2673, (long)(0x34403D66E28EBFF6L ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l, Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-2978685131889427507L, (long)l);
        this.a = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)29975, (long)(0x51208F6D08C9C099L ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Boolean.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, (long)-2978685131889427507L, (long)l);
        this.n = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)2107, (long)(0x5CA96D125148BDBDL ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l, Double.TYPE, Double.TYPE, Double.TYPE, ReflectionMetadataResolver.bD}, (long)-2978685131889427507L, (long)l);
        this.q = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)9734, (long)(0x346067C50ECF938DL ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l, Double.TYPE, Double.TYPE, Double.TYPE, ReflectionMetadataResolver.bD}, (long)-2978685131889427507L, (long)l);
        this.i = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)12200, (long)(0x4E3B0F5D52471A27L ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l, Double.TYPE, Double.TYPE, Double.TYPE, ReflectionMetadataResolver.bD}, (long)-2978685131889427507L, (long)l);
        this.y = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)6325, (long)(0x22518CB25EC62D38L ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l, Double.TYPE, Double.TYPE, Double.TYPE, ReflectionMetadataResolver.bD}, (long)-2978685131889427507L, (long)l);
        this.t = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)32108, (long)(0xCB7FA92A2E6C8E5L ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l, Double.TYPE, Double.TYPE, Double.TYPE, ReflectionMetadataResolver.bD}, (long)-2978685131889427507L, (long)l);
        this.T = ConfigurationKeyMapper.c("w", (Object)this, (Object)ConfigurationKeyMapper.c("Z", (int)ConfigurationKeyMapper.b("f", (int)8618, (long)(0x734FBF20FCF91420L ^ l)), (long)-2979115684603444953L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.l, Double.TYPE, Double.TYPE, Double.TYPE, ReflectionMetadataResolver.bD}, (long)-2978685131889427507L, (long)l);
        String string = SecureResourceManager.w();
        try {
            if (string != null) {
                AbstractComputationKernel.I(new String[5]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationKeyMapper.a(customSystemException);
        }
    }

    private static Method h(long l, long l2) {
        int n = ConfigurationKeyMapper.e(l, l2);
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
                clazz3 = ConfigurationKeyMapper.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConfigurationKeyMapper.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConfigurationKeyMapper.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConfigurationKeyMapper.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConfigurationKeyMapper.f(690991870687521L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConfigurationKeyMapper.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConfigurationKeyMapper.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConfigurationKeyMapper.f(690991870687521L, 0L);
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

    public boolean I(Object object, Object object2, int n, int n2, int n3, float f, float f2, float f3) {
        return this.a.V(object, object2, n, n2, n3, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConfigurationKeyMapper.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConfigurationKeyMapper.d(classArray2[i], string, clazz2, n, classArray);
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
        MethodHandle methodHandle = ConfigurationKeyMapper.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigurationKeyMapper.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "Y\u001eA(";
        objectArray[1] = "|vx}V!wyi2+9d~`{";
        objectArray[2] = Boolean.TYPE;
        ConfigurationKeyMapper.h[2] = "java/lang/Boolean";
        objectArray[3] = "Rj\u000f]E\u0019Ye\u001e\u0012(\u0019Yx\n";
        objectArray[4] = ",!\u0014'\u0001dY\u0001\u001f(\u0010+4\u0001\u001f5\u0004>";
        objectArray[5] = "b\u001f*#";
        objectArray[6] = "g#9";
        objectArray[7] = Integer.TYPE;
        ConfigurationKeyMapper.h[7] = "java/lang/Integer";
        objectArray[8] = "Ayp\r";
        objectArray[9] = "iWj\u000eIzbX{A(tiS\u007f\u001b";
        objectArray[10] = "5O \u0010QI4\u001a)~j9c\u0018=ESF?RmC-\u00004D6\u0012RZeR<~\u0017C=\u001d \u0004GA9@PE\u0011V1B,\u0014\\[8#k\u0007OK5R1\u000e\u0017WZ";
        objectArray[11] = "mw&=Q/l\"/Sv_; ;hS gjkn-fl|0?R<=j:S\u0017%e%&)G'axVnS3s`kkJ9`\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "\u0003;\u0011ZA?TkQH}1D[\u0012\u000bM6U'JM\u0006b?b\u0014[F$@>^\u000b@Z";
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6324;
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
                throw new RuntimeException("a/q7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationKeyMapper.e[n2] = n3;
        }
        return e[n2];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConfigurationKeyMapper.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                ConfigurationKeyMapper.g[n] = clazz = Class.forName(h[n]);
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
                ConfigurationKeyMapper.b = MultiContainerRegistry.a(-9216310823395826669L, 1518629616661024498L, MethodHandles.lookup().lookupClass()).a(24264442734520L);
                ConfigurationKeyMapper.g = new Object[13];
                ConfigurationKeyMapper.h = new String[13];
                ConfigurationKeyMapper.a();
                ConfigurationKeyMapper.f = new HashMap<K, V>(13);
                var0 = ConfigurationKeyMapper.b ^ 40059605912492L;
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
                var6_5 = "\u0092\u00b1`U\u00f3<\u00c0\u00b75\u001f\u00f2\u00a6iT\u00d2s\u0016\u00d2d\u0087\u00b3\u0097\b\u00ba@^\u00a02\u00e6\u00b7h\u00039\u008b\u00c3\u0003q\u008f7\u009a\u00f0.d`\u0018\u00c7\u00b0\u00b2l\u00da\u0093\u000e\u00fbX\u0097\u008a0\u00f2\u00a2\u00bc+\u008f\u0084e";
                var7_6 = "\u0092\u00b1`U\u00f3<\u00c0\u00b75\u001f\u00f2\u00a6iT\u00d2s\u0016\u00d2d\u0087\u00b3\u0097\b\u00ba@^\u00a02\u00e6\u00b7h\u00039\u008b\u00c3\u0003q\u008f7\u009a\u00f0.d`\u0018\u00c7\u00b0\u00b2l\u00da\u0093\u000e\u00fbX\u0097\u008a0\u00f2\u00a2\u00bc+\u008f\u0084e".length();
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
                    var6_5 = "H)\u00ae\u00c4d\u008e\u00b7\u0007fB\u00dc\u0006\u00dfk`\u00e6";
                    var7_6 = "H)\u00ae\u00c4d\u008e\u00b7\u0007fB\u00dc\u0006\u00dfk`\u00e6".length();
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
        ConfigurationKeyMapper.c = var8_3;
        ConfigurationKeyMapper.e = new Integer[10];
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
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 46;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 20;
                break;
            }
            case 4: {
                n3 = 41;
                break;
            }
            case 5: {
                n3 = 17;
                break;
            }
            case 6: {
                n3 = 42;
                break;
            }
            case 7: {
                n3 = 44;
                break;
            }
            case 8: {
                n3 = 26;
                break;
            }
            case 9: {
                n3 = 13;
                break;
            }
            case 10: {
                n3 = 9;
                break;
            }
            case 11: {
                n3 = 40;
                break;
            }
            case 12: {
                n3 = 0;
                break;
            }
            case 13: {
                n3 = 33;
                break;
            }
            case 14: {
                n3 = 37;
                break;
            }
            case 15: {
                n3 = 51;
                break;
            }
            case 16: {
                n3 = 62;
                break;
            }
            case 17: {
                n3 = 49;
                break;
            }
            case 18: {
                n3 = 23;
                break;
            }
            case 19: {
                n3 = 29;
                break;
            }
            case 20: {
                n3 = 57;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 36;
                break;
            }
            case 23: {
                n3 = 3;
                break;
            }
            case 24: {
                n3 = 31;
                break;
            }
            case 25: {
                n3 = 12;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 5;
                break;
            }
            case 29: {
                n3 = 11;
                break;
            }
            case 30: {
                n3 = 56;
                break;
            }
            case 31: {
                n3 = 60;
                break;
            }
            case 32: {
                n3 = 25;
                break;
            }
            case 33: {
                n3 = 30;
                break;
            }
            case 34: {
                n3 = 38;
                break;
            }
            case 35: {
                n3 = 45;
                break;
            }
            case 36: {
                n3 = 53;
                break;
            }
            case 37: {
                n3 = 4;
                break;
            }
            case 38: {
                n3 = 39;
                break;
            }
            case 39: {
                n3 = 43;
                break;
            }
            case 40: {
                n3 = 61;
                break;
            }
            case 41: {
                n3 = 10;
                break;
            }
            case 42: {
                n3 = 7;
                break;
            }
            case 43: {
                n3 = 6;
                break;
            }
            case 44: {
                n3 = 59;
                break;
            }
            case 45: {
                n3 = 14;
                break;
            }
            case 46: {
                n3 = 47;
                break;
            }
            case 47: {
                n3 = 54;
                break;
            }
            case 48: {
                n3 = 35;
                break;
            }
            case 49: {
                n3 = 48;
                break;
            }
            case 50: {
                n3 = 24;
                break;
            }
            case 51: {
                n3 = 52;
                break;
            }
            case 52: {
                n3 = 34;
                break;
            }
            case 53: {
                n3 = 27;
                break;
            }
            case 54: {
                n3 = 15;
                break;
            }
            case 55: {
                n3 = 28;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 8;
                break;
            }
            case 58: {
                n3 = 16;
                break;
            }
            case 59: {
                n3 = 55;
                break;
            }
            case 60: {
                n3 = 50;
                break;
            }
            case 61: {
                n3 = 22;
                break;
            }
            case 62: {
                n3 = 18;
                break;
            }
            default: {
                n3 = 63;
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
        ConfigurationKeyMapper.h[n4] = new String(cArray);
        return n4;
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigurationKeyMapper.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ConfigurationKeyMapper.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

