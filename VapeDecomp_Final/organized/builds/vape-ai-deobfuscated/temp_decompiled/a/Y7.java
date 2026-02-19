/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.CV;
import a.CX;
import a.HQ;
import a.O_;
import a.SE;
import a.YK;
import a._b;
import a.bE;
import a.bQ;
import a.d8;
import a.wr;
import a.yg;
import a.zy;
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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class y7
extends yg {
    private static final Map mb;
    private boolean pm;
    private static final long bb;
    private static final long[] eb;
    private static final Integer[] lb;
    private final CV pM;
    private final bQ p9;
    private static final Object[] ob;
    private static final String[] pb;

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (pb[n5] != null) {
            return n5;
        }
        Object object = ob[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 62;
                break;
            }
            case 1: {
                n4 = 27;
                break;
            }
            case 2: {
                n4 = 51;
                break;
            }
            case 3: {
                n4 = 9;
                break;
            }
            case 4: {
                n4 = 3;
                break;
            }
            case 5: {
                n4 = 57;
                break;
            }
            case 6: {
                n4 = 53;
                break;
            }
            case 7: {
                n4 = 32;
                break;
            }
            case 8: {
                n4 = 29;
                break;
            }
            case 9: {
                n4 = 1;
                break;
            }
            case 10: {
                n4 = 41;
                break;
            }
            case 11: {
                n4 = 20;
                break;
            }
            case 12: {
                n4 = 46;
                break;
            }
            case 13: {
                n4 = 42;
                break;
            }
            case 14: {
                n4 = 2;
                break;
            }
            case 15: {
                n4 = 13;
                break;
            }
            case 16: {
                n4 = 14;
                break;
            }
            case 17: {
                n4 = 5;
                break;
            }
            case 18: {
                n4 = 19;
                break;
            }
            case 19: {
                n4 = 0;
                break;
            }
            case 20: {
                n4 = 34;
                break;
            }
            case 21: {
                n4 = 47;
                break;
            }
            case 22: {
                n4 = 23;
                break;
            }
            case 23: {
                n4 = 17;
                break;
            }
            case 24: {
                n4 = 12;
                break;
            }
            case 25: {
                n4 = 40;
                break;
            }
            case 26: {
                n4 = 63;
                break;
            }
            case 27: {
                n4 = 31;
                break;
            }
            case 28: {
                n4 = 50;
                break;
            }
            case 29: {
                n4 = 6;
                break;
            }
            case 30: {
                n4 = 21;
                break;
            }
            case 31: {
                n4 = 60;
                break;
            }
            case 32: {
                n4 = 52;
                break;
            }
            case 33: {
                n4 = 61;
                break;
            }
            case 34: {
                n4 = 39;
                break;
            }
            case 35: {
                n4 = 45;
                break;
            }
            case 36: {
                n4 = 58;
                break;
            }
            case 37: {
                n4 = 37;
                break;
            }
            case 38: {
                n4 = 33;
                break;
            }
            case 39: {
                n4 = 15;
                break;
            }
            case 40: {
                n4 = 56;
                break;
            }
            case 41: {
                n4 = 25;
                break;
            }
            case 42: {
                n4 = 11;
                break;
            }
            case 43: {
                n4 = 8;
                break;
            }
            case 44: {
                n4 = 38;
                break;
            }
            case 45: {
                n4 = 48;
                break;
            }
            case 46: {
                n4 = 54;
                break;
            }
            case 47: {
                n4 = 7;
                break;
            }
            case 48: {
                n4 = 26;
                break;
            }
            case 49: {
                n4 = 28;
                break;
            }
            case 50: {
                n4 = 43;
                break;
            }
            case 51: {
                n4 = 59;
                break;
            }
            case 52: {
                n4 = 35;
                break;
            }
            case 53: {
                n4 = 30;
                break;
            }
            case 54: {
                n4 = 49;
                break;
            }
            case 55: {
                n4 = 55;
                break;
            }
            case 56: {
                n4 = 16;
                break;
            }
            case 57: {
                n4 = 22;
                break;
            }
            case 58: {
                n4 = 36;
                break;
            }
            case 59: {
                n4 = 4;
                break;
            }
            case 60: {
                n4 = 44;
                break;
            }
            case 61: {
                n4 = 10;
                break;
            }
            case 62: {
                n4 = 24;
                break;
            }
            default: {
                n4 = 18;
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
        y7.pb[n5] = new String(cArray);
        return n5;
    }

    private static Field o(long l10, long l11) {
        int n2 = y7.m(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            String string = pb[n2];
            int n3 = string.indexOf(8);
            Class clazz = y7.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = y7.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = y7.g(clazz3, string2, clazz2)) != null) {
                    y7.ob[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = y7.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        y7.ob[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = y7.n(231718206125141L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void g(String string) {
        this.p9.H(string);
        this.p9.p(0.7);
        this.p9.q(true);
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = y7.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = y7.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private zy lambda$inputOnEnter$2(Throwable throwable) {
        long l10 = bb ^ 0x36004649CB81L;
        this.g((String)((Object)y7.d("p", (int)y7.c("v", (int)7011, (long)(0xE5E94E8BEE1FF64L ^ l10)), (long)-8295021815537945578L, (long)l10)));
        return null;
    }

    private static Method p(long l10, long l11) {
        int n2 = y7.m(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = y7.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = y7.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = y7.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        y7.ob[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = y7.n(231718206125141L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = y7.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        y7.ob[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = y7.n(231718206125141L, 0L);
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

    @Override
    public void O() {
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'M' || c10 == '\u00e3' || c10 == 'A' || c10 == '\u00e5') {
                field = y7.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e3' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'A' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = y7.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c6' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    static {
        block9: {
            block8: {
                y7.bb = d8.a(-2291224247633506480L, 3586797337549348008L, MethodHandles.lookup().lookupClass()).a(140107159231560L);
                y7.ob = new Object[5];
                y7.pb = new String[5];
                y7.D();
                y7.mb = new HashMap<K, V>(13);
                var0 = y7.bb ^ 106113747484816L;
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
                var6_5 = "i\u00a4\u00fc\u00e7\u00dcS#\u008aG\u00d8\u008d7X\u0086\u0011%\u00ca\u0016\u00c9#\u0086\u0017\u00aep}=\u0019\u00d8j\u0094e\u00b9\res\u001f.'\u0096\u0004mZV\u0090\u00eb\u0092m\f\u00cf:\u0081\u0095>\u0005\u00a3\u00a8t)\u00a5u\u00f8'5\u00e8\u00a8\u00d4\u00c3'tG\u00d7\u00ff";
                var7_6 = "i\u00a4\u00fc\u00e7\u00dcS#\u008aG\u00d8\u008d7X\u0086\u0011%\u00ca\u0016\u00c9#\u0086\u0017\u00aep}=\u0019\u00d8j\u0094e\u00b9\res\u001f.'\u0096\u0004mZV\u0090\u00eb\u0092m\f\u00cf:\u0081\u0095>\u0005\u00a3\u00a8t)\u00a5u\u00f8'5\u00e8\u00a8\u00d4\u00c3'tG\u00d7\u00ff".length();
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
                    var6_5 = "Hlo\u0084\u0005c\u0088\u00c3\u008b\u0094*\u00beV\u00a9\u00aa\u00b7";
                    var7_6 = "Hlo\u0084\u0005c\u0088\u00c3\u008b\u0094*\u00beV\u00a9\u00aa\u00b7".length();
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
        y7.eb = var8_3;
        y7.lb = new Integer[11];
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = y7.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = y7.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = y7.m(l10, l11);
            object = ob[n2];
            try {
                if (!(object instanceof String)) break block2;
                y7.ob[n2] = clazz = Class.forName(pb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x68E2;
        if (lb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = eb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y7", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            y7.lb[n3] = n4;
        }
        return lb[n3];
    }

    private zy lambda$inputOnEnter$0(String string, zy zy2) {
        block3: {
            long l10;
            block2: {
                l10 = bb ^ 0x6E83F0F06181L;
                try {
                    if (!zy2.b()) break block2;
                    SE.h.r().I(string);
                    SE.h.r().e().k(true);
                    YK.C.N();
                    break block3;
                }
                catch (O_ o_2) {
                    throw y7.a(o_2);
                }
            }
            this.g((String)((Object)y7.d("p", (int)y7.c("v", (int)20988, (long)(0xBECE8CFC0FD9FF4L ^ l10)), (long)2801926266709024278L, (long)l10)) + zy2.A());
            SE.h.c().t((String)((Object)y7.d("p", (int)y7.c("v", (int)29569, (long)(0x33E52F5F66F9BD85L ^ l10)), (long)2801926266709024278L, (long)l10)), zy2.A(), HQ.WARNING, 5000L);
        }
        return zy2;
    }

    static void g(y7 y72) {
        y72.P();
    }

    private static void D() {
        Object[] objectArray = ob;
        ob[0] = "mu%";
        objectArray[1] = Integer.TYPE;
        y7.pb[1] = "java/lang/Integer";
        objectArray[2] = "cHHFr[hGY\t\u000fC{@P@";
        objectArray[3] = "^/Q0k^U @\u007f\nP^+D%";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "QN\u0012\u0001 |\u0001\u0011\u0006~$8a\u0012_\u00193-P\u001aX@pCXZ\u001f\u0003#|\u0018\u001bX\u0000O";
    }

    public y7() {
        long l10 = bb ^ 0x41CA8DAF70BL;
        this.pM = new CX(this, (String)((Object)y7.d("p", (int)y7.c("v", (int)29641, (long)(0x30D354FA38102B40L ^ l10)), (long)-5735303856704878436L, (long)l10)), 2000L);
        this.pm = false;
        this.d().f((String)((Object)y7.d("p", (int)y7.c("v", (int)8464, (long)(0x4D1CB3174E77F99FL ^ l10)), (long)-5735303856704878436L, (long)l10)));
        this.n(new bE(0.0, 10.0), new Object[0]);
        bQ bQ2 = new bQ((String)((Object)y7.d("p", (int)y7.c("v", (int)17232, (long)(0xB3EDC7A6441BDBL ^ l10)), (long)-5735303856704878436L, (long)l10)), 0.9);
        bQ2.T(this.w());
        bQ2.w(24.0);
        bQ2.q(true);
        bQ2.B(y7.M.c);
        this.n(bQ2, new Object[0]);
        this.pM.O().H((String)((Object)y7.d("p", (int)y7.c("v", (int)26660, (long)(0x4A6661D8ED0CB0A7L ^ l10)), (long)-5735303856704878436L, (long)l10)));
        this.pM.V(y7.M.E);
        this.pM.z(y7.M.w);
        this.pM.R(10.0f);
        this.pM.x(6.0f);
        this.n(this.pM, new Object[0]);
        this.p9 = new bQ((String)((Object)y7.d("p", (int)y7.c("v", (int)6516, (long)(0x1C61429B912DC1FEL ^ l10)), (long)-5735303856704878436L, (long)l10)), 0.7);
        this.p9.T(this.w() - 20.0);
        this.p9.w(40.0);
        this.p9.B(y7.M.n);
        this.p9.q(true);
        this.n(new wr(10.0, 0.0, this.p9), new Object[0]);
    }

    private void P() {
        this.pM.n();
        if (!this.pm) {
            this.pm = true;
            String string = this.pM.a();
            try {
                if (string.isEmpty()) {
                    this.pm = false;
                    return;
                }
            }
            catch (O_ o_2) {
                throw y7.a(o_2);
            }
            ((CompletableFuture)((CompletableFuture)_b.S().v(string).thenApplyAsync(arg_0 -> this.lambda$inputOnEnter$0(string, arg_0), (Executor)Ao.st)).whenCompleteAsync(this::lambda$inputOnEnter$1, (Executor)Ao.st)).exceptionally(this::lambda$inputOnEnter$2);
        }
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = y7.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = y7.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void lambda$inputOnEnter$1(zy zy2, Throwable throwable) {
        long l10 = bb ^ 0x3C33361712AFL;
        try {
            if (throwable != null) {
                this.g((String)((Object)y7.d("p", (int)y7.c("v", (int)29056, (long)(0x4B43D85D704DCCACL ^ l10)), (long)6182355596707130680L, (long)l10)));
                SE.h.c().t((String)((Object)y7.d("p", (int)y7.c("v", (int)25891, (long)(0x50901CF97E4D80BL ^ l10)), (long)6182355596707130680L, (long)l10)), (String)((Object)y7.d("p", (int)y7.c("v", (int)21791, (long)(0xDB3682A988EE83AL ^ l10)), (long)6182355596707130680L, (long)l10)), HQ.WARNING, 5000L);
            }
        }
        catch (O_ o_2) {
            throw y7.a(o_2);
        }
        this.pm = false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y7.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(y7.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

