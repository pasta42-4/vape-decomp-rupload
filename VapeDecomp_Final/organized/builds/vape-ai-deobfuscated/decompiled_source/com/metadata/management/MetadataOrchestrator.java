/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.metadata.management;

import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MetadataOrchestrator {
    private static final Object[] e;
    private static final long a;
    private static final String[] f;
    private final List<ConfigurationProfileResolver<?, ?>> J = new ArrayList();
    private static final Map d;
    private static final long[] b;
    private static final Integer[] c;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Fa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MetadataOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MetadataOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "i\"T";
        objectArray[1] = Integer.TYPE;
        MetadataOrchestrator.f[1] = "java/lang/Integer";
        objectArray[2] = " ^\\R\u0017u+QM\u001djm8VDT";
        objectArray[3] = "i\u001aC%\u000eKb\u0015RjoEi\u001eV0";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "9\u000eU!+6jKd&-Yj\u0004]#7flE\u0001rV`2U\u0015v5!)\n_M";
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MetadataOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MetadataOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = MetadataOrchestrator.a(l, l2);
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
                clazz3 = MetadataOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MetadataOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MetadataOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MetadataOrchestrator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MetadataOrchestrator.b(252210342225104L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MetadataOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MetadataOrchestrator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MetadataOrchestrator.b(252210342225104L, 0L);
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

    public JsonArray B() {
        long l = a ^ 0x3D3C06246C9BL;
        JsonArray jsonArray = new JsonArray();
        for (ConfigurationProfileResolver<?, ?> jsonObject2 : this.J) {
            try {
                if (jsonObject2.p()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MetadataOrchestrator.a(customSystemException);
            }
            jsonArray.add((JsonElement)jsonObject2.k(false));
        }
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.add((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)6117, (long)(0x5DCB8113C4B9AF0BL ^ l)), (long)-5011086565251398629L, (long)l)), (JsonElement)TemporalMetadataResolver.h.g().a());
        jsonArray.add((JsonElement)jsonObject3);
        JsonObject jsonObject = new JsonObject();
        jsonObject.add((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)28484, (long)(0x20DCE6A6DDFED7A5L ^ l)), (long)-5011086565251398629L, (long)l)), (JsonElement)GraphicalRenderingController.K.P());
        jsonArray.add((JsonElement)jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)29827, (long)(0x78ED1CD9B8B3CC6FL ^ l)), (long)-5011086565251398629L, (long)l)), (JsonElement)TemporalMetadataResolver.h.w().V());
        jsonArray.add((JsonElement)jsonObject2);
        return jsonArray;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00eb' || c == '\u00fa' || c == '\u00e4' || c == '\u00c3') {
                field = MetadataOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00eb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MetadataOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public List<ConfigurationProfileResolver<?, ?>> Z() {
        return this.J;
    }

    private static Field c(long l, long l2) {
        int n = MetadataOrchestrator.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = MetadataOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MetadataOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MetadataOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    MetadataOrchestrator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MetadataOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MetadataOrchestrator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MetadataOrchestrator.b(252210342225104L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MetadataOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MetadataOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Fa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void z(ConfigurationProfileResolver<?, ?> configurationProfileResolver) {
        this.J.add(configurationProfileResolver);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MetadataOrchestrator.a = MultiContainerRegistry.a(-30744092190139423L, -8034803664732387089L, MethodHandles.lookup().lookupClass()).a(220561818295569L);
                MetadataOrchestrator.e = new Object[5];
                MetadataOrchestrator.f = new String[5];
                MetadataOrchestrator.a();
                MetadataOrchestrator.d = new HashMap<K, V>(13);
                var0 = MetadataOrchestrator.a ^ 733311579675L;
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
                var6_5 = "\"\u00f5\u00ea\u00dc\u00ca\f\u00dd\u0011\u0090\u0091JS%\u001bt\u00f2h\u00a5\u00d8*4\u0015\u00f1y\u00e8\u00b1z6~\u0094\u00a0\u00e2V\u00c5\u00f2q\u00b2S\u007f:L\u00db\u00d0\u001e6\u00a6\u009c\u00c3\u009c,\u008d\u00c3+,\u00day\u00bc\u00b5\u0019}I\u00d4\u00db\u00ab\u00fe\u0080\u0085>w\u00bde\t\u0019m\u008a\u00f44\u00f2/\u00ec";
                var7_6 = "\"\u00f5\u00ea\u00dc\u00ca\f\u00dd\u0011\u0090\u0091JS%\u001bt\u00f2h\u00a5\u00d8*4\u0015\u00f1y\u00e8\u00b1z6~\u0094\u00a0\u00e2V\u00c5\u00f2q\u00b2S\u007f:L\u00db\u00d0\u001e6\u00a6\u009c\u00c3\u009c,\u008d\u00c3+,\u00day\u00bc\u00b5\u0019}I\u00d4\u00db\u00ab\u00fe\u0080\u0085>w\u00bde\t\u0019m\u008a\u00f44\u00f2/\u00ec".length();
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
                    var6_5 = "&\u00e8t\u00e5X\u00e5\u00c1k\u0018DX>\u00b7\u00a7\u000b\u001f";
                    var7_6 = "&\u00e8t\u00e5X\u00e5\u00c1k\u0018DX>\u00b7\u00a7\u000b\u001f".length();
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
        MetadataOrchestrator.b = var8_3;
        MetadataOrchestrator.c = new Integer[12];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MetadataOrchestrator.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                MetadataOrchestrator.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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
                n3 = 17;
                break;
            }
            case 1: {
                n3 = 42;
                break;
            }
            case 2: {
                n3 = 19;
                break;
            }
            case 3: {
                n3 = 11;
                break;
            }
            case 4: {
                n3 = 47;
                break;
            }
            case 5: {
                n3 = 39;
                break;
            }
            case 6: {
                n3 = 24;
                break;
            }
            case 7: {
                n3 = 37;
                break;
            }
            case 8: {
                n3 = 49;
                break;
            }
            case 9: {
                n3 = 57;
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
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 29;
                break;
            }
            case 14: {
                n3 = 58;
                break;
            }
            case 15: {
                n3 = 15;
                break;
            }
            case 16: {
                n3 = 25;
                break;
            }
            case 17: {
                n3 = 16;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 6;
                break;
            }
            case 20: {
                n3 = 45;
                break;
            }
            case 21: {
                n3 = 59;
                break;
            }
            case 22: {
                n3 = 35;
                break;
            }
            case 23: {
                n3 = 34;
                break;
            }
            case 24: {
                n3 = 14;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 43;
                break;
            }
            case 27: {
                n3 = 33;
                break;
            }
            case 28: {
                n3 = 26;
                break;
            }
            case 29: {
                n3 = 13;
                break;
            }
            case 30: {
                n3 = 8;
                break;
            }
            case 31: {
                n3 = 63;
                break;
            }
            case 32: {
                n3 = 4;
                break;
            }
            case 33: {
                n3 = 61;
                break;
            }
            case 34: {
                n3 = 50;
                break;
            }
            case 35: {
                n3 = 36;
                break;
            }
            case 36: {
                n3 = 0;
                break;
            }
            case 37: {
                n3 = 40;
                break;
            }
            case 38: {
                n3 = 27;
                break;
            }
            case 39: {
                n3 = 21;
                break;
            }
            case 40: {
                n3 = 9;
                break;
            }
            case 41: {
                n3 = 3;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 31;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 56;
                break;
            }
            case 47: {
                n3 = 1;
                break;
            }
            case 48: {
                n3 = 22;
                break;
            }
            case 49: {
                n3 = 52;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 12;
                break;
            }
            case 52: {
                n3 = 7;
                break;
            }
            case 53: {
                n3 = 53;
                break;
            }
            case 54: {
                n3 = 10;
                break;
            }
            case 55: {
                n3 = 48;
                break;
            }
            case 56: {
                n3 = 55;
                break;
            }
            case 57: {
                n3 = 41;
                break;
            }
            case 58: {
                n3 = 5;
                break;
            }
            case 59: {
                n3 = 2;
                break;
            }
            case 60: {
                n3 = 23;
                break;
            }
            case 61: {
                n3 = 38;
                break;
            }
            case 62: {
                n3 = 44;
                break;
            }
            default: {
                n3 = 32;
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
        MetadataOrchestrator.f[n4] = new String(cArray);
        return n4;
    }

    public void V(JsonArray jsonArray) {
        long l = a ^ 0x715403AAC73CL;
        try {
            if (jsonArray.size() == 0) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetadataOrchestrator.a(customSystemException);
        }
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonArray jsonArray2;
            JsonObject jsonObject;
            block21: {
                block20: {
                    JsonElement jsonElement = jsonArray.get(i);
                    try {
                        try {
                            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MetadataOrchestrator.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataOrchestrator.a(customSystemException);
                    }
                    jsonObject = jsonElement.getAsJsonObject();
                    for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : this.J) {
                        try {
                            if (!configurationProfileResolver.g(jsonObject)) continue;
                            configurationProfileResolver.C(jsonObject);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MetadataOrchestrator.a(customSystemException);
                        }
                    }
                    try {
                        if (jsonObject.get((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)26730, (long)(0x292374657255FB2BL ^ l)), (long)1284167156560031676L, (long)l))) == null || jsonObject.get((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)23835, (long)(0x34161A8E92294E51L ^ l)), (long)1284167156560031676L, (long)l))).isJsonNull()) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataOrchestrator.a(customSystemException);
                    }
                    jsonArray2 = jsonObject.get((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)10154, (long)(0x5D87B82EDDA4B4EEL ^ l)), (long)1284167156560031676L, (long)l))).getAsJsonArray();
                    TemporalMetadataResolver.h.g().q(jsonArray2);
                }
                try {
                    if (jsonObject.get((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)493, (long)(0x1653A252A6A012A5L ^ l)), (long)1284167156560031676L, (long)l))) == null || jsonObject.get((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)13106, (long)(0x1E3BF88F628C2075L ^ l)), (long)1284167156560031676L, (long)l))).isJsonNull()) break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataOrchestrator.a(customSystemException);
                }
                jsonArray2 = jsonObject.get((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)8935, (long)(0xFD5132C25F631A7L ^ l)), (long)1284167156560031676L, (long)l))).getAsJsonArray();
                if (!TemporalMetadataResolver.h.F().t.s().booleanValue()) {
                    JsonArray jsonArray3 = new JsonArray();
                    jsonArray3.add((JsonElement)jsonArray2);
                    GraphicalRenderingController.K.N(jsonArray3);
                }
            }
            try {
                if (jsonObject.get((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)30413, (long)(0x28885D9B555D6588L ^ l)), (long)1284167156560031676L, (long)l))) == null || jsonObject.get((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)4718, (long)(0x3439DD0001B9812DL ^ l)), (long)1284167156560031676L, (long)l))).isJsonNull()) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw MetadataOrchestrator.a(customSystemException);
            }
            jsonArray2 = jsonObject.get((String)((Object)MetadataOrchestrator.b("v", (int)MetadataOrchestrator.a("r", (int)431, (long)(0x567B049361FC92EDL ^ l)), (long)1284167156560031676L, (long)l))).getAsJsonObject();
            TemporalMetadataResolver.h.w().W((JsonObject)jsonArray2);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x293;
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
                throw new RuntimeException("a/Fa", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MetadataOrchestrator.c[n2] = n3;
        }
        return c[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MetadataOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(MetadataOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

