/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Ib;
import a.Na;
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

public class Uc
extends v2 {
    private HK A;
    private static final long a;
    private Ib C;
    private static final Integer[] c;
    private static final long[] b;
    private Ib R;
    private Ib M;
    private HK h;
    private static final String[] f;
    private static final Object[] e;
    private Ib Z;
    private static final Map d;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Uc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = Uc.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private float w(Object object) {
        try {
            if (Na.MC_1_12_2.H()) {
                return this.Z.x(object);
            }
        }
        catch (O_ o_2) {
            throw Uc.a(o_2);
        }
        return 0.0f;
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

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x587B;
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
                throw new RuntimeException("a/Uc", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Uc.c[n3] = n4;
        }
        return c[n3];
    }

    private Object Y(Object object) {
        return this.R.Z(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Uc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = Uc.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                Uc.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static float Q(Uc uc, Object object) {
        return uc.w(object);
    }

    public Uc() {
        int n2;
        long l10;
        block44: {
            block45: {
                String string;
                block38: {
                    int n3;
                    int n4;
                    block41: {
                        block39: {
                            block36: {
                                block37: {
                                    block33: {
                                        block34: {
                                            l10 = a ^ 0x908A97DA1C0L;
                                            String string2 = m4.B();
                                            super(eM.Fv);
                                            string = string2;
                                            try {
                                                block35: {
                                                    try {
                                                        try {
                                                            try {
                                                                n4 = Na.MC_1_21_4.Q();
                                                                if (string != null) break block33;
                                                                if (n4 == 0) break block34;
                                                            }
                                                            catch (O_ o_2) {
                                                                throw Uc.a(o_2);
                                                            }
                                                            if (kX.C() < 50) break block35;
                                                        }
                                                        catch (O_ o_3) {
                                                            throw Uc.a(o_3);
                                                        }
                                                        this.h = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)7052, (long)(0x41E8B5B7AFF4972EL ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, Integer.TYPE, (Object)new Class[0], (long)-3109307329964186206L, (long)l10);
                                                        if (string == null) break block34;
                                                    }
                                                    catch (O_ o_4) {
                                                        throw Uc.a(o_4);
                                                    }
                                                }
                                                this.C = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)22821, (long)(0x4ADB6032651CD586L ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, Integer.TYPE, (long)-3109174411869320804L, (long)l10);
                                            }
                                            catch (O_ o_5) {
                                                throw Uc.a(o_5);
                                            }
                                        }
                                        n4 = Na.MC_1_21_0.H();
                                    }
                                    try {
                                        if (string != null) break block36;
                                        if (n4 == 0) break block37;
                                        break block38;
                                    }
                                    catch (O_ o_6) {
                                        throw Uc.a(o_6);
                                    }
                                }
                                n4 = kX.C();
                            }
                            try {
                                block40: {
                                    try {
                                        try {
                                            n3 = 50;
                                            if (string != null) break block39;
                                            if (n4 < n3) break block40;
                                        }
                                        catch (O_ o_7) {
                                            throw Uc.a(o_7);
                                        }
                                        this.R = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)7891, (long)(0x77A68FBA87129279L ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, (Object)eM.Pa, (long)-3109174411869320804L, (long)l10);
                                        this.M = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)5229, (long)(0xA41DFB635D198CBL ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, (Object)eM.rM, (long)-3109174411869320804L, (long)l10);
                                        if (string == null) break block38;
                                    }
                                    catch (O_ o_8) {
                                        throw Uc.a(o_8);
                                    }
                                }
                                int n3 = kX.C();
                                n3 = 35;
                            }
                            catch (O_ o_9) {
                                throw Uc.a(o_9);
                            }
                        }
                        try {
                            block42: {
                                try {
                                    try {
                                        if (string != null) break block41;
                                        if (n4 < n3) break block42;
                                    }
                                    catch (O_ o_10) {
                                        throw Uc.a(o_10);
                                    }
                                    this.R = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)26902, (long)(0x5A06ED817B7065B6L ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, (Object)eM.VA, (long)-3109174411869320804L, (long)l10);
                                    this.M = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)3346, (long)(0xCF40FB2E56801B3L ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, (Object)eM.Yb, (long)-3109174411869320804L, (long)l10);
                                    if (string == null) break block38;
                                }
                                catch (O_ o_11) {
                                    throw Uc.a(o_11);
                                }
                            }
                            int n3 = kX.C();
                            n3 = 23;
                        }
                        catch (O_ o_12) {
                            throw Uc.a(o_12);
                        }
                    }
                    try {
                        block43: {
                            try {
                                if (n4 < n3) break block43;
                                this.R = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)30252, (long)(0x39DCCC28F557FA87L ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, (Object)eM.VA, (long)-3109174411869320804L, (long)l10);
                                this.M = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)31336, (long)(0x6F4B1EAB4C6FF6CCL ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, (Object)eM.En, (long)-3109174411869320804L, (long)l10);
                                if (string == null) break block38;
                            }
                            catch (O_ o_13) {
                                throw Uc.a(o_13);
                            }
                        }
                        this.R = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)6629, (long)(0xBFF0AF41D79954DL ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, Integer.TYPE, (long)-3109174411869320804L, (long)l10);
                        this.M = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)20970, (long)(0x4B93B89E9F135D43L ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, (Object)eM.En, (long)-3109174411869320804L, (long)l10);
                    }
                    catch (O_ o_14) {
                        throw Uc.a(o_14);
                    }
                }
                try {
                    try {
                        n2 = kX.C();
                        if (string != null) break block44;
                        if (n2 >= 50) break block45;
                    }
                    catch (O_ o_15) {
                        throw Uc.a(o_15);
                    }
                    this.A = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)15340, (long)(0x7A194FA09693374BL ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, Integer.TYPE, (Object)new Class[]{eM.Vl}, (long)-3109307329964186206L, (long)l10);
                }
                catch (O_ o_16) {
                    throw Uc.a(o_16);
                }
            }
            n2 = Na.MC_1_12_2.H() ? 1 : 0;
        }
        try {
            if (n2 != 0) {
                this.Z = Uc.c("H", (Object)this, (Object)Uc.c("\u00d2", (int)Uc.b("z", (int)13217, (long)(0x5967AF1CCF8F3F04L ^ l10)), (long)-3109706312542096770L, (long)l10), (boolean)true, Float.TYPE, (long)-3109174411869320804L, (long)l10);
            }
        }
        catch (O_ o_17) {
            throw Uc.a(o_17);
        }
    }

    static int N(Uc uc, Object object, Object object2) {
        return uc.P(object, object2);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00ed' || c10 == 'e' || c10 == '\u00e0' || c10 == '\u00ee') {
                field = Uc.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Uc.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = Uc.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = Uc.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = Uc.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private int G(Object object) {
        return this.R.R(object);
    }

    static Object j(Uc uc, Object object) {
        return uc.Y(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = Uc.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = Uc.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l10, long l11) {
        int n2 = Uc.e(l10, l11);
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
                clazz3 = Uc.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = Uc.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Uc.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        Uc.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Uc.f(638749747758170L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = Uc.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        Uc.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Uc.f(638749747758170L, 0L);
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = " {Q\u0002";
        objectArray[1] = "\u001f7\u0010k!c\u00148\u0001$\\{\u0007?\bm";
        objectArray[2] = Boolean.TYPE;
        Uc.f[2] = "java/lang/Boolean";
        objectArray[3] = "\u001f=\u0001J\u001bn\u00142\u0010\u0005vn\u0014/\u0004";
        objectArray[4] = "os=?~;\u001aS60otwS6-{a";
        objectArray[5] = "UcUd";
        objectArray[6] = ",,A";
        objectArray[7] = Integer.TYPE;
        Uc.f[7] = "java/lang/Integer";
        objectArray[8] = "/i{o";
        objectArray[9] = "\u00076\u001bsyE\f9\n<\u0018K\u00072\u000ef";
        objectArray[10] = "B1G\u0000W+]:\u0006fyE\u0019<A\u000b\u00038GhCZ>|F:RVA<_0Sf\u0004.Y/\u0000\u000fC9C*?\\BxM.@\nR!AP\u0004\u0004_=\u001a4\u0007\u001c\u0007/ ";
        objectArray[11] = "O.f3O]P%'U}3\u0014#`8\u001bNJwbi&\nK%seYJR/rU\u001cXT0!<[ON5\u001eh]JD*f?C\rAO";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "I\u0007BvAI\u000fWFg*\u0019\u000ek\u001f-G\u000bKZKu\u0010\u001cuRNiGO\b\f\u001ak\u0016r";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Uc.a = d8.a(-2041036446422820895L, -4411189961619039497L, MethodHandles.lookup().lookupClass()).a(171392288786469L);
                Uc.e = new Object[13];
                Uc.f = new String[13];
                Uc.a();
                Uc.d = new HashMap<K, V>(13);
                var0 = Uc.a ^ 16933014161841L;
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
                var6_5 = "\u0017\u00eb\u0090\u0018\u0097\u00821\u00ad\u00e1\u00df$ZE\u00a3\u00fcF\u00ba\u0085\u0092\u00b7\u00e9oHQ\u00e46\u00b8vgs\u00ffB\u000e\u008b_\u001f\u00f6\fl]^q\u00c9\u00fc:\u0018N\u0011\u008aw\u0005H\u00a0\u00c6;\u0097\u00ad\u00f5\u00e4\u0011\u00fb\u00d2\u00f2\u00efl-\u0087Q\u00ea\u009a\u00ea\u009d\u00e1rl\u0097\u00f0\u0093\u008a\u001e";
                var7_6 = "\u0017\u00eb\u0090\u0018\u0097\u00821\u00ad\u00e1\u00df$ZE\u00a3\u00fcF\u00ba\u0085\u0092\u00b7\u00e9oHQ\u00e46\u00b8vgs\u00ffB\u000e\u008b_\u001f\u00f6\fl]^q\u00c9\u00fc:\u0018N\u0011\u008aw\u0005H\u00a0\u00c6;\u0097\u00ad\u00f5\u00e4\u0011\u00fb\u00d2\u00f2\u00efl-\u0087Q\u00ea\u009a\u00ea\u009d\u00e1rl\u0097\u00f0\u0093\u008a\u001e".length();
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
                    var6_5 = "\u00f6Q\u00c9\u0084\u00b0\u00cc\u00c1\u00de\u0086n)E8?0B";
                    var7_6 = "\u00f6Q\u00c9\u0084\u00b0\u00cc\u00c1\u00de\u0086n)E8?0B".length();
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
        Uc.b = var8_3;
        Uc.c = new Integer[12];
    }

    static int o(Uc uc, Object object) {
        return uc.u(object);
    }

    static Object t(Uc uc, Object object) {
        return uc.U(object);
    }

    private int u(Object object) {
        try {
            if (kX.C() >= 50) {
                return this.h.R(object, new Object[0]);
            }
        }
        catch (O_ o_2) {
            throw Uc.a(o_2);
        }
        return this.C.R(object);
    }

    private Object U(Object object) {
        return this.M.Z(object);
    }

    private int P(Object object, Object object2) {
        return this.A.R(object, object2);
    }

    private static Field g(long l10, long l11) {
        int n2 = Uc.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = Uc.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = Uc.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Uc.c(clazz3, string2, clazz2)) != null) {
                    Uc.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = Uc.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        Uc.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Uc.f(638749747758170L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static int P(Uc uc, Object object) {
        return uc.G(object);
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
                n4 = 60;
                break;
            }
            case 1: {
                n4 = 7;
                break;
            }
            case 2: {
                n4 = 45;
                break;
            }
            case 3: {
                n4 = 47;
                break;
            }
            case 4: {
                n4 = 19;
                break;
            }
            case 5: {
                n4 = 35;
                break;
            }
            case 6: {
                n4 = 46;
                break;
            }
            case 7: {
                n4 = 2;
                break;
            }
            case 8: {
                n4 = 27;
                break;
            }
            case 9: {
                n4 = 30;
                break;
            }
            case 10: {
                n4 = 33;
                break;
            }
            case 11: {
                n4 = 8;
                break;
            }
            case 12: {
                n4 = 1;
                break;
            }
            case 13: {
                n4 = 43;
                break;
            }
            case 14: {
                n4 = 39;
                break;
            }
            case 15: {
                n4 = 52;
                break;
            }
            case 16: {
                n4 = 13;
                break;
            }
            case 17: {
                n4 = 49;
                break;
            }
            case 18: {
                n4 = 26;
                break;
            }
            case 19: {
                n4 = 42;
                break;
            }
            case 20: {
                n4 = 20;
                break;
            }
            case 21: {
                n4 = 21;
                break;
            }
            case 22: {
                n4 = 48;
                break;
            }
            case 23: {
                n4 = 23;
                break;
            }
            case 24: {
                n4 = 56;
                break;
            }
            case 25: {
                n4 = 36;
                break;
            }
            case 26: {
                n4 = 34;
                break;
            }
            case 27: {
                n4 = 54;
                break;
            }
            case 28: {
                n4 = 10;
                break;
            }
            case 29: {
                n4 = 5;
                break;
            }
            case 30: {
                n4 = 22;
                break;
            }
            case 31: {
                n4 = 9;
                break;
            }
            case 32: {
                n4 = 11;
                break;
            }
            case 33: {
                n4 = 37;
                break;
            }
            case 34: {
                n4 = 40;
                break;
            }
            case 35: {
                n4 = 17;
                break;
            }
            case 36: {
                n4 = 28;
                break;
            }
            case 37: {
                n4 = 53;
                break;
            }
            case 38: {
                n4 = 51;
                break;
            }
            case 39: {
                n4 = 38;
                break;
            }
            case 40: {
                n4 = 24;
                break;
            }
            case 41: {
                n4 = 62;
                break;
            }
            case 42: {
                n4 = 44;
                break;
            }
            case 43: {
                n4 = 55;
                break;
            }
            case 44: {
                n4 = 32;
                break;
            }
            case 45: {
                n4 = 6;
                break;
            }
            case 46: {
                n4 = 29;
                break;
            }
            case 47: {
                n4 = 15;
                break;
            }
            case 48: {
                n4 = 61;
                break;
            }
            case 49: {
                n4 = 50;
                break;
            }
            case 50: {
                n4 = 18;
                break;
            }
            case 51: {
                n4 = 58;
                break;
            }
            case 52: {
                n4 = 12;
                break;
            }
            case 53: {
                n4 = 31;
                break;
            }
            case 54: {
                n4 = 57;
                break;
            }
            case 55: {
                n4 = 0;
                break;
            }
            case 56: {
                n4 = 59;
                break;
            }
            case 57: {
                n4 = 14;
                break;
            }
            case 58: {
                n4 = 63;
                break;
            }
            case 59: {
                n4 = 3;
                break;
            }
            case 60: {
                n4 = 4;
                break;
            }
            case 61: {
                n4 = 41;
                break;
            }
            case 62: {
                n4 = 25;
                break;
            }
            default: {
                n4 = 16;
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
        Uc.f[n5] = new String(cArray);
        return n5;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Uc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Uc.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

