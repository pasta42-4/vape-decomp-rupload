/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Bg;
import a.DK;
import a.Dg;
import a.E9;
import a.EO;
import a.EP;
import a.Eh;
import a.GH;
import a.KB;
import a.Na;
import a.OY;
import a.O_;
import a.Oe;
import a.Oq;
import a.Q9;
import a.QF;
import a.QU;
import a.Qf;
import a.Qg;
import a.Qo;
import a.V4;
import a.VG;
import a.Vt;
import a.a;
import a.d8;
import a.eD;
import a.eM;
import a.jU;
import a.jX;
import a.oQ;
import a.oT;
import a.pa;
import a.rt;
import a.tU;
import a.xi;
import a.zh;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class x6
extends xi {
    private static final long[] j;
    private boolean P;
    private final jX T;
    private static final Map o;
    private final Queue<eD> X;
    private final Bg z;
    private static final long e;
    private final Bg t;
    private boolean F;
    private static final boolean G = false;
    private final jU K;
    private static final String[] w;
    private static final boolean R = true;
    private boolean B;
    private static final Object[] v;
    private final Bg d;
    private static final boolean V = false;
    private final ArrayDeque<tU> O;
    private static final Integer[] n;
    private boolean l;
    private final jU h;
    private final Bg r;
    private final ArrayDeque<tU> Y;
    private final jU x;
    private static final boolean b = false;
    private double m;

    @OY
    public void G(KB kB2) {
        block91: {
            double d2;
            block90: {
                block89: {
                    block88: {
                        Qo qo2;
                        block84: {
                            block85: {
                                Dg dg;
                                block81: {
                                    block83: {
                                        block82: {
                                            block80: {
                                                block78: {
                                                    block79: {
                                                        Qg qg2 = kB2.getThePlayer();
                                                        dg = kB2.getWorld();
                                                        if (!this.P()) {
                                                            int n2;
                                                            block75: {
                                                                block76: {
                                                                    block77: {
                                                                        Qf qf2;
                                                                        block74: {
                                                                            block71: {
                                                                                Qf qf3;
                                                                                block72: {
                                                                                    block73: {
                                                                                        qf3 = zh.K(eM.rb, rt.y);
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (qf3 == null || !qf3.r()) break block71;
                                                                                                    }
                                                                                                    catch (O_ o_2) {
                                                                                                        throw x6.a(o_2);
                                                                                                    }
                                                                                                    if (!zh.y()) break block72;
                                                                                                }
                                                                                                catch (O_ o_3) {
                                                                                                    throw x6.a(o_3);
                                                                                                }
                                                                                                if (!this.F) break block73;
                                                                                            }
                                                                                            catch (O_ o_4) {
                                                                                                throw x6.a(o_4);
                                                                                            }
                                                                                            this.S();
                                                                                        }
                                                                                        catch (O_ o_5) {
                                                                                            throw x6.a(o_5);
                                                                                        }
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                Q9 q92 = qg2.l();
                                                                                try {
                                                                                    if (q92.Y()) {
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                catch (O_ o_6) {
                                                                                    throw x6.a(o_6);
                                                                                }
                                                                                int n3 = q92.v();
                                                                                int n4 = qf3.G() - 36;
                                                                                try {
                                                                                    if (n3 == n4) {
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                catch (O_ o_7) {
                                                                                    throw x6.a(o_7);
                                                                                }
                                                                                q92.A(n4);
                                                                                return;
                                                                            }
                                                                            try {
                                                                                if (!this.K.s().booleanValue()) {
                                                                                    this.T(false);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            catch (O_ o_8) {
                                                                                throw x6.a(o_8);
                                                                            }
                                                                            qf2 = zh.K(eM.rb, rt.p);
                                                                            try {
                                                                                try {
                                                                                    if (qf2 != null && !qf2.Y()) break block74;
                                                                                }
                                                                                catch (O_ o_9) {
                                                                                    throw x6.a(o_9);
                                                                                }
                                                                                this.T(false);
                                                                                return;
                                                                            }
                                                                            catch (O_ o_10) {
                                                                                throw x6.a(o_10);
                                                                            }
                                                                        }
                                                                        n2 = qf2.G();
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (zh.D()) break block75;
                                                                                    if (!zh.y()) break block76;
                                                                                }
                                                                                catch (O_ o_11) {
                                                                                    throw x6.a(o_11);
                                                                                }
                                                                                if (!this.F) break block77;
                                                                            }
                                                                            catch (O_ o_12) {
                                                                                throw x6.a(o_12);
                                                                            }
                                                                            this.S();
                                                                        }
                                                                        catch (O_ o_13) {
                                                                            throw x6.a(o_13);
                                                                        }
                                                                    }
                                                                    return;
                                                                }
                                                                this.X();
                                                                return;
                                                            }
                                                            E9 e92 = new E9(EP.X().M());
                                                            int n5 = e92.R().D();
                                                            try {
                                                                if (this.X.isEmpty()) {
                                                                    this.X.add(new eD(n5, n2, 0, 2));
                                                                    return;
                                                                }
                                                            }
                                                            catch (O_ o_14) {
                                                                throw x6.a(o_14);
                                                            }
                                                            if (this.r.m((long)this.T.l())) {
                                                                eD eD2 = this.X.poll();
                                                                try {
                                                                    if (eD2 != null) {
                                                                        this.F(eD2, n5);
                                                                    }
                                                                }
                                                                catch (O_ o_15) {
                                                                    throw x6.a(o_15);
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        try {
                                                            try {
                                                                if (!zh.y()) break block78;
                                                                if (!this.F) break block79;
                                                            }
                                                            catch (O_ o_16) {
                                                                throw x6.a(o_16);
                                                            }
                                                            this.S();
                                                        }
                                                        catch (O_ o_17) {
                                                            throw x6.a(o_17);
                                                        }
                                                    }
                                                    return;
                                                }
                                                try {
                                                    if (this.a()) {
                                                        return;
                                                    }
                                                }
                                                catch (O_ o_18) {
                                                    throw x6.a(o_18);
                                                }
                                                qo2 = this.H();
                                                try {
                                                    try {
                                                        if (qo2 != null && !qo2.Y()) break block80;
                                                    }
                                                    catch (O_ o_19) {
                                                        throw x6.a(o_19);
                                                    }
                                                    this.H();
                                                    return;
                                                }
                                                catch (O_ o_20) {
                                                    throw x6.a(o_20);
                                                }
                                            }
                                            QF qF2 = qo2.M();
                                            try {
                                                try {
                                                    try {
                                                        if (qF2 == null || !qF2.r()) break block81;
                                                    }
                                                    catch (O_ o_21) {
                                                        throw x6.a(o_21);
                                                    }
                                                    if (!this.h.s().booleanValue()) break block82;
                                                }
                                                catch (O_ o_22) {
                                                    throw x6.a(o_22);
                                                }
                                                this.H();
                                                break block83;
                                            }
                                            catch (O_ o_23) {
                                                throw x6.a(o_23);
                                            }
                                        }
                                        this.T(false);
                                    }
                                    return;
                                }
                                try {
                                    try {
                                        try {
                                            if (this.H(qo2, dg)) break block84;
                                            if (!this.x.s().booleanValue()) break block85;
                                        }
                                        catch (O_ o_24) {
                                            throw x6.a(o_24);
                                        }
                                        if (!this.z.m(3000L)) break block85;
                                    }
                                    catch (O_ o_25) {
                                        throw x6.a(o_25);
                                    }
                                    this.H();
                                }
                                catch (O_ o_26) {
                                    throw x6.a(o_26);
                                }
                            }
                            return;
                        }
                        this.z.m();
                        d2 = qo2.x();
                        if (!this.l) {
                            block87: {
                                block86: {
                                    double d3 = qo2.G();
                                    double d4 = qo2.o();
                                    double d5 = Math.abs(d3) + Math.abs(d2) + Math.abs(d4);
                                    try {
                                        try {
                                            if (!(d5 <= 0.05)) break block86;
                                            if (!this.d.m(1000L)) break block87;
                                        }
                                        catch (O_ o_27) {
                                            throw x6.a(o_27);
                                        }
                                        this.l = true;
                                        break block87;
                                    }
                                    catch (O_ o_28) {
                                        throw x6.a(o_28);
                                    }
                                }
                                this.d.m();
                            }
                            return;
                        }
                        try {
                            if (!(d2 <= 0.0)) break block88;
                            this.m += d2;
                            break block89;
                        }
                        catch (O_ o_29) {
                            throw x6.a(o_29);
                        }
                    }
                    this.m = 0.0;
                }
                try {
                    try {
                        if (!(this.m <= -0.05) && !this.B) break block90;
                    }
                    catch (O_ o_30) {
                        throw x6.a(o_30);
                    }
                    if (this.m <= -0.05) {
                        // empty if block
                    }
                }
                catch (O_ o_31) {
                    throw x6.a(o_31);
                }
                this.H();
                this.t.m();
                this.d.m();
                this.z.m();
                this.l = false;
                this.B = false;
                break block91;
            }
            if (Math.abs(d2) > 0.001) {
                // empty if block
            }
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'p' || c10 == '\u00f2' || c10 == 'a' || c10 == 'V') {
                field = x6.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'p' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00f2' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'a' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = x6.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'H' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00d5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (w[n5] != null) {
            return n5;
        }
        Object object = v[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 17;
                break;
            }
            case 1: {
                n4 = 6;
                break;
            }
            case 2: {
                n4 = 11;
                break;
            }
            case 3: {
                n4 = 26;
                break;
            }
            case 4: {
                n4 = 47;
                break;
            }
            case 5: {
                n4 = 37;
                break;
            }
            case 6: {
                n4 = 15;
                break;
            }
            case 7: {
                n4 = 0;
                break;
            }
            case 8: {
                n4 = 5;
                break;
            }
            case 9: {
                n4 = 7;
                break;
            }
            case 10: {
                n4 = 55;
                break;
            }
            case 11: {
                n4 = 35;
                break;
            }
            case 12: {
                n4 = 25;
                break;
            }
            case 13: {
                n4 = 52;
                break;
            }
            case 14: {
                n4 = 31;
                break;
            }
            case 15: {
                n4 = 30;
                break;
            }
            case 16: {
                n4 = 9;
                break;
            }
            case 17: {
                n4 = 4;
                break;
            }
            case 18: {
                n4 = 32;
                break;
            }
            case 19: {
                n4 = 12;
                break;
            }
            case 20: {
                n4 = 39;
                break;
            }
            case 21: {
                n4 = 10;
                break;
            }
            case 22: {
                n4 = 60;
                break;
            }
            case 23: {
                n4 = 51;
                break;
            }
            case 24: {
                n4 = 20;
                break;
            }
            case 25: {
                n4 = 48;
                break;
            }
            case 26: {
                n4 = 43;
                break;
            }
            case 27: {
                n4 = 59;
                break;
            }
            case 28: {
                n4 = 22;
                break;
            }
            case 29: {
                n4 = 29;
                break;
            }
            case 30: {
                n4 = 14;
                break;
            }
            case 31: {
                n4 = 42;
                break;
            }
            case 32: {
                n4 = 36;
                break;
            }
            case 33: {
                n4 = 58;
                break;
            }
            case 34: {
                n4 = 27;
                break;
            }
            case 35: {
                n4 = 53;
                break;
            }
            case 36: {
                n4 = 38;
                break;
            }
            case 37: {
                n4 = 62;
                break;
            }
            case 38: {
                n4 = 57;
                break;
            }
            case 39: {
                n4 = 1;
                break;
            }
            case 40: {
                n4 = 44;
                break;
            }
            case 41: {
                n4 = 50;
                break;
            }
            case 42: {
                n4 = 28;
                break;
            }
            case 43: {
                n4 = 18;
                break;
            }
            case 44: {
                n4 = 19;
                break;
            }
            case 45: {
                n4 = 61;
                break;
            }
            case 46: {
                n4 = 33;
                break;
            }
            case 47: {
                n4 = 13;
                break;
            }
            case 48: {
                n4 = 40;
                break;
            }
            case 49: {
                n4 = 46;
                break;
            }
            case 50: {
                n4 = 34;
                break;
            }
            case 51: {
                n4 = 49;
                break;
            }
            case 52: {
                n4 = 56;
                break;
            }
            case 53: {
                n4 = 3;
                break;
            }
            case 54: {
                n4 = 63;
                break;
            }
            case 55: {
                n4 = 24;
                break;
            }
            case 56: {
                n4 = 16;
                break;
            }
            case 57: {
                n4 = 21;
                break;
            }
            case 58: {
                n4 = 54;
                break;
            }
            case 59: {
                n4 = 2;
                break;
            }
            case 60: {
                n4 = 23;
                break;
            }
            case 61: {
                n4 = 8;
                break;
            }
            case 62: {
                n4 = 41;
                break;
            }
            default: {
                n4 = 45;
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
        x6.w[n5] = new String(cArray);
        return n5;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1149;
        if (n[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = j[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/x6", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            x6.n[n3] = n4;
        }
        return n[n3];
    }

    private void C(String string) {
    }

    public x6() {
        long l10 = e ^ 0x4D51B4F7057BL;
        super(a.cs((int)x6.a("g", (int)18766, (long)(0x72B0BAB9122E58FBL ^ l10))), (int)x6.a("g", (int)11655, (long)(0x5CDDCA4B63D3BC37L ^ l10)), Oq.k, a.cs((int)x6.a("g", (int)16083, (long)(0x25920F33997D2F6EL ^ l10))));
        this.T = jX.K(this, (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)23222, (long)(0x312EAAAD4978CB09L ^ l10)), (long)71520324023218278L, (long)l10)), (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)27369, (long)(0x75A5FA48DDA07B5BL ^ l10)), (long)71520324023218278L, (long)l10)), (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)28777, (long)(0x713C770335DD61DEL ^ l10)), (long)71520324023218278L, (long)l10)), 50.0, 75.0, 125.0, 200.0, 5.0, (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)29597, (long)(0x3A2412C780CF622CL ^ l10)), (long)71520324023218278L, (long)l10)));
        this.X = new ConcurrentLinkedQueue<eD>();
        this.Y = new ArrayDeque();
        this.O = new ArrayDeque();
        this.h = jU.R(this, (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)20020, (long)(0x6BB8AC00AEAFDF82L ^ l10)), (long)71520324023218278L, (long)l10)), false, (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)1383, (long)(0x317772792D6114DDL ^ l10)), (long)71520324023218278L, (long)l10)));
        this.x = jU.R(this, (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)22521, (long)(0xC723E9DA000464AL ^ l10)), (long)71520324023218278L, (long)l10)), false, (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)1031, (long)(0x774EEEA80A3395B3L ^ l10)), (long)71520324023218278L, (long)l10)));
        this.r = new Bg();
        this.t = new Bg();
        this.d = new Bg();
        this.z = new Bg();
        this.K = jU.R(this, (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)25564, (long)(0x9821FAF75097260L ^ l10)), (long)71520324023218278L, (long)l10)), true, (String)((Object)x6.c("\u00d5", (int)x6.a("g", (int)19417, (long)(0x7E946C8906635A67L ^ l10)), (long)71520324023218278L, (long)l10)));
        this.P = false;
        this.B = false;
        this.l = false;
        this.F = false;
        this.m = 0.0;
        this.K.l(this.T);
        this.N(this.x, this.h, this.K, this.T);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                x6.e = d8.a(3905138610676041801L, -5691629983042315538L, MethodHandles.lookup().lookupClass()).a(157256973098026L);
                x6.v = new Object[5];
                x6.w = new String[5];
                x6.d();
                x6.o = new HashMap<K, V>(13);
                var0 = x6.e ^ 75363418225643L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "w\u0099[\u0093.a\u00ec\u0096u\u0083Y\u00ad\u00a8\u008a\u00b2g7|?\u008a\u00f2\u00e9e\u00be\u0015N\u00d2-\u00e3\u00ef\u00cbIrR\u0094# \u001fu\u0088(\u000b\\\u0082\u00fb\u00ce\u00ef|\u00a4u\u00b4\u0088,\u00f7\u0014\u00aaW\u00c5\u0087\u00bf\u0016\u00c5(\u0094\u00e0\u00cd%.\u00c5\u00a5{\u0086\u00b9\u009bJ\u00b0>\u00cc\u00ca\u00a4\\ M\u00b6\u00f3\u009e:\u00b5";
                var7_6 = "w\u0099[\u0093.a\u00ec\u0096u\u0083Y\u00ad\u00a8\u008a\u00b2g7|?\u008a\u00f2\u00e9e\u00be\u0015N\u00d2-\u00e3\u00ef\u00cbIrR\u0094# \u001fu\u0088(\u000b\\\u0082\u00fb\u00ce\u00ef|\u00a4u\u00b4\u0088,\u00f7\u0014\u00aaW\u00c5\u0087\u00bf\u0016\u00c5(\u0094\u00e0\u00cd%.\u00c5\u00a5{\u0086\u00b9\u009bJ\u00b0>\u00cc\u00ca\u00a4\\ M\u00b6\u00f3\u009e:\u00b5".length();
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
                    var6_5 = "\u00b8\u00f1\u008bX\u0014\u0082\u00bfB*\u00e7\u00c5O\u0004\u0006d\u00f3";
                    var7_6 = "\u00b8\u00f1\u008bX\u0014\u0082\u00bfB*\u00e7\u00c5O\u0004\u0006d\u00f3".length();
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
        x6.j = var8_3;
        x6.n = new Integer[13];
    }

    private void l() {
        this.r.m();
        this.t.m();
        this.d.m();
        this.z.m();
        this.X.clear();
        this.Y.clear();
        this.O.clear();
        this.P = false;
        this.l = false;
        this.B = false;
        this.F = false;
        this.m = 0.0;
    }

    private boolean H(Qo qo2, Dg dg) {
        boolean bl2;
        block14: {
            block13: {
                try {
                    if (qo2.F()) {
                        return true;
                    }
                }
                catch (O_ o_2) {
                    throw x6.a(o_2);
                }
                try {
                    if (Na.MC_1_16_5.H()) {
                        return this.A(qo2, dg);
                    }
                }
                catch (O_ o_3) {
                    throw x6.a(o_3);
                }
                try {
                    if (Na.MC_1_12_2.H()) {
                        return this.k(qo2, dg);
                    }
                }
                catch (O_ o_4) {
                    throw x6.a(o_4);
                }
                try {
                    try {
                        if (!this.X(qo2, dg) && !this.E(qo2, dg)) break block13;
                    }
                    catch (O_ o_5) {
                        throw x6.a(o_5);
                    }
                    bl2 = true;
                    break block14;
                }
                catch (O_ o_6) {
                    throw x6.a(o_6);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @OY
    public void y(pa pa2) {
        Vt vt2;
        block26: {
            Qo qo2;
            block24: {
                try {
                    if (!this.l) {
                        return;
                    }
                }
                catch (O_ o_2) {
                    throw x6.a(o_2);
                }
                qo2 = this.H();
                try {
                    try {
                        if (qo2 != null && !qo2.Y()) break block24;
                    }
                    catch (O_ o_3) {
                        throw x6.a(o_3);
                    }
                    return;
                }
                catch (O_ o_4) {
                    throw x6.a(o_4);
                }
            }
            vt2 = pa2.getPacket();
            Dg dg = pa2.getWorld();
            Qg qg2 = pa2.getThePlayer();
            if (vt2.B(eM.bh)) {
                block25: {
                    VG vG2 = new VG(vt2);
                    try {
                        if (vG2.h() != qo2.X()) {
                            return;
                        }
                    }
                    catch (O_ o_5) {
                        throw x6.a(o_5);
                    }
                    int n2 = vG2.K();
                    int n3 = vG2.o();
                    double d2 = (double)vG2.I() / 8000.0;
                    try {
                        try {
                            try {
                                if (n2 != 0 || n3 != 0) break block25;
                            }
                            catch (O_ o_6) {
                                throw x6.a(o_6);
                            }
                            if (!(d2 <= -0.05)) break block25;
                        }
                        catch (O_ o_7) {
                            throw x6.a(o_7);
                        }
                        this.B = true;
                    }
                    catch (O_ o_8) {
                        throw x6.a(o_8);
                    }
                }
                return;
            }
            try {
                try {
                    if (!vt2.B(eM.b) || vt2.B(eM.Pi)) break block26;
                }
                catch (O_ o_9) {
                    throw x6.a(o_9);
                }
                return;
            }
            catch (O_ o_10) {
                throw x6.a(o_10);
            }
        }
        try {
            if (vt2.B(eM.bv)) {
                return;
            }
        }
        catch (O_ o_11) {
            throw x6.a(o_11);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = x6.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = x6.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void v() {
        super.v();
        this.l();
    }

    private boolean X() {
        this.F = true;
        return zh.K();
    }

    private static void d() {
        Object[] objectArray = v;
        v[0] = "n'\f";
        objectArray[1] = Integer.TYPE;
        x6.w[1] = "java/lang/Integer";
        objectArray[2] = "d0BSjYo?S\u001c\u0017A|8ZU";
        objectArray[3] = "$\u001fU\u0019De/\u0010DV%k$\u001b@\f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "C\u001dlNX\u0012\u0016\u001dr0]\u0005zX0\fZ\u0004\u001a\u0010?^O~C\u001b:K[\u001dC\bg@6";
    }

    private boolean E(Qo qo2, Dg dg) {
        double d2 = qo2.F();
        double d3 = qo2.V();
        double d4 = qo2.B();
        double d5 = d3;
        while (true) {
            block12: {
                Eh eh2;
                block13: {
                    try {
                        if (!(d5 >= 0.0) || !(d5 >= d3 - 3.0)) break;
                    }
                    catch (O_ o_2) {
                        throw x6.a(o_2);
                    }
                    eh2 = dg.R(d2, d5, d4);
                    try {
                        try {
                            try {
                                if (eh2 == null || !eh2.r()) break block12;
                            }
                            catch (O_ o_3) {
                                throw x6.a(o_3);
                            }
                            if (!GH.R(eh2)) break block13;
                        }
                        catch (O_ o_4) {
                            throw x6.a(o_4);
                        }
                        return true;
                    }
                    catch (O_ o_5) {
                        throw x6.a(o_5);
                    }
                }
                try {
                    if (!GH.e(eh2)) {
                        return false;
                    }
                }
                catch (O_ o_6) {
                    throw x6.a(o_6);
                }
            }
            d5 -= 1.0;
        }
        return false;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = x6.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private boolean k(Qo qo2, Dg dg) {
        return this.E(qo2, dg);
    }

    private void H() {
        block13: {
            boolean bl2;
            block11: {
                block10: {
                    Qo qo2 = this.H();
                    try {
                        try {
                            if (qo2 == null || !qo2.r()) break block10;
                        }
                        catch (O_ o_2) {
                            throw x6.a(o_2);
                        }
                        bl2 = true;
                        break block11;
                    }
                    catch (O_ o_3) {
                        throw x6.a(o_3);
                    }
                }
                bl2 = false;
            }
            boolean bl3 = bl2;
            try {
                block12: {
                    try {
                        try {
                            if (bl3 || !this.P) break block12;
                        }
                        catch (O_ o_4) {
                            throw x6.a(o_4);
                        }
                        if (!this.t.m(1000L)) break block13;
                    }
                    catch (O_ o_5) {
                        throw x6.a(o_5);
                    }
                }
                this.n(EP.N().D());
                this.t.m();
                this.z.m();
                this.d.m();
                this.P = true;
                this.m = 0.0;
            }
            catch (O_ o_6) {
                throw x6.a(o_6);
            }
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = x6.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private boolean S() {
        try {
            if (this.F) {
                this.X.clear();
                this.F = false;
                return zh.S();
            }
        }
        catch (O_ o_2) {
            throw x6.a(o_2);
        }
        return false;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = x6.a(l10, l11);
            object = v[n2];
            try {
                if (!(object instanceof String)) break block2;
                x6.v[n2] = clazz = Class.forName(w[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private boolean a() {
        boolean bl2;
        block5: {
            block4: {
                bl2 = false;
                tU tU2 = this.O.poll();
                try {
                    if (tU2 == null || !tU2.r()) break block4;
                }
                catch (O_ o_2) {
                    throw x6.a(o_2);
                }
                Oe.r(tU2, false, false);
                bl2 = true;
            }
            tU tU3 = this.Y.poll();
            try {
                if (tU3 == null || !tU3.r()) break block5;
            }
            catch (O_ o_3) {
                throw x6.a(o_3);
            }
            Oe.r(tU3, true, true);
            bl2 = true;
            this.O.add(tU3);
        }
        return bl2;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = x6.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = x6.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private void n(tU tU2) {
        Oe.r(tU2, true, true);
        this.O.add(tU2);
    }

    private void F(eD eD2, int n2) {
        this.r.m();
        int n3 = eD2.j();
        try {
            if (n2 == n3) {
                eD2.H();
            }
        }
        catch (O_ o_2) {
            throw x6.a(o_2);
        }
    }

    private static Field c(long l10, long l11) {
        int n2 = x6.a(l10, l11);
        Object object = v[n2];
        if (object instanceof String) {
            String string = w[n2];
            int n3 = string.indexOf(8);
            Class clazz = x6.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = x6.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = x6.a(clazz3, string2, clazz2)) != null) {
                    x6.v[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = x6.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        x6.v[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = x6.b(267358883266720L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/x6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean P() {
        boolean bl2;
        block8: {
            block7: {
                Qg qg2 = EP.U();
                try {
                    if (qg2.Y()) {
                        return false;
                    }
                }
                catch (O_ o_2) {
                    throw x6.a(o_2);
                }
                V4 v42 = qg2.K();
                try {
                    try {
                        if (v42.Y() || !v42.C().B(eM.rb)) break block7;
                    }
                    catch (O_ o_3) {
                        throw x6.a(o_3);
                    }
                    bl2 = true;
                    break block8;
                }
                catch (O_ o_4) {
                    throw x6.a(o_4);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    @Nullable
    private Qo H() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Method d(long l10, long l11) {
        int n2 = x6.a(l10, l11);
        Object object = v[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = w[n2];
                int n4 = string2.indexOf(8);
                clazz3 = x6.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = x6.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = x6.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        x6.v[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = x6.b(267358883266720L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = x6.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        x6.v[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = x6.b(267358883266720L, 0L);
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

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private boolean A(Qo qo2, Dg dg) {
        boolean bl2;
        DK dK = qo2.C();
        QU qU2 = dg.V(dK);
        float f10 = 0.0f;
        if (qU2.b(oT.G())) {
            f10 = qU2.c(dg, dK);
        }
        try {
            bl2 = f10 > 0.0f;
        }
        catch (O_ o_2) {
            throw x6.a(o_2);
        }
        return bl2;
    }

    private void p(String string, Object ... objectArray) {
    }

    private boolean X(Qo qo2, Dg dg) {
        boolean bl2;
        int n2 = 5;
        double d2 = 0.0;
        for (int i10 = 0; i10 < n2; ++i10) {
            oQ oQ2 = qo2.S();
            double d3 = oQ2.P() - oQ2.c();
            double d4 = oQ2.c() + d3 * (double)i10 / (double)n2;
            double d5 = oQ2.c() + d3 * (double)(i10 + 1) / (double)n2;
            oQ oQ3 = oQ.E(oQ2.F(), d4, oQ2.v(), oQ2.f(), d5, oQ2.R());
            if (!qo2.N().O(oQ3, EO.K())) continue;
            d2 += 1.0 / (double)n2;
        }
        try {
            bl2 = d2 > 0.0;
        }
        catch (O_ o_2) {
            throw x6.a(o_2);
        }
        return bl2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(x6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(x6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

