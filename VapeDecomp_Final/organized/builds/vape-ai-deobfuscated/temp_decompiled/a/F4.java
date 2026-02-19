/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.G5;
import a.SE;
import a.d8;
import a.j5;
import a.kW;
import a.wN;
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

public class f4
extends wN {
    private static final Object[] Ib;
    private static final Map xb;
    private static final long[] vb;
    private static final Integer[] wb;
    private j5 Nb;
    private static final long fb;
    private static final String[] Jb;
    private kW NU;

    public f4() {
        long l10 = fb ^ 0x7C275664B6E0L;
        super(j5.class);
        this.NU = new kW((String)((Object)f4.l("K", (int)f4.f("y", (int)15826, (long)(0x1EBE67289667C2D4L ^ l10)), (long)6163200556004971262L, (long)l10)));
        this.Nb = (j5)this.t();
    }

    private static Field w(long l10, long l11) {
        int n2 = f4.u(l10, l11);
        Object object = Ib[n2];
        if (object instanceof String) {
            String string = Jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = f4.v(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = f4.v(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = f4.k(clazz3, string2, clazz2)) != null) {
                    f4.Ib[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = f4.l(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        f4.Ib[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = f4.v(222986989561009L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                f4.fb = d8.a(-1090931410961794831L, -1682899265866166957L, MethodHandles.lookup().lookupClass()).a(15685709213964L);
                f4.Ib = new Object[5];
                f4.Jb = new String[5];
                f4.T();
                f4.xb = new HashMap<K, V>(13);
                var0 = f4.fb ^ 40829502795954L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "?\u0016\u00e7\u0097\u0013\u00fdum\u00a0T\u00a9*\u00ceH\u00c3=";
                var7_6 = "?\u0016\u00e7\u0097\u0013\u00fdum\u00a0T\u00a9*\u00ceH\u00c3=".length();
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
                    var6_5 = "\u00a0fPn\u00d4L\u0015\u0083\u00fb\u00f5\u00bc<\u008bT\u00c3\u00e3";
                    var7_6 = "\u00a0fPn\u00d4L\u0015\u0083\u00fb\u00f5\u00bc<\u008bT\u00c3\u00e3".length();
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
        f4.vb = var8_3;
        f4.wb = new Integer[4];
    }

    @Override
    public double b() {
        return 20.0;
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'x' || c10 == '\u00fe' || c10 == 'R' || c10 == 'y') {
                field = f4.w(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = f4.x(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '$' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int u(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (Jb[n5] != null) {
            return n5;
        }
        Object object = Ib[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 4;
                break;
            }
            case 1: {
                n4 = 40;
                break;
            }
            case 2: {
                n4 = 1;
                break;
            }
            case 3: {
                n4 = 38;
                break;
            }
            case 4: {
                n4 = 46;
                break;
            }
            case 5: {
                n4 = 50;
                break;
            }
            case 6: {
                n4 = 5;
                break;
            }
            case 7: {
                n4 = 17;
                break;
            }
            case 8: {
                n4 = 2;
                break;
            }
            case 9: {
                n4 = 45;
                break;
            }
            case 10: {
                n4 = 44;
                break;
            }
            case 11: {
                n4 = 29;
                break;
            }
            case 12: {
                n4 = 35;
                break;
            }
            case 13: {
                n4 = 61;
                break;
            }
            case 14: {
                n4 = 56;
                break;
            }
            case 15: {
                n4 = 26;
                break;
            }
            case 16: {
                n4 = 63;
                break;
            }
            case 17: {
                n4 = 47;
                break;
            }
            case 18: {
                n4 = 11;
                break;
            }
            case 19: {
                n4 = 37;
                break;
            }
            case 20: {
                n4 = 19;
                break;
            }
            case 21: {
                n4 = 16;
                break;
            }
            case 22: {
                n4 = 23;
                break;
            }
            case 23: {
                n4 = 49;
                break;
            }
            case 24: {
                n4 = 39;
                break;
            }
            case 25: {
                n4 = 52;
                break;
            }
            case 26: {
                n4 = 9;
                break;
            }
            case 27: {
                n4 = 31;
                break;
            }
            case 28: {
                n4 = 41;
                break;
            }
            case 29: {
                n4 = 27;
                break;
            }
            case 30: {
                n4 = 62;
                break;
            }
            case 31: {
                n4 = 36;
                break;
            }
            case 32: {
                n4 = 48;
                break;
            }
            case 33: {
                n4 = 13;
                break;
            }
            case 34: {
                n4 = 54;
                break;
            }
            case 35: {
                n4 = 33;
                break;
            }
            case 36: {
                n4 = 34;
                break;
            }
            case 37: {
                n4 = 20;
                break;
            }
            case 38: {
                n4 = 0;
                break;
            }
            case 39: {
                n4 = 21;
                break;
            }
            case 40: {
                n4 = 28;
                break;
            }
            case 41: {
                n4 = 43;
                break;
            }
            case 42: {
                n4 = 22;
                break;
            }
            case 43: {
                n4 = 6;
                break;
            }
            case 44: {
                n4 = 42;
                break;
            }
            case 45: {
                n4 = 59;
                break;
            }
            case 46: {
                n4 = 60;
                break;
            }
            case 47: {
                n4 = 51;
                break;
            }
            case 48: {
                n4 = 53;
                break;
            }
            case 49: {
                n4 = 10;
                break;
            }
            case 50: {
                n4 = 25;
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
                n4 = 8;
                break;
            }
            case 54: {
                n4 = 57;
                break;
            }
            case 55: {
                n4 = 3;
                break;
            }
            case 56: {
                n4 = 55;
                break;
            }
            case 57: {
                n4 = 24;
                break;
            }
            case 58: {
                n4 = 15;
                break;
            }
            case 59: {
                n4 = 18;
                break;
            }
            case 60: {
                n4 = 7;
                break;
            }
            case 61: {
                n4 = 14;
                break;
            }
            case 62: {
                n4 = 32;
                break;
            }
            default: {
                n4 = 30;
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
        f4.Jb[n5] = new String(cArray);
        return n5;
    }

    @Override
    public void V() {
        long l10 = fb ^ 0x57D8C1E07F58L;
        G5 g5 = SE.h.W().T(1.0, true);
        Object object = this.NU.x(this.Nb.I());
        if (this.Nb.I() == 0.0f) {
            object = f4.l("K", (int)f4.f("y", (int)17666, (long)(0x61A74EBEBB4EF3BEL ^ l10)), (long)-7192180710140126394L, (long)l10);
        }
        object = (String)object + (String)((Object)f4.l("K", (int)f4.f("y", (int)16227, (long)(0x574C88E70D0189DEL ^ l10)), (long)-7192180710140126394L, (long)l10));
        g5.R((String)object, this.G() + 5.0, this.W() + 5.5, this.A());
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

    private static CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public String A() {
        long l10 = fb ^ 0x4873FD6FA0F8L;
        return f4.l("K", (int)f4.f("y", (int)3879, (long)(0x21228B586D31E638L ^ l10)), (long)4868428669823059174L, (long)l10);
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = f4.f(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Class v(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = f4.u(l10, l11);
            object = Ib[n2];
            try {
                if (!(object instanceof String)) break block2;
                f4.Ib[n2] = clazz = Class.forName(Jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int f(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2A8C;
        if (wb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = vb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])xb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    xb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/f4", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            f4.wb[n3] = n4;
        }
        return wb[n3];
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method l(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = f4.k(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = f4.l(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = f4.f(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method x(long l10, long l11) {
        int n2 = f4.u(l10, l11);
        Object object = Ib[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = Jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = f4.v(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = f4.v(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = f4.k(clazz, string, clazz2, n3, classArray2)) != null) {
                        f4.Ib[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = f4.v(222986989561009L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = f4.l(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        f4.Ib[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = f4.v(222986989561009L, 0L);
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

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = f4.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = f4.l(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public double w() {
        return 50.0;
    }

    private static void T() {
        Object[] objectArray = Ib;
        Ib[0] = "\u00052k";
        objectArray[1] = Integer.TYPE;
        f4.Jb[1] = "java/lang/Integer";
        objectArray[2] = "\u001b\"`\u0006oo\u0010-qI\u0012w\u0003*x\u0000";
        objectArray[3] = "*+\u007f}\u001et!$n2\u007fz*/jh";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "ycJW*&\"hQm?6\u001e*OV27xj\u001eP%M$+\u0012\u0010m)njY\u000fT";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(f4.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(f4.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

