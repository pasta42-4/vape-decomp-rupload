/*
 * Decompiled with CFR 0.152.
 */
package com.security.context;

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

public class CryptoContextBroker
extends CryptoProtocolEngine {
    private static final Map e;
    private static final Integer[] d;
    private ReflectionUtilityService V;
    private static final Object[] f;
    private HK T;
    private static final long a;
    private HK B;
    private ReflectionUtilityService c;
    private ReflectionUtilityService G;
    private static final String[] g;
    private static final long[] b;

    static float x(CryptoContextBroker cryptoContextBroker, Object object) {
        return cryptoContextBroker.P(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoContextBroker.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private float P(Object object) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return this.T.p(object, new Object[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextBroker.a(customSystemException);
        }
        return this.c.x(object);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoContextBroker.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoContextBroker.f[n] = clazz = Class.forName(g[n]);
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
                CryptoContextBroker.a = MultiContainerRegistry.a(-2383611073842855973L, 1245580601739284909L, MethodHandles.lookup().lookupClass()).a(175537372742413L);
                CryptoContextBroker.f = new Object[16];
                CryptoContextBroker.g = new String[16];
                CryptoContextBroker.a();
                CryptoContextBroker.e = new HashMap<K, V>(13);
                var0 = CryptoContextBroker.a ^ 126095510612009L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "n\u00aa\u00116\u00b6\u00b8\u00c2\u0082(xR\u00ed\u00fcB\u0016\u0091\u00b2\u0081\u008d\u001a\u001f/mp\u00e1\u00bc\u0092\u00f4\u00a2\u007f\u00d1\u000e\u00a4\u00b72\u009cd^\u00f5\u00f5\u0086U\u001fd\u00fa\u0091 \u0004";
                var7_6 = "n\u00aa\u00116\u00b6\u00b8\u00c2\u0082(xR\u00ed\u00fcB\u0016\u0091\u00b2\u0081\u008d\u001a\u001f/mp\u00e1\u00bc\u0092\u00f4\u00a2\u007f\u00d1\u000e\u00a4\u00b72\u009cd^\u00f5\u00f5\u0086U\u001fd\u00fa\u0091 \u0004".length();
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
                    var6_5 = "\u0010\u00a1\u00df\u00efO\u00e4gZ\u0010\u00b6j\u00db\n+#M";
                    var7_6 = "\u0010\u00a1\u00df\u00efO\u00e4gZ\u0010\u00b6j\u00db\n+#M".length();
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
        CryptoContextBroker.b = var8_3;
        CryptoContextBroker.d = new Integer[8];
    }

    private Object l(Object object) {
        return this.V.Z(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method h(long l, long l2) {
        int n = CryptoContextBroker.e(l, l2);
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
                clazz3 = CryptoContextBroker.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoContextBroker.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoContextBroker.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoContextBroker.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoContextBroker.f(747888513408721L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoContextBroker.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoContextBroker.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoContextBroker.f(747888513408721L, 0L);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoContextBroker.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoContextBroker.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoContextBroker.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static Object S(CryptoContextBroker cryptoContextBroker, Object object) {
        return cryptoContextBroker.l(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static float g(CryptoContextBroker cryptoContextBroker, Object object) {
        return cryptoContextBroker.V(object);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = ")\u001eDo";
        objectArray[1] = "0n2{\\';a#4!?(f*}";
        objectArray[2] = Boolean.TYPE;
        CryptoContextBroker.g[2] = "java/lang/Boolean";
        objectArray[3] = "x\u000bp l*s\u0004ao\u0001*s\u0019u";
        objectArray[4] = "XVGD\u000e?-vLK\u001fp@vLV\u000be";
        objectArray[5] = "\u0015kw%";
        objectArray[6] = "s\r3`r\u0012\u0006-8oc]k-8rwH";
        objectArray[7] = "SQ=";
        objectArray[8] = Integer.TYPE;
        CryptoContextBroker.g[8] = "java/lang/Integer";
        objectArray[9] = "\u000e\u001cwa";
        objectArray[10] = "7m6i:D<b'&[J7i#|";
        objectArray[11] = "nx<]Fp7\u007f+?d@$f(O\u001dz..}?\u0019z;a8UC0a'G\u0005@:3a(U_1%\u001f{FQz8/#\u0007\u0012;^#{\u0004\u0018\"2q}_B@";
        objectArray[12] = "\u000fIB\u007ft(VNU\u001d\\\u0018\u0005MCpowURHf\u0011bFAI#+h\u000e\u00149'+}AQS}a'\u0007.\u0003~kuAASa`c?\u0012@o+~\u000fJ\u0001,j\u0018\u0003\u0012\u0002&stQ\u0014Y|\u0011";
        objectArray[13] = ";\u0014F\u001fk(b\u0013Q}U\u0018q\nR\r0\"{B\u0007}4\"n\rB\u0017nh4K=Gmbf\rR\u0017rips\u0003Mq$3\u0016A\u0013wj\u000b";
        objectArray[14] = "]\u000b:xAB[\\.l*L\u001b`wdN\u0016X\u00000e\u0013K`\u001a3zZ\u0019Z\u0010{/*";
        Object[] objectArray2 = objectArray;
        objectArray[15] = ",^iNR\u0004uY~,f4&ZhAI[vEcW7NeVb\u0012\rD-\u0003\u0012\u0016\rQbFxLG\u000b$9(OMYbVxPFO\u001c\u0007\"S\u000b\fyE|UE4";
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
                n3 = 18;
                break;
            }
            case 1: {
                n3 = 30;
                break;
            }
            case 2: {
                n3 = 5;
                break;
            }
            case 3: {
                n3 = 32;
                break;
            }
            case 4: {
                n3 = 25;
                break;
            }
            case 5: {
                n3 = 1;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 16;
                break;
            }
            case 8: {
                n3 = 50;
                break;
            }
            case 9: {
                n3 = 58;
                break;
            }
            case 10: {
                n3 = 8;
                break;
            }
            case 11: {
                n3 = 56;
                break;
            }
            case 12: {
                n3 = 63;
                break;
            }
            case 13: {
                n3 = 17;
                break;
            }
            case 14: {
                n3 = 15;
                break;
            }
            case 15: {
                n3 = 19;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 11;
                break;
            }
            case 18: {
                n3 = 51;
                break;
            }
            case 19: {
                n3 = 43;
                break;
            }
            case 20: {
                n3 = 53;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 9;
                break;
            }
            case 23: {
                n3 = 59;
                break;
            }
            case 24: {
                n3 = 23;
                break;
            }
            case 25: {
                n3 = 55;
                break;
            }
            case 26: {
                n3 = 57;
                break;
            }
            case 27: {
                n3 = 24;
                break;
            }
            case 28: {
                n3 = 34;
                break;
            }
            case 29: {
                n3 = 28;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 21;
                break;
            }
            case 32: {
                n3 = 44;
                break;
            }
            case 33: {
                n3 = 36;
                break;
            }
            case 34: {
                n3 = 61;
                break;
            }
            case 35: {
                n3 = 29;
                break;
            }
            case 36: {
                n3 = 54;
                break;
            }
            case 37: {
                n3 = 2;
                break;
            }
            case 38: {
                n3 = 14;
                break;
            }
            case 39: {
                n3 = 40;
                break;
            }
            case 40: {
                n3 = 22;
                break;
            }
            case 41: {
                n3 = 42;
                break;
            }
            case 42: {
                n3 = 41;
                break;
            }
            case 43: {
                n3 = 37;
                break;
            }
            case 44: {
                n3 = 0;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 33;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 31;
                break;
            }
            case 49: {
                n3 = 38;
                break;
            }
            case 50: {
                n3 = 26;
                break;
            }
            case 51: {
                n3 = 35;
                break;
            }
            case 52: {
                n3 = 48;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 52;
                break;
            }
            case 55: {
                n3 = 39;
                break;
            }
            case 56: {
                n3 = 60;
                break;
            }
            case 57: {
                n3 = 12;
                break;
            }
            case 58: {
                n3 = 47;
                break;
            }
            case 59: {
                n3 = 46;
                break;
            }
            case 60: {
                n3 = 62;
                break;
            }
            case 61: {
                n3 = 20;
                break;
            }
            case 62: {
                n3 = 4;
                break;
            }
            default: {
                n3 = 27;
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
        CryptoContextBroker.g[n4] = new String(cArray);
        return n4;
    }

    private static Field g(long l, long l2) {
        int n = CryptoContextBroker.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoContextBroker.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoContextBroker.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoContextBroker.c(clazz3, string2, clazz2)) != null) {
                    CryptoContextBroker.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoContextBroker.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoContextBroker.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoContextBroker.f(747888513408721L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptoContextBroker.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoContextBroker.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static float D(CryptoContextBroker cryptoContextBroker, Object object) {
        return cryptoContextBroker.J(object);
    }

    private float V(Object object) {
        return this.G.x(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dc' || c == 'j' || c == '$' || c == 'l') {
                field = CryptoContextBroker.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dc' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoContextBroker.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Unable to fully structure code
     */
    public CryptoContextBroker() {
        block24: {
            block20: {
                block23: {
                    block21: {
                        block22: {
                            var1_1 = CryptoContextBroker.a ^ 2219068497782L;
                            v0 = DynamicTypeRegistry.B();
                            super(ReflectionMetadataResolver.Um);
                            var3_2 = v0;
                            try {
                                try {
                                    try {
                                        try {
                                            if (var3_2 != null) break block20;
                                            if (GeometryCalculator.C() >= 35) {
                                            }
                                            ** GOTO lbl60
                                        }
                                        catch (CustomSystemException v1) {
                                            throw CryptoContextBroker.a(v1);
                                        }
                                        v2 = GameVersionEnumerator.MC_1_21_4.Q();
                                        if (var3_2 != null) break block21;
                                    }
                                    catch (CustomSystemException v3) {
                                        throw CryptoContextBroker.a(v3);
                                    }
                                    if (v2 == 0) break block22;
                                }
                                catch (CustomSystemException v4) {
                                    throw CryptoContextBroker.a(v4);
                                }
                                this.V = CryptoContextBroker.c("\u00f6", (Object)this, (Object)ReflectionMetadataResolver.Vq, (Object)CryptoContextBroker.c("f", (int)CryptoContextBroker.b("f", (int)4224, (long)(8781814400696887999L ^ var1_1)), (long)-2832498201671090454L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.b7, (long)-2832579407308638748L, (long)var1_1);
                            }
                            catch (CustomSystemException v5) {
                                throw CryptoContextBroker.a(v5);
                            }
                        }
                        v2 = GeometryCalculator.C();
                    }
                    try {
                        try {
                            if (var3_2 != null) break block23;
                            if (v2 >= GeometryCalculator.x) {
                            }
                            ** GOTO lbl54
                        }
                        catch (CustomSystemException v6) {
                            throw CryptoContextBroker.a(v6);
                        }
                        v2 = (int)GameVersionEnumerator.MC_1_21_4.Q();
                    }
                    catch (CustomSystemException v7) {
                        throw CryptoContextBroker.a(v7);
                    }
                }
                try {
                    try {
                        try {
                            if (v2 == 0) break block24;
                            this.T = CryptoContextBroker.c("\u00f6", (Object)this, (Object)ReflectionMetadataResolver.b7, (Object)CryptoContextBroker.c("f", (int)CryptoContextBroker.b("f", (int)17201, (long)(1320667466404034828L ^ var1_1)), (long)-2832498201671090454L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-2832655078351024750L, (long)var1_1);
                            this.B = CryptoContextBroker.c("\u00f6", (Object)this, (Object)ReflectionMetadataResolver.b7, (Object)CryptoContextBroker.c("f", (int)CryptoContextBroker.b("f", (int)7389, (long)(7528045562308863718L ^ var1_1)), (long)-2832498201671090454L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-2832655078351024750L, (long)var1_1);
                            if (var3_2 == null) break block24;
                        }
                        catch (CustomSystemException v8) {
                            throw CryptoContextBroker.a(v8);
                        }
lbl54:
                        // 2 sources

                        this.B = CryptoContextBroker.c("\u00f6", (Object)this, (Object)CryptoContextBroker.c("f", (int)CryptoContextBroker.b("f", (int)28014, (long)(1744268130388236119L ^ var1_1)), (long)-2832498201671090454L, (long)var1_1), (boolean)true, Float.TYPE, (Object)new Class[0], (long)-2832282714502386889L, (long)var1_1);
                        this.c = CryptoContextBroker.c("\u00f6", (Object)this, (Object)CryptoContextBroker.c("f", (int)CryptoContextBroker.b("f", (int)14445, (long)(7109941540707598931L ^ var1_1)), (long)-2832498201671090454L, (long)var1_1), (boolean)true, Float.TYPE, (long)-2832732523267767184L, (long)var1_1);
                        if (var3_2 == null) break block24;
                    }
                    catch (CustomSystemException v9) {
                        throw CryptoContextBroker.a(v9);
                    }
lbl60:
                    // 2 sources

                    this.V = CryptoContextBroker.c("\u00f6", (Object)this, (Object)CryptoContextBroker.c("f", (int)CryptoContextBroker.b("f", (int)14356, (long)(1296035850039853614L ^ var1_1)), (long)-2832498201671090454L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.r8, (long)-2832732523267767184L, (long)var1_1);
                    this.G = CryptoContextBroker.c("\u00f6", (Object)this, (Object)CryptoContextBroker.c("f", (int)CryptoContextBroker.b("f", (int)10543, (long)(1650210435887305495L ^ var1_1)), (long)-2832498201671090454L, (long)var1_1), (boolean)true, Float.TYPE, (long)-2832732523267767184L, (long)var1_1);
                }
                catch (CustomSystemException v10) {
                    throw CryptoContextBroker.a(v10);
                }
            }
            this.c = CryptoContextBroker.c("\u00f6", (Object)this, (Object)CryptoContextBroker.c("f", (int)CryptoContextBroker.b("f", (int)2237, (long)(8193497332533047937L ^ var1_1)), (long)-2832498201671090454L, (long)var1_1), (boolean)true, Float.TYPE, (long)-2832732523267767184L, (long)var1_1);
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x628E;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
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
                throw new RuntimeException("a/mT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoContextBroker.d[n2] = n3;
        }
        return d[n2];
    }

    private float J(Object object) {
        return this.B.p(object, new Object[0]);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoContextBroker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoContextBroker.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

