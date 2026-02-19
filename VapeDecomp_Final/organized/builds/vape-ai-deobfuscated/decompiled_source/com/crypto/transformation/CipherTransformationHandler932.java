/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  org.jetbrains.annotations.Nullable
 */
package com.crypto.transformation;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class CipherTransformationHandler932 {
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final long a;
    private static final String[] f;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/X2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CipherTransformationHandler932.a = MultiContainerRegistry.a(8522290662229909382L, 6751768755099409183L, MethodHandles.lookup().lookupClass()).a(68609300162072L);
                CipherTransformationHandler932.e = new Object[5];
                CipherTransformationHandler932.f = new String[5];
                CipherTransformationHandler932.a();
                CipherTransformationHandler932.d = new HashMap<K, V>(13);
                var0 = CipherTransformationHandler932.a ^ 41100945182351L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u000e\u00b5\u00e8b\u00be\u0002\u00da\u0093\u0000\u00cd\u00c0A\u0016e%\u00ab\u00dfwS,\u00c1\u00c7z\u00ebl\u00e8V\u0085\u00d3\u00f9\u0017~\u008f_\u00cdPF\u00d8>9\u00dfk\u00cb\u009dw\u00b3\u0001\u0003\u00ca\u0015\u00fbK\u00ae\u00e4\u00b03";
                var7_6 = "\u000e\u00b5\u00e8b\u00be\u0002\u00da\u0093\u0000\u00cd\u00c0A\u0016e%\u00ab\u00dfwS,\u00c1\u00c7z\u00ebl\u00e8V\u0085\u00d3\u00f9\u0017~\u008f_\u00cdPF\u00d8>9\u00dfk\u00cb\u009dw\u00b3\u0001\u0003\u00ca\u0015\u00fbK\u00ae\u00e4\u00b03".length();
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
                    var6_5 = "\u00dej\u00cf\u0006?\u00a5]_\u0018\u0012\\\f33]\u00ec";
                    var7_6 = "\u00dej\u00cf\u0006?\u00a5]_\u0018\u0012\\\f33]\u00ec".length();
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
        CipherTransformationHandler932.b = var8_3;
        CipherTransformationHandler932.c = new Integer[9];
    }

    private static Field c(long l, long l2) {
        int n = CipherTransformationHandler932.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CipherTransformationHandler932.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CipherTransformationHandler932.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CipherTransformationHandler932.a(clazz3, string2, clazz2)) != null) {
                    CipherTransformationHandler932.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CipherTransformationHandler932.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CipherTransformationHandler932.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CipherTransformationHandler932.b(218280725240831L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0018y,";
        objectArray[1] = Integer.TYPE;
        CipherTransformationHandler932.f[1] = "java/lang/Integer";
        objectArray[2] = "DbnDk{Om\u007f\u000b\u0016c\\jvB";
        objectArray[3] = "U7\u0001+\b\u0002^8\u0010di\fU3\u0014>";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001aoKH$oEu\u0014+w.|\u007f\u0014O\u007f'Ge\u0018D\u001cl\u000e?\u0003\u0017e6\u0019c\u0017+";
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CipherTransformationHandler932.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/X2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CipherTransformationHandler932.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CipherTransformationHandler932.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static JsonObject H(String string, String string2, String string3, List<String> list, boolean bl, boolean bl2, boolean bl3, @Nullable UUID uUID, JsonObject jsonObject) {
        String string4;
        CallSite callSite;
        JsonObject jsonObject2;
        long l = a ^ 0xED1450D043BL;
        JsonArray jsonArray = new JsonArray();
        for (String string5 : list) {
            jsonArray.add((JsonElement)new JsonPrimitive(string5));
        }
        JsonObject jsonObject3 = new JsonObject();
        try {
            jsonObject3.addProperty((String)((Object)CipherTransformationHandler932.b("N", (int)CipherTransformationHandler932.a("w", (int)19832, (long)(0x24F23EE08FE8B69AL ^ l)), (long)-7902037773834958290L, (long)l)), string);
            jsonObject3.addProperty((String)((Object)CipherTransformationHandler932.b("N", (int)CipherTransformationHandler932.a("w", (int)19124, (long)(0x152B41923E42B152L ^ l)), (long)-7902037773834958290L, (long)l)), string2);
            jsonObject3.addProperty((String)((Object)CipherTransformationHandler932.b("N", (int)CipherTransformationHandler932.a("w", (int)29486, (long)(0x39801CA02FD808CDL ^ l)), (long)-7902037773834958290L, (long)l)), string3);
            jsonObject3.add((String)((Object)CipherTransformationHandler932.b("N", (int)CipherTransformationHandler932.a("w", (int)14115, (long)(0x5C83AFB59F9FCCC2L ^ l)), (long)-7902037773834958290L, (long)l)), (JsonElement)jsonArray);
            jsonObject3.addProperty((String)((Object)CipherTransformationHandler932.b("N", (int)CipherTransformationHandler932.a("w", (int)4134, (long)(0x24B791003D366BC2L ^ l)), (long)-7902037773834958290L, (long)l)), Boolean.valueOf(bl));
            jsonObject3.addProperty((String)((Object)CipherTransformationHandler932.b("N", (int)CipherTransformationHandler932.a("w", (int)15297, (long)(0x33339AD2DAEEC02BL ^ l)), (long)-7902037773834958290L, (long)l)), Boolean.valueOf(bl2));
            jsonObject3.addProperty((String)((Object)CipherTransformationHandler932.b("N", (int)CipherTransformationHandler932.a("w", (int)32363, (long)(0x396607D7270E858BL ^ l)), (long)-7902037773834958290L, (long)l)), Boolean.valueOf(bl3));
            jsonObject2 = jsonObject3;
            callSite = CipherTransformationHandler932.b("N", (int)CipherTransformationHandler932.a("w", (int)19259, (long)(0x1A9D59540A3B0DCL ^ l)), (long)-7902037773834958290L, (long)l);
            string4 = uUID != null ? uUID.toString() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw CipherTransformationHandler932.a(customSystemException);
        }
        jsonObject2.addProperty((String)((Object)callSite), string4);
        jsonObject3.add((String)((Object)CipherTransformationHandler932.b("N", (int)CipherTransformationHandler932.a("w", (int)26081, (long)(0x6E748D8024379E04L ^ l)), (long)-7902037773834958290L, (long)l)), (JsonElement)jsonObject);
        return jsonObject3;
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
                n3 = 28;
                break;
            }
            case 1: {
                n3 = 10;
                break;
            }
            case 2: {
                n3 = 54;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 7;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 33;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 63;
                break;
            }
            case 10: {
                n3 = 50;
                break;
            }
            case 11: {
                n3 = 4;
                break;
            }
            case 12: {
                n3 = 39;
                break;
            }
            case 13: {
                n3 = 40;
                break;
            }
            case 14: {
                n3 = 30;
                break;
            }
            case 15: {
                n3 = 14;
                break;
            }
            case 16: {
                n3 = 31;
                break;
            }
            case 17: {
                n3 = 9;
                break;
            }
            case 18: {
                n3 = 16;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 20: {
                n3 = 3;
                break;
            }
            case 21: {
                n3 = 52;
                break;
            }
            case 22: {
                n3 = 37;
                break;
            }
            case 23: {
                n3 = 49;
                break;
            }
            case 24: {
                n3 = 56;
                break;
            }
            case 25: {
                n3 = 12;
                break;
            }
            case 26: {
                n3 = 8;
                break;
            }
            case 27: {
                n3 = 59;
                break;
            }
            case 28: {
                n3 = 35;
                break;
            }
            case 29: {
                n3 = 41;
                break;
            }
            case 30: {
                n3 = 45;
                break;
            }
            case 31: {
                n3 = 46;
                break;
            }
            case 32: {
                n3 = 23;
                break;
            }
            case 33: {
                n3 = 25;
                break;
            }
            case 34: {
                n3 = 13;
                break;
            }
            case 35: {
                n3 = 60;
                break;
            }
            case 36: {
                n3 = 48;
                break;
            }
            case 37: {
                n3 = 38;
                break;
            }
            case 38: {
                n3 = 27;
                break;
            }
            case 39: {
                n3 = 5;
                break;
            }
            case 40: {
                n3 = 2;
                break;
            }
            case 41: {
                n3 = 24;
                break;
            }
            case 42: {
                n3 = 0;
                break;
            }
            case 43: {
                n3 = 15;
                break;
            }
            case 44: {
                n3 = 32;
                break;
            }
            case 45: {
                n3 = 43;
                break;
            }
            case 46: {
                n3 = 58;
                break;
            }
            case 47: {
                n3 = 20;
                break;
            }
            case 48: {
                n3 = 51;
                break;
            }
            case 49: {
                n3 = 17;
                break;
            }
            case 50: {
                n3 = 61;
                break;
            }
            case 51: {
                n3 = 62;
                break;
            }
            case 52: {
                n3 = 26;
                break;
            }
            case 53: {
                n3 = 36;
                break;
            }
            case 54: {
                n3 = 57;
                break;
            }
            case 55: {
                n3 = 19;
                break;
            }
            case 56: {
                n3 = 29;
                break;
            }
            case 57: {
                n3 = 18;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 55;
                break;
            }
            case 60: {
                n3 = 21;
                break;
            }
            case 61: {
                n3 = 44;
                break;
            }
            case 62: {
                n3 = 34;
                break;
            }
            default: {
                n3 = 42;
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
        CipherTransformationHandler932.f[n4] = new String(cArray);
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = CipherTransformationHandler932.a(l, l2);
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
                clazz3 = CipherTransformationHandler932.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CipherTransformationHandler932.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CipherTransformationHandler932.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CipherTransformationHandler932.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CipherTransformationHandler932.b(218280725240831L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CipherTransformationHandler932.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CipherTransformationHandler932.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CipherTransformationHandler932.b(218280725240831L, 0L);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CipherTransformationHandler932.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x69B5;
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
                throw new RuntimeException("a/X2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CipherTransformationHandler932.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CipherTransformationHandler932.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CipherTransformationHandler932.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'B' || c == 'E' || c == '\u00eb' || c == '\u00e9') {
                field = CipherTransformationHandler932.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CipherTransformationHandler932.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'N' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CipherTransformationHandler932.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CipherTransformationHandler932.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CipherTransformationHandler932.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CipherTransformationHandler932.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

