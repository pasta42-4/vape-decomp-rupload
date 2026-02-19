/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.KP;
import a.Ne;
import a.Nu;
import a.O_;
import a.RL;
import a.RS;
import a.WB;
import a.X_;
import a.ZE;
import a._r;
import a.d8;
import a.e;
import a.ej;
import a.kd;
import a.z1;
import a.zZ;
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

public class z6 {
    public static kd J;
    private static final String[] f;
    private static String[] A;
    public static kd O;
    private static final long a;
    private static final Integer[] c;
    public static WB p;
    private static final Object[] e;
    public static ej i;
    public static RL D;
    public static _r N;
    private static final long[] b;
    private static final Map d;

    public static void J(float f10, float f11, float f12, float f13, Color color, float f14, Color color2) {
        if (color2 != null) {
            float f15 = f10 + (f12 + f13) / 2.0f - f14 / 2.0f;
            KP.x().p(new e().Q(f15, f11, f14, f12, color2));
        }
        e e10 = new e().W(f10, f11, f12, f13, color);
        KP.x().p(e10);
    }

    public static String[] M() {
        return A;
    }

    public static void j(float f10, float f11, float f12, float f13, float f14, float f15, Color color) {
        e e10 = new e(3).r(f10, f11, 0.0f, f12, f13, 0.0f, f14, f15, 0.0f, color);
        KP.x().p(e10);
    }

    public static void t(float f10, float f11, float f12, float f13, float f14, float f15, Color color) {
        e e10 = new e().K(f10, f11, f12, f13, f14, f15, color);
        KP.x().p(e10);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = z6.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void H(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Color color) {
        e e10 = new e(2).f(f10, f11, f12, f13, f14, f15, f16, color);
        KP.x().p(e10);
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = z6.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                z6.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void X(float f10, float f11, float f12, float f13, Color color, boolean bl2, float f14, float f15, float f16, Color color2, int n2) {
        try {
            if (f14 == 0.0f) {
                z6.O(f10, f11, f12, f13, color);
                return;
            }
        }
        catch (O_ o_2) {
            throw z6.a(o_2);
        }
        try {
            if (bl2) {
                KP.x().p(new e().K(f10, f11 + 0.5f, f12, f13 - 1.5f, f16, f14, color2));
            }
        }
        catch (O_ o_3) {
            throw z6.a(o_3);
        }
        e e10 = new e().H(f10, f11, f12, f13, color, f14, f15, n2);
        KP.x().p(e10);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = z6.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    public static void A(float f10, float f11, float f12, float f13, float f14, float f15, int n2, Color color) {
        e e10 = new e().f(f10, f11, f12, f13, f14, f15, n2, color);
        KP.x().p(e10);
    }

    public static void g(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, Color color) {
        e e10 = new e().H(z1.LINES_LOOP).b(f10, f11, 0.0f, f12, f13, 0.0f, f14, f15, 0.0f, f16, f17, 0.0f, color);
        KP.x().p(e10);
    }

    public static void G(double d2, double d3, double d4, double d5, double d6, double d7, double d9, double d10, double d11, double d12, double d13, double d14, Color color) {
        z6.u((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d9, (float)d10, (float)d11, (float)d12, (float)d13, (float)d14, color);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = z6.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = z6.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void o(float f10, float f11, float f12, float f13, Color color, float f14, float f15, float f16) {
        e e10 = new e().W(f10, f11, f12, f13, color, f14, f15, f16);
        KP.x().p(e10);
    }

    public static void b(double d2, double d3, double d4, double d5, double d6, double d7, float f10, Color color) {
        z6.H((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, f10, color);
    }

    private static Field c(long l10, long l11) {
        int n2 = z6.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = z6.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = z6.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = z6.a(clazz3, string2, clazz2)) != null) {
                    z6.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = z6.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        z6.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = z6.b(249729136847327L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void P(double d2, double d3, double d4, double d5, double d6, double d7, double d9, double d10, Color color) {
        z6.g((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d9, (float)d10, color);
    }

    public static void O(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, Color color, Color color2) {
        e e10 = new e().k(f10, f11, 0.0f, f12, f13, 0.0f, f14, f15, 0.0f, f16, f17, 0.0f, color, color2);
        KP.x().p(e10);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static void O(float f10, float f11, float f12, float f13, Color color) {
        e e10 = new e().j(f10, f11, f12, f13, color);
        KP.x().p(e10);
    }

    public static void g(float f10, float f11, zZ zZ2, WB wB2, Color color, float f12) {
        p = wB2;
        e e10 = new e().S(f10, f11, zZ2, color, f12);
        KP.x().p(e10);
    }

    private static int a(long l10, long l11) {
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
                n4 = 3;
                break;
            }
            case 1: {
                n4 = 12;
                break;
            }
            case 2: {
                n4 = 34;
                break;
            }
            case 3: {
                n4 = 32;
                break;
            }
            case 4: {
                n4 = 35;
                break;
            }
            case 5: {
                n4 = 6;
                break;
            }
            case 6: {
                n4 = 56;
                break;
            }
            case 7: {
                n4 = 8;
                break;
            }
            case 8: {
                n4 = 27;
                break;
            }
            case 9: {
                n4 = 37;
                break;
            }
            case 10: {
                n4 = 41;
                break;
            }
            case 11: {
                n4 = 29;
                break;
            }
            case 12: {
                n4 = 25;
                break;
            }
            case 13: {
                n4 = 45;
                break;
            }
            case 14: {
                n4 = 57;
                break;
            }
            case 15: {
                n4 = 39;
                break;
            }
            case 16: {
                n4 = 7;
                break;
            }
            case 17: {
                n4 = 20;
                break;
            }
            case 18: {
                n4 = 50;
                break;
            }
            case 19: {
                n4 = 11;
                break;
            }
            case 20: {
                n4 = 28;
                break;
            }
            case 21: {
                n4 = 52;
                break;
            }
            case 22: {
                n4 = 15;
                break;
            }
            case 23: {
                n4 = 16;
                break;
            }
            case 24: {
                n4 = 1;
                break;
            }
            case 25: {
                n4 = 30;
                break;
            }
            case 26: {
                n4 = 23;
                break;
            }
            case 27: {
                n4 = 0;
                break;
            }
            case 28: {
                n4 = 55;
                break;
            }
            case 29: {
                n4 = 54;
                break;
            }
            case 30: {
                n4 = 48;
                break;
            }
            case 31: {
                n4 = 2;
                break;
            }
            case 32: {
                n4 = 18;
                break;
            }
            case 33: {
                n4 = 49;
                break;
            }
            case 34: {
                n4 = 61;
                break;
            }
            case 35: {
                n4 = 47;
                break;
            }
            case 36: {
                n4 = 33;
                break;
            }
            case 37: {
                n4 = 22;
                break;
            }
            case 38: {
                n4 = 58;
                break;
            }
            case 39: {
                n4 = 62;
                break;
            }
            case 40: {
                n4 = 51;
                break;
            }
            case 41: {
                n4 = 19;
                break;
            }
            case 42: {
                n4 = 60;
                break;
            }
            case 43: {
                n4 = 38;
                break;
            }
            case 44: {
                n4 = 40;
                break;
            }
            case 45: {
                n4 = 46;
                break;
            }
            case 46: {
                n4 = 10;
                break;
            }
            case 47: {
                n4 = 36;
                break;
            }
            case 48: {
                n4 = 53;
                break;
            }
            case 49: {
                n4 = 44;
                break;
            }
            case 50: {
                n4 = 24;
                break;
            }
            case 51: {
                n4 = 59;
                break;
            }
            case 52: {
                n4 = 31;
                break;
            }
            case 53: {
                n4 = 14;
                break;
            }
            case 54: {
                n4 = 43;
                break;
            }
            case 55: {
                n4 = 5;
                break;
            }
            case 56: {
                n4 = 13;
                break;
            }
            case 57: {
                n4 = 21;
                break;
            }
            case 58: {
                n4 = 4;
                break;
            }
            case 59: {
                n4 = 63;
                break;
            }
            case 60: {
                n4 = 9;
                break;
            }
            case 61: {
                n4 = 26;
                break;
            }
            case 62: {
                n4 = 17;
                break;
            }
            default: {
                n4 = 42;
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
        z6.f[n5] = new String(cArray);
        return n5;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7E98;
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
                throw new RuntimeException("a/z6", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            z6.c[n3] = n4;
        }
        return c[n3];
    }

    public static void M(double d2, double d3, double d4, double d5, Color color) {
        z6.O((float)d2, (float)d3, (float)d4, (float)d5, color);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e8' || c10 == '\u00f6' || c10 == 'o' || c10 == 'L') {
                field = z6.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = z6.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void X(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, Color color, Color color2, boolean bl2) {
        Object object;
        try {
            if (Math.signum(f20) >= 0.0f) {
                Ne.h.x(f20, f20, f20);
            }
        }
        catch (O_ o_2) {
            throw z6.a(o_2);
        }
        if (bl2) {
            object = new Color(0, 0, 0, 150);
            e e10 = new e().E(f10 + 0.5f, f11 + 0.5f, f12, f13, f14, f15, f16, f17, f18, f19, (Color)object);
            KP.x().p(e10);
        }
        if (color2 == null) {
            object = new e().E(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, color);
            KP.x().p((e)object);
        }
        try {
            if (Math.signum(f20) >= 0.0f) {
                Ne.h.x(1.0f / f20, 1.0f / f20, 1.0f / f20);
            }
        }
        catch (O_ o_3) {
            throw z6.a(o_3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(9010208437925268463L, 8322129998666637089L, MethodHandles.lookup().lookupClass()).a(16426485437393L);
        e = new Object[5];
        f = new String[5];
        z6.a();
        d = new HashMap(13);
        z6.t(new String[5]);
        long l10 = a ^ 0x944281E340BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "<a&\u0088\u00a8\u00ec\u00e3\u00f17\u00a4\u00f9\u00b2vVSS";
        int n3 = "<a&\u0088\u00a8\u00ec\u00e3\u00f17\u00a4\u00f9\u00b2vVSS".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        b = lArray;
        c = new Integer[2];
        D = new RL();
        J = new kd().Z();
        O = new kd().Z();
        i = null;
        p = null;
        N = new _r();
    }

    public static void h(double d2, double d3, double d4, double d5, double d6, Color color, Color color2) {
        if (color.equals(color2)) {
            d6 = 0.0;
            z6.M(d2, d3, d4 - d6, d5 - d6, color);
            return;
        }
        z6.M(d2 -= d6, d3, (d4 += d6) - d6, (d5 += d6) - d6, color);
    }

    public static void m(float f10, float f11, float f12, float f13, float f14, Color color) {
        e e10 = new e().o(f10, f11, f12, f13, f14, color);
        KP.x().p(e10);
    }

    public static void u(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, Color color) {
        e e10 = new e().b(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, color);
        KP.x().p(e10);
    }

    public static void v(float f10, float f11, float f12, float f13, WB wB2, String string, float f14, Color color, Color color2, boolean bl2) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        block5: {
            long l10 = a ^ 0xEF59C6A8F4L;
            f20 = 0.0f;
            f19 = 0.0f;
            f18 = 1.0f;
            f17 = 1.0f;
            f16 = wB2.t;
            f15 = wB2.v;
            Nu nu = RS.g().O((String)((Object)z6.b("\u00d1", (int)z6.a("u", (int)23807, (long)(0x6287768FD7D63E2DL ^ l10)), (long)2038520583235564319L, (long)l10)));
            try {
                if (nu.q() == null || wB2.M != nu.q().M) break block5;
            }
            catch (O_ o_2) {
                throw z6.a(o_2);
            }
            ZE zE2 = nu.V(string);
            try {
                if (zE2 == null) {
                    X_.D((String)((Object)z6.b("\u00d1", (int)z6.a("u", (int)29904, (long)(0x357831F73D959603L ^ l10)), (long)2038520583235564319L, (long)l10)));
                    return;
                }
            }
            catch (O_ o_3) {
                throw z6.a(o_3);
            }
            f20 = zE2.L;
            f18 = zE2.T;
            f19 = zE2.R;
            f17 = zE2.g;
            f16 = zE2.v;
            f15 = zE2.u;
            f12 += 0.5f;
            f13 += 0.5f;
            f10 -= 0.5f;
            f11 -= 0.5f;
        }
        z6.X(f10, f11, f12, f13, f16, f15, f20, f19, f18, f17, f14, color, color2, bl2);
    }

    public static void S(float f10, float f11, float f12, float f13, float f14, Color color) {
        z6.H(f10, f11, 0.0f, f12, f13, 0.0f, f14, color);
    }

    public static void T(float f10, float f11, float f12, float f13, float f14, float f15, Color color, WB wB2) {
        e e10 = new e().D(wB2).j(f10, f11, f12, f13, f14, f15, color);
        KP.x().p(e10);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0013>\u0014";
        objectArray[1] = Integer.TYPE;
        z6.f[1] = "java/lang/Integer";
        objectArray[2] = "E%S\u001dd\u0015N*BR\u0019\r]-K\u001b";
        objectArray[3] = "=\u001d@\u000bh>6\u0012QD\t0=\u0019U\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "M\u001c0\\\u0007X\u0014\u0002b>VX.C6BOZE\u0003e\u0002Y#\u0017\u0007&\u0005W\u0019G\u00194R=";
    }

    public static void r(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Color color) {
        e e10 = new e().B(f10, f11, f12, f13, f14, f15, f16, color);
        KP.x().p(e10);
    }

    public static void d(double d2, double d3, double d4, double d5, double d6, double d7, double d9, double d10, Color color, Color color2) {
        z6.O((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d9, (float)d10, color, color2);
    }

    private static Method d(long l10, long l11) {
        int n2 = z6.a(l10, l11);
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
                clazz3 = z6.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = z6.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = z6.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        z6.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = z6.b(249729136847327L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = z6.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        z6.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = z6.b(249729136847327L, 0L);
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

    public static void t(String[] stringArray) {
        A = stringArray;
    }

    public static void W(double d2, double d3, double d4, double d5, double d6, double d7, Color color) {
        z6.j((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, color);
    }

    public static void A(float f10, float f11, float f12, float f13, Color color, WB wB2) {
        e e10 = new e().D(wB2).S(f10, f11, f12, f13, color);
        KP.x().p(e10);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/z6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = z6.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = z6.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static void E(double d2, double d3, double d4, double d5, float f10, float f11, float f12, float f13, WB wB2) {
        block4: {
            try {
                try {
                    if (d4 != 0.0 && d5 != 0.0) break block4;
                }
                catch (O_ o_2) {
                    throw z6.a(o_2);
                }
                return;
            }
            catch (O_ o_3) {
                throw z6.a(o_3);
            }
        }
        e e10 = new e().D(wB2).E((float)d2, (float)d3, (float)d4, (float)d5, f10, f11, f12, f13);
        KP.x().p(e10);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void I(double d2, double d3, double d4, double d5, float f10, Color color) {
        z6.S((float)d2, (float)d3, (float)d4, (float)d5, f10, color);
    }

    public static void t(double d2, double d3, double d4, double d5, double d6, double d7, int n2, Color color) {
        z6.A((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, n2, color);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/z6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void n(double d2, double d3, double d4, double d5, double d6, double d7, double d9, double d10, Color color) {
        z6.X((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d9, (float)d10, color);
    }

    public static void X(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, Color color) {
        z6.u(f10, f11, 0.0f, f12, f13, 0.0f, f14, f15, 0.0f, f16, f17, 0.0f, color);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(z6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(z6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

