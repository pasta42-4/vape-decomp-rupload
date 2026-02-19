/*
 * Decompiled with CFR 0.152.
 */
package com.security.encryption;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CryptographicStateManager
extends CryptoProtocolEngine {
    private static final long a;
    private final ReflectionUtilityService D;
    private static final Integer[] c;
    private final HK y;
    private static final Object[] e;
    private static final String[] f;
    private static final Map d;
    private final ReflectionUtilityService Q;
    private final ReflectionUtilityService t;
    private final ReflectionUtilityService v;
    private final ReflectionUtilityService F;
    private final ReflectionUtilityService T;
    private static final long[] b;

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicStateManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicStateManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x76EF;
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
                throw new RuntimeException("a/mW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptographicStateManager.c[n2] = n3;
        }
        return c[n2];
    }

    public double I(Object object) {
        return this.F.C(object);
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
                n3 = 59;
                break;
            }
            case 1: {
                n3 = 36;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 18;
                break;
            }
            case 4: {
                n3 = 0;
                break;
            }
            case 5: {
                n3 = 53;
                break;
            }
            case 6: {
                n3 = 19;
                break;
            }
            case 7: {
                n3 = 24;
                break;
            }
            case 8: {
                n3 = 44;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 38;
                break;
            }
            case 11: {
                n3 = 13;
                break;
            }
            case 12: {
                n3 = 25;
                break;
            }
            case 13: {
                n3 = 29;
                break;
            }
            case 14: {
                n3 = 5;
                break;
            }
            case 15: {
                n3 = 39;
                break;
            }
            case 16: {
                n3 = 56;
                break;
            }
            case 17: {
                n3 = 62;
                break;
            }
            case 18: {
                n3 = 26;
                break;
            }
            case 19: {
                n3 = 15;
                break;
            }
            case 20: {
                n3 = 4;
                break;
            }
            case 21: {
                n3 = 33;
                break;
            }
            case 22: {
                n3 = 63;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 41;
                break;
            }
            case 25: {
                n3 = 16;
                break;
            }
            case 26: {
                n3 = 31;
                break;
            }
            case 27: {
                n3 = 40;
                break;
            }
            case 28: {
                n3 = 49;
                break;
            }
            case 29: {
                n3 = 1;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 61;
                break;
            }
            case 32: {
                n3 = 52;
                break;
            }
            case 33: {
                n3 = 2;
                break;
            }
            case 34: {
                n3 = 57;
                break;
            }
            case 35: {
                n3 = 17;
                break;
            }
            case 36: {
                n3 = 60;
                break;
            }
            case 37: {
                n3 = 43;
                break;
            }
            case 38: {
                n3 = 32;
                break;
            }
            case 39: {
                n3 = 9;
                break;
            }
            case 40: {
                n3 = 46;
                break;
            }
            case 41: {
                n3 = 14;
                break;
            }
            case 42: {
                n3 = 3;
                break;
            }
            case 43: {
                n3 = 54;
                break;
            }
            case 44: {
                n3 = 45;
                break;
            }
            case 45: {
                n3 = 21;
                break;
            }
            case 46: {
                n3 = 35;
                break;
            }
            case 47: {
                n3 = 11;
                break;
            }
            case 48: {
                n3 = 34;
                break;
            }
            case 49: {
                n3 = 28;
                break;
            }
            case 50: {
                n3 = 27;
                break;
            }
            case 51: {
                n3 = 55;
                break;
            }
            case 52: {
                n3 = 8;
                break;
            }
            case 53: {
                n3 = 22;
                break;
            }
            case 54: {
                n3 = 23;
                break;
            }
            case 55: {
                n3 = 51;
                break;
            }
            case 56: {
                n3 = 47;
                break;
            }
            case 57: {
                n3 = 48;
                break;
            }
            case 58: {
                n3 = 30;
                break;
            }
            case 59: {
                n3 = 42;
                break;
            }
            case 60: {
                n3 = 58;
                break;
            }
            case 61: {
                n3 = 50;
                break;
            }
            case 62: {
                n3 = 20;
                break;
            }
            default: {
                n3 = 37;
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
        CryptographicStateManager.f[n4] = new String(cArray);
        return n4;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "l!2\u0015";
        objectArray[1] = "\u0012U\nN\u000e \u0019Z\u001b\u0001s8\n]\u0012H";
        objectArray[2] = Boolean.TYPE;
        CryptographicStateManager.f[2] = "java/lang/Boolean";
        objectArray[3] = "\u0018raH  \u0013}p\u0007M \u0013`d";
        objectArray[4] = "\u000e3_X35{\u0013TW\"z\u0016\u0013TJ6o";
        objectArray[5] = "Ai\u00196";
        objectArray[6] = "4I\u0017";
        objectArray[7] = Integer.TYPE;
        CryptographicStateManager.f[7] = "java/lang/Integer";
        objectArray[8] = "g|65";
        objectArray[9] = "\\x0^\u001b@Ww!\u0011zN\\|%K";
        objectArray[10] = "\u0014]\u0005\u000b\u001bv\fS|6!wS]\u0005\r^sRJAq\u0018+\u0016FA\u000fZ?\u0011L|KF7\u0007@\u0016\u0017\u001fw\u0011!F\u000e\u001b6U_\u0018\u0015\u001b~j\u001dE\u001c\u001f\u007f\u001b\\\u001c\u0013DN";
        objectArray[11] = "yz\u0012L\t|atkm3}>z\u0012JLy?mV6\n!{aVHH5|kk\fT=jg\u0001P\r}|\u0006VJ\f8l=U\u0007\u000e!\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "X\b^U3A\u0018\u0013E\u001a\u0003\u001b\u001fs\u0012\nzO\\\u0019TWd\bdJ\u0016\u0016z\f\u001bN\u0017\u0001>p";
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

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method h(long l, long l2) {
        int n = CryptographicStateManager.e(l, l2);
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
                clazz3 = CryptographicStateManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicStateManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicStateManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicStateManager.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicStateManager.f(680234986220107L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicStateManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicStateManager.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicStateManager.f(680234986220107L, 0L);
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

    public float N(Object object) {
        return this.v.x(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicStateManager.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicStateManager.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public double p(Object object) {
        return this.t.C(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptographicStateManager.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static Object G(CryptographicStateManager cryptographicStateManager, double d2, double d3, double d4, float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        return cryptographicStateManager.W(d2, d3, d4, f, f2, bl, bl2, bl3);
    }

    static Object y(CryptographicStateManager cryptographicStateManager, boolean bl) {
        return cryptographicStateManager.g(bl);
    }

    private Object g(boolean bl) {
        return this.y.A(bl);
    }

    public float h(Object object) {
        return this.D.x(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object h(double d2, double d3, double d4, float f, float f2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return this.y.A(d2, d3, d4, Float.valueOf(f), Float.valueOf(f2), bl, bl2, bl3, bl4);
    }

    public double E(Object object) {
        return this.T.C(object);
    }

    private Object W(double d2, double d3, double d4, float f, float f2, boolean bl, boolean bl2, boolean bl3) {
        return this.y.A(d2, d3, d4, Float.valueOf(f), Float.valueOf(f2), bl, bl2, bl3);
    }

    private static Field g(long l, long l2) {
        int n = CryptographicStateManager.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicStateManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicStateManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicStateManager.c(clazz3, string2, clazz2)) != null) {
                    CryptographicStateManager.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicStateManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicStateManager.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicStateManager.f(680234986220107L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptographicStateManager.a = MultiContainerRegistry.a(8255360877431640730L, -846392380427055029L, MethodHandles.lookup().lookupClass()).a(190107482629770L);
                CryptographicStateManager.e = new Object[13];
                CryptographicStateManager.f = new String[13];
                CryptographicStateManager.a();
                CryptographicStateManager.d = new HashMap<K, V>(13);
                var0 = CryptographicStateManager.a ^ 53834059328356L;
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
                var8_3 = new long[22];
                var5_4 = 0;
                var6_5 = "L\u0019R{\u00a7;\u00a00r\u00aa]\u00cfkO\u001d\u0097R\u00f9\u00c9\u00eb\u00f2\u00b3\u001a\u00e6\u008e\u00d0F\u0007\u0003\u00c4(\u00cd\u00de\u00f6B\u00f9\u00a4\u00e6\u001e\u009d\u00fdZ\u00c8\u00ea\u0014\u0096\u00cf1o\u001e\u00a5\u00bb}-\u00aa\u0087\u00da\u00ffI\u0099\u008c\u00ac$i\u0000\u00fc\u00f4\u00be&\u00daH\u00c4\u00b6\u00e0\u00e0\u0091V\u0091w\u00b52>\u00fe\u009dFe\u0088K\u00a7\u00fbJ\u0015s\u00df\u0089\u00c6\u0095`\u00f8E\u00c9\u00c5V\u009c\u00bf\u0019\u00a0\u00a0\u00ae\u00d9\u00f5\u0092u\u00bc\u00c7'g23\u001ed]\u0004\u00c8\u000f\u00c7&\u00ebg\u00a1xNmX\\\u00d1J\u00faz\u00fa\u00b6\u00e8\u00de\u00b7\fFc\u007f^K\u00b8\u00bd\u00c1\u00db[\u00c5\u00c1\u0083wL";
                var7_6 = "L\u0019R{\u00a7;\u00a00r\u00aa]\u00cfkO\u001d\u0097R\u00f9\u00c9\u00eb\u00f2\u00b3\u001a\u00e6\u008e\u00d0F\u0007\u0003\u00c4(\u00cd\u00de\u00f6B\u00f9\u00a4\u00e6\u001e\u009d\u00fdZ\u00c8\u00ea\u0014\u0096\u00cf1o\u001e\u00a5\u00bb}-\u00aa\u0087\u00da\u00ffI\u0099\u008c\u00ac$i\u0000\u00fc\u00f4\u00be&\u00daH\u00c4\u00b6\u00e0\u00e0\u0091V\u0091w\u00b52>\u00fe\u009dFe\u0088K\u00a7\u00fbJ\u0015s\u00df\u0089\u00c6\u0095`\u00f8E\u00c9\u00c5V\u009c\u00bf\u0019\u00a0\u00a0\u00ae\u00d9\u00f5\u0092u\u00bc\u00c7'g23\u001ed]\u0004\u00c8\u000f\u00c7&\u00ebg\u00a1xNmX\\\u00d1J\u00faz\u00fa\u00b6\u00e8\u00de\u00b7\fFc\u007f^K\u00b8\u00bd\u00c1\u00db[\u00c5\u00c1\u0083wL".length();
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
                    var6_5 = "\u001a\u00bf%\u00f7\u001d_\u00daHK\u00d7\u00b8=\u009b\u0017\u001e;";
                    var7_6 = "\u001a\u00bf%\u00f7\u001d_\u00daHK\u00d7\u00b8=\u009b\u0017\u001e;".length();
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
        CryptographicStateManager.b = var8_3;
        CryptographicStateManager.c = new Integer[22];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00df' || c == '\u00dc' || c == '\u00cb' || c == '\u00cd') {
                field = CryptographicStateManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00df' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicStateManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public boolean h(Object object) {
        return this.Q.R(object);
    }

    /*
     * Unable to fully structure code
     */
    public CryptographicStateManager() {
        block34: {
            block37: {
                block35: {
                    block31: {
                        block33: {
                            block29: {
                                block27: {
                                    block28: {
                                        var1_1 = CryptographicStateManager.a ^ 2032901547493L;
                                        v0 = StringTransformationEngine.q();
                                        super(ReflectionMetadataResolver.L);
                                        var3_2 = v0;
                                        try {
                                            try {
                                                try {
                                                    v1 = GameVersionEnumerator.MC_1_21_4.H();
                                                    if (var3_2 == null) break block27;
                                                    if (!v1) break block28;
                                                }
                                                catch (CustomSystemException v2) {
                                                    throw CryptographicStateManager.a(v2);
                                                }
                                                this.y = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)20675, (long)(7293002990176644000L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-8247788470317148988L, (long)var1_1);
                                                if (var3_2 != null) break block29;
                                            }
                                            catch (CustomSystemException v3) {
                                                throw CryptographicStateManager.a(v3);
                                            }
                                            AbstractComputationKernel.I(new String[3]);
                                        }
                                        catch (CustomSystemException v4) {
                                            throw CryptographicStateManager.a(v4);
                                        }
                                    }
                                    v1 = GameVersionEnumerator.MC_1_20_6.H();
                                }
                                try {
                                    block30: {
                                        try {
                                            if (!v1) break block30;
                                            this.y = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)7584, (long)(6971145799178577617L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-8247788470317148988L, (long)var1_1);
                                            if (var3_2 != null) break block29;
                                        }
                                        catch (CustomSystemException v5) {
                                            throw CryptographicStateManager.a(v5);
                                        }
                                    }
                                    this.y = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)18830, (long)(5876583466733023977L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-8247788470317148988L, (long)var1_1);
                                }
                                catch (CustomSystemException v6) {
                                    throw CryptographicStateManager.a(v6);
                                }
                            }
                            try {
                                block32: {
                                    try {
                                        try {
                                            try {
                                                v7 = GeometryCalculator.C();
                                                v8 = 13;
                                                if (var3_2 == null) break block31;
                                                if (v7 == v8) {
                                                }
                                                ** GOTO lbl79
                                            }
                                            catch (CustomSystemException v9) {
                                                throw CryptographicStateManager.a(v9);
                                            }
                                            if (!ObjectLifecycleTracker.U.d()) break block32;
                                        }
                                        catch (CustomSystemException v10) {
                                            throw CryptographicStateManager.a(v10);
                                        }
                                        this.t = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)23859, (long)(4571759953405027932L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                        this.T = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)21543, (long)(1859148639129841477L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                        this.F = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)12704, (long)(7197881164065098448L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                        this.D = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)21461, (long)(7929626207565424801L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Float.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                        this.v = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)23503, (long)(1319993920493396152L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Float.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                        if (var3_2 != null) break block33;
                                    }
                                    catch (CustomSystemException v11) {
                                        throw CryptographicStateManager.a(v11);
                                    }
                                }
                                this.t = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)11380, (long)(6846449748978095889L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Double.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                this.T = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)26794, (long)(234085097406239708L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Double.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                this.F = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)32614, (long)(4783130051432317965L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Double.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                this.D = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)29959, (long)(2862859915595583083L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                this.v = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)2900, (long)(5318864803201314864L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (long)-8247865096282659479L, (long)var1_1);
                            }
                            catch (CustomSystemException v12) {
                                throw CryptographicStateManager.a(v12);
                            }
                        }
                        try {
                            try {
                                this.Q = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)31538, (long)(3185962088723578951L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Boolean.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                if (var3_2 != null) break block34;
lbl79:
                                // 2 sources

                                this.t = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)28932, (long)(174522353351133794L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                this.T = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)10510, (long)(4112111483387466339L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                this.F = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)10509, (long)(7225342942390604396L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Double.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                if (var3_2 == null) break block35;
                            }
                            catch (CustomSystemException v13) {
                                throw CryptographicStateManager.a(v13);
                            }
                            v7 = GeometryCalculator.C();
                            v8 = 35;
                        }
                        catch (CustomSystemException v14) {
                            throw CryptographicStateManager.a(v14);
                        }
                    }
                    try {
                        block36: {
                            try {
                                if (v7 < v8) break block36;
                                this.D = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)11233, (long)(5696763704944709768L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Float.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                this.v = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)8120, (long)(3220421547489027288L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Float.TYPE, (long)-8247865096282659479L, (long)var1_1);
                                if (var3_2 != null) break block37;
                            }
                            catch (CustomSystemException v15) {
                                throw CryptographicStateManager.a(v15);
                            }
                        }
                        this.D = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)28166, (long)(9187429572249752936L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Float.TYPE, (long)-8247865096282659479L, (long)var1_1);
                    }
                    catch (CustomSystemException v16) {
                        throw CryptographicStateManager.a(v16);
                    }
                }
                this.v = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)28261, (long)(8336911622246896909L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Float.TYPE, (long)-8247865096282659479L, (long)var1_1);
            }
            this.Q = CryptographicStateManager.c("\u00a3", (Object)this, (Object)CryptographicStateManager.c("p", (int)CryptographicStateManager.b("r", (int)9143, (long)(8354316399565101277L ^ var1_1)), (long)-8248217074299933274L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-8247865096282659479L, (long)var1_1);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicStateManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = CryptographicStateManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicStateManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicStateManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CryptographicStateManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

