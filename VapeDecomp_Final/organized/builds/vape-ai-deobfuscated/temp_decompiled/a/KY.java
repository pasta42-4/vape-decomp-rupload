/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.Y3;
import a.Ya;
import a.Yj;
import a.d8;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ky {
    public final float s;
    public final float S;
    public final boolean x;
    private static final String[] g;
    private static final Object[] f;
    private static final long[] b;
    public final float C;
    public final float p;
    public final float c;
    public final float Q;
    private static final Map e;
    public final float h;
    private static final Integer[] d;
    private static final long a;
    public final float T;

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = ky.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = ky.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ky.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = ky.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = ky.a(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                ky.f[n2] = clazz = Class.forName(g[n2]);
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
        f[0] = "P>_";
        objectArray[1] = Integer.TYPE;
        ky.g[1] = "java/lang/Integer";
        objectArray[2] = "\u0015\u0017%^A\r\u001e\u00184\u0011<\u0015\r\u001f=X";
        objectArray[3] = "r\u000eR\u00199#y\u0001CVX-r\nG\f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001c1kVByC176\u0012~rafW\u00185\u001c4tD\u0014\u0005K!qZG8\u0002?zFy";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e4' || c10 == '\u00fe' || c10 == 'V' || c10 == 'I') {
                field = ky.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'V' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ky.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e8' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public ky(Yj yj2, float f10, float f11) {
        this.s = yj2.R();
        this.S = yj2.N();
        if (yj2 instanceof Ya) {
            this.h = ((Ya)yj2).I();
            this.c = ((Ya)yj2).G();
        } else {
            this.h = -1.0f;
            this.c = -1.0f;
        }
        this.Q = yj2.p();
        this.C = yj2.u();
        this.x = yj2.F();
        this.T = f10;
        this.p = f11;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = ky.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l10, long l11) {
        int n2 = ky.a(l10, l11);
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
                clazz3 = ky.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = ky.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ky.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        ky.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ky.b(249084676696072L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = ky.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        ky.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ky.b(249084676696072L, 0L);
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

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3820;
        if (d[n3] == null) {
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
                throw new RuntimeException("a/ky", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ky.d[n3] = n4;
        }
        return d[n3];
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

    private static Field c(long l10, long l11) {
        int n2 = ky.a(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = ky.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = ky.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ky.a(clazz3, string2, clazz2)) != null) {
                    ky.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = ky.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        ky.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ky.b(249084676696072L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public String m(ky ky2) {
        long l10 = a ^ 0x64FD151707B3L;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            if (this.s != ky2.s) {
                stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)28097, (long)(0x27AF8AEB10DC0B5CL ^ l10)), (long)6819992572076051815L, (long)l10))).append(ky2.s).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)12696, (long)(0x29B565A0D7AD570EL ^ l10)), (long)6819992572076051815L, (long)l10))).append(this.s).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)19552, (long)(0x3EC18C961E55AAEFL ^ l10)), (long)6819992572076051815L, (long)l10)));
            }
        }
        catch (O_ o_2) {
            throw ky.a(o_2);
        }
        try {
            if (this.S != ky2.S) {
                stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)2199, (long)(0x775ECAF596EA6E0FL ^ l10)), (long)6819992572076051815L, (long)l10))).append(ky2.S).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)27743, (long)(0x331F60DF98E60AC4L ^ l10)), (long)6819992572076051815L, (long)l10))).append(this.S).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)16677, (long)(0x7D16B224DDDEA7BAL ^ l10)), (long)6819992572076051815L, (long)l10)));
            }
        }
        catch (O_ o_3) {
            throw ky.a(o_3);
        }
        try {
            if (this.h != ky2.h) {
                stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)2283, (long)(0xA3174F635926E61L ^ l10)), (long)6819992572076051815L, (long)l10))).append(ky2.h).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)21270, (long)(0x3E3D3AE37267B594L ^ l10)), (long)6819992572076051815L, (long)l10))).append(this.h).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)17947, (long)(0x7B1115B983F2209EL ^ l10)), (long)6819992572076051815L, (long)l10)));
            }
        }
        catch (O_ o_4) {
            throw ky.a(o_4);
        }
        try {
            if (this.c != ky2.c) {
                stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)1078, (long)(0x28AC3100B6F262AAL ^ l10)), (long)6819992572076051815L, (long)l10))).append(ky2.c).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)3280, (long)(0x354003508C0CEA53L ^ l10)), (long)6819992572076051815L, (long)l10))).append(this.c).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)20438, (long)(0x73666C2C106F2956L ^ l10)), (long)6819992572076051815L, (long)l10)));
            }
        }
        catch (O_ o_5) {
            throw ky.a(o_5);
        }
        try {
            if (this.Q != ky2.Q) {
                stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)29871, (long)(0x14407AF01AAB923AL ^ l10)), (long)6819992572076051815L, (long)l10))).append(ky2.Q).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)10858, (long)(0x3A039D946A874CE3L ^ l10)), (long)6819992572076051815L, (long)l10))).append(this.Q).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)25647, (long)(0x2D7A27C0B71F82BCL ^ l10)), (long)6819992572076051815L, (long)l10)));
            }
        }
        catch (O_ o_6) {
            throw ky.a(o_6);
        }
        try {
            if (this.C != ky2.C) {
                stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)20684, (long)(0x22766431E8453644L ^ l10)), (long)6819992572076051815L, (long)l10))).append(ky2.C).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)453, (long)(0x77F6453558AD6754L ^ l10)), (long)6819992572076051815L, (long)l10))).append(this.C).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)20004, (long)(0x1A26C9C35DAA28A9L ^ l10)), (long)6819992572076051815L, (long)l10)));
            }
        }
        catch (O_ o_7) {
            throw ky.a(o_7);
        }
        try {
            if (this.x != ky2.x) {
                stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)19857, (long)(0x5FAA157119342B36L ^ l10)), (long)6819992572076051815L, (long)l10))).append(ky2.x).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)17824, (long)(0x567B7CE861D52305L ^ l10)), (long)6819992572076051815L, (long)l10))).append(this.x).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)19372, (long)(0x1BAAFD2805862D3CL ^ l10)), (long)6819992572076051815L, (long)l10)));
            }
        }
        catch (O_ o_8) {
            throw ky.a(o_8);
        }
        try {
            if (this.T != ky2.T) {
                stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)5719, (long)(0xD6FD150EA35F0D3L ^ l10)), (long)6819992572076051815L, (long)l10))).append(ky2.T).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)5635, (long)(0x1B6B582A05FDF09AL ^ l10)), (long)6819992572076051815L, (long)l10))).append(this.T).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)10835, (long)(0x2B39B078E365CCF3L ^ l10)), (long)6819992572076051815L, (long)l10)));
            }
        }
        catch (O_ o_9) {
            throw ky.a(o_9);
        }
        try {
            if (this.p != ky2.p) {
                stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)18402, (long)(0x657ED3BB34D5A16CL ^ l10)), (long)6819992572076051815L, (long)l10))).append(ky2.p).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)16724, (long)(0x3204F7EA97E3A7C6L ^ l10)), (long)6819992572076051815L, (long)l10))).append(this.p).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)124, (long)(0x26CC5485E8A3E6E2L ^ l10)), (long)6819992572076051815L, (long)l10)));
            }
        }
        catch (O_ o_10) {
            throw ky.a(o_10);
        }
        return stringBuilder.toString();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ky" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public ky(Y3 y32) {
        this(y32, y32.P(), y32.v());
    }

    private static int a(long l10, long l11) {
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
                n4 = 51;
                break;
            }
            case 1: {
                n4 = 23;
                break;
            }
            case 2: {
                n4 = 17;
                break;
            }
            case 3: {
                n4 = 9;
                break;
            }
            case 4: {
                n4 = 56;
                break;
            }
            case 5: {
                n4 = 40;
                break;
            }
            case 6: {
                n4 = 14;
                break;
            }
            case 7: {
                n4 = 46;
                break;
            }
            case 8: {
                n4 = 33;
                break;
            }
            case 9: {
                n4 = 54;
                break;
            }
            case 10: {
                n4 = 58;
                break;
            }
            case 11: {
                n4 = 28;
                break;
            }
            case 12: {
                n4 = 52;
                break;
            }
            case 13: {
                n4 = 48;
                break;
            }
            case 14: {
                n4 = 2;
                break;
            }
            case 15: {
                n4 = 18;
                break;
            }
            case 16: {
                n4 = 27;
                break;
            }
            case 17: {
                n4 = 20;
                break;
            }
            case 18: {
                n4 = 45;
                break;
            }
            case 19: {
                n4 = 15;
                break;
            }
            case 20: {
                n4 = 13;
                break;
            }
            case 21: {
                n4 = 59;
                break;
            }
            case 22: {
                n4 = 63;
                break;
            }
            case 23: {
                n4 = 5;
                break;
            }
            case 24: {
                n4 = 24;
                break;
            }
            case 25: {
                n4 = 0;
                break;
            }
            case 26: {
                n4 = 50;
                break;
            }
            case 27: {
                n4 = 60;
                break;
            }
            case 28: {
                n4 = 29;
                break;
            }
            case 29: {
                n4 = 7;
                break;
            }
            case 30: {
                n4 = 49;
                break;
            }
            case 31: {
                n4 = 8;
                break;
            }
            case 32: {
                n4 = 11;
                break;
            }
            case 33: {
                n4 = 12;
                break;
            }
            case 34: {
                n4 = 3;
                break;
            }
            case 35: {
                n4 = 25;
                break;
            }
            case 36: {
                n4 = 47;
                break;
            }
            case 37: {
                n4 = 32;
                break;
            }
            case 38: {
                n4 = 35;
                break;
            }
            case 39: {
                n4 = 31;
                break;
            }
            case 40: {
                n4 = 36;
                break;
            }
            case 41: {
                n4 = 55;
                break;
            }
            case 42: {
                n4 = 26;
                break;
            }
            case 43: {
                n4 = 34;
                break;
            }
            case 44: {
                n4 = 62;
                break;
            }
            case 45: {
                n4 = 42;
                break;
            }
            case 46: {
                n4 = 43;
                break;
            }
            case 47: {
                n4 = 22;
                break;
            }
            case 48: {
                n4 = 44;
                break;
            }
            case 49: {
                n4 = 1;
                break;
            }
            case 50: {
                n4 = 38;
                break;
            }
            case 51: {
                n4 = 53;
                break;
            }
            case 52: {
                n4 = 10;
                break;
            }
            case 53: {
                n4 = 21;
                break;
            }
            case 54: {
                n4 = 19;
                break;
            }
            case 55: {
                n4 = 39;
                break;
            }
            case 56: {
                n4 = 57;
                break;
            }
            case 57: {
                n4 = 30;
                break;
            }
            case 58: {
                n4 = 4;
                break;
            }
            case 59: {
                n4 = 16;
                break;
            }
            case 60: {
                n4 = 6;
                break;
            }
            case 61: {
                n4 = 41;
                break;
            }
            case 62: {
                n4 = 61;
                break;
            }
            default: {
                n4 = 37;
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
        ky.g[n5] = new String(cArray);
        return n5;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/ky" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static String j(List<ky> list) {
        long l10 = a ^ 0x5CBBEF1940B4L;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)2239, (long)(0x4629FDAD4944A92FL ^ l10)), (long)1847112854212905568L, (long)l10)));
        for (ky ky2 : list) {
            stringBuilder.append(ky2.h).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)31661, (long)(0x2AA2308BA827DA21L ^ l10)), (long)1847112854212905568L, (long)l10))).append(ky2.c).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)9412, (long)(0x776221EB5792054FL ^ l10)), (long)1847112854212905568L, (long)l10))).append(ky2.s).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)5910, (long)(0x61CDC35B2E7DB6B7L ^ l10)), (long)1847112854212905568L, (long)l10))).append(ky2.S).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)26160, (long)(0x58F646FF0365C7B0L ^ l10)), (long)1847112854212905568L, (long)l10))).append(ky2.Q).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)19183, (long)(0x25F9A1A1644CEB72L ^ l10)), (long)1847112854212905568L, (long)l10))).append(ky2.C).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)12504, (long)(0x5D75FD1ED235114BL ^ l10)), (long)1847112854212905568L, (long)l10))).append(ky2.x).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)21351, (long)(0x4E7F0C32238AF2C4L ^ l10)), (long)1847112854212905568L, (long)l10))).append(ky2.T).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)18360, (long)(0x29F1CA57D278663EL ^ l10)), (long)1847112854212905568L, (long)l10))).append(ky2.p).append((String)((Object)ky.b("\u00d3", (int)ky.a("r", (int)16552, (long)(0x5A284AA598F76129L ^ l10)), (long)1847112854212905568L, (long)l10)));
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ky.a = d8.a(4020395262938320797L, -8119234395179349981L, MethodHandles.lookup().lookupClass()).a(57616963728831L);
                ky.f = new Object[5];
                ky.g = new String[5];
                ky.a();
                ky.e = new HashMap<K, V>(13);
                var0 = ky.a ^ 81005643519290L;
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
                var8_3 = new long[37];
                var5_4 = 0;
                var6_5 = "\u00f3h\u0087)9\u0095f&mw\u008f\u00a5\u00b3e:\u00ec\u009d\u00e9o\u0087W\rk)\u001d\u00a7b0\u00ee\u0087\\m1{\u0080\u00f8\u00f2\u00fa\u00c3\u0093\u0095\u00af\u0082H\u000b\u00f81H\u00ad\u00827\u00b3\u0018,\u00d2\u00f6\u0007'\u00bdX\u00f6f\u00b35U\u00d3\u000bIG\u008a\u008a1\u00a3\u00db\u00af\u00b9\u00e8\u0093\u00ff\u00ca\u009a\u0085dO\u00e2~n\u00d9~\u0084\u00a1\u008dj\u00be\u00a2\"4!\u0094\u000f\u00b8\u0098\u00ea\u000e6\u00e9\u009b\u0000\u00ec\u000f\u00bfj\u00bd\u00c8qK\u00c9\u00cf\u00daO<Y\u0092n\u00f6\u0015\u00dbC\u00d3\u00ec2\f\u008e\u00f0\u0099[\u0011VS\u00f5\u00dfu\u00dd\u0096\u00a8\u0098\u0019W\u00f2F&s\u0086h\u00f8\u00d0\u00c1\\N\u00dc\u000e\u00c6Ki\\\u00eb\u00b5\u00aa\u00dd\u0091[\u008d\u008a\u0092\u0007\u00cd\u0012\u0005\u00fa\u00fcnv\u00b3~\u00dcU9UX\u008f5\u00f8\u008eB\u00b1e}j\u00d0\u00a2\u00ebr|Y\u00b1\u00bf\u0081\u00bd\u00ad\u0083\u00d6\u0007\u0093g\u0081_\u00ee\u00e9/\u00b96\f$$\u00ad\u00c4c\u0007l5\u00d4\u00fd\u0098V\u007f\u00ec\u00ca\u00fb\u0006\u00e7#\u00ed\u0091[1@2!\u00fc\u00d3y\u00912\u00dd\u000e\f#ZE\u00ddB\u00a8\u00cfHBB\u00fdt\u00a7\u00a0\u0017W\u0013J\u0000D\u008f\u00a3\u0092X";
                var7_6 = "\u00f3h\u0087)9\u0095f&mw\u008f\u00a5\u00b3e:\u00ec\u009d\u00e9o\u0087W\rk)\u001d\u00a7b0\u00ee\u0087\\m1{\u0080\u00f8\u00f2\u00fa\u00c3\u0093\u0095\u00af\u0082H\u000b\u00f81H\u00ad\u00827\u00b3\u0018,\u00d2\u00f6\u0007'\u00bdX\u00f6f\u00b35U\u00d3\u000bIG\u008a\u008a1\u00a3\u00db\u00af\u00b9\u00e8\u0093\u00ff\u00ca\u009a\u0085dO\u00e2~n\u00d9~\u0084\u00a1\u008dj\u00be\u00a2\"4!\u0094\u000f\u00b8\u0098\u00ea\u000e6\u00e9\u009b\u0000\u00ec\u000f\u00bfj\u00bd\u00c8qK\u00c9\u00cf\u00daO<Y\u0092n\u00f6\u0015\u00dbC\u00d3\u00ec2\f\u008e\u00f0\u0099[\u0011VS\u00f5\u00dfu\u00dd\u0096\u00a8\u0098\u0019W\u00f2F&s\u0086h\u00f8\u00d0\u00c1\\N\u00dc\u000e\u00c6Ki\\\u00eb\u00b5\u00aa\u00dd\u0091[\u008d\u008a\u0092\u0007\u00cd\u0012\u0005\u00fa\u00fcnv\u00b3~\u00dcU9UX\u008f5\u00f8\u008eB\u00b1e}j\u00d0\u00a2\u00ebr|Y\u00b1\u00bf\u0081\u00bd\u00ad\u0083\u00d6\u0007\u0093g\u0081_\u00ee\u00e9/\u00b96\f$$\u00ad\u00c4c\u0007l5\u00d4\u00fd\u0098V\u007f\u00ec\u00ca\u00fb\u0006\u00e7#\u00ed\u0091[1@2!\u00fc\u00d3y\u00912\u00dd\u000e\f#ZE\u00ddB\u00a8\u00cfHBB\u00fdt\u00a7\u00a0\u0017W\u0013J\u0000D\u008f\u00a3\u0092X".length();
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
                    var6_5 = "\u00a6(\u001d\u001e\u00fd\u00cd\u0092\u00a8\u00d1r\u008a\u00a6Zm\u000bd";
                    var7_6 = "\u00a6(\u001d\u001e\u00fd\u00cd\u0092\u00a8\u00d1r\u008a\u00a6Zm\u000bd".length();
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
        ky.b = var8_3;
        ky.d = new Integer[37];
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = ky.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ky.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ky.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

