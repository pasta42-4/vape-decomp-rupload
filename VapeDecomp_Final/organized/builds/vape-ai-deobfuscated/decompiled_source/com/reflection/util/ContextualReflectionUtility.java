/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.util;

import a.HK;
import a.a;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Array;
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

public class ContextualReflectionUtility {
    private static final long a;
    private static final long[] b;
    private static final Object[] e;
    private static final Integer[] c;
    private static final Map<Class<?>, String> S;
    private static final String[] f;
    private static final Map d;
    private static AbstractComputationKernel[] T;

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ContextualReflectionUtility.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ContextualReflectionUtility.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static String G(Class<?> clazz) {
        return S.get(clazz);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == 'b' || c == 'H' || c == '\u00c9') {
                field = ContextualReflectionUtility.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ContextualReflectionUtility.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(long l, long l2) {
        int n = ContextualReflectionUtility.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ContextualReflectionUtility.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ContextualReflectionUtility.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ContextualReflectionUtility.a(clazz3, string2, clazz2)) != null) {
                    ContextualReflectionUtility.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ContextualReflectionUtility.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ContextualReflectionUtility.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ContextualReflectionUtility.b(348880373800498L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static String w(Class<?> clazz) {
        return ContextualReflectionUtility.B(clazz, false);
    }

    public static void r(AbstractComputationKernel[] abstractComputationKernelArray) {
        T = abstractComputationKernelArray;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/HF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static String B(Class<?> clazz, boolean bl) {
        long l = a ^ 0x43F08E1CAA86L;
        String string = ContextualReflectionUtility.G(clazz);
        try {
            if (string != null) {
                return string;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualReflectionUtility.a(customSystemException);
        }
        if (bl) {
            String string2 = ReflectionMetadataResolver.Y(clazz).replace('.', '/');
            if (!clazz.isArray()) {
                string2 = (String)((Object)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)29228, (long)(0x5D4F8BF965C5D661L ^ l)), (long)-8032773529983363995L, (long)l)) + string2 + (String)((Object)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)4808, (long)(0x1343F68D2C8A3691L ^ l)), (long)-8032773529983363995L, (long)l));
            }
            return string2;
        }
        return ContextualReflectionUtility.b("U", clazz, (long)-8032852908220661615L, (long)l);
    }

    public static String R(Class<?> clazz, Class<?> ... classArray) {
        return ContextualReflectionUtility.z(false, clazz, classArray);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ContextualReflectionUtility.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ContextualReflectionUtility.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ContextualReflectionUtility.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ContextualReflectionUtility.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static boolean y(String string, String string2) {
        try {
            if (string == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualReflectionUtility.a(customSystemException);
        }
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String string3 = stackTraceElement.getClassName();
            String string4 = stackTraceElement.getMethodName();
            try {
                block10: {
                    try {
                        try {
                            if (!string3.equals(string)) continue;
                            if (string2 == null) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ContextualReflectionUtility.a(customSystemException);
                        }
                        if (!string4.equals(string2)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualReflectionUtility.a(customSystemException);
                    }
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualReflectionUtility.a(customSystemException);
            }
        }
        return false;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static void E() {
        TemporalMetadataResolver.x("");
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            TemporalMetadataResolver.x(stackTraceElement.toString());
        }
        TemporalMetadataResolver.x("");
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/HF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = ContextualReflectionUtility.a(l, l2);
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
                clazz3 = ContextualReflectionUtility.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ContextualReflectionUtility.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ContextualReflectionUtility.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ContextualReflectionUtility.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ContextualReflectionUtility.b(348880373800498L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ContextualReflectionUtility.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ContextualReflectionUtility.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ContextualReflectionUtility.b(348880373800498L, 0L);
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
                ContextualReflectionUtility.a = MultiContainerRegistry.a(-1710006703716099009L, -5820145207437126078L, MethodHandles.lookup().lookupClass()).a(36417526532549L);
                var11 = ContextualReflectionUtility.a ^ 102459117448444L;
                ContextualReflectionUtility.e = new Object[8];
                ContextualReflectionUtility.f = new String[8];
                ContextualReflectionUtility.a();
                ContextualReflectionUtility.d = new HashMap<K, V>(13);
                ContextualReflectionUtility.r(null);
                var0_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var11 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var6_3 = new long[22];
                var3_4 = 0;
                var4_5 = ";\u00f8\u00e2\u00f5\u0098\u00e8\u008b\u00de'\u00ba\u0092\td\u000e$B\u00e7G\u00baLp\u00f9\"\u00fc\u0010a\u0087\u00cc\u00af\u00da\u00bf\u00bc\u00eaO\u0098z\u000e\u00be [5uP\u00c8\u0007\u00ceH\n\u0015u\u0015\u00a3I\u00e3t\u0095\u00d3h\u00cf\u00f7\fM\u00aa\u00c0r\u00ca{\u008ar\u00e1\u0001\u00fd\u00ae\u00b4\u0003\u0018\u001b\u0011\u00f0\u0084h\u00f9\u0000\u008eU\u0006\u00d1\u001e\u00aa\u0019\n\u00adx\u00a6\u0085\u00cb\u00f5{\u00a6\u008f*GI\u00d5$\\O\fKw\u008a\u000b\u00129\u00f3\u00a1\u001c\u00f72o\u00c1\u00fcP\u00f8hq\u0094j\u001a\u0094k\u00d6\u00f4\u00b06\u00c6\u00d4\u00c1]\u0099\u001f'\u00a8&.F\u00ef\u0098\u0011\u0007!\u00e9o\u00af\u00f4\u00a7uq\u00ca\u00f3";
                var5_6 = ";\u00f8\u00e2\u00f5\u0098\u00e8\u008b\u00de'\u00ba\u0092\td\u000e$B\u00e7G\u00baLp\u00f9\"\u00fc\u0010a\u0087\u00cc\u00af\u00da\u00bf\u00bc\u00eaO\u0098z\u000e\u00be [5uP\u00c8\u0007\u00ceH\n\u0015u\u0015\u00a3I\u00e3t\u0095\u00d3h\u00cf\u00f7\fM\u00aa\u00c0r\u00ca{\u008ar\u00e1\u0001\u00fd\u00ae\u00b4\u0003\u0018\u001b\u0011\u00f0\u0084h\u00f9\u0000\u008eU\u0006\u00d1\u001e\u00aa\u0019\n\u00adx\u00a6\u0085\u00cb\u00f5{\u00a6\u008f*GI\u00d5$\\O\fKw\u008a\u000b\u00129\u00f3\u00a1\u001c\u00f72o\u00c1\u00fcP\u00f8hq\u0094j\u001a\u0094k\u00d6\u00f4\u00b06\u00c6\u00d4\u00c1]\u0099\u001f'\u00a8&.F\u00ef\u0098\u0011\u0007!\u00e9o\u00af\u00f4\u00a7uq\u00ca\u00f3".length();
                var2_7 = 0;
                while (true) {
                    var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                    v3 = var6_3;
                    v4 = var3_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var2_7 < var5_6) ** continue;
                    var4_5 = "\u00ca\u00e2sr\u00d0G4\u0085\u001f\u00f6(\u0094+\u00928\u00fb";
                    var5_6 = "\u00ca\u00e2sr\u00d0G4\u0085\u001f\u00f6(\u0094+\u00928\u00fb".length();
                    var2_7 = 0;
                    while (true) {
                        var7_8 = var4_5.substring(var2_7, var2_7 += 8).getBytes("ISO-8859-1");
                        v3 = var6_3;
                        v4 = var3_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
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
                    if (var2_7 < var5_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var0_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
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
        ContextualReflectionUtility.b = var6_3;
        ContextualReflectionUtility.c = new Integer[22];
        ContextualReflectionUtility.S = new HashMap<Class<?>, String>();
        ContextualReflectionUtility.S.put(Boolean.TYPE, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)10966, (long)(2952304420950771956L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(Byte.TYPE, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)24227, (long)(2904966385526373506L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(Character.TYPE, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)4918, (long)(1997114288673698058L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(Short.TYPE, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)31447, (long)(6871508050609133794L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(Integer.TYPE, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)7741, (long)(6208613927135493147L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(Long.TYPE, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)23275, (long)(8878942111741704404L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(Float.TYPE, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)16608, (long)(7980205045298553566L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(Double.TYPE, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)8563, (long)(6716593343130567499L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(Void.TYPE, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)7827, (long)(8671553919019924654L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(boolean[].class, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)20901, (long)(3465824843705250718L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(byte[].class, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)1251, (long)(2361810022685419219L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(char[].class, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)27087, (long)(2615369037517573117L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(short[].class, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)30652, (long)(1926401513196279174L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(int[].class, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)18644, (long)(432300586406963943L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(long[].class, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)10734, (long)(7661356052450675662L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(float[].class, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)22804, (long)(331378325878045474L ^ var11)), (long)-7566111319041093089L, (long)var11));
        ContextualReflectionUtility.S.put(double[].class, (String)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)27935, (long)(1375200277053951800L ^ var11)), (long)-7566111319041093089L, (long)var11));
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ContextualReflectionUtility.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static String z(int n) {
        int n2 = 0;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            try {
                if (n2 == n) {
                    return stackTraceElement.getMethodName();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualReflectionUtility.a(customSystemException);
            }
            ++n2;
        }
        return "";
    }

    private static int a(long l, long l2) {
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
                n3 = 35;
                break;
            }
            case 1: {
                n3 = 15;
                break;
            }
            case 2: {
                n3 = 57;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 46;
                break;
            }
            case 6: {
                n3 = 23;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 0;
                break;
            }
            case 9: {
                n3 = 59;
                break;
            }
            case 10: {
                n3 = 28;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 32;
                break;
            }
            case 13: {
                n3 = 47;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 19;
                break;
            }
            case 16: {
                n3 = 20;
                break;
            }
            case 17: {
                n3 = 8;
                break;
            }
            case 18: {
                n3 = 4;
                break;
            }
            case 19: {
                n3 = 5;
                break;
            }
            case 20: {
                n3 = 48;
                break;
            }
            case 21: {
                n3 = 60;
                break;
            }
            case 22: {
                n3 = 61;
                break;
            }
            case 23: {
                n3 = 36;
                break;
            }
            case 24: {
                n3 = 54;
                break;
            }
            case 25: {
                n3 = 24;
                break;
            }
            case 26: {
                n3 = 33;
                break;
            }
            case 27: {
                n3 = 27;
                break;
            }
            case 28: {
                n3 = 53;
                break;
            }
            case 29: {
                n3 = 3;
                break;
            }
            case 30: {
                n3 = 56;
                break;
            }
            case 31: {
                n3 = 26;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 33: {
                n3 = 44;
                break;
            }
            case 34: {
                n3 = 9;
                break;
            }
            case 35: {
                n3 = 51;
                break;
            }
            case 36: {
                n3 = 21;
                break;
            }
            case 37: {
                n3 = 40;
                break;
            }
            case 38: {
                n3 = 42;
                break;
            }
            case 39: {
                n3 = 39;
                break;
            }
            case 40: {
                n3 = 7;
                break;
            }
            case 41: {
                n3 = 22;
                break;
            }
            case 42: {
                n3 = 2;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 37;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 17;
                break;
            }
            case 47: {
                n3 = 38;
                break;
            }
            case 48: {
                n3 = 29;
                break;
            }
            case 49: {
                n3 = 49;
                break;
            }
            case 50: {
                n3 = 62;
                break;
            }
            case 51: {
                n3 = 25;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 31;
                break;
            }
            case 54: {
                n3 = 52;
                break;
            }
            case 55: {
                n3 = 45;
                break;
            }
            case 56: {
                n3 = 11;
                break;
            }
            case 57: {
                n3 = 34;
                break;
            }
            case 58: {
                n3 = 12;
                break;
            }
            case 59: {
                n3 = 41;
                break;
            }
            case 60: {
                n3 = 50;
                break;
            }
            case 61: {
                n3 = 13;
                break;
            }
            case 62: {
                n3 = 55;
                break;
            }
            default: {
                n3 = 58;
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
        ContextualReflectionUtility.f[n4] = new String(cArray);
        return n4;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x34CC;
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
                throw new RuntimeException("a/HF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ContextualReflectionUtility.c[n2] = n3;
        }
        return c[n2];
    }

    public static Class<?> U(Class<?> clazz) {
        try {
            if (clazz == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualReflectionUtility.a(customSystemException);
        }
        return Array.newInstance(clazz, 1).getClass();
    }

    public static String z(boolean bl, Class<?> clazz, Class<?> ... classArray) {
        long l = a ^ 0x372F78D9CF48L;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)((Object)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)21463, (long)(0x12BF286042811257L ^ l)), (long)-771329572021259861L, (long)l)));
        for (Class<?> clazz2 : classArray) {
            stringBuilder.append(ContextualReflectionUtility.B(clazz2, bl));
        }
        stringBuilder.append((String)((Object)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)26608, (long)(0x6EC5357A9267A675L ^ l)), (long)-771329572021259861L, (long)l)));
        stringBuilder.append(ContextualReflectionUtility.B(clazz, bl));
        return stringBuilder.toString();
    }

    public static boolean v(HK hK, int n) {
        return a.a.gtcf(Thread.currentThread(), hK.z(), n);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0005Fj";
        objectArray[1] = Integer.TYPE;
        ContextualReflectionUtility.f[1] = "java/lang/Integer";
        objectArray[2] = "|$\u001fSNMw+\u000e\u001c3Ud,\u0007U";
        objectArray[3] = "5r\u0012Y\u0019!>}\u0003\u0016t!>`\u0017";
        objectArray[4] = "|,4\r\u0007sw#%Bf}|(!\u0018";
        objectArray[5] = "\u000fc\u0017\u0006fa\u0003i\u0011hjq\u0006RN\njc\u000e=\u0007S?adh\u0015\u0011;!\u0007#\r\u00188\u001a";
        objectArray[6] = "j:YVr}f0_8~mz\u000b\u0003Zh8:hHBa;\u00012[Whln{\u0002\u0002j\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "|\\Yq\u0016&pV_\u001f\u001e&\u0017\u0014]rI<l\u0013Z\u007fudu\u0002@u\u001a-,WB\u001f";
    }

    public static Class<?> S(Class<?> clazz) {
        long l = a ^ 0x366107445CA4L;
        String string = (String)((Object)ContextualReflectionUtility.b("U", (int)ContextualReflectionUtility.a("h", (int)32390, (long)(0x1607D04468E92CE7L ^ l)), (long)7397072886096634439L, (long)l)) + (String)((Object)ContextualReflectionUtility.b("U", clazz, (long)7397135203125409459L, (long)l));
        return ContextualReflectionUtility.b("U", string, (long)7396941175000336353L, (long)l);
    }

    public static AbstractComputationKernel[] I() {
        return T;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ContextualReflectionUtility.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ContextualReflectionUtility.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ContextualReflectionUtility.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

