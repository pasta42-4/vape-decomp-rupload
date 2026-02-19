/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Hc;
import a.Ib;
import a.O_;
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

public class qy
extends v2 {
    public HK S;
    private static final Object[] g;
    public final HK m;
    private static final Map e;
    public Ib X;
    private static final long a;
    private static final Integer[] d;
    public final HK b;
    private HK B;
    public final HK f;
    public HK D;
    private HK U;
    private static final String[] j;
    private final Ib T;
    private final Ib i;
    private static ht[] h;
    private HK y;
    private static final long[] c;

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (j[n5] != null) {
            return n5;
        }
        Object object = g[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 33;
                break;
            }
            case 1: {
                n4 = 56;
                break;
            }
            case 2: {
                n4 = 54;
                break;
            }
            case 3: {
                n4 = 43;
                break;
            }
            case 4: {
                n4 = 13;
                break;
            }
            case 5: {
                n4 = 34;
                break;
            }
            case 6: {
                n4 = 6;
                break;
            }
            case 7: {
                n4 = 37;
                break;
            }
            case 8: {
                n4 = 48;
                break;
            }
            case 9: {
                n4 = 61;
                break;
            }
            case 10: {
                n4 = 2;
                break;
            }
            case 11: {
                n4 = 29;
                break;
            }
            case 12: {
                n4 = 3;
                break;
            }
            case 13: {
                n4 = 59;
                break;
            }
            case 14: {
                n4 = 12;
                break;
            }
            case 15: {
                n4 = 44;
                break;
            }
            case 16: {
                n4 = 35;
                break;
            }
            case 17: {
                n4 = 25;
                break;
            }
            case 18: {
                n4 = 27;
                break;
            }
            case 19: {
                n4 = 50;
                break;
            }
            case 20: {
                n4 = 55;
                break;
            }
            case 21: {
                n4 = 62;
                break;
            }
            case 22: {
                n4 = 22;
                break;
            }
            case 23: {
                n4 = 24;
                break;
            }
            case 24: {
                n4 = 46;
                break;
            }
            case 25: {
                n4 = 32;
                break;
            }
            case 26: {
                n4 = 41;
                break;
            }
            case 27: {
                n4 = 60;
                break;
            }
            case 28: {
                n4 = 36;
                break;
            }
            case 29: {
                n4 = 38;
                break;
            }
            case 30: {
                n4 = 1;
                break;
            }
            case 31: {
                n4 = 39;
                break;
            }
            case 32: {
                n4 = 58;
                break;
            }
            case 33: {
                n4 = 5;
                break;
            }
            case 34: {
                n4 = 15;
                break;
            }
            case 35: {
                n4 = 11;
                break;
            }
            case 36: {
                n4 = 14;
                break;
            }
            case 37: {
                n4 = 52;
                break;
            }
            case 38: {
                n4 = 49;
                break;
            }
            case 39: {
                n4 = 23;
                break;
            }
            case 40: {
                n4 = 0;
                break;
            }
            case 41: {
                n4 = 10;
                break;
            }
            case 42: {
                n4 = 51;
                break;
            }
            case 43: {
                n4 = 17;
                break;
            }
            case 44: {
                n4 = 31;
                break;
            }
            case 45: {
                n4 = 20;
                break;
            }
            case 46: {
                n4 = 53;
                break;
            }
            case 47: {
                n4 = 63;
                break;
            }
            case 48: {
                n4 = 18;
                break;
            }
            case 49: {
                n4 = 30;
                break;
            }
            case 50: {
                n4 = 8;
                break;
            }
            case 51: {
                n4 = 42;
                break;
            }
            case 52: {
                n4 = 16;
                break;
            }
            case 53: {
                n4 = 47;
                break;
            }
            case 54: {
                n4 = 57;
                break;
            }
            case 55: {
                n4 = 7;
                break;
            }
            case 56: {
                n4 = 40;
                break;
            }
            case 57: {
                n4 = 19;
                break;
            }
            case 58: {
                n4 = 28;
                break;
            }
            case 59: {
                n4 = 21;
                break;
            }
            case 60: {
                n4 = 26;
                break;
            }
            case 61: {
                n4 = 45;
                break;
            }
            case 62: {
                n4 = 4;
                break;
            }
            default: {
                n4 = 9;
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
        qy.j[n5] = new String(cArray);
        return n5;
    }

    public boolean p(Object object) {
        return this.b.V(object, new Object[0]);
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

    public static ht[] A() {
        return h;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1C86;
        if (d[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
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
                throw new RuntimeException("a/qy", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qy.d[n3] = n4;
        }
        return d[n3];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void j(ht[] htArray) {
        h = htArray;
    }

    private static Method h(long l10, long l11) {
        int n2 = qy.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n2];
                int n4 = string2.indexOf(8);
                clazz3 = qy.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = qy.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qy.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        qy.g[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qy.f(741452849071637L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = qy.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        qy.g[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qy.f(741452849071637L, 0L);
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

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\r[xy";
        objectArray[1] = "[\u001aZx\u001a6P\u0015K7g.C\u0012B~";
        objectArray[2] = Boolean.TYPE;
        qy.j[2] = "java/lang/Boolean";
        objectArray[3] = "\u0019<s|tJ\u00123b3\u0019J\u0012.v";
        objectArray[4] = "\u001a0E@/1o\u0010NO>~\u0002\u0010NR*k";
        objectArray[5] = "Kmm)";
        objectArray[6] = "fOH";
        objectArray[7] = Integer.TYPE;
        qy.j[7] = "java/lang/Integer";
        objectArray[8] = "6%9\b";
        objectArray[9] = "(1h~~o]\u0011cqo 0\u0011cl{5";
        objectArray[10] = "!n{^\"y*aj\u0011Cw!jnK";
        objectArray[11] = "x{l{d(\"k7\u0010[A}5az!pxe0i\u001cx'obsf/?ww\u0010&} ur n:=q\u000f.s>}hqjyxt\n3(p?5s6l\"8D";
        objectArray[12] = "j\u0014z,:)0\u0004!G\u0019@oZw-\u007fqj\n&>By5\u0000t$8.-\u0018aGx|2\u001adw0;/\u001e\u0019y|#$\u000ek{z%fe";
        objectArray[13] = "s\u0011\u0019\u0006D )\u0001BmaIv_\u0014\u0007\u0001xs\u000fE\u0014<p,\u0005\u0017\u000eF'4\u001d\u0002m\u0006u+\u001f\u0007]N26\u001bzSS6v\u0002\u0004\u0017Yp\u007f`FUP7>\u0019C\u0011\u00020O";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "\fm\fYI'@?\u0012^t)KS^\\I'[7\u0005WDr0j\\Y\u001e\u007f\u0001o\f\b\rB";
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qy.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = qy.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void y(Object object) {
        this.m.l(null, object);
    }

    public void w() {
        this.U.V(null);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qy.a = d8.a(-6178006126943810373L, 116541606752324234L, MethodHandles.lookup().lookupClass()).a(179849729794036L);
                qy.g = new Object[15];
                qy.j = new String[15];
                qy.a();
                qy.e = new HashMap<K, V>(13);
                qy.j(new ht[1]);
                var0 = qy.a ^ 35128641928948L;
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
                var6_5 = "#c\u00df2\u00dc2\u00ff\u0085)l\u00ee?\u00e1a\u00b8R\u00eb\u00daR8\u00d0\u00ce\u00d6ZYC\u00e9\u0007\u0004\u0000}\u00a8\u00a9G\u00d1\u001e\u00a7\u0080\u0086\u001b\u008e\t~\u00d1/\u00db\u0014\u00f6\u00ef|F\u00ccp\u00b3e\u00e9\t+\u0081\u00f1\u008a\u00f3\u00fau2\u001b\u0080o\u008d\u00aa\u001aN\u00ed\u009c\u00d1\u00ad\u00cdT\u001e\r\u0015\u00ad\u0013\u0010\u0001\u00c81\u009b\u00897\u00be\u00b33\u00b1(X\u00e9\u00d2\u00f4\u0017\u00c3\u00d0R\u00e6";
                var7_6 = "#c\u00df2\u00dc2\u00ff\u0085)l\u00ee?\u00e1a\u00b8R\u00eb\u00daR8\u00d0\u00ce\u00d6ZYC\u00e9\u0007\u0004\u0000}\u00a8\u00a9G\u00d1\u001e\u00a7\u0080\u0086\u001b\u008e\t~\u00d1/\u00db\u0014\u00f6\u00ef|F\u00ccp\u00b3e\u00e9\t+\u0081\u00f1\u008a\u00f3\u00fau2\u001b\u0080o\u008d\u00aa\u001aN\u00ed\u009c\u00d1\u00ad\u00cdT\u001e\r\u0015\u00ad\u0013\u0010\u0001\u00c81\u009b\u00897\u00be\u00b33\u00b1(X\u00e9\u00d2\u00f4\u0017\u00c3\u00d0R\u00e6".length();
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
                    var6_5 = "\u00c9_R'\u00a0\u0085>\u009cG\u00960\u00e2$\u001d{=";
                    var7_6 = "\u00c9_R'\u00a0\u0085>\u009cG\u00960\u00e2$\u001d{=".length();
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
        qy.c = var8_3;
        qy.d = new Integer[15];
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = qy.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public int P(Object object) {
        return this.S.R(object, new Object[0]);
    }

    private static Field g(long l10, long l11) {
        int n2 = qy.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            String string = j[n2];
            int n3 = string.indexOf(8);
            Class clazz = qy.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = qy.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qy.c(clazz3, string2, clazz2)) != null) {
                    qy.g[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = qy.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        qy.g[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qy.f(741452849071637L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c7' || c10 == 'F' || c10 == 'U' || c10 == 'Z') {
                field = qy.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'F' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'U' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qy.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void V(Object object, boolean bl2) {
        this.D.l(null, object, bl2);
    }

    public void i(int n2) {
        this.m.l(null, n2);
    }

    public Object b(Object object) {
        return this.X.Z(object);
    }

    public void J(Object object, int n2) {
        this.i.t(object, n2);
    }

    public boolean W(Object object) {
        return this.f.V(object, new Object[0]);
    }

    public void z(int n2, boolean bl2) {
        this.D.l(null, n2, bl2);
    }

    public boolean J(Object object) {
        return this.T.R(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = qy.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public int e(Object object) {
        return this.i.R(object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public qy() {
        block30: {
            block28: {
                block27: {
                    block23: {
                        block26: {
                            block24: {
                                block25: {
                                    var1_1 = qy.a ^ 46876989730849L;
                                    super(eM.R);
                                    this.T = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)4566, (long)(2746845038662089876L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)8197741777819939257L, (long)var1_1);
                                    var3_2 = qy.A();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        this.i = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)22107, (long)(6584134430108007191L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Integer.TYPE, (long)8197741777819939257L, (long)var1_1);
                                                        v0 = this;
                                                        v1 = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)9545, (long)(5848423599293712385L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)8198228380363712672L, (long)var1_1);
                                                        if (var3_2 == null) break block23;
                                                        v0.b = v1;
                                                        if (Hc.U.d()) {
                                                        }
                                                        ** GOTO lbl48
                                                    }
                                                    catch (O_ v2) {
                                                        throw qy.a(v2);
                                                    }
                                                    if (kX.C() < 35) {
                                                    }
                                                    ** GOTO lbl48
                                                }
                                                catch (O_ v3) {
                                                    throw qy.a(v3);
                                                }
                                                v4 = this;
                                                v5 = this;
                                                v6 /* !! */  = kX.C();
                                                if (var3_2 == null) break block24;
                                            }
                                            catch (O_ v7) {
                                                throw qy.a(v7);
                                            }
                                            if (v6 /* !! */  != 15) break block25;
                                        }
                                        catch (O_ v8) {
                                            throw qy.a(v8);
                                        }
                                        v9 = qy.c("v", (int)qy.b("i", (int)2036, (long)(8857882960052611775L ^ var1_1)), (long)8197879713136702494L, (long)var1_1);
                                        break block26;
                                    }
                                    catch (O_ v10) {
                                        throw qy.a(v10);
                                    }
                                }
                                v6 /* !! */  = (int)qy.b("i", (int)25121, (long)(9025580705651887970L ^ var1_1));
                            }
                            v9 = qy.c("v", (int)v6 /* !! */ , (long)8197879713136702494L, (long)var1_1);
                        }
                        try {
                            v4.f = qy.c("\u00e5", (Object)v5, (Object)v9, (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)8198228380363712672L, (long)var1_1);
                            if (var3_2 != null) break block27;
lbl48:
                            // 3 sources

                            v0 = this;
                            v1 = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)5724, (long)(6782925575803239187L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)Hc.z, Boolean.TYPE, (Object)new Class[0], (long)8198228380363712672L, (long)var1_1);
                        }
                        catch (O_ v11) {
                            throw qy.a(v11);
                        }
                    }
                    v0.f = v1;
                }
                try {
                    block29: {
                        try {
                            try {
                                this.U = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)17455, (long)(7571998605320333670L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)8197792651025159312L, (long)var1_1);
                                if (var3_2 == null) break block28;
                                if (kX.C() < 35) break block29;
                            }
                            catch (O_ v12) {
                                throw qy.a(v12);
                            }
                            this.y = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)16249, (long)(3326922084845212223L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)8198228380363712672L, (long)var1_1);
                            this.B = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)21369, (long)(2305692076032900670L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)8198228380363712672L, (long)var1_1);
                            this.X = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)16446, (long)(5673205157651164538L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, (Object)eM.bG, (long)8197741777819939257L, (long)var1_1);
                            this.D = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)9916, (long)(6117063603709856764L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.bG, Boolean.TYPE}, (long)8197792651025159312L, (long)var1_1);
                            this.m = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)21638, (long)(6339404134210943427L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.bG}, (long)8197792651025159312L, (long)var1_1);
                            if (var3_2 != null) break block30;
                        }
                        catch (O_ v13) {
                            throw qy.a(v13);
                        }
                    }
                    this.S = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)23206, (long)(4362787809296136167L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)8198228380363712672L, (long)var1_1);
                    this.D = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)3008, (long)(1107468879642060429L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Boolean.TYPE}, (long)8197792651025159312L, (long)var1_1);
                }
                catch (O_ v14) {
                    throw qy.a(v14);
                }
            }
            this.m = qy.c("\u00e5", (Object)this, (Object)qy.c("v", (int)qy.b("i", (int)16970, (long)(4589081694898859776L ^ var1_1)), (long)8197879713136702494L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE}, (long)8197792651025159312L, (long)var1_1);
        }
        try {
            if (ht.J() != null) {
                qy.j(new ht[2]);
            }
        }
        catch (O_ v15) {
            throw qy.a(v15);
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = qy.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = qy.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void i(Object object, boolean bl2) {
        this.y.l(object, bl2);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = qy.e(l10, l11);
            object = g[n2];
            try {
                if (!(object instanceof String)) break block2;
                qy.g[n2] = clazz = Class.forName(j[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qy.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(qy.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

