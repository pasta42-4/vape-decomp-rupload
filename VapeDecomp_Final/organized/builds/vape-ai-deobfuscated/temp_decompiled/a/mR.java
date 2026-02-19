/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Hc;
import a.Ib;
import a.Na;
import a.O_;
import a.SE;
import a.d8;
import a.eM;
import a.kX;
import a.mj;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mr
extends v2 {
    private static final long[] b;
    private static final long a;
    private Ib r;
    private Ib n;
    private static final Integer[] c;
    private static final String[] f;
    private Ib p;
    private Ib L;
    private static final Map d;
    private Ib D;
    private Ib N;
    private HK P;
    private static final Object[] e;

    public void J(Object object, float f10) {
        this.D.H(object, f10);
    }

    public float B(Object object) {
        return this.r.x(object);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = mr.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                mr.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(long l10, long l11) {
        int n2 = mr.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n2];
                int n4 = string2.indexOf(8);
                clazz3 = mr.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = mr.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = mr.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        mr.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = mr.f(657731382591794L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = mr.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        mr.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = mr.f(657731382591794L, 0L);
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

    /*
     * Unable to fully structure code
     */
    public mr() {
        block23: {
            block28: {
                block26: {
                    block27: {
                        block25: {
                            block21: {
                                var1_1 = mr.a ^ 54334310891674L;
                                v0 = mj.u();
                                super(eM.UV);
                                var3_2 = v0;
                                try {
                                    block22: {
                                        try {
                                            try {
                                                v1 = Na.MC_1_21_4.H();
                                                if (var3_2 == 0) break block21;
                                                if (v1 == 0) break block22;
                                            }
                                            catch (O_ v2) {
                                                throw mr.a(v2);
                                            }
                                            this.p = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)9808, (long)(3845824766411051855L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, (Object)eM.UT, (long)-7108171678843396497L, (long)var1_1);
                                            if (var3_2 != 0) break block23;
                                        }
                                        catch (O_ v3) {
                                            throw mr.a(v3);
                                        }
                                    }
                                    v1 = kX.C();
                                }
                                catch (O_ v4) {
                                    throw mr.a(v4);
                                }
                            }
                            try {
                                block24: {
                                    try {
                                        if (v1 <= 13) break block24;
                                        this.N = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)26495, (long)(2944333162760393325L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                        this.L = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)6155, (long)(3114370655971061015L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                        this.n = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)4809, (long)(1583531831026788308L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                        if (var3_2 != 0) break block25;
                                    }
                                    catch (O_ v5) {
                                        throw mr.a(v5);
                                    }
                                }
                                this.N = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)23119, (long)(3562971156766125916L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)Hc.z, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                this.L = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)19239, (long)(4228265809295998512L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)Hc.z, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                                this.n = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)5092, (long)(1575591121159890677L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)Hc.z, Double.TYPE, (long)-7108171678843396497L, (long)var1_1);
                            }
                            catch (O_ v6) {
                                throw mr.a(v6);
                            }
                        }
                        try {
                            try {
                                v7 = kX.C();
                                if (var3_2 == 0) break block26;
                                if (v7 <= 13) break block27;
                            }
                            catch (O_ v8) {
                                throw mr.a(v8);
                            }
                            this.P = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)7092, (long)(8279683966325468834L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)Hc.z, Set.class, (Object)new Class[0], (long)-7108127233700063595L, (long)var1_1);
                        }
                        catch (O_ v9) {
                            throw mr.a(v9);
                        }
                    }
                    v7 = (int)SE.h.d();
                }
                try {
                    if (var3_2 == 0) break block28;
                    if (v7 != 0) {
                    }
                    ** GOTO lbl76
                }
                catch (O_ v10) {
                    throw mr.a(v10);
                }
                v7 = kX.C();
            }
            try {
                block29: {
                    try {
                        if (v7 <= 13) break block29;
                        this.r = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)14715, (long)(5356126931078810731L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7108171678843396497L, (long)var1_1);
                        this.D = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)6231, (long)(5891545732806192450L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)true, Float.TYPE, (long)-7108171678843396497L, (long)var1_1);
                        if (var3_2 != 0) break block23;
                    }
                    catch (O_ v11) {
                        throw mr.a(v11);
                    }
                }
                this.r = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)10904, (long)(3418290195763175308L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)Hc.z, Float.TYPE, (long)-7108171678843396497L, (long)var1_1);
                this.D = mr.c("s", (Object)this, (Object)mr.c("K", (int)mr.b("d", (int)22734, (long)(2285202140274421200L ^ var1_1)), (long)-7107964020507906106L, (long)var1_1), (boolean)Hc.z, Float.TYPE, (long)-7108171678843396497L, (long)var1_1);
            }
            catch (O_ v12) {
                throw mr.a(v12);
            }
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = mr.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = mr.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                mr.a = d8.a(4917531390748484226L, 6408670226085645470L, MethodHandles.lookup().lookupClass()).a(88756293906038L);
                mr.e = new Object[13];
                mr.f = new String[13];
                mr.a();
                mr.d = new HashMap<K, V>(13);
                var0 = mr.a ^ 36081711643727L;
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
                var6_5 = "b\u00f7\u0091b\u00dfaT\u00c9\u0081\u00f5\u00e5\u00ddLhP\u009b(@\u00be\u00af\u00d5\u0015\u0011\u0001\u00fa\u00d5$h\u008a\u00c4\u00e1\u0099\u00d3UE\u00bd,\u001eI\u00af\u00a5\n\u00ee\b/\u00fc\"d\u00c2QD$\u0000\u00f7\u00fe1\u0012\u00eb]:w&\u00b83\u0012g\u0007\u0013F2'\u00b5i[\u0019\u009f\u00b8=Lc";
                var7_6 = "b\u00f7\u0091b\u00dfaT\u00c9\u0081\u00f5\u00e5\u00ddLhP\u009b(@\u00be\u00af\u00d5\u0015\u0011\u0001\u00fa\u00d5$h\u008a\u00c4\u00e1\u0099\u00d3UE\u00bd,\u001eI\u00af\u00a5\n\u00ee\b/\u00fc\"d\u00c2QD$\u0000\u00f7\u00fe1\u0012\u00eb]:w&\u00b83\u0012g\u0007\u0013F2'\u00b5i[\u0019\u009f\u00b8=Lc".length();
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
                    var6_5 = "\u0017\u00e2\u00e9\u008c\f\u00dcbg\u0010+\u00c1x\u00e3\u0015 \u0099";
                    var7_6 = "\u0017\u00e2\u00e9\u008c\f\u00dcbg\u0010+\u00c1x\u00e3\u0015 \u0099".length();
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
        mr.b = var8_3;
        mr.c = new Integer[12];
    }

    public Object Q(Object object) {
        return this.p.Z(object);
    }

    public double g(Object object) {
        return this.n.C(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = mr.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public double x(Object object) {
        return this.N.C(object);
    }

    public Object P(Object object) {
        return this.P.T(object, new Object[0]);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = mr.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public double M(Object object) {
        return this.L.C(object);
    }

    public float b(Object object) {
        return this.D.x(object);
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x284E;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/mr", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mr.c[n3] = n4;
        }
        return c[n3];
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = mr.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = mr.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "<z]$";
        objectArray[1] = "\u0016i\bQ\u000f\"\u001df\u0019\u001er:\u000ea\u0010W";
        objectArray[2] = Boolean.TYPE;
        mr.f[2] = "java/lang/Boolean";
        objectArray[3] = "\u0019E@fYO\u0012JQ)4O\u0012WE";
        objectArray[4] = "}\\\u0001\u0010sC\b|\n\u001fb\fe|\n\u0002v\u0019";
        objectArray[5] = "J\u0014\"\u001a";
        objectArray[6] = "J^|";
        objectArray[7] = Integer.TYPE;
        mr.f[7] = "java/lang/Integer";
        objectArray[8] = "3%\fq";
        objectArray[9] = "WVTCWE\\YE\f6KWRAV";
        objectArray[10] = "7{!?[T2k`\u0006$)b:<a\u0004Y>k2xc\u0010 }`z\u001aF<g!\u0006Y\u0019b>16\u000e\u0015#c^<\u001e\u0018a`<9\u0019E`\u0006e{_Ig6&j\u001eF[";
        objectArray[11] = "0?\u001aHYo5/[q:\u0012e~\u0007\u0016\u0006b9/\t\u000fa+'9[\r\u0018};#\u001aq[\"ez\nA\f.$'eL\u0006~90\u0003HQn:B";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "o1z^_\u0002\"az\u001d;\u000f(P;DI\u0018+<i\u0014RYSi:G\\\u0003#5kIEd";
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00fc' || c10 == '\u00fb' || c10 == 'I' || c10 == '\u00e4') {
                field = mr.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00fb' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = mr.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 's' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/mr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void X(Object object, float f10) {
        this.r.H(object, f10);
    }

    private static Field g(long l10, long l11) {
        int n2 = mr.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = mr.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = mr.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = mr.c(clazz3, string2, clazz2)) != null) {
                    mr.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = mr.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        mr.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = mr.f(657731382591794L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (f[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 61;
                break;
            }
            case 1: {
                n4 = 37;
                break;
            }
            case 2: {
                n4 = 11;
                break;
            }
            case 3: {
                n4 = 58;
                break;
            }
            case 4: {
                n4 = 1;
                break;
            }
            case 5: {
                n4 = 57;
                break;
            }
            case 6: {
                n4 = 32;
                break;
            }
            case 7: {
                n4 = 23;
                break;
            }
            case 8: {
                n4 = 20;
                break;
            }
            case 9: {
                n4 = 46;
                break;
            }
            case 10: {
                n4 = 50;
                break;
            }
            case 11: {
                n4 = 63;
                break;
            }
            case 12: {
                n4 = 45;
                break;
            }
            case 13: {
                n4 = 17;
                break;
            }
            case 14: {
                n4 = 7;
                break;
            }
            case 15: {
                n4 = 25;
                break;
            }
            case 16: {
                n4 = 3;
                break;
            }
            case 17: {
                n4 = 43;
                break;
            }
            case 18: {
                n4 = 16;
                break;
            }
            case 19: {
                n4 = 30;
                break;
            }
            case 20: {
                n4 = 56;
                break;
            }
            case 21: {
                n4 = 9;
                break;
            }
            case 22: {
                n4 = 34;
                break;
            }
            case 23: {
                n4 = 19;
                break;
            }
            case 24: {
                n4 = 33;
                break;
            }
            case 25: {
                n4 = 2;
                break;
            }
            case 26: {
                n4 = 5;
                break;
            }
            case 27: {
                n4 = 39;
                break;
            }
            case 28: {
                n4 = 53;
                break;
            }
            case 29: {
                n4 = 27;
                break;
            }
            case 30: {
                n4 = 21;
                break;
            }
            case 31: {
                n4 = 24;
                break;
            }
            case 32: {
                n4 = 44;
                break;
            }
            case 33: {
                n4 = 48;
                break;
            }
            case 34: {
                n4 = 49;
                break;
            }
            case 35: {
                n4 = 18;
                break;
            }
            case 36: {
                n4 = 4;
                break;
            }
            case 37: {
                n4 = 6;
                break;
            }
            case 38: {
                n4 = 0;
                break;
            }
            case 39: {
                n4 = 59;
                break;
            }
            case 40: {
                n4 = 13;
                break;
            }
            case 41: {
                n4 = 14;
                break;
            }
            case 42: {
                n4 = 12;
                break;
            }
            case 43: {
                n4 = 10;
                break;
            }
            case 44: {
                n4 = 8;
                break;
            }
            case 45: {
                n4 = 26;
                break;
            }
            case 46: {
                n4 = 41;
                break;
            }
            case 47: {
                n4 = 31;
                break;
            }
            case 48: {
                n4 = 15;
                break;
            }
            case 49: {
                n4 = 51;
                break;
            }
            case 50: {
                n4 = 22;
                break;
            }
            case 51: {
                n4 = 55;
                break;
            }
            case 52: {
                n4 = 54;
                break;
            }
            case 53: {
                n4 = 42;
                break;
            }
            case 54: {
                n4 = 28;
                break;
            }
            case 55: {
                n4 = 35;
                break;
            }
            case 56: {
                n4 = 38;
                break;
            }
            case 57: {
                n4 = 52;
                break;
            }
            case 58: {
                n4 = 29;
                break;
            }
            case 59: {
                n4 = 47;
                break;
            }
            case 60: {
                n4 = 62;
                break;
            }
            case 61: {
                n4 = 36;
                break;
            }
            case 62: {
                n4 = 60;
                break;
            }
            default: {
                n4 = 40;
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
        mr.f[n5] = new String(cArray);
        return n5;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(mr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

