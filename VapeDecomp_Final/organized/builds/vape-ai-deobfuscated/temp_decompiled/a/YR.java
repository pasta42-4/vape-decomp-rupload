/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package a;

import a.B7;
import a.Bg;
import a.CK;
import a.Cv;
import a.D0;
import a.Dg;
import a.EP;
import a.F8;
import a.FG;
import a.G5;
import a.Hc;
import a.I2;
import a.O_;
import a.Od;
import a.QF;
import a.Qh;
import a.SE;
import a.V4;
import a.WB;
import a.X_;
import a._Y;
import a.bE;
import a.bg;
import a.d8;
import a.s7;
import a.sy;
import a.wa;
import a.xi;
import a.y;
import a.yG;
import a.yY;
import a.zM;
import a.zT;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public class yr
extends yY {
    private static final String[] mb;
    @NotNull
    private final I2 wY;
    private static final Integer[] eb;
    private static final Object[] lb;
    private static final List<Integer> wN;
    private final Od w6;
    private static final long ab;
    private final bg wI;
    private float wk;
    private static final long[] bb;
    float wR;
    private Cv[] w7;
    private yG wW;
    private boolean wp;
    private static final Map fb;
    Bg wu;
    private boolean w4;
    private final Color wJ;
    int wg;
    private yG w8;
    private Qh w3;
    Bg wx;
    private final bg wU;
    private ArrayList<Cv> wV;
    private CK wd;

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x675A;
        if (eb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yr", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            yr.eb[n3] = n4;
        }
        return eb[n3];
    }

    private static Field k(long l10, long l11) {
        int n2 = yr.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = yr.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = yr.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yr.e(clazz3, string2, clazz2)) != null) {
                    yr.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = yr.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        yr.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yr.j(223185696576342L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void L() {
        block20: {
            int n2;
            block19: {
                boolean bl2;
                int n3;
                block18: {
                    block17: {
                        n3 = this.wY.x();
                        n2 = this.wY.k(this.w3);
                        try {
                            block16: {
                                try {
                                    try {
                                        if (this.w3 == null) break block16;
                                        if (n3 <= 4) break block17;
                                    }
                                    catch (O_ o_2) {
                                        throw yr.a(o_2);
                                    }
                                    if (n2 == 0) break block17;
                                }
                                catch (O_ o_3) {
                                    throw yr.a(o_3);
                                }
                            }
                            bl2 = true;
                            break block18;
                        }
                        catch (O_ o_4) {
                            throw yr.a(o_4);
                        }
                    }
                    bl2 = false;
                }
                boolean bl3 = bl2;
                try {
                    try {
                        try {
                            if (!bl3) break block19;
                            if (n3 == 0) break block20;
                        }
                        catch (O_ o_5) {
                            throw yr.a(o_5);
                        }
                        if (!this.wu.m(1000 / n3)) break block20;
                    }
                    catch (O_ o_6) {
                        throw yr.a(o_6);
                    }
                    this.wu.m();
                    ++this.wg;
                    break block20;
                }
                catch (O_ o_7) {
                    throw yr.a(o_7);
                }
            }
            try {
                try {
                    if (n2 != 1 || this.wY.W() <= 1) break block20;
                }
                catch (O_ o_8) {
                    throw yr.a(o_8);
                }
                this.wu.m();
                ++this.wg;
            }
            catch (O_ o_9) {
                throw yr.a(o_9);
            }
        }
    }

    private G5 r(double d2) {
        long l10 = ab ^ 0x49CB2471217DL;
        int n2 = (d2 + (String)((Object)yr.d("\u00ce", (int)yr.c("q", (int)2161, (long)(0x30EEDC4C89B93F76L ^ l10)), (long)5790053862812748639L, (long)l10))).length();
        try {
            if (n2 < 10) {
                return this.L(0.8);
            }
        }
        catch (O_ o_2) {
            throw yr.a(o_2);
        }
        return this.L(0.7);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = yr.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public Qh H() {
        return this.w3;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'b' || c10 == '\u00da' || c10 == '\u00f1' || c10 == 'L') {
                field = yr.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yr.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void M(boolean bl2) {
        boolean bl3;
        CK cK2;
        boolean bl4;
        int n2;
        block40: {
            block41: {
                s7 s72;
                block38: {
                    block39: {
                        V4 v42;
                        CK cK3;
                        V4 v43;
                        block37: {
                            block36: {
                                V4 v44;
                                block35: {
                                    block33: {
                                        block34: {
                                            this.w8.i(false);
                                            this.w8.Q(yr.M.O);
                                            this.L();
                                            float f10 = this.v();
                                            n2 = (int)(f10 * 255.0f);
                                            bl4 = this.m();
                                            s72 = this.wY.n()[this.wY.n()];
                                            try {
                                                try {
                                                    try {
                                                        if (this.w3 == null || !this.w3.r()) break block33;
                                                    }
                                                    catch (O_ o_2) {
                                                        throw yr.a(o_2);
                                                    }
                                                    if (!this.w3.a().r()) break block34;
                                                }
                                                catch (O_ o_3) {
                                                    throw yr.a(o_3);
                                                }
                                                v44 = this.w3.a();
                                                break block35;
                                            }
                                            catch (O_ o_4) {
                                                throw yr.a(o_4);
                                            }
                                        }
                                        v44 = null;
                                        break block35;
                                    }
                                    v44 = null;
                                }
                                v43 = v44;
                                try {
                                    cK3 = this.wd;
                                    if (!bl4) break block36;
                                    v42 = v43;
                                    break block37;
                                }
                                catch (O_ o_5) {
                                    throw yr.a(o_5);
                                }
                            }
                            try {
                                v42 = s72 != null ? s72.F() : null;
                            }
                            catch (O_ o_6) {
                                throw yr.a(o_6);
                            }
                        }
                        try {
                            try {
                                try {
                                    cK3.r(v42);
                                    cK2 = this.wd;
                                    if (!bl4) break block38;
                                    if (v43 == null) break block39;
                                }
                                catch (O_ o_7) {
                                    throw yr.a(o_7);
                                }
                                if (zT.j(v43).size() <= 0) break block39;
                            }
                            catch (O_ o_8) {
                                throw yr.a(o_8);
                            }
                            bl3 = true;
                            break block40;
                        }
                        catch (O_ o_9) {
                            throw yr.a(o_9);
                        }
                    }
                    bl3 = false;
                    break block40;
                }
                try {
                    try {
                        if (s72 == null || !s72.C()) break block41;
                    }
                    catch (O_ o_10) {
                        throw yr.a(o_10);
                    }
                    bl3 = true;
                    break block40;
                }
                catch (O_ o_11) {
                    throw yr.a(o_11);
                }
            }
            bl3 = false;
        }
        cK2.Z(bl3);
        this.wd.v(n2);
        this.wd.i(bl2);
        for (int i10 = 0; i10 < this.w7.length; ++i10) {
            Cv cv2;
            block45: {
                Object object;
                cv2 = this.w7[i10];
                if (bl4) {
                    boolean bl5;
                    Cv cv3;
                    block43: {
                        block42: {
                            Object object2;
                            Cv cv4;
                            object = new V4(EP.U().l().G()[3 - i10]);
                            try {
                                cv4 = cv2;
                                object2 = ((Hc)object).r() ? object : null;
                            }
                            catch (O_ o_12) {
                                throw yr.a(o_12);
                            }
                            try {
                                try {
                                    cv4.r((V4)object2);
                                    cv3 = cv2;
                                    if (!((Hc)object).r() || zT.j((V4)object).size() <= 0) break block42;
                                }
                                catch (O_ o_13) {
                                    throw yr.a(o_13);
                                }
                                bl5 = true;
                                break block43;
                            }
                            catch (O_ o_14) {
                                throw yr.a(o_14);
                            }
                        }
                        bl5 = false;
                    }
                    cv3.Z(bl5);
                } else {
                    block44: {
                        object = this.wY.W()[3 - i10];
                        try {
                            try {
                                if (object == null || ((s7)object).x() == 0) break block44;
                            }
                            catch (O_ o_15) {
                                throw yr.a(o_15);
                            }
                            cv2.r(((s7)object).F());
                            cv2.Z(((s7)object).C());
                            break block45;
                        }
                        catch (O_ o_16) {
                            throw yr.a(o_16);
                        }
                    }
                    cv2.r(null);
                }
            }
            cv2.i(bl2);
        }
    }

    private void J(double d2, double d3, float f10, float f11, float f12) {
        Color color;
        block12: {
            float f13;
            float f14;
            float f15 = 0.5f;
            if (this.wk < f10) {
                f14 = this.wk / f10;
                f13 = 1.0f - f14;
                this.wk += f15 * f13;
            }
            if (this.wk > f10) {
                f14 = f10 / this.wk;
                if (this.wk == 0.0f) {
                    f14 = 0.0f;
                }
                f13 = 1.0f - f14;
                this.wk -= f15 * f13;
            }
            try {
                try {
                    if (!Float.isNaN(this.wk) && Float.isFinite(this.wk)) break block12;
                }
                catch (O_ o_2) {
                    throw yr.a(o_2);
                }
                this.wk = f10;
            }
            catch (O_ o_3) {
                throw yr.a(o_3);
            }
        }
        f10 = Math.max(f10, 0.0f);
        double d4 = d2;
        double d5 = d3;
        double d6 = 75.0;
        double d7 = 2.0;
        float f16 = 0.6f;
        float f17 = f10 / Math.max(f11, 1.0f);
        float f18 = f10 / Math.max(f11, 1.0f);
        F8.c(d4, d5, d6, d7, new Color(54, 54, 54, 255), true, f16, 1.0f, 4.0f, new Color(0, 0, 0, 152));
        if (this.w3 == null) {
            f18 = 1.0f;
        }
        try {
            color = f10 > 0.0f ? FG.B(f18, true) : Color.RED;
        }
        catch (O_ o_4) {
            throw yr.a(o_4);
        }
        Color color2 = color;
        F8.o(d4, d5, Math.min(d6 * (double)f17, d6), d7, color2, false, f16, 1.0f);
        if (f12 > 0.0f) {
            f12 = Math.min(10.0f, f12);
            double d9 = Math.max(d4, d4 + d6 * (double)f17 - 2.0);
            double d10 = d4 + d6;
            double d11 = d4 + d6 * (double)f17;
            double d12 = 10.0f * (f12 / 2.0f);
            double d13 = d10 - (d11 - 2.0 + d12);
            if (d13 < 0.0) {
                d9 -= Math.abs(d13);
            }
            F8.o(d9, d5, d12, d7, this.wJ, true, f16, 1.0f);
        }
    }

    private void B(double d2, double d3) {
        try {
            if (!this.wY.U()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw yr.a(o_2);
        }
        WB wB2 = a.y.r().j(this.wY.l() + "", 32);
        try {
            if (wB2 != null) {
                F8.T((double)((float)(d2 - 0.5)), (double)((float)(d3 - 0.5)), 11.0, 1.0, yr.M.O);
                F8.c((float)d2, (float)d3, 10.0f, 1.0f, Color.WHITE, wB2);
            }
        }
        catch (O_ o_3) {
            throw yr.a(o_3);
        }
    }

    public yr(@NotNull I2 i22) {
        long l10 = ab ^ 0xCAFE6FECB80L;
        super(114.0, 52.0);
        this.w3 = null;
        this.wk = 0.0f;
        this.wJ = new Color((int)yr.c("q", (int)23337, (long)(0x64C9F9EB2E5886D1L ^ l10)));
        this.wd = new CK();
        this.w7 = new Cv[]{new Cv(), new Cv(), new Cv(), new Cv()};
        this.wV = new ArrayList();
        this.wW = new yG(110.0, 45.0);
        this.w8 = new yG(110.0, 58.0);
        this.wp = false;
        this.wu = new Bg();
        this.wx = new Bg();
        this.wg = 0;
        this.wY = i22;
        this.i(false);
        this.wU = new bg(i22.z().X(), 0.7, 1.0, 0.1, 74.0, false, true, Color.white);
        this.wI = new bg(i22.z().j(), 0.6, 0.9, 0.1, 74.0, false, true, yr.M.c);
        this.w8.d().f((String)((Object)yr.d("\u00ce", (int)yr.c("q", (int)25992, (long)(0x49F36F441C0B387EL ^ l10)), (long)-4996987691689385566L, (long)l10)));
        this.w8.o(new bE(110.0, 36.0));
        yG yG2 = new yG(110.0, 23.0);
        yG2.i(false);
        yG2.n(new bE(34.0, 1.0), new Object[0]);
        yG2.n(this.wd, new Object[0]);
        for (Cv cv2 : this.w7) {
            yG2.o(new bE(1.0, 0.0), cv2);
        }
        this.w8.n(yG2, new Object[0]);
        this.w8.i(false);
        this.n(this.w8, new Object[0]);
        this.wW.i(false);
        this.O();
        this.wW.N(false);
        this.n(this.wW, new Object[0]);
        this.w6 = Od.e;
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

    public I2 f() {
        return this.wY;
    }

    @Override
    public void d() {
        try {
            super.d();
            if (EP.U().Y()) {
                return;
            }
        }
        catch (O_ o_2) {
            throw yr.a(o_2);
        }
        this.M(this.y());
    }

    private void O() {
        long l10 = ab ^ 0x86DFF54CFACL;
        this.wV.clear();
        this.wW.d().f((String)((Object)yr.d("\u00ce", (int)yr.c("q", (int)11166, (long)(0x55A0382C41B1724CL ^ l10)), (long)-4716633400684780146L, (long)l10)));
        this.wW.i(false);
        this.wW.f();
        this.wW.n(new bE(110.0, 1.5), new Object[0]);
        yG yG2 = new yG(110.0, 6.0);
        yG2.o(new bE(110.0, 1.0), new bE(93.0, 6.0));
        this.wW.n(yG2, new Object[0]);
        yG2.i(false);
        for (int n2 : wN) {
            yG yG3 = new yG(110.0, 11.0);
            yG3.i(false);
            yG3.n(new bE(8.0, 10.0), new Object[0]);
            for (int i10 = 0; i10 < 9; ++i10) {
                V4 v42;
                Cv cv2;
                Cv cv3 = new Cv(10.0, 10.0, 8);
                s7 s72 = this.wY.n()[n2 * 9 + i10];
                try {
                    cv2 = cv3;
                    v42 = s72 != null ? s72.F() : null;
                }
                catch (O_ o_2) {
                    throw yr.a(o_2);
                }
                try {
                    cv2.r(v42);
                    this.wV.add(cv3);
                    if (i10 != 0) {
                        yG3.n(new bE(1.0, 11.0), new Object[0]);
                    }
                }
                catch (O_ o_3) {
                    throw yr.a(o_3);
                }
                yG3.n(cv3, new Object[0]);
            }
            this.wW.n(yG3, new Object[0]);
        }
    }

    private void o(float f10) {
        long l10 = ab ^ 0x67C2197BFEC6L;
        try {
            if (f10 <= 0.0f) {
                F8.T(this.G() + 5.0, this.W() + 7.0, 24.0, 1.0, new Color(0, 0, 0, 200));
                X_.B(new Color(197, 49, 49, 255), (float)this.G() + 5.0f + 12.0f - 4.0f, (float)this.W() + 9.0f + 13.0f - 6.0f, (String)((Object)yr.d("\u00ce", (int)yr.c("q", (int)22933, (long)(0x250E75824FD83127L ^ l10)), (long)-8079095689006557980L, (long)l10)), 8.0f, 8.0f, true);
            }
        }
        catch (O_ o_2) {
            throw yr.a(o_2);
        }
    }

    public void M(wa wa2) {
        Object object;
        bg bg2;
        Object object2;
        bg bg3;
        QF qF2;
        long l10;
        block17: {
            l10 = ab ^ 0x66BFC0A1AB49L;
            try {
                if (this.w3 == null || this.w3.equals(EP.U())) break block17;
            }
            catch (O_ o_2) {
                throw yr.a(o_2);
            }
            qF2 = EP.c().I(this.w3.X());
            try {
                this.w3 = qF2.r() ? new Qh(qF2) : null;
            }
            catch (O_ o_3) {
                throw yr.a(o_3);
            }
        }
        qF2 = EP.U();
        double d2 = this.wY.y(this.w3);
        double d3 = this.wY.e(this.w3);
        double d4 = this.wY.I(this.w3);
        float f10 = this.wY.j(this.w3);
        float f11 = this.wY.n(this.w3);
        float f12 = this.wY.k(this.w3);
        try {
            if (this.y()) {
                F8.S(this.G(), this.W(), this.w(), this.b(), new Color(26, 25, 26, 150));
            }
        }
        catch (O_ o_4) {
            throw yr.a(o_4);
        }
        double d5 = this.G() + 6.0;
        double d6 = this.W() + 10.0;
        double d7 = 22.0;
        WB wB2 = a.y.r().j(this.wY.z().X(), 32);
        try {
            if (wB2 != null) {
                F8.T((double)((float)(d5 - 0.5)), (double)((float)(d6 - 0.5)), (double)((float)(d7 + 1.0)), 1.0, new Color(50, 50, 50, 255));
                F8.c((float)d5, (float)d6, (float)d7, 1.0f, Color.WHITE, wB2);
            }
        }
        catch (O_ o_5) {
            throw yr.a(o_5);
        }
        double d9 = d5 + d7 + 6.0;
        try {
            bg3 = this.wU;
            object2 = this.wY != null ? this.wY.z().X() : yr.d("\u00ce", (int)yr.c("q", (int)8309, (long)(0x777FA177516A9D49L ^ l10)), (long)-2707146906428669589L, (long)l10);
        }
        catch (O_ o_6) {
            throw yr.a(o_6);
        }
        bg3.V((String)object2);
        double d10 = d6 + 4.0;
        try {
            this.wU.V(d9, d10 - this.wU.E() / 2.0);
            bg2 = this.wI;
            object = this.wY != null ? this.wY.z().j() : yr.d("\u00ce", (int)yr.c("q", (int)9428, (long)(0x5B05CA4D063D19E6L ^ l10)), (long)-2707146906428669589L, (long)l10);
        }
        catch (O_ o_7) {
            throw yr.a(o_7);
        }
        bg2.V((String)object);
        this.wI.V(d9, d10 + 10.0 - this.wI.E() / 2.0);
        double d11 = d6 + 18.0;
        this.J(d9, d11, f10, f11, f12);
        this.D();
        this.o(f10);
        F8.T(this.G() + this.w() - 8.0, this.W() + 4.0, 4.0, 1.0, new Color(0, 0, 0, 255));
        F8.T(this.G() + this.w() - 8.0, this.W() + 4.0, 4.0, 1.0, B7.P(this.wY.z().M()));
        if (!this.w4) {
            Object object3;
            this.U(d5, d6, d7, this.M(EP.U(), d2, d4));
            int n2 = (int)_Y.V(qF2.r(), qF2.y(), qF2.D(), d2, d3, d4);
            try {
                object3 = n2 > yr.c("q", (int)17278, (long)(0x2289B0B47CD7E4EL ^ l10)) ? yr.d("\u00ce", (int)yr.c("q", (int)3937, (long)(0xF59DDBBFAB63255L ^ l10)), (long)-2707146906428669589L, (long)l10) : n2 + (String)((Object)yr.d("\u00ce", (int)yr.c("q", (int)28287, (long)(0x39DD263679895349L ^ l10)), (long)-2707146906428669589L, (long)l10));
            }
            catch (O_ o_8) {
                throw yr.a(o_8);
            }
            CallSite callSite = object3;
            G5 g5 = this.r(n2);
            double d12 = Math.max(d5 + d7 / 2.0 - g5.D((String)((Object)callSite)) / 2.0, this.G() + 2.0);
            double d13 = d6 + d7 + 6.0 + (this.W() + this.b() - 2.0 - (d6 + 4.0 + d7 + 4.0) - g5.B((String)((Object)callSite))) / 2.0;
            g5.Y((String)((Object)callSite), d12, d13, yr.M.c);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = yr.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = yr.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean q() {
        return this.w6.V().s();
    }

    private boolean y() {
        return this.w6.d().s();
    }

    private static Method l(long l10, long l11) {
        int n2 = yr.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = yr.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = yr.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yr.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        yr.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yr.j(223185696576342L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = yr.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        yr.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yr.j(223185696576342L, 0L);
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

    private float v() {
        block7: {
            try {
                if (this.wR > 0.0f) {
                    this.wR = (float)this.wx.d() / 50.0f;
                    this.wR = Math.max(this.wR, 0.0f);
                }
            }
            catch (O_ o_2) {
                throw yr.a(o_2);
            }
            try {
                try {
                    if (this.wg <= 0 || !(this.wR <= 0.0f)) break block7;
                }
                catch (O_ o_3) {
                    throw yr.a(o_3);
                }
                this.wR = 1.0f;
                --this.wg;
            }
            catch (O_ o_4) {
                throw yr.a(o_4);
            }
        }
        return this.wR;
    }

    public yr(zM zM2) {
        this(zM2.i());
        this.w4 = true;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = yr.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "5e_";
        objectArray[1] = Integer.TYPE;
        yr.mb[1] = "java/lang/Integer";
        objectArray[2] = "0\u001f8\u0006\u000fW;\u0010)IrO(\u0017 \u0000";
        objectArray[3] = "[xe\u0018VDPwtW7J[|p\r";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ")z\u0000wE,6}TN\u00146O3\u0007 \u001e-t D(\u007ft,rE<\u0012)r%HN";
    }

    private boolean m() {
        boolean bl2;
        List<I2> list = this.w6.R();
        try {
            bl2 = list.size() == 0;
        }
        catch (O_ o_2) {
            throw yr.a(o_2);
        }
        return bl2;
    }

    @Override
    public void E() {
        wa wa2 = (wa)this.V();
        this.A();
        if (this.wp) {
            Cv cv2 = this.O(wa2);
            super.E();
            F8.U(cv2.G(), cv2.W(), cv2.w(), cv2.b(), Color.white, 1.6f, 0.8f, 1.0f);
            return;
        }
        try {
            this.M(wa2);
            super.E();
            if (this.q()) {
                this.x(this.G() + 30.0, this.W() + this.b() - 10.0, this.y());
            }
        }
        catch (O_ o_2) {
            throw yr.a(o_2);
        }
        try {
            if (this.wx.m(50L)) {
                this.wx.m();
            }
        }
        catch (O_ o_3) {
            throw yr.a(o_3);
        }
        this.v();
    }

    private Cv O(wa wa2) {
        int n2;
        ArrayList<Cv> arrayList;
        Color color;
        double d2;
        double d3;
        String string;
        Object object;
        long l10 = ab ^ 0x205830AF5C5EL;
        boolean bl2 = this.m();
        this.wW.b(this.G());
        this.wW.M(this.W());
        this.wW.A();
        String string2 = "";
        for (xi object2 : SE.h.U().q()) {
            try {
                if (!object2.Z() || object2.N() == 0) continue;
            }
            catch (O_ o_2) {
                throw yr.a(o_2);
            }
            string2 = string2 + object2.O() + (String)((Object)yr.d("\u00ce", (int)yr.c("q", (int)19433, (long)(0x31FA57DA5C3681CBL ^ l10)), (long)3276666545157928572L, (long)l10));
        }
        for (Cv cv2 : this.wV) {
            Color color2;
            Cv cv3;
            try {
                cv3 = cv2;
                color2 = this.y() ? yr.M.W : new Color(26, 25, 26, 150);
            }
            catch (O_ o_3) {
                throw yr.a(o_3);
            }
            cv3.Q(color2);
        }
        try {
            if (this.y()) {
                F8.S(this.G(), this.W(), this.w(), this.b(), new Color(26, 25, 26, 150));
            }
        }
        catch (O_ o_4) {
            throw yr.a(o_4);
        }
        G5 g5 = this.L(0.75);
        try {
            object = g5;
            string = this.wY.z().X();
            d3 = this.G() + 8.0;
            d2 = this.W() + 4.0 - g5.B(this.wY.z().X()) / 2.0;
            color = this.y() ? yr.M.c : Color.white;
        }
        catch (O_ o_5) {
            throw yr.a(o_5);
        }
        try {
            ((G5)object).Y(string, d3, d2, color);
            arrayList = this.wV;
            n2 = bl2 ? this.w3.l().v() + 27 : this.wY.n() + 27;
        }
        catch (O_ o_6) {
            throw yr.a(o_6);
        }
        return arrayList.get(n2);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = yr.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = yr.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = yr.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                yr.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void l() {
        boolean bl2 = this.m();
        int n2 = 0;
        for (int n3 : wN) {
            for (int i10 = 0; i10 < 9; ++i10) {
                boolean bl3;
                Cv cv2;
                block35: {
                    block36: {
                        s7 s72;
                        block33: {
                            block34: {
                                V4 v42;
                                Cv cv3;
                                boolean bl4;
                                Cv cv4;
                                V4 v43;
                                block32: {
                                    block30: {
                                        block31: {
                                            boolean bl5;
                                            block29: {
                                                block28: {
                                                    V4 v44;
                                                    block27: {
                                                        block26: {
                                                            int n4 = n3 * 9 + i10;
                                                            s72 = this.wY.n()[n4];
                                                            try {
                                                                try {
                                                                    if (this.w3 == null || !this.w3.r()) break block26;
                                                                }
                                                                catch (O_ o_2) {
                                                                    throw yr.a(o_2);
                                                                }
                                                                v44 = this.w3.l().F(n4);
                                                                break block27;
                                                            }
                                                            catch (O_ o_3) {
                                                                throw yr.a(o_3);
                                                            }
                                                        }
                                                        v44 = null;
                                                    }
                                                    v43 = v44;
                                                    cv4 = this.wV.get(n2);
                                                    try {
                                                        try {
                                                            if (v43 == null || !v43.r()) break block28;
                                                        }
                                                        catch (O_ o_4) {
                                                            throw yr.a(o_4);
                                                        }
                                                        bl5 = true;
                                                        break block29;
                                                    }
                                                    catch (O_ o_5) {
                                                        throw yr.a(o_5);
                                                    }
                                                }
                                                bl5 = false;
                                            }
                                            bl4 = bl5;
                                            try {
                                                try {
                                                    cv3 = cv4;
                                                    if (!bl2) break block30;
                                                    if (!bl4) break block31;
                                                }
                                                catch (O_ o_6) {
                                                    throw yr.a(o_6);
                                                }
                                                v42 = v43;
                                                break block32;
                                            }
                                            catch (O_ o_7) {
                                                throw yr.a(o_7);
                                            }
                                        }
                                        v42 = null;
                                        break block32;
                                    }
                                    try {
                                        v42 = s72 != null ? s72.F() : null;
                                    }
                                    catch (O_ o_8) {
                                        throw yr.a(o_8);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            cv3.r(v42);
                                            cv2 = cv4;
                                            if (!bl2) break block33;
                                            if (!bl4) break block34;
                                        }
                                        catch (O_ o_9) {
                                            throw yr.a(o_9);
                                        }
                                        if (zT.j(v43).size() <= 0) break block34;
                                    }
                                    catch (O_ o_10) {
                                        throw yr.a(o_10);
                                    }
                                    bl3 = true;
                                    break block35;
                                }
                                catch (O_ o_11) {
                                    throw yr.a(o_11);
                                }
                            }
                            bl3 = false;
                            break block35;
                        }
                        try {
                            try {
                                if (s72 == null || !s72.C()) break block36;
                            }
                            catch (O_ o_12) {
                                throw yr.a(o_12);
                            }
                            bl3 = true;
                            break block35;
                        }
                        catch (O_ o_13) {
                            throw yr.a(o_13);
                        }
                    }
                    bl3 = false;
                }
                cv2.Z(bl3);
                ++n2;
            }
        }
    }

    private double V(double d2, double d3, double d4, double d5) {
        double d6;
        block11: {
            double d7;
            double d9;
            block10: {
                block9: {
                    block8: {
                        d6 = 0.0;
                        d9 = d4 - d2;
                        d7 = d5 - d3;
                        try {
                            if (!(d7 > 0.0) || !(d9 > 0.0)) break block8;
                        }
                        catch (O_ o_2) {
                            throw yr.a(o_2);
                        }
                        d6 = Math.toDegrees(-Math.atan(d9 / d7));
                        break block11;
                    }
                    try {
                        if (!(d7 > 0.0) || !(d9 < 0.0)) break block9;
                    }
                    catch (O_ o_3) {
                        throw yr.a(o_3);
                    }
                    d6 = Math.toDegrees(-Math.atan(d9 / d7));
                    break block11;
                }
                try {
                    if (!(d7 < 0.0) || !(d9 > 0.0)) break block10;
                }
                catch (O_ o_4) {
                    throw yr.a(o_4);
                }
                d6 = -90.0 + Math.toDegrees(Math.atan(d7 / d9));
                break block11;
            }
            try {
                if (!(d7 < 0.0) || !(d9 < 0.0)) break block11;
            }
            catch (O_ o_5) {
                throw yr.a(o_5);
            }
            d6 = 90.0 + Math.toDegrees(Math.atan(d7 / d9));
        }
        double d10 = sy.v((float)d6);
        return sy.v((float)(d10 -= (double)sy.v(EP.U().q())));
    }

    public void p() {
        Dg dg;
        block16: {
            dg = EP.c();
            try {
                if (dg.Y()) {
                    return;
                }
            }
            catch (O_ o_2) {
                throw yr.a(o_2);
            }
            try {
                if (this.wY.z() instanceof zM) {
                    this.w3 = EP.U();
                    return;
                }
            }
            catch (O_ o_3) {
                throw yr.a(o_3);
            }
            try {
                try {
                    if (this.w3 == null || !((D0)dg).I(this.w3.X()).Y()) break block16;
                }
                catch (O_ o_4) {
                    throw yr.a(o_4);
                }
                this.w3 = null;
            }
            catch (O_ o_5) {
                throw yr.a(o_5);
            }
        }
        try {
            if (this.w3 != null) {
                return;
            }
        }
        catch (O_ o_6) {
            throw yr.a(o_6);
        }
        for (Object e10 : dg.M()) {
            Qh qh2 = new Qh(e10);
            try {
                if (!qh2.e().equalsIgnoreCase(this.wY.z().X())) continue;
                this.w3 = qh2;
                break;
            }
            catch (O_ o_7) {
                throw yr.a(o_7);
            }
        }
    }

    private double M(QF qF2, double d2, double d3) {
        return this.V(qF2.r(), qF2.D(), d2, d3);
    }

    private void D() {
        int n2 = this.wY.o(this.w3);
        if (n2 > 0) {
            double d2 = (double)n2 / 20.0;
            int n3 = (int)(255.0 * d2);
            F8.T(this.G() + 6.0, this.W() + 10.0, 22.0, 1.0, new Color(255, 0, 0, n3));
        }
    }

    public void K(boolean bl2) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        try {
                            try {
                                if (bl2 != this.wp) break block6;
                                if (!this.wp) break block7;
                            }
                            catch (O_ o_2) {
                                throw yr.a(o_2);
                            }
                            this.l();
                        }
                        catch (O_ o_3) {
                            throw yr.a(o_3);
                        }
                    }
                    return;
                }
                try {
                    this.wp = bl2;
                    if (!bl2) break block8;
                    this.l();
                    this.w8.N(false);
                    this.wW.N(true);
                    break block9;
                }
                catch (O_ o_4) {
                    throw yr.a(o_4);
                }
            }
            this.wW.N(false);
            this.w8.N(true);
            this.w8.A();
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void x(double d2, double d3, boolean bl2) {
        G5 g5 = this.L(0.75);
        String string = this.wY.x() + "";
        if (bl2) {
            // empty if block
        }
        g5.Y(string, d2 - g5.D(string) / 2.0, d3 - g5.B(string) / 2.0, Color.white);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void U(double d2, double d3, double d4, double d5) {
        double d6 = d4 / 2.0;
        double d7 = d2 + d6;
        double d9 = d3 + d6;
        double d10 = Math.toRadians(d5);
        double d11 = Math.toRadians(d5 - 12.0);
        double d12 = Math.toRadians(d5 + 12.0);
        double d13 = d7 + (d6 + 4.0) * Math.sin(d10);
        double d14 = d9 - (d6 + 4.0) * Math.cos(d10);
        double d15 = d7 + (d6 + 2.0) * Math.sin(d11);
        double d16 = d9 - (d6 + 2.0) * Math.cos(d11);
        double d17 = d7 + (d6 + 2.0) * Math.sin(d12);
        double d18 = d9 - (d6 + 2.0) * Math.cos(d12);
        F8.m(d15, d16, d13, d14, d17, d18, yr.M.q);
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (mb[n5] != null) {
            return n5;
        }
        Object object = lb[n5];
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
                n4 = 57;
                break;
            }
            case 2: {
                n4 = 0;
                break;
            }
            case 3: {
                n4 = 7;
                break;
            }
            case 4: {
                n4 = 16;
                break;
            }
            case 5: {
                n4 = 15;
                break;
            }
            case 6: {
                n4 = 35;
                break;
            }
            case 7: {
                n4 = 9;
                break;
            }
            case 8: {
                n4 = 63;
                break;
            }
            case 9: {
                n4 = 6;
                break;
            }
            case 10: {
                n4 = 25;
                break;
            }
            case 11: {
                n4 = 54;
                break;
            }
            case 12: {
                n4 = 10;
                break;
            }
            case 13: {
                n4 = 18;
                break;
            }
            case 14: {
                n4 = 14;
                break;
            }
            case 15: {
                n4 = 32;
                break;
            }
            case 16: {
                n4 = 8;
                break;
            }
            case 17: {
                n4 = 53;
                break;
            }
            case 18: {
                n4 = 56;
                break;
            }
            case 19: {
                n4 = 17;
                break;
            }
            case 20: {
                n4 = 13;
                break;
            }
            case 21: {
                n4 = 49;
                break;
            }
            case 22: {
                n4 = 30;
                break;
            }
            case 23: {
                n4 = 39;
                break;
            }
            case 24: {
                n4 = 21;
                break;
            }
            case 25: {
                n4 = 22;
                break;
            }
            case 26: {
                n4 = 45;
                break;
            }
            case 27: {
                n4 = 23;
                break;
            }
            case 28: {
                n4 = 47;
                break;
            }
            case 29: {
                n4 = 34;
                break;
            }
            case 30: {
                n4 = 11;
                break;
            }
            case 31: {
                n4 = 5;
                break;
            }
            case 32: {
                n4 = 60;
                break;
            }
            case 33: {
                n4 = 20;
                break;
            }
            case 34: {
                n4 = 1;
                break;
            }
            case 35: {
                n4 = 62;
                break;
            }
            case 36: {
                n4 = 50;
                break;
            }
            case 37: {
                n4 = 48;
                break;
            }
            case 38: {
                n4 = 36;
                break;
            }
            case 39: {
                n4 = 3;
                break;
            }
            case 40: {
                n4 = 33;
                break;
            }
            case 41: {
                n4 = 24;
                break;
            }
            case 42: {
                n4 = 58;
                break;
            }
            case 43: {
                n4 = 43;
                break;
            }
            case 44: {
                n4 = 51;
                break;
            }
            case 45: {
                n4 = 42;
                break;
            }
            case 46: {
                n4 = 38;
                break;
            }
            case 47: {
                n4 = 31;
                break;
            }
            case 48: {
                n4 = 4;
                break;
            }
            case 49: {
                n4 = 41;
                break;
            }
            case 50: {
                n4 = 46;
                break;
            }
            case 51: {
                n4 = 26;
                break;
            }
            case 52: {
                n4 = 52;
                break;
            }
            case 53: {
                n4 = 44;
                break;
            }
            case 54: {
                n4 = 2;
                break;
            }
            case 55: {
                n4 = 19;
                break;
            }
            case 56: {
                n4 = 12;
                break;
            }
            case 57: {
                n4 = 27;
                break;
            }
            case 58: {
                n4 = 37;
                break;
            }
            case 59: {
                n4 = 40;
                break;
            }
            case 60: {
                n4 = 55;
                break;
            }
            case 61: {
                n4 = 61;
                break;
            }
            case 62: {
                n4 = 28;
                break;
            }
            default: {
                n4 = 29;
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
        yr.mb[n5] = new String(cArray);
        return n5;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                yr.ab = d8.a(-6149522525333105851L, -2641851835376073064L, MethodHandles.lookup().lookupClass()).a(115343408338531L);
                yr.lb = new Object[5];
                yr.mb = new String[5];
                yr.x();
                yr.fb = new HashMap<K, V>(13);
                var0 = yr.ab ^ 19665298767064L;
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
                var6_5 = "\u00d0l\u0095?\u00e2\u00ed3S}\u00b3F(2\u00c6\u008a,\\\u00908\u00c0\u0000h\u00e3@\u00ad,\u0095Q-=\u00c8tz]\u0007R\u00d6\u001ab,c\u00f9\u00e5I\u0002\u00c0\u00b4\u0088\u00c7\u0083\u00bb\u00950*\u00c3p\u00f9\u00f3\u00d0\u0096\u0014c7/\u0082\u00e7\u00ea\u009c\u00a4\fG\u0094";
                var7_6 = "\u00d0l\u0095?\u00e2\u00ed3S}\u00b3F(2\u00c6\u008a,\\\u00908\u00c0\u0000h\u00e3@\u00ad,\u0095Q-=\u00c8tz]\u0007R\u00d6\u001ab,c\u00f9\u00e5I\u0002\u00c0\u00b4\u0088\u00c7\u0083\u00bb\u00950*\u00c3p\u00f9\u00f3\u00d0\u0096\u0014c7/\u0082\u00e7\u00ea\u009c\u00a4\fG\u0094".length();
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
                    var6_5 = "{\u0004\u0080\u0010\u007f\u00f5\u00df$.\u0005\u00d1#H!\u00d0\u00eb";
                    var7_6 = "{\u0004\u0080\u0010\u007f\u00f5\u00df$.\u0005\u00d1#H!\u00d0\u00eb".length();
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
        yr.bb = var8_3;
        yr.eb = new Integer[11];
        yr.wN = Arrays.asList(new Integer[]{1, 2, 3, 0});
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yr.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(yr.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

