/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.F9;
import a.O_;
import a.Sz;
import a.X_;
import a.ZU;
import a.b8;
import a.bS;
import a.d8;
import a.hb;
import a.hs;
import a.ht;
import a.jk;
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

public class b9
extends ht {
    private b8 V;
    private b8 n;
    private static final Object[] db;
    private static final String[] eb;
    private final hb v;
    private b8 B;
    private jk D;
    private static final long[] E;
    private hs Y;
    private static final long b;
    private static final Integer[] ab;
    private boolean L;
    private static ht[] F;
    private static final Map bb;
    private bS R;

    @Override
    public void G() {
        block5: {
            block4: {
                CallSite callSite;
                hs hs2;
                long l10 = b ^ 0x73CAB72C2EC0L;
                try {
                    this.S();
                    this.R.b(this.G());
                    this.R.M(this.W());
                    this.Y.b(this.G() + this.R.j() + 5.0);
                    this.Y.M(this.W() + 2.5);
                    this.Y.w(this.R.b() / 2.0);
                    hs2 = this.Y;
                    callSite = this.L ? b9.c("\u00d9", (int)b9.b("c", (int)11892, (long)(0x5B0E81671CE0AD43L ^ l10)), (long)8938370551943642139L, (long)l10) : b9.c("\u00d9", (int)b9.b("c", (int)8533, (long)(0x531DA06DACA2260L ^ l10)), (long)8938370551943642139L, (long)l10);
                }
                catch (O_ o_2) {
                    throw b9.a(o_2);
                }
                try {
                    hs2.u((String)((Object)callSite));
                    X_.B(this.D.L(), (float)(this.G() + this.w() - 5.0 - 6.0), (float)this.W() + 5.0f, (String)((Object)b9.c("\u00d9", (int)b9.b("c", (int)13432, (long)(0x62E111D973FFB74EL ^ l10)), (long)8938370551943642139L, (long)l10)), 6.0f, 6.0f, false);
                    this.v.b(this.G() + this.w() - 10.0 - 5.0 - 6.0);
                    this.v.M(this.W() + 5.0);
                    if (!this.L) break block4;
                    this.V.N(false);
                    this.B.N(false);
                    this.n.N(false);
                    break block5;
                }
                catch (O_ o_3) {
                    throw b9.a(o_3);
                }
            }
            float f10 = 7.0f;
            double d2 = this.R.B().K() - (double)(f10 / 2.0f);
            double d3 = this.W() + this.R.b() + 2.5 + 3.0;
            double d4 = d2 + (double)f10;
            double d5 = d3 - 3.0;
            double d6 = d2 + (double)(f10 * 2.0f);
            double d7 = d3;
            F8.m(d2, d3, d4, d5, d6, d7, b9.M.a);
            this.V.N(true);
            this.V.b(this.G());
            this.V.M(this.W() + 20.0 + 5.0);
            this.B.N(true);
            this.B.b(this.G());
            this.B.M(this.W() + 40.0 + 10.0);
            this.n.N(true);
            this.n.b(this.G());
            this.n.M(this.W() + 60.0 + 15.0);
        }
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7F3C;
        if (ab[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = E[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])bb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    bb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/b9", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b9.ab[n3] = n4;
        }
        return ab[n3];
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void g() {
    }

    public b9(jk jk2) {
        long l10 = b ^ 0x4CF5306EBF35L;
        this.L = true;
        this.Y = new hs((String)((Object)b9.c("\u00d9", (int)b9.b("c", (int)2349, (long)(0x38195F1BAF9B9BECL ^ l10)), (long)-1297520927358374418L, (long)l10)), 0.3);
        this.D = jk2;
        this.L(jk2);
        this.R = new bS((String)((Object)b9.c("\u00d9", (int)b9.b("c", (int)1061, (long)(0x7B1347BB1F0396E2L ^ l10)), (long)-1297520927358374418L, (long)l10)), jk2, new Color[]{new Color(250, 50, 56), new Color(242, 99, 33), new Color(252, 179, 22), b9.M.Y, new Color(47, 122, 229), new Color(126, 84, 217), new Color(232, 96, 152)});
        this.V = new b8(this.R);
        this.B = new b8(F9.SATURATION, jk2);
        this.n = new b8(F9.VIBRANCE, jk2);
        this.v = new hb(jk2);
        this.R.Q(this.l());
        this.V.Q(b9.M.a);
        this.B.Q(b9.M.a);
        this.n.Q(b9.M.a);
        this.R.i(null);
        this.B.i(null);
        this.n.i(null);
        this.Y.N(new ZU(this));
        this.o(this.R, this.Y, this.v, this.V, this.B, this.n);
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (eb[n5] != null) {
            return n5;
        }
        Object object = db[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 25;
                break;
            }
            case 1: {
                n4 = 11;
                break;
            }
            case 2: {
                n4 = 24;
                break;
            }
            case 3: {
                n4 = 44;
                break;
            }
            case 4: {
                n4 = 42;
                break;
            }
            case 5: {
                n4 = 35;
                break;
            }
            case 6: {
                n4 = 8;
                break;
            }
            case 7: {
                n4 = 27;
                break;
            }
            case 8: {
                n4 = 23;
                break;
            }
            case 9: {
                n4 = 60;
                break;
            }
            case 10: {
                n4 = 55;
                break;
            }
            case 11: {
                n4 = 22;
                break;
            }
            case 12: {
                n4 = 10;
                break;
            }
            case 13: {
                n4 = 17;
                break;
            }
            case 14: {
                n4 = 54;
                break;
            }
            case 15: {
                n4 = 14;
                break;
            }
            case 16: {
                n4 = 43;
                break;
            }
            case 17: {
                n4 = 59;
                break;
            }
            case 18: {
                n4 = 40;
                break;
            }
            case 19: {
                n4 = 19;
                break;
            }
            case 20: {
                n4 = 15;
                break;
            }
            case 21: {
                n4 = 32;
                break;
            }
            case 22: {
                n4 = 16;
                break;
            }
            case 23: {
                n4 = 34;
                break;
            }
            case 24: {
                n4 = 37;
                break;
            }
            case 25: {
                n4 = 18;
                break;
            }
            case 26: {
                n4 = 49;
                break;
            }
            case 27: {
                n4 = 30;
                break;
            }
            case 28: {
                n4 = 2;
                break;
            }
            case 29: {
                n4 = 58;
                break;
            }
            case 30: {
                n4 = 0;
                break;
            }
            case 31: {
                n4 = 3;
                break;
            }
            case 32: {
                n4 = 29;
                break;
            }
            case 33: {
                n4 = 53;
                break;
            }
            case 34: {
                n4 = 13;
                break;
            }
            case 35: {
                n4 = 63;
                break;
            }
            case 36: {
                n4 = 41;
                break;
            }
            case 37: {
                n4 = 39;
                break;
            }
            case 38: {
                n4 = 6;
                break;
            }
            case 39: {
                n4 = 51;
                break;
            }
            case 40: {
                n4 = 26;
                break;
            }
            case 41: {
                n4 = 47;
                break;
            }
            case 42: {
                n4 = 33;
                break;
            }
            case 43: {
                n4 = 20;
                break;
            }
            case 44: {
                n4 = 21;
                break;
            }
            case 45: {
                n4 = 46;
                break;
            }
            case 46: {
                n4 = 52;
                break;
            }
            case 47: {
                n4 = 1;
                break;
            }
            case 48: {
                n4 = 48;
                break;
            }
            case 49: {
                n4 = 7;
                break;
            }
            case 50: {
                n4 = 50;
                break;
            }
            case 51: {
                n4 = 31;
                break;
            }
            case 52: {
                n4 = 62;
                break;
            }
            case 53: {
                n4 = 45;
                break;
            }
            case 54: {
                n4 = 9;
                break;
            }
            case 55: {
                n4 = 56;
                break;
            }
            case 56: {
                n4 = 5;
                break;
            }
            case 57: {
                n4 = 38;
                break;
            }
            case 58: {
                n4 = 12;
                break;
            }
            case 59: {
                n4 = 28;
                break;
            }
            case 60: {
                n4 = 36;
                break;
            }
            case 61: {
                n4 = 4;
                break;
            }
            case 62: {
                n4 = 57;
                break;
            }
            default: {
                n4 = 61;
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
        b9.eb[n5] = new String(cArray);
        return n5;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = b9.e(l10, l11);
            object = db[n2];
            try {
                if (!(object instanceof String)) break block2;
                b9.db[n2] = clazz = Class.forName(eb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void d() {
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = b9.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void N(boolean bl2) {
        super.N(bl2);
        this.R.h(false);
        this.R.Z();
    }

    @Override
    public double e() {
        return 110.0;
    }

    static boolean C(b9 b92) {
        return b92.L;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c6' || c10 == '\u00de' || c10 == 'f' || c10 == '\u00ce') {
                field = b9.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c6' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00de' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b9.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'O' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = b9.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field g(long l10, long l11) {
        int n2 = b9.e(l10, l11);
        Object object = db[n2];
        if (object instanceof String) {
            String string = eb[n2];
            int n3 = string.indexOf(8);
            Class clazz = b9.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = b9.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b9.c(clazz3, string2, clazz2)) != null) {
                    b9.db[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = b9.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        b9.db[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b9.f(226150172741016L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void A(ht[] htArray) {
        F = htArray;
    }

    public void q() {
        this.R.B();
    }

    @Override
    public void Z(Sz sz2) {
    }

    @Override
    public double z() {
        double d2;
        try {
            d2 = this.L ? 25.0 : 100.0;
        }
        catch (O_ o_2) {
            throw b9.a(o_2);
        }
        return d2;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = b9.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = b9.d(classArray2[i10], string, clazz2, n2, classArray);
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
                b9.b = d8.a(-6996248337915687595L, -2710809133850312479L, MethodHandles.lookup().lookupClass()).a(105858498757739L);
                b9.db = new Object[5];
                b9.eb = new String[5];
                b9.a();
                b9.bb = new HashMap<K, V>(13);
                var0 = b9.b ^ 138248271089908L;
                b9.A(null);
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00bfLws\u00ba\u00ad\u00aa\u0093\u00ec\u0019wv\u00bdX\u00bc*a7y\u00ef\u00d4G\u00f9\u00e9";
                var7_6 = "\u00bfLws\u00ba\u00ad\u00aa\u0093\u00ec\u0019wv\u00bdX\u00bc*a7y\u00ef\u00d4G\u00f9\u00e9".length();
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
                    var6_5 = "\u00cc\u0097\u00fbE=\n\u0015\u00fa\u0096\u00c6m#\u001f\u00c30\u001c";
                    var7_6 = "\u00cc\u0097\u00fbE=\n\u0015\u00fa\u0096\u00c6m#\u001f\u00c30\u001c".length();
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
        b9.E = var8_3;
        b9.ab = new Integer[5];
    }

    static boolean s(b9 b92, boolean bl2) {
        b92.L = bl2;
        return b92.L;
    }

    private static Method h(long l10, long l11) {
        int n2 = b9.e(l10, l11);
        Object object = db[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = eb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = b9.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = b9.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b9.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        b9.db[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b9.f(226150172741016L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = b9.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        b9.db[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b9.f(226150172741016L, 0L);
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

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = b9.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = b9.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = db;
        db[0] = ";\bf";
        objectArray[1] = Integer.TYPE;
        b9.eb[1] = "java/lang/Integer";
        objectArray[2] = "\u000e\u001a\t\u0007R*\u0005\u0015\u0018H/2\u0016\u0012\u0011\u0001";
        objectArray[3] = "|-\u0010[R\u0015w\"\u0001\u00143\u001b|)\u0005N";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0004*/j\r\u000fX #\u0011\t\b:zt \u000f\u001d\u0005,t,\u0018s\u0000{vz\u0005M\\,%xb";
    }

    public static ht[] o() {
        return F;
    }

    @Override
    public void U() {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(b9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

