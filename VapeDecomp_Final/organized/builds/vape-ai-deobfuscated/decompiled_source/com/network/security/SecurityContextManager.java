/*
 * Decompiled with CFR 0.152.
 */
package com.network.security;

import a.Z1;
import com.app.configuration.ConfigurationDescriptor;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.collections.management.MultiContainerRegistry;
import com.configuration.management.ConfigurationParameterManager1397;
import com.exception.system.CustomSystemException;
import com.inventory.management.InventoryReconciler;
import com.network.connection.NetworkConnectionManager1645;
import com.plugin.management.PluginRegistrar;
import com.policy.management.PolicyOrchestrator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.enums.SecurityStateEnum;
import com.system.transformation.DataTransformationUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Comparator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SecurityContextManager {
    public static final NetworkConnectionManager1645 e;
    private static final String[] b;
    public static final PolicyOrchestrator o;
    private static final Object[] a;

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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/hi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int lambda$static$0(PluginRegistrar pluginRegistrar, InventoryReconciler inventoryReconciler, InventoryReconciler inventoryReconciler2) {
        String string = inventoryReconciler.q().Z();
        String string2 = inventoryReconciler2.q().Z();
        int n = -1;
        int n2 = -1;
        int n3 = pluginRegistrar.k().size();
        for (Map.Entry<String, SecurityStateEnum> entry : pluginRegistrar.k().entrySet()) {
            String string3 = entry.getKey();
            SecurityStateEnum securityStateEnum = entry.getValue();
            if (securityStateEnum.c().test(string, string3)) {
                n = n3;
            }
            if (securityStateEnum.c().test(string2, string3)) {
                n2 = n3;
            }
            try {
                try {
                    --n3;
                    if (n == -1 || n2 == -1) continue;
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityContextManager.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SecurityContextManager.a(customSystemException);
            }
        }
        return Integer.compare(n, n2);
    }

    private static Method d(long l, long l2) {
        int n = SecurityContextManager.a(l, l2);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecurityContextManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecurityContextManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecurityContextManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecurityContextManager.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecurityContextManager.b(274129388823320L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecurityContextManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecurityContextManager.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecurityContextManager.b(274129388823320L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecurityContextManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(long l, long l2) {
        int n = SecurityContextManager.a(l, l2);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = SecurityContextManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecurityContextManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecurityContextManager.a(clazz3, string2, clazz2)) != null) {
                    SecurityContextManager.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecurityContextManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecurityContextManager.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecurityContextManager.b(274129388823320L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SecurityContextManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecurityContextManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (b[n4] != null) {
            return n4;
        }
        Object object = a[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 39;
                break;
            }
            case 1: {
                n3 = 46;
                break;
            }
            case 2: {
                n3 = 54;
                break;
            }
            case 3: {
                n3 = 16;
                break;
            }
            case 4: {
                n3 = 40;
                break;
            }
            case 5: {
                n3 = 20;
                break;
            }
            case 6: {
                n3 = 3;
                break;
            }
            case 7: {
                n3 = 61;
                break;
            }
            case 8: {
                n3 = 11;
                break;
            }
            case 9: {
                n3 = 63;
                break;
            }
            case 10: {
                n3 = 38;
                break;
            }
            case 11: {
                n3 = 24;
                break;
            }
            case 12: {
                n3 = 58;
                break;
            }
            case 13: {
                n3 = 42;
                break;
            }
            case 14: {
                n3 = 31;
                break;
            }
            case 15: {
                n3 = 27;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 33;
                break;
            }
            case 19: {
                n3 = 62;
                break;
            }
            case 20: {
                n3 = 59;
                break;
            }
            case 21: {
                n3 = 43;
                break;
            }
            case 22: {
                n3 = 45;
                break;
            }
            case 23: {
                n3 = 36;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 21;
                break;
            }
            case 26: {
                n3 = 56;
                break;
            }
            case 27: {
                n3 = 32;
                break;
            }
            case 28: {
                n3 = 28;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 2;
                break;
            }
            case 32: {
                n3 = 4;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 26;
                break;
            }
            case 35: {
                n3 = 48;
                break;
            }
            case 36: {
                n3 = 10;
                break;
            }
            case 37: {
                n3 = 23;
                break;
            }
            case 38: {
                n3 = 37;
                break;
            }
            case 39: {
                n3 = 44;
                break;
            }
            case 40: {
                n3 = 35;
                break;
            }
            case 41: {
                n3 = 9;
                break;
            }
            case 42: {
                n3 = 41;
                break;
            }
            case 43: {
                n3 = 19;
                break;
            }
            case 44: {
                n3 = 7;
                break;
            }
            case 45: {
                n3 = 50;
                break;
            }
            case 46: {
                n3 = 29;
                break;
            }
            case 47: {
                n3 = 0;
                break;
            }
            case 48: {
                n3 = 30;
                break;
            }
            case 49: {
                n3 = 52;
                break;
            }
            case 50: {
                n3 = 60;
                break;
            }
            case 51: {
                n3 = 6;
                break;
            }
            case 52: {
                n3 = 15;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 51;
                break;
            }
            case 55: {
                n3 = 47;
                break;
            }
            case 56: {
                n3 = 53;
                break;
            }
            case 57: {
                n3 = 49;
                break;
            }
            case 58: {
                n3 = 17;
                break;
            }
            case 59: {
                n3 = 8;
                break;
            }
            case 60: {
                n3 = 1;
                break;
            }
            case 61: {
                n3 = 25;
                break;
            }
            case 62: {
                n3 = 14;
                break;
            }
            default: {
                n3 = 12;
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
        SecurityContextManager.b[n4] = new String(cArray);
        return n4;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cc' || c == '\u00c4' || c == '\u00cb' || c == 'a') {
                field = SecurityContextManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecurityContextManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'i' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static void t() {
        DataTransformationUtility.Z(o);
        DataTransformationUtility.Z(e);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static void a() {
        Object[] objectArray = a;
        a[0] = "\u0019LE";
        objectArray[1] = Integer.TYPE;
        SecurityContextManager.b[1] = "java/lang/Integer";
        objectArray[2] = "\rqz,G#\u0006~kc:;\u0015yb*";
        objectArray[3] = "vlN0\u0016f}c_\u007fwhvh[%";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u000f\u0001>IUr\u0003\u00109yRwb\u00002\t@r\u000bCe\u000395\u001d\u0018*\u0003Xp\u0005\u00130y";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecurityContextManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecurityContextManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecurityContextManager.a(l, l2);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                SecurityContextManager.a[n] = clazz = Class.forName(b[n]);
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
                var11 = MultiContainerRegistry.a(-7039962144082878852L, 8033405841110059218L, MethodHandles.lookup().lookupClass()).a(103907957608580L) ^ 132672585284453L;
                SecurityContextManager.a = new Object[5];
                SecurityContextManager.b = new String[5];
                SecurityContextManager.a();
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[14];
                var4_4 = 0;
                var5_5 = "\u009f\u00afq\u00c1=\u00a9\u009dNtV\u00b4\u00ec\u00a9\u00ac\u00fa7\u00fe\u0082\u00a0\u0019\u008f\u00a2y\u00b9\u009b\u000bXj\u00c0NW\u008e\u00e2^\u00152o.~8\u00c692v\u00fd\u00ae\u0097\u001a\u00e1]\u0007\u00970\u00c4Da\u0097\u00ae\u00e1J\u00f5\u0090\u00ef\u00c7\u00a7\u008ad7A\u00c7A(\u0086\f\u00a8\u008b\u00fc\u0000\u00a2?\u00d5\u00c1e]u\u00b4H\u00a3\u009c\u0017\u008e\u0014\u0003\u009f\u00a0s";
                var6_6 = "\u009f\u00afq\u00c1=\u00a9\u009dNtV\u00b4\u00ec\u00a9\u00ac\u00fa7\u00fe\u0082\u00a0\u0019\u008f\u00a2y\u00b9\u009b\u000bXj\u00c0NW\u008e\u00e2^\u00152o.~8\u00c692v\u00fd\u00ae\u0097\u001a\u00e1]\u0007\u00970\u00c4Da\u0097\u00ae\u00e1J\u00f5\u0090\u00ef\u00c7\u00a7\u008ad7A\u00c7A(\u0086\f\u00a8\u008b\u00fc\u0000\u00a2?\u00d5\u00c1e]u\u00b4H\u00a3\u009c\u0017\u008e\u0014\u0003\u009f\u00a0s".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "&i\u0095a\u0001\u00f8\u00b2T\u0081OF\u008d\u00819V\u0007";
                    var6_6 = "&i\u0095a\u0001\u00f8\u00b2T\u0081OF\u008d\u00819V\u0007".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        SecurityContextManager.o = ((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)PluginLifecycleContract.Y().k().c((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[8]), (long)-4312147507350995862L, (long)var11))).t((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[11]), (long)-4312147507350995862L, (long)var11))).p((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[10]), (long)-4312147507350995862L, (long)var11))).n(ConfigurationDescriptor.BLOCKS)).C(ReflectionMetadataResolver.YX).W(Z1.WHITELIST).V();
        var13_11 = ((PluginRegistrar)((PluginRegistrar)((PluginRegistrar)((PluginRegistrar)((PluginRegistrar)PluginLifecycleContract.Y().x().c((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[1]), (long)-4312147507350995862L, (long)var11))).t((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[9]), (long)-4312147507350995862L, (long)var11))).R((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[6]), (long)-4312147507350995862L, (long)var11))).p((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[3]), (long)-4312147507350995862L, (long)var11))).n(ConfigurationDescriptor.BLOCKS)).o((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[5]), (long)-4312147507350995862L, (long)var11), SecurityStateEnum.ENDS).o((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[13]), (long)-4312147507350995862L, (long)var11), SecurityStateEnum.EQUALS).o((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[4]), (long)-4312147507350995862L, (long)var11), SecurityStateEnum.ENDS).o((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[7]), (long)-4312147507350995862L, (long)var11), SecurityStateEnum.EQUALS).o((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[12]), (long)-4312147507350995862L, (long)var11), SecurityStateEnum.ENDS).o((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[2]), (long)-4312147507350995862L, (long)var11), SecurityStateEnum.EQUALS).o((String)SecurityContextManager.a("\u00b5", (int)((int)var0_3[0]), (long)-4312147507350995862L, (long)var11), SecurityStateEnum.EQUALS);
        var13_11.b((Comparator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)I, lambda$static$0(com.plugin.management.PluginRegistrar com.inventory.management.InventoryReconciler com.inventory.management.InventoryReconciler ), (Lcom/inventory/management/InventoryReconciler;Lcom/inventory/management/InventoryReconciler;)I)((PluginRegistrar)var13_11));
        SecurityContextManager.e = var13_11.U();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecurityContextManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

