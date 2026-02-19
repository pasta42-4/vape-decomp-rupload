/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Ib;
import a.Na;
import a.O_;
import a.QF;
import a.d8;
import a.eM;
import a.ht;
import a.iN;
import a.ic;
import a.kX;
import a.qv;
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

public class q_
extends v2 {
    private static final Map d;
    private final HK t;
    private static final long a;
    private static final String[] f;
    private static final Object[] e;
    private static final Integer[] c;
    private final HK C;
    private static final long[] b;
    private Ib n;
    private Ib Q;

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = q_.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = q_.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e4' || c10 == '\u00c2' || c10 == '\u00d2' || c10 == 'G') {
                field = q_.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = q_.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public q_() {
        block17: {
            Object object;
            block15: {
                q_ q_2;
                int n2;
                int n3;
                String string;
                long l10;
                block13: {
                    block14: {
                        l10 = a ^ 0x2851BFB21774L;
                        String string2 = qv.h();
                        super(eM.Et);
                        string = string2;
                        try {
                            try {
                                n3 = kX.C();
                                n2 = 15;
                                if (string == null) break block13;
                                if (n3 != n2) break block14;
                            }
                            catch (O_ o_2) {
                                throw q_.a(o_2);
                            }
                            this.Q = q_.c("\u00e3", (Object)this, (Object)eM.Et, (Object)q_.c("\u00b5", (int)q_.b("g", (int)31884, (long)(0x4396DF4C264A1CD3L ^ l10)), (long)-8412027055819956649L, (long)l10), (boolean)true, (Object)eM.Y4, (long)-8411931255395614115L, (long)l10);
                        }
                        catch (O_ o_3) {
                            throw q_.a(o_3);
                        }
                    }
                    try {
                        q_2 = this;
                        object = ((ic)((ic)((iN)((Object)q_.c("\u00e3", (Object)this, (Object)q_.c("\u00b5", (int)q_.b("g", (int)23438, (long)(0x4BE9FEFC788B3BD7L ^ l10)), (long)-8412027055819956649L, (long)l10), (Object)eM.PE, (Object)new Class[]{Integer.TYPE}, (long)-8411985142191950861L, (long)l10))).e(Na.MC_1_16_5.R(), (String)((Object)q_.c("\u00b5", (int)q_.b("g", (int)25834, (long)(0xB54A362269A04B4L ^ l10)), (long)-8412027055819956649L, (long)l10)))).V(Na.MC_1_21_4.R(), eM.EV)).M();
                        if (string == null) break block15;
                        q_2.t = object;
                        n3 = kX.C();
                        n2 = 35;
                    }
                    catch (O_ o_4) {
                        throw q_.a(o_4);
                    }
                }
                try {
                    block16: {
                        try {
                            if (n3 < n2) break block16;
                            this.C = q_.c("\u00e3", (Object)this, (Object)q_.c("\u00b5", (int)q_.b("g", (int)7929, (long)(0x29833C2EC17BFEA1L ^ l10)), (long)-8412027055819956649L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, eM.PE}, (long)-8412155049451128018L, (long)l10);
                            this.n = q_.c("\u00e3", (Object)this, (Object)eM.Et, (Object)q_.c("\u00b5", (int)q_.b("g", (int)25235, (long)(0x68092C93C19802CFL ^ l10)), (long)-8412027055819956649L, (long)l10), (boolean)true, (Object)eM.k, (long)-8411931255395614115L, (long)l10);
                            if (string != null) break block17;
                        }
                        catch (O_ o_5) {
                            throw q_.a(o_5);
                        }
                    }
                    q_2 = this;
                    object = q_.c("\u00e3", (Object)this, (Object)q_.c("\u00b5", (int)q_.b("g", (int)27967, (long)(0x794BFBEEAB4A0D62L ^ l10)), (long)-8412027055819956649L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, eM.PE}, (long)-8412155049451128018L, (long)l10);
                }
                catch (O_ o_6) {
                    throw q_.a(o_6);
                }
            }
            q_2.C = object;
        }
        try {
            if (ht.J() != null) {
                qv.M("JT5P1b");
            }
        }
        catch (O_ o_7) {
            throw q_.a(o_7);
        }
    }

    public Object U(Object object, int n2) {
        return this.t.T(object, n2);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = q_.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u001eOs\u0017";
        objectArray[1] = "n[\u001dB\u0015QeT\f\rhIvS\u0005D";
        objectArray[2] = Boolean.TYPE;
        q_.f[2] = "java/lang/Boolean";
        objectArray[3] = "68\u0006\u0011CU=7\u0017^.U=*\u0003";
        objectArray[4] = "_'y]xQ*\u0007rRi\u001eG\u0007rO}\u000b";
        objectArray[5] = "@E1\u007f";
        objectArray[6] = "\u0018\u0015O";
        objectArray[7] = Integer.TYPE;
        q_.f[7] = "java/lang/Integer";
        objectArray[8] = "\u000e\u0018,\u0003dt{8'\fu;\u00168'\u0011a.";
        objectArray[9] = "e\u000b\u0006l";
        objectArray[10] = "J\u000fa\u007f";
        objectArray[11] = "{\\\u0004`,7pS\u0015/M9{X\u0011u";
        objectArray[12] = "\u001d\u0014G\u001fj\u0004\u001c\u0006[|\u0010fGBA\u0019l\u0017\u0011\u0013T\u001dW_\u0018\u000f^G;\u001c\u000e\u001dX|m\u001f\u0017\u0000VM(^\u0019A;Bm\u000f\u001d\u001eV\u0005<\u0002\u0010}\u0000\u0002+VD\u0011R\u0018f\u0006~";
        objectArray[13] = "ft56a\u00008jou\f\u0013!\u0013cds\u0018+u\"{1AZ*asiC+|0fmx";
        objectArray[14] = "W\u0004I\u0016\\@V\u0016Uu\u0003\"\rRO\u0010ZS[\u0003Z\u0014a\u0018M\u0004H\u0018P]\f\n\tu_\u0018]\u000eV\u0018\u0018IP\u00035K\bL\u0004\u0006[\u0019\u0010@Im";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "5.HI9|4<T*U\u001el>]Wi/)\u007fS\u0016\u0004'i=Q\u0011uq8(U*=x$\"\u000fF~n6$4\u0010}w+*\u0005U<yjG\u000b\u0014ey&wWV\u007f|V";
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
                n4 = 63;
                break;
            }
            case 1: {
                n4 = 51;
                break;
            }
            case 2: {
                n4 = 45;
                break;
            }
            case 3: {
                n4 = 13;
                break;
            }
            case 4: {
                n4 = 40;
                break;
            }
            case 5: {
                n4 = 2;
                break;
            }
            case 6: {
                n4 = 49;
                break;
            }
            case 7: {
                n4 = 1;
                break;
            }
            case 8: {
                n4 = 41;
                break;
            }
            case 9: {
                n4 = 9;
                break;
            }
            case 10: {
                n4 = 47;
                break;
            }
            case 11: {
                n4 = 12;
                break;
            }
            case 12: {
                n4 = 46;
                break;
            }
            case 13: {
                n4 = 3;
                break;
            }
            case 14: {
                n4 = 16;
                break;
            }
            case 15: {
                n4 = 25;
                break;
            }
            case 16: {
                n4 = 48;
                break;
            }
            case 17: {
                n4 = 26;
                break;
            }
            case 18: {
                n4 = 60;
                break;
            }
            case 19: {
                n4 = 61;
                break;
            }
            case 20: {
                n4 = 35;
                break;
            }
            case 21: {
                n4 = 57;
                break;
            }
            case 22: {
                n4 = 29;
                break;
            }
            case 23: {
                n4 = 31;
                break;
            }
            case 24: {
                n4 = 38;
                break;
            }
            case 25: {
                n4 = 54;
                break;
            }
            case 26: {
                n4 = 59;
                break;
            }
            case 27: {
                n4 = 37;
                break;
            }
            case 28: {
                n4 = 5;
                break;
            }
            case 29: {
                n4 = 33;
                break;
            }
            case 30: {
                n4 = 17;
                break;
            }
            case 31: {
                n4 = 20;
                break;
            }
            case 32: {
                n4 = 36;
                break;
            }
            case 33: {
                n4 = 11;
                break;
            }
            case 34: {
                n4 = 0;
                break;
            }
            case 35: {
                n4 = 21;
                break;
            }
            case 36: {
                n4 = 19;
                break;
            }
            case 37: {
                n4 = 62;
                break;
            }
            case 38: {
                n4 = 7;
                break;
            }
            case 39: {
                n4 = 30;
                break;
            }
            case 40: {
                n4 = 14;
                break;
            }
            case 41: {
                n4 = 18;
                break;
            }
            case 42: {
                n4 = 10;
                break;
            }
            case 43: {
                n4 = 4;
                break;
            }
            case 44: {
                n4 = 55;
                break;
            }
            case 45: {
                n4 = 58;
                break;
            }
            case 46: {
                n4 = 8;
                break;
            }
            case 47: {
                n4 = 32;
                break;
            }
            case 48: {
                n4 = 42;
                break;
            }
            case 49: {
                n4 = 56;
                break;
            }
            case 50: {
                n4 = 6;
                break;
            }
            case 51: {
                n4 = 15;
                break;
            }
            case 52: {
                n4 = 52;
                break;
            }
            case 53: {
                n4 = 24;
                break;
            }
            case 54: {
                n4 = 27;
                break;
            }
            case 55: {
                n4 = 44;
                break;
            }
            case 56: {
                n4 = 34;
                break;
            }
            case 57: {
                n4 = 50;
                break;
            }
            case 58: {
                n4 = 23;
                break;
            }
            case 59: {
                n4 = 39;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 28;
                break;
            }
            case 62: {
                n4 = 22;
                break;
            }
            default: {
                n4 = 43;
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
        q_.f[n5] = new String(cArray);
        return n5;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x6B1D;
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
                throw new RuntimeException("a/q_", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            q_.c[n3] = n4;
        }
        return c[n3];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = q_.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = q_.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                q_.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void t(Object object, int n2, QF qF2) {
        try {
            if (kX.C() >= 50) {
                this.C.l(object, qF2.M());
                return;
            }
        }
        catch (O_ o_2) {
            throw q_.a(o_2);
        }
        this.C.l(object, n2, qF2.M());
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field g(long l10, long l11) {
        int n2 = q_.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = q_.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = q_.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = q_.c(clazz3, string2, clazz2)) != null) {
                    q_.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = q_.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        q_.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = q_.f(801979943554806L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public Object n(Object object) {
        return this.n.Z(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                q_.a = d8.a(1922755368670258653L, -4660501329375851142L, MethodHandles.lookup().lookupClass()).a(271390524848263L);
                q_.e = new Object[16];
                q_.f = new String[16];
                q_.a();
                q_.d = new HashMap<K, V>(13);
                var0 = q_.a ^ 36911977155828L;
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
                var6_5 = "79\u00dc\u00b6\u00b03\u0000\u00d42\u00f0\u00b3\u00cf\u00f5&C\u0095\u0098\u00be\u00dc\u00f1\u0006\u0086\u00809b\u00d8K?\u00c6\u00bc-\u00da";
                var7_6 = "79\u00dc\u00b6\u00b03\u0000\u00d42\u00f0\u00b3\u00cf\u00f5&C\u0095\u0098\u00be\u00dc\u00f1\u0006\u0086\u00809b\u00d8K?\u00c6\u00bc-\u00da".length();
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
                    var6_5 = "\u0080\u0080XZyC\u00fd7\u0001_\u0095v\u00ed\u00aaB!";
                    var7_6 = "\u0080\u0080XZyC\u00fd7\u0001_\u0095v\u00ed\u00aaB!".length();
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
        q_.b = var8_3;
        q_.c = new Integer[6];
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = q_.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = q_.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("a/q_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Object V(Object object) {
        return this.Q.Z(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(long l10, long l11) {
        int n2 = q_.e(l10, l11);
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
                clazz3 = q_.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = q_.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = q_.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        q_.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = q_.f(801979943554806L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = q_.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        q_.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = q_.f(801979943554806L, 0L);
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
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(q_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(q_.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

