/*
 * Decompiled with CFR 0.152.
 */
package com.core.reflection;

import a.V3;
import a.Y5;
import a.Z1;
import com.app.configuration.ConfigurationDescriptor;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.collections.management.MultiContainerRegistry;
import com.configuration.management.ConfigurationParameterManager1397;
import com.inventory.management.InventoryReconciler;
import com.network.streaming.DataStreamProcessor1233;
import com.plugin.management.PluginRegistrar;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
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
import java.util.List;
import java.util.function.ToDoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ReflectionUtilityResolver910 {
    private static final Object[] a;
    public static final PluginLifecycleContract i;
    private static final String[] b;
    public static final PluginLifecycleContract A;
    public static final PluginLifecycleContract v;

    private static Field c(long l, long l2) {
        int n = ReflectionUtilityResolver910.a(l, l2);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = ReflectionUtilityResolver910.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ReflectionUtilityResolver910.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ReflectionUtilityResolver910.a(clazz3, string2, clazz2)) != null) {
                    ReflectionUtilityResolver910.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ReflectionUtilityResolver910.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ReflectionUtilityResolver910.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ReflectionUtilityResolver910.b(217256531590111L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ReflectionUtilityResolver910.a(l, l2);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                ReflectionUtilityResolver910.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ReflectionUtilityResolver910.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = ReflectionUtilityResolver910.a(l, l2);
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
                clazz3 = ReflectionUtilityResolver910.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ReflectionUtilityResolver910.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ReflectionUtilityResolver910.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ReflectionUtilityResolver910.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ReflectionUtilityResolver910.b(217256531590111L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ReflectionUtilityResolver910.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ReflectionUtilityResolver910.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ReflectionUtilityResolver910.b(217256531590111L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c6' || c == '\u00ef' || c == '\u00c8' || c == 'j') {
                field = ReflectionUtilityResolver910.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ReflectionUtilityResolver910.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ca' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/I3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                var11 = MultiContainerRegistry.a(-7288236240639812611L, 1115217085436353299L, MethodHandles.lookup().lookupClass()).a(176798926485123L) ^ 17522407893130L;
                ReflectionUtilityResolver910.a = new Object[5];
                ReflectionUtilityResolver910.b = new String[5];
                ReflectionUtilityResolver910.a();
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
                var0_3 = new long[10];
                var4_4 = 0;
                var5_5 = "\u00e3DG\u00cbh\u00a8\u00e6w 2\u0013\u00fc:\u00b5\u00af\u0011\u009d^\u00bd\u00d9A\u00ea!o)_Z\u008d\u00d4'\u00f7`\u00c3\u00bc\u00e6#_\u009c,\u0095\u00ca\u00da\r\r\u001a\u00e5vC\u00ca\u00aa\u0092/\u00ad\u001a\u00d9\u009f\u00b2\u009d\u00af\u00e8B\u0099\u00e9\u00a0";
                var6_6 = "\u00e3DG\u00cbh\u00a8\u00e6w 2\u0013\u00fc:\u00b5\u00af\u0011\u009d^\u00bd\u00d9A\u00ea!o)_Z\u008d\u00d4'\u00f7`\u00c3\u00bc\u00e6#_\u009c,\u0095\u00ca\u00da\r\r\u001a\u00e5vC\u00ca\u00aa\u0092/\u00ad\u001a\u00d9\u009f\u00b2\u009d\u00af\u00e8B\u0099\u00e9\u00a0".length();
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
                    var5_5 = "\u001bc\u0087\u00a4G\u0006\n\u00be\u00ac\u00f9\u0084\u00c9\u0090\u0091\u00ed\u00a8";
                    var6_6 = "\u001bc\u0087\u00a4G\u0006\n\u00be\u00ac\u00f9\u0084\u00c9\u0090\u0091\u00ed\u00a8".length();
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
        ReflectionUtilityResolver910.v = ((PluginRegistrar)((PluginRegistrar)((PluginRegistrar)((PluginRegistrar)((PluginRegistrar)PluginLifecycleContract.Y().x().c((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[6]), (long)-5950318869164001370L, (long)var11))).t((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[3]), (long)-5950318869164001370L, (long)var11))).R((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[0]), (long)-5950318869164001370L, (long)var11))).p((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[7]), (long)-5950318869164001370L, (long)var11))).n(ConfigurationDescriptor.HIDDEN)).o("", SecurityStateEnum.ANY).U();
        ReflectionUtilityResolver910.i = ((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)PluginLifecycleContract.Y().k().c((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[8]), (long)-5950318869164001370L, (long)var11))).t((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[1]), (long)-5950318869164001370L, (long)var11))).R((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[5]), (long)-5950318869164001370L, (long)var11))).n(ConfigurationDescriptor.HIDDEN)).C(ReflectionMetadataResolver.U6).W(Z1.WHITELIST).b(Comparator.comparingDouble((ToDoubleFunction<InventoryReconciler>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lambda$static$0(com.inventory.management.InventoryReconciler ), (Lcom/inventory/management/InventoryReconciler;)D)()))).V();
        ReflectionUtilityResolver910.A = ((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)((ConfigurationParameterManager1397)PluginLifecycleContract.Y().k().c((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[2]), (long)-5950318869164001370L, (long)var11))).t((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[9]), (long)-5950318869164001370L, (long)var11))).R((String)ReflectionUtilityResolver910.a("\u00ca", (int)((int)var0_3[4]), (long)-5950318869164001370L, (long)var11))).n(ConfigurationDescriptor.HIDDEN)).C(ReflectionMetadataResolver.Fl).W(Z1.WHITELIST).b((Comparator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)I, lambda$static$1(com.inventory.management.InventoryReconciler com.inventory.management.InventoryReconciler ), (Lcom/inventory/management/InventoryReconciler;Lcom/inventory/management/InventoryReconciler;)I)())).V();
    }

    private static int lambda$static$1(InventoryReconciler inventoryReconciler, InventoryReconciler inventoryReconciler2) {
        LightweightExecutionContext lightweightExecutionContext = inventoryReconciler.T();
        LightweightExecutionContext lightweightExecutionContext2 = inventoryReconciler2.T();
        List<V3> list = new DataStreamProcessor1233(lightweightExecutionContext.C()).g(lightweightExecutionContext);
        List<V3> list2 = new DataStreamProcessor1233(lightweightExecutionContext2.C()).g(lightweightExecutionContext2);
        int n = 0;
        for (V3 v3 : list) {
            int n2 = v3.n();
            for (V3 v32 : list2) {
                int n3 = v32.n();
                if (n2 != n3) continue;
                n += Integer.compare(v3.y(), v32.y());
            }
        }
        return n;
    }

    private static double lambda$static$0(InventoryReconciler inventoryReconciler) {
        return DynamicContextBroker.y(inventoryReconciler.T());
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ReflectionUtilityResolver910.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ReflectionUtilityResolver910.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
                n3 = 53;
                break;
            }
            case 1: {
                n3 = 19;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 3: {
                n3 = 8;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 21;
                break;
            }
            case 6: {
                n3 = 29;
                break;
            }
            case 7: {
                n3 = 45;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 13;
                break;
            }
            case 11: {
                n3 = 43;
                break;
            }
            case 12: {
                n3 = 58;
                break;
            }
            case 13: {
                n3 = 9;
                break;
            }
            case 14: {
                n3 = 49;
                break;
            }
            case 15: {
                n3 = 6;
                break;
            }
            case 16: {
                n3 = 24;
                break;
            }
            case 17: {
                n3 = 25;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 40;
                break;
            }
            case 20: {
                n3 = 59;
                break;
            }
            case 21: {
                n3 = 15;
                break;
            }
            case 22: {
                n3 = 20;
                break;
            }
            case 23: {
                n3 = 63;
                break;
            }
            case 24: {
                n3 = 42;
                break;
            }
            case 25: {
                n3 = 14;
                break;
            }
            case 26: {
                n3 = 1;
                break;
            }
            case 27: {
                n3 = 28;
                break;
            }
            case 28: {
                n3 = 52;
                break;
            }
            case 29: {
                n3 = 30;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 16;
                break;
            }
            case 32: {
                n3 = 38;
                break;
            }
            case 33: {
                n3 = 34;
                break;
            }
            case 34: {
                n3 = 33;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 47;
                break;
            }
            case 37: {
                n3 = 0;
                break;
            }
            case 38: {
                n3 = 32;
                break;
            }
            case 39: {
                n3 = 11;
                break;
            }
            case 40: {
                n3 = 22;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 54;
                break;
            }
            case 43: {
                n3 = 62;
                break;
            }
            case 44: {
                n3 = 51;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 12;
                break;
            }
            case 48: {
                n3 = 36;
                break;
            }
            case 49: {
                n3 = 46;
                break;
            }
            case 50: {
                n3 = 44;
                break;
            }
            case 51: {
                n3 = 61;
                break;
            }
            case 52: {
                n3 = 50;
                break;
            }
            case 53: {
                n3 = 2;
                break;
            }
            case 54: {
                n3 = 35;
                break;
            }
            case 55: {
                n3 = 39;
                break;
            }
            case 56: {
                n3 = 41;
                break;
            }
            case 57: {
                n3 = 26;
                break;
            }
            case 58: {
                n3 = 55;
                break;
            }
            case 59: {
                n3 = 17;
                break;
            }
            case 60: {
                n3 = 23;
                break;
            }
            case 61: {
                n3 = 10;
                break;
            }
            case 62: {
                n3 = 56;
                break;
            }
            default: {
                n3 = 31;
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
        ReflectionUtilityResolver910.b[n4] = new String(cArray);
        return n4;
    }

    private static void a() {
        Object[] objectArray = a;
        a[0] = "+\u0019=";
        objectArray[1] = Integer.TYPE;
        ReflectionUtilityResolver910.b[1] = "java/lang/Integer";
        objectArray[2] = "\u001c&9\\&c\u0017)(\u0013[{\u0004.!Z";
        objectArray[3] = "n0S\u0000g]e?BO\u0006Sn4F\u0015";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "F\u0011\u000e\u0011S\fY\u0001XnAK!\r\\\u000bX\u0001J\u001e\u000bV*\t_\u001a\u000eRGA\u001a\u0017Rn";
    }

    static void l() {
        DataTransformationUtility.Z(Y5.b);
        DataTransformationUtility.Z(v);
        DataTransformationUtility.Z(i);
        DataTransformationUtility.Z(A);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ReflectionUtilityResolver910.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ReflectionUtilityResolver910.b(classArray[i], string, clazz2);
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
            return MethodHandles.lookup().findStatic(ReflectionUtilityResolver910.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

