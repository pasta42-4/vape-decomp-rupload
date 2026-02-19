/*
 * Decompiled with CFR 0.152.
 */
package com.security.obfuscation;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
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

public abstract class DataObfuscator {
    private static final Map g;
    private String e;
    public static final int O;
    private String I;
    public static final int J;
    public static final int y;
    public static final int G;
    private static final Integer[] d;
    private static final String[] j;
    private int Z;
    public static final int i;
    public static final int f;
    private static final Object[] h;
    private static final long[] c;
    private static String[] u;
    public static final int w;
    private static final long a;
    private String b;
    public static final int s;

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataObfuscator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataObfuscator.a = MultiContainerRegistry.a(-8163597546306954961L, 6037267191885436349L, MethodHandles.lookup().lookupClass()).a(43597980405437L);
                DataObfuscator.h = new Object[5];
                DataObfuscator.j = new String[5];
                DataObfuscator.a();
                DataObfuscator.g = new HashMap<K, V>(13);
                var0 = DataObfuscator.a ^ 16008083883705L;
                DataObfuscator.Z(new String[3]);
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
                var8_3 = new long[15];
                var5_4 = 0;
                var6_5 = "\u00b8vw\u00b1s\u00d9\u0092\u00b0\u008e\u00bd\u00b6\u00a2X\u0086\u00ff`<\u00ad\u008c\u00e4\u0083\u00fcK>\u00ff\u009c\u00da\u0093?\u00a2\u0094]\u008b\u00d7\u001f\u00b8,4\u00a1 \u001dG\u00fcp\u00a9\u00d7\u00bf$\u00dbA\u0014\u0006\u0011\u00b59]\u00db\u00c3\u0089\u0004 \u00d1\u00f9t\u00b7\u0094GJ\u00ac|\u0012AV\u00d4}\u0097\u008a\u00dc\u00c2wI\u00c8\u00a2v\u00a4\u00bbw\u0004\u00beF\u008d\u00e4\u00d8\u001c\u00e5\u001e\u0004\u0018\u001c\u00a3\u009e\u008eHO";
                var7_6 = "\u00b8vw\u00b1s\u00d9\u0092\u00b0\u008e\u00bd\u00b6\u00a2X\u0086\u00ff`<\u00ad\u008c\u00e4\u0083\u00fcK>\u00ff\u009c\u00da\u0093?\u00a2\u0094]\u008b\u00d7\u001f\u00b8,4\u00a1 \u001dG\u00fcp\u00a9\u00d7\u00bf$\u00dbA\u0014\u0006\u0011\u00b59]\u00db\u00c3\u0089\u0004 \u00d1\u00f9t\u00b7\u0094GJ\u00ac|\u0012AV\u00d4}\u0097\u008a\u00dc\u00c2wI\u00c8\u00a2v\u00a4\u00bbw\u0004\u00beF\u008d\u00e4\u00d8\u001c\u00e5\u001e\u0004\u0018\u001c\u00a3\u009e\u008eHO".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00c7\u00b4\u00de:\u00de\u009f\u00f4\u00cf\u00a1\u00c6\u00be\u0018\u00f1\u00e9\u00df^";
                    var7_6 = "\u00c7\u00b4\u00de:\u00de\u009f\u00f4\u00cf\u00a1\u00c6\u00be\u0018\u00f1\u00e9\u00df^".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        DataObfuscator.c = var8_3;
        DataObfuscator.d = new Integer[15];
        DataObfuscator.w = (int)DataObfuscator.a("x", (int)4411, (long)(var0 ^ 4645248629535740803L));
        DataObfuscator.G = (int)DataObfuscator.a("x", (int)22738, (long)(var0 ^ 1702345247309814376L));
        DataObfuscator.O = (int)DataObfuscator.a("x", (int)7961, (long)(var0 ^ 273528634549214633L));
        DataObfuscator.J = (int)DataObfuscator.a("x", (int)23338, (long)(var0 ^ 3813568382203582875L));
        DataObfuscator.y = (int)DataObfuscator.a("x", (int)20332, (long)(var0 ^ 6616362303974231519L));
        DataObfuscator.s = (int)DataObfuscator.a("x", (int)297, (long)(var0 ^ 7139528251802321812L));
        DataObfuscator.i = (int)DataObfuscator.a("x", (int)27438, (long)(var0 ^ 8521883112985618840L));
        DataObfuscator.f = (int)DataObfuscator.a("x", (int)5590, (long)(var0 ^ 1241880763152537449L));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/W3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataObfuscator.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                DataObfuscator.h[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4AF1;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/W3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataObfuscator.d[n2] = n3;
        }
        return d[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/W3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "v\nw";
        objectArray[1] = Integer.TYPE;
        DataObfuscator.j[1] = "java/lang/Integer";
        objectArray[2] = "\u0010M{>u&\u001bBjq\b>\bEc8";
        objectArray[3] = "\u0000Nc\f\u0014k\u000bArCue\u0000Jv\u0019";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0005\u0015EmG=\u0017\u0010TQG,j\u0007C?\u00114\u0001GEm,n\u0005\bB;P>\u0003\t\u0016Q";
    }

    public String e() {
        return this.b;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 32;
                break;
            }
            case 1: {
                n3 = 5;
                break;
            }
            case 2: {
                n3 = 57;
                break;
            }
            case 3: {
                n3 = 35;
                break;
            }
            case 4: {
                n3 = 53;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 23;
                break;
            }
            case 7: {
                n3 = 48;
                break;
            }
            case 8: {
                n3 = 45;
                break;
            }
            case 9: {
                n3 = 61;
                break;
            }
            case 10: {
                n3 = 41;
                break;
            }
            case 11: {
                n3 = 43;
                break;
            }
            case 12: {
                n3 = 3;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 44;
                break;
            }
            case 15: {
                n3 = 6;
                break;
            }
            case 16: {
                n3 = 50;
                break;
            }
            case 17: {
                n3 = 59;
                break;
            }
            case 18: {
                n3 = 21;
                break;
            }
            case 19: {
                n3 = 34;
                break;
            }
            case 20: {
                n3 = 10;
                break;
            }
            case 21: {
                n3 = 26;
                break;
            }
            case 22: {
                n3 = 29;
                break;
            }
            case 23: {
                n3 = 1;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 47;
                break;
            }
            case 26: {
                n3 = 27;
                break;
            }
            case 27: {
                n3 = 42;
                break;
            }
            case 28: {
                n3 = 8;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 39;
                break;
            }
            case 31: {
                n3 = 7;
                break;
            }
            case 32: {
                n3 = 37;
                break;
            }
            case 33: {
                n3 = 2;
                break;
            }
            case 34: {
                n3 = 56;
                break;
            }
            case 35: {
                n3 = 31;
                break;
            }
            case 36: {
                n3 = 9;
                break;
            }
            case 37: {
                n3 = 13;
                break;
            }
            case 38: {
                n3 = 58;
                break;
            }
            case 39: {
                n3 = 63;
                break;
            }
            case 40: {
                n3 = 25;
                break;
            }
            case 41: {
                n3 = 0;
                break;
            }
            case 42: {
                n3 = 30;
                break;
            }
            case 43: {
                n3 = 28;
                break;
            }
            case 44: {
                n3 = 14;
                break;
            }
            case 45: {
                n3 = 51;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 54;
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
                n3 = 62;
                break;
            }
            case 51: {
                n3 = 12;
                break;
            }
            case 52: {
                n3 = 46;
                break;
            }
            case 53: {
                n3 = 19;
                break;
            }
            case 54: {
                n3 = 24;
                break;
            }
            case 55: {
                n3 = 60;
                break;
            }
            case 56: {
                n3 = 17;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 16;
                break;
            }
            case 59: {
                n3 = 11;
                break;
            }
            case 60: {
                n3 = 33;
                break;
            }
            case 61: {
                n3 = 49;
                break;
            }
            case 62: {
                n3 = 4;
                break;
            }
            default: {
                n3 = 38;
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
        DataObfuscator.j[n4] = new String(cArray);
        return n4;
    }

    public static String[] H() {
        return u;
    }

    public String g() {
        return this.e;
    }

    public static void Z(String[] stringArray) {
        u = stringArray;
    }

    public boolean P(DataObfuscator dataObfuscator) {
        boolean bl;
        block18: {
            block14: {
                long l = a ^ 0x5FCC1E13EBC8L;
                try {
                    block17: {
                        try {
                            try {
                                block16: {
                                    try {
                                        try {
                                            block15: {
                                                try {
                                                    try {
                                                        if (this.Z != dataObfuscator.Z) break block14;
                                                        if (this.b.equals(dataObfuscator.b)) break block15;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DataObfuscator.a(customSystemException);
                                                    }
                                                    if (!this.b.equals(DataObfuscator.b("\u00f5", (int)DataObfuscator.a("x", (int)10933, (long)(0x439D010773A857DL ^ l)), (long)-1930512886164490538L, (long)l))) break block14;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DataObfuscator.a(customSystemException);
                                                }
                                            }
                                            if (this.I.equals(dataObfuscator.I)) break block16;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DataObfuscator.a(customSystemException);
                                        }
                                        if (!this.I.equals(DataObfuscator.b("\u00f5", (int)DataObfuscator.a("x", (int)27214, (long)(0x28E64CF6C6EC4583L ^ l)), (long)-1930512886164490538L, (long)l))) break block14;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataObfuscator.a(customSystemException);
                                    }
                                }
                                if (this.e.equals(dataObfuscator.e)) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataObfuscator.a(customSystemException);
                            }
                            if (!this.e.equals(DataObfuscator.b("\u00f5", (int)DataObfuscator.a("x", (int)29719, (long)(0x65AF15D705CF5BD8L ^ l)), (long)-1930512886164490538L, (long)l))) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataObfuscator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataObfuscator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public String s() {
        return this.I;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DataObfuscator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataObfuscator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
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

    public int Y() {
        return this.Z;
    }

    private static Field c(long l, long l2) {
        int n = DataObfuscator.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = DataObfuscator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataObfuscator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataObfuscator.a(clazz3, string2, clazz2)) != null) {
                    DataObfuscator.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataObfuscator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataObfuscator.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataObfuscator.b(269234467222968L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = DataObfuscator.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataObfuscator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataObfuscator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataObfuscator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataObfuscator.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataObfuscator.b(269234467222968L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataObfuscator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataObfuscator.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataObfuscator.b(269234467222968L, 0L);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataObfuscator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public DataObfuscator(int n, String string, String string2, String string3) {
        long l = a ^ 0x5CCF6B399795L;
        string = string.replace((CharSequence)((Object)DataObfuscator.b("\u00f5", (int)DataObfuscator.a("x", (int)26837, (long)(0x5AABD227E992BB4EL ^ l)), (long)-7392531514137539957L, (long)l)), (CharSequence)((Object)DataObfuscator.b("\u00f5", (int)DataObfuscator.a("x", (int)12273, (long)(0x489F8FA31CEA7C6FL ^ l)), (long)-7392531514137539957L, (long)l)));
        string3 = string3.replace((CharSequence)((Object)DataObfuscator.b("\u00f5", (int)DataObfuscator.a("x", (int)19400, (long)(0x6C49CA39468E1850L ^ l)), (long)-7392531514137539957L, (long)l)), (CharSequence)((Object)DataObfuscator.b("\u00f5", (int)DataObfuscator.a("x", (int)31182, (long)(0x42C3D85B8150AA57L ^ l)), (long)-7392531514137539957L, (long)l)));
        this.Z = n;
        this.b = string;
        this.I = string2;
        this.e = string3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataObfuscator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataObfuscator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            if (c == 'p' || c == '\u00e4' || c == 'm' || c == '\u00cf') {
                field = DataObfuscator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'p' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataObfuscator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            return MethodHandles.lookup().findStatic(DataObfuscator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DataObfuscator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

