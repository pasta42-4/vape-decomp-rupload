/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
package com.identity.management;

import com.collections.management.MultiContainerRegistry;
import com.data.serialization.SerializationOrchestrator;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.system.timing.TimestampCorrelationService;
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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class UniqueIdentifierManager {
    private final String D;
    private static final Integer[] c;
    private static final Map d;
    private final UUID M;
    private static final String[] h;
    private static final long a;
    private static final long[] b;
    private final String s;
    @Nullable
    private final TimestampCorrelationService e;
    private static final Object[] f;
    private final Map<String, Object> g;
    private final UUID K;

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = UniqueIdentifierManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public String H() {
        return this.D;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/cM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public UUID T() {
        return this.K;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'f' || c == '\u00f9' || c == 'v' || c == '\u00f3') {
                field = UniqueIdentifierManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'f' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'v' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = UniqueIdentifierManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '$' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x755E;
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
                throw new RuntimeException("a/cM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            UniqueIdentifierManager.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field c(long l, long l2) {
        int n = UniqueIdentifierManager.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = UniqueIdentifierManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = UniqueIdentifierManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = UniqueIdentifierManager.a(clazz3, string2, clazz2)) != null) {
                    UniqueIdentifierManager.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = UniqueIdentifierManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        UniqueIdentifierManager.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = UniqueIdentifierManager.b(261294401742846L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = UniqueIdentifierManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = UniqueIdentifierManager.b(classArray[i], string, clazz2);
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
            int n = UniqueIdentifierManager.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                UniqueIdentifierManager.f[n] = clazz = Class.forName(h[n]);
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
        MethodHandle methodHandle = UniqueIdentifierManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Nullable
    public TimestampCorrelationService Z() {
        return this.e;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = UniqueIdentifierManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = UniqueIdentifierManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    UniqueIdentifierManager(UUID uUID, UUID uUID2, String string, String string2, Map<String, Object> map, @Nullable TimestampCorrelationService timestampCorrelationService) {
        this.M = uUID;
        this.K = uUID2;
        this.s = string;
        this.D = string2;
        this.g = map;
        this.e = timestampCorrelationService;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 15;
                break;
            }
            case 1: {
                n3 = 56;
                break;
            }
            case 2: {
                n3 = 16;
                break;
            }
            case 3: {
                n3 = 39;
                break;
            }
            case 4: {
                n3 = 3;
                break;
            }
            case 5: {
                n3 = 13;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 24;
                break;
            }
            case 8: {
                n3 = 25;
                break;
            }
            case 9: {
                n3 = 20;
                break;
            }
            case 10: {
                n3 = 2;
                break;
            }
            case 11: {
                n3 = 27;
                break;
            }
            case 12: {
                n3 = 9;
                break;
            }
            case 13: {
                n3 = 30;
                break;
            }
            case 14: {
                n3 = 29;
                break;
            }
            case 15: {
                n3 = 41;
                break;
            }
            case 16: {
                n3 = 10;
                break;
            }
            case 17: {
                n3 = 51;
                break;
            }
            case 18: {
                n3 = 26;
                break;
            }
            case 19: {
                n3 = 48;
                break;
            }
            case 20: {
                n3 = 12;
                break;
            }
            case 21: {
                n3 = 62;
                break;
            }
            case 22: {
                n3 = 31;
                break;
            }
            case 23: {
                n3 = 63;
                break;
            }
            case 24: {
                n3 = 45;
                break;
            }
            case 25: {
                n3 = 35;
                break;
            }
            case 26: {
                n3 = 34;
                break;
            }
            case 27: {
                n3 = 14;
                break;
            }
            case 28: {
                n3 = 1;
                break;
            }
            case 29: {
                n3 = 32;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 38;
                break;
            }
            case 32: {
                n3 = 44;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 57;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 8;
                break;
            }
            case 37: {
                n3 = 0;
                break;
            }
            case 38: {
                n3 = 19;
                break;
            }
            case 39: {
                n3 = 52;
                break;
            }
            case 40: {
                n3 = 37;
                break;
            }
            case 41: {
                n3 = 36;
                break;
            }
            case 42: {
                n3 = 54;
                break;
            }
            case 43: {
                n3 = 59;
                break;
            }
            case 44: {
                n3 = 22;
                break;
            }
            case 45: {
                n3 = 61;
                break;
            }
            case 46: {
                n3 = 28;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 11;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 33;
                break;
            }
            case 51: {
                n3 = 18;
                break;
            }
            case 52: {
                n3 = 43;
                break;
            }
            case 53: {
                n3 = 7;
                break;
            }
            case 54: {
                n3 = 4;
                break;
            }
            case 55: {
                n3 = 55;
                break;
            }
            case 56: {
                n3 = 46;
                break;
            }
            case 57: {
                n3 = 53;
                break;
            }
            case 58: {
                n3 = 60;
                break;
            }
            case 59: {
                n3 = 21;
                break;
            }
            case 60: {
                n3 = 42;
                break;
            }
            case 61: {
                n3 = 40;
                break;
            }
            case 62: {
                n3 = 47;
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
        UniqueIdentifierManager.h[n4] = new String(cArray);
        return n4;
    }

    public JsonObject N() {
        JsonObject jsonObject;
        CallSite callSite;
        JsonObject jsonObject2;
        JsonElement jsonElement;
        CallSite callSite2;
        JsonObject jsonObject3;
        String string;
        CallSite callSite3;
        JsonObject jsonObject4;
        String string2;
        CallSite callSite4;
        JsonObject jsonObject5;
        long l = a ^ 0x87DB1608280L;
        JsonObject jsonObject6 = new JsonObject();
        try {
            jsonObject5 = jsonObject6;
            callSite4 = UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)2127, (long)(0x427337EDA556E0EAL ^ l)), (long)-7065193457449501488L, (long)l);
            string2 = this.M != null ? this.M.toString() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw UniqueIdentifierManager.a(customSystemException);
        }
        try {
            jsonObject5.addProperty((String)((Object)callSite4), string2);
            jsonObject4 = jsonObject6;
            callSite3 = UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)5236, (long)(0x148B74C306FE7CD0L ^ l)), (long)-7065193457449501488L, (long)l);
            string = this.K != null ? this.K.toString() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw UniqueIdentifierManager.a(customSystemException);
        }
        try {
            jsonObject4.addProperty((String)((Object)callSite3), string);
            jsonObject6.addProperty((String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)27529, (long)(0x2E50567328538320L ^ l)), (long)-7065193457449501488L, (long)l)), this.s);
            jsonObject6.addProperty((String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)31802, (long)(0x273CF774C2809494L ^ l)), (long)-7065193457449501488L, (long)l)), this.D);
            jsonObject3 = jsonObject6;
            callSite2 = UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)29155, (long)(0x15DDDB4AEF6B995FL ^ l)), (long)-7065193457449501488L, (long)l);
            jsonElement = this.g != null ? SerializationOrchestrator.q.toJsonTree(this.g) : null;
        }
        catch (CustomSystemException customSystemException) {
            throw UniqueIdentifierManager.a(customSystemException);
        }
        try {
            jsonObject3.add((String)((Object)callSite2), jsonElement);
            jsonObject2 = jsonObject6;
            callSite = UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)1894, (long)(0xBEE9C1A1847EFCEL ^ l)), (long)-7065193457449501488L, (long)l);
            jsonObject = this.e != null ? this.e.W() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw UniqueIdentifierManager.a(customSystemException);
        }
        jsonObject2.add((String)((Object)callSite), jsonObject);
        return jsonObject6;
    }

    public Map<String, Object> e() {
        return this.g;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                UniqueIdentifierManager.a = MultiContainerRegistry.a(5584478329659446471L, 6265563611392574412L, MethodHandles.lookup().lookupClass()).a(35951562888392L);
                UniqueIdentifierManager.f = new Object[5];
                UniqueIdentifierManager.h = new String[5];
                UniqueIdentifierManager.a();
                UniqueIdentifierManager.d = new HashMap<K, V>(13);
                var0 = UniqueIdentifierManager.a ^ 58542628999627L;
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
                var8_3 = new long[17];
                var5_4 = 0;
                var6_5 = "\u001b\u00b2h\u0006\u001c\u0000\"h\u0096\u008d5\u00c1\u00dd\u00ff1\u00ab\u0093-f\u00e5\u00a2\u009c\u000f\u00e1\u00f0{\u00a7\u008a\u00d4\u00cf_\u00cc5\u0098\u00f9\u00ed\u00d90i\u00cc\u00b1\u0083\u00ae\u00d9:VdI.V\u00e5=M\u00a1\u00ac\u00ea\u00b2\u00b2\u00b5\u00b7\u008a\u0092\u00ce\u00c8\u00f9\u00d7i\u00ea,V\u00d1xj\u00cd\u008d\u00e1\b^}\u007f2\u001bd\u0095\u00cd\u0002\"<\u00d3\u00d68\u0005h\u00ab\u0087\u0081L\u0017\u00bc>\u009c\u0081\u00ebN\u00be6@\u00b46\u00ea\u00bc(\u00bb\u0005\u00dc[\u00cd\u00d7/P";
                var7_6 = "\u001b\u00b2h\u0006\u001c\u0000\"h\u0096\u008d5\u00c1\u00dd\u00ff1\u00ab\u0093-f\u00e5\u00a2\u009c\u000f\u00e1\u00f0{\u00a7\u008a\u00d4\u00cf_\u00cc5\u0098\u00f9\u00ed\u00d90i\u00cc\u00b1\u0083\u00ae\u00d9:VdI.V\u00e5=M\u00a1\u00ac\u00ea\u00b2\u00b2\u00b5\u00b7\u008a\u0092\u00ce\u00c8\u00f9\u00d7i\u00ea,V\u00d1xj\u00cd\u008d\u00e1\b^}\u007f2\u001bd\u0095\u00cd\u0002\"<\u00d3\u00d68\u0005h\u00ab\u0087\u0081L\u0017\u00bc>\u009c\u0081\u00ebN\u00be6@\u00b46\u00ea\u00bc(\u00bb\u0005\u00dc[\u00cd\u00d7/P".length();
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
                    var6_5 = "\u00e7\u0091O\u00bc\u00aen\u00fe\u001f\u00b3\u00d0<\u0003xd\u00ab\u00c8";
                    var7_6 = "\u00e7\u0091O\u00bc\u00aen\u00fe\u001f\u00b3\u00d0<\u0003xd\u00ab\u00c8".length();
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
        UniqueIdentifierManager.b = var8_3;
        UniqueIdentifierManager.c = new Integer[17];
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "Re2";
        objectArray[1] = Integer.TYPE;
        UniqueIdentifierManager.h[1] = "java/lang/Integer";
        objectArray[2] = "|AR`\u001dKwNC/`SdIJf";
        objectArray[3] = "u!\\\t\u0014\u0005~.MFu\u000bu%I\u001c";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u007fzI\u001b\u0017oq\u007f\u0002pFvObR\nOisi\u000bA-4\"a\u0006M\u001d}pw\u0004p";
    }

    public String S() {
        return this.s;
    }

    @Nullable
    @Contract(value="!null -> !null; null -> null")
    public static UniqueIdentifierManager x(@Nullable JsonElement jsonElement) {
        UUID uUID;
        UniqueIdentifierManager uniqueIdentifierManager;
        UniqueIdentifierManager uniqueIdentifierManager2;
        JsonObject jsonObject;
        long l;
        block8: {
            JsonElement jsonElement2;
            block7: {
                block6: {
                    l = a ^ 0x786B1D736F29L;
                    try {
                        try {
                            if (jsonElement != null && !jsonElement.isJsonNull()) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw UniqueIdentifierManager.a(customSystemException);
                        }
                        return null;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw UniqueIdentifierManager.a(customSystemException);
                    }
                }
                jsonObject = jsonElement.getAsJsonObject();
                jsonElement2 = jsonObject.get((String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)428, (long)(0x29B7C452381E04A4L ^ l)), (long)8095805190648435065L, (long)l)));
                try {
                    UniqueIdentifierManager uniqueIdentifierManager3;
                    uniqueIdentifierManager2 = uniqueIdentifierManager3;
                    uniqueIdentifierManager = uniqueIdentifierManager3;
                    if (jsonElement2 != null && !jsonElement2.isJsonNull()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw UniqueIdentifierManager.a(customSystemException);
                }
                uUID = null;
                break block8;
            }
            uUID = UUID.fromString(jsonElement2.getAsString());
        }
        uniqueIdentifierManager2(uUID, UUID.fromString(jsonObject.get((String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)976, (long)(0x3E1267D2374386D5L ^ l)), (long)8095805190648435065L, (long)l))).getAsString()), jsonObject.get((String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)25465, (long)(0x7D6C0C373EDC667AL ^ l)), (long)8095805190648435065L, (long)l))).getAsString(), jsonObject.get((String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)13448, (long)(0x2670930D6B7B18AL ^ l)), (long)8095805190648435065L, (long)l))).getAsString(), (Map)SerializationOrchestrator.q.fromJson(jsonObject.get((String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)26934, (long)(0x500E2B4D691CEC39L ^ l)), (long)8095805190648435065L, (long)l))), Map.class), TimestampCorrelationService.F(jsonObject.get((String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)4614, (long)(0x6E0C5FBC5F919708L ^ l)), (long)8095805190648435065L, (long)l)))));
        return uniqueIdentifierManager;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/cM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public String toString() {
        long l = a ^ 0x445E32010D10L;
        return (String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)8486, (long)(0x561709FA97B04619L ^ l)), (long)1324955321213350720L, (long)l)) + this.M + (String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)5555, (long)(0x6DB084A5AB457281L ^ l)), (long)1324955321213350720L, (long)l)) + this.K + (String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)13393, (long)(0x2DAC9CA6954B536CL ^ l)), (long)1324955321213350720L, (long)l)) + this.s + '\'' + (String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)4532, (long)(0x63C4751E8B937684L ^ l)), (long)1324955321213350720L, (long)l)) + this.g + (String)((Object)UniqueIdentifierManager.b("$", (int)UniqueIdentifierManager.a("h", (int)28451, (long)(0x6560F4B1916A0810L ^ l)), (long)1324955321213350720L, (long)l)) + this.e + '}';
    }

    private static Method d(long l, long l2) {
        int n = UniqueIdentifierManager.a(l, l2);
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
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = UniqueIdentifierManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = UniqueIdentifierManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = UniqueIdentifierManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        UniqueIdentifierManager.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = UniqueIdentifierManager.b(261294401742846L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = UniqueIdentifierManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        UniqueIdentifierManager.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = UniqueIdentifierManager.b(261294401742846L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(UniqueIdentifierManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(UniqueIdentifierManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

