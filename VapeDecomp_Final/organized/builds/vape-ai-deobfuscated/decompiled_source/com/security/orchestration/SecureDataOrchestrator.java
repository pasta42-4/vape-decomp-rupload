/*
 * Decompiled with CFR 0.152.
 */
package com.security.orchestration;

import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.invocation.InvocationContextResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
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
public class SecureDataOrchestrator
extends CryptoProtocolEngine {
    private static final Integer[] d;
    private ReflectionUtilityService U;
    private static final Object[] f;
    private static final Map e;
    private ReflectionUtilityService u;
    private ReflectionUtilityService v;
    private ReflectionUtilityService b;
    private ReflectionUtilityService h;
    private static final String[] g;
    private ReflectionUtilityService O;
    private static final long[] c;
    private ReflectionUtilityService B;
    private static final long a;

    public int x(Object object) {
        return this.h.R(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/m6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureDataOrchestrator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureDataOrchestrator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/m6" + " : " + string + " : " + methodType.toString(), exception);
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

    public int Q(Object object) {
        return this.O.R(object);
    }

    private static Method h(long l, long l2) {
        int n = SecureDataOrchestrator.e(l, l2);
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
                clazz3 = SecureDataOrchestrator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureDataOrchestrator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureDataOrchestrator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureDataOrchestrator.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureDataOrchestrator.f(552842314047060L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureDataOrchestrator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureDataOrchestrator.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureDataOrchestrator.f(552842314047060L, 0L);
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
    static {
        block9: {
            block8: {
                SecureDataOrchestrator.a = MultiContainerRegistry.a(456013652332124962L, 8785589649174548451L, MethodHandles.lookup().lookupClass()).a(207734077688836L);
                SecureDataOrchestrator.f = new Object[10];
                SecureDataOrchestrator.g = new String[10];
                SecureDataOrchestrator.a();
                SecureDataOrchestrator.e = new HashMap<K, V>(13);
                var0 = SecureDataOrchestrator.a ^ 79539922166044L;
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
                var8_3 = new long[23];
                var5_4 = 0;
                var6_5 = "\u009a\u009a\u00c9\u0014\u009d\u00f7\u00c2QSe\u00c0|\u00a7\u00f2\u00c5\u00a0\u00b3\b\u001a\u00ac\u00d9W\u00d1Dz\u00e9Q\u0091H\u001dc\u00a4wG\u0096$\u008dI\u00d4k<\u0082\u00e7\u00cbKS\r\u009f#\u00ees&|B\u00c2\u00b0\u00b4\u008d\u00fc\u00ab\u0005\u0091\u001bSP5P\u00e5\u0095\u00b1\u0097]\u008b\u00d6\u008f\u001b\u00d2g\u00b0K?\u00d4\u00ac\u0016I\n\u0099Op\u001d\u00b8:\u009d\b\u0002H\u00f5x\u008d\r\u0097l\u0012\u00c2a\u0092Kb3\u00cb\u00c5\u00d1\r9Y\u008b\u00e88\u00ed\u00d4\u0098,\u001aMW/\u00d2\u0087\u0085\u00a2&j\u00c5\u00b1^\u0014\u0080t\u00f8\u00ed\u00c0\u000fw\u00860\u0019\u00d0\u00c5\u0005\u0015\u00c4\u000f\u00c9#x\u00fa\u00c9#\u00e9\u0095o\u00d4=:P\u008a\u000f\u0015";
                var7_6 = "\u009a\u009a\u00c9\u0014\u009d\u00f7\u00c2QSe\u00c0|\u00a7\u00f2\u00c5\u00a0\u00b3\b\u001a\u00ac\u00d9W\u00d1Dz\u00e9Q\u0091H\u001dc\u00a4wG\u0096$\u008dI\u00d4k<\u0082\u00e7\u00cbKS\r\u009f#\u00ees&|B\u00c2\u00b0\u00b4\u008d\u00fc\u00ab\u0005\u0091\u001bSP5P\u00e5\u0095\u00b1\u0097]\u008b\u00d6\u008f\u001b\u00d2g\u00b0K?\u00d4\u00ac\u0016I\n\u0099Op\u001d\u00b8:\u009d\b\u0002H\u00f5x\u008d\r\u0097l\u0012\u00c2a\u0092Kb3\u00cb\u00c5\u00d1\r9Y\u008b\u00e88\u00ed\u00d4\u0098,\u001aMW/\u00d2\u0087\u0085\u00a2&j\u00c5\u00b1^\u0014\u0080t\u00f8\u00ed\u00c0\u000fw\u00860\u0019\u00d0\u00c5\u0005\u0015\u00c4\u000f\u00c9#x\u00fa\u00c9#\u00e9\u0095o\u00d4=:P\u008a\u000f\u0015".length();
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
                    var6_5 = "[\u0000\u0083\u00fe\u0007<\u0094\u00a2\u009e\u00a7DN\u001d~uh";
                    var7_6 = "[\u0000\u0083\u00fe\u0007<\u0094\u00a2\u009e\u00a7DN\u001d~uh".length();
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
        SecureDataOrchestrator.c = var8_3;
        SecureDataOrchestrator.d = new Integer[23];
    }

    public int f(Object object) {
        return this.u.R(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x58D;
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
                throw new RuntimeException("a/m6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureDataOrchestrator.d[n2] = n3;
        }
        return d[n2];
    }

    public Object f(Object object) {
        return this.v.Z(object);
    }

    /*
     * Unable to fully structure code
     */
    public SecureDataOrchestrator() {
        block28: {
            block34: {
                block32: {
                    block31: {
                        block29: {
                            block26: {
                                var1_1 = SecureDataOrchestrator.a ^ 87836212984443L;
                                v0 = InvocationContextResolver.L();
                                super(ReflectionMetadataResolver.YS);
                                var3_2 = v0;
                                try {
                                    block27: {
                                        try {
                                            try {
                                                v1 = GameVersionEnumerator.MC_1_21_4.H();
                                                if (var3_2 != 0) break block26;
                                                if (v1 == 0) break block27;
                                            }
                                            catch (CustomSystemException v2) {
                                                throw SecureDataOrchestrator.a(v2);
                                            }
                                            this.v = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)11676, (long)(5099362352608969154L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.UT, (long)-6208958560916975834L, (long)var1_1);
                                            this.b = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)25771, (long)(3134402921184315621L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                            if (var3_2 == 0) break block28;
                                        }
                                        catch (CustomSystemException v3) {
                                            throw SecureDataOrchestrator.a(v3);
                                        }
                                    }
                                    v1 = GeometryCalculator.C();
                                }
                                catch (CustomSystemException v4) {
                                    throw SecureDataOrchestrator.a(v4);
                                }
                            }
                            try {
                                block30: {
                                    try {
                                        try {
                                            v5 = 13;
                                            if (var3_2 != 0) break block29;
                                            if (v1 != v5) break block30;
                                        }
                                        catch (CustomSystemException v6) {
                                            throw SecureDataOrchestrator.a(v6);
                                        }
                                        this.b = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)21559, (long)(9106124705781971045L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.h = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)9402, (long)(9161230226479220960L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.O = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)27012, (long)(3883858102276081102L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.u = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)27146, (long)(3968339152390637151L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.U = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)3090, (long)(9204496503097073737L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        this.B = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)7312, (long)(6812699364552650956L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                        if (var3_2 == 0) break block28;
                                    }
                                    catch (CustomSystemException v7) {
                                        throw SecureDataOrchestrator.a(v7);
                                    }
                                }
                                v1 = GeometryCalculator.C();
                                v5 = 35;
                            }
                            catch (CustomSystemException v8) {
                                throw SecureDataOrchestrator.a(v8);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var3_2 != 0) break block31;
                                    if (v1 >= v5) {
                                    }
                                    ** GOTO lbl95
                                }
                                catch (CustomSystemException v9) {
                                    throw SecureDataOrchestrator.a(v9);
                                }
                                this.b = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)23551, (long)(3485936050783647667L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                if (var3_2 != 0) break block32;
                            }
                            catch (CustomSystemException v10) {
                                throw SecureDataOrchestrator.a(v10);
                            }
                            v1 = GeometryCalculator.C();
                            v5 = 37;
                        }
                        catch (CustomSystemException v11) {
                            throw SecureDataOrchestrator.a(v11);
                        }
                    }
                    try {
                        block33: {
                            try {
                                if (v1 < v5) break block33;
                                this.h = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)26008, (long)(4643565182855629257L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                this.O = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)28950, (long)(894795098372955485L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                this.u = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)21009, (long)(2056130863453208152L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                                if (var3_2 == 0) break block34;
                            }
                            catch (CustomSystemException v12) {
                                throw SecureDataOrchestrator.a(v12);
                            }
                        }
                        this.h = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)5812, (long)(8081658489085377259L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                        this.O = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)25747, (long)(5645176637104376000L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
                    }
                    catch (CustomSystemException v13) {
                        throw SecureDataOrchestrator.a(v13);
                    }
                }
                this.u = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)22058, (long)(7913340524076038770L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Double.TYPE, (long)-6208958560916975834L, (long)var1_1);
            }
            try {
                this.U = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)26870, (long)(4395655223494558891L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.B = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)22065, (long)(1451718652858235495L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                if (var3_2 == 0) break block28;
lbl95:
                // 2 sources

                this.b = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)26112, (long)(8720877673817197143L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.h = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)32462, (long)(2901055513395253889L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.O = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)31953, (long)(6042990561125126297L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.u = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)6833, (long)(7955284725646767841L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.U = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)20132, (long)(4048641488986071805L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
                this.B = SecureDataOrchestrator.c("F", (Object)this, (Object)SecureDataOrchestrator.c("\u00cd", (int)SecureDataOrchestrator.b("p", (int)13215, (long)(7056994943159377867L ^ var1_1)), (long)-6209005319716935303L, (long)var1_1), (boolean)true, Byte.TYPE, (long)-6208958560916975834L, (long)var1_1);
            }
            catch (CustomSystemException v14) {
                throw SecureDataOrchestrator.a(v14);
            }
        }
    }

    private static Field g(long l, long l2) {
        int n = SecureDataOrchestrator.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureDataOrchestrator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureDataOrchestrator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureDataOrchestrator.c(clazz3, string2, clazz2)) != null) {
                    SecureDataOrchestrator.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureDataOrchestrator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureDataOrchestrator.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureDataOrchestrator.f(552842314047060L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public byte N(Object object) {
        return (byte)this.U.R(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'B' || c == 'V' || c == '\u00ed' || c == '\u00f1') {
                field = SecureDataOrchestrator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureDataOrchestrator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = SecureDataOrchestrator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "{\u0014A";
        objectArray[1] = Integer.TYPE;
        SecureDataOrchestrator.g[1] = "java/lang/Integer";
        objectArray[2] = "\u0000\u0002U;\\\u001b\u000b\rDt!\u0003\u0018\nM=";
        objectArray[3] = "{jGH";
        objectArray[4] = Boolean.TYPE;
        SecureDataOrchestrator.g[4] = "java/lang/Boolean";
        objectArray[5] = "=c\u0018H\u0007r6l\t\u0007jr6q\u001d";
        objectArray[6] = "\u0007*\u000e\u0017";
        objectArray[7] = "MY-($NFV<gE@M]8=";
        objectArray[8] = "<\u000e%d\f;~P)\u007f0\u000f\u0006\n))W:9](+YT<L*)\r;o\r&m0oa\fulP+f\f9\u0016\f;g\u000erdM8hII";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "N\u0005,4d\u000f\u0017P\u007fR1\f)\u0002!6?\u000eFV|n'w\u0010[#54HGZ!;Z";
    }

    public int l(Object object) {
        return this.b.R(object);
    }

    public byte R(Object object) {
        return (byte)this.B.R(object);
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
                n3 = 35;
                break;
            }
            case 1: {
                n3 = 58;
                break;
            }
            case 2: {
                n3 = 0;
                break;
            }
            case 3: {
                n3 = 56;
                break;
            }
            case 4: {
                n3 = 44;
                break;
            }
            case 5: {
                n3 = 8;
                break;
            }
            case 6: {
                n3 = 51;
                break;
            }
            case 7: {
                n3 = 24;
                break;
            }
            case 8: {
                n3 = 62;
                break;
            }
            case 9: {
                n3 = 49;
                break;
            }
            case 10: {
                n3 = 13;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 21;
                break;
            }
            case 13: {
                n3 = 23;
                break;
            }
            case 14: {
                n3 = 31;
                break;
            }
            case 15: {
                n3 = 38;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 47;
                break;
            }
            case 18: {
                n3 = 42;
                break;
            }
            case 19: {
                n3 = 36;
                break;
            }
            case 20: {
                n3 = 15;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 33;
                break;
            }
            case 25: {
                n3 = 12;
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
                n3 = 16;
                break;
            }
            case 29: {
                n3 = 17;
                break;
            }
            case 30: {
                n3 = 29;
                break;
            }
            case 31: {
                n3 = 59;
                break;
            }
            case 32: {
                n3 = 30;
                break;
            }
            case 33: {
                n3 = 22;
                break;
            }
            case 34: {
                n3 = 39;
                break;
            }
            case 35: {
                n3 = 57;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 40;
                break;
            }
            case 38: {
                n3 = 20;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 45;
                break;
            }
            case 41: {
                n3 = 48;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 61;
                break;
            }
            case 44: {
                n3 = 32;
                break;
            }
            case 45: {
                n3 = 11;
                break;
            }
            case 46: {
                n3 = 60;
                break;
            }
            case 47: {
                n3 = 43;
                break;
            }
            case 48: {
                n3 = 18;
                break;
            }
            case 49: {
                n3 = 55;
                break;
            }
            case 50: {
                n3 = 4;
                break;
            }
            case 51: {
                n3 = 3;
                break;
            }
            case 52: {
                n3 = 19;
                break;
            }
            case 53: {
                n3 = 1;
                break;
            }
            case 54: {
                n3 = 9;
                break;
            }
            case 55: {
                n3 = 37;
                break;
            }
            case 56: {
                n3 = 10;
                break;
            }
            case 57: {
                n3 = 14;
                break;
            }
            case 58: {
                n3 = 46;
                break;
            }
            case 59: {
                n3 = 28;
                break;
            }
            case 60: {
                n3 = 53;
                break;
            }
            case 61: {
                n3 = 50;
                break;
            }
            case 62: {
                n3 = 2;
                break;
            }
            default: {
                n3 = 41;
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
        SecureDataOrchestrator.g[n4] = new String(cArray);
        return n4;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = SecureDataOrchestrator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureDataOrchestrator.d(classArray[i], string, clazz2);
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
            int n = SecureDataOrchestrator.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureDataOrchestrator.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureDataOrchestrator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureDataOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(SecureDataOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

