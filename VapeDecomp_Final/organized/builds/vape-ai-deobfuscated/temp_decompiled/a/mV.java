/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hc;
import a.Ib;
import a.O_;
import a.d8;
import a.eM;
import a.kX;
import a.m4;
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

public class mv
extends v2 {
    private static final Map e;
    private final Ib b;
    private final Ib W;
    private final Ib r;
    private final Ib S;
    private static final String[] g;
    private static final long[] c;
    private static final Integer[] d;
    private static final long a;
    private static final Object[] f;
    private final Ib E;

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3072;
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
                throw new RuntimeException("a/mv", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mv.d[n3] = n4;
        }
        return d[n3];
    }

    private Object i() {
        return this.S.Z(null);
    }

    static Object Q(mv mv2) {
        return mv2.P();
    }

    private Object P() {
        return this.r.Z(null);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                mv.a = d8.a(-1209875077391160387L, -8791518018095046863L, MethodHandles.lookup().lookupClass()).a(8157140791571L);
                mv.f = new Object[11];
                mv.g = new String[11];
                mv.a();
                mv.e = new HashMap<K, V>(13);
                var0 = mv.a ^ 102737051964783L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "\u00c9>\u00b3\u00b5\u00a4p\f\u00cb\u00e3\u009aZ\u001b\b\u0007\u00a7\u0087>\u008d\u00f6\u0011\u00b7sQ\u00b0\u001d\u00f2\u00c7\u0089\u000e\u0017\u00d29";
                var7_6 = "\u00c9>\u00b3\u00b5\u00a4p\f\u00cb\u00e3\u009aZ\u001b\b\u0007\u00a7\u0087>\u008d\u00f6\u0011\u00b7sQ\u00b0\u001d\u00f2\u00c7\u0089\u000e\u0017\u00d29".length();
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
                    var6_5 = "\u001f\u0090\u00da!\u00a2|3)\u00dfpN5\u00f3}\u00a8m";
                    var7_6 = "\u001f\u0090\u00da!\u00a2|3)\u00dfpN5\u00f3}\u00a8m".length();
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
        mv.c = var8_3;
        mv.d = new Integer[6];
    }

    static Object h(mv mv2) {
        return mv2.m();
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = mv.e(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                mv.f[n2] = clazz = Class.forName(g[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "]>=";
        objectArray[1] = Integer.TYPE;
        mv.g[1] = "java/lang/Integer";
        objectArray[2] = "^ef_\u0001|Ujw\u0010|dFm~Y";
        objectArray[3] = "Y\n`r";
        objectArray[4] = Boolean.TYPE;
        mv.g[4] = "java/lang/Boolean";
        objectArray[5] = "7AJixu<N[&\u0015u<SO";
        objectArray[6] = "P^}A";
        objectArray[7] = "f$q|+jm+`3Jdf di";
        objectArray[8] = "\\egm-\u0004[2jiU2f6`u?\u0018^q%83i\\}|`.R\b0v8UU^~w>+\t\u0017c&\u0007iV\u0019`kl%V\u0003`\u001b";
        objectArray[9] = "9Z\u00149\u0004 >\r\u0019=|\u0000\u0003\t\u0013!\u0016<;NVl\u001aM9B\u000f4\u0007vm\u000f\u0005l|q;A\u0004j\u0002-r\\US@r|_\u00188\frf_h";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "Y\nrm\\#Z_v\u0007Y4`\u000f#bV-\u0000G!9IOYM:mCw\u001e\bwa2";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c6' || c10 == '\u00da' || c10 == '\u00fa' || c10 == '\u00ca') {
                field = mv.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00fa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = mv.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00fd' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ba' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = mv.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = mv.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private float X(Object object) {
        return this.E.x(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = mv.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = mv.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = mv.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private Object l() {
        return this.b.Z(null);
    }

    static Object T(mv mv2) {
        return mv2.i();
    }

    /*
     * Unable to fully structure code
     */
    public mv() {
        block9: {
            block8: {
                var1_1 = mv.a ^ 114629713251376L;
                v0 = m4.B();
                super(eM.r8);
                var3_2 = v0;
                try {
                    try {
                        if (var3_2 != null) break block8;
                        if (kX.C() >= 35) {
                        }
                        ** GOTO lbl20
                    }
                    catch (O_ v1) {
                        throw mv.a(v1);
                    }
                    this.E = mv.c("\u00fd", (Object)this, (Object)mv.c("\u00ba", (int)mv.b("v", (int)8350, (long)(7265477807561051763L ^ var1_1)), (long)-7016970933453246346L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7017129439506043787L, (long)var1_1);
                }
                catch (O_ v2) {
                    throw mv.a(v2);
                }
            }
            try {
                if (var3_2 == null) break block9;
lbl20:
                // 2 sources

                this.E = mv.c("\u00fd", (Object)this, (Object)mv.c("\u00ba", (int)mv.b("v", (int)26918, (long)(4346531545757337545L ^ var1_1)), (long)-7016970933453246346L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7017129439506043787L, (long)var1_1);
            }
            catch (O_ v3) {
                throw mv.a(v3);
            }
        }
        this.W = mv.c("\u00fd", (Object)this, (Object)mv.c("\u00ba", (int)mv.b("v", (int)1479, (long)(5724100611828165417L ^ var1_1)), (long)-7016970933453246346L, (long)var1_1), (boolean)Hc.z, (Object)eM.r8, (long)-7017078960522833679L, (long)var1_1);
        this.r = mv.c("\u00fd", (Object)this, (Object)mv.c("\u00ba", (int)mv.b("v", (int)5026, (long)(4002506079421611342L ^ var1_1)), (long)-7016970933453246346L, (long)var1_1), (boolean)Hc.z, (Object)eM.r8, (long)-7017078960522833679L, (long)var1_1);
        this.b = mv.c("\u00fd", (Object)this, (Object)mv.c("\u00ba", (int)mv.b("v", (int)5868, (long)(4453227758652635142L ^ var1_1)), (long)-7016970933453246346L, (long)var1_1), (boolean)Hc.z, (Object)eM.r8, (long)-7017078960522833679L, (long)var1_1);
        this.S = mv.c("\u00fd", (Object)this, (Object)mv.c("\u00ba", (int)mv.b("v", (int)6993, (long)(7123791973374604730L ^ var1_1)), (long)-7016970933453246346L, (long)var1_1), (boolean)Hc.z, (Object)eM.r8, (long)-7017078960522833679L, (long)var1_1);
    }

    private static Field g(long l10, long l11) {
        int n2 = mv.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = mv.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = mv.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = mv.c(clazz3, string2, clazz2)) != null) {
                    mv.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = mv.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        mv.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = mv.f(516422137648943L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static Object E(mv mv2) {
        return mv2.l();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = mv.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method h(long l10, long l11) {
        int n2 = mv.e(l10, l11);
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
                clazz3 = mv.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = mv.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = mv.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        mv.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = mv.f(516422137648943L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = mv.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        mv.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = mv.f(516422137648943L, 0L);
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

    private Object m() {
        return this.W.Z(null);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static float X(mv mv2, Object object) {
        return mv2.X(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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
                n4 = 31;
                break;
            }
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 16;
                break;
            }
            case 3: {
                n4 = 21;
                break;
            }
            case 4: {
                n4 = 59;
                break;
            }
            case 5: {
                n4 = 52;
                break;
            }
            case 6: {
                n4 = 11;
                break;
            }
            case 7: {
                n4 = 56;
                break;
            }
            case 8: {
                n4 = 2;
                break;
            }
            case 9: {
                n4 = 55;
                break;
            }
            case 10: {
                n4 = 29;
                break;
            }
            case 11: {
                n4 = 12;
                break;
            }
            case 12: {
                n4 = 37;
                break;
            }
            case 13: {
                n4 = 8;
                break;
            }
            case 14: {
                n4 = 13;
                break;
            }
            case 15: {
                n4 = 24;
                break;
            }
            case 16: {
                n4 = 40;
                break;
            }
            case 17: {
                n4 = 27;
                break;
            }
            case 18: {
                n4 = 53;
                break;
            }
            case 19: {
                n4 = 0;
                break;
            }
            case 20: {
                n4 = 61;
                break;
            }
            case 21: {
                n4 = 20;
                break;
            }
            case 22: {
                n4 = 36;
                break;
            }
            case 23: {
                n4 = 10;
                break;
            }
            case 24: {
                n4 = 57;
                break;
            }
            case 25: {
                n4 = 14;
                break;
            }
            case 26: {
                n4 = 50;
                break;
            }
            case 27: {
                n4 = 30;
                break;
            }
            case 28: {
                n4 = 32;
                break;
            }
            case 29: {
                n4 = 43;
                break;
            }
            case 30: {
                n4 = 62;
                break;
            }
            case 31: {
                n4 = 51;
                break;
            }
            case 32: {
                n4 = 44;
                break;
            }
            case 33: {
                n4 = 6;
                break;
            }
            case 34: {
                n4 = 33;
                break;
            }
            case 35: {
                n4 = 17;
                break;
            }
            case 36: {
                n4 = 34;
                break;
            }
            case 37: {
                n4 = 45;
                break;
            }
            case 38: {
                n4 = 3;
                break;
            }
            case 39: {
                n4 = 28;
                break;
            }
            case 40: {
                n4 = 63;
                break;
            }
            case 41: {
                n4 = 35;
                break;
            }
            case 42: {
                n4 = 58;
                break;
            }
            case 43: {
                n4 = 49;
                break;
            }
            case 44: {
                n4 = 38;
                break;
            }
            case 45: {
                n4 = 39;
                break;
            }
            case 46: {
                n4 = 25;
                break;
            }
            case 47: {
                n4 = 48;
                break;
            }
            case 48: {
                n4 = 26;
                break;
            }
            case 49: {
                n4 = 5;
                break;
            }
            case 50: {
                n4 = 18;
                break;
            }
            case 51: {
                n4 = 60;
                break;
            }
            case 52: {
                n4 = 7;
                break;
            }
            case 53: {
                n4 = 41;
                break;
            }
            case 54: {
                n4 = 19;
                break;
            }
            case 55: {
                n4 = 15;
                break;
            }
            case 56: {
                n4 = 47;
                break;
            }
            case 57: {
                n4 = 22;
                break;
            }
            case 58: {
                n4 = 9;
                break;
            }
            case 59: {
                n4 = 46;
                break;
            }
            case 60: {
                n4 = 4;
                break;
            }
            case 61: {
                n4 = 42;
                break;
            }
            case 62: {
                n4 = 54;
                break;
            }
            default: {
                n4 = 23;
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
        mv.g[n5] = new String(cArray);
        return n5;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mv.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(mv.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

