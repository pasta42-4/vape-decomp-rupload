/*
 * Decompiled with CFR 0.152.
 */
package com.security.config;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
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

public final class CryptoConfigurationEnum
extends Enum<CryptoConfigurationEnum> {
    private static final Object[] e;
    public static final /* enum */ CryptoConfigurationEnum WARNING;
    public static final /* enum */ CryptoConfigurationEnum FRIENDINVITESENT;
    Color E;
    private static final Map d;
    public static final /* enum */ CryptoConfigurationEnum SUCCESS;
    private static final String[] f;
    String T;
    private static final /* synthetic */ CryptoConfigurationEnum[] k;
    Color U;
    int Z;
    public static final /* enum */ CryptoConfigurationEnum ERROR;
    private static final long[] b;
    private static boolean N;
    private static final Integer[] c;
    private static final long a;

    public Color e() {
        return this.U;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public String V() {
        return this.T;
    }

    private CryptoConfigurationEnum(String string2, Color color, Color color2, int n2) {
        this.T = string2;
        this.E = color;
        this.U = color2;
        this.Z = n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoConfigurationEnum.a = MultiContainerRegistry.a(3720577039292960751L, -2657551642891955745L, MethodHandles.lookup().lookupClass()).a(146349074302331L);
                var11 = CryptoConfigurationEnum.a ^ 12166663056330L;
                CryptoConfigurationEnum.e = new Object[5];
                CryptoConfigurationEnum.f = new String[5];
                CryptoConfigurationEnum.a();
                CryptoConfigurationEnum.d = new HashMap<K, V>(13);
                CryptoConfigurationEnum.K(false);
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
                var6_3 = new long[10];
                var3_4 = 0;
                var4_5 = "\u00ff\u0017\u0088\u009c\u00c0\u00c9\u0088D\u00a8\u00e2u\u001c%,\u0018;\u00b6\u00d6DH\u00e7PG1\u00b0F\u00d8\u00998 !_v\u0007\u00c429d\u008a\u00dd\u00a9^\u008a\u0083\u00a7\u00a8\u00e0\u00b9f4#\u00ed3$:\u000f!\u0089\u00cd\u00efO&\u0015D";
                var5_6 = "\u00ff\u0017\u0088\u009c\u00c0\u00c9\u0088D\u00a8\u00e2u\u001c%,\u0018;\u00b6\u00d6DH\u00e7PG1\u00b0F\u00d8\u00998 !_v\u0007\u00c429d\u008a\u00dd\u00a9^\u008a\u0083\u00a7\u00a8\u00e0\u00b9f4#\u00ed3$:\u000f!\u0089\u00cd\u00efO&\u0015D".length();
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
                    var4_5 = "$\u00fe\u00a17\u00be\u00c6Z\u0092r$1\u00cc\u00d2\u00f4\u00b8\u0011";
                    var5_6 = "$\u00fe\u00a17\u00be\u00c6Z\u0092r$1\u00cc\u00d2\u00f4\u00b8\u0011".length();
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
        CryptoConfigurationEnum.b = var6_3;
        CryptoConfigurationEnum.c = new Integer[10];
        CryptoConfigurationEnum.FRIENDINVITESENT = new CryptoConfigurationEnum((String)CryptoConfigurationEnum.b("C", (int)CryptoConfigurationEnum.a("d", (int)4941, (long)(3243463978099790428L ^ var11)), (long)2997730716026158693L, (long)var11), new Color(6, 161, 126), new Color(4, 106, 83));
        CryptoConfigurationEnum.SUCCESS = new CryptoConfigurationEnum((String)CryptoConfigurationEnum.b("C", (int)CryptoConfigurationEnum.a("d", (int)23408, (long)(5295877461183076965L ^ var11)), (long)2997730716026158693L, (long)var11), new Color(6, 161, 126), new Color(4, 106, 83));
        CryptoConfigurationEnum.WARNING = new CryptoConfigurationEnum((String)CryptoConfigurationEnum.b("C", (int)CryptoConfigurationEnum.a("d", (int)13295, (long)(267252332687749884L ^ var11)), (long)2997730716026158693L, (long)var11), new Color(236, 129, 44), new Color(156, 85, 29));
        CryptoConfigurationEnum.ERROR = new CryptoConfigurationEnum((String)CryptoConfigurationEnum.b("C", (int)CryptoConfigurationEnum.a("d", (int)25635, (long)(2224384559065900348L ^ var11)), (long)2997730716026158693L, (long)var11), new Color(240, 100, 100), new Color(165, 33, 37));
        CryptoConfigurationEnum.k = new CryptoConfigurationEnum[]{CryptoConfigurationEnum.FRIENDINVITESENT, CryptoConfigurationEnum.SUCCESS, CryptoConfigurationEnum.WARNING, CryptoConfigurationEnum.ERROR};
    }

    public void v(Color color) {
        this.E = color;
    }

    private CryptoConfigurationEnum(Color color, Color color2, int n2) {
        this.T = "";
        this.E = color;
        this.U = color2;
        this.Z = n2;
    }

    public static CryptoConfigurationEnum[] values() {
        return (CryptoConfigurationEnum[])k.clone();
    }

    public void Y(String string) {
        this.T = string;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoConfigurationEnum.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static CryptoConfigurationEnum valueOf(String string) {
        return Enum.valueOf(CryptoConfigurationEnum.class, string);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00b5' || c == 'T' || c == 'k' || c == '\u00dc') {
                field = CryptoConfigurationEnum.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00b5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoConfigurationEnum.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'C' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void D(int n) {
        this.Z = n;
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

    private CryptoConfigurationEnum(Color color, Color color2) {
        long l = a ^ 0x33503122F19CL;
        this.T = "";
        this.E = color;
        this.U = color2;
        this.Z = (int)CryptoConfigurationEnum.a("d", (int)6591, (long)(0xE47A8751C6902FBL ^ l));
    }

    private CryptoConfigurationEnum(String string2, Color color, Color color2) {
        long l = a ^ 0x7D42C86A29BCL;
        this.T = string2;
        this.E = color;
        this.U = color2;
        this.Z = (int)CryptoConfigurationEnum.a("d", (int)6591, (long)(0xE47E667E521DADBL ^ l));
    }

    public int A() {
        return this.Z;
    }

    public static void K(boolean bl) {
        N = bl;
    }

    public Color v() {
        return this.E;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoConfigurationEnum.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoConfigurationEnum.b(classArray2[i], string, clazz2, n, classArray);
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
            throw new RuntimeException("a/vi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void p(Color color) {
        this.U = color;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u001e0`";
        objectArray[1] = Integer.TYPE;
        CryptoConfigurationEnum.f[1] = "java/lang/Integer";
        objectArray[2] = "_\u0018\u000bi\b<T\u0017\u001a&u$G\u0010\u0013o";
        objectArray[3] = "y\u0018H4]gr\u0017Y{<iy\u001c]!";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "_m\u0014'F\u0014\u000fv\u0000X@\u0001o\u007f\u0012'\u0012\u0019\u0011c\t)+C\u0014e\b7\u0015\u000b\u0002j\u000bX";
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x688C;
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
                throw new RuntimeException("a/vi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoConfigurationEnum.c[n2] = n3;
        }
        return c[n2];
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
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 28;
                break;
            }
            case 2: {
                n3 = 6;
                break;
            }
            case 3: {
                n3 = 50;
                break;
            }
            case 4: {
                n3 = 54;
                break;
            }
            case 5: {
                n3 = 46;
                break;
            }
            case 6: {
                n3 = 44;
                break;
            }
            case 7: {
                n3 = 30;
                break;
            }
            case 8: {
                n3 = 49;
                break;
            }
            case 9: {
                n3 = 10;
                break;
            }
            case 10: {
                n3 = 24;
                break;
            }
            case 11: {
                n3 = 41;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 7;
                break;
            }
            case 14: {
                n3 = 27;
                break;
            }
            case 15: {
                n3 = 37;
                break;
            }
            case 16: {
                n3 = 58;
                break;
            }
            case 17: {
                n3 = 14;
                break;
            }
            case 18: {
                n3 = 34;
                break;
            }
            case 19: {
                n3 = 35;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 15;
                break;
            }
            case 22: {
                n3 = 60;
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
                n3 = 29;
                break;
            }
            case 26: {
                n3 = 33;
                break;
            }
            case 27: {
                n3 = 17;
                break;
            }
            case 28: {
                n3 = 13;
                break;
            }
            case 29: {
                n3 = 38;
                break;
            }
            case 30: {
                n3 = 32;
                break;
            }
            case 31: {
                n3 = 53;
                break;
            }
            case 32: {
                n3 = 59;
                break;
            }
            case 33: {
                n3 = 48;
                break;
            }
            case 34: {
                n3 = 26;
                break;
            }
            case 35: {
                n3 = 45;
                break;
            }
            case 36: {
                n3 = 47;
                break;
            }
            case 37: {
                n3 = 1;
                break;
            }
            case 38: {
                n3 = 39;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 21;
                break;
            }
            case 41: {
                n3 = 0;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 31;
                break;
            }
            case 44: {
                n3 = 8;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 63;
                break;
            }
            case 47: {
                n3 = 23;
                break;
            }
            case 48: {
                n3 = 11;
                break;
            }
            case 49: {
                n3 = 56;
                break;
            }
            case 50: {
                n3 = 9;
                break;
            }
            case 51: {
                n3 = 25;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 55;
                break;
            }
            case 54: {
                n3 = 57;
                break;
            }
            case 55: {
                n3 = 62;
                break;
            }
            case 56: {
                n3 = 5;
                break;
            }
            case 57: {
                n3 = 22;
                break;
            }
            case 58: {
                n3 = 3;
                break;
            }
            case 59: {
                n3 = 42;
                break;
            }
            case 60: {
                n3 = 18;
                break;
            }
            case 61: {
                n3 = 36;
                break;
            }
            case 62: {
                n3 = 52;
                break;
            }
            default: {
                n3 = 4;
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
        CryptoConfigurationEnum.f[n4] = new String(cArray);
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = CryptoConfigurationEnum.a(l, l2);
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
                clazz3 = CryptoConfigurationEnum.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoConfigurationEnum.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoConfigurationEnum.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoConfigurationEnum.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoConfigurationEnum.b(218094660441539L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoConfigurationEnum.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoConfigurationEnum.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoConfigurationEnum.b(218094660441539L, 0L);
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

    public static boolean E() {
        boolean bl = CryptoConfigurationEnum.N();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoConfigurationEnum.a(customSystemException);
        }
        return false;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoConfigurationEnum.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoConfigurationEnum.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static boolean N() {
        return N;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CryptoConfigurationEnum.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoConfigurationEnum.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = CryptoConfigurationEnum.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoConfigurationEnum.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoConfigurationEnum.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoConfigurationEnum.a(clazz3, string2, clazz2)) != null) {
                    CryptoConfigurationEnum.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoConfigurationEnum.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoConfigurationEnum.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoConfigurationEnum.b(218094660441539L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private CryptoConfigurationEnum(String string2, Color color) {
        long l = a ^ 0x6157E9CB97A4L;
        this.T = string2;
        this.E = color;
        this.U = color.darker();
        this.Z = (int)CryptoConfigurationEnum.a("d", (int)29747, (long)(0x631D09A6E43E0943L ^ l));
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoConfigurationEnum.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoConfigurationEnum.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoConfigurationEnum.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

