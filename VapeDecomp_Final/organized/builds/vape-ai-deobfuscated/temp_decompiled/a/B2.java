/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.F8;
import a.FG;
import a.G5;
import a.O_;
import a.X4;
import a.YF;
import a.bM;
import a.d8;
import a.k2;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class b2
extends bM {
    private static final Object[] db;
    private static final String[] eb;
    private static final long F;
    private static final long n;
    private Color R;

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public b2(String string, double d2, double d3, Color color, Color color2, boolean bl2, boolean bl3) {
        super(string, "", d2, d3, color, bl2, bl3);
        this.R = color2;
    }

    @Override
    public double u() {
        G5 g5;
        int n2 = YF.A.r(this.D);
        try {
            g5 = this.D.Q() ? this.t(this.D.H()) : this.L(this.D.H());
        }
        catch (O_ o_2) {
            throw b2.a(o_2);
        }
        G5 g52 = g5;
        try {
            if (n2 >= 0) {
                return g52.D(this.B().substring(0, n2));
            }
        }
        catch (O_ o_3) {
            throw b2.a(o_3);
        }
        return 0.0;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = b2.i(l10, l11);
            object = db[n2];
            try {
                if (!(object instanceof String)) break block2;
                b2.db[n2] = clazz = Class.forName(eb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = b2.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = b2.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void i() {
        Object[] objectArray = db;
        db[0] = "e7~";
        objectArray[1] = Integer.TYPE;
        b2.eb[1] = "java/lang/Integer";
        objectArray[2] = "xw\"e1|sx3*Ld`\u007f:c";
        objectArray[3] = "vAd\\\u0006=}Nu\u0013g3vEqI";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "'_^\by=dI@pu\"\u0019FHKl'f\u0007\u0002\u000e\u001e`i\u0001\u0002Ol?s^Ip";
    }

    private static Method l(long l10, long l11) {
        int n2 = b2.i(l10, l11);
        Object object = db[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = eb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = b2.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = b2.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b2.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        b2.db[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b2.j(248092432883817L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = b2.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        b2.db[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b2.j(248092432883817L, 0L);
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
     * Enabled aggressive block sorting
     */
    static {
        n = d8.a(-6021090709514115573L, 490252532547965001L, MethodHandles.lookup().lookupClass()).a(171206422567795L);
        db = new Object[5];
        eb = new String[5];
        b2.i();
        long l10 = n ^ 0x686D676925C3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 1810634342085850255L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                F = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public void z(Color color) {
        this.R = color;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (eb[n5] != null) {
            return n5;
        }
        Object object = db[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 9;
                break;
            }
            case 1: {
                n4 = 42;
                break;
            }
            case 2: {
                n4 = 43;
                break;
            }
            case 3: {
                n4 = 38;
                break;
            }
            case 4: {
                n4 = 25;
                break;
            }
            case 5: {
                n4 = 37;
                break;
            }
            case 6: {
                n4 = 18;
                break;
            }
            case 7: {
                n4 = 50;
                break;
            }
            case 8: {
                n4 = 31;
                break;
            }
            case 9: {
                n4 = 16;
                break;
            }
            case 10: {
                n4 = 39;
                break;
            }
            case 11: {
                n4 = 30;
                break;
            }
            case 12: {
                n4 = 26;
                break;
            }
            case 13: {
                n4 = 0;
                break;
            }
            case 14: {
                n4 = 2;
                break;
            }
            case 15: {
                n4 = 23;
                break;
            }
            case 16: {
                n4 = 61;
                break;
            }
            case 17: {
                n4 = 40;
                break;
            }
            case 18: {
                n4 = 51;
                break;
            }
            case 19: {
                n4 = 13;
                break;
            }
            case 20: {
                n4 = 45;
                break;
            }
            case 21: {
                n4 = 47;
                break;
            }
            case 22: {
                n4 = 5;
                break;
            }
            case 23: {
                n4 = 53;
                break;
            }
            case 24: {
                n4 = 62;
                break;
            }
            case 25: {
                n4 = 27;
                break;
            }
            case 26: {
                n4 = 35;
                break;
            }
            case 27: {
                n4 = 60;
                break;
            }
            case 28: {
                n4 = 14;
                break;
            }
            case 29: {
                n4 = 28;
                break;
            }
            case 30: {
                n4 = 55;
                break;
            }
            case 31: {
                n4 = 36;
                break;
            }
            case 32: {
                n4 = 4;
                break;
            }
            case 33: {
                n4 = 34;
                break;
            }
            case 34: {
                n4 = 22;
                break;
            }
            case 35: {
                n4 = 1;
                break;
            }
            case 36: {
                n4 = 32;
                break;
            }
            case 37: {
                n4 = 11;
                break;
            }
            case 38: {
                n4 = 21;
                break;
            }
            case 39: {
                n4 = 48;
                break;
            }
            case 40: {
                n4 = 56;
                break;
            }
            case 41: {
                n4 = 10;
                break;
            }
            case 42: {
                n4 = 3;
                break;
            }
            case 43: {
                n4 = 8;
                break;
            }
            case 44: {
                n4 = 20;
                break;
            }
            case 45: {
                n4 = 12;
                break;
            }
            case 46: {
                n4 = 15;
                break;
            }
            case 47: {
                n4 = 54;
                break;
            }
            case 48: {
                n4 = 57;
                break;
            }
            case 49: {
                n4 = 58;
                break;
            }
            case 50: {
                n4 = 44;
                break;
            }
            case 51: {
                n4 = 46;
                break;
            }
            case 52: {
                n4 = 49;
                break;
            }
            case 53: {
                n4 = 29;
                break;
            }
            case 54: {
                n4 = 52;
                break;
            }
            case 55: {
                n4 = 63;
                break;
            }
            case 56: {
                n4 = 24;
                break;
            }
            case 57: {
                n4 = 59;
                break;
            }
            case 58: {
                n4 = 17;
                break;
            }
            case 59: {
                n4 = 33;
                break;
            }
            case 60: {
                n4 = 6;
                break;
            }
            case 61: {
                n4 = 19;
                break;
            }
            case 62: {
                n4 = 41;
                break;
            }
            default: {
                n4 = 7;
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
        b2.eb[n5] = new String(cArray);
        return n5;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = b2.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/b2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00d1' || c10 == '\u00c7' || c10 == '\u00e3' || c10 == '\u00ee') {
                field = b2.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00d1' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c7' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b2.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00f1' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'o' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = b2.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = b2.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public Color m() {
        return this.R;
    }

    @Override
    public void y(double d2, double d3) {
        String string;
        StringBuilder stringBuilder;
        block69: {
            block67: {
                block68: {
                    String string2;
                    StringBuilder stringBuilder2;
                    boolean bl2;
                    boolean bl3;
                    int n2;
                    long l10;
                    block62: {
                        X4 x42;
                        block66: {
                            String string3;
                            G5 g5;
                            block65: {
                                G5 g52;
                                block64: {
                                    block63: {
                                        block58: {
                                            block61: {
                                                G5 g53;
                                                block60: {
                                                    block59: {
                                                        l10 = n ^ 0x2579F3BC2B26L;
                                                        n2 = YF.A.r(this.D);
                                                        try {
                                                            try {
                                                                if (n2 != this.B().length() - 1) break block58;
                                                                if (!this.D.Q()) break block59;
                                                            }
                                                            catch (O_ o_2) {
                                                                throw b2.a(o_2);
                                                            }
                                                            g53 = this.t(this.D.H());
                                                            break block60;
                                                        }
                                                        catch (O_ o_3) {
                                                            throw b2.a(o_3);
                                                        }
                                                    }
                                                    g53 = this.L(this.D.H());
                                                }
                                                g5 = g53;
                                                try {
                                                    if (!this.V) break block61;
                                                    g5.Y(this.B(), d2, d3, this.B);
                                                    break block62;
                                                }
                                                catch (O_ o_4) {
                                                    throw b2.a(o_4);
                                                }
                                            }
                                            g5.R(this.B(), d2, d3, this.B);
                                            break block62;
                                        }
                                        try {
                                            try {
                                                if (n2 < 0) break block62;
                                                if (!this.D.Q()) break block63;
                                            }
                                            catch (O_ o_5) {
                                                throw b2.a(o_5);
                                            }
                                            g52 = this.t(this.D.H());
                                            break block64;
                                        }
                                        catch (O_ o_6) {
                                            throw b2.a(o_6);
                                        }
                                    }
                                    g52 = this.L(this.D.H());
                                }
                                g5 = g52;
                                string3 = this.B().substring(0, n2);
                                double d4 = g5.D(string3);
                                double d5 = g5.B(string3);
                                x42 = new X4(d2, d3, this.x(), d5);
                                try {
                                    FG.e(x42.K() - 1.0, x42.q(), x42.t() + 1.0, x42.V());
                                    if (!this.V) break block65;
                                    g5.Y(string3, x42.K(), x42.q(), this.B);
                                    break block66;
                                }
                                catch (O_ o_7) {
                                    throw b2.a(o_7);
                                }
                            }
                            g5.R(string3, x42.K(), x42.q(), this.B);
                        }
                        FG.F();
                        if (F8.U()) {
                            Color color;
                            k2 k22;
                            double d6;
                            double d7;
                            double d9;
                            double d10;
                            double d11;
                            double d12;
                            double d13;
                            double d14;
                            k2 k23 = new k2(this.R);
                            try {
                                k23.I(0);
                                d14 = x42.K() + x42.t() - 6.0;
                                d13 = x42.q();
                                d12 = x42.K() + x42.t() - 6.0;
                                d11 = x42.q() + x42.V();
                                d10 = x42.K() + x42.t();
                                d9 = x42.q() + x42.V();
                                d7 = x42.K() + x42.t();
                                d6 = x42.q();
                                k22 = k23;
                                color = this.R == null ? new Color(0, 0, 0, 0) : this.R;
                            }
                            catch (O_ o_8) {
                                throw b2.a(o_8);
                            }
                            z6.d(d14, d13, d12, d11, d10, d9, d7, d6, k22, color);
                        } else {
                            Color color;
                            boolean bl4 = GL11.glIsEnabled((int)3042);
                            boolean bl5 = GL11.glIsEnabled((int)3553);
                            boolean bl6 = GL11.glIsEnabled((int)2896);
                            boolean bl7 = GL11.glIsEnabled((int)3008);
                            boolean bl8 = GL11.glIsEnabled((int)2884);
                            try {
                                if (!bl4) {
                                    tl.N();
                                }
                            }
                            catch (O_ o_9) {
                                throw b2.a(o_9);
                            }
                            try {
                                if (bl5) {
                                    tl.R();
                                }
                            }
                            catch (O_ o_10) {
                                throw b2.a(o_10);
                            }
                            try {
                                if (bl6) {
                                    tl.P();
                                }
                            }
                            catch (O_ o_11) {
                                throw b2.a(o_11);
                            }
                            try {
                                if (!bl7) {
                                    tl.s();
                                }
                            }
                            catch (O_ o_12) {
                                throw b2.a(o_12);
                            }
                            try {
                                if (bl8) {
                                    tl.M();
                                }
                            }
                            catch (O_ o_13) {
                                throw b2.a(o_13);
                            }
                            GL11.glShadeModel((int)7425);
                            k2 k24 = new k2(this.R);
                            try {
                                k24.I(0);
                                FG.Y(k24);
                                GL11.glBegin((int)7);
                                GL11.glVertex2d((double)(x42.K() + x42.t() - 6.0), (double)x42.q());
                                GL11.glVertex2d((double)(x42.K() + x42.t() - 6.0), (double)(x42.q() + x42.V()));
                                color = this.R == null ? new Color(0, 0, 0, 0) : this.R;
                            }
                            catch (O_ o_14) {
                                throw b2.a(o_14);
                            }
                            try {
                                FG.Y(color);
                                GL11.glVertex2d((double)(x42.K() + x42.t()), (double)(x42.q() + x42.V()));
                                GL11.glVertex2d((double)(x42.K() + x42.t()), (double)x42.q());
                                GL11.glEnd();
                                GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
                                GL11.glShadeModel((int)7424);
                                if (!bl7) {
                                    tl.Z();
                                }
                            }
                            catch (O_ o_15) {
                                throw b2.a(o_15);
                            }
                            try {
                                if (bl6) {
                                    tl.T();
                                }
                            }
                            catch (O_ o_16) {
                                throw b2.a(o_16);
                            }
                            try {
                                if (!bl4) {
                                    tl.j();
                                }
                            }
                            catch (O_ o_17) {
                                throw b2.a(o_17);
                            }
                            try {
                                if (bl8) {
                                    tl.V();
                                }
                            }
                            catch (O_ o_18) {
                                throw b2.a(o_18);
                            }
                            try {
                                if (bl5) {
                                    tl.B();
                                }
                            }
                            catch (O_ o_19) {
                                throw b2.a(o_19);
                            }
                        }
                    }
                    try {
                        bl3 = n2 < this.D.i().length() - 1;
                    }
                    catch (O_ o_20) {
                        throw b2.a(o_20);
                    }
                    boolean bl9 = bl3;
                    try {
                        bl2 = !this.E.equals("");
                    }
                    catch (O_ o_21) {
                        throw b2.a(o_21);
                    }
                    boolean bl10 = bl2;
                    try {
                        stringBuilder2 = new StringBuilder();
                        string2 = bl9 ? this.D.i() : "";
                    }
                    catch (O_ o_22) {
                        throw b2.a(o_22);
                    }
                    try {
                        try {
                            stringBuilder = stringBuilder2.append(string2);
                            if (!bl10) break block67;
                            if (!bl9) break block68;
                        }
                        catch (O_ o_23) {
                            throw b2.a(o_23);
                        }
                        string = (String)((Object)b2.c("o", (int)((int)F), (long)-6866509846918008978L, (long)l10)) + this.E;
                        break block69;
                    }
                    catch (O_ o_24) {
                        throw b2.a(o_24);
                    }
                }
                string = this.E;
                break block69;
            }
            string = "";
        }
        String string4 = stringBuilder.append(string).toString();
        this.g(string4);
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

    private static Field k(long l10, long l11) {
        int n2 = b2.i(l10, l11);
        Object object = db[n2];
        if (object instanceof String) {
            String string = eb[n2];
            int n3 = string.indexOf(8);
            Class clazz = b2.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = b2.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b2.e(clazz3, string2, clazz2)) != null) {
                    b2.db[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = b2.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        b2.db[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b2.j(248092432883817L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b2.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

