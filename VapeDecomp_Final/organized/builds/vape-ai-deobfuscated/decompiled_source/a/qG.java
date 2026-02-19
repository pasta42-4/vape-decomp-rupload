/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
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
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qG
extends CryptoProtocolEngine {
    private static final Map d;
    private HK J;
    public ReflectionUtilityService j;
    private HK s;
    private static final long[] b;
    private HK z;
    private static final String[] f;
    private static final long a;
    private static final Object[] e;
    private static final Integer[] c;
    public HK Z;
    private ReflectionUtilityService S;
    public HK K;
    private ReflectionUtilityService W;

    static int E(qG qG2, Object object, int n) {
        return qG2.C(object, n);
    }

    private void A(Object object, int n) {
        this.s.l(object, n);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = qG.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private Object b(Object object) {
        return this.j.Z(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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

    private static Field g(long l, long l2) {
        int n = qG.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = qG.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = qG.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qG.c(clazz3, string2, clazz2)) != null) {
                    qG.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = qG.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        qG.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qG.f(689250541070882L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static void K(qG qG2, Object object, boolean bl) {
        qG2.D(object, bl);
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
                n3 = 29;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 56;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 24;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 6: {
                n3 = 40;
                break;
            }
            case 7: {
                n3 = 34;
                break;
            }
            case 8: {
                n3 = 8;
                break;
            }
            case 9: {
                n3 = 47;
                break;
            }
            case 10: {
                n3 = 62;
                break;
            }
            case 11: {
                n3 = 20;
                break;
            }
            case 12: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 31;
                break;
            }
            case 14: {
                n3 = 10;
                break;
            }
            case 15: {
                n3 = 60;
                break;
            }
            case 16: {
                n3 = 51;
                break;
            }
            case 17: {
                n3 = 2;
                break;
            }
            case 18: {
                n3 = 12;
                break;
            }
            case 19: {
                n3 = 26;
                break;
            }
            case 20: {
                n3 = 5;
                break;
            }
            case 21: {
                n3 = 57;
                break;
            }
            case 22: {
                n3 = 23;
                break;
            }
            case 23: {
                n3 = 61;
                break;
            }
            case 24: {
                n3 = 43;
                break;
            }
            case 25: {
                n3 = 17;
                break;
            }
            case 26: {
                n3 = 38;
                break;
            }
            case 27: {
                n3 = 53;
                break;
            }
            case 28: {
                n3 = 11;
                break;
            }
            case 29: {
                n3 = 19;
                break;
            }
            case 30: {
                n3 = 63;
                break;
            }
            case 31: {
                n3 = 14;
                break;
            }
            case 32: {
                n3 = 18;
                break;
            }
            case 33: {
                n3 = 48;
                break;
            }
            case 34: {
                n3 = 52;
                break;
            }
            case 35: {
                n3 = 27;
                break;
            }
            case 36: {
                n3 = 46;
                break;
            }
            case 37: {
                n3 = 36;
                break;
            }
            case 38: {
                n3 = 58;
                break;
            }
            case 39: {
                n3 = 42;
                break;
            }
            case 40: {
                n3 = 35;
                break;
            }
            case 41: {
                n3 = 30;
                break;
            }
            case 42: {
                n3 = 15;
                break;
            }
            case 43: {
                n3 = 25;
                break;
            }
            case 44: {
                n3 = 39;
                break;
            }
            case 45: {
                n3 = 50;
                break;
            }
            case 46: {
                n3 = 9;
                break;
            }
            case 47: {
                n3 = 16;
                break;
            }
            case 48: {
                n3 = 21;
                break;
            }
            case 49: {
                n3 = 32;
                break;
            }
            case 50: {
                n3 = 59;
                break;
            }
            case 51: {
                n3 = 33;
                break;
            }
            case 52: {
                n3 = 22;
                break;
            }
            case 53: {
                n3 = 55;
                break;
            }
            case 54: {
                n3 = 44;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 37;
                break;
            }
            case 57: {
                n3 = 54;
                break;
            }
            case 58: {
                n3 = 7;
                break;
            }
            case 59: {
                n3 = 28;
                break;
            }
            case 60: {
                n3 = 0;
                break;
            }
            case 61: {
                n3 = 13;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 49;
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
        qG.f[n4] = new String(cArray);
        return n4;
    }

    private void I(Object object, float f, float f2, float f3, int n) {
        this.Z.l(object, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), n);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "9y\b\t";
        objectArray[1] = "R\u00165[WeY\u0019$\u0014*}J\u001e-]";
        objectArray[2] = Boolean.TYPE;
        qG.f[2] = "java/lang/Boolean";
        objectArray[3] = "\u0006\u001f%s\u001e\\\r\u00104<s\\\r\r ";
        objectArray[4] = "];7\u001c\u0005p(\u001b<\u0013\u0014?E\u001b<\u000e\u0000*";
        objectArray[5] = ";\u001a4\u0012";
        objectArray[6] = "8H]";
        objectArray[7] = Integer.TYPE;
        qG.f[7] = "java/lang/Integer";
        objectArray[8] = "bL\\P";
        objectArray[9] = ":>T{g{11E4\u0006u::An";
        objectArray[10] = "<\u0011O@g\u001fz\u001a\\?\u001dc|E\u001c\u00007\u0005dEB?c\u001a<\u000bOG5\f}\u0010%\u0005=\u001cw\u001fXVaS4t\u001fDe\n{J\u001bT \u0012\u0005OT\u0005g\tg\f\u001f\u0001*c";
        objectArray[11] = "#b+\u0015/jei8jI\u0016c6xU\u007fp{6&j+o#x+\u0012}ybcAPuihl<\u0003)&+\u0007\u007fUj}vn3R*\u007f\u001a";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "MnX\b!oIs\u0002X\u001e8\n\u0001\u0000Rd>\u0015pBPg6qx\f\u000b!>\u0017`\fU\u001e";
    }

    private int C(Object object, int n) {
        return this.K.R(object, n);
    }

    private static Method h(long l, long l2) {
        int n = qG.e(l, l2);
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
                clazz3 = qG.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = qG.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qG.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        qG.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qG.f(689250541070882L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = qG.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        qG.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qG.f(689250541070882L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = qG.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                qG.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static Object i(qG qG2, Object object) {
        return qG2.x(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qG.a = MultiContainerRegistry.a(-8288737205233034494L, -4110500963483626913L, MethodHandles.lookup().lookupClass()).a(252383156772024L);
                qG.e = new Object[13];
                qG.f = new String[13];
                qG.a();
                qG.d = new HashMap<K, V>(13);
                var0 = qG.a ^ 107625018727940L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "p\u00e6\u00bc>\u008bq\u00f6\u00b2\u0089\u00c79M\u0080\u000f\u00c9iZ\u0087\u00f2\u00a8\u00a6\u008f\u0084_\u00c2-\u0093[\u009c\u009f\u00d6h";
                var7_6 = "p\u00e6\u00bc>\u008bq\u00f6\u00b2\u0089\u00c79M\u0080\u000f\u00c9iZ\u0087\u00f2\u00a8\u00a6\u008f\u0084_\u00c2-\u0093[\u009c\u009f\u00d6h".length();
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
                    var6_5 = ",\u00deX\u0010N\u0087\u00db5e\u0093m\u008b\u00c2\\}2";
                    var7_6 = ",\u00deX\u0010N\u0087\u00db5e\u0093m\u008b\u00c2\\}2".length();
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
        qG.b = var8_3;
        qG.c = new Integer[6];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = qG.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = qG.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = qG.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private Object x(Object object) {
        return this.S.Z(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'h' || c == 'j' || c == 'C' || c == '\u00e0') {
                field = qG.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'h' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'C' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qG.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'm' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x45A8;
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
                throw new RuntimeException("a/qG", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qG.c[n2] = n3;
        }
        return c[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object l(qG qG2, Object object) {
        return qG2.b(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qG.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = qG.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public qG() {
        block6: {
            long l = a ^ 0x7ACEB5F31210L;
            String string = SecureResourceManager.w();
            super(ReflectionMetadataResolver.V7);
            String string2 = string;
            if (GeometryCalculator.C() > 13) {
                // empty if block
            }
            try {
                block5: {
                    try {
                        if (GeometryCalculator.C() < 35) break block5;
                        this.S = qG.c("\u00e8", (Object)this, (Object)qG.c("m", (int)qG.b("n", (int)23339, (long)(0x769ED8689B002E4FL ^ l)), (long)3516873041237154266L, (long)l), (boolean)true, ByteBuffer.class, (long)3517193911271986055L, (long)l);
                        this.W = qG.c("\u00e8", (Object)this, (Object)qG.c("m", (int)qG.b("n", (int)6473, (long)(0x1FD886CD7E66EC2FL ^ l)), (long)3516873041237154266L, (long)l), (boolean)true, Boolean.TYPE, (long)3517193911271986055L, (long)l);
                        if (string2 == null) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw qG.a(customSystemException);
                    }
                }
                this.j = qG.c("\u00e8", (Object)this, (Object)qG.c("m", (int)qG.b("n", (int)4726, (long)(0x217B092370B3E711L ^ l)), (long)3516873041237154266L, (long)l), (boolean)true, IntBuffer.class, (long)3517193911271986055L, (long)l);
                this.Z = qG.c("\u00e8", (Object)this, (Object)qG.c("m", (int)qG.b("n", (int)304, (long)(0x2A9E45FEB2F1F450L ^ l)), (long)3516873041237154266L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE}, (long)3517266172726179560L, (long)l);
                this.K = qG.c("\u00e8", (Object)this, (Object)qG.c("m", (int)qG.b("n", (int)20192, (long)(0x79350747E8A3B85L ^ l)), (long)3516873041237154266L, (long)l), (boolean)true, Integer.TYPE, (Object)new Class[]{Integer.TYPE}, (long)3517266172726179560L, (long)l);
                this.s = qG.c("\u00e8", (Object)this, (Object)qG.c("m", (int)qG.b("n", (int)1985, (long)(0x4498DB81EAD8F2A0L ^ l)), (long)3516873041237154266L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)3517266172726179560L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw qG.a(customSystemException);
            }
        }
    }

    private void D(Object object, boolean bl) {
        this.W.B(object, bl);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qG.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(qG.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

