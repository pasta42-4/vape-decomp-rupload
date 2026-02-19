/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Ib;
import a.Na;
import a.O_;
import a.Ul;
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

public class q3
extends v2 {
    private final HK D;
    private final HK z;
    private static final String[] g;
    private static final Map e;
    private final HK a;
    private static final Object[] f;
    private final HK W;
    private final HK R;
    private Ib H;
    private final HK o;
    private static final Integer[] d;
    private final HK y;
    private static final long[] c;
    private static final long b;
    private final HK U;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                q3.b = d8.a(5173857581159922815L, -3665904227235053277L, MethodHandles.lookup().lookupClass()).a(104803268578300L);
                q3.f = new Object[15];
                q3.g = new String[15];
                q3.a();
                q3.e = new HashMap<K, V>(13);
                var0 = q3.b ^ 91645016165453L;
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
                var8_3 = new long[18];
                var5_4 = 0;
                var6_5 = "A'\u00f2\u0003\u00a1\u009dKS\u00c2\u00eb/V\u0085\u000e\u00e5f\u001c\u000e\u00db\u008c\u00fb\u00ad\u00ec\t7\u00bd\u00b4p\u008e\u009e\u009by\u0015q\u00f7\u0080\u00ed\u00a6\u00fb\u0015|m\u0088\u00b1\u009dO\u001f@0\u0018\u00bcG\u00d3\u0084%\u00f2~\u00b6\u00b7\u00e8j\u00b2\u008a/\u0096]J\u00a4\u0011\u00dcG(\u00f2Wv\u00c3V\fFuB\u000e(j%U\u0090#\u00b2\u00c3\b\u00c4\u00d6z:\u008a\u00e5\u00d4aj\u00c7H\u00af\u001bL\u00c6\u008b%\u00ab\u008eI}\u0002#\u00fa}\u000f\u00a3=r\u00e4\u0083\u00b8g$\u00eb\u00e9\u00c4";
                var7_6 = "A'\u00f2\u0003\u00a1\u009dKS\u00c2\u00eb/V\u0085\u000e\u00e5f\u001c\u000e\u00db\u008c\u00fb\u00ad\u00ec\t7\u00bd\u00b4p\u008e\u009e\u009by\u0015q\u00f7\u0080\u00ed\u00a6\u00fb\u0015|m\u0088\u00b1\u009dO\u001f@0\u0018\u00bcG\u00d3\u0084%\u00f2~\u00b6\u00b7\u00e8j\u00b2\u008a/\u0096]J\u00a4\u0011\u00dcG(\u00f2Wv\u00c3V\fFuB\u000e(j%U\u0090#\u00b2\u00c3\b\u00c4\u00d6z:\u008a\u00e5\u00d4aj\u00c7H\u00af\u001bL\u00c6\u008b%\u00ab\u008eI}\u0002#\u00fa}\u000f\u00a3=r\u00e4\u0083\u00b8g$\u00eb\u00e9\u00c4".length();
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
                    var6_5 = "g\u008d\u00ba\u0091\u000fhDo \u008e\u00fb\u00b1\u00d1\u0012\u00aa\u00ff";
                    var7_6 = "g\u008d\u00ba\u0091\u000fhDo \u008e\u00fb\u00b1\u00d1\u0012\u00aa\u00ff".length();
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
        q3.c = var8_3;
        q3.d = new Integer[18];
    }

    private void p(Object object, int n2, int n3, boolean bl2) {
        try {
            if (this.a == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw q3.a(o_2);
        }
        try {
            if (Na.MC_1_21_0.H()) {
                this.a.l(object, n2, n3);
                return;
            }
        }
        catch (O_ o_3) {
            throw q3.a(o_3);
        }
        this.a.l(object, n2, n3, bl2);
    }

    static void e(q3 q32, Object object) {
        q32.f(object);
    }

    private void Z(Object object) {
        try {
            if (this.W == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw q3.a(o_2);
        }
        this.W.V(object);
    }

    private void f(Object object) {
        try {
            if (this.R == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw q3.a(o_2);
        }
        this.R.V(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = q3.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = q3.d(classArray[i10], string, clazz2);
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
            throw new RuntimeException("a/q3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l10, long l11) {
        int n2 = q3.e(l10, l11);
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
                clazz3 = q3.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = q3.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = q3.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        q3.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = q3.f(767961682980192L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = q3.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        q3.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = q3.f(767961682980192L, 0L);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = q3.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = q3.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    static int q(q3 q32, Object object) {
        return q32.G(object);
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x29F1;
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
                throw new RuntimeException("a/q3", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            q3.d[n3] = n4;
        }
        return d[n3];
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    static void S(q3 q32, Object object) {
        q32.r(object);
    }

    private void k(Object object, boolean bl2) {
        try {
            if (this.z == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw q3.a(o_2);
        }
        this.z.l(object, bl2);
    }

    /*
     * Unable to fully structure code
     */
    public q3() {
        block23: {
            block26: {
                block24: {
                    block21: {
                        block22: {
                            var1_1 = q3.b ^ 2687662164229L;
                            v0 = Ul.d();
                            super(eM.c);
                            var3_2 = v0;
                            try {
                                try {
                                    try {
                                        v1 = Na.MC_1_21_4.H();
                                        if (var3_2 == null) break block21;
                                        if (v1 == 0) break block22;
                                    }
                                    catch (O_ v2) {
                                        throw q3.a(v2);
                                    }
                                    this.o = null;
                                    this.y = null;
                                    this.a = null;
                                    this.z = null;
                                    this.U = null;
                                    this.D = null;
                                    this.W = null;
                                    this.R = null;
                                    if (var3_2 != null) break block23;
                                }
                                catch (O_ v3) {
                                    throw q3.a(v3);
                                }
                                ht.I(new String[1]);
                            }
                            catch (O_ v4) {
                                throw q3.a(v4);
                            }
                        }
                        v1 = kX.C();
                    }
                    try {
                        try {
                            v5 = 35;
                            if (var3_2 == null) break block24;
                            if (v1 >= v5) {
                            }
                            ** GOTO lbl71
                        }
                        catch (O_ v6) {
                            throw q3.a(v6);
                        }
                        v1 = kX.C();
                        v5 = 37;
                    }
                    catch (O_ v7) {
                        throw q3.a(v7);
                    }
                }
                try {
                    block25: {
                        try {
                            if (v1 < v5) break block25;
                            this.o = q3.c("z", (Object)this, (Object)eM.h, (Object)q3.c("\u00fa", (int)q3.b("n", (int)14538, (long)(2269453680305186725L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-5291151267930065018L, (long)var1_1);
                            if (var3_2 != null) break block26;
                        }
                        catch (O_ v8) {
                            throw q3.a(v8);
                        }
                    }
                    this.o = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)16337, (long)(2098475026170257595L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                }
                catch (O_ v9) {
                    throw q3.a(v9);
                }
            }
            try {
                this.y = q3.c("z", (Object)this, (Object)eM.FW, (Object)q3.c("\u00fa", (int)q3.b("n", (int)5339, (long)(5947813339235748790L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-5291151267930065018L, (long)var1_1);
                this.a = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)31159, (long)(826345727851882192L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.z = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)30380, (long)(2508637738233129420L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.U = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)15310, (long)(6311687688828527786L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.D = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)29790, (long)(1329112181665426226L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.W = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)24804, (long)(6015366200943050644L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.R = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)7507, (long)(7684131056428220978L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                if (var3_2 != null) break block23;
lbl71:
                // 2 sources

                this.o = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)7731, (long)(2258522181827658065L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)false, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.y = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)15639, (long)(3711563225415197298L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.a = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)15331, (long)(1463196513775494280L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.z = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)11513, (long)(2644922159818093457L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Boolean.TYPE}, (long)-5290673221217506158L, (long)var1_1);
                this.U = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)31071, (long)(2618883380324820526L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.D = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)1896, (long)(6642784708877555723L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.W = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)13833, (long)(735926402421926247L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
                this.R = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)2797, (long)(805232269694309764L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-5290673221217506158L, (long)var1_1);
            }
            catch (O_ v10) {
                throw q3.a(v10);
            }
        }
        try {
            if (Na.MC_1_21_6.Q()) {
                this.H = q3.c("z", (Object)this, (Object)q3.c("\u00fa", (int)q3.b("n", (int)14028, (long)(2037893450913032618L ^ var1_1)), (long)-5290976311423607352L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-5291036100954636891L, (long)var1_1);
            }
        }
        catch (O_ v11) {
            throw q3.a(v11);
        }
    }

    private void r(Object object) {
        try {
            if (this.U == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw q3.a(o_2);
        }
        this.U.V(object);
    }

    private void r(Object object, int n2, int n3) {
        try {
            if (this.y == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw q3.a(o_2);
        }
        this.y.l(object, n2, n3);
    }

    static void a(q3 q32, Object object, int n2) {
        q32.i(object, n2);
    }

    private int G(Object object) {
        return this.H.R(object);
    }

    private void A(Object object, int n2, int n3) {
        try {
            if (this.a == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw q3.a(o_2);
        }
        this.a.l(object, n2, n3);
    }

    static Object B(q3 q32, int n2, int n3, boolean bl2) {
        return q32.p(n2, n3, bl2);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void y(q3 q32, Object object) {
        q32.A(object);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "-8\\\u0003";
        objectArray[1] = "I|q*?QBs`eBIQti,";
        objectArray[2] = Boolean.TYPE;
        q3.g[2] = "java/lang/Boolean";
        objectArray[3] = "w\u0011's;F|\u001e6<VF|\u0003\"";
        objectArray[4] = "o\u001cKLgz\u001a<@Cv5w<@^b ";
        objectArray[5] = "Nx4\u001b";
        objectArray[6] = "}\\\u001d\u001f\u000b\f\b|\u0016\u0010\u001aCe|\u0016\r\u000eV";
        objectArray[7] = "$\bc";
        objectArray[8] = Integer.TYPE;
        q3.g[8] = "java/lang/Integer";
        objectArray[9] = "\u001cQ:,";
        objectArray[10] = "&/n!v2- \u007fn\u0017<&+{4";
        objectArray[11] = "Y'U>foY0Z\u0007DR\u0015qP:n4\u001eu\u0014\u0007:?[-Z~gi\u0000sk=oo\n-\u000f~x3\u0004KW8{ \u001c/\f{b5gwRxz9\u001c*\u000b}3R";
        objectArray[12] = "AWXK%hA@Wr\rUEW[\u001f&1\u0006@\u0007\u0011@'E\u0000[\u001f&,ADfK-i\u0019\n\u001f\u0016{2G;\\\u001e}8\u0019_\u001f\t!6\u007f\u0007Y\n2.\u001b\\\u001a\u0013'UC\u0002\u0019\u000b+.\u001e[\u001cB@";
        objectArray[13] = "\u000b\u001cU\u001d\u0017-\u000b\u000bZ$)\u0010GJP\u0019\u001fvLN\u0014$K}\t\u0016Z]\u0016+RHk\u001e\u001e-X\u0016\u000f]\tqVpUHBjM\u0015\u0006D\u001f`5";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "-7\u001cB.),m\u0011\u001eI'k\fN\u0018.wofMZv}\u0010~J\u001ft!vuN[I";
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'v' || c10 == 'H' || c10 == 'J' || c10 == 'g') {
                field = q3.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'H' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'J' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = q3.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00fa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(long l10, long l11) {
        int n2 = q3.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = q3.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = q3.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = q3.c(clazz3, string2, clazz2)) != null) {
                    q3.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = q3.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        q3.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = q3.f(767961682980192L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = q3.e(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                q3.f[n2] = clazz = Class.forName(g[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static void n(q3 q32, Object object, int n2, int n3) {
        q32.A(object, n2, n3);
    }

    static void x(q3 q32, Object object, int n2, int n3) {
        q32.r(object, n2, n3);
    }

    static void Q(q3 q32, Object object, boolean bl2) {
        q32.k(object, bl2);
    }

    private void i(Object object, int n2) {
        this.H.t(object, n2);
    }

    private void A(Object object) {
        try {
            if (this.D == null) {
                return;
            }
        }
        catch (O_ o_2) {
            throw q3.a(o_2);
        }
        this.D.V(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = q3.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = q3.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static void O(q3 q32, Object object) {
        q32.Z(object);
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
                n4 = 33;
                break;
            }
            case 2: {
                n4 = 57;
                break;
            }
            case 3: {
                n4 = 58;
                break;
            }
            case 4: {
                n4 = 62;
                break;
            }
            case 5: {
                n4 = 63;
                break;
            }
            case 6: {
                n4 = 12;
                break;
            }
            case 7: {
                n4 = 17;
                break;
            }
            case 8: {
                n4 = 44;
                break;
            }
            case 9: {
                n4 = 13;
                break;
            }
            case 10: {
                n4 = 29;
                break;
            }
            case 11: {
                n4 = 52;
                break;
            }
            case 12: {
                n4 = 6;
                break;
            }
            case 13: {
                n4 = 37;
                break;
            }
            case 14: {
                n4 = 49;
                break;
            }
            case 15: {
                n4 = 25;
                break;
            }
            case 16: {
                n4 = 1;
                break;
            }
            case 17: {
                n4 = 55;
                break;
            }
            case 18: {
                n4 = 36;
                break;
            }
            case 19: {
                n4 = 9;
                break;
            }
            case 20: {
                n4 = 54;
                break;
            }
            case 21: {
                n4 = 42;
                break;
            }
            case 22: {
                n4 = 27;
                break;
            }
            case 23: {
                n4 = 19;
                break;
            }
            case 24: {
                n4 = 32;
                break;
            }
            case 25: {
                n4 = 5;
                break;
            }
            case 26: {
                n4 = 35;
                break;
            }
            case 27: {
                n4 = 23;
                break;
            }
            case 28: {
                n4 = 59;
                break;
            }
            case 29: {
                n4 = 28;
                break;
            }
            case 30: {
                n4 = 7;
                break;
            }
            case 31: {
                n4 = 4;
                break;
            }
            case 32: {
                n4 = 26;
                break;
            }
            case 33: {
                n4 = 3;
                break;
            }
            case 34: {
                n4 = 47;
                break;
            }
            case 35: {
                n4 = 18;
                break;
            }
            case 36: {
                n4 = 10;
                break;
            }
            case 37: {
                n4 = 60;
                break;
            }
            case 38: {
                n4 = 16;
                break;
            }
            case 39: {
                n4 = 53;
                break;
            }
            case 40: {
                n4 = 51;
                break;
            }
            case 41: {
                n4 = 8;
                break;
            }
            case 42: {
                n4 = 30;
                break;
            }
            case 43: {
                n4 = 21;
                break;
            }
            case 44: {
                n4 = 22;
                break;
            }
            case 45: {
                n4 = 48;
                break;
            }
            case 46: {
                n4 = 2;
                break;
            }
            case 47: {
                n4 = 20;
                break;
            }
            case 48: {
                n4 = 41;
                break;
            }
            case 49: {
                n4 = 45;
                break;
            }
            case 50: {
                n4 = 61;
                break;
            }
            case 51: {
                n4 = 14;
                break;
            }
            case 52: {
                n4 = 24;
                break;
            }
            case 53: {
                n4 = 11;
                break;
            }
            case 54: {
                n4 = 50;
                break;
            }
            case 55: {
                n4 = 38;
                break;
            }
            case 56: {
                n4 = 0;
                break;
            }
            case 57: {
                n4 = 15;
                break;
            }
            case 58: {
                n4 = 39;
                break;
            }
            case 59: {
                n4 = 40;
                break;
            }
            case 60: {
                n4 = 56;
                break;
            }
            case 61: {
                n4 = 43;
                break;
            }
            case 62: {
                n4 = 34;
                break;
            }
            default: {
                n4 = 46;
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
        q3.g[n5] = new String(cArray);
        return n5;
    }

    static void v(q3 q32, Object object, int n2, int n3, boolean bl2) {
        q32.p(object, n2, n3, bl2);
    }

    private Object p(int n2, int n3, boolean bl2) {
        try {
            if (this.o == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw q3.a(o_2);
        }
        try {
            if (kX.C() >= 37) {
                return this.o.A(n2, n3);
            }
        }
        catch (O_ o_3) {
            throw q3.a(o_3);
        }
        try {
            if (kX.C() >= 35) {
                return this.o.A(n2, n3, bl2, false);
            }
        }
        catch (O_ o_4) {
            throw q3.a(o_4);
        }
        return this.o.A(n2, n3, bl2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(q3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(q3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

