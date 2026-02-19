/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package a;

import a.O_;
import a.d8;
import a.iK;
import a.oJ;
import a.oj;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;

public class kd {
    private static int[] R;
    private static final long b;
    private static final String[] e;
    private static final long a;
    private static final Object[] c;
    public float[] d;

    public kd e(float f10, float f11, float f12, float f13) {
        float f14 = (float)Math.toRadians(f10);
        float f15 = (float)Math.cos(f14);
        float f16 = (float)Math.sin(f14);
        float f17 = 1.0f - f15;
        kd kd2 = new kd().Z();
        kd2.d[0] = f11 * f11 * f17 + f15;
        kd2.d[1] = f12 * f11 * f17 + f13 * f16;
        kd2.d[2] = f11 * f13 * f17 - f12 * f16;
        kd2.d[4] = f11 * f12 * f17 - f13 * f16;
        kd2.d[5] = f12 * f12 * f17 + f15;
        kd2.d[6] = f12 * f13 * f17 + f11 * f16;
        kd2.d[8] = f11 * f13 * f17 + f12 * f16;
        kd2.d[9] = f12 * f13 * f17 - f11 * f16;
        kd2.d[10] = f13 * f13 * f17 + f15;
        return this.E(kd2);
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = kd.a(l10, l11);
            object = c[n2];
            try {
                if (!(object instanceof String)) break block2;
                kd.c[n2] = clazz = Class.forName(e[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public kd(iK iK2) {
        this();
        this.d[0] = iK2.F;
        this.d[5] = iK2.s;
        this.d[10] = iK2.X;
        this.d[15] = iK2.n;
    }

    public kd f(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.d[0] = 2.0f / (f11 - f10);
        this.d[5] = 2.0f / (f13 - f12);
        this.d[10] = -2.0f / (f15 - f14);
        this.d[12] = -((f11 + f10) / (f11 - f10));
        this.d[13] = -((f13 + f12) / (f13 - f12));
        this.d[14] = -((f15 + f14) / (f15 - f14));
        return this;
    }

    public kd(float[] fArray) {
        this.d = fArray;
    }

    public FloatBuffer c() {
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)16);
        floatBuffer.put(this.d).flip();
        return floatBuffer;
    }

    public kd Z() {
        try {
            for (int i10 = 0; i10 < 16; ++i10) {
                this.d[i10] = 0.0f;
            }
        }
        catch (O_ o_2) {
            throw kd.a(o_2);
        }
        this.d[0] = 1.0f;
        this.d[5] = 1.0f;
        this.d[10] = 1.0f;
        this.d[15] = 1.0f;
        return this;
    }

    public String toString() {
        long l10 = a ^ 0x7F2DB095C353L;
        return (String)((Object)kd.a("\u00a3", (int)((int)b), (long)-4528024315672140759L, (long)l10)) + Arrays.toString(this.d) + '}';
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e3' || c10 == 'x' || c10 == 'D' || c10 == '\u00f4') {
                field = kd.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'x' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'D' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = kd.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/kd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l10, long l11) {
        int n2 = kd.a(l10, l11);
        Object object = c[n2];
        if (object instanceof String) {
            String string = e[n2];
            int n3 = string.indexOf(8);
            Class clazz = kd.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = kd.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = kd.a(clazz3, string2, clazz2)) != null) {
                    kd.c[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = kd.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        kd.c[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = kd.b(256332372048626L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "oOu";
        objectArray[1] = Integer.TYPE;
        kd.e[1] = "java/lang/Integer";
        objectArray[2] = "W_W@2:\\PF\u000fO\"OWOF";
        objectArray[3] = "t{O\u0004A\u0000\u007ft^K \u000et\u007fZ\u0011";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0003\\J\fIU\u0012\u000fPfO\u0010b\u001d]\u001cT\u0016\\^\rV$QX\u0001T_TPZW\u0001f";
    }

    public void f(iK iK2, iK iK3) {
        float f10 = iK2.F;
        float f11 = iK2.s;
        float f12 = iK2.X;
        float f13 = iK2.n;
        iK3.F = this.d[0] * f10 + this.d[4] * f11 + this.d[8] * f12 + this.d[12] * f13;
        iK3.s = this.d[1] * f10 + this.d[5] * f11 + this.d[9] * f12 + this.d[13] * f13;
        iK3.X = this.d[2] * f10 + this.d[6] * f11 + this.d[10] * f12 + this.d[14] * f13;
        iK3.n = this.d[3] * f10 + this.d[7] * f11 + this.d[11] * f12 + this.d[15] * f13;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = kd.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = kd.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public kd k(float f10, float f11, float f12) {
        kd kd2 = new kd().Z();
        kd2.d[12] = f10;
        kd2.d[13] = f11;
        kd2.d[14] = f12;
        return this.E(kd2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public static int[] z() {
        return R;
    }

    public kd() {
        this.d = new float[16];
    }

    public static void m(int[] nArray) {
        R = nArray;
    }

    public kd g(float f10) {
        this.Z();
        float f11 = (float)Math.toRadians(f10);
        this.d[5] = (float)Math.cos(f11);
        this.d[6] = -((float)Math.sin(f11));
        this.d[9] = (float)Math.sin(f11);
        this.d[10] = (float)Math.cos(f11);
        return this;
    }

    public oJ B() {
        oJ oJ2;
        oJ oJ3 = oJ.b();
        oJ oJ4 = oJ3.q(this.c());
        try {
            oJ2 = oJ4 == null ? oJ3 : oJ4;
        }
        catch (O_ o_2) {
            throw kd.a(o_2);
        }
        return oJ2;
    }

    public kd(oj oj2) {
        this();
        float f10 = oj2.Q();
        float f11 = oj2.G();
        float f12 = oj2.i();
        float f13 = oj2.H();
        float f14 = 2.0f * f10 * f10;
        float f15 = 2.0f * f11 * f11;
        float f16 = 2.0f * f12 * f12;
        this.d[0] = 1.0f - f15 - f16;
        this.d[5] = 1.0f - f16 - f14;
        this.d[10] = 1.0f - f14 - f15;
        this.d[15] = 1.0f;
        float f17 = f10 * f11;
        float f18 = f11 * f12;
        float f19 = f12 * f10;
        float f20 = f10 * f13;
        float f21 = f11 * f13;
        float f22 = f12 * f13;
        this.d[4] = 2.0f * (f17 + f22);
        this.d[1] = 2.0f * (f17 - f22);
        this.d[8] = 2.0f * (f19 - f21);
        this.d[2] = 2.0f * (f19 + f21);
        this.d[9] = 2.0f * (f18 + f20);
        this.d[6] = 2.0f * (f18 - f20);
    }

    public kd D(float f10, float f11, float f12, float f13) {
        float f14 = (float)Math.tan(Math.toRadians(f10) / 2.0);
        this.d[0] = 1.0f / (f11 * f14);
        this.d[5] = 1.0f / f14;
        this.d[10] = -((f13 + f12) / (f13 - f12));
        this.d[11] = -(2.0f * f13 * f12 / (f13 - f12));
        this.d[14] = -1.0f;
        return this;
    }

    public boolean z(kd kd2) {
        try {
            if (this == kd2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw kd.a(o_2);
        }
        if (kd2 != null) {
            int n2 = 0;
            while (true) {
                block9: {
                    try {
                        try {
                            if (n2 >= 16) break;
                            if (Float.compare(this.d[n2], kd2.d[n2]) == 0) break block9;
                        }
                        catch (O_ o_3) {
                            throw kd.a(o_3);
                        }
                        return false;
                    }
                    catch (O_ o_4) {
                        throw kd.a(o_4);
                    }
                }
                ++n2;
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(911495713450068343L, 2430142237212774140L, MethodHandles.lookup().lookupClass()).a(78755540533269L);
        c = new Object[5];
        e = new String[5];
        kd.a();
        long l10 = a ^ 0x4B965D14BFA1L;
        kd.m(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -7537776610719323753L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public kd f() {
        return new kd(this);
    }

    public kd q(float f10, float f11, float f12) {
        kd kd2 = new kd().Z();
        kd2.d[0] = f10;
        kd2.d[5] = f11;
        kd2.d[10] = f12;
        return this.E(kd2);
    }

    public kd E(kd kd2) {
        float[] fArray = new float[16];
        for (int i10 = 0; i10 < 4; ++i10) {
            for (int i11 = 0; i11 < 4; ++i11) {
                float f10 = 0.0f;
                for (int i12 = 0; i12 < 4; ++i12) {
                    f10 += this.d[i11 + i12 * 4] * kd2.d[i12 + i10 * 4];
                }
                fArray[i11 + i10 * 4] = f10;
            }
        }
        this.d = fArray;
        return this;
    }

    private static Method d(long l10, long l11) {
        int n2 = kd.a(l10, l11);
        Object object = c[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n2];
                int n4 = string2.indexOf(8);
                clazz3 = kd.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = kd.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = kd.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        kd.c[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = kd.b(256332372048626L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = kd.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        kd.c[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = kd.b(256332372048626L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = kd.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = kd.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = kd.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (e[n5] != null) {
            return n5;
        }
        Object object = c[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 38;
                break;
            }
            case 1: {
                n4 = 7;
                break;
            }
            case 2: {
                n4 = 30;
                break;
            }
            case 3: {
                n4 = 31;
                break;
            }
            case 4: {
                n4 = 23;
                break;
            }
            case 5: {
                n4 = 51;
                break;
            }
            case 6: {
                n4 = 9;
                break;
            }
            case 7: {
                n4 = 40;
                break;
            }
            case 8: {
                n4 = 60;
                break;
            }
            case 9: {
                n4 = 20;
                break;
            }
            case 10: {
                n4 = 37;
                break;
            }
            case 11: {
                n4 = 62;
                break;
            }
            case 12: {
                n4 = 36;
                break;
            }
            case 13: {
                n4 = 58;
                break;
            }
            case 14: {
                n4 = 25;
                break;
            }
            case 15: {
                n4 = 1;
                break;
            }
            case 16: {
                n4 = 39;
                break;
            }
            case 17: {
                n4 = 2;
                break;
            }
            case 18: {
                n4 = 4;
                break;
            }
            case 19: {
                n4 = 28;
                break;
            }
            case 20: {
                n4 = 42;
                break;
            }
            case 21: {
                n4 = 46;
                break;
            }
            case 22: {
                n4 = 61;
                break;
            }
            case 23: {
                n4 = 22;
                break;
            }
            case 24: {
                n4 = 8;
                break;
            }
            case 25: {
                n4 = 26;
                break;
            }
            case 26: {
                n4 = 33;
                break;
            }
            case 27: {
                n4 = 50;
                break;
            }
            case 28: {
                n4 = 35;
                break;
            }
            case 29: {
                n4 = 34;
                break;
            }
            case 30: {
                n4 = 17;
                break;
            }
            case 31: {
                n4 = 24;
                break;
            }
            case 32: {
                n4 = 12;
                break;
            }
            case 33: {
                n4 = 5;
                break;
            }
            case 34: {
                n4 = 0;
                break;
            }
            case 35: {
                n4 = 41;
                break;
            }
            case 36: {
                n4 = 13;
                break;
            }
            case 37: {
                n4 = 55;
                break;
            }
            case 38: {
                n4 = 63;
                break;
            }
            case 39: {
                n4 = 47;
                break;
            }
            case 40: {
                n4 = 59;
                break;
            }
            case 41: {
                n4 = 44;
                break;
            }
            case 42: {
                n4 = 14;
                break;
            }
            case 43: {
                n4 = 19;
                break;
            }
            case 44: {
                n4 = 48;
                break;
            }
            case 45: {
                n4 = 45;
                break;
            }
            case 46: {
                n4 = 52;
                break;
            }
            case 47: {
                n4 = 54;
                break;
            }
            case 48: {
                n4 = 32;
                break;
            }
            case 49: {
                n4 = 15;
                break;
            }
            case 50: {
                n4 = 21;
                break;
            }
            case 51: {
                n4 = 18;
                break;
            }
            case 52: {
                n4 = 27;
                break;
            }
            case 53: {
                n4 = 49;
                break;
            }
            case 54: {
                n4 = 56;
                break;
            }
            case 55: {
                n4 = 57;
                break;
            }
            case 56: {
                n4 = 43;
                break;
            }
            case 57: {
                n4 = 53;
                break;
            }
            case 58: {
                n4 = 6;
                break;
            }
            case 59: {
                n4 = 10;
                break;
            }
            case 60: {
                n4 = 29;
                break;
            }
            case 61: {
                n4 = 16;
                break;
            }
            case 62: {
                n4 = 11;
                break;
            }
            default: {
                n4 = 3;
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
        kd.e[n5] = new String(cArray);
        return n5;
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

    public kd(kd kd2) {
        this.d = kd2.d;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(kd.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

