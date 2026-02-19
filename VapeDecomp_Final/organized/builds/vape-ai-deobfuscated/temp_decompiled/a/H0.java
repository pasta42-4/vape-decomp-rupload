/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.X_;
import a.cl;
import a.d8;
import a.hm;
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

public class h0
extends hm {
    private static final String[] pb;
    private static final Integer[] kb;
    private static final long[] jb;
    private static final long bb;
    private final cl QU;
    private static final Object[] ob;
    private static final Map lb;
    private final boolean QI;

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void U() {
    }

    @Override
    public double e() {
        return 10.0;
    }

    private static Field k(long l10, long l11) {
        int n2 = h0.i(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            String string = pb[n2];
            int n3 = string.indexOf(8);
            Class clazz = h0.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = h0.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = h0.e(clazz3, string2, clazz2)) != null) {
                    h0.ob[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = h0.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        h0.ob[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = h0.j(278765497484426L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = h0.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = h0.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = h0.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/h0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = h0.i(l10, l11);
            object = ob[n2];
            try {
                if (!(object instanceof String)) break block2;
                h0.ob[n2] = clazz = Class.forName(pb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void G() {
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = h0.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'y' || c10 == '\u00f1' || c10 == 'V' || c10 == 'W') {
                field = h0.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'V' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = h0.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00eb' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void n() {
        Object[] objectArray = ob;
        ob[0] = "cFn";
        objectArray[1] = Integer.TYPE;
        h0.pb[1] = "java/lang/Integer";
        objectArray[2] = "\u001a;$9\u0017E\u001145vj]\u00023<?";
        objectArray[3] = "x\u0012bPD\u0007s\u001ds\u001f%\tx\u0016wE";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "S$\u007f\b{.\u0016?#3~mh2,H%*Tv*\u000b\u0015/\b ,Nq,U6\u007f3";
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = h0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = h0.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static O_ c(O_ o_2) {
        return o_2;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2927;
        if (kb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = jb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/h0", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            h0.kb[n3] = n4;
        }
        return kb[n3];
    }

    @Override
    public void E() {
        block13: {
            float f10;
            float f11;
            Color color;
            long l10;
            block12: {
                Color color2;
                block11: {
                    block10: {
                        Color color3;
                        double d2;
                        double d3;
                        double d4;
                        double d5;
                        Color color4;
                        double d6;
                        double d7;
                        double d9;
                        double d10;
                        l10 = bb ^ 0x5FDE97B57432L;
                        try {
                            d10 = this.G();
                            d9 = this.W();
                            d7 = this.w();
                            d6 = this.b();
                            color4 = this.h() ? h0.M.g : h0.M.W;
                        }
                        catch (O_ o_2) {
                            throw h0.c(o_2);
                        }
                        try {
                            F8.S(d10, d9, d7, d6, color4);
                            d5 = this.G();
                            d4 = this.W();
                            d3 = this.w();
                            d2 = this.b();
                            color3 = this.h() ? h0.M.k : h0.M.S;
                        }
                        catch (O_ o_3) {
                            throw h0.c(o_3);
                        }
                        try {
                            F8.U(d5, d4, d3, d2, color3, 1.0f, 0.75f, 1.0f);
                            super.E();
                            if (!this.V()) break block10;
                            color2 = h0.M.c;
                            break block11;
                        }
                        catch (O_ o_4) {
                            throw h0.c(o_4);
                        }
                    }
                    try {
                        color2 = this.h() ? h0.M.c : h0.M.n;
                    }
                    catch (O_ o_5) {
                        throw h0.c(o_5);
                    }
                }
                color = color2;
                f11 = (float)(this.W() + this.b() / 2.0) - 2.0f;
                f10 = (float)this.G() + 2.5f;
                try {
                    if (!this.QI) break block12;
                    X_.B(color, f10, f11, (String)((Object)h0.e("\u00ff", (int)h0.c("f", (int)6300, (long)(0x23B433E29FA45C83L ^ l10)), (long)7870394855340883354L, (long)l10)), 5.0f, 5.0f, false);
                    X_.B(h0.M.O, f10, f11, (String)((Object)h0.e("\u00ff", (int)h0.c("f", (int)17156, (long)(0x18EEC018C3FC0718L ^ l10)), (long)7870394855340883354L, (long)l10)), 5.0f, 5.0f, false);
                    break block13;
                }
                catch (O_ o_6) {
                    throw h0.c(o_6);
                }
            }
            X_.B(color, f10, f11, (String)((Object)h0.e("\u00ff", (int)h0.c("f", (int)818, (long)(0x183E0060311AC728L ^ l10)), (long)7870394855340883354L, (long)l10)), 5.0f, 5.0f, false);
            X_.B(h0.M.Y, f10, f11, (String)((Object)h0.e("\u00ff", (int)h0.c("f", (int)15441, (long)(0x1B4DAD6E492C784AL ^ l10)), (long)7870394855340883354L, (long)l10)), 5.0f, 5.0f, false);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/h0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method l(long l10, long l11) {
        int n2 = h0.i(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = h0.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = h0.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = h0.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        h0.ob[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = h0.j(278765497484426L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = h0.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        h0.ob[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = h0.j(278765497484426L, 0L);
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

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (pb[n5] != null) {
            return n5;
        }
        Object object = ob[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 28;
                break;
            }
            case 1: {
                n4 = 49;
                break;
            }
            case 2: {
                n4 = 13;
                break;
            }
            case 3: {
                n4 = 33;
                break;
            }
            case 4: {
                n4 = 48;
                break;
            }
            case 5: {
                n4 = 19;
                break;
            }
            case 6: {
                n4 = 5;
                break;
            }
            case 7: {
                n4 = 45;
                break;
            }
            case 8: {
                n4 = 4;
                break;
            }
            case 9: {
                n4 = 44;
                break;
            }
            case 10: {
                n4 = 62;
                break;
            }
            case 11: {
                n4 = 60;
                break;
            }
            case 12: {
                n4 = 27;
                break;
            }
            case 13: {
                n4 = 54;
                break;
            }
            case 14: {
                n4 = 59;
                break;
            }
            case 15: {
                n4 = 53;
                break;
            }
            case 16: {
                n4 = 42;
                break;
            }
            case 17: {
                n4 = 12;
                break;
            }
            case 18: {
                n4 = 36;
                break;
            }
            case 19: {
                n4 = 9;
                break;
            }
            case 20: {
                n4 = 16;
                break;
            }
            case 21: {
                n4 = 6;
                break;
            }
            case 22: {
                n4 = 35;
                break;
            }
            case 23: {
                n4 = 14;
                break;
            }
            case 24: {
                n4 = 2;
                break;
            }
            case 25: {
                n4 = 10;
                break;
            }
            case 26: {
                n4 = 57;
                break;
            }
            case 27: {
                n4 = 43;
                break;
            }
            case 28: {
                n4 = 8;
                break;
            }
            case 29: {
                n4 = 15;
                break;
            }
            case 30: {
                n4 = 37;
                break;
            }
            case 31: {
                n4 = 63;
                break;
            }
            case 32: {
                n4 = 29;
                break;
            }
            case 33: {
                n4 = 24;
                break;
            }
            case 34: {
                n4 = 51;
                break;
            }
            case 35: {
                n4 = 61;
                break;
            }
            case 36: {
                n4 = 47;
                break;
            }
            case 37: {
                n4 = 46;
                break;
            }
            case 38: {
                n4 = 41;
                break;
            }
            case 39: {
                n4 = 58;
                break;
            }
            case 40: {
                n4 = 34;
                break;
            }
            case 41: {
                n4 = 55;
                break;
            }
            case 42: {
                n4 = 40;
                break;
            }
            case 43: {
                n4 = 1;
                break;
            }
            case 44: {
                n4 = 7;
                break;
            }
            case 45: {
                n4 = 17;
                break;
            }
            case 46: {
                n4 = 38;
                break;
            }
            case 47: {
                n4 = 3;
                break;
            }
            case 48: {
                n4 = 20;
                break;
            }
            case 49: {
                n4 = 56;
                break;
            }
            case 50: {
                n4 = 23;
                break;
            }
            case 51: {
                n4 = 11;
                break;
            }
            case 52: {
                n4 = 0;
                break;
            }
            case 53: {
                n4 = 32;
                break;
            }
            case 54: {
                n4 = 21;
                break;
            }
            case 55: {
                n4 = 30;
                break;
            }
            case 56: {
                n4 = 26;
                break;
            }
            case 57: {
                n4 = 25;
                break;
            }
            case 58: {
                n4 = 39;
                break;
            }
            case 59: {
                n4 = 50;
                break;
            }
            case 60: {
                n4 = 18;
                break;
            }
            case 61: {
                n4 = 52;
                break;
            }
            case 62: {
                n4 = 22;
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
        h0.pb[n5] = new String(cArray);
        return n5;
    }

    /*
     * Unable to fully structure code
     */
    public h0(cl var1_1) {
        block3: {
            block2: {
                var2_2 = h0.bb ^ 42562682817792L;
                super(var1_1);
                this.g((String)h0.e("\u00ff", (int)h0.c("f", (int)8477, (long)(2036722187758705713L ^ var2_2)), (long)1444312978978882728L, (long)var2_2) + var1_1.O());
                this.QU = var1_1;
                if (var1_1.O().contains((CharSequence)h0.e("\u00ff", (int)h0.c("f", (int)2904, (long)(4606229038387443315L ^ var2_2)), (long)1444312978978882728L, (long)var2_2))) ** GOTO lbl9
                try {
                    if (!var1_1.O().contains((CharSequence)h0.e("\u00ff", (int)h0.c("f", (int)3708, (long)(2081354700035437395L ^ var2_2)), (long)1444312978978882728L, (long)var2_2))) break block2;
lbl9:
                    // 2 sources

                    v0 = true;
                    break block3;
                }
                catch (O_ v1) {
                    throw h0.c(v1);
                }
            }
            v0 = false;
        }
        this.QI = v0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                h0.bb = d8.a(3710500003134630737L, 2757817528025317565L, MethodHandles.lookup().lookupClass()).a(235709591134419L);
                h0.ob = new Object[5];
                h0.pb = new String[5];
                h0.n();
                h0.lb = new HashMap<K, V>(13);
                var0 = h0.bb ^ 45303519135523L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "U\u00c4\u00b3\u001e:\u009c\u00952\u00d1\u00f1\u00ead\u00b9\u009chf}m\u000e,\u0086\u00e0\u00bfv\u0004\u00fb\u00f5\u00d3\u00d0n\u009c\u00b7\\m\b>\u0096ko\u008d";
                var7_6 = "U\u00c4\u00b3\u001e:\u009c\u00952\u00d1\u00f1\u00ead\u00b9\u009chf}m\u000e,\u0086\u00e0\u00bfv\u0004\u00fb\u00f5\u00d3\u00d0n\u009c\u00b7\\m\b>\u0096ko\u008d".length();
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
                    var6_5 = "\u00dbw\u0016\u00c0\u00fe\u00cb\u0096\u001dl\u00ab!\u00c4.\u0094'\u00f8";
                    var7_6 = "\u00dbw\u0016\u00c0\u00fe\u00cb\u0096\u001dl\u00ab!\u00c4.\u0094'\u00f8".length();
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
        h0.jb = var8_3;
        h0.kb = new Integer[7];
    }

    @Override
    public double z() {
        return 10.0;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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
            return MethodHandles.lookup().findStatic(h0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(h0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

