/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;
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

public class ClassMetadataResolver {
    private static final Map d;
    private Class[] V;
    private static final Integer[] c;
    private static final String[] f;
    private String M;
    private Class n;
    private Class v;
    private static final Object[] e;
    private static final long a;
    private Class[] W;
    private CryptoProtocolEngine j;
    private Class k;
    private static final long[] b;
    private boolean F;
    private String K;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/RG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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
                n3 = 57;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 9;
                break;
            }
            case 3: {
                n3 = 36;
                break;
            }
            case 4: {
                n3 = 18;
                break;
            }
            case 5: {
                n3 = 59;
                break;
            }
            case 6: {
                n3 = 2;
                break;
            }
            case 7: {
                n3 = 20;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 14;
                break;
            }
            case 10: {
                n3 = 34;
                break;
            }
            case 11: {
                n3 = 23;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 40;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 16: {
                n3 = 15;
                break;
            }
            case 17: {
                n3 = 27;
                break;
            }
            case 18: {
                n3 = 46;
                break;
            }
            case 19: {
                n3 = 42;
                break;
            }
            case 20: {
                n3 = 24;
                break;
            }
            case 21: {
                n3 = 44;
                break;
            }
            case 22: {
                n3 = 19;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 24: {
                n3 = 62;
                break;
            }
            case 25: {
                n3 = 31;
                break;
            }
            case 26: {
                n3 = 48;
                break;
            }
            case 27: {
                n3 = 26;
                break;
            }
            case 28: {
                n3 = 4;
                break;
            }
            case 29: {
                n3 = 28;
                break;
            }
            case 30: {
                n3 = 30;
                break;
            }
            case 31: {
                n3 = 22;
                break;
            }
            case 32: {
                n3 = 56;
                break;
            }
            case 33: {
                n3 = 60;
                break;
            }
            case 34: {
                n3 = 55;
                break;
            }
            case 35: {
                n3 = 63;
                break;
            }
            case 36: {
                n3 = 54;
                break;
            }
            case 37: {
                n3 = 39;
                break;
            }
            case 38: {
                n3 = 25;
                break;
            }
            case 39: {
                n3 = 33;
                break;
            }
            case 40: {
                n3 = 38;
                break;
            }
            case 41: {
                n3 = 13;
                break;
            }
            case 42: {
                n3 = 52;
                break;
            }
            case 43: {
                n3 = 1;
                break;
            }
            case 44: {
                n3 = 58;
                break;
            }
            case 45: {
                n3 = 35;
                break;
            }
            case 46: {
                n3 = 29;
                break;
            }
            case 47: {
                n3 = 6;
                break;
            }
            case 48: {
                n3 = 21;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 47;
                break;
            }
            case 51: {
                n3 = 11;
                break;
            }
            case 52: {
                n3 = 7;
                break;
            }
            case 53: {
                n3 = 0;
                break;
            }
            case 54: {
                n3 = 37;
                break;
            }
            case 55: {
                n3 = 3;
                break;
            }
            case 56: {
                n3 = 43;
                break;
            }
            case 57: {
                n3 = 17;
                break;
            }
            case 58: {
                n3 = 61;
                break;
            }
            case 59: {
                n3 = 8;
                break;
            }
            case 60: {
                n3 = 5;
                break;
            }
            case 61: {
                n3 = 49;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 51;
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
        ClassMetadataResolver.f[n4] = new String(cArray);
        return n4;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ClassMetadataResolver.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public String S() {
        long l = a ^ 0x45E663DCB8CEL;
        StringBuilder stringBuilder = new StringBuilder((String)((Object)ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)32681, (long)(0x471B7EA685938A84L ^ l)), (long)5764394206064182938L, (long)l)));
        for (Class clazz : this.V) {
            String string = clazz.getName();
            stringBuilder.append(string).append((String)((Object)ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)14747, (long)(0x742A06BCB5B4CCB5L ^ l)), (long)5764394206064182938L, (long)l)));
        }
        try {
            if (stringBuilder.length() > 1) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataResolver.a(customSystemException);
        }
        stringBuilder.append((String)((Object)ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)25847, (long)(0x55D973E04C1591D6L ^ l)), (long)5764394206064182938L, (long)l))).append(this.n.getName());
        return stringBuilder.toString();
    }

    private static Field c(long l, long l2) {
        int n = ClassMetadataResolver.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ClassMetadataResolver.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ClassMetadataResolver.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ClassMetadataResolver.a(clazz3, string2, clazz2)) != null) {
                    ClassMetadataResolver.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ClassMetadataResolver.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ClassMetadataResolver.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ClassMetadataResolver.b(244030773918294L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public String Z() {
        long l = a ^ 0x3D34AF9B43FBL;
        try {
            if (this.n == null) {
                return ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)14373, (long)(0x2DDD9E69827C3632L ^ l)), (long)-5419443131114226257L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataResolver.a(customSystemException);
        }
        try {
            if (this.V == null) {
                return ReflectionMetadataResolver.Y(this.n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataResolver.a(customSystemException);
        }
        StringBuilder stringBuilder = new StringBuilder((String)((Object)ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)14250, (long)(0x4C27442CD37A39BCL ^ l)), (long)-5419443131114226257L, (long)l)));
        for (Class clazz : this.V) {
            String string = ReflectionMetadataResolver.Y(clazz);
            stringBuilder.append(string).append((String)((Object)ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)23529, (long)(0xEB7877623E8D5FBL ^ l)), (long)-5419443131114226257L, (long)l)));
        }
        try {
            if (stringBuilder.length() > 1) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataResolver.a(customSystemException);
        }
        stringBuilder.append((String)((Object)ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)15634, (long)(0x553C30AAD90DB301L ^ l)), (long)-5419443131114226257L, (long)l))).append(ReflectionMetadataResolver.Y(this.n));
        return stringBuilder.toString();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ClassMetadataResolver.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/RG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public String z() {
        long l = a ^ 0x47BB5FEB5D02L;
        try {
            if (this.v == null) {
                return ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)79, (long)(0x414B0DF2322B10AFL ^ l)), (long)-6182527904976379050L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataResolver.a(customSystemException);
        }
        try {
            if (this.W == null) {
                return ReflectionMetadataResolver.Y(this.v);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataResolver.a(customSystemException);
        }
        StringBuilder stringBuilder = new StringBuilder((String)((Object)ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)19000, (long)(0x119C2BDC2455DAD0L ^ l)), (long)-6182527904976379050L, (long)l)));
        for (Class clazz : this.W) {
            String string = ReflectionMetadataResolver.Y(clazz);
            stringBuilder.append(string).append((String)((Object)ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)26060, (long)(0x22BD2708F938F520L ^ l)), (long)-6182527904976379050L, (long)l)));
        }
        try {
            if (stringBuilder.length() > 1) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ClassMetadataResolver.a(customSystemException);
        }
        stringBuilder.append((String)((Object)ClassMetadataResolver.b("\u00fc", (int)ClassMetadataResolver.a("t", (int)23393, (long)(0xBF75936E657CB88L ^ l)), (long)-6182527904976379050L, (long)l))).append(ReflectionMetadataResolver.Y(this.v));
        return stringBuilder.toString();
    }

    public String v() {
        return ReflectionMetadataResolver.Y(this.k);
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ClassMetadataResolver.a = MultiContainerRegistry.a(3883192253669694436L, 7347267486545396768L, MethodHandles.lookup().lookupClass()).a(46638659355525L);
                ClassMetadataResolver.e = new Object[5];
                ClassMetadataResolver.f = new String[5];
                ClassMetadataResolver.a();
                ClassMetadataResolver.d = new HashMap<K, V>(13);
                var0 = ClassMetadataResolver.a ^ 82190329784515L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u0002\u0000zM\u00ab\u001d\u0087\r! 86\u00c3\u0084\u00da\u009b\u0007\u009c\u00c5V\u00a1\u00ec\u00ae\u00fa\u001b9\u008d8\u0000\u00c7\u00e6eo=%\u00fd\u000bc\u0097=\u00c3C\u00c9\u000eT\u00b42\u00ac+(\u00ab>_\u00ae\u00ca]\u00b4\u0084\u00e9w\u00ac[\u00bf\u00b50\u0084\u00ed\t\u0090L\u0000\u00f5";
                var7_6 = "\u0002\u0000zM\u00ab\u001d\u0087\r! 86\u00c3\u0084\u00da\u009b\u0007\u009c\u00c5V\u00a1\u00ec\u00ae\u00fa\u001b9\u008d8\u0000\u00c7\u00e6eo=%\u00fd\u000bc\u0097=\u00c3C\u00c9\u000eT\u00b42\u00ac+(\u00ab>_\u00ae\u00ca]\u00b4\u0084\u00e9w\u00ac[\u00bf\u00b50\u0084\u00ed\t\u0090L\u0000\u00f5".length();
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
                    var6_5 = "\u00b7\u00b9a,\u00aa\u0083\u00f4\u00b9\u00d6\u00a5\u00fb\u00ac\u00b6\u00e9\u008e\u0001";
                    var7_6 = "\u00b7\u00b9a,\u00aa\u0083\u00f4\u00b9\u00d6\u00a5\u00fb\u00ac\u00b6\u00e9\u008e\u0001".length();
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
        ClassMetadataResolver.b = var8_3;
        ClassMetadataResolver.c = new Integer[11];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3ADA;
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
                throw new RuntimeException("a/RG", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ClassMetadataResolver.c[n2] = n3;
        }
        return c[n2];
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "!\u0003\u0019";
        objectArray[1] = Integer.TYPE;
        ClassMetadataResolver.f[1] = "java/lang/Integer";
        objectArray[2] = "-O\u007fi3c&@n&N{5Ggo";
        objectArray[3] = "Q{O=_?Zt^r>1Q\u007fZ(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "x?J\u0010k>+/Pbj(\u00125D\u0018s+i=\u000f\u0004\u0001jkuR\t?2.1Vb";
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ClassMetadataResolver.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ClassMetadataResolver.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public ClassMetadataResolver(CryptoProtocolEngine cryptoProtocolEngine, Class clazz, String string, Class clazz2, Class[] classArray, String string2, Class clazz3, Class[] classArray2, boolean bl) {
        this.j = cryptoProtocolEngine;
        this.k = clazz;
        this.M = string;
        this.n = clazz2;
        this.V = classArray;
        this.K = string2;
        this.v = clazz3;
        this.W = classArray2;
        this.F = bl;
    }

    private static Method d(long l, long l2) {
        int n = ClassMetadataResolver.a(l, l2);
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
                clazz3 = ClassMetadataResolver.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ClassMetadataResolver.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ClassMetadataResolver.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ClassMetadataResolver.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ClassMetadataResolver.b(244030773918294L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ClassMetadataResolver.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ClassMetadataResolver.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ClassMetadataResolver.b(244030773918294L, 0L);
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ClassMetadataResolver.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ClassMetadataResolver.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = ClassMetadataResolver.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ClassMetadataResolver.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'j' || c == '\u00c6' || c == '$' || c == '\u00dc') {
                field = ClassMetadataResolver.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'j' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ClassMetadataResolver.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ea' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ClassMetadataResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ClassMetadataResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

