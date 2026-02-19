/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D0;
import a.Dn;
import a.Ds;
import a.E8;
import a.EP;
import a.ES;
import a.Eo;
import a.Hc;
import a.O_;
import a.Qg;
import a.V4;
import a.d8;
import a.kX;
import a.qb;
import a.t7;
import a.tG;
import a.tR;
import a.tT;
import a.tx;
import a.z6;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tu
extends Hc {
    private static final long[] b;
    private static final long a;
    private static final Integer[] c;
    private static Object I;
    private static final Map d;

    public void L(E8 e82, tx tx2, V4 v42, int n2, int n3) {
        block5: {
            block4: {
                try {
                    if (kX.C() != 13) break block4;
                    qb.V(tu.U.u().kE, this.H, e82.M(), tx2.M(), v42.M(), n2, n3);
                    break block5;
                }
                catch (O_ o_2) {
                    throw tu.a(o_2);
                }
            }
            if (kX.C() >= 50) {
                Dn dn = Dn.i();
                dn.g();
                dn.C(z6.D.i().B());
                this.p(ES.F(dn), v42, n2, n3);
            } else {
                qb.t(tu.U.u().kE, this.H, v42.M(), n2, n3);
            }
        }
    }

    public void g(float f10) {
        try {
            if (kX.C() >= 50) {
                return;
            }
        }
        catch (O_ o_2) {
            throw tu.a(o_2);
        }
        qb.D(tu.U.u().kE, this.H, f10);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = tu.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public void b(V4 v42, int n2, int n3, Dn dn) {
        boolean bl2;
        long l10 = a ^ 0x13993B23A7EAL;
        Qg qg2 = EP.U();
        tG tG2 = this.I(v42, null, qg2.M(), 0);
        this.g(this.O() + 50.0f);
        tx tx2 = EP.s();
        tx2.h(t7.S()).r(false, false);
        Ds.B(0, tx2.h(t7.S()).Q());
        Ds.l();
        Ds.U(770, 771);
        Ds.D(1.0f, 1.0f, 1.0f, 1.0f);
        Dn dn2 = Ds.u();
        dn2.g();
        dn2.m(n2, n3, 100.0f + this.O());
        dn2.s(1.0f, -1.0f, 1.0f);
        dn2.s(16.0f, 16.0f, 16.0f);
        Ds.x();
        Eo eo2 = EP.n().e();
        try {
            bl2 = !tG2.w();
        }
        catch (O_ o_2) {
            throw tu.a(o_2);
        }
        boolean bl3 = bl2;
        try {
            if (bl3) {
                tR.c();
            }
        }
        catch (O_ o_3) {
            throw tu.a(o_3);
        }
        try {
            this.V(v42, tT.J(), false, dn, eo2, (int)tu.a("m", (int)8339, (long)(0x61C8135C4960BAADL ^ l10)), (int)tu.a("m", (int)8854, (long)(0x3AD138A86BBB38A9L ^ l10)), tG2);
            eo2.K();
            Ds.O();
            if (bl3) {
                tR.l();
            }
        }
        catch (O_ o_4) {
            throw tu.a(o_4);
        }
        dn2 = Ds.u();
        dn2.v();
        Ds.x();
        this.g(this.O() - 50.0f);
    }

    public float O() {
        try {
            if (kX.C() >= 50) {
                return 100.0f;
            }
        }
        catch (O_ o_2) {
            throw tu.a(o_2);
        }
        return qb.I(tu.U.u().kE, this.H);
    }

    public void Y(float f10) {
        qb.t(tu.U.u().kE, this.H, f10);
    }

    public void V(V4 v42, tT tT2, boolean bl2, Dn dn, Eo eo2, int n2, int n3, tG tG2) {
        qb.i(tu.U.u().kE, this.H, v42.M(), tT2.M(), bl2, dn.M(), eo2.M(), n2, n3, tG2.M());
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x473B;
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
                throw new RuntimeException("a/tu", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            tu.c[n3] = n4;
        }
        return c[n3];
    }

    public tG I(V4 v42, D0 d0, Object object, int n2) {
        Object object2;
        try {
            object2 = d0 == null ? null : d0.M();
        }
        catch (O_ o_2) {
            throw tu.a(o_2);
        }
        Object object3 = object2;
        return new tG(qb.P(tu.U.u().kE, this.H, v42.M(), object3, object, n2));
    }

    public static tu f() {
        Object object;
        tu tu2;
        tu tu3;
        block10: {
            try {
                try {
                    try {
                        try {
                            if (I != null || qb.l(tu.U.u().kE) != null) break block10;
                        }
                        catch (O_ o_2) {
                            throw tu.a(o_2);
                        }
                        if (kX.C() != 13) break block10;
                    }
                    catch (O_ o_3) {
                        throw tu.a(o_3);
                    }
                    if (!z) break block10;
                }
                catch (O_ o_4) {
                    throw tu.a(o_4);
                }
                I = qb.W(tu.U.u().kE).A(new Object[0]);
            }
            catch (O_ o_5) {
                throw tu.a(o_5);
            }
        }
        try {
            tu tu4;
            tu3 = tu4;
            tu2 = tu4;
            object = I != null ? I : qb.z(tu.U.u().kE);
        }
        catch (O_ o_6) {
            throw tu.a(o_6);
        }
        tu3(object);
        return tu2;
    }

    public tu(Object object) {
        super(object);
    }

    public void p(ES eS2, V4 v42, int n2, int n3) {
        qb.t(tu.U.u().kE, eS2.M(), v42.M(), n2, n3);
    }

    public float M() {
        return qb.R(tu.U.u().kE, this.H);
    }

    public void i(E8 e82, tx tx2, V4 v42, int n2, int n3) {
        block3: {
            block2: {
                try {
                    if (kX.C() != 13) break block2;
                    qb.w(tu.U.u().kE, this.H, e82.M(), tx2.M(), v42.M(), n2, n3);
                    break block3;
                }
                catch (O_ o_2) {
                    throw tu.a(o_2);
                }
            }
            qb.G(tu.U.u().kE, this.H, e82.M(), v42.M(), n2, n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = d8.a(2460742902630603156L, -451871636779020371L, MethodHandles.lookup().lookupClass()).a(229886197198020L);
        d = new HashMap(13);
        long l10 = a ^ 0x5E7E9093E60EL;
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
        String string = "\u00f3\u0092D\u00ea\u00fc5\u0003\u00ac\u0094\u00fc\u0019\u00b9\u00cc|\u008f\u00c0";
        int n3 = "\u00f3\u0092D\u00ea\u00fc5\u0003\u00ac\u0094\u00fc\u0019\u00b9\u00cc|\u008f\u00c0".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        b = lArray;
        c = new Integer[2];
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/tu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(tu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

