/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.Bg;
import a.F8;
import a.FG;
import a.O_;
import a.Sz;
import a.X4;
import a.d8;
import a.ht;
import a.tl;
import a.z6;
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
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class bj
extends ht {
    ht D;
    private static final long n = d8.a(-3219540349814965919L, 3263654967888365254L, MethodHandles.lookup().lookupClass()).a(281305791410954L);
    private static final Integer[] B;
    private static final Map E;
    private static final long[] v;
    private static final Object[] F;
    private static final String[] L;
    private double V = 0.0;
    private Bg b = new Bg();

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = bj.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = bj.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public double z() {
        return 0.0;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = bj.e(l10, l11);
            object = F[n2];
            try {
                if (!(object instanceof String)) break block2;
                bj.F[n2] = clazz = Class.forName(L[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void d(String string, double d2, double d3, double d4, double d5, Color color, @Nullable Color color2) {
        this.c(string, d2, d3, d4, d5, false, color, color2);
    }

    /*
     * Unable to fully structure code
     */
    public void c(String var1_1, double var2_2, double var4_3, double var6_4, double var8_5, boolean var10_6, Color var11_7, @Nullable Color var12_8) {
        block49: {
            block48: {
                block46: {
                    block47: {
                        var13_9 = bj.n ^ 70520772802861L;
                        try {
                            v0 = var10_6 != false ? this.t(var8_5) : this.L(var8_5);
                        }
                        catch (O_ v1) {
                            throw bj.a(v1);
                        }
                        var15_10 = v0;
                        var16_11 = var15_10.D(var1_1);
                        var18_12 = var15_10.B(var1_1);
                        var20_13 = new X4(var2_2, var4_3, var6_4, var18_12);
                        try {
                            try {
                                try {
                                    try {
                                        if (this.D == null || !this.D.s()) break block46;
                                    }
                                    catch (O_ v2) {
                                        throw bj.a(v2);
                                    }
                                    if (!(var16_11 > var20_13.t())) break block46;
                                }
                                catch (O_ v3) {
                                    throw bj.a(v3);
                                }
                                FG.e(var20_13.K() - 1.0, var20_13.q(), var20_13.t() + 1.0, var20_13.V());
                                var15_10.R(var1_1 + (String)bj.c("\u00c6", (int)bj.b("n", (int)22598, (long)(8950121033838710514L ^ var13_9)), (long)-5774454120560385177L, (long)var13_9) + var1_1, var20_13.K() - this.V, var20_13.q(), var11_7);
                                FG.F();
                                if (!this.b.m(30L)) break block47;
                            }
                            catch (O_ v4) {
                                throw bj.a(v4);
                            }
                            this.V += 0.25;
                            this.b.m();
                        }
                        catch (O_ v5) {
                            throw bj.a(v5);
                        }
                    }
                    try {
                        if (!(this.V >= var16_11 + var15_10.D((String)bj.c("\u00c6", (int)bj.b("n", (int)6000, (long)(4794788688405889477L ^ var13_9)), (long)-5774454120560385177L, (long)var13_9)))) ** GOTO lbl46
                        this.V = 0.0;
                    }
                    catch (O_ v6) {
                        throw bj.a(v6);
                    }
                }
                this.V = 0.0;
                FG.e(var20_13.K() - 1.0, var20_13.q(), var20_13.t() + 1.0, var20_13.V());
                var15_10.R(var1_1, var20_13.K() - this.V, var20_13.q(), var11_7);
                FG.F();
lbl46:
                // 3 sources

                try {
                    v7 = var12_8 == null ? new Color(0, 0, 0, 0) : var12_8;
                }
                catch (O_ v8) {
                    throw bj.a(v8);
                }
                var21_14 = v7;
                try {
                    if (!F8.U()) break block48;
                    z6.d(var20_13.K() + 1.0, var20_13.q(), var20_13.K() + 1.0, var20_13.q() + var20_13.V(), var20_13.K() - 3.0, var20_13.q() + var20_13.V(), var20_13.K() - 3.0, var20_13.q(), new Color(31, 30, 31, 0), var21_14);
                    z6.d(var20_13.K() + var20_13.t() - 3.0, var20_13.q(), var20_13.K() + var20_13.t() - 3.0, var20_13.q() + var20_13.V(), var20_13.K() + var20_13.t(), var20_13.q() + var20_13.V(), var20_13.K() + var20_13.t(), var20_13.q(), new Color(31, 30, 31, 0), var21_14);
                    break block49;
                }
                catch (O_ v9) {
                    throw bj.a(v9);
                }
            }
            var22_15 = GL11.glIsEnabled((int)3042);
            var23_16 = GL11.glIsEnabled((int)3553);
            var24_17 = GL11.glIsEnabled((int)2896);
            var25_18 = GL11.glIsEnabled((int)3008);
            var26_19 = GL11.glIsEnabled((int)2884);
            try {
                if (!var22_15) {
                    tl.N();
                }
            }
            catch (O_ v10) {
                throw bj.a(v10);
            }
            try {
                if (var23_16) {
                    tl.R();
                }
            }
            catch (O_ v11) {
                throw bj.a(v11);
            }
            try {
                if (var24_17) {
                    tl.P();
                }
            }
            catch (O_ v12) {
                throw bj.a(v12);
            }
            try {
                if (!var25_18) {
                    tl.s();
                }
            }
            catch (O_ v13) {
                throw bj.a(v13);
            }
            try {
                if (var26_19) {
                    tl.M();
                }
            }
            catch (O_ v14) {
                throw bj.a(v14);
            }
            try {
                GL11.glShadeModel((int)7425);
                FG.Y(new Color(31, 30, 31, 0));
                GL11.glBegin((int)7);
                GL11.glVertex2d((double)(var20_13.K() + 1.0), (double)var20_13.q());
                GL11.glVertex2d((double)(var20_13.K() + 1.0), (double)(var20_13.q() + var20_13.V()));
                FG.Y(var21_14);
                GL11.glVertex2d((double)(var20_13.K() - 3.0), (double)(var20_13.q() + var20_13.V()));
                GL11.glVertex2d((double)(var20_13.K() - 3.0), (double)var20_13.q());
                GL11.glEnd();
                FG.Y(new Color(31, 30, 31, 0));
                GL11.glBegin((int)7);
                GL11.glVertex2d((double)(var20_13.K() + var20_13.t() - 3.0), (double)var20_13.q());
                GL11.glVertex2d((double)(var20_13.K() + var20_13.t() - 3.0), (double)(var20_13.q() + var20_13.V()));
                FG.Y(var21_14);
                GL11.glVertex2d((double)(var20_13.K() + var20_13.t()), (double)(var20_13.q() + var20_13.V()));
                GL11.glVertex2d((double)(var20_13.K() + var20_13.t()), (double)var20_13.q());
                GL11.glEnd();
                GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
                GL11.glShadeModel((int)7424);
                if (!var25_18) {
                    tl.Z();
                }
            }
            catch (O_ v15) {
                throw bj.a(v15);
            }
            try {
                if (var24_17) {
                    tl.T();
                }
            }
            catch (O_ v16) {
                throw bj.a(v16);
            }
            try {
                if (!var22_15) {
                    tl.j();
                }
            }
            catch (O_ v17) {
                throw bj.a(v17);
            }
            try {
                if (var26_19) {
                    tl.V();
                }
            }
            catch (O_ v18) {
                throw bj.a(v18);
            }
            try {
                if (var23_16) {
                    tl.B();
                }
            }
            catch (O_ v19) {
                throw bj.a(v19);
            }
        }
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e6' || c10 == 'G' || c10 == 'S' || c10 == 'v') {
                field = bj.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'S' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bj.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e1' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00c6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    @Override
    public void G() {
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x3968;
        if (B[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = v[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])E.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    E.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bj", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bj.B[n3] = n4;
        }
        return B[n3];
    }

    private static Method h(long l10, long l11) {
        int n2 = bj.e(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = L[n2];
                int n4 = string2.indexOf(8);
                clazz3 = bj.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = bj.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bj.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        bj.F[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bj.f(216309648003025L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = bj.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        bj.F[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bj.f(216309648003025L, 0L);
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
        Field field = bj.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = bj.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void d() {
    }

    public bj(@Nullable ht ht2) {
        this.D = ht2;
    }

    @Override
    public void Z(Sz sz2) {
    }

    @Override
    public void g() {
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field g(long l10, long l11) {
        int n2 = bj.e(l10, l11);
        Object object = F[n2];
        if (object instanceof String) {
            String string = L[n2];
            int n3 = string.indexOf(8);
            Class clazz = bj.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = bj.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bj.c(clazz3, string2, clazz2)) != null) {
                    bj.F[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = bj.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        bj.F[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bj.f(216309648003025L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = bj.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (L[n5] != null) {
            return n5;
        }
        Object object = F[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 10;
                break;
            }
            case 1: {
                n4 = 36;
                break;
            }
            case 2: {
                n4 = 1;
                break;
            }
            case 3: {
                n4 = 47;
                break;
            }
            case 4: {
                n4 = 40;
                break;
            }
            case 5: {
                n4 = 42;
                break;
            }
            case 6: {
                n4 = 24;
                break;
            }
            case 7: {
                n4 = 46;
                break;
            }
            case 8: {
                n4 = 57;
                break;
            }
            case 9: {
                n4 = 22;
                break;
            }
            case 10: {
                n4 = 59;
                break;
            }
            case 11: {
                n4 = 58;
                break;
            }
            case 12: {
                n4 = 56;
                break;
            }
            case 13: {
                n4 = 15;
                break;
            }
            case 14: {
                n4 = 52;
                break;
            }
            case 15: {
                n4 = 45;
                break;
            }
            case 16: {
                n4 = 25;
                break;
            }
            case 17: {
                n4 = 61;
                break;
            }
            case 18: {
                n4 = 23;
                break;
            }
            case 19: {
                n4 = 19;
                break;
            }
            case 20: {
                n4 = 32;
                break;
            }
            case 21: {
                n4 = 3;
                break;
            }
            case 22: {
                n4 = 20;
                break;
            }
            case 23: {
                n4 = 4;
                break;
            }
            case 24: {
                n4 = 37;
                break;
            }
            case 25: {
                n4 = 28;
                break;
            }
            case 26: {
                n4 = 12;
                break;
            }
            case 27: {
                n4 = 13;
                break;
            }
            case 28: {
                n4 = 63;
                break;
            }
            case 29: {
                n4 = 50;
                break;
            }
            case 30: {
                n4 = 9;
                break;
            }
            case 31: {
                n4 = 39;
                break;
            }
            case 32: {
                n4 = 27;
                break;
            }
            case 33: {
                n4 = 14;
                break;
            }
            case 34: {
                n4 = 35;
                break;
            }
            case 35: {
                n4 = 34;
                break;
            }
            case 36: {
                n4 = 6;
                break;
            }
            case 37: {
                n4 = 29;
                break;
            }
            case 38: {
                n4 = 17;
                break;
            }
            case 39: {
                n4 = 11;
                break;
            }
            case 40: {
                n4 = 26;
                break;
            }
            case 41: {
                n4 = 49;
                break;
            }
            case 42: {
                n4 = 16;
                break;
            }
            case 43: {
                n4 = 21;
                break;
            }
            case 44: {
                n4 = 38;
                break;
            }
            case 45: {
                n4 = 2;
                break;
            }
            case 46: {
                n4 = 8;
                break;
            }
            case 47: {
                n4 = 31;
                break;
            }
            case 48: {
                n4 = 0;
                break;
            }
            case 49: {
                n4 = 60;
                break;
            }
            case 50: {
                n4 = 55;
                break;
            }
            case 51: {
                n4 = 7;
                break;
            }
            case 52: {
                n4 = 51;
                break;
            }
            case 53: {
                n4 = 41;
                break;
            }
            case 54: {
                n4 = 44;
                break;
            }
            case 55: {
                n4 = 30;
                break;
            }
            case 56: {
                n4 = 48;
                break;
            }
            case 57: {
                n4 = 18;
                break;
            }
            case 58: {
                n4 = 62;
                break;
            }
            case 59: {
                n4 = 43;
                break;
            }
            case 60: {
                n4 = 53;
                break;
            }
            case 61: {
                n4 = 33;
                break;
            }
            case 62: {
                n4 = 5;
                break;
            }
            default: {
                n4 = 54;
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
        bj.L[n5] = new String(cArray);
        return n5;
    }

    @Override
    public double e() {
        return 0.0;
    }

    public void g(String string, double d2, double d3, double d4, double d5, Color color) {
        this.c(string, d2, d3, d4, d5, false, color, null);
    }

    @Override
    public void U() {
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        F = new Object[5];
        L = new String[5];
        bj.a();
        E = new HashMap(13);
        long l10 = n ^ 0xAAB2B541845L;
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
        String string = "\u001c\u00b4\u00c1i\u00d4\u00e5\u0096\u00ee+W/\u0000\u008f\u009d\u00a3\u00a2";
        int n3 = "\u001c\u00b4\u00c1i\u00d4\u00e5\u0096\u00ee+W/\u0000\u008f\u009d\u00a3\u00a2".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        v = lArray;
        B = new Integer[2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = bj.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = F;
        F[0] = "eGd";
        objectArray[1] = Integer.TYPE;
        bj.L[1] = "java/lang/Integer";
        objectArray[2] = "q\u001dEVFDz\u0012T\u0019;\\i\u0015]P";
        objectArray[3] = "1\u001d\u0017QMy:\u0012\u0006\u001e,w1\u0019\u0002D";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ")\\p~w\u0006{Sc\u0014lB\u0014I2~`EjX=\u007f\u0007\u0000i\r6vg\u0004q\t<\u0014";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

