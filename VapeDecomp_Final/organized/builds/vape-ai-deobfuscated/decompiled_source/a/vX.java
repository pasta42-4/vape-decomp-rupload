/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometricCalculator1575;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.state.management.StatefulEventToggle;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vX
extends CryptoProtocolEngine {
    private HK j;
    private static final long[] c;
    final ReflectionUtilityService i;
    private static final Object[] f;
    private static final long b;
    private static final Integer[] d;
    private static final Map e;
    private static final String[] g;
    public HK a;

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D8F;
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
                throw new RuntimeException("a/vX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            vX.d[n2] = n3;
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = vX.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static String T(vX vX2, Object object, Object object2) {
        return vX2.t(object, object2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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
                n3 = 20;
                break;
            }
            case 1: {
                n3 = 32;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 63;
                break;
            }
            case 4: {
                n3 = 18;
                break;
            }
            case 5: {
                n3 = 0;
                break;
            }
            case 6: {
                n3 = 12;
                break;
            }
            case 7: {
                n3 = 51;
                break;
            }
            case 8: {
                n3 = 6;
                break;
            }
            case 9: {
                n3 = 60;
                break;
            }
            case 10: {
                n3 = 59;
                break;
            }
            case 11: {
                n3 = 44;
                break;
            }
            case 12: {
                n3 = 1;
                break;
            }
            case 13: {
                n3 = 61;
                break;
            }
            case 14: {
                n3 = 27;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 17;
                break;
            }
            case 17: {
                n3 = 34;
                break;
            }
            case 18: {
                n3 = 57;
                break;
            }
            case 19: {
                n3 = 43;
                break;
            }
            case 20: {
                n3 = 55;
                break;
            }
            case 21: {
                n3 = 33;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 7;
                break;
            }
            case 24: {
                n3 = 38;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 29;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 58;
                break;
            }
            case 29: {
                n3 = 52;
                break;
            }
            case 30: {
                n3 = 31;
                break;
            }
            case 31: {
                n3 = 37;
                break;
            }
            case 32: {
                n3 = 41;
                break;
            }
            case 33: {
                n3 = 4;
                break;
            }
            case 34: {
                n3 = 26;
                break;
            }
            case 35: {
                n3 = 39;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 10;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 14;
                break;
            }
            case 40: {
                n3 = 40;
                break;
            }
            case 41: {
                n3 = 42;
                break;
            }
            case 42: {
                n3 = 11;
                break;
            }
            case 43: {
                n3 = 54;
                break;
            }
            case 44: {
                n3 = 16;
                break;
            }
            case 45: {
                n3 = 22;
                break;
            }
            case 46: {
                n3 = 49;
                break;
            }
            case 47: {
                n3 = 30;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 47;
                break;
            }
            case 50: {
                n3 = 13;
                break;
            }
            case 51: {
                n3 = 9;
                break;
            }
            case 52: {
                n3 = 28;
                break;
            }
            case 53: {
                n3 = 56;
                break;
            }
            case 54: {
                n3 = 8;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 48;
                break;
            }
            case 57: {
                n3 = 53;
                break;
            }
            case 58: {
                n3 = 62;
                break;
            }
            case 59: {
                n3 = 3;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 19;
                break;
            }
            case 62: {
                n3 = 23;
                break;
            }
            default: {
                n3 = 15;
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
        vX.g[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    public vX() {
        block15: {
            block14: {
                block13: {
                    block12: {
                        var1_1 = vX.b ^ 130969977377173L;
                        v0 = GeometricCalculator1575.o();
                        super(ReflectionMetadataResolver.Yk);
                        var3_2 = v0;
                        try {
                            try {
                                if (var3_2 == null) break block12;
                                if (GeometryCalculator.C() >= 50) {
                                }
                                ** GOTO lbl20
                            }
                            catch (CustomSystemException v1) {
                                throw vX.a(v1);
                            }
                            this.i = vX.c("\u00d6", (Object)this, (Object)vX.c("w", (int)vX.b("l", (int)22191, (long)(1227333673001377142L ^ var1_1)), (long)-6461291763555166856L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Comparator.class, (long)-6461328547561106080L, (long)var1_1);
                        }
                        catch (CustomSystemException v2) {
                            throw vX.a(v2);
                        }
                    }
                    try {
                        if (var3_2 != null) break block13;
lbl20:
                        // 2 sources

                        this.i = vX.c("\u00d6", (Object)this, (Object)vX.c("w", (int)vX.b("l", (int)11527, (long)(8879146961837401821L ^ var1_1)), (long)-6461291763555166856L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.UJ, (long)-6461328547561106080L, (long)var1_1);
                    }
                    catch (CustomSystemException v3) {
                        throw vX.a(v3);
                    }
                }
                try {
                    try {
                        v4 = this;
                        v5 = ((StatefulEventToggle)((StatefulEventToggle)vX.c("\u00d6", (Object)this, (Object)vX.c("w", (int)vX.b("l", (int)7523, (long)(3608871370091075259L ^ var1_1)), (long)-6461291763555166856L, (long)var1_1), String.class, (Object)new Class[]{ReflectionMetadataResolver.rV}, (long)-6461249319451069582L, (long)var1_1).g(GameVersionEnumerator.MC_1_16_5.R(), ReflectionMetadataResolver.V_)).e(GameVersionEnumerator.MC_1_16_5.R(), (String)vX.c("w", (int)vX.b("l", (int)14070, (long)(984756631536254251L ^ var1_1)), (long)-6461291763555166856L, (long)var1_1))).M();
                        if (var3_2 == null) break block14;
                        v4.a = v5;
                        if (!GameVersionEnumerator.MC_1_16_5.H()) break block15;
                    }
                    catch (CustomSystemException v6) {
                        throw vX.a(v6);
                    }
                    v4 = this;
                    v5 = ((StatefulEventToggle)vX.c("\u00d6", (Object)this, (Object)vX.c("w", (int)vX.b("l", (int)5929, (long)(2881489044131978482L ^ var1_1)), (long)-6461291763555166856L, (long)var1_1), (Object)ReflectionMetadataResolver.V_, (Object)new Class[]{ReflectionMetadataResolver.rV, ReflectionMetadataResolver.bg}, (long)-6461249319451069582L, (long)var1_1).H(GameVersionEnumerator.MC_1_20_6.R(), new Class[]{ReflectionMetadataResolver.rV, ReflectionMetadataResolver.Vi}).g(GameVersionEnumerator.MC_1_20_6.R(), ReflectionMetadataResolver.V_)).M();
                }
                catch (CustomSystemException v7) {
                    throw vX.a(v7);
                }
            }
            v4.j = v5;
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = vX.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = vX.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
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

    private static void a() {
        Object[] objectArray = f;
        f[0] = "\u0012i2";
        objectArray[1] = Integer.TYPE;
        vX.g[1] = "java/lang/Integer";
        objectArray[2] = " @,_|\\+O=\u0010\u0001D8H4Y";
        objectArray[3] = "1\u000e;n";
        objectArray[4] = Boolean.TYPE;
        vX.g[4] = "java/lang/Boolean";
        objectArray[5] = "^oHF|'U`Y\t\u0011'U}M";
        objectArray[6] = "\u0004M\u001bP";
        objectArray[7] = "hy\u007fS\u001e$\u001dYt\\\u000fkpYtA\u001b~";
        objectArray[8] = "hQ\u001dg";
        objectArray[9] = "b(Dx\u0011vi'U7pxb,Qm";
        objectArray[10] = "jP|<\bP?F .jwP\u00057*WG9X'j\u0015:j@\")RB.Ns/j\u00014\u0002pi\u0005]4\f.PVW,\\/iR\u0001)@M";
        objectArray[11] = "4\n.78_gY=N=U\nZ`'g@n\u0006<#9.3\u0019&s+Gn\tf1V";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "kC$\"O}>Ux0-uQ\u0016o4\u0010j8K\u007ftR\u0017jK+s\u0014x6K%--*:A-4Op3\u0013%N\u0010e#\u0017w#Qr(\u0016\u0015";
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = vX.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                vX.f[n] = clazz = Class.forName(g[n]);
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

    static Object h(vX vX2, Object object, Object object2, Object object3) {
        return vX2.q(object, object2, object3);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = vX.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = vX.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
            throw new RuntimeException("a/vX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object S() {
        return this.i.Z(null);
    }

    private String t(Object object, Object object2) {
        return (String)this.a.T(object, object2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                vX.b = MultiContainerRegistry.a(5357998551023702843L, 4278498210784566274L, MethodHandles.lookup().lookupClass()).a(60769774971450L);
                vX.f = new Object[13];
                vX.g = new String[13];
                vX.a();
                vX.e = new HashMap<K, V>(13);
                var0 = vX.b ^ 126683417598929L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "`\u00e3v9\u00aa\u00c3N:r\u00e9\u0011dG\u008a\u00db\u00fd\u00da\u0089\u0091\u0082\u0089\u00ff\u00d2i";
                var7_6 = "`\u00e3v9\u00aa\u00c3N:r\u00e9\u0011dG\u008a\u00db\u00fd\u00da\u0089\u0091\u0082\u0089\u00ff\u00d2i".length();
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
                    var6_5 = "\u0081\u0004\u00df\u00f5s\u0084\u00ee\u0006\u00bb3\u00c7\u0098d'[E";
                    var7_6 = "\u0081\u0004\u00df\u00f5s\u0084\u00ee\u0006\u00bb3\u00c7\u0098d'[E".length();
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
        vX.c = var8_3;
        vX.d = new Integer[5];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = vX.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static Object z(vX vX2) {
        return vX2.S();
    }

    private static Field g(long l, long l2) {
        int n = vX.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = vX.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = vX.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = vX.c(clazz3, string2, clazz2)) != null) {
                    vX.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = vX.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        vX.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = vX.f(634201991456811L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private Object q(Object object, Object object2, Object object3) {
        return this.j.T(object, object2, object3);
    }

    private static Method h(long l, long l2) {
        int n = vX.e(l, l2);
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
                clazz3 = vX.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = vX.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = vX.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        vX.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = vX.f(634201991456811L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = vX.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        vX.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = vX.f(634201991456811L, 0L);
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f8' || c == 's' || c == 'r' || c == '\u00cf') {
                field = vX.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = vX.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'w' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(vX.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(vX.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

