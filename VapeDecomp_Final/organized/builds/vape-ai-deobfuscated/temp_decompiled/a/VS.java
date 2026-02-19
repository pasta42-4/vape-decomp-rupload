/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GS;
import a.HK;
import a.Hc;
import a.Ib;
import a.Na;
import a.O_;
import a.SE;
import a.d8;
import a.eM;
import a.ht;
import a.kX;
import a.v2;
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

public class vs
extends v2 {
    public HK G;
    public HK d;
    private static final String[] g;
    private static final Map e;
    private static final Object[] f;
    public Ib J;
    private static final long a;
    private static final Integer[] c;
    private static final long[] b;

    private static void a() {
        Object[] objectArray = f;
        f[0] = ".Qf\u000b";
        objectArray[1] = "mYH\u0006sOfVYI\u000eWuQP\u0000";
        objectArray[2] = Boolean.TYPE;
        vs.g[2] = "java/lang/Boolean";
        objectArray[3] = "CV\npN HY\u001b?# HD\u000f";
        objectArray[4] = "\b`\t\u000by\u0014}@\u0002\u0004h[\u0010@\u0002\u0019|N";
        objectArray[5] = "\u0001m8\u000e";
        objectArray[6] = "6^T|<fC~_s-).~_n9<";
        objectArray[7] = "f>:";
        objectArray[8] = Integer.TYPE;
        vs.g[8] = "java/lang/Integer";
        objectArray[9] = ".ryx";
        objectArray[10] = "\u0018\u0017_ciE\u0013\u0018N,\bK\u0018\u0013Jv";
        objectArray[11] = "\u007fF &0\u0012#\u000e7B\u0018#v\u000e8=o\\)U)(_\u001a=N1\"1Q6\r:BeI\"Z8/8N0\rJ~#\u001f0\u0006q.fR~7v~5A>G5/4GO";
        objectArray[12] = "N!4m%^\u0012i#\t\u0007oD:3d8\u0002\u0019=!3JVG\"!95\t\u001c34\ts\u001d\u0007+>g8\u0016D ^3 \u0002\u0013\"3n'\u0010DPbuv\u0010Ok20;^~lbc(\u001e\u000e/3b.o";
        objectArray[13] = "/|%v;es42\u0012\u000fT&4=md+yo,xTmmt4r:&f7?\u0012n>r`=\u007f39`7O,,3'rwb14\u007f\r";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "+\u0000)(B\u000egRol2\tmjjo\\\u0004+Sla^\u0006\u0016Sm\"MRi\f63Xb";
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = vs.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = vs.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = vs.e(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                vs.f[n2] = clazz = Class.forName(g[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = vs.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                vs.a = d8.a(4149836984585040629L, -6434316768130640881L, MethodHandles.lookup().lookupClass()).a(134609433941654L);
                vs.f = new Object[15];
                vs.g = new String[15];
                vs.a();
                vs.e = new HashMap<K, V>(13);
                var0 = vs.a ^ 102135712383741L;
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
                var6_5 = "\u00b7HV\u0097\u00a5-\u00eeu\u0096\"\u00b8q\u001a\u00cc\u009dg\u0082\u009c.\u00da\u0081L\u0006\u00ac\u00a99\u009b.\u00c5\u00a3\u00ff:\u0010\u0017\u00cfwB\u000f|8\u00ff\u00bdt\u008a(\u00ff\u008e\u00e1\u0013\u00f4o50p\u00d4\u00b5\u00b6S6\u0093\u0016r\u00e4:\u00a8\u00d4-&P\u00a9('\n\u0090\u00b5\u0010\u00da\u00e1W\u008c";
                var7_6 = "\u00b7HV\u0097\u00a5-\u00eeu\u0096\"\u00b8q\u001a\u00cc\u009dg\u0082\u009c.\u00da\u0081L\u0006\u00ac\u00a99\u009b.\u00c5\u00a3\u00ff:\u0010\u0017\u00cfwB\u000f|8\u00ff\u00bdt\u008a(\u00ff\u008e\u00e1\u0013\u00f4o50p\u00d4\u00b5\u00b6S6\u0093\u0016r\u00e4:\u00a8\u00d4-&P\u00a9('\n\u0090\u00b5\u0010\u00da\u00e1W\u008c".length();
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
                    var6_5 = "\u00db?.D-\u009d\u0095J\u00b9\u00e4\u00804[l\u00d1\u0093";
                    var7_6 = "\u00db?.D-\u009d\u0095J\u00b9\u00e4\u00804[l\u00d1\u0093".length();
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
        vs.b = var8_3;
        vs.c = new Integer[12];
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (g[n5] != null) {
            return n5;
        }
        Object object = f[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 38;
                break;
            }
            case 1: {
                n4 = 3;
                break;
            }
            case 2: {
                n4 = 32;
                break;
            }
            case 3: {
                n4 = 13;
                break;
            }
            case 4: {
                n4 = 37;
                break;
            }
            case 5: {
                n4 = 16;
                break;
            }
            case 6: {
                n4 = 50;
                break;
            }
            case 7: {
                n4 = 18;
                break;
            }
            case 8: {
                n4 = 5;
                break;
            }
            case 9: {
                n4 = 34;
                break;
            }
            case 10: {
                n4 = 9;
                break;
            }
            case 11: {
                n4 = 29;
                break;
            }
            case 12: {
                n4 = 30;
                break;
            }
            case 13: {
                n4 = 20;
                break;
            }
            case 14: {
                n4 = 54;
                break;
            }
            case 15: {
                n4 = 11;
                break;
            }
            case 16: {
                n4 = 57;
                break;
            }
            case 17: {
                n4 = 45;
                break;
            }
            case 18: {
                n4 = 46;
                break;
            }
            case 19: {
                n4 = 6;
                break;
            }
            case 20: {
                n4 = 0;
                break;
            }
            case 21: {
                n4 = 41;
                break;
            }
            case 22: {
                n4 = 59;
                break;
            }
            case 23: {
                n4 = 31;
                break;
            }
            case 24: {
                n4 = 40;
                break;
            }
            case 25: {
                n4 = 47;
                break;
            }
            case 26: {
                n4 = 10;
                break;
            }
            case 27: {
                n4 = 51;
                break;
            }
            case 28: {
                n4 = 60;
                break;
            }
            case 29: {
                n4 = 17;
                break;
            }
            case 30: {
                n4 = 39;
                break;
            }
            case 31: {
                n4 = 49;
                break;
            }
            case 32: {
                n4 = 62;
                break;
            }
            case 33: {
                n4 = 28;
                break;
            }
            case 34: {
                n4 = 2;
                break;
            }
            case 35: {
                n4 = 43;
                break;
            }
            case 36: {
                n4 = 24;
                break;
            }
            case 37: {
                n4 = 15;
                break;
            }
            case 38: {
                n4 = 44;
                break;
            }
            case 39: {
                n4 = 33;
                break;
            }
            case 40: {
                n4 = 42;
                break;
            }
            case 41: {
                n4 = 48;
                break;
            }
            case 42: {
                n4 = 14;
                break;
            }
            case 43: {
                n4 = 55;
                break;
            }
            case 44: {
                n4 = 36;
                break;
            }
            case 45: {
                n4 = 35;
                break;
            }
            case 46: {
                n4 = 63;
                break;
            }
            case 47: {
                n4 = 26;
                break;
            }
            case 48: {
                n4 = 12;
                break;
            }
            case 49: {
                n4 = 8;
                break;
            }
            case 50: {
                n4 = 7;
                break;
            }
            case 51: {
                n4 = 61;
                break;
            }
            case 52: {
                n4 = 53;
                break;
            }
            case 53: {
                n4 = 22;
                break;
            }
            case 54: {
                n4 = 25;
                break;
            }
            case 55: {
                n4 = 58;
                break;
            }
            case 56: {
                n4 = 21;
                break;
            }
            case 57: {
                n4 = 52;
                break;
            }
            case 58: {
                n4 = 23;
                break;
            }
            case 59: {
                n4 = 1;
                break;
            }
            case 60: {
                n4 = 56;
                break;
            }
            case 61: {
                n4 = 27;
                break;
            }
            case 62: {
                n4 = 4;
                break;
            }
            default: {
                n4 = 19;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        vs.g[n5] = new String(cArray);
        return n5;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Field g(long l10, long l11) {
        int n2 = vs.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = vs.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = vs.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = vs.c(clazz3, string2, clazz2)) != null) {
                    vs.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = vs.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        vs.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = vs.f(766958166360936L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x79A5;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/vs", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            vs.c[n3] = n4;
        }
        return c[n3];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object k(Object object) {
        return this.J.Z(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = vs.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = vs.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = vs.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(long l10, long l11) {
        int n2 = vs.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n2];
                int n4 = string2.indexOf(8);
                clazz3 = vs.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = vs.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = vs.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        vs.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = vs.f(766958166360936L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = vs.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        vs.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = vs.f(766958166360936L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'X' || c10 == 'y' || c10 == 'I' || c10 == '\u00f1') {
                field = vs.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'X' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = vs.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Unable to fully structure code
     */
    public vs() {
        block91: {
            block92: {
                block88: {
                    block90: {
                        block85: {
                            block86: {
                                block80: {
                                    block84: {
                                        block82: {
                                            block81: {
                                                var1_1 = vs.a ^ 121093289193216L;
                                                v0 = GS.o();
                                                super(eM.VD);
                                                var3_2 = v0;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v1 = kX.C();
                                                                    if (var3_2 == null) break block80;
                                                                    if (v1 >= 15) {
                                                                    }
                                                                    ** GOTO lbl125
                                                                }
                                                                catch (O_ v2) {
                                                                    throw vs.a(v2);
                                                                }
                                                                v3 = kX.C();
                                                                v4 = 35;
                                                                if (var3_2 == null) break block81;
                                                            }
                                                            catch (O_ v5) {
                                                                throw vs.a(v5);
                                                            }
                                                            if (v3 >= v4) {
                                                            }
                                                            ** GOTO lbl67
                                                        }
                                                        catch (O_ v6) {
                                                            throw vs.a(v6);
                                                        }
                                                        v3 = kX.C();
                                                        if (var3_2 == null) break block82;
                                                    }
                                                    catch (O_ v7) {
                                                        throw vs.a(v7);
                                                    }
                                                    v4 = 50;
                                                }
                                                catch (O_ v8) {
                                                    throw vs.a(v8);
                                                }
                                            }
                                            try {
                                                if (v3 >= v4) {
                                                    v3 = (int)Na.MC_1_21_0.H();
                                                }
                                                ** GOTO lbl62
                                            }
                                            catch (O_ v9) {
                                                throw vs.a(v9);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    block83: {
                                                        try {
                                                            if (v3 == 0) break block83;
                                                            this.d = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)14495, (long)(2362104751654414605L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.F0, eM.YU}, (long)7508785539745307009L, (long)var1_1);
                                                            if (var3_2 != null) break block84;
                                                        }
                                                        catch (O_ v10) {
                                                            throw vs.a(v10);
                                                        }
                                                    }
                                                    this.d = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)11755, (long)(863005869715799152L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.F0, Float.TYPE}, (long)7508785539745307009L, (long)var1_1);
                                                    if (var3_2 != null) break block84;
                                                }
                                                catch (O_ v11) {
                                                    throw vs.a(v11);
                                                }
lbl62:
                                                // 2 sources

                                                this.d = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)25071, (long)(796362682987573365L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.YH, Float.TYPE}, (long)7508785539745307009L, (long)var1_1);
                                                if (var3_2 != null) break block84;
                                            }
                                            catch (O_ v12) {
                                                throw vs.a(v12);
                                            }
lbl67:
                                            // 2 sources

                                            this.d = vs.c("\u00c8", (Object)this, (Object)eM.VD, (Object)vs.c("\u00c0", (int)vs.b("n", (int)12121, (long)(1145964086202023630L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                        }
                                        catch (O_ v13) {
                                            throw vs.a(v13);
                                        }
                                    }
                                    try {
                                        try {
                                            block87: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v1 = (int)Hc.z;
                                                                                if (var3_2 == null) break block85;
                                                                                if (v1 != 0) break block86;
                                                                            }
                                                                            catch (O_ v14) {
                                                                                throw vs.a(v14);
                                                                            }
                                                                            v1 = (int)this.d.v();
                                                                            if (var3_2 == null) break block85;
                                                                        }
                                                                        catch (O_ v15) {
                                                                            throw vs.a(v15);
                                                                        }
                                                                        if (v1 != 0) break block86;
                                                                    }
                                                                    catch (O_ v16) {
                                                                        throw vs.a(v16);
                                                                    }
                                                                    v1 = (int)SE.h.J();
                                                                    if (var3_2 == null) break block85;
                                                                }
                                                                catch (O_ v17) {
                                                                    throw vs.a(v17);
                                                                }
                                                                if (v1 == 0) break block86;
                                                            }
                                                            catch (O_ v18) {
                                                                throw vs.a(v18);
                                                            }
                                                            if (kX.C() < 35) break block87;
                                                        }
                                                        catch (O_ v19) {
                                                            throw vs.a(v19);
                                                        }
                                                        if (eM.EW == null) break block86;
                                                    }
                                                    catch (O_ v20) {
                                                        throw vs.a(v20);
                                                    }
                                                    this.d = vs.c("\u00c8", (Object)this, (Object)eM.EW, (Object)this.d.B(), (boolean)false, Void.TYPE, (Object)new Class[]{eM.YH, Float.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                                    if (var3_2 != null) break block86;
                                                }
                                                catch (O_ v21) {
                                                    throw vs.a(v21);
                                                }
                                            }
                                            this.d = vs.c("\u00c8", (Object)this, (Object)eM.EW, (Object)this.d.B(), (boolean)false, Void.TYPE, (Object)new Class[]{Float.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                            if (var3_2 != null) break block86;
                                        }
                                        catch (O_ v22) {
                                            throw vs.a(v22);
                                        }
lbl125:
                                        // 2 sources

                                        this.d = vs.c("\u00c8", (Object)this, (Object)eM.VD, (Object)vs.c("\u00c0", (int)vs.b("n", (int)30208, (long)(9003485105339525017L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                        v1 = (int)Hc.z;
                                    }
                                    catch (O_ v23) {
                                        throw vs.a(v23);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var3_2 == null) break block85;
                                                        if (v1 != 0) break block86;
                                                    }
                                                    catch (O_ v24) {
                                                        throw vs.a(v24);
                                                    }
                                                    v1 = (int)this.d.v();
                                                    if (var3_2 == null) break block85;
                                                }
                                                catch (O_ v25) {
                                                    throw vs.a(v25);
                                                }
                                                if (v1 != 0) break block86;
                                            }
                                            catch (O_ v26) {
                                                throw vs.a(v26);
                                            }
                                            v1 = (int)SE.h.J();
                                            if (var3_2 == null) break block85;
                                        }
                                        catch (O_ v27) {
                                            throw vs.a(v27);
                                        }
                                        if (v1 == 0) break block86;
                                    }
                                    catch (O_ v28) {
                                        throw vs.a(v28);
                                    }
                                    this.d = vs.c("\u00c8", (Object)this, (Object)eM.EW, (Object)this.d.B(), (boolean)false, Void.TYPE, (Object)new Class[]{Float.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE}, (long)7509011482331172802L, (long)var1_1);
                                }
                                catch (O_ v29) {
                                    throw vs.a(v29);
                                }
                            }
                            v1 = kX.C();
                        }
                        try {
                            block89: {
                                try {
                                    try {
                                        try {
                                            v30 = 35;
                                            if (var3_2 == null) break block88;
                                            if (v1 >= v30) {
                                            }
                                            ** GOTO lbl197
                                        }
                                        catch (O_ v31) {
                                            throw vs.a(v31);
                                        }
                                        if (kX.C() < 50) break block89;
                                    }
                                    catch (O_ v32) {
                                        throw vs.a(v32);
                                    }
                                    this.G = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)26813, (long)(5425653873198594345L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.F0, eM.C}, (long)7508785539745307009L, (long)var1_1);
                                    if (var3_2 != null) break block90;
                                }
                                catch (O_ v33) {
                                    throw vs.a(v33);
                                }
                            }
                            this.G = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)15187, (long)(1973698866337163973L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)Hc.z, Void.TYPE, (Object)new Class[]{eM.YH, eM.C}, (long)7508785539745307009L, (long)var1_1);
                        }
                        catch (O_ v34) {
                            throw vs.a(v34);
                        }
                    }
                    try {
                        try {
                            this.J = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)19992, (long)(2324571742116306816L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, (Object)eM.V_, (long)7508934469772668220L, (long)var1_1);
                            if (var3_2 != null) break block91;
lbl197:
                            // 2 sources

                            v1 = kX.C();
                            if (var3_2 == null) break block92;
                        }
                        catch (O_ v35) {
                            throw vs.a(v35);
                        }
                        v30 = 13;
                    }
                    catch (O_ v36) {
                        throw vs.a(v36);
                    }
                }
                try {
                    if (v1 == v30) {
                        v1 = (int)Hc.U.d();
                    }
                    ** GOTO lbl230
                }
                catch (O_ v37) {
                    throw vs.a(v37);
                }
            }
            try {
                try {
                    block93: {
                        try {
                            if (v1 == 0) break block93;
                            this.G = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)6939, (long)(8643122022900042378L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.C, Integer.TYPE, Integer.TYPE, eM.ts}, (long)7508785539745307009L, (long)var1_1);
                            if (var3_2 != null) break block91;
                        }
                        catch (O_ v38) {
                            throw vs.a(v38);
                        }
                    }
                    this.G = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)9350, (long)(9135678326925407507L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)Hc.z, Void.TYPE, (Object)new Class[]{eM.C, Integer.TYPE, Integer.TYPE, eM.ts}, (long)7508785539745307009L, (long)var1_1);
                    if (var3_2 != null) break block91;
                }
                catch (O_ v39) {
                    throw vs.a(v39);
                }
lbl230:
                // 2 sources

                this.G = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)9337, (long)(583605686680335849L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.C, eM.U8}, (long)7508785539745307009L, (long)var1_1);
                this.J = vs.c("\u00c8", (Object)this, (Object)vs.c("\u00c0", (int)vs.b("n", (int)25571, (long)(6897024801735668336L ^ var1_1)), (long)7509136440625726909L, (long)var1_1), (boolean)true, String.class, (long)7508934469772668220L, (long)var1_1);
            }
            catch (O_ v40) {
                throw vs.a(v40);
            }
        }
        try {
            if (ht.J() != null) {
                GS.G(new int[1]);
            }
        }
        catch (O_ v41) {
            throw vs.a(v41);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(vs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(vs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

