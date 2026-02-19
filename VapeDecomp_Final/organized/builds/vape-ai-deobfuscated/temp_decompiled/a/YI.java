/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.G5;
import a.O_;
import a.X_;
import a.bE;
import a.bM;
import a.bN;
import a.d8;
import a.j3;
import a.jU;
import a.yE;
import a.yh;
import a.yp;
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

public class yi
extends yp {
    private static final Object[] fb;
    private j3 b;
    private static final long[] bb;
    private static final String[] jb;
    private static final Integer[] db;
    private static final Map eb;
    private static final long ab;
    private final yh V = (yh)this.t();

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = yi.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = yi.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = yi.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0xBA1;
        if (db[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yi", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            yi.db[n3] = n4;
        }
        return db[n3];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = yi.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = yi.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '$' || c10 == 'b' || c10 == 'K' || c10 == 'V') {
                field = yi.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '$' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'b' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yi.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'U' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field g(long l10, long l11) {
        int n2 = yi.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            String string = jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = yi.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = yi.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yi.c(clazz3, string2, clazz2)) != null) {
                    yi.fb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = yi.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        yi.fb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yi.f(224854344629675L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method h(long l10, long l11) {
        int n2 = yi.e(l10, l11);
        Object object = fb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = yi.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = yi.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yi.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        yi.fb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yi.f(224854344629675L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = yi.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        yi.fb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yi.f(224854344629675L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void G() {
        boolean bl2;
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        long l10 = ab ^ 0x49CA361CE919L;
        G5 g5 = this.L(0.8);
        try {
            d5 = this.G();
            d4 = this.W() + 2.5;
            d3 = this.w() - 5.0;
            d2 = this.b() - 5.0;
            color = this.s() ? yi.M.k : yi.M.S;
        }
        catch (O_ o_2) {
            throw yi.a(o_2);
        }
        F8.U(d5, d4, d3, d2, color, 2.0f, 0.75f, 1.0f);
        X_.B(yi.M.Z, (float)(this.G() + 8.0), (float)(this.W() + 7.0), (String)((Object)yi.c("B", (int)yi.b("z", (int)19578, (long)(0x625AE8D71BCDBBDAL ^ l10)), (long)8938363529525495859L, (long)l10)), 6.0f, 6.0f, false);
        g5.R((String)((Object)yi.c("B", (int)yi.b("z", (int)28737, (long)(0x2686245BBCB907E9L ^ l10)), (long)8938363529525495859L, (long)l10)), this.G() + 18.0, this.W() + 7.0, yi.M.c);
        F8.T(this.G() + 44.0, this.W() + 8.0, 5.0, 1.0f, yi.M.S);
        Object object = "";
        if (this.b.c().s().booleanValue()) {
            object = (String)object + (String)((Object)yi.c("B", (int)yi.b("z", (int)4956, (long)(0x273E2105FDC064F0L ^ l10)), (long)8938363529525495859L, (long)l10));
        }
        if (((jU)this.b.J()).s().booleanValue()) {
            object = (String)object + (String)((Object)yi.c("B", (int)yi.b("z", (int)720, (long)(0x50093E9EF0DD757EL ^ l10)), (long)8938363529525495859L, (long)l10));
        }
        if (this.b.G().s().booleanValue()) {
            object = (String)object + (String)((Object)yi.c("B", (int)yi.b("z", (int)12875, (long)(0xCF33C58148545EAL ^ l10)), (long)8938363529525495859L, (long)l10));
        }
        try {
            bl2 = !((String)object).isEmpty();
        }
        catch (O_ o_3) {
            throw yi.a(o_3);
        }
        boolean bl3 = bl2;
        String string = "";
        if (this.b.z().s().booleanValue()) {
            string = string + (String)((Object)yi.c("B", (int)yi.b("z", (int)20774, (long)(0x2181B986E92B268DL ^ l10)), (long)8938363529525495859L, (long)l10));
        }
        if (this.b.u().s().booleanValue()) {
            string = string + (String)((Object)yi.c("B", (int)yi.b("z", (int)24950, (long)(0x1D99E049AF96DBL ^ l10)), (long)8938363529525495859L, (long)l10));
        }
        if (this.b.t().s().booleanValue()) {
            string = string + (String)((Object)yi.c("B", (int)yi.b("z", (int)27718, (long)(0x18BBE8E5972D1BE1L ^ l10)), (long)8938363529525495859L, (long)l10));
        }
        if (!string.isEmpty()) {
            string = (String)((Object)yi.c("B", (int)yi.b("z", (int)6765, (long)(0x1B0E5FA706DC6DC4L ^ l10)), (long)8938363529525495859L, (long)l10)) + string;
        }
        if (((String)(object = (String)object + string)).endsWith((String)((Object)yi.c("B", (int)yi.b("z", (int)9140, (long)(0x3C4F257D96F1541EL ^ l10)), (long)8938363529525495859L, (long)l10)))) {
            object = ((String)object).substring(0, ((String)object).length() - 2);
        }
        if (!bl3) {
            object = yi.c("B", (int)yi.b("z", (int)24322, (long)(0x7C4A20E675028A0L ^ l10)), (long)8938363529525495859L, (long)l10);
        }
        bM bM2 = new bM((String)object, (String)((Object)yi.c("B", (int)yi.b("z", (int)1855, (long)(0x77641FBF6F1FF090L ^ l10)), (long)8938363529525495859L, (long)l10)), 105.0, 0.8, yi.M.c, false);
        bM2.y(this.G() + 52.0, this.W() + 7.0);
        g5.R((String)((Object)yi.c("B", (int)yi.b("z", (int)23635, (long)(0x3442254F079ABF0L ^ l10)), (long)8938363529525495859L, (long)l10)), this.G() + this.w() - 20.0, this.W() + 7.0, yi.M.c);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = yi.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public yi(j3 j32) {
        super(new yh(50.0));
        this.V.n(new bE(0.0, 2.0), new Object[0]);
        this.V.n(new bN(j32), new Object[0]);
        this.V.n(new yE(j32.z()), new Object[0]);
        this.V.n(new yE(j32.u()), new Object[0]);
        this.V.n(new yE(j32.t()), new Object[0]);
        this.b = j32;
        this.w(20.0);
        this.P(20.0);
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

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                yi.ab = d8.a(-8748966126015134008L, 1870609716800947013L, MethodHandles.lookup().lookupClass()).a(185557756600544L);
                yi.fb = new Object[5];
                yi.jb = new String[5];
                yi.i();
                yi.eb = new HashMap<K, V>(13);
                var0 = yi.ab ^ 65443283850656L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u009c\u0019\u009a_{Z\u00d7\u0082\u0093m\u001bB\u0002\u00b1X<\u00c7\u00a5\u0090\u00a7+\u00e6\u0019\u0095T\u0011u7\u00a83\u0091\u0002\u001e+\u00aag\u00e3*]\u0003d\u00a6\u001e\u00f7NW\u00f31$.\u00aa$\u0092{\u009f\u00e4d;\u00d7\u0088jN\u00e0\bQ\u0090\u0015Q\u0013\u00fdn\u0087\u00fe\u00e5&\u0002\u000b[\n\u00b5\u0004\u00f5*C\u00f0\u0087\u00b1\n";
                var7_6 = "\u009c\u0019\u009a_{Z\u00d7\u0082\u0093m\u001bB\u0002\u00b1X<\u00c7\u00a5\u0090\u00a7+\u00e6\u0019\u0095T\u0011u7\u00a83\u0091\u0002\u001e+\u00aag\u00e3*]\u0003d\u00a6\u001e\u00f7NW\u00f31$.\u00aa$\u0092{\u009f\u00e4d;\u00d7\u0088jN\u00e0\bQ\u0090\u0015Q\u0013\u00fdn\u0087\u00fe\u00e5&\u0002\u000b[\n\u00b5\u0004\u00f5*C\u00f0\u0087\u00b1\n".length();
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
                    var6_5 = "\u0011\u00b2\u0013\u00a6\u00da*\u00ab\u0004\u00c8\u0093@!\u00a4Z`x";
                    var7_6 = "\u0011\u00b2\u0013\u00a6\u00da*\u00ab\u0004\u00c8\u0093@!\u00a4Z`x".length();
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
        yi.bb = var8_3;
        yi.db = new Integer[13];
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = yi.e(l10, l11);
            object = fb[n2];
            try {
                if (!(object instanceof String)) break block2;
                yi.fb[n2] = clazz = Class.forName(jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void i() {
        Object[] objectArray = fb;
        fb[0] = "|q\u001e";
        objectArray[1] = Integer.TYPE;
        yi.jb[1] = "java/lang/Integer";
        objectArray[2] = "8'o4hI3(~{\u0015Q /w2";
        objectArray[3] = "dl.6WEoc?y6Kdh;#";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "n~vS3Kk'm\"4[\f.2Y9\u001dr/sK` 5y1P DspgA_";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (jb[n5] != null) {
            return n5;
        }
        Object object = fb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 45;
                break;
            }
            case 1: {
                n4 = 58;
                break;
            }
            case 2: {
                n4 = 7;
                break;
            }
            case 3: {
                n4 = 43;
                break;
            }
            case 4: {
                n4 = 52;
                break;
            }
            case 5: {
                n4 = 4;
                break;
            }
            case 6: {
                n4 = 59;
                break;
            }
            case 7: {
                n4 = 9;
                break;
            }
            case 8: {
                n4 = 16;
                break;
            }
            case 9: {
                n4 = 17;
                break;
            }
            case 10: {
                n4 = 49;
                break;
            }
            case 11: {
                n4 = 54;
                break;
            }
            case 12: {
                n4 = 19;
                break;
            }
            case 13: {
                n4 = 44;
                break;
            }
            case 14: {
                n4 = 0;
                break;
            }
            case 15: {
                n4 = 34;
                break;
            }
            case 16: {
                n4 = 41;
                break;
            }
            case 17: {
                n4 = 24;
                break;
            }
            case 18: {
                n4 = 38;
                break;
            }
            case 19: {
                n4 = 51;
                break;
            }
            case 20: {
                n4 = 39;
                break;
            }
            case 21: {
                n4 = 22;
                break;
            }
            case 22: {
                n4 = 36;
                break;
            }
            case 23: {
                n4 = 57;
                break;
            }
            case 24: {
                n4 = 8;
                break;
            }
            case 25: {
                n4 = 61;
                break;
            }
            case 26: {
                n4 = 13;
                break;
            }
            case 27: {
                n4 = 10;
                break;
            }
            case 28: {
                n4 = 30;
                break;
            }
            case 29: {
                n4 = 55;
                break;
            }
            case 30: {
                n4 = 28;
                break;
            }
            case 31: {
                n4 = 15;
                break;
            }
            case 32: {
                n4 = 11;
                break;
            }
            case 33: {
                n4 = 1;
                break;
            }
            case 34: {
                n4 = 53;
                break;
            }
            case 35: {
                n4 = 33;
                break;
            }
            case 36: {
                n4 = 27;
                break;
            }
            case 37: {
                n4 = 56;
                break;
            }
            case 38: {
                n4 = 46;
                break;
            }
            case 39: {
                n4 = 32;
                break;
            }
            case 40: {
                n4 = 37;
                break;
            }
            case 41: {
                n4 = 47;
                break;
            }
            case 42: {
                n4 = 26;
                break;
            }
            case 43: {
                n4 = 21;
                break;
            }
            case 44: {
                n4 = 5;
                break;
            }
            case 45: {
                n4 = 12;
                break;
            }
            case 46: {
                n4 = 25;
                break;
            }
            case 47: {
                n4 = 42;
                break;
            }
            case 48: {
                n4 = 48;
                break;
            }
            case 49: {
                n4 = 50;
                break;
            }
            case 50: {
                n4 = 23;
                break;
            }
            case 51: {
                n4 = 2;
                break;
            }
            case 52: {
                n4 = 20;
                break;
            }
            case 53: {
                n4 = 40;
                break;
            }
            case 54: {
                n4 = 35;
                break;
            }
            case 55: {
                n4 = 63;
                break;
            }
            case 56: {
                n4 = 29;
                break;
            }
            case 57: {
                n4 = 18;
                break;
            }
            case 58: {
                n4 = 6;
                break;
            }
            case 59: {
                n4 = 14;
                break;
            }
            case 60: {
                n4 = 62;
                break;
            }
            case 61: {
                n4 = 3;
                break;
            }
            case 62: {
                n4 = 60;
                break;
            }
            default: {
                n4 = 31;
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
        yi.jb[n5] = new String(cArray);
        return n5;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(yi.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

