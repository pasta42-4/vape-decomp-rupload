/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.G5;
import a.O_;
import a.Sz;
import a.bG;
import a.d8;
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

public class bb
extends bG {
    private static final String[] db;
    private int V;
    private int F;
    private static final Object[] bb;
    private static final Integer[] E;
    private static final long[] D;
    private static final long b;
    private static final Map ab;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = a.bb.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = a.bb.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void F(int n2) {
        this.V = n2;
    }

    @Override
    public void U() {
        this.m();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = a.bb.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00ea' || c10 == '\u00e2' || c10 == '\u00c5' || c10 == 'Y') {
                field = a.bb.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00e2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = a.bb.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00f5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = a.bb.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = a.bb.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public double z() {
        return 30.0;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = a.bb.e(l10, l11);
            object = bb[n2];
            try {
                if (!(object instanceof String)) break block2;
                a.bb.bb[n2] = clazz = Class.forName(db[n2]);
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
        MethodHandle methodHandle = a.bb.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field g(long l10, long l11) {
        int n2 = a.bb.e(l10, l11);
        Object object = bb[n2];
        if (object instanceof String) {
            String string = db[n2];
            int n3 = string.indexOf(8);
            Class clazz = a.bb.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = a.bb.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = a.bb.c(clazz3, string2, clazz2)) != null) {
                    a.bb.bb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = a.bb.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        a.bb.bb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = a.bb.f(238763546143476L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x100B;
        if (E[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = D[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ab.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ab.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bb", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            a.bb.E[n3] = n4;
        }
        return E[n3];
    }

    @Override
    public void d() {
    }

    private void m() {
        CallSite callSite;
        CallSite callSite2;
        double d2;
        double d3;
        long l10;
        block31: {
            block30: {
                String string;
                String string2;
                Color color;
                double d4;
                double d5;
                String string3;
                G5 g5;
                double d6;
                double d7;
                int n2;
                G5 g52;
                block29: {
                    boolean bl2;
                    block28: {
                        Object object;
                        StringBuilder stringBuilder;
                        boolean bl3;
                        block27: {
                            block26: {
                                boolean bl4;
                                boolean bl5;
                                l10 = b ^ 0x38282FBD8A91L;
                                g52 = this.L(0.85);
                                int n3 = this.V - this.F;
                                n2 = Math.abs(n3);
                                try {
                                    bl5 = n3 < 0;
                                }
                                catch (O_ o_2) {
                                    throw a.bb.a(o_2);
                                }
                                bl2 = bl5;
                                try {
                                    bl4 = n3 > 0;
                                }
                                catch (O_ o_3) {
                                    throw a.bb.a(o_3);
                                }
                                bl3 = bl4;
                                try {
                                    stringBuilder = new StringBuilder();
                                    if (!bl3) break block26;
                                    object = a.bb.c("\u00f5", (int)a.bb.b("e", (int)28112, (long)(0x212BD58C8BAA8FE1L ^ l10)), (long)8230615300990953823L, (long)l10);
                                    break block27;
                                }
                                catch (O_ o_4) {
                                    throw a.bb.a(o_4);
                                }
                            }
                            try {
                                object = bl2 ? a.bb.c("\u00f5", (int)a.bb.b("e", (int)22141, (long)(0xE224C1BAC6D3447L ^ l10)), (long)8230615300990953823L, (long)l10) : "";
                            }
                            catch (O_ o_5) {
                                throw a.bb.a(o_5);
                            }
                        }
                        String string4 = stringBuilder.append((String)object).append(n2).toString();
                        d7 = g52.D(string4) + 5.0;
                        if (d7 < 10.0) {
                            d7 = 10.0;
                        }
                        F8.S(this.G() + 5.0, this.W() + 5.0, d7, 10.0, a.bb.M.S);
                        d6 = this.W() + 5.0 + 2.0;
                        try {
                            g5 = g52;
                            string3 = string4;
                            d5 = this.G() + 5.0 + d7 / 2.0;
                            d4 = d6;
                            if (!bl3) break block28;
                            color = a.bb.M.Y;
                            break block29;
                        }
                        catch (O_ o_6) {
                            throw a.bb.a(o_6);
                        }
                    }
                    try {
                        color = bl2 ? a.bb.M.O : a.bb.M.n;
                    }
                    catch (O_ o_7) {
                        throw a.bb.a(o_7);
                    }
                }
                try {
                    g5.Q(string3, d5, d4, color);
                    g52.R(this.O(), this.G() + 10.0 + d7, d6, a.bb.M.n);
                    string2 = this.V > 9 ? "" + this.V : (String)((Object)a.bb.c("\u00f5", (int)a.bb.b("e", (int)1063, (long)(0x224681100866661CL ^ l10)), (long)8230615300990953823L, (long)l10)) + this.V;
                }
                catch (O_ o_8) {
                    throw a.bb.a(o_8);
                }
                String string5 = string2;
                try {
                    string = this.F > 9 ? "" + this.F : (String)((Object)a.bb.c("\u00f5", (int)a.bb.b("e", (int)27720, (long)(0x14B6AB10F99D8E7EL ^ l10)), (long)8230615300990953823L, (long)l10)) + this.F;
                }
                catch (O_ o_9) {
                    throw a.bb.a(o_9);
                }
                String string6 = string;
                double d9 = g52.D(string5);
                double d10 = g52.D(string5);
                double d11 = g52.D((String)((Object)a.bb.c("\u00f5", (int)a.bb.b("e", (int)1595, (long)(0xE2419DE9819640EL ^ l10)), (long)8230615300990953823L, (long)l10)));
                double d12 = this.G() + this.w() - 5.0 - d10;
                g52.R(string6, d12, d6, a.bb.M.w);
                g52.R((String)((Object)a.bb.c("\u00f5", (int)a.bb.b("e", (int)1495, (long)(0x26612CC0F59167E3L ^ l10)), (long)8230615300990953823L, (long)l10)), d12 - 5.0 - d11, d6, a.bb.M.w);
                g52.R(string5, d12 - 10.0 - d11 - d9, d6, a.bb.M.n);
                d3 = this.W() + 22.5;
                double d13 = 6.0;
                F8.A(this.G() + 5.0, d3 - 0.5, this.w() - 10.0, 1.0, a.bb.M.S);
                int n4 = this.V + this.F;
                try {
                    if (n4 == 0) {
                        F8.x((String)((Object)a.bb.c("\u00f5", (int)a.bb.b("e", (int)6764, (long)(0x7C87B206F9E4F85BL ^ l10)), (long)8230615300990953823L, (long)l10)), this.G() + this.w() / 2.0, d3, 20.0, 20.0, Color.WHITE);
                        return;
                    }
                }
                catch (O_ o_10) {
                    throw a.bb.a(o_10);
                }
                double d14 = (double)n2 / (double)n4;
                double d15 = this.w() / 2.0 - 5.0 - d13;
                d2 = this.V >= this.F ? this.G() + 5.0 + d15 - d15 * d14 : this.G() + 5.0 + d15 + d13 * 2.0 + d15 * d14;
                try {
                    if (this.V < this.F) break block30;
                    F8.A(d2, d3 - 0.5, this.G() + this.w() / 2.0 - d2, 1.0, a.bb.M.Y);
                    break block31;
                }
                catch (O_ o_11) {
                    throw a.bb.a(o_11);
                }
            }
            F8.A(this.G() + this.w() / 2.0, d3 - 0.5, d2 - this.G() - this.w() / 2.0, 1.0, a.bb.M.O);
        }
        try {
            callSite2 = this.V >= this.F ? a.bb.c("\u00f5", (int)a.bb.b("e", (int)24740, (long)(0x2EF463CF72E38297L ^ l10)), (long)8230615300990953823L, (long)l10) : a.bb.c("\u00f5", (int)a.bb.b("e", (int)31703, (long)(0x27F47728A58E99E7L ^ l10)), (long)8230615300990953823L, (long)l10);
        }
        catch (O_ o_12) {
            throw a.bb.a(o_12);
        }
        try {
            F8.x((String)((Object)callSite2), this.G() + this.w() / 2.0, d3, 20.0, 20.0, Color.WHITE);
            callSite = this.V >= this.F ? a.bb.c("\u00f5", (int)a.bb.b("e", (int)20128, (long)(0x2B727D442A42AC99L ^ l10)), (long)8230615300990953823L, (long)l10) : a.bb.c("\u00f5", (int)a.bb.b("e", (int)941, (long)(0x73195126B33619FL ^ l10)), (long)8230615300990953823L, (long)l10);
        }
        catch (O_ o_13) {
            throw a.bb.a(o_13);
        }
        F8.x((String)((Object)callSite), d2, d3, 20.0, 20.0, Color.WHITE);
    }

    @Override
    public void G() {
        this.m();
    }

    @Override
    public double e() {
        return 20.0;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void A(int n2) {
        this.F = n2;
    }

    private static Method h(long l10, long l11) {
        int n2 = a.bb.e(l10, l11);
        Object object = bb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = db[n2];
                int n4 = string2.indexOf(8);
                clazz3 = a.bb.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = a.bb.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = a.bb.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        a.bb.bb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = a.bb.f(238763546143476L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = a.bb.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        a.bb.bb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = a.bb.f(238763546143476L, 0L);
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
        Object[] objectArray = bb;
        bb[0] = "7q6";
        objectArray[1] = Integer.TYPE;
        a.bb.db[1] = "java/lang/Integer";
        objectArray[2] = "p&?!X\u0007{).n%\u001fh.''";
        objectArray[3] = "l8R*\u0019:g7Cex4l<G?";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "p1X\tuS=o\u000b{dKA\u007fP\u0002cI1k\u000b\u0007\u000f\t qJ\u0015q\u0000:3A{";
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (db[n5] != null) {
            return n5;
        }
        Object object = bb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 16;
                break;
            }
            case 1: {
                n4 = 52;
                break;
            }
            case 2: {
                n4 = 31;
                break;
            }
            case 3: {
                n4 = 34;
                break;
            }
            case 4: {
                n4 = 48;
                break;
            }
            case 5: {
                n4 = 27;
                break;
            }
            case 6: {
                n4 = 45;
                break;
            }
            case 7: {
                n4 = 56;
                break;
            }
            case 8: {
                n4 = 12;
                break;
            }
            case 9: {
                n4 = 4;
                break;
            }
            case 10: {
                n4 = 47;
                break;
            }
            case 11: {
                n4 = 39;
                break;
            }
            case 12: {
                n4 = 51;
                break;
            }
            case 13: {
                n4 = 13;
                break;
            }
            case 14: {
                n4 = 22;
                break;
            }
            case 15: {
                n4 = 2;
                break;
            }
            case 16: {
                n4 = 41;
                break;
            }
            case 17: {
                n4 = 6;
                break;
            }
            case 18: {
                n4 = 18;
                break;
            }
            case 19: {
                n4 = 53;
                break;
            }
            case 20: {
                n4 = 49;
                break;
            }
            case 21: {
                n4 = 50;
                break;
            }
            case 22: {
                n4 = 24;
                break;
            }
            case 23: {
                n4 = 11;
                break;
            }
            case 24: {
                n4 = 55;
                break;
            }
            case 25: {
                n4 = 5;
                break;
            }
            case 26: {
                n4 = 43;
                break;
            }
            case 27: {
                n4 = 38;
                break;
            }
            case 28: {
                n4 = 46;
                break;
            }
            case 29: {
                n4 = 40;
                break;
            }
            case 30: {
                n4 = 62;
                break;
            }
            case 31: {
                n4 = 35;
                break;
            }
            case 32: {
                n4 = 23;
                break;
            }
            case 33: {
                n4 = 28;
                break;
            }
            case 34: {
                n4 = 1;
                break;
            }
            case 35: {
                n4 = 0;
                break;
            }
            case 36: {
                n4 = 59;
                break;
            }
            case 37: {
                n4 = 15;
                break;
            }
            case 38: {
                n4 = 7;
                break;
            }
            case 39: {
                n4 = 37;
                break;
            }
            case 40: {
                n4 = 26;
                break;
            }
            case 41: {
                n4 = 44;
                break;
            }
            case 42: {
                n4 = 20;
                break;
            }
            case 43: {
                n4 = 19;
                break;
            }
            case 44: {
                n4 = 54;
                break;
            }
            case 45: {
                n4 = 29;
                break;
            }
            case 46: {
                n4 = 58;
                break;
            }
            case 47: {
                n4 = 57;
                break;
            }
            case 48: {
                n4 = 14;
                break;
            }
            case 49: {
                n4 = 61;
                break;
            }
            case 50: {
                n4 = 36;
                break;
            }
            case 51: {
                n4 = 63;
                break;
            }
            case 52: {
                n4 = 32;
                break;
            }
            case 53: {
                n4 = 9;
                break;
            }
            case 54: {
                n4 = 30;
                break;
            }
            case 55: {
                n4 = 60;
                break;
            }
            case 56: {
                n4 = 33;
                break;
            }
            case 57: {
                n4 = 17;
                break;
            }
            case 58: {
                n4 = 42;
                break;
            }
            case 59: {
                n4 = 10;
                break;
            }
            case 60: {
                n4 = 21;
                break;
            }
            case 61: {
                n4 = 25;
                break;
            }
            case 62: {
                n4 = 3;
                break;
            }
            default: {
                n4 = 8;
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
        a.bb.db[n5] = new String(cArray);
        return n5;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public bb(String string) {
        super(string);
    }

    @Override
    public void g() {
    }

    @Override
    public void Z(Sz sz2) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                a.bb.b = d8.a(-6290715216315627772L, 4537372157166295375L, MethodHandles.lookup().lookupClass()).a(220660624775079L);
                a.bb.bb = new Object[5];
                a.bb.db = new String[5];
                a.bb.a();
                a.bb.ab = new HashMap<K, V>(13);
                var0 = a.bb.b ^ 29609107090787L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u00ce\u0096\nT\u00c0fSz\u00fb\u00f7\u00dd%\u00c5\u00c0\u00f1\u00a4]\u00de\u000fi\u00e0\u00dbE+\\X\u00c2=\u00beU\u00cc\f.\u00d4`\u00acp\u00ff\u0005R-p\u00b9\u00e5\u0093;JjY\u00cdB\u0000\u00e1\u001d\u0010\u001f\u0001\u0001\u00ed\u00a8\u008eg@\u00a9\u008a\u007f\u0092U\u00de/\u0017%";
                var7_6 = "\u00ce\u0096\nT\u00c0fSz\u00fb\u00f7\u00dd%\u00c5\u00c0\u00f1\u00a4]\u00de\u000fi\u00e0\u00dbE+\\X\u00c2=\u00beU\u00cc\f.\u00d4`\u00acp\u00ff\u0005R-p\u00b9\u00e5\u0093;JjY\u00cdB\u0000\u00e1\u001d\u0010\u001f\u0001\u0001\u00ed\u00a8\u008eg@\u00a9\u008a\u007f\u0092U\u00de/\u0017%".length();
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
                    var6_5 = "\u0099N\u00ac\u00bb\u00c0-\r3\u00d1\u00b6\\0fA\u0016\u0098";
                    var7_6 = "\u0099N\u00ac\u00bb\u00c0-\r3\u00d1\u00b6\\0fA\u0016\u0098".length();
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
        a.bb.D = var8_3;
        a.bb.E = new Integer[11];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(bb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

