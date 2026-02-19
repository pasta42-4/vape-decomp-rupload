/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.data.routing;

import a.Ok;
import a.Qv;
import a.ZB;
import com.collections.management.MultiContainerRegistry;
import com.google.gson.JsonObject;
import com.network.protocol.CommunicationProtocolDefinition;
import com.network.protocol.GenericProtocolInterceptor;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.context.RuntimeContextResolver;
import com.security.protocol.EncryptionProtocolHandler397;
import com.system.error.ErrorResilienceProtocol;
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
public class ContextualDataBroker166
implements GenericProtocolInterceptor<ContextualDataBroker166> {
    private static final long[] d;
    private int q;
    private static final String[] o;
    private static final Map j;
    private ErrorResilienceProtocol u;
    private static final Object[] k;
    private static final long b;
    private CommunicationProtocolDefinition P;
    private static final Integer[] i;
    private String s;

    @Override
    public Ok A() {
        return Ok.ENCHANTMENT;
    }

    @Override
    public String G() {
        return String.valueOf(this.q);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ContextualDataBroker166.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public ContextualDataBroker166 K(String string) {
        this.s = string;
        return this;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ContextualDataBroker166.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Dc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n4] != null) {
            return n4;
        }
        Object object = k[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 56;
                break;
            }
            case 1: {
                n3 = 57;
                break;
            }
            case 2: {
                n3 = 46;
                break;
            }
            case 3: {
                n3 = 39;
                break;
            }
            case 4: {
                n3 = 6;
                break;
            }
            case 5: {
                n3 = 55;
                break;
            }
            case 6: {
                n3 = 44;
                break;
            }
            case 7: {
                n3 = 34;
                break;
            }
            case 8: {
                n3 = 58;
                break;
            }
            case 9: {
                n3 = 40;
                break;
            }
            case 10: {
                n3 = 11;
                break;
            }
            case 11: {
                n3 = 51;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 37;
                break;
            }
            case 14: {
                n3 = 50;
                break;
            }
            case 15: {
                n3 = 13;
                break;
            }
            case 16: {
                n3 = 41;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 25;
                break;
            }
            case 19: {
                n3 = 18;
                break;
            }
            case 20: {
                n3 = 17;
                break;
            }
            case 21: {
                n3 = 15;
                break;
            }
            case 22: {
                n3 = 12;
                break;
            }
            case 23: {
                n3 = 19;
                break;
            }
            case 24: {
                n3 = 42;
                break;
            }
            case 25: {
                n3 = 23;
                break;
            }
            case 26: {
                n3 = 33;
                break;
            }
            case 27: {
                n3 = 2;
                break;
            }
            case 28: {
                n3 = 4;
                break;
            }
            case 29: {
                n3 = 52;
                break;
            }
            case 30: {
                n3 = 60;
                break;
            }
            case 31: {
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 14;
                break;
            }
            case 33: {
                n3 = 31;
                break;
            }
            case 34: {
                n3 = 5;
                break;
            }
            case 35: {
                n3 = 21;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 10;
                break;
            }
            case 38: {
                n3 = 16;
                break;
            }
            case 39: {
                n3 = 29;
                break;
            }
            case 40: {
                n3 = 63;
                break;
            }
            case 41: {
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 47;
                break;
            }
            case 43: {
                n3 = 62;
                break;
            }
            case 44: {
                n3 = 35;
                break;
            }
            case 45: {
                n3 = 36;
                break;
            }
            case 46: {
                n3 = 7;
                break;
            }
            case 47: {
                n3 = 49;
                break;
            }
            case 48: {
                n3 = 8;
                break;
            }
            case 49: {
                n3 = 26;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 9;
                break;
            }
            case 52: {
                n3 = 24;
                break;
            }
            case 53: {
                n3 = 22;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 1;
                break;
            }
            case 56: {
                n3 = 3;
                break;
            }
            case 57: {
                n3 = 53;
                break;
            }
            case 58: {
                n3 = 54;
                break;
            }
            case 59: {
                n3 = 43;
                break;
            }
            case 60: {
                n3 = 38;
                break;
            }
            case 61: {
                n3 = 30;
                break;
            }
            case 62: {
                n3 = 48;
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
        ContextualDataBroker166.o[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ContextualDataBroker166.b = MultiContainerRegistry.a(-6605117752906510491L, -8433590363901197489L, MethodHandles.lookup().lookupClass()).a(82964549516757L);
                ContextualDataBroker166.k = new Object[5];
                ContextualDataBroker166.o = new String[5];
                ContextualDataBroker166.c();
                ContextualDataBroker166.j = new HashMap<K, V>(13);
                var0 = ContextualDataBroker166.b ^ 39649724186696L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\n\u000f\u0000\t|\u00a0\u001c\u00dd\u001d\u001e\u00f2#d\u0012\u001a\u00d9:\u00d9g-\u0085\u0083I\fjT.J\r\u000b\u00c6HSh\u00f3a=\u00e0Z\u0084";
                var7_6 = "\n\u000f\u0000\t|\u00a0\u001c\u00dd\u001d\u001e\u00f2#d\u0012\u001a\u00d9:\u00d9g-\u0085\u0083I\fjT.J\r\u000b\u00c6HSh\u00f3a=\u00e0Z\u0084".length();
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
                    var6_5 = "\u00f6\u00feC\u0003\u00a1\u0091\\\u00bf\u0016^\u0085\u00a5\\\u0084\u00e3\u00e8";
                    var7_6 = "\u00f6\u00feC\u0003\u00a1\u0091\\\u00bf\u0016^\u0085\u00a5\\\u0084\u00e3\u00e8".length();
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
        ContextualDataBroker166.d = var8_3;
        ContextualDataBroker166.i = new Integer[7];
    }

    public ContextualDataBroker166 T(String string) throws NumberFormatException {
        this.q = Integer.parseInt(string);
        return this;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ContextualDataBroker166.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ContextualDataBroker166.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'z' || c == '\u00ed' || c == 'p' || c == 'W') {
                field = ContextualDataBroker166.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ContextualDataBroker166.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'S' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method l(long l, long l2) {
        int n = ContextualDataBroker166.i(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = ContextualDataBroker166.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ContextualDataBroker166.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ContextualDataBroker166.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ContextualDataBroker166.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ContextualDataBroker166.j(258657543828338L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ContextualDataBroker166.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ContextualDataBroker166.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ContextualDataBroker166.j(258657543828338L, 0L);
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

    public int M() {
        return this.q;
    }

    public ContextualDataBroker166(JsonObject jsonObject) {
        int n;
        long l = b ^ 0x76B0EDA663BL;
        this.P = CommunicationProtocolDefinition.HAS;
        this.u = ErrorResilienceProtocol.EQUALS;
        this.q = 1;
        this.P = CommunicationProtocolDefinition.U(EncryptionProtocolHandler397.g(jsonObject, (String)((Object)ContextualDataBroker166.e("S", (int)ContextualDataBroker166.b("g", (int)29912, (long)(0x3C2974ED271E3149L ^ l)), (long)-7174140929262242399L, (long)l))));
        this.s = EncryptionProtocolHandler397.g(jsonObject, (String)((Object)ContextualDataBroker166.e("S", (int)ContextualDataBroker166.b("g", (int)13938, (long)(0x469F2A8A641A73E1L ^ l)), (long)-7174140929262242399L, (long)l)));
        Integer n2 = EncryptionProtocolHandler397.m(jsonObject, (String)((Object)ContextualDataBroker166.e("S", (int)ContextualDataBroker166.b("g", (int)12871, (long)(0x5AACA50643D477D3L ^ l)), (long)-7174140929262242399L, (long)l)));
        try {
            ContextualDataBroker166 contextualDataBroker166 = this;
            n = n2 != null ? n2 : 1;
        }
        catch (NumberFormatException numberFormatException) {
            throw ContextualDataBroker166.a(numberFormatException);
        }
        contextualDataBroker166.q = n;
        this.u = ErrorResilienceProtocol.B(jsonObject.get((String)((Object)ContextualDataBroker166.e("S", (int)ContextualDataBroker166.b("g", (int)19905, (long)(0x3ADBF339CF540854L ^ l)), (long)-7174140929262242399L, (long)l))).getAsString());
    }

    @Override
    public JsonObject a() {
        long l = b ^ 0x126E05D46322L;
        JsonObject jsonObject = GenericProtocolInterceptor.super.a();
        jsonObject.addProperty((String)((Object)ContextualDataBroker166.e("S", (int)ContextualDataBroker166.b("g", (int)15022, (long)(0x456BEC5AE63FA27L ^ l)), (long)-7392304948291718984L, (long)l)), this.P.O());
        jsonObject.addProperty((String)((Object)ContextualDataBroker166.e("S", (int)ContextualDataBroker166.b("g", (int)13873, (long)(0x719C1F8DC57DF6BEL ^ l)), (long)-7392304948291718984L, (long)l)), this.s);
        jsonObject.addProperty((String)((Object)ContextualDataBroker166.e("S", (int)ContextualDataBroker166.b("g", (int)17807, (long)(0x59B38C66B2D08501L ^ l)), (long)-7392304948291718984L, (long)l)), (Number)this.q);
        return jsonObject;
    }

    public String d() {
        return this.s;
    }

    private static Field k(long l, long l2) {
        int n = ContextualDataBroker166.i(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = ContextualDataBroker166.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ContextualDataBroker166.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ContextualDataBroker166.e(clazz3, string2, clazz2)) != null) {
                    ContextualDataBroker166.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ContextualDataBroker166.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ContextualDataBroker166.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ContextualDataBroker166.j(258657543828338L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public CommunicationProtocolDefinition A() {
        return this.P;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Dc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public ErrorResilienceProtocol l() {
        return this.u;
    }

    public ContextualDataBroker166(CommunicationProtocolDefinition communicationProtocolDefinition, String string, int n, ErrorResilienceProtocol errorResilienceProtocol) {
        this.P = CommunicationProtocolDefinition.HAS;
        this.u = ErrorResilienceProtocol.EQUALS;
        this.q = 1;
        this.P = communicationProtocolDefinition;
        this.s = string;
        this.q = n;
        this.u = errorResilienceProtocol;
    }

    private static void c() {
        Object[] objectArray = k;
        k[0] = "D-[";
        objectArray[1] = Integer.TYPE;
        ContextualDataBroker166.o[1] = "java/lang/Integer";
        objectArray[2] = "TBEn4\u0016_MT!I\u000eLJ]h";
        objectArray[3] = "[!t=\u001ePP.er\u007f^[%a(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "6-\t<YBf~\u0019WMX\u000fj\u001fn\\J?u\u0000m&\u001a`uA5\u0016\\dk\u0017W";
    }

    public ContextualDataBroker166 n() {
        return new ContextualDataBroker166(this.P, this.s, this.q, this.u);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public ContextualDataBroker166 q(CommunicationProtocolDefinition communicationProtocolDefinition) {
        this.P = communicationProtocolDefinition;
        return this;
    }

    public ContextualDataBroker166 r(int n) {
        this.q = n;
        return this;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x59E4;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Dc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ContextualDataBroker166.i[n2] = n3;
        }
        return i[n2];
    }

    public ContextualDataBroker166() {
        this.P = CommunicationProtocolDefinition.HAS;
        this.u = ErrorResilienceProtocol.EQUALS;
        this.q = 1;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ContextualDataBroker166.i(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                ContextualDataBroker166.k[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ContextualDataBroker166.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ContextualDataBroker166.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public ContextualDataBroker166 I(ErrorResilienceProtocol errorResilienceProtocol) {
        this.u = errorResilienceProtocol;
        return this;
    }

    @Override
    public boolean T(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (this.s == null) {
                return false;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ContextualDataBroker166.a(numberFormatException);
        }
        try {
            if (lightweightExecutionContext.Y()) {
                return false;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ContextualDataBroker166.a(numberFormatException);
        }
        Map<Qv, Short> map = RuntimeContextResolver.j(lightweightExecutionContext);
        try {
            if (map.isEmpty()) {
                return false;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw ContextualDataBroker166.a(numberFormatException);
        }
        for (Map.Entry<Qv, Short> entry : map.entrySet()) {
            block16: {
                Qv qv2 = entry.getKey();
                try {
                    try {
                        if (!ZB.x(qv2.G(1)).equalsIgnoreCase(this.s)) continue;
                        if (this.P != CommunicationProtocolDefinition.HAS) break block16;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw ContextualDataBroker166.a(numberFormatException);
                    }
                    return true;
                }
                catch (NumberFormatException numberFormatException) {
                    throw ContextualDataBroker166.a(numberFormatException);
                }
            }
            try {
                if (this.P != CommunicationProtocolDefinition.LEVEL) continue;
                return this.u.W(entry.getValue().shortValue(), this.q);
            }
            catch (NumberFormatException numberFormatException) {
                throw ContextualDataBroker166.a(numberFormatException);
            }
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ContextualDataBroker166.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ContextualDataBroker166.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

