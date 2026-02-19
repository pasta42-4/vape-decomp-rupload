/*
 * Decompiled with CFR 0.152.
 */
package com.security.decryption;

import a.HK;
import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
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

public class MultiProtocolDecryptionEngine
extends CryptoProtocolEngine {
    private static final Object[] f;
    private final ReflectionUtilityService K;
    private final HK U;
    private final HK X;
    private ReflectionUtilityService H;
    public final HK A;
    private final ReflectionUtilityService d;
    private HK v;
    private final HK w;
    private static final long[] b;
    private static final Integer[] c;
    private final ReflectionUtilityService h;
    private static final Map e;
    private static final String[] g;
    private static final long a;
    private HK S;

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultiProtocolDecryptionEngine.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultiProtocolDecryptionEngine.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
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

    public void d(Object object, double d2) {
        this.K.A(object, d2);
    }

    public double m(Object object) {
        return this.K.C(object);
    }

    public Object G(double d2, double d3, double d4) {
        return this.A.A(d2, d3, d4);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultiProtocolDecryptionEngine.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = MultiProtocolDecryptionEngine.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultiProtocolDecryptionEngine.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
                MultiProtocolDecryptionEngine.a = MultiContainerRegistry.a(-7722093061672101790L, 7019149441083637948L, MethodHandles.lookup().lookupClass()).a(275588890191961L);
                MultiProtocolDecryptionEngine.f = new Object[18];
                MultiProtocolDecryptionEngine.g = new String[18];
                MultiProtocolDecryptionEngine.a();
                MultiProtocolDecryptionEngine.e = new HashMap<K, V>(13);
                var0 = MultiProtocolDecryptionEngine.a ^ 24967148429883L;
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
                var8_3 = new long[16];
                var5_4 = 0;
                var6_5 = "\u00fa\u00daqN\u00ac|\u00f9\u00d4jx\u00d1\u001e\u0093\u00a7s\u0013E\u0006\r\u00e3\u0002\u00dd\u00eb\th\u008a7\u00ad\u00c6\u0080\u0014\u00feb\u0005\u008dm\u0088Dk\u00e0\u0092\u00d5\u0015\u0083\u0019\u00d7\u00d6ks\u00a3\u00efs\u00e8=\u00b9]*\u00d5\u00b7L\u000fs=\u00c0)\u00f4Z\u0013\u0012\u009b\u008f\u0081(\u00be\u0003\u0085;\u0098\u00c7\u009b\u009d\u001e\u00afj\u0087-a\u0089\u00a4\u00cb\u001b\u00e4/d\u00f9-\u00d2\u00a0q\"\u008d\u0091\u0006+\u00cb\u00e2\u00e4\u00f8v!o\u0096";
                var7_6 = "\u00fa\u00daqN\u00ac|\u00f9\u00d4jx\u00d1\u001e\u0093\u00a7s\u0013E\u0006\r\u00e3\u0002\u00dd\u00eb\th\u008a7\u00ad\u00c6\u0080\u0014\u00feb\u0005\u008dm\u0088Dk\u00e0\u0092\u00d5\u0015\u0083\u0019\u00d7\u00d6ks\u00a3\u00efs\u00e8=\u00b9]*\u00d5\u00b7L\u000fs=\u00c0)\u00f4Z\u0013\u0012\u009b\u008f\u0081(\u00be\u0003\u0085;\u0098\u00c7\u009b\u009d\u001e\u00afj\u0087-a\u0089\u00a4\u00cb\u001b\u00e4/d\u00f9-\u00d2\u00a0q\"\u008d\u0091\u0006+\u00cb\u00e2\u00e4\u00f8v!o\u0096".length();
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
                    var6_5 = "4\u00b4M\u00e1d\t\u00d1\u00f6\u00b0yO@e\u0003\u00d3\u009d";
                    var7_6 = "4\u00b4M\u00e1d\t\u00d1\u00f6\u00b0yO@e\u0003\u00d3\u009d".length();
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
        MultiProtocolDecryptionEngine.b = var8_3;
        MultiProtocolDecryptionEngine.c = new Integer[16];
    }

    public void h(Object object, double d2) {
        this.h.A(object, d2);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "#rmA";
        objectArray[1] = "\rHH['\u0013\u0006GY\u0014Z\u000b\u0015@P]";
        objectArray[2] = Boolean.TYPE;
        MultiProtocolDecryptionEngine.g[2] = "java/lang/Boolean";
        objectArray[3] = "\u00196 &/#\u001291iB#\u0012$%";
        objectArray[4] = "\u0005 \u0016Yqvp\u0000\u001dV`9\u001d\u0000\u001dKt,";
        objectArray[5] = "[\u0014\u000eV";
        objectArray[6] = "|\u0014J";
        objectArray[7] = Integer.TYPE;
        MultiProtocolDecryptionEngine.g[7] = "java/lang/Integer";
        objectArray[8] = "/\u001bf8";
        objectArray[9] = "b|]c";
        objectArray[10] = "4I\t\b5`Ai\u0002\u0007$/,i\u0002\u001a0:";
        objectArray[11] = "]G:\\";
        objectArray[12] = "\fT\u000e0go\u0007[\u001f\u007f\u0006a\fP\u001b%";
        objectArray[13] = "h/\u000fz\b <{@\u00001O`8\u0010\u007f\u00151}6\u0017\u0000Lvlp\u0013g\u001btnzq:\u000e\u007fmt\nnL.uJN8\u0016#|$H8\u001d4\u0007q\u0000d\u001fqu{\u0012>\u0007O";
        objectArray[14] = "Yr*s+\u0016\r&e\t\u000eyQe5v6\u0007Lk2\to@]-6n8B_'T3-I\\)/go\u0018D\u0017j2*\u0005Y,d4'\u000b6";
        objectArray[15] = "CM\u0006R0y\u0017\u0019I(\u0016\u0016KZ\u0019W-hVT\u001e(tn\u001cBFS ,MZx\u0016%'KJ\u0003J\u007fkC(";
        objectArray[16] = "#\u001aQEj\u000fvAXY\u0012\u0014d+\u0017Bp\u0000qE\u0016Vv\u0012\u001fLXIm\u001caQVN\u0012";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "6Pl!'>b\u0004#[;Q>Gs$:/#It[c)i_, 7k8G\u0012da15N|ba:\"5-*;+(\\s1:*Y";
    }

    private static Method h(long l, long l2) {
        int n = MultiProtocolDecryptionEngine.e(l, l2);
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
                clazz3 = MultiProtocolDecryptionEngine.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultiProtocolDecryptionEngine.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultiProtocolDecryptionEngine.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultiProtocolDecryptionEngine.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultiProtocolDecryptionEngine.f(906157348352929L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultiProtocolDecryptionEngine.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultiProtocolDecryptionEngine.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultiProtocolDecryptionEngine.f(906157348352929L, 0L);
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

    public double b(Object object) {
        return this.d.C(object);
    }

    private static Field g(long l, long l2) {
        int n = MultiProtocolDecryptionEngine.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = MultiProtocolDecryptionEngine.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultiProtocolDecryptionEngine.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultiProtocolDecryptionEngine.c(clazz3, string2, clazz2)) != null) {
                    MultiProtocolDecryptionEngine.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultiProtocolDecryptionEngine.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultiProtocolDecryptionEngine.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultiProtocolDecryptionEngine.f(906157348352929L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public double Z(Object object) {
        return this.h.C(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MultiProtocolDecryptionEngine.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public Object M(Object object, double d2, double d3, double d4) {
        return this.X.T(object, d2, d3, d4);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultiProtocolDecryptionEngine.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                MultiProtocolDecryptionEngine.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public double J(Object object, Object object2) {
        return this.U.s(object, object2);
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
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 21;
                break;
            }
            case 3: {
                n3 = 13;
                break;
            }
            case 4: {
                n3 = 56;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 10;
                break;
            }
            case 7: {
                n3 = 54;
                break;
            }
            case 8: {
                n3 = 41;
                break;
            }
            case 9: {
                n3 = 31;
                break;
            }
            case 10: {
                n3 = 19;
                break;
            }
            case 11: {
                n3 = 55;
                break;
            }
            case 12: {
                n3 = 4;
                break;
            }
            case 13: {
                n3 = 57;
                break;
            }
            case 14: {
                n3 = 30;
                break;
            }
            case 15: {
                n3 = 18;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 59;
                break;
            }
            case 18: {
                n3 = 51;
                break;
            }
            case 19: {
                n3 = 14;
                break;
            }
            case 20: {
                n3 = 24;
                break;
            }
            case 21: {
                n3 = 49;
                break;
            }
            case 22: {
                n3 = 42;
                break;
            }
            case 23: {
                n3 = 26;
                break;
            }
            case 24: {
                n3 = 12;
                break;
            }
            case 25: {
                n3 = 38;
                break;
            }
            case 26: {
                n3 = 63;
                break;
            }
            case 27: {
                n3 = 1;
                break;
            }
            case 28: {
                n3 = 58;
                break;
            }
            case 29: {
                n3 = 48;
                break;
            }
            case 30: {
                n3 = 34;
                break;
            }
            case 31: {
                n3 = 33;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 11;
                break;
            }
            case 34: {
                n3 = 53;
                break;
            }
            case 35: {
                n3 = 7;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 45;
                break;
            }
            case 38: {
                n3 = 61;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 9;
                break;
            }
            case 41: {
                n3 = 6;
                break;
            }
            case 42: {
                n3 = 52;
                break;
            }
            case 43: {
                n3 = 44;
                break;
            }
            case 44: {
                n3 = 40;
                break;
            }
            case 45: {
                n3 = 36;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 22;
                break;
            }
            case 48: {
                n3 = 62;
                break;
            }
            case 49: {
                n3 = 47;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 17;
                break;
            }
            case 52: {
                n3 = 25;
                break;
            }
            case 53: {
                n3 = 27;
                break;
            }
            case 54: {
                n3 = 29;
                break;
            }
            case 55: {
                n3 = 43;
                break;
            }
            case 56: {
                n3 = 3;
                break;
            }
            case 57: {
                n3 = 39;
                break;
            }
            case 58: {
                n3 = 37;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 50;
                break;
            }
            case 61: {
                n3 = 5;
                break;
            }
            case 62: {
                n3 = 60;
                break;
            }
            default: {
                n3 = 46;
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
        MultiProtocolDecryptionEngine.g[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    public MultiProtocolDecryptionEngine() {
        block31: {
            block29: {
                block27: {
                    block28: {
                        block23: {
                            block26: {
                                block24: {
                                    var1_1 = MultiProtocolDecryptionEngine.a ^ 127241059923397L;
                                    v0 = N9.I();
                                    super(ReflectionMetadataResolver.YN);
                                    var3_2 = v0;
                                    try {
                                        block25: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var3_2 == null) break block23;
                                                            if (GeometryCalculator.C() >= 35) {
                                                            }
                                                            ** GOTO lbl60
                                                        }
                                                        catch (CustomSystemException v1) {
                                                            throw MultiProtocolDecryptionEngine.a(v1);
                                                        }
                                                        this.h = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)13123, (long)(1251968479818476279L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, Double.TYPE, (long)7893348070343399925L, (long)var1_1);
                                                        this.d = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)14613, (long)(7257664293589770411L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, Double.TYPE, (long)7893348070343399925L, (long)var1_1);
                                                        this.K = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)28314, (long)(2648525622509877030L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, Double.TYPE, (long)7893348070343399925L, (long)var1_1);
                                                        v2 = this;
                                                        v3 = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)16426, (long)(6065711773280311709L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Double.TYPE}, (long)7893158703781098255L, (long)var1_1);
                                                        if (var3_2 == null) break block24;
                                                    }
                                                    catch (CustomSystemException v4) {
                                                        throw MultiProtocolDecryptionEngine.a(v4);
                                                    }
                                                    v2.v = v3;
                                                    if (GeometryCalculator.C() < 37) break block25;
                                                }
                                                catch (CustomSystemException v5) {
                                                    throw MultiProtocolDecryptionEngine.a(v5);
                                                }
                                                this.X = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)21776, (long)(6327003691329916069L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)7893158703781098255L, (long)var1_1);
                                                if (var3_2 != null) break block26;
                                            }
                                            catch (CustomSystemException v6) {
                                                throw MultiProtocolDecryptionEngine.a(v6);
                                            }
                                        }
                                        v2 = this;
                                        v3 = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)11825, (long)(3621827457717467022L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)7893158703781098255L, (long)var1_1);
                                    }
                                    catch (CustomSystemException v7) {
                                        throw MultiProtocolDecryptionEngine.a(v7);
                                    }
                                }
                                v2.X = v3;
                            }
                            try {
                                try {
                                    try {
                                        v8 = GeometryCalculator.C();
                                        v9 = 54;
                                        if (var3_2 == null) break block27;
                                        if (v8 < v9) break block28;
                                    }
                                    catch (CustomSystemException v10) {
                                        throw MultiProtocolDecryptionEngine.a(v10);
                                    }
                                    this.S = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)26648, (long)(3998779952038949288L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{ReflectionMetadataResolver.b1, Double.TYPE}, (long)7893996935673506947L, (long)var1_1).M();
                                    this.H = ((ThreadPoolCoordinator)MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)5544, (long)(7143031392179670034L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (Object)ReflectionMetadataResolver.YN, (long)7893274543574347733L, (long)var1_1).L(true)).p();
                                    if (var3_2 != null) break block28;
                                }
                                catch (CustomSystemException v11) {
                                    throw MultiProtocolDecryptionEngine.a(v11);
                                }
lbl60:
                                // 2 sources

                                this.h = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)22986, (long)(8227889858743730295L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, Double.TYPE, (long)7893348070343399925L, (long)var1_1);
                                this.d = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)31063, (long)(4428318379524169964L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, Double.TYPE, (long)7893348070343399925L, (long)var1_1);
                                this.K = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)32108, (long)(1325905159652156637L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, Double.TYPE, (long)7893348070343399925L, (long)var1_1);
                            }
                            catch (CustomSystemException v12) {
                                throw MultiProtocolDecryptionEngine.a(v12);
                            }
                        }
                        this.X = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)7398, (long)(3414990105075959134L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.YN, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)7893158703781098255L, (long)var1_1);
                    }
                    try {
                        v13 = this;
                        v14 = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)6589, (long)(2204991833569214475L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, Double.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)7893158703781098255L, (long)var1_1);
                        if (var3_2 == null) break block29;
                        v13.w = v14;
                        v8 = GeometryCalculator.C();
                        v9 = 23;
                    }
                    catch (CustomSystemException v15) {
                        throw MultiProtocolDecryptionEngine.a(v15);
                    }
                }
                try {
                    block30: {
                        try {
                            if (v8 < v9) break block30;
                            this.U = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)24422, (long)(7974883277514671829L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Double.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)7893158703781098255L, (long)var1_1);
                            if (var3_2 != null) break block31;
                        }
                        catch (CustomSystemException v16) {
                            throw MultiProtocolDecryptionEngine.a(v16);
                        }
                    }
                    v13 = this;
                    v14 = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)2348, (long)(6082719939342160030L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)true, Double.TYPE, (Object)new Class[]{ReflectionMetadataResolver.YN}, (long)7893158703781098255L, (long)var1_1);
                }
                catch (CustomSystemException v17) {
                    throw MultiProtocolDecryptionEngine.a(v17);
                }
            }
            v13.U = v14;
        }
        this.A = MultiProtocolDecryptionEngine.c("z", (Object)this, (Object)MultiProtocolDecryptionEngine.c("\u00d5", (int)MultiProtocolDecryptionEngine.b("t", (int)2453, (long)(8272877088229380140L ^ var1_1)), (long)7894067698152170480L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE}, (long)7893158703781098255L, (long)var1_1);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void A(Object object, double d2) {
        this.d.A(object, d2);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x343F;
        if (c[n2] == null) {
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
                throw new RuntimeException("a/lA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MultiProtocolDecryptionEngine.c[n2] = n3;
        }
        return c[n2];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'j' || c == 'R' || c == '$' || c == 'i') {
                field = MultiProtocolDecryptionEngine.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'j' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultiProtocolDecryptionEngine.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public Object t(Object object, Object object2, double d2) {
        return this.S.T(object, object2, d2);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/lA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object z() {
        return this.H.Z(null);
    }

    public Object t(Object object, double d2) {
        return this.v.T(object, d2);
    }

    public double F(Object object, Object object2) {
        return this.w.s(object, object2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MultiProtocolDecryptionEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MultiProtocolDecryptionEngine.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

