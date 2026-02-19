/*
 * Decompiled with CFR 0.152.
 */
package com.data.compression;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.cryptography.CryptographicContextManager153;
import com.temporal.metadata.TemporalMetadataResolver;
import java.awt.Color;
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

public class DataCompressionNegotiator
extends CryptographicContextManager153 {
    private static final Integer[] kb;
    private static final Map lb;
    private static final long ab;
    private static final long[] jb;
    private double v = -1.0;
    private static final Object[] ob;
    private static final String[] pb;
    private double L = 0.0;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public DataCompressionNegotiator(String string, double d2) {
        super(string, d2);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataCompressionNegotiator.ab = MultiContainerRegistry.a(-4613146497686810797L, -6443889500415829846L, MethodHandles.lookup().lookupClass()).a(126219631243168L);
                DataCompressionNegotiator.ob = new Object[5];
                DataCompressionNegotiator.pb = new String[5];
                DataCompressionNegotiator.i();
                DataCompressionNegotiator.lb = new HashMap<K, V>(13);
                var0 = DataCompressionNegotiator.ab ^ 49980438155215L;
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
                var6_5 = "\u00a08L\u0088\u00cda\u0085 \u00fb:\u00f3\u008ak\u000f\u001f[\u00f5\u0093\u00aa\u009e\u009eZ\u0086f\u00e6\u00bbO\u0086$w\u0019\u00c6\f\u0017o\u00e2e\u00ee@\u0000";
                var7_6 = "\u00a08L\u0088\u00cda\u0085 \u00fb:\u00f3\u008ak\u000f\u001f[\u00f5\u0093\u00aa\u009e\u009eZ\u0086f\u00e6\u00bbO\u0086$w\u0019\u00c6\f\u0017o\u00e2e\u00ee@\u0000".length();
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
                    var6_5 = "\u00bb\u009d\u0016\u001c\u00c0\u00b2\u0001\u00ed\u00ae>\u008c\u00aac\u0015\u00e3\u00df";
                    var7_6 = "\u00bb\u009d\u0016\u001c\u00c0\u00b2\u0001\u00ed\u00ae>\u008c\u00aac\u0015\u00e3\u00df".length();
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
        DataCompressionNegotiator.jb = var8_3;
        DataCompressionNegotiator.kb = new Integer[7];
    }

    public double B() {
        return this.L;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataCompressionNegotiator.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public double e() {
        return super.y();
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataCompressionNegotiator.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataCompressionNegotiator.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (pb[n4] != null) {
            return n4;
        }
        Object object = ob[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 44;
                break;
            }
            case 1: {
                n3 = 56;
                break;
            }
            case 2: {
                n3 = 11;
                break;
            }
            case 3: {
                n3 = 54;
                break;
            }
            case 4: {
                n3 = 51;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 52;
                break;
            }
            case 8: {
                n3 = 16;
                break;
            }
            case 9: {
                n3 = 19;
                break;
            }
            case 10: {
                n3 = 1;
                break;
            }
            case 11: {
                n3 = 3;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 48;
                break;
            }
            case 14: {
                n3 = 50;
                break;
            }
            case 15: {
                n3 = 43;
                break;
            }
            case 16: {
                n3 = 33;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 39;
                break;
            }
            case 20: {
                n3 = 22;
                break;
            }
            case 21: {
                n3 = 27;
                break;
            }
            case 22: {
                n3 = 42;
                break;
            }
            case 23: {
                n3 = 34;
                break;
            }
            case 24: {
                n3 = 24;
                break;
            }
            case 25: {
                n3 = 13;
                break;
            }
            case 26: {
                n3 = 49;
                break;
            }
            case 27: {
                n3 = 47;
                break;
            }
            case 28: {
                n3 = 58;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 5;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 57;
                break;
            }
            case 33: {
                n3 = 35;
                break;
            }
            case 34: {
                n3 = 61;
                break;
            }
            case 35: {
                n3 = 23;
                break;
            }
            case 36: {
                n3 = 59;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 25;
                break;
            }
            case 39: {
                n3 = 6;
                break;
            }
            case 40: {
                n3 = 28;
                break;
            }
            case 41: {
                n3 = 38;
                break;
            }
            case 42: {
                n3 = 21;
                break;
            }
            case 43: {
                n3 = 40;
                break;
            }
            case 44: {
                n3 = 30;
                break;
            }
            case 45: {
                n3 = 29;
                break;
            }
            case 46: {
                n3 = 26;
                break;
            }
            case 47: {
                n3 = 45;
                break;
            }
            case 48: {
                n3 = 4;
                break;
            }
            case 49: {
                n3 = 46;
                break;
            }
            case 50: {
                n3 = 8;
                break;
            }
            case 51: {
                n3 = 41;
                break;
            }
            case 52: {
                n3 = 12;
                break;
            }
            case 53: {
                n3 = 32;
                break;
            }
            case 54: {
                n3 = 55;
                break;
            }
            case 55: {
                n3 = 17;
                break;
            }
            case 56: {
                n3 = 9;
                break;
            }
            case 57: {
                n3 = 62;
                break;
            }
            case 58: {
                n3 = 2;
                break;
            }
            case 59: {
                n3 = 63;
                break;
            }
            case 60: {
                n3 = 18;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 37;
                break;
            }
            default: {
                n3 = 15;
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
        DataCompressionNegotiator.pb[n4] = new String(cArray);
        return n4;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4403;
        if (kb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = jb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataCompressionNegotiator.kb[n2] = n3;
        }
        return kb[n2];
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataCompressionNegotiator.i(l, l2);
            object = ob[n];
            try {
                if (!(object instanceof String)) break block2;
                DataCompressionNegotiator.ob[n] = clazz = Class.forName(pb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int Q(String string, double d2) {
        long l = ab ^ 0x6F0E88640694L;
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().u(this.B, false);
        if (string.contains((CharSequence)((Object)DataCompressionNegotiator.e("P", (int)DataCompressionNegotiator.c("r", (int)32705, (long)(0xC071355EAB24FD1L ^ l)), (long)-859814877860298641L, (long)l)))) {
            double d3;
            double d4;
            String[] stringArray = string.split((String)((Object)DataCompressionNegotiator.e("P", (int)DataCompressionNegotiator.c("r", (int)21907, (long)(0x4F2F601E85EBE585L ^ l)), (long)-859814877860298641L, (long)l)));
            double d5 = 0.0;
            String string2 = "";
            double d6 = 0.0;
            double d7 = cryptographicParameterGenerator.B(string);
            for (String string3 : stringArray) {
                double d8;
                double d9;
                d4 = cryptographicParameterGenerator.D(string3 + (String)((Object)DataCompressionNegotiator.e("P", (int)DataCompressionNegotiator.c("r", (int)28487, (long)(0x7DF0EC187D915F50L ^ l)), (long)-859814877860298641L, (long)l)));
                d5 += d4;
                try {
                    d9 = d5;
                    d8 = this.K() != -1.0 ? this.K() : this.w();
                }
                catch (CustomSystemException customSystemException) {
                    throw DataCompressionNegotiator.a(customSystemException);
                }
                if (d9 > d8) {
                    d3 = cryptographicParameterGenerator.D(string2);
                    double d10 = this.W() + d2 + this.b() / 2.0 - d7 / 2.0;
                    double d11 = this.G() + this.w() / 2.0;
                    double d12 = d11 - d3 / 2.0;
                    cryptographicParameterGenerator.R(string2, d12, d10, this.V());
                    string2 = "";
                    d5 = 0.0;
                    d6 += 1.0;
                    d2 += d7;
                    d5 += d4;
                }
                string2 = string2 + string3 + (String)((Object)DataCompressionNegotiator.e("P", (int)DataCompressionNegotiator.c("r", (int)23934, (long)(0xCB00EA266736D6DL ^ l)), (long)-859814877860298641L, (long)l));
            }
            if (d7 == 0.0) {
                d7 = cryptographicParameterGenerator.B((String)((Object)DataCompressionNegotiator.e("P", (int)DataCompressionNegotiator.c("r", (int)32515, (long)(0x46B0B370A654CF16L ^ l)), (long)-859814877860298641L, (long)l)));
            }
            double d13 = cryptographicParameterGenerator.D(string2);
            double d14 = this.W() + d2 + this.b() / 2.0 - d7 / 2.0;
            d4 = this.G() + this.w() / 2.0;
            d3 = d4 - d13 / 2.0;
            cryptographicParameterGenerator.R(string2, d3, d14, this.V());
            return (int)(d7 * (d6 += 1.0));
        }
        double d15 = cryptographicParameterGenerator.B(string);
        double d16 = cryptographicParameterGenerator.D(string);
        double d17 = this.W() + d2 + this.b() / 2.0 - d15 / 2.0;
        double d18 = this.G() + this.w() / 2.0;
        double d19 = d18 - d16 / 2.0;
        cryptographicParameterGenerator.R(string, d19, d17, this.V());
        return (int)d15;
    }

    private static Field k(long l, long l2) {
        int n = DataCompressionNegotiator.i(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            String string = pb[n];
            int n2 = string.indexOf(8);
            Class clazz = DataCompressionNegotiator.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataCompressionNegotiator.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataCompressionNegotiator.e(clazz3, string2, clazz2)) != null) {
                    DataCompressionNegotiator.ob[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataCompressionNegotiator.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataCompressionNegotiator.ob[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataCompressionNegotiator.j(242643724145564L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method l(long l, long l2) {
        int n = DataCompressionNegotiator.i(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataCompressionNegotiator.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataCompressionNegotiator.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataCompressionNegotiator.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataCompressionNegotiator.ob[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataCompressionNegotiator.j(242643724145564L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataCompressionNegotiator.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataCompressionNegotiator.ob[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataCompressionNegotiator.j(242643724145564L, 0L);
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

    @Override
    public void G() {
        long l = ab ^ 0x546128B88E8EL;
        if (this.E.contains((CharSequence)((Object)DataCompressionNegotiator.e("P", (int)DataCompressionNegotiator.c("r", (int)610, (long)(0x7FE2DE2FA32C3A6AL ^ l)), (long)8938353897619458165L, (long)l)))) {
            String[] stringArray = this.E.split((String)((Object)DataCompressionNegotiator.e("P", (int)DataCompressionNegotiator.c("r", (int)2049, (long)(0xF81171DE7BEB00AL ^ l)), (long)8938353897619458165L, (long)l)));
            int n = 0;
            for (String string : stringArray) {
                n += this.Q(string, n);
            }
            this.L = n;
        } else {
            this.L = this.Q(this.E, 0.0);
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = DataCompressionNegotiator.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataCompressionNegotiator.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void i() {
        Object[] objectArray = ob;
        ob[0] = "\rNL";
        objectArray[1] = Integer.TYPE;
        DataCompressionNegotiator.pb[1] = "java/lang/Integer";
        objectArray[2] = "$:\n7HF/5\u001bx5^<2\u00121";
        objectArray[3] = "n<`>8ge3qqYin8u+";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ",Z`\u0016_22Yo.^'J\u0005)\u0017_16\u0005j\\\n\\sP`\u0014Eg7Fb@5";
    }

    public double K() {
        return this.v;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataCompressionNegotiator.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void C(double d2) {
        this.v = d2;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fa' || c == 'u' || c == 'B' || c == '\u00c2') {
                field = DataCompressionNegotiator.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fa' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataCompressionNegotiator.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'P' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public DataCompressionNegotiator(String string, double d2, Color color) {
        super(string, d2);
        this.B(color);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataCompressionNegotiator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DataCompressionNegotiator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

