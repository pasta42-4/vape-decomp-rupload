/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DI;
import a.DK;
import a.DW;
import a.Du;
import a.EP;
import a.F8;
import a.G5;
import a.O_;
import a.Qg;
import a.Rs;
import a.SE;
import a.d8;
import a.jI;
import a.kX;
import a.wN;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fl
extends wN {
    private jI Sy = (jI)this.t();
    private static final String[] Jb;
    private double Sr;
    private static final long[] vb;
    private static final Integer[] wb;
    private static final Map xb;
    private static final long fb;
    private static final Object[] Ib;

    @Override
    public void V() {
        try {
            if (this.S()) {
                this.X();
                return;
            }
        }
        catch (O_ o_2) {
            throw fl.a(o_2);
        }
        this.p();
    }

    @Override
    public double w() {
        try {
            if (this.S()) {
                return 70.0;
            }
        }
        catch (O_ o_2) {
            throw fl.a(o_2);
        }
        return this.Sr + 12.0;
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void f(double d2, double d3, boolean bl2) {
        Color color;
        double d4;
        double d5;
        double d6;
        double d7;
        double d9;
        double d10;
        double d11 = d2 - 4.0;
        double d12 = d3 - 4.0;
        F8.S(d11, d12, 8.0, 8.0, this.s(Rs.y(fl.M.W, 145)));
        if (bl2) {
            d10 = d11 + 1.8;
            d9 = d12 + 4.5;
            d7 = d11 + 4.0;
            d6 = d12 + 2.5;
            d5 = d11 + 5.7;
            d4 = d12 + 4.5;
            color = fl.M.Y;
        } else {
            d10 = d11 + 1.8;
            d9 = d12 + 3.0;
            d7 = d11 + 5.7;
            d6 = d12 + 3.0;
            d5 = d11 + 4.0;
            d4 = d12 + 5.0;
            color = fl.M.O;
        }
        F8.m(d10, d9, d7, d6, d5, d4, this.s(color));
    }

    private void H(G5 g5, String string, double d2, double d3, Color color) {
        block3: {
            long l10;
            block2: {
                l10 = fb ^ 0x6C45E2804135L;
                d2 = (int)d2;
                try {
                    if (!this.R()) break block2;
                    g5.R(string, d2, d3, this.s(color));
                    break block3;
                }
                catch (O_ o_2) {
                    throw fl.a(o_2);
                }
            }
            g5.K(string, d2, d3, color, this.s(new Color((int)fl.f("h", (int)2371, (long)(0x68B54390A5D35C9BL ^ l10)), true)));
        }
    }

    private void p() {
        long l10 = fb ^ 0x7EE4A5784472L;
        G5 g5 = SE.h.W().T(0.75, true);
        G5 g52 = SE.h.W().T(1.2, true);
        double d2 = this.w() / 3.0;
        double d3 = this.b() / 2.0;
        Color color = Rs.y(Color.WHITE, 51);
        Qg qg2 = EP.U();
        int n2 = (int)Math.round(qg2.F());
        int n3 = (int)Math.round(qg2.V());
        int n4 = (int)Math.round(qg2.B());
        double d4 = 10.0;
        this.H(g5, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)2884, (long)(0x1D23B853BB42DBC9L ^ l10)), (long)-2324879410455451812L, (long)l10)), this.G() + d4, this.W() + d3 / 2.0 + 2.5, this.s(Color.WHITE));
        this.H(g52, String.valueOf(n2), this.G() + (d4 += g5.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)6840, (long)(0x57B94C0BC7E64A37L ^ l10)), (long)-2324879410455451812L, (long)l10))) + 2.5), this.W() + d3 / 2.0, this.s(Color.WHITE));
        this.f(this.G() + (d4 += Math.max(22.0, 5.0 + g52.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)32500, (long)(0x6EDCE460D6D5AE68L ^ l10)), (long)-2324879410455451812L, (long)l10))) * (double)String.valueOf(n2).length())), this.W() + d3 / 2.0 + 4.0, this.E());
        F8.T((double)((int)(this.G() + (d4 += 10.0))), (double)((int)(this.W() + d3 / 2.0)), 8.0, 1.2f, color);
        this.H(g5, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)10394, (long)(0x60449E3857587816L ^ l10)), (long)-2324879410455451812L, (long)l10)), this.G() + (d4 += 10.0), this.W() + d3 / 2.0 + 2.5, this.s(Color.WHITE));
        this.H(g52, String.valueOf(n3), this.G() + (d4 += g5.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)30216, (long)(0x2611F73659268DL ^ l10)), (long)-2324879410455451812L, (long)l10))) + 2.5), this.W() + d3 / 2.0, this.s(Color.WHITE));
        F8.T((double)((int)(this.G() + (d4 += Math.max(22.0, 5.0 + g52.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)29212, (long)(0x698BD4E137372281L ^ l10)), (long)-2324879410455451812L, (long)l10))) * (double)String.valueOf(n3).length())))), (double)((int)(this.W() + d3 / 2.0)), 8.0, 1.2f, color);
        this.H(g5, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)8946, (long)(0x50B251A86A85F272L ^ l10)), (long)-2324879410455451812L, (long)l10)), this.G() + (d4 += 10.0), this.W() + d3 / 2.0 + 2.5, this.s(Color.WHITE));
        this.H(g52, String.valueOf(n4), this.G() + (d4 += g5.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)18676, (long)(0x31D361EB80D69877L ^ l10)), (long)-2324879410455451812L, (long)l10))) + 2.5), this.W() + d3 / 2.0, this.s(Color.WHITE));
        this.f(this.G() + (d4 += Math.max(22.0, 5.0 + g52.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)20823, (long)(0x56AF5C44E9F681D3L ^ l10)), (long)-2324879410455451812L, (long)l10))) * (double)String.valueOf(n4).length())), this.W() + d3 / 2.0 + 4.0, this.y());
        this.Sr = d4;
        d4 = 10.0;
        this.H(g5, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)18129, (long)(0x6216359D8B4C964FL ^ l10)), (long)-2324879410455451812L, (long)l10)), this.G() + d4, this.W() + d3 + d3 / 2.0 - 2.5, this.s(Color.WHITE));
        this.H(g5, this.z(), this.G() + (d4 += g5.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)20098, (long)(0x988CF96600A9E0AL ^ l10)), (long)-2324879410455451812L, (long)l10)))), this.W() + d3 + d3 / 2.0 - 2.5, this.s(fl.M.I));
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
                n4 = 6;
                break;
            }
            case 1: {
                n4 = 16;
                break;
            }
            case 2: {
                n4 = 51;
                break;
            }
            case 3: {
                n4 = 10;
                break;
            }
            case 4: {
                n4 = 31;
                break;
            }
            case 5: {
                n4 = 22;
                break;
            }
            case 6: {
                n4 = 44;
                break;
            }
            case 7: {
                n4 = 8;
                break;
            }
            case 8: {
                n4 = 40;
                break;
            }
            case 9: {
                n4 = 1;
                break;
            }
            case 10: {
                n4 = 36;
                break;
            }
            case 11: {
                n4 = 4;
                break;
            }
            case 12: {
                n4 = 33;
                break;
            }
            case 13: {
                n4 = 2;
                break;
            }
            case 14: {
                n4 = 48;
                break;
            }
            case 15: {
                n4 = 38;
                break;
            }
            case 16: {
                n4 = 12;
                break;
            }
            case 17: {
                n4 = 62;
                break;
            }
            case 18: {
                n4 = 0;
                break;
            }
            case 19: {
                n4 = 58;
                break;
            }
            case 20: {
                n4 = 49;
                break;
            }
            case 21: {
                n4 = 56;
                break;
            }
            case 22: {
                n4 = 24;
                break;
            }
            case 23: {
                n4 = 7;
                break;
            }
            case 24: {
                n4 = 35;
                break;
            }
            case 25: {
                n4 = 19;
                break;
            }
            case 26: {
                n4 = 32;
                break;
            }
            case 27: {
                n4 = 15;
                break;
            }
            case 28: {
                n4 = 30;
                break;
            }
            case 29: {
                n4 = 5;
                break;
            }
            case 30: {
                n4 = 13;
                break;
            }
            case 31: {
                n4 = 54;
                break;
            }
            case 32: {
                n4 = 59;
                break;
            }
            case 33: {
                n4 = 57;
                break;
            }
            case 34: {
                n4 = 37;
                break;
            }
            case 35: {
                n4 = 21;
                break;
            }
            case 36: {
                n4 = 52;
                break;
            }
            case 37: {
                n4 = 42;
                break;
            }
            case 38: {
                n4 = 9;
                break;
            }
            case 39: {
                n4 = 11;
                break;
            }
            case 40: {
                n4 = 47;
                break;
            }
            case 41: {
                n4 = 34;
                break;
            }
            case 42: {
                n4 = 61;
                break;
            }
            case 43: {
                n4 = 26;
                break;
            }
            case 44: {
                n4 = 23;
                break;
            }
            case 45: {
                n4 = 29;
                break;
            }
            case 46: {
                n4 = 14;
                break;
            }
            case 47: {
                n4 = 53;
                break;
            }
            case 48: {
                n4 = 3;
                break;
            }
            case 49: {
                n4 = 50;
                break;
            }
            case 50: {
                n4 = 17;
                break;
            }
            case 51: {
                n4 = 28;
                break;
            }
            case 52: {
                n4 = 39;
                break;
            }
            case 53: {
                n4 = 25;
                break;
            }
            case 54: {
                n4 = 46;
                break;
            }
            case 55: {
                n4 = 63;
                break;
            }
            case 56: {
                n4 = 20;
                break;
            }
            case 57: {
                n4 = 43;
                break;
            }
            case 58: {
                n4 = 18;
                break;
            }
            case 59: {
                n4 = 55;
                break;
            }
            case 60: {
                n4 = 27;
                break;
            }
            case 61: {
                n4 = 45;
                break;
            }
            case 62: {
                n4 = 60;
                break;
            }
            default: {
                n4 = 41;
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
        fl.Jb[n5] = new String(cArray);
        return n5;
    }

    private boolean S() {
        boolean bl2;
        try {
            if (this.Sy == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw fl.a(o_2);
        }
        try {
            bl2 = this.Sy.r.J() == this.Sy.O;
        }
        catch (O_ o_3) {
            throw fl.a(o_3);
        }
        return bl2;
    }

    private static int f(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0xF30;
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
                throw new RuntimeException("a/fl", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fl.wb[n3] = n4;
        }
        return wb[n3];
    }

    private static Field w(long l10, long l11) {
        int n2 = fl.u(l10, l11);
        Object object = Ib[n2];
        if (object instanceof String) {
            String string = Jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = fl.v(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = fl.v(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fl.k(clazz3, string2, clazz2)) != null) {
                    fl.Ib[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = fl.l(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        fl.Ib[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fl.v(273608941373524L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void X() {
        long l10 = fb ^ 0x611D571CFD59L;
        G5 g5 = SE.h.W().T(0.7, true);
        G5 g52 = SE.h.W().T(1.1, true);
        double d2 = this.b() / 4.0;
        double d3 = 8.0;
        Color color = Rs.y(Color.WHITE, 51);
        Qg qg2 = EP.U();
        int n2 = (int)Math.round(qg2.F());
        int n3 = (int)Math.round(qg2.V());
        int n4 = (int)Math.round(qg2.B());
        this.H(g5, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)12048, (long)(0x2495312F629B46B2L ^ l10)), (long)7392449363580706423L, (long)l10)), this.G() + d3, this.W() + d2 / 2.0, this.s(Color.WHITE));
        this.H(g52, String.valueOf(n2), this.G() + d3 + g5.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)29345, (long)(0x5AD4F9DCB3219B08L ^ l10)), (long)7392449363580706423L, (long)l10))) + 2.5, this.W() + d2 / 2.0 - 2.5, this.s(Color.WHITE));
        this.f(this.G() + this.w() - 12.0, this.W() + d2 / 2.0 + 1.5, this.E());
        this.H(g5, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)19338, (long)(0x5B9E98D33708A22AL ^ l10)), (long)7392449363580706423L, (long)l10)), this.G() + d3, this.W() + d2 + d2 / 2.0, this.s(Color.WHITE));
        this.H(g52, String.valueOf(n3), this.G() + d3 + g5.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)12627, (long)(0x20097B8603B6D8E1L ^ l10)), (long)7392449363580706423L, (long)l10))) + 2.5, this.W() + d2 + d2 / 2.0 - 2.5, this.s(Color.WHITE));
        this.H(g5, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)401, (long)(0x77D23F0CB628E83BL ^ l10)), (long)7392449363580706423L, (long)l10)), this.G() + d3, this.W() + d2 * 2.0 + d2 / 2.0, this.s(Color.WHITE));
        this.H(g52, String.valueOf(n4), this.G() + d3 + g5.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)16529, (long)(0x3C56299C81C22934L ^ l10)), (long)7392449363580706423L, (long)l10))) + 2.5, this.W() + d2 * 2.0 + d2 / 2.0 - 2.5, this.s(Color.WHITE));
        this.f(this.G() + this.w() - 12.0, this.W() + d2 * 2.0 + d2 / 2.0, this.y());
        F8.r(this.G() + d3, this.W() + d2 + 1.5, this.w() - 15.0, 1.0f, color);
        F8.r(this.G() + d3, this.W() + d2 * 2.0 + 1.5, this.w() - 15.0, 1.0f, color);
        F8.r(this.G() + d3, this.W() + d2 * 3.0 + 1.5, this.w() - 15.0, 1.0f, color);
        this.H(g5, (String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)16361, (long)(0x1883A85E11B5D648L ^ l10)), (long)7392449363580706423L, (long)l10)), this.G() + d3, this.W() + d2 * 3.0 + d2 / 2.0 - 2.5, this.s(Color.WHITE));
        this.H(g5, this.z(), this.G() + d3 + g5.D((String)((Object)fl.l("\u00ed", (int)fl.f("h", (int)20579, (long)(0x68098DA775EDB9CFL ^ l10)), (long)7392449363580706423L, (long)l10))) + 4.0, this.W() + d2 * 3.0 + d2 / 2.0 - 2.5, this.s(fl.M.I));
    }

    private static Class v(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = fl.u(l10, l11);
            object = Ib[n2];
            try {
                if (!(object instanceof String)) break block2;
                fl.Ib[n2] = clazz = Class.forName(Jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method x(long l10, long l11) {
        int n2 = fl.u(l10, l11);
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
                clazz3 = fl.v(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = fl.v(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fl.k(clazz, string, clazz2, n3, classArray2)) != null) {
                        fl.Ib[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fl.v(273608941373524L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = fl.l(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        fl.Ib[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fl.v(273608941373524L, 0L);
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

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fl.f(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private float E() {
        Qg qg2 = EP.U();
        float f10 = qg2.q() % 360.0f;
        if (f10 < -180.0f) {
            f10 += 360.0f;
        }
        if (f10 > 180.0f) {
            f10 -= 360.0f;
        }
        return f10 + 180.0f;
    }

    @Override
    public String A() {
        long l10 = fb ^ 0x16A01629D85EL;
        return fl.l("\u00ed", (int)fl.f("h", (int)30802, (long)(0x6F4C04583E9034F8L ^ l10)), (long)4868450823169866608L, (long)l10);
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = fl.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = fl.l(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fl.fb = d8.a(-7778042846553876292L, 4554149257737309627L, MethodHandles.lookup().lookupClass()).a(18252195997522L);
                fl.Ib = new Object[5];
                fl.Jb = new String[5];
                fl.T();
                fl.xb = new HashMap<K, V>(13);
                var0 = fl.fb ^ 120847834150173L;
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
                var8_3 = new long[21];
                var5_4 = 0;
                var6_5 = ";\u00aasO\u00d7pT\u00dc\u0089\u00c6\u00fb3\u009b9AE]\u00ca\u00a4\u0090\u00a3VI@\u00f6\u0089\u00c4\f\u0082\u00d4\u00f1\u00b0#\u0000@\u0081\u0091\u009f\u008c\u00b4\u0014\u00bdC\u00ee\u000f\u00bcDx6t\u0018\u00bd\u0096\u0086G$\u0014\u00d9\u00ee\u00c28\u00fe\u00a8>\f\u000eME \u0096&\u0099lis\u00e2bWT\u00feFN\u00a3c\u00acM-\b\u00e4\u0014\u009f\u00bbt\u001c\u009e\u00b1\u0010\u00c1[SL-I\u00d9\u00c1?\b\u00ed_\u00c9\u00a3\u0081v3\u0084\u00103\u00f9\u00c3\u00a6\u0087\f\u00dfc=\u00f9\u001f|J!\u00a4\u00f8\u00f9'b\u009b\u00a6\u009a\u008e\u00c1\u0002\u0086WX\u00bap\u00a9\u000e\u00bc\u00ac\u00d9[";
                var7_6 = ";\u00aasO\u00d7pT\u00dc\u0089\u00c6\u00fb3\u009b9AE]\u00ca\u00a4\u0090\u00a3VI@\u00f6\u0089\u00c4\f\u0082\u00d4\u00f1\u00b0#\u0000@\u0081\u0091\u009f\u008c\u00b4\u0014\u00bdC\u00ee\u000f\u00bcDx6t\u0018\u00bd\u0096\u0086G$\u0014\u00d9\u00ee\u00c28\u00fe\u00a8>\f\u000eME \u0096&\u0099lis\u00e2bWT\u00feFN\u00a3c\u00acM-\b\u00e4\u0014\u009f\u00bbt\u001c\u009e\u00b1\u0010\u00c1[SL-I\u00d9\u00c1?\b\u00ed_\u00c9\u00a3\u0081v3\u0084\u00103\u00f9\u00c3\u00a6\u0087\f\u00dfc=\u00f9\u001f|J!\u00a4\u00f8\u00f9'b\u009b\u00a6\u009a\u008e\u00c1\u0002\u0086WX\u00bap\u00a9\u000e\u00bc\u00ac\u00d9[".length();
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
                    var6_5 = "\u00a8\u00c3\u00d9!0\u00c8\u0014\u00fa3s\u00a1>R\u00fa\u00eeI";
                    var7_6 = "\u00a8\u00c3\u00d9!0\u00c8\u0014\u00fa3s\u00a1>R\u00fa\u00eeI".length();
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
        fl.vb = var8_3;
        fl.wb = new Integer[21];
    }

    private boolean y() {
        boolean bl2;
        block5: {
            block4: {
                float f10 = this.E();
                try {
                    try {
                        if (!(f10 > 90.0f) || !(f10 < 270.0f)) break block4;
                    }
                    catch (O_ o_2) {
                        throw fl.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw fl.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private String z() {
        DI dI;
        int n2;
        int n3;
        block7: {
            Qg qg2 = EP.U();
            n3 = (int)Math.floor(qg2.F());
            n2 = (int)Math.floor(qg2.B());
            try {
                if (kX.C() >= 35) {
                    return EP.c().X(DK.t(n3, 0, n2)).g();
                }
            }
            catch (O_ o_2) {
                throw fl.a(o_2);
            }
            dI = EP.c().n(n3, n2);
            DW dW = EP.c().B();
            try {
                try {
                    if (dI != null && dW != null) break block7;
                }
                catch (O_ o_3) {
                    throw fl.a(o_3);
                }
                return "";
            }
            catch (O_ o_4) {
                throw fl.a(o_4);
            }
        }
        Du du = dI.r(n3, n2, EP.c().B());
        return du.g();
    }

    public fl() {
        super(jI.class);
    }

    private static void T() {
        Object[] objectArray = Ib;
        Ib[0] = "dX%";
        objectArray[1] = Integer.TYPE;
        fl.Jb[1] = "java/lang/Integer";
        objectArray[2] = "\"\\gXg3)Sv\u0017\u001a+:T\u007f^";
        objectArray[3] = "5-T-zt>\"Eb\u001bz5)A8";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\"\u0013\\\u0002Z:\"\u0011\u0013n\b(O\u0016Z\t\u001b2#\u001f\u0018\u0014\u001bSvM\u0019\u0002\biuD\u001d\u0011c";
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method l(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = fl.k(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = fl.l(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    @Override
    public double b() {
        try {
            if (this.S()) {
                return 90.0;
            }
        }
        catch (O_ o_2) {
            throw fl.a(o_2);
        }
        return 35.0;
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = fl.f(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'o' || c10 == 'a' || c10 == '\u00aa' || c10 == 'H') {
                field = fl.w(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fl.x(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ed' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean u() {
        boolean bl2;
        try {
            if (this.Sy == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw fl.a(o_2);
        }
        try {
            bl2 = this.Sy.r.J() == this.Sy.R;
        }
        catch (O_ o_3) {
            throw fl.a(o_3);
        }
        return bl2;
    }

    private boolean E() {
        boolean bl2;
        block5: {
            block4: {
                float f10 = this.E();
                try {
                    try {
                        if (!(f10 > 0.0f) || !(f10 < 180.0f)) break block4;
                    }
                    catch (O_ o_2) {
                        throw fl.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw fl.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fl.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fl.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

