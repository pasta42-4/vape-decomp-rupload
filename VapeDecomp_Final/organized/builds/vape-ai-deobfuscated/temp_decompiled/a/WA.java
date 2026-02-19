/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.B9;
import a.Cb;
import a.EP;
import a.F8;
import a.O_;
import a.Od;
import a.YK;
import a.a;
import a.bE;
import a.ba;
import a.d8;
import a.ht;
import a.ix;
import a.jr;
import a.n;
import a.rX;
import a.wk;
import a.y2;
import a.yE;
import a.yX;
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

public class wa
extends wk {
    private boolean ac;
    private boolean aK;
    private final yX a9;
    private static final Map vb;
    private final y2<jr> ap;
    private static final long[] lb;
    private static final long fb;
    private static final Integer[] ub;
    private final Od aZ;
    private static ht[] aP;
    private static final Object[] wb;
    private static final String[] Hb;

    @Override
    public void i() {
        boolean bl2;
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            d5 = this.G();
            d4 = this.W();
            d3 = this.Q().w();
            d2 = this.W() ? 18.0 : 109.0;
        }
        catch (O_ o_2) {
            throw wa.c(o_2);
        }
        try {
            color = this.l();
            bl2 = this.Q() != null;
        }
        catch (O_ o_3) {
            throw wa.c(o_3);
        }
        F8.o(d5, d4, d3, d2, color, bl2, 2.0f, 1.0f);
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = wa.f(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00a4' || c10 == '\u00a2' || c10 == 'E' || c10 == '\u00d4') {
                field = wa.w(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00a2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wa.x(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public yX q() {
        return this.a9;
    }

    public wa() {
        long l10 = fb ^ 0x131BDA181CD4L;
        super(a.cs((int)wa.e("a", (int)32129, (long)(0x1D853184E0BD7469L ^ l10))), a.cs((int)wa.e("a", (int)23407, (long)(0x545DC291DC27D283L ^ l10))));
        this.ap = new y2(YK.C.q().t());
        this.ac = false;
        this.aK = false;
        n n2 = this.d();
        n2.o(false);
        n2.y(false);
        n2.m(false);
        n2.i(false);
        n2.v(false);
        n2.f((String)((Object)wa.k("\u00c8", (int)wa.e("a", (int)31440, (long)(0x1F7D682A5D41F339L ^ l10)), (long)-7077659571047301563L, (long)l10)));
        this.i(false);
        ba ba2 = new ba((String)((Object)wa.k("\u00c8", (int)wa.e("a", (int)4715, (long)(0x1A6ACC9A5F1B86L ^ l10)), (long)-7077659571047301563L, (long)l10)), YK.C.q().m(), wa.M.n);
        ba2.g((String)((Object)wa.k("\u00c8", (int)wa.e("a", (int)14521, (long)(0x3E153DBEBEAAB156L ^ l10)), (long)-7077659571047301563L, (long)l10)));
        ba2.I().n(20);
        this.aZ = a.Od.e;
        yE yE2 = new yE(this.aZ.d());
        yE yE3 = new yE(YK.C.q().c());
        yE3.l(new ix(this));
        yE yE4 = new yE(this.aZ.V());
        yE3.T(110.0);
        yE2.T(110.0);
        yE4.T(110.0);
        this.ap.T(110.0);
        ba2.T(110.0);
        this.Q().T(110.0);
        this.J(ba2, this.ap, yE3, yE2, yE4);
        this.n(new bE(1.0, 4.0), new Object[0]);
        this.a9 = new yX();
        this.o(this.a9);
    }

    private static Method l(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = wa.k(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = wa.l(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static ht[] I() {
        return aP;
    }

    private static void X() {
        Object[] objectArray = wb;
        wb[0] = "\u0001yv";
        objectArray[1] = Integer.TYPE;
        wa.Hb[1] = "java/lang/Integer";
        objectArray[2] = "*':>6C!(+qK[2/\"8";
        objectArray[3] = "7YK15g<VZ~Ti7]^$";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u000b 2.@\u0014Tq4\u0014E\u0011m6\"v@S\nr%f.S\u0014w1u\u0012\u0016U,d\u0014";
    }

    @Override
    public void d() {
        boolean bl2;
        block29: {
            block30: {
                boolean bl3;
                block32: {
                    block31: {
                        block28: {
                            boolean bl4;
                            block27: {
                                block26: {
                                    boolean bl5;
                                    block25: {
                                        block24: {
                                            boolean bl6;
                                            B9 b92;
                                            block23: {
                                                block22: {
                                                    b92 = YK.C.q().m();
                                                    try {
                                                        try {
                                                            if (!EP.X().r() || !Ao.K.k()) break block22;
                                                        }
                                                        catch (O_ o_2) {
                                                            throw wa.c(o_2);
                                                        }
                                                        bl6 = true;
                                                        break block23;
                                                    }
                                                    catch (O_ o_3) {
                                                        throw wa.c(o_3);
                                                    }
                                                }
                                                bl6 = false;
                                            }
                                            boolean bl7 = bl6;
                                            try {
                                                try {
                                                    try {
                                                        if (bl7 || Ao.d instanceof Cb) break block24;
                                                    }
                                                    catch (O_ o_4) {
                                                        throw wa.c(o_4);
                                                    }
                                                    if (!this.i(b92)) break block24;
                                                }
                                                catch (O_ o_5) {
                                                    throw wa.c(o_5);
                                                }
                                                bl5 = true;
                                                break block25;
                                            }
                                            catch (O_ o_6) {
                                                throw wa.c(o_6);
                                            }
                                        }
                                        bl5 = false;
                                    }
                                    bl2 = bl5;
                                    try {
                                        try {
                                            if (this.ap.y() != null && !this.ap.y().equals(YK.C.q().b())) break block26;
                                        }
                                        catch (O_ o_7) {
                                            throw wa.c(o_7);
                                        }
                                        bl4 = true;
                                        break block27;
                                    }
                                    catch (O_ o_8) {
                                        throw wa.c(o_8);
                                    }
                                }
                                bl4 = false;
                            }
                            boolean bl8 = bl4;
                            try {
                                if (!bl8) break block28;
                                this.q().W(bl2);
                                break block29;
                            }
                            catch (O_ o_9) {
                                throw wa.c(o_9);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (!bl2 || this.aK) break block30;
                                }
                                catch (O_ o_10) {
                                    throw wa.c(o_10);
                                }
                                wa wa2 = this;
                                if (this.ac) break block31;
                            }
                            catch (O_ o_11) {
                                throw wa.c(o_11);
                            }
                            bl3 = true;
                            break block32;
                        }
                        catch (O_ o_12) {
                            throw wa.c(o_12);
                        }
                    }
                    bl3 = false;
                }
                wa2.ac = bl3;
            }
            this.q().W(this.ac);
        }
        this.aK = bl2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                wa.fb = d8.a(7475564612037412917L, 2367582645594801190L, MethodHandles.lookup().lookupClass()).a(45500358861840L);
                wa.wb = new Object[5];
                wa.Hb = new String[5];
                wa.X();
                wa.vb = new HashMap<K, V>(13);
                var0 = wa.fb ^ 64174027611355L;
                wa.P(new ht[3]);
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
                var6_5 = "\u007f\u0094\u00fd\u0013=\u00a6\u00a1\u00d9\b0\t0s}E/\u001e\u00d0\u00b0\u0095F\u00dc}P{\u00d2\u0005#B5\u00e2n";
                var7_6 = "\u007f\u0094\u00fd\u0013=\u00a6\u00a1\u00d9\b0\t0s}E/\u001e\u00d0\u00b0\u0095F\u00dc}P{\u00d2\u0005#B5\u00e2n".length();
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
                    var6_5 = "\u0080\u009d\u008a&\u00fb\u00dd\u00ac|:\u00dc#g\u00d4\u00ffE\u00c7";
                    var7_6 = "\u0080\u009d\u008a&\u00fb\u00dd\u00ac|:\u00dc#g\u00d4\u00ffE\u00c7".length();
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
        wa.lb = var8_3;
        wa.ub = new Integer[6];
    }

    static yX o(wa wa2) {
        return wa2.a9;
    }

    public static void P(ht[] htArray) {
        aP = htArray;
    }

    private static int u(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (Hb[n5] != null) {
            return n5;
        }
        Object object = wb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 9;
                break;
            }
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 37;
                break;
            }
            case 3: {
                n4 = 47;
                break;
            }
            case 4: {
                n4 = 57;
                break;
            }
            case 5: {
                n4 = 22;
                break;
            }
            case 6: {
                n4 = 24;
                break;
            }
            case 7: {
                n4 = 33;
                break;
            }
            case 8: {
                n4 = 49;
                break;
            }
            case 9: {
                n4 = 10;
                break;
            }
            case 10: {
                n4 = 63;
                break;
            }
            case 11: {
                n4 = 60;
                break;
            }
            case 12: {
                n4 = 25;
                break;
            }
            case 13: {
                n4 = 43;
                break;
            }
            case 14: {
                n4 = 23;
                break;
            }
            case 15: {
                n4 = 8;
                break;
            }
            case 16: {
                n4 = 13;
                break;
            }
            case 17: {
                n4 = 18;
                break;
            }
            case 18: {
                n4 = 56;
                break;
            }
            case 19: {
                n4 = 2;
                break;
            }
            case 20: {
                n4 = 26;
                break;
            }
            case 21: {
                n4 = 34;
                break;
            }
            case 22: {
                n4 = 62;
                break;
            }
            case 23: {
                n4 = 54;
                break;
            }
            case 24: {
                n4 = 51;
                break;
            }
            case 25: {
                n4 = 35;
                break;
            }
            case 26: {
                n4 = 38;
                break;
            }
            case 27: {
                n4 = 41;
                break;
            }
            case 28: {
                n4 = 7;
                break;
            }
            case 29: {
                n4 = 46;
                break;
            }
            case 30: {
                n4 = 40;
                break;
            }
            case 31: {
                n4 = 16;
                break;
            }
            case 32: {
                n4 = 55;
                break;
            }
            case 33: {
                n4 = 15;
                break;
            }
            case 34: {
                n4 = 28;
                break;
            }
            case 35: {
                n4 = 32;
                break;
            }
            case 36: {
                n4 = 44;
                break;
            }
            case 37: {
                n4 = 29;
                break;
            }
            case 38: {
                n4 = 50;
                break;
            }
            case 39: {
                n4 = 48;
                break;
            }
            case 40: {
                n4 = 27;
                break;
            }
            case 41: {
                n4 = 5;
                break;
            }
            case 42: {
                n4 = 4;
                break;
            }
            case 43: {
                n4 = 59;
                break;
            }
            case 44: {
                n4 = 20;
                break;
            }
            case 45: {
                n4 = 12;
                break;
            }
            case 46: {
                n4 = 45;
                break;
            }
            case 47: {
                n4 = 21;
                break;
            }
            case 48: {
                n4 = 17;
                break;
            }
            case 49: {
                n4 = 19;
                break;
            }
            case 50: {
                n4 = 3;
                break;
            }
            case 51: {
                n4 = 14;
                break;
            }
            case 52: {
                n4 = 58;
                break;
            }
            case 53: {
                n4 = 36;
                break;
            }
            case 54: {
                n4 = 53;
                break;
            }
            case 55: {
                n4 = 0;
                break;
            }
            case 56: {
                n4 = 11;
                break;
            }
            case 57: {
                n4 = 52;
                break;
            }
            case 58: {
                n4 = 30;
                break;
            }
            case 59: {
                n4 = 61;
                break;
            }
            case 60: {
                n4 = 42;
                break;
            }
            case 61: {
                n4 = 39;
                break;
            }
            case 62: {
                n4 = 6;
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
        wa.Hb[n5] = new String(cArray);
        return n5;
    }

    @Override
    public String A() {
        long l10 = fb ^ 0x21636A87C283L;
        return wa.k("\u00c8", (int)wa.e("a", (int)8061, (long)(0x7A1EE15411C148C4L ^ l10)), (long)4868435616578871314L, (long)l10);
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method k(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Field w(long l10, long l11) {
        int n2 = wa.u(l10, l11);
        Object object = wb[n2];
        if (object instanceof String) {
            String string = Hb[n2];
            int n3 = string.indexOf(8);
            Class clazz = wa.v(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = wa.v(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wa.k(clazz3, string2, clazz2)) != null) {
                    wa.wb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = wa.l(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        wa.wb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wa.v(259336223562921L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int e(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x142A;
        if (ub[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = lb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])vb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    vb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wa", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wa.ub[n3] = n4;
        }
        return ub[n3];
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = wa.e(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static O_ c(O_ o_2) {
        return o_2;
    }

    private static CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method x(long l10, long l11) {
        int n2 = wa.u(l10, l11);
        Object object = wb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = Hb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = wa.v(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = wa.v(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wa.k(clazz, string, clazz2, n3, classArray2)) != null) {
                        wa.wb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wa.v(259336223562921L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = wa.l(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        wa.wb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wa.v(259336223562921L, 0L);
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

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = wa.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = wa.l(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class v(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = wa.u(l10, l11);
            object = wb[n2];
            try {
                if (!(object instanceof String)) break block2;
                wa.wb[n2] = clazz = Class.forName(Hb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private boolean i(B9 b92) {
        boolean bl2;
        try {
            if (b92.Z().isEmpty()) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw wa.c(o_2);
        }
        int n2 = 0;
        for (int n3 : b92.Z()) {
            try {
                if (!rX.X(n3)) continue;
                ++n2;
            }
            catch (O_ o_3) {
                throw wa.c(o_3);
            }
        }
        try {
            bl2 = n2 == b92.Z().size();
        }
        catch (O_ o_4) {
            throw wa.c(o_4);
        }
        return bl2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wa.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(wa.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

