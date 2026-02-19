/*
 * Decompiled with CFR 0.152.
 */
package a;

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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class m1
extends v2 {
    private Ib D;
    private static final Map d;
    private Ib X;
    private static final long[] b;
    private Ib S;
    private Ib W;
    private final Ib Q;
    private static final long a;
    private static final Object[] e;
    private static final Integer[] c;
    private static final String[] f;

    private int e(Object object) {
        return this.S.R(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00c7' || c10 == 'L' || c10 == '\u00f1' || c10 == '\u00f6') {
                field = m1.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'L' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = m1.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'O' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private int R(Object object) {
        return this.W.R(object);
    }

    private void l(Object object, int n2) {
        this.W.t(object, n2);
    }

    private int z(Object object) {
        return this.D.R(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/m1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/m1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static int F(m1 m12, Object object) {
        return m12.J(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = m1.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = m1.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                m1.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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
                n4 = 59;
                break;
            }
            case 1: {
                n4 = 28;
                break;
            }
            case 2: {
                n4 = 8;
                break;
            }
            case 3: {
                n4 = 57;
                break;
            }
            case 4: {
                n4 = 63;
                break;
            }
            case 5: {
                n4 = 23;
                break;
            }
            case 6: {
                n4 = 6;
                break;
            }
            case 7: {
                n4 = 37;
                break;
            }
            case 8: {
                n4 = 31;
                break;
            }
            case 9: {
                n4 = 7;
                break;
            }
            case 10: {
                n4 = 1;
                break;
            }
            case 11: {
                n4 = 27;
                break;
            }
            case 12: {
                n4 = 38;
                break;
            }
            case 13: {
                n4 = 40;
                break;
            }
            case 14: {
                n4 = 30;
                break;
            }
            case 15: {
                n4 = 10;
                break;
            }
            case 16: {
                n4 = 20;
                break;
            }
            case 17: {
                n4 = 11;
                break;
            }
            case 18: {
                n4 = 51;
                break;
            }
            case 19: {
                n4 = 9;
                break;
            }
            case 20: {
                n4 = 34;
                break;
            }
            case 21: {
                n4 = 15;
                break;
            }
            case 22: {
                n4 = 42;
                break;
            }
            case 23: {
                n4 = 48;
                break;
            }
            case 24: {
                n4 = 49;
                break;
            }
            case 25: {
                n4 = 54;
                break;
            }
            case 26: {
                n4 = 46;
                break;
            }
            case 27: {
                n4 = 62;
                break;
            }
            case 28: {
                n4 = 47;
                break;
            }
            case 29: {
                n4 = 43;
                break;
            }
            case 30: {
                n4 = 56;
                break;
            }
            case 31: {
                n4 = 52;
                break;
            }
            case 32: {
                n4 = 13;
                break;
            }
            case 33: {
                n4 = 41;
                break;
            }
            case 34: {
                n4 = 61;
                break;
            }
            case 35: {
                n4 = 55;
                break;
            }
            case 36: {
                n4 = 53;
                break;
            }
            case 37: {
                n4 = 2;
                break;
            }
            case 38: {
                n4 = 12;
                break;
            }
            case 39: {
                n4 = 60;
                break;
            }
            case 40: {
                n4 = 36;
                break;
            }
            case 41: {
                n4 = 16;
                break;
            }
            case 42: {
                n4 = 21;
                break;
            }
            case 43: {
                n4 = 35;
                break;
            }
            case 44: {
                n4 = 5;
                break;
            }
            case 45: {
                n4 = 19;
                break;
            }
            case 46: {
                n4 = 18;
                break;
            }
            case 47: {
                n4 = 32;
                break;
            }
            case 48: {
                n4 = 58;
                break;
            }
            case 49: {
                n4 = 29;
                break;
            }
            case 50: {
                n4 = 22;
                break;
            }
            case 51: {
                n4 = 4;
                break;
            }
            case 52: {
                n4 = 17;
                break;
            }
            case 53: {
                n4 = 24;
                break;
            }
            case 54: {
                n4 = 50;
                break;
            }
            case 55: {
                n4 = 39;
                break;
            }
            case 56: {
                n4 = 0;
                break;
            }
            case 57: {
                n4 = 44;
                break;
            }
            case 58: {
                n4 = 3;
                break;
            }
            case 59: {
                n4 = 33;
                break;
            }
            case 60: {
                n4 = 25;
                break;
            }
            case 61: {
                n4 = 26;
                break;
            }
            case 62: {
                n4 = 45;
                break;
            }
            default: {
                n4 = 14;
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
        m1.f[n5] = new String(cArray);
        return n5;
    }

    public m1() {
        block18: {
            long l10;
            block19: {
                int n2;
                int n3;
                block16: {
                    l10 = a ^ 0x5887643C8012L;
                    int n4 = mj.L();
                    super(eM.bh);
                    n3 = n4;
                    try {
                        try {
                            block17: {
                                try {
                                    try {
                                        try {
                                            try {
                                                n2 = SE.h.d();
                                                if (n3 != 0) break block16;
                                                if (n2 == 0) break block17;
                                            }
                                            catch (O_ o_2) {
                                                throw m1.a(o_2);
                                            }
                                            n2 = kX.C();
                                            if (n3 != 0) break block16;
                                        }
                                        catch (O_ o_3) {
                                            throw m1.a(o_3);
                                        }
                                        if (n2 <= 13) break block17;
                                    }
                                    catch (O_ o_4) {
                                        throw m1.a(o_4);
                                    }
                                    this.Q = m1.c("O", (Object)this, (Object)m1.c("\u00e9", (int)m1.b("e", (int)15081, (long)(0x1AD933A17C642C4CL ^ l10)), (long)8029681398195608276L, (long)l10), (boolean)true, Integer.TYPE, (long)8029752798841838681L, (long)l10);
                                    this.D = m1.c("O", (Object)this, (Object)m1.c("\u00e9", (int)m1.b("e", (int)11613, (long)(0x60F7C74C8047BBFCL ^ l10)), (long)8029681398195608276L, (long)l10), (boolean)true, Integer.TYPE, (long)8029752798841838681L, (long)l10);
                                    this.S = m1.c("O", (Object)this, (Object)m1.c("\u00e9", (int)m1.b("e", (int)21162, (long)(0x761775EE5B2EC409L ^ l10)), (long)8029681398195608276L, (long)l10), (boolean)true, Integer.TYPE, (long)8029752798841838681L, (long)l10);
                                    this.W = m1.c("O", (Object)this, (Object)m1.c("\u00e9", (int)m1.b("e", (int)12887, (long)(0x6752F1FAAE03A4F3L ^ l10)), (long)8029681398195608276L, (long)l10), (boolean)true, Integer.TYPE, (long)8029752798841838681L, (long)l10);
                                    if (n3 == 0) break block18;
                                }
                                catch (O_ o_5) {
                                    throw m1.a(o_5);
                                }
                            }
                            this.Q = m1.c("O", (Object)this, (Object)m1.c("\u00e9", (int)m1.b("e", (int)13840, (long)(0x168FA075B25820B7L ^ l10)), (long)8029681398195608276L, (long)l10), (boolean)Hc.z, Integer.TYPE, (long)8029752798841838681L, (long)l10);
                            if (n3 != 0) break block19;
                        }
                        catch (O_ o_6) {
                            throw m1.a(o_6);
                        }
                        n2 = Na.MC_1_21_10.H() ? 1 : 0;
                    }
                    catch (O_ o_7) {
                        throw m1.a(o_7);
                    }
                }
                try {
                    block20: {
                        try {
                            if (n2 == 0) break block20;
                            this.X = m1.c("O", (Object)this, (Object)m1.c("\u00e9", (int)m1.b("e", (int)25444, (long)(0x7E576D9047E4F5C2L ^ l10)), (long)8029681398195608276L, (long)l10), (boolean)true, (Object)eM.YN, (long)8029752798841838681L, (long)l10);
                            if (n3 == 0) break block18;
                        }
                        catch (O_ o_8) {
                            throw m1.a(o_8);
                        }
                    }
                    this.D = m1.c("O", (Object)this, (Object)m1.c("\u00e9", (int)m1.b("e", (int)11242, (long)(0x61DDD0CB44BBD4AL ^ l10)), (long)8029681398195608276L, (long)l10), (boolean)Hc.z, Integer.TYPE, (long)8029752798841838681L, (long)l10);
                    this.S = m1.c("O", (Object)this, (Object)m1.c("\u00e9", (int)m1.b("e", (int)14084, (long)(0x45334611F1621ACL ^ l10)), (long)8029681398195608276L, (long)l10), (boolean)Hc.z, Integer.TYPE, (long)8029752798841838681L, (long)l10);
                }
                catch (O_ o_9) {
                    throw m1.a(o_9);
                }
            }
            this.W = m1.c("O", (Object)this, (Object)m1.c("\u00e9", (int)m1.b("e", (int)20844, (long)(0x2DB92CED503847CEL ^ l10)), (long)8029681398195608276L, (long)l10), (boolean)Hc.z, Integer.TYPE, (long)8029752798841838681L, (long)l10);
        }
    }

    static int n(m1 m12, Object object) {
        return m12.R(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = m1.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = m1.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private int J(Object object) {
        return this.Q.R(object);
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x79CD;
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
                throw new RuntimeException("a/m1", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            m1.c[n3] = n4;
        }
        return c[n3];
    }

    private Object M(Object object) {
        return this.X.Z(object);
    }

    private static Field g(long l10, long l11) {
        int n2 = m1.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = m1.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = m1.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = m1.c(clazz3, string2, clazz2)) != null) {
                    m1.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = m1.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        m1.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = m1.f(511579215847224L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void I(Object object, int n2) {
        this.D.t(object, n2);
    }

    static Object v(m1 m12, Object object) {
        return m12.M(object);
    }

    static void D(m1 m12, Object object, int n2) {
        m12.l(object, n2);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = m1.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                m1.a = d8.a(-4545153347749860405L, -3553260907481786666L, MethodHandles.lookup().lookupClass()).a(95187265897762L);
                m1.e = new Object[10];
                m1.f = new String[10];
                m1.a();
                m1.d = new HashMap<K, V>(13);
                var0 = m1.a ^ 18412557121174L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00ef/\u00b8\r\u001b\u001f\u00d5\u00d6^\u0000f\u0085\u0094h\u00ca\u00cdA\u0084\u00da\u00dc\u0010Kn4p\u0006\u00ea\u0011\u0092p'DK\u001a}\u00f4\u0093=\u00f6Q\u00ee\u0017v\u00c6O\u009cu@\u00cb\u00f5\u00a4\u00df#\u00f09'";
                var7_6 = "\u00ef/\u00b8\r\u001b\u001f\u00d5\u00d6^\u0000f\u0085\u0094h\u00ca\u00cdA\u0084\u00da\u00dc\u0010Kn4p\u0006\u00ea\u0011\u0092p'DK\u001a}\u00f4\u0093=\u00f6Q\u00ee\u0017v\u00c6O\u009cu@\u00cb\u00f5\u00a4\u00df#\u00f09'".length();
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
                    var6_5 = "\u00a1\u00826\u0083\u0085\u00f8\u00ea\u00f4c\u00e7W!\t\u0001%H";
                    var7_6 = "\u00a1\u00826\u0083\u0085\u00f8\u00ea\u00f4c\u00e7W!\t\u0001%H".length();
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
        m1.b = var8_3;
        m1.c = new Integer[9];
    }

    static int U(m1 m12, Object object) {
        return m12.e(object);
    }

    static void M(m1 m12, Object object, int n2) {
        m12.w(object, n2);
    }

    static void h(m1 m12, Object object, int n2) {
        m12.I(object, n2);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "qzo";
        objectArray[1] = Integer.TYPE;
        m1.f[1] = "java/lang/Integer";
        objectArray[2] = "`\u0003c3WEk\fr|*]x\u000b{5";
        objectArray[3] = "-+!q";
        objectArray[4] = Boolean.TYPE;
        m1.f[4] = "java/lang/Boolean";
        objectArray[5] = "xzP<L}suAs!}shU";
        objectArray[6] = "_k\u0017f";
        objectArray[7] = "}\u0005\fM\u0003Kv\n\u001d\u0002bE}\u0001\u0019X";
        objectArray[8] = "/q\t|}\u007f\u007f1\f<GN\u0015wYr*rx1P/\"\u0015.$Np\u007f.n<TsG))?Su>tr(\u0005L{nz>Zs o+ 4";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "l;x\u00132M>u*c?Y\u000fs*\\i^w'&_n\"6'%\u000e3Op.x\u0006T";
    }

    private static Method h(long l10, long l11) {
        int n2 = m1.e(l10, l11);
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
                clazz3 = m1.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = m1.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = m1.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        m1.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = m1.f(511579215847224L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = m1.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        m1.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = m1.f(511579215847224L, 0L);
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
        Field field = m1.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = m1.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void w(Object object, int n2) {
        this.S.t(object, n2);
    }

    private void U(Object object, Object object2) {
        this.X.L(object, object2);
    }

    static void z(m1 m12, Object object, Object object2) {
        m12.U(object, object2);
    }

    static int x(m1 m12, Object object) {
        return m12.z(object);
    }

    private static O_ a(O_ o_2) {
        return o_2;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(m1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

