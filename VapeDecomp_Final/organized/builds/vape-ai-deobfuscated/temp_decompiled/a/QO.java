/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Hc;
import a.Na;
import a.O_;
import a.d8;
import a.eM;
import a.kX;
import a.qt;
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
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qo
extends v2 {
    private static final String[] g;
    public HK Y;
    public HK d;
    private static final Map e;
    private static final Object[] f;
    public HK Q;
    private static final long[] b;
    private static final long a;
    public HK t;
    private final HK h;
    private static final Integer[] c;
    public HK B;

    public qo() {
        block39: {
            int n2;
            int n3;
            long l10;
            block37: {
                String string;
                block36: {
                    block35: {
                        block33: {
                            block31: {
                                int n4;
                                int n5;
                                block29: {
                                    l10 = a ^ 0x1A24E79B2335L;
                                    String string2 = qt.w();
                                    super(eM.f);
                                    string = string2;
                                    try {
                                        block30: {
                                            try {
                                                try {
                                                    this.h = qo.c("F", (Object)this, (Object)qo.c("z", (int)qo.b("o", (int)12929, (long)(0x67DDDDDA753D0CA6L ^ l10)), (long)-1328383843253170418L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-1328438758180776222L, (long)l10);
                                                    int n4 = kX.C();
                                                    n4 = 13;
                                                    if (string != null) break block29;
                                                    if (n5 != n4) break block30;
                                                }
                                                catch (O_ o_2) {
                                                    throw qo.a(o_2);
                                                }
                                                this.t = qo.c("F", (Object)this, (Object)qo.c("z", (int)qo.b("o", (int)4916, (long)(0x352DDECE2E702D15L ^ l10)), (long)-1328383843253170418L, (long)l10), (boolean)true, Boolean.TYPE, (Object)new Class[]{eM.Ut, Boolean.TYPE}, (long)-1328438758180776222L, (long)l10);
                                                if (string == null) break block31;
                                            }
                                            catch (O_ o_3) {
                                                throw qo.a(o_3);
                                            }
                                        }
                                        int n4 = kX.C();
                                        n4 = 50;
                                    }
                                    catch (O_ o_4) {
                                        throw qo.a(o_4);
                                    }
                                }
                                try {
                                    block32: {
                                        try {
                                            if (n5 < n4) break block32;
                                            this.B = qo.c("F", (Object)this, (Object)qo.c("z", (int)qo.b("o", (int)7096, (long)(0x156B494CD61DA59BL ^ l10)), (long)-1328383843253170418L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.bf}, (long)-1328438758180776222L, (long)l10);
                                            if (string == null) break block31;
                                        }
                                        catch (O_ o_5) {
                                            throw qo.a(o_5);
                                        }
                                    }
                                    this.B = qo.c("F", (Object)this, (Object)qo.c("z", (int)qo.b("o", (int)6369, (long)(0x18862A98A8EAA6C1L ^ l10)), (long)-1328383843253170418L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{Long.TYPE}, (long)-1328438758180776222L, (long)l10);
                                }
                                catch (O_ o_6) {
                                    throw qo.a(o_6);
                                }
                            }
                            try {
                                block34: {
                                    try {
                                        try {
                                            n3 = Na.MC_1_21_10.H();
                                            if (string != null) break block33;
                                            if (n3 == 0) break block34;
                                        }
                                        catch (O_ o_7) {
                                            throw qo.a(o_7);
                                        }
                                        this.Q = qo.c("F", (Object)this, (Object)qo.c("z", (int)qo.b("o", (int)25737, (long)(0x2EED0B93B54BDAAFL ^ l10)), (long)-1328383843253170418L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.bf, eM.S, eM.YU, eM.P6}, (long)-1328438758180776222L, (long)l10);
                                        if (string == null) break block35;
                                    }
                                    catch (O_ o_8) {
                                        throw qo.a(o_8);
                                    }
                                }
                                n3 = Na.MC_1_21_4.H();
                            }
                            catch (O_ o_9) {
                                throw qo.a(o_9);
                            }
                        }
                        try {
                            try {
                                if (string != null) break block36;
                                if (n3 == 0) break block35;
                            }
                            catch (O_ o_10) {
                                throw qo.a(o_10);
                            }
                            this.d = qo.c("F", (Object)this, (Object)qo.c("z", (int)qo.b("o", (int)5968, (long)(0x175B953136D12974L ^ l10)), (long)-1328383843253170418L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.YH, eM.Ux, eM.bf, eM.YU, List.class}, (long)-1328438758180776222L, (long)l10);
                        }
                        catch (O_ o_11) {
                            throw qo.a(o_11);
                        }
                    }
                    n3 = kX.C();
                }
                try {
                    block38: {
                        try {
                            try {
                                n2 = 50;
                                if (string != null) break block37;
                                if (n3 < n2) break block38;
                            }
                            catch (O_ o_12) {
                                throw qo.a(o_12);
                            }
                            this.Y = qo.c("F", (Object)this, (Object)qo.c("z", (int)qo.b("o", (int)19880, (long)(0x78ACB9E20BA6F38DL ^ l10)), (long)-1328383843253170418L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{Float.TYPE, Long.TYPE, Boolean.TYPE, eM.bf, eM.b5, eM.Yt, eM.rr, eM.rr}, (long)-1328438758180776222L, (long)l10);
                            if (string == null) break block39;
                        }
                        catch (O_ o_13) {
                            throw qo.a(o_13);
                        }
                    }
                    int n2 = kX.C();
                    n2 = 35;
                }
                catch (O_ o_14) {
                    throw qo.a(o_14);
                }
            }
            try {
                if (n3 >= n2) {
                    this.Y = qo.c("F", (Object)this, (Object)qo.c("z", (int)qo.b("o", (int)9590, (long)(0x2FAC76EEF0691B54L ^ l10)), (long)-1328383843253170418L, (long)l10), (boolean)Hc.z, Void.TYPE, (Object)new Class[]{eM.YH, Float.TYPE, Long.TYPE, Boolean.TYPE, eM.bf, eM.b5, eM.Yt, eM.rr}, (long)-1328438758180776222L, (long)l10);
                }
            }
            catch (O_ o_15) {
                throw qo.a(o_15);
            }
        }
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x53B4;
        if (c[n3] == null) {
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
                throw new RuntimeException("a/qo", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qo.c[n3] = n4;
        }
        return c[n3];
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
                n4 = 59;
                break;
            }
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 5;
                break;
            }
            case 3: {
                n4 = 15;
                break;
            }
            case 4: {
                n4 = 32;
                break;
            }
            case 5: {
                n4 = 31;
                break;
            }
            case 6: {
                n4 = 0;
                break;
            }
            case 7: {
                n4 = 45;
                break;
            }
            case 8: {
                n4 = 38;
                break;
            }
            case 9: {
                n4 = 26;
                break;
            }
            case 10: {
                n4 = 47;
                break;
            }
            case 11: {
                n4 = 56;
                break;
            }
            case 12: {
                n4 = 62;
                break;
            }
            case 13: {
                n4 = 23;
                break;
            }
            case 14: {
                n4 = 39;
                break;
            }
            case 15: {
                n4 = 9;
                break;
            }
            case 16: {
                n4 = 41;
                break;
            }
            case 17: {
                n4 = 10;
                break;
            }
            case 18: {
                n4 = 40;
                break;
            }
            case 19: {
                n4 = 4;
                break;
            }
            case 20: {
                n4 = 29;
                break;
            }
            case 21: {
                n4 = 6;
                break;
            }
            case 22: {
                n4 = 21;
                break;
            }
            case 23: {
                n4 = 3;
                break;
            }
            case 24: {
                n4 = 61;
                break;
            }
            case 25: {
                n4 = 14;
                break;
            }
            case 26: {
                n4 = 2;
                break;
            }
            case 27: {
                n4 = 12;
                break;
            }
            case 28: {
                n4 = 46;
                break;
            }
            case 29: {
                n4 = 8;
                break;
            }
            case 30: {
                n4 = 51;
                break;
            }
            case 31: {
                n4 = 17;
                break;
            }
            case 32: {
                n4 = 7;
                break;
            }
            case 33: {
                n4 = 22;
                break;
            }
            case 34: {
                n4 = 49;
                break;
            }
            case 35: {
                n4 = 34;
                break;
            }
            case 36: {
                n4 = 36;
                break;
            }
            case 37: {
                n4 = 37;
                break;
            }
            case 38: {
                n4 = 50;
                break;
            }
            case 39: {
                n4 = 24;
                break;
            }
            case 40: {
                n4 = 13;
                break;
            }
            case 41: {
                n4 = 30;
                break;
            }
            case 42: {
                n4 = 44;
                break;
            }
            case 43: {
                n4 = 11;
                break;
            }
            case 44: {
                n4 = 43;
                break;
            }
            case 45: {
                n4 = 54;
                break;
            }
            case 46: {
                n4 = 28;
                break;
            }
            case 47: {
                n4 = 19;
                break;
            }
            case 48: {
                n4 = 57;
                break;
            }
            case 49: {
                n4 = 33;
                break;
            }
            case 50: {
                n4 = 52;
                break;
            }
            case 51: {
                n4 = 55;
                break;
            }
            case 52: {
                n4 = 16;
                break;
            }
            case 53: {
                n4 = 25;
                break;
            }
            case 54: {
                n4 = 53;
                break;
            }
            case 55: {
                n4 = 42;
                break;
            }
            case 56: {
                n4 = 27;
                break;
            }
            case 57: {
                n4 = 20;
                break;
            }
            case 58: {
                n4 = 48;
                break;
            }
            case 59: {
                n4 = 60;
                break;
            }
            case 60: {
                n4 = 58;
                break;
            }
            case 61: {
                n4 = 35;
                break;
            }
            case 62: {
                n4 = 18;
                break;
            }
            default: {
                n4 = 63;
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
        qo.g[n5] = new String(cArray);
        return n5;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = qo.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = qo.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static void u(qo qo2, Object object) {
        qo2.F(object);
    }

    private void F(Object object) {
        this.h.V(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "> k5";
        objectArray[1] = "Np3\u0002adE\u007f\"M\u001c|Vx+\u0004";
        objectArray[2] = Boolean.TYPE;
        qo.g[2] = "java/lang/Boolean";
        objectArray[3] = "L\u0004uC+WG\u000bd\fFWG\u0016p";
        objectArray[4] = ".A\u001a;0&[a\u00114!i6a\u0011)5|";
        objectArray[5] = "\u0007D3.";
        objectArray[6] = "y\bM";
        objectArray[7] = Integer.TYPE;
        qo.g[7] = "java/lang/Integer";
        objectArray[8] = "N\u0004\\nW\rE\u000bM!6\u0003N\u0000I{";
        objectArray[9] = "\nTT SX\u0006B\u000fBv;\u0014H\u000f-WV\u0013AWB\bG\u0010[Ay\u000eK\u0000\u00013xST\u001aPM>QD\u0010:\b\u007fCC\u0000XO(O_j\u0006\u000e!XF\u000bQ\u000b&J;";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "f,_\t\bv$2\u001d\t2r!JR\u001fJ!\" \u0010\nMiZ4\u001dM]\u007f73\u0014\u00152";
    }

    private static Field g(long l10, long l11) {
        int n2 = qo.e(l10, l11);
        Object object = f[n2];
        if (object instanceof String) {
            String string = g[n2];
            int n3 = string.indexOf(8);
            Class clazz = qo.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = qo.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qo.c(clazz3, string2, clazz2)) != null) {
                    qo.f[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = qo.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        qo.f[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qo.f(568646781123938L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qo.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = qo.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
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
            if (c10 == 'K' || c10 == '\u00df' || c10 == '\u00e2' || c10 == '\u00ba') {
                field = qo.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'K' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00df' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qo.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'F' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = qo.e(l10, l11);
            object = f[n2];
            try {
                if (!(object instanceof String)) break block2;
                qo.f[n2] = clazz = Class.forName(g[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = qo.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = qo.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qo.a = d8.a(-4537847617064087184L, 3018329608508937996L, MethodHandles.lookup().lookupClass()).a(166463036517681L);
                qo.f = new Object[11];
                qo.g = new String[11];
                qo.a();
                qo.e = new HashMap<K, V>(13);
                var0 = qo.a ^ 132079162554029L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "j\u0088@T)\u00c5\u0097~7@\u00ef\u00a6\u0092\u00c0\u0018\u00dd\u00eb$\u0013^\u00e1\u00adE\u0019\u00f3|\u0007k\u000b\u0084\u0091R\u00e6\u00f6\u00ec\u0080\u00fd\u00dd\u009e\u00e9\u00b0\u00d7\u0000\u008e@u\u0013\u0099";
                var7_6 = "j\u0088@T)\u00c5\u0097~7@\u00ef\u00a6\u0092\u00c0\u0018\u00dd\u00eb$\u0013^\u00e1\u00adE\u0019\u00f3|\u0007k\u000b\u0084\u0091R\u00e6\u00f6\u00ec\u0080\u00fd\u00dd\u009e\u00e9\u00b0\u00d7\u0000\u008e@u\u0013\u0099".length();
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
                    var6_5 = "\u0089 \u0090\u0092\u00b0jO\u00d5\u000eJm\u00a9w\u00b8\u00eb\u00c4";
                    var7_6 = "\u0089 \u0090\u0092\u00b0jO\u00d5\u000eJm\u00a9w\u00b8\u00eb\u00c4".length();
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
        qo.b = var8_3;
        qo.c = new Integer[8];
    }

    private static Method h(long l10, long l11) {
        int n2 = qo.e(l10, l11);
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
                clazz3 = qo.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = qo.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qo.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        qo.f[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qo.f(568646781123938L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = qo.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        qo.f[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qo.f(568646781123938L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qo.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(qo.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

