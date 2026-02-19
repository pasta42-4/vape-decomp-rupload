/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.C_;
import a.Fv;
import a.Gi;
import a.I_;
import a.JF;
import a.Kx;
import a.O_;
import a.SE;
import a.T9;
import a.Tb;
import a.Tx;
import a.Y2;
import a.bE;
import a.c1;
import a.d8;
import a.fB;
import a.fr;
import a.h8;
import a.hS;
import a.hq;
import a.jJ;
import a.jU;
import a.rn;
import a.sN;
import a.vi;
import a.yE;
import a.yG;
import a.z_;
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
public class wz
extends yG {
    private static final Integer[] eb;
    private static final long[] bb;
    private final h8 t2;
    private final hS tQ;
    private final z_ tj;
    private static final long ab;
    private boolean tP;
    private boolean tU;
    private final jU tp;
    private static final Object[] lb;
    private final hS tb;
    private static final Map fb;
    private final yE t6;
    private static final String[] mb;

    private void lambda$null$2(z_ z_2, Tb tb2) {
        this.z(z_2, tb2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void z(z_ z_2, Tb tb2) {
        long l10 = ab ^ 0x17B6B313F1C1L;
        try {
            switch (Y2.J[tb2.l().ordinal()]) {
                case 1: {
                    Gi.W(new sN(vi.SUCCESS, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)4936, (long)(0x6E11D8260746D83AL ^ l10)), (long)-1587503551491532520L, (long)l10)) + z_2.j() + (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)10613, (long)(0x13B1E218743C6211L ^ l10)), (long)-1587503551491532520L, (long)l10))));
                    return;
                }
                case 2: {
                    Gi.W(new sN(vi.ERROR, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)17157, (long)(0x48B69BAE133F8876L ^ l10)), (long)-1587503551491532520L, (long)l10))));
                    return;
                }
                case 3: 
                case 4: 
                case 5: {
                    Gi.W(new sN(vi.ERROR, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)11073, (long)(0x3D7546CA58CDE03BL ^ l10)), (long)-1587503551491532520L, (long)l10)) + z_2.j() + (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)8555, (long)(0xE61AC01E09A6A17L ^ l10)), (long)-1587503551491532520L, (long)l10))));
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (O_ o_2) {
            throw wz.a(o_2);
        }
    }

    @Override
    public void E() {
        super.E();
    }

    public wz(z_ z_2) {
        Color color;
        double d2;
        rn rn2;
        rn rn3;
        hS hS2;
        boolean bl2;
        long l10;
        block22: {
            block21: {
                boolean bl3;
                boolean bl4;
                block19: {
                    block18: {
                        boolean bl5;
                        boolean bl6;
                        block17: {
                            block16: {
                                l10 = ab ^ 0x20F2597D663FL;
                                super(99.0, 35.0);
                                this.tQ = new hS((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)9517, (long)(0x345DE63EA0C79A7L ^ l10)), (long)9081010203272646374L, (long)l10)), 0.2, 20.0, 13.0, wz.M.O, 0.9);
                                this.tb = new hq(this, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)1376, (long)(0x50F1B6778E3F59E1L ^ l10)), (long)9081010203272646374L, (long)l10)), 0.2, 20.0, 13.0, wz.M.Y, 0.9);
                                this.t2 = new h8((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)31250, (long)(0x1C77C826A3B6269DL ^ l10)), (long)9081010203272646374L, (long)l10)), 0.7, false, 46.0, 13.0, wz.M.Y, 0.9);
                                this.tp = new jJ(this, (Object)null, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)4965, (long)(0x481668215CF7CFE2L ^ l10)), (long)9081010203272646374L, (long)l10)), false);
                                this.t6 = new yE((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)11914, (long)(0x1AE2B5E365BC720FL ^ l10)), (long)9081010203272646374L, (long)l10)), 0.8, this.tp);
                                this.tP = false;
                                this.tj = z_2;
                                bl6 = SE.h.O().p().Q() != null;
                                try {
                                    try {
                                        if (!bl6 || !SE.h.O().p().Q().u().contains(z_2)) break block16;
                                    }
                                    catch (O_ o_2) {
                                        throw wz.a(o_2);
                                    }
                                    bl5 = true;
                                    break block17;
                                }
                                catch (O_ o_3) {
                                    throw wz.a(o_3);
                                }
                            }
                            bl5 = false;
                        }
                        bl4 = bl5;
                        try {
                            try {
                                if (!bl6 || !SE.h.O().p().Q().H().contains(z_2)) break block18;
                            }
                            catch (O_ o_4) {
                                throw wz.a(o_4);
                            }
                            bl3 = true;
                            break block19;
                        }
                        catch (O_ o_5) {
                            throw wz.a(o_5);
                        }
                    }
                    bl3 = false;
                }
                boolean bl7 = bl3;
                try {
                    block20: {
                        try {
                            try {
                                wz wz2 = this;
                                if (z_2.h().equals((Object)Fv.OFFLINE) || bl4) break block20;
                            }
                            catch (O_ o_6) {
                                throw wz.a(o_6);
                            }
                            if (!bl7) break block21;
                        }
                        catch (O_ o_7) {
                            throw wz.a(o_7);
                        }
                    }
                    bl2 = true;
                    break block22;
                }
                catch (O_ o_8) {
                    throw wz.a(o_8);
                }
            }
            bl2 = false;
        }
        try {
            rn rn4;
            wz2.tU = bl2;
            hS2 = this.tb;
            rn3 = rn4;
            rn2 = rn4;
            d2 = 0.15;
            color = this.tU ? wz.M.g : new Color(45, 45, 45);
        }
        catch (O_ o_9) {
            throw wz.a(o_9);
        }
        rn3(d2, color, this.tU ? wz.M.g : this.tb.k());
        hS2.p(rn2);
        this.tb.R(new rn(0.15, this.tU ? wz.M.K : wz.M.Z, this.tU ? wz.M.K : wz.M.q));
        this.tp.H(z_2.h());
        this.i(false);
        this.t6.J(true);
        this.t6.T(90.0);
        this.t6.Y(90.0);
        this.t6.i(false);
        this.d().f((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)13612, (long)(0x37BDE251BA8C69ACL ^ l10)), (long)9081010203272646374L, (long)l10)));
        this.tQ.g((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)2530, (long)(0x2C93EE62A32F557AL ^ l10)), (long)9081010203272646374L, (long)l10)));
        this.tb.g((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)21245, (long)(0x1408BCC935A40E74L ^ l10)), (long)9081010203272646374L, (long)l10)));
        this.t6.g((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)7810, (long)(0x2F23F7C28874420AL ^ l10)), (long)9081010203272646374L, (long)l10)));
        this.z();
        this.tb.N(() -> this.lambda$new$6(z_2));
        this.o(new bE(99.0, 1.0), new bE(6.0, 1.0), this.tQ, new bE(2.0, 1.0), this.tb, new bE(2.0, 1.0), this.t2, new bE(99.0, 2.0), new bE(2.0, 1.0), this.t6);
    }

    @Override
    public void d() {
        block27: {
            Color color;
            double d2;
            rn rn2;
            rn rn3;
            hS hS2;
            block29: {
                block28: {
                    boolean bl2;
                    block26: {
                        block25: {
                            boolean bl3;
                            boolean bl4;
                            block23: {
                                block22: {
                                    boolean bl5;
                                    boolean bl6;
                                    block21: {
                                        block20: {
                                            boolean bl7;
                                            try {
                                                super.d();
                                                bl7 = SE.h.O().p().Q() != null;
                                            }
                                            catch (O_ o_2) {
                                                throw wz.a(o_2);
                                            }
                                            bl6 = bl7;
                                            try {
                                                try {
                                                    if (!bl6 || !SE.h.O().p().Q().u().contains(this.tj)) break block20;
                                                }
                                                catch (O_ o_3) {
                                                    throw wz.a(o_3);
                                                }
                                                bl5 = true;
                                                break block21;
                                            }
                                            catch (O_ o_4) {
                                                throw wz.a(o_4);
                                            }
                                        }
                                        bl5 = false;
                                    }
                                    bl4 = bl5;
                                    try {
                                        try {
                                            if (!bl6 || !SE.h.O().p().Q().H().contains(this.tj)) break block22;
                                        }
                                        catch (O_ o_5) {
                                            throw wz.a(o_5);
                                        }
                                        bl3 = true;
                                        break block23;
                                    }
                                    catch (O_ o_6) {
                                        throw wz.a(o_6);
                                    }
                                }
                                bl3 = false;
                            }
                            boolean bl8 = bl3;
                            try {
                                block24: {
                                    try {
                                        try {
                                            if (this.tj.h().equals((Object)Fv.OFFLINE) || bl4) break block24;
                                        }
                                        catch (O_ o_7) {
                                            throw wz.a(o_7);
                                        }
                                        if (!bl8) break block25;
                                    }
                                    catch (O_ o_8) {
                                        throw wz.a(o_8);
                                    }
                                }
                                bl2 = true;
                                break block26;
                            }
                            catch (O_ o_9) {
                                throw wz.a(o_9);
                            }
                        }
                        bl2 = false;
                    }
                    boolean bl9 = bl2;
                    try {
                        try {
                            rn rn4;
                            if (this.tU == bl9) break block27;
                            this.tU = bl9;
                            hS2 = this.tb;
                            rn3 = rn4;
                            rn2 = rn4;
                            d2 = 0.15;
                            if (!this.tU) break block28;
                        }
                        catch (O_ o_10) {
                            throw wz.a(o_10);
                        }
                        color = wz.M.g;
                        break block29;
                    }
                    catch (O_ o_11) {
                        throw wz.a(o_11);
                    }
                }
                color = new Color(45, 45, 45);
            }
            rn3(d2, color, this.tU ? wz.M.g : this.tb.k());
            hS2.p(rn2);
            this.tb.R(new rn(0.15, this.tU ? wz.M.K : wz.M.Z, this.tU ? wz.M.K : wz.M.q));
        }
    }

    private void lambda$null$0(z_ z_2, Tb tb2) {
        this.z(z_2, tb2);
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

    @Override
    public double z() {
        return 35.0;
    }

    private void lambda$null$9(fB fB2) {
        Ao.z(fB2);
        I_.h().c().f(this.tj.s(), this::lambda$null$7, this::lambda$null$8);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = wz.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private void lambda$null$5() {
        this.tP = false;
    }

    private void z() {
        this.tQ.N(this::lambda$addDeleteListener$11);
    }

    private void lambda$null$8() {
        this.tP = false;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = wz.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                wz.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public h8 F() {
        return this.t2;
    }

    private void lambda$addDeleteListener$11() {
        long l10 = ab ^ 0x5E7FA72A20F8L;
        try {
            if (this.tP) {
                return;
            }
        }
        catch (O_ o_2) {
            throw wz.a(o_2);
        }
        this.tP = true;
        C_ c_2 = new C_((String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)27953, (long)(0x2DA7223AE8807775L ^ l10)), (long)4089624872426457121L, (long)l10)), (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)23006, (long)(0x3DBB20BA8CE84380L ^ l10)), (long)4089624872426457121L, (long)l10)), (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)226, (long)(0x2A3E9EAEEB021AAEL ^ l10)), (long)4089624872426457121L, (long)l10)));
        fr fr2 = Ao.v(this.V(), c_2, fr.class);
        c_2.Z().N(() -> this.lambda$null$9(fr2));
        c_2.u().N(() -> this.lambda$null$10(fr2));
        fr2.l(new c1(this, fr2));
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x228F;
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
                throw new RuntimeException("a/wz", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wz.eb[n3] = n4;
        }
        return eb[n3];
    }

    private void lambda$null$3() {
        this.tP = false;
    }

    @Override
    public double e() {
        return 99.0;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 't' || c10 == 'C' || c10 == '\u00d4' || c10 == 'R') {
                field = wz.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 't' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'C' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wz.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00fd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$new$6(z_ z_2) {
        block20: {
            block18: {
                JF jF2;
                long l10;
                block19: {
                    block17: {
                        l10 = ab ^ 0x7E7559FA73FBL;
                        try {
                            if (this.tP) {
                                return;
                            }
                        }
                        catch (O_ o_2) {
                            throw wz.a(o_2);
                        }
                        try {
                            if (z_2.h() == Fv.OFFLINE) {
                                return;
                            }
                        }
                        catch (O_ o_3) {
                            throw wz.a(o_3);
                        }
                        this.tP = true;
                        jF2 = SE.h.O().p().Q();
                        try {
                            try {
                                if (jF2 == null || jF2.X()) break block17;
                            }
                            catch (O_ o_4) {
                                throw wz.a(o_4);
                            }
                            this.tP = false;
                            return;
                        }
                        catch (O_ o_5) {
                            throw wz.a(o_5);
                        }
                    }
                    try {
                        try {
                            if (jF2 == null) break block18;
                            if (!jF2.u().contains(z_2)) break block19;
                        }
                        catch (O_ o_6) {
                            throw wz.a(o_6);
                        }
                        this.tP = false;
                        Gi.W(new sN(vi.ERROR, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)11427, (long)(0x7D65A969CE2AE5E9L ^ l10)), (long)7764878854782753570L, (long)l10))));
                        return;
                    }
                    catch (O_ o_7) {
                        throw wz.a(o_7);
                    }
                }
                try {
                    if (jF2.H().contains(z_2)) {
                        this.tP = false;
                        Gi.W(new sN(vi.ERROR, (String)((Object)wz.d("\u00fd", (int)wz.c("j", (int)17671, (long)(0x217A5677D1820C45L ^ l10)), (long)7764878854782753570L, (long)l10))));
                        return;
                    }
                }
                catch (O_ o_8) {
                    throw wz.a(o_8);
                }
                I_.h().c().l(z_2.s(), arg_0 -> this.lambda$null$0(z_2, arg_0), this::lambda$null$1);
                break block20;
            }
            I_.h().c().W(arg_0 -> this.lambda$null$4(z_2, arg_0), this::lambda$null$5);
        }
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = wz.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = wz.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static boolean Z(wz wz2) {
        return wz2.tU;
    }

    private void lambda$null$4(z_ z_2, T9 t92) {
        try {
            if (t92.c() == Kx.SUCCESS) {
                this.tP = true;
                I_.h().c().l(z_2.s(), arg_0 -> this.lambda$null$2(z_2, arg_0), this::lambda$null$3);
            }
        }
        catch (O_ o_2) {
            throw wz.a(o_2);
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = wz.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = wz.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void lambda$null$10(fB fB2) {
        Ao.z(fB2);
        this.tP = false;
    }

    private void lambda$null$7(Tx tx2) {
        block3: {
            block2: {
                try {
                    if (tx2.T()) break block2;
                    break block3;
                }
                catch (O_ o_2) {
                    throw wz.a(o_2);
                }
            }
            SE.h.j().y(this.tj.u());
            SE.h.M().f(this.tj);
        }
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
                n4 = 23;
                break;
            }
            case 1: {
                n4 = 5;
                break;
            }
            case 2: {
                n4 = 19;
                break;
            }
            case 3: {
                n4 = 51;
                break;
            }
            case 4: {
                n4 = 63;
                break;
            }
            case 5: {
                n4 = 21;
                break;
            }
            case 6: {
                n4 = 26;
                break;
            }
            case 7: {
                n4 = 48;
                break;
            }
            case 8: {
                n4 = 27;
                break;
            }
            case 9: {
                n4 = 45;
                break;
            }
            case 10: {
                n4 = 32;
                break;
            }
            case 11: {
                n4 = 0;
                break;
            }
            case 12: {
                n4 = 36;
                break;
            }
            case 13: {
                n4 = 58;
                break;
            }
            case 14: {
                n4 = 13;
                break;
            }
            case 15: {
                n4 = 52;
                break;
            }
            case 16: {
                n4 = 22;
                break;
            }
            case 17: {
                n4 = 59;
                break;
            }
            case 18: {
                n4 = 46;
                break;
            }
            case 19: {
                n4 = 41;
                break;
            }
            case 20: {
                n4 = 15;
                break;
            }
            case 21: {
                n4 = 7;
                break;
            }
            case 22: {
                n4 = 20;
                break;
            }
            case 23: {
                n4 = 34;
                break;
            }
            case 24: {
                n4 = 3;
                break;
            }
            case 25: {
                n4 = 14;
                break;
            }
            case 26: {
                n4 = 11;
                break;
            }
            case 27: {
                n4 = 55;
                break;
            }
            case 28: {
                n4 = 54;
                break;
            }
            case 29: {
                n4 = 35;
                break;
            }
            case 30: {
                n4 = 31;
                break;
            }
            case 31: {
                n4 = 37;
                break;
            }
            case 32: {
                n4 = 12;
                break;
            }
            case 33: {
                n4 = 8;
                break;
            }
            case 34: {
                n4 = 18;
                break;
            }
            case 35: {
                n4 = 28;
                break;
            }
            case 36: {
                n4 = 33;
                break;
            }
            case 37: {
                n4 = 42;
                break;
            }
            case 38: {
                n4 = 4;
                break;
            }
            case 39: {
                n4 = 39;
                break;
            }
            case 40: {
                n4 = 2;
                break;
            }
            case 41: {
                n4 = 1;
                break;
            }
            case 42: {
                n4 = 25;
                break;
            }
            case 43: {
                n4 = 61;
                break;
            }
            case 44: {
                n4 = 9;
                break;
            }
            case 45: {
                n4 = 56;
                break;
            }
            case 46: {
                n4 = 10;
                break;
            }
            case 47: {
                n4 = 60;
                break;
            }
            case 48: {
                n4 = 43;
                break;
            }
            case 49: {
                n4 = 16;
                break;
            }
            case 50: {
                n4 = 40;
                break;
            }
            case 51: {
                n4 = 38;
                break;
            }
            case 52: {
                n4 = 30;
                break;
            }
            case 53: {
                n4 = 49;
                break;
            }
            case 54: {
                n4 = 24;
                break;
            }
            case 55: {
                n4 = 17;
                break;
            }
            case 56: {
                n4 = 57;
                break;
            }
            case 57: {
                n4 = 62;
                break;
            }
            case 58: {
                n4 = 6;
                break;
            }
            case 59: {
                n4 = 29;
                break;
            }
            case 60: {
                n4 = 47;
                break;
            }
            case 61: {
                n4 = 50;
                break;
            }
            case 62: {
                n4 = 53;
                break;
            }
            default: {
                n4 = 44;
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
        wz.mb[n5] = new String(cArray);
        return n5;
    }

    static z_ e(wz wz2) {
        return wz2.tj;
    }

    private static Method l(long l10, long l11) {
        int n2 = wz.i(l10, l11);
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
                clazz3 = wz.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = wz.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wz.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        wz.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wz.j(234360470440987L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = wz.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        wz.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wz.j(234360470440987L, 0L);
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

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = ";\n\u000e";
        objectArray[1] = Integer.TYPE;
        wz.mb[1] = "java/lang/Integer";
        objectArray[2] = "UIq\u001c\u0003\u0014^F`S~\fMAi\u001a";
        objectArray[3] = "\u0019REJI\u0006\u0012]T\u0005(\b\u0019VP_";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "m\u001a\u000e4\u007f4rR\u000eT-=\r\u0019Bd;yqCFe/F4B\u0018;\u007f/l_\u0003lF";
    }

    private void lambda$null$1() {
        this.tP = false;
    }

    private static Field k(long l10, long l11) {
        int n2 = wz.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = wz.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = wz.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wz.e(clazz3, string2, clazz2)) != null) {
                    wz.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = wz.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        wz.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wz.j(234360470440987L, 0L);
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
                wz.ab = d8.a(7829381748943853436L, 3906270624420337746L, MethodHandles.lookup().lookupClass()).a(21871778927331L);
                wz.lb = new Object[5];
                wz.mb = new String[5];
                wz.x();
                wz.fb = new HashMap<K, V>(13);
                var0 = wz.ab ^ 81496845753284L;
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
                var8_3 = new long[19];
                var5_4 = 0;
                var6_5 = "!\u00f6m\u00b9\u00f66\u00e9\n\u00ea\u00e2nY\u00b1\u00a0\u00e3G\u00d1\u00e4\u00b5\u0095\u00b5\u00fa7\u00dfOa\u00a0\u0000E\u00b7r\u00f7\u00de\u009e\u00a7\u00c2\u00e0\u0083\u0019\u00e6\u009e0\u00a7\u00a1\u00a7\\\u0099\u0007\u008a\u0002\u00e5V9.\u00c0\u00ce\u00d5Z\u00a9Hs\u00d9\u0097A\u0014\u001d\u0084T\u0014\u00a7\u00ceL\u0015Tb\u00c5\u00cf\u00d3M}Z\u0080X\u0094\u00ec\u00e9J\u001f\u00f1K\u00e9\u00e7\u00fb\u00eb\u00e0,\u00ac\u0018I\u00cf%\u00ec\u00f7\u00b0\u0004\u00dc\u00e1\u0088\u00e3\u00d5C\f\u00beZ\u0007\u00e8\u0007\u00cc\u00eb\u0086k\u008e\u00ea&\u00d4J\u00b51\u00a9\u0017\u00efWk\u00e6!=";
                var7_6 = "!\u00f6m\u00b9\u00f66\u00e9\n\u00ea\u00e2nY\u00b1\u00a0\u00e3G\u00d1\u00e4\u00b5\u0095\u00b5\u00fa7\u00dfOa\u00a0\u0000E\u00b7r\u00f7\u00de\u009e\u00a7\u00c2\u00e0\u0083\u0019\u00e6\u009e0\u00a7\u00a1\u00a7\\\u0099\u0007\u008a\u0002\u00e5V9.\u00c0\u00ce\u00d5Z\u00a9Hs\u00d9\u0097A\u0014\u001d\u0084T\u0014\u00a7\u00ceL\u0015Tb\u00c5\u00cf\u00d3M}Z\u0080X\u0094\u00ec\u00e9J\u001f\u00f1K\u00e9\u00e7\u00fb\u00eb\u00e0,\u00ac\u0018I\u00cf%\u00ec\u00f7\u00b0\u0004\u00dc\u00e1\u0088\u00e3\u00d5C\f\u00beZ\u0007\u00e8\u0007\u00cc\u00eb\u0086k\u008e\u00ea&\u00d4J\u00b51\u00a9\u0017\u00efWk\u00e6!=".length();
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
                    var6_5 = "C\u008e\u00a5\u00a1\u00ca\u00e4\u001b\u00e3\u00a0\u0094\u000b\u00de(\u0097\u0084\u00d6";
                    var7_6 = "C\u008e\u00a5\u00a1\u00ca\u00e4\u001b\u00e3\u00a0\u0094\u000b\u00de(\u0097\u0084\u00d6".length();
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
        wz.bb = var8_3;
        wz.eb = new Integer[19];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = wz.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wz.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(wz.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

