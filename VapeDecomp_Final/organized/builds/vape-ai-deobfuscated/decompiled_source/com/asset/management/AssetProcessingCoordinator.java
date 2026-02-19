/*
 * Decompiled with CFR 0.152.
 */
package com.asset.management;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.invocation.InvocationContextResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AssetProcessingCoordinator
extends CryptoProtocolEngine {
    private static final long[] b;
    private static final long a;
    private ReflectionUtilityService r;
    private ReflectionUtilityService n;
    private static final Integer[] c;
    private static final String[] f;
    private ReflectionUtilityService p;
    private ReflectionUtilityService L;
    private static final Map d;
    private ReflectionUtilityService D;
    private ReflectionUtilityService N;
    private HK P;
    private static final Object[] e;

    public void J(Object object, float f) {
        this.D.H(object, f);
    }

    public float B(Object object) {
        return this.r.x(object);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AssetProcessingCoordinator.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                AssetProcessingCoordinator.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(long l, long l2) {
        int n = AssetProcessingCoordinator.e(l, l2);
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
                clazz3 = AssetProcessingCoordinator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AssetProcessingCoordinator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AssetProcessingCoordinator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        AssetProcessingCoordinator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AssetProcessingCoordinator.f(657731382591794L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AssetProcessingCoordinator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AssetProcessingCoordinator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AssetProcessingCoordinator.f(657731382591794L, 0L);
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
     * Unable to fully structure code
     */
    public AssetProcessingCoordinator() {
        block23: {
            block28: {
                block26: {
                    block27: {
                        block25: {
                            block21: {
                                var1_1 = AssetProcessingCoordinator.a ^ 54334310891674L;
                                v0 = InvocationContextResolver.u();
                                super(ReflectionMetadataResolver.UV);
                                var3_2 = v0;
                                try {
                                    block22: {
                                        try {
                                            try {
                                                v1 = GameVersionEnumerator.MC_1_21_4.H();
                                                if (var3_2 == 0) break block21;
                                                if (v1 == 0) break block22;
                                            }
                                            catch (CustomSystemException v2) {
                                                throw AssetProcessingCoordinator.a(v2);
                                            }
                                            this.p = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)9808, (long)(3845824766411051855L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.UT, (long)-7108171678843396497L, (long)var1_1);
                                            if (var3_2 != 0) break block23;
                                        }
                                        catch (CustomSystemException v3) {
                                            throw AssetProcessingCoordinator.a(v3);
                                        }
                                    }
                                    v1 = GeometryCalculator.C();
                                }
                                catch (CustomSystemException v4) {
                                    throw AssetProcessingCoordinator.a(v4);
                                }
                            }
                            try {
                                block24: {
                                    try {
                                        if (v1 <= 13) break block24;
                                        this.N = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)26495, (long)(2944333162760393325L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                        this.L = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)6155, (long)(3114370655971061015L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                        this.n = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)4809, (long)(1583531831026788308L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                        if (var3_2 != 0) break block25;
                                    }
                                    catch (CustomSystemException v5) {
                                        throw AssetProcessingCoordinator.a(v5);
                                    }
                                }
                                this.N = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)23119, (long)(3562971156766125916L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                this.L = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)19239, (long)(4228265809295998512L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                this.n = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)5092, (long)(1575591121159890677L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                            }
                            catch (CustomSystemException v6) {
                                throw AssetProcessingCoordinator.a(v6);
                            }
                        }
                        try {
                            try {
                                v7 = GeometryCalculator.C();
                                if (var3_2 == 0) break block26;
                                if (v7 <= 13) break block27;
                            }
                            catch (CustomSystemException v8) {
                                throw AssetProcessingCoordinator.a(v8);
                            }
                            this.P = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)7092, (long)(8279683966325468834L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Set.class, (Object)new Class[0], (long)-7108127233700063595L, (long)var1_1);
                        }
                        catch (CustomSystemException v9) {
                            throw AssetProcessingCoordinator.a(v9);
                        }
                    }
                    v7 = (int)TemporalMetadataResolver.h.d();
                }
                try {
                    if (var3_2 == 0) break block28;
                    if (v7 != 0) {
                    }
                    ** GOTO lbl76
                }
                catch (CustomSystemException v10) {
                    throw AssetProcessingCoordinator.a(v10);
                }
                v7 = GeometryCalculator.C();
            }
            try {
                block29: {
                    try {
                        if (v7 <= 13) break block29;
                        this.r = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)14715, (long)(5356126931078810731L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7108171678843396497L, (long)var1_1);
                        this.D = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)6231, (long)(5891545732806192450L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7108171678843396497L, (long)var1_1);
                        if (var3_2 != 0) break block23;
                    }
                    catch (CustomSystemException v11) {
                        throw AssetProcessingCoordinator.a(v11);
                    }
                }
                this.r = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)10904, (long)(3418290195763175308L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (long)-7108171678843396497L, (long)var1_1);
                this.D = AssetProcessingCoordinator.c("s", (Object)this, (Object)AssetProcessingCoordinator.c("K", (int)AssetProcessingCoordinator.b("d", (int)22734, (long)(2285202140274421200L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (long)-7108171678843396497L, (long)var1_1);
            }
            catch (CustomSystemException v12) {
                throw AssetProcessingCoordinator.a(v12);
            }
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AssetProcessingCoordinator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AssetProcessingCoordinator.d(classArray2[i], string, clazz2, n, classArray);
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
                AssetProcessingCoordinator.a = MultiContainerRegistry.a(4917531390748484226L, 6408670226085645470L, MethodHandles.lookup().lookupClass()).a(88756293906038L);
                AssetProcessingCoordinator.e = new Object[13];
                AssetProcessingCoordinator.f = new String[13];
                AssetProcessingCoordinator.a();
                AssetProcessingCoordinator.d = new HashMap<K, V>(13);
                var0 = AssetProcessingCoordinator.a ^ 36081711643727L;
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
                var6_5 = "b\u00f7\u0091b\u00dfaT\u00c9\u0081\u00f5\u00e5\u00ddLhP\u009b(@\u00be\u00af\u00d5\u0015\u0011\u0001\u00fa\u00d5$h\u008a\u00c4\u00e1\u0099\u00d3UE\u00bd,\u001eI\u00af\u00a5\n\u00ee\b/\u00fc\"d\u00c2QD$\u0000\u00f7\u00fe1\u0012\u00eb]:w&\u00b83\u0012g\u0007\u0013F2'\u00b5i[\u0019\u009f\u00b8=Lc";
                var7_6 = "b\u00f7\u0091b\u00dfaT\u00c9\u0081\u00f5\u00e5\u00ddLhP\u009b(@\u00be\u00af\u00d5\u0015\u0011\u0001\u00fa\u00d5$h\u008a\u00c4\u00e1\u0099\u00d3UE\u00bd,\u001eI\u00af\u00a5\n\u00ee\b/\u00fc\"d\u00c2QD$\u0000\u00f7\u00fe1\u0012\u00eb]:w&\u00b83\u0012g\u0007\u0013F2'\u00b5i[\u0019\u009f\u00b8=Lc".length();
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
                    var6_5 = "\u0017\u00e2\u00e9\u008c\f\u00dcbg\u0010+\u00c1x\u00e3\u0015 \u0099";
                    var7_6 = "\u0017\u00e2\u00e9\u008c\f\u00dcbg\u0010+\u00c1x\u00e3\u0015 \u0099".length();
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
        AssetProcessingCoordinator.b = var8_3;
        AssetProcessingCoordinator.c = new Integer[12];
    }

    public Object Q(Object object) {
        return this.p.Z(object);
    }

    public double g(Object object) {
        return this.n.C(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AssetProcessingCoordinator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public double x(Object object) {
        return this.N.C(object);
    }

    public Object P(Object object) {
        return this.P.T(object, new Object[0]);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AssetProcessingCoordinator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public double M(Object object) {
        return this.L.C(object);
    }

    public float b(Object object) {
        return this.D.x(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x284E;
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
                throw new RuntimeException("a/mr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AssetProcessingCoordinator.c[n2] = n3;
        }
        return c[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = AssetProcessingCoordinator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AssetProcessingCoordinator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "<z]$";
        objectArray[1] = "\u0016i\bQ\u000f\"\u001df\u0019\u001er:\u000ea\u0010W";
        objectArray[2] = Boolean.TYPE;
        AssetProcessingCoordinator.f[2] = "java/lang/Boolean";
        objectArray[3] = "\u0019E@fYO\u0012JQ)4O\u0012WE";
        objectArray[4] = "}\\\u0001\u0010sC\b|\n\u001fb\fe|\n\u0002v\u0019";
        objectArray[5] = "J\u0014\"\u001a";
        objectArray[6] = "J^|";
        objectArray[7] = Integer.TYPE;
        AssetProcessingCoordinator.f[7] = "java/lang/Integer";
        objectArray[8] = "3%\fq";
        objectArray[9] = "WVTCWE\\YE\f6KWRAV";
        objectArray[10] = "7{!?[T2k`\u0006$)b:<a\u0004Y>k2xc\u0010 }`z\u001aF<g!\u0006Y\u0019b>16\u000e\u0015#c^<\u001e\u0018a`<9\u0019E`\u0006e{_Ig6&j\u001eF[";
        objectArray[11] = "0?\u001aHYo5/[q:\u0012e~\u0007\u0016\u0006b9/\t\u000fa+'9[\r\u0018};#\u001aq[\"ez\nA\f.$'eL\u0006~90\u0003HQn:B";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "o1z^_\u0002\"az\u001d;\u000f(P;DI\u0018+<i\u0014RYSi:G\\\u0003#5kIEd";
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == '\u00fb' || c == 'I' || c == '\u00e4') {
                field = AssetProcessingCoordinator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AssetProcessingCoordinator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 's' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void X(Object object, float f) {
        this.r.H(object, f);
    }

    private static Field g(long l, long l2) {
        int n = AssetProcessingCoordinator.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = AssetProcessingCoordinator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AssetProcessingCoordinator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AssetProcessingCoordinator.c(clazz3, string2, clazz2)) != null) {
                    AssetProcessingCoordinator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AssetProcessingCoordinator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AssetProcessingCoordinator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AssetProcessingCoordinator.f(657731382591794L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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
                n3 = 61;
                break;
            }
            case 1: {
                n3 = 37;
                break;
            }
            case 2: {
                n3 = 11;
                break;
            }
            case 3: {
                n3 = 58;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 5: {
                n3 = 57;
                break;
            }
            case 6: {
                n3 = 32;
                break;
            }
            case 7: {
                n3 = 23;
                break;
            }
            case 8: {
                n3 = 20;
                break;
            }
            case 9: {
                n3 = 46;
                break;
            }
            case 10: {
                n3 = 50;
                break;
            }
            case 11: {
                n3 = 63;
                break;
            }
            case 12: {
                n3 = 45;
                break;
            }
            case 13: {
                n3 = 17;
                break;
            }
            case 14: {
                n3 = 7;
                break;
            }
            case 15: {
                n3 = 25;
                break;
            }
            case 16: {
                n3 = 3;
                break;
            }
            case 17: {
                n3 = 43;
                break;
            }
            case 18: {
                n3 = 16;
                break;
            }
            case 19: {
                n3 = 30;
                break;
            }
            case 20: {
                n3 = 56;
                break;
            }
            case 21: {
                n3 = 9;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 33;
                break;
            }
            case 25: {
                n3 = 2;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 39;
                break;
            }
            case 28: {
                n3 = 53;
                break;
            }
            case 29: {
                n3 = 27;
                break;
            }
            case 30: {
                n3 = 21;
                break;
            }
            case 31: {
                n3 = 24;
                break;
            }
            case 32: {
                n3 = 44;
                break;
            }
            case 33: {
                n3 = 48;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 18;
                break;
            }
            case 36: {
                n3 = 4;
                break;
            }
            case 37: {
                n3 = 6;
                break;
            }
            case 38: {
                n3 = 0;
                break;
            }
            case 39: {
                n3 = 59;
                break;
            }
            case 40: {
                n3 = 13;
                break;
            }
            case 41: {
                n3 = 14;
                break;
            }
            case 42: {
                n3 = 12;
                break;
            }
            case 43: {
                n3 = 10;
                break;
            }
            case 44: {
                n3 = 8;
                break;
            }
            case 45: {
                n3 = 26;
                break;
            }
            case 46: {
                n3 = 41;
                break;
            }
            case 47: {
                n3 = 31;
                break;
            }
            case 48: {
                n3 = 15;
                break;
            }
            case 49: {
                n3 = 51;
                break;
            }
            case 50: {
                n3 = 22;
                break;
            }
            case 51: {
                n3 = 55;
                break;
            }
            case 52: {
                n3 = 54;
                break;
            }
            case 53: {
                n3 = 42;
                break;
            }
            case 54: {
                n3 = 28;
                break;
            }
            case 55: {
                n3 = 35;
                break;
            }
            case 56: {
                n3 = 38;
                break;
            }
            case 57: {
                n3 = 52;
                break;
            }
            case 58: {
                n3 = 29;
                break;
            }
            case 59: {
                n3 = 47;
                break;
            }
            case 60: {
                n3 = 62;
                break;
            }
            case 61: {
                n3 = 36;
                break;
            }
            case 62: {
                n3 = 60;
                break;
            }
            default: {
                n3 = 40;
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
        AssetProcessingCoordinator.f[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AssetProcessingCoordinator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AssetProcessingCoordinator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

