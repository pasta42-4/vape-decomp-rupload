/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.GA;
import a.Gn;
import a.O_;
import a.SE;
import a.SL;
import a.YK;
import a.a;
import a.d8;
import a.fR;
import a.fh;
import a.n;
import a.y7;
import a.yE;
import a.yH;
import a.yI;
import a.yO;
import a.yW;
import a.yg;
import a.yh;
import a.yu;
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

public class fg
extends fh {
    private boolean kc;
    private static final long eb = d8.a(-8909306785834330525L, -3810003688301180473L, MethodHandles.lookup().lookupClass()).a(156020693864517L);
    private static fR kd;
    private static final Map tb;
    private final yH kH;
    private final y7 km;
    private static final Integer[] sb;
    private final yW kJ;
    public static fg kW;
    private yh k9;
    private final yO kq;
    private static final long[] rb;
    private Gn k5;
    private final yI kx;
    private final yu kR;
    private boolean k8;

    public void l(GA gA, Gn gn) {
        try {
            if (gn == Gn.OFFLINE) {
                this.i(gn);
            }
        }
        catch (O_ o_2) {
            throw fg.a(o_2);
        }
    }

    public void J() {
        try {
            this.k8 = false;
            if (this.G() != null) {
                this.Y();
            }
        }
        catch (O_ o_2) {
            throw fg.a(o_2);
        }
        Ao.K.S().d(kd);
        Ao.K.S().d(this);
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = fg.e(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void D(boolean bl2) {
        this.kc = bl2;
        this.k8 = true;
        Ao.K.S().B(kd);
        Ao.K.S().B(this);
        Ao.K.S().x(kd);
        Ao.K.S().x(this);
    }

    private static int e(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2D36;
        if (sb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = rb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])tb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    tb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fg", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fg.sb[n3] = n4;
        }
        return sb[n3];
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public void i(Gn gn) {
        yg yg2;
        block16: {
            block17: {
                block13: {
                    block14: {
                        block15: {
                            yg2 = null;
                            if (gn == Gn.ONLINE) {
                                yg2 = this.kH;
                                try {
                                    if (this.kc) {
                                        this.J();
                                    }
                                }
                                catch (O_ o_2) {
                                    throw fg.a(o_2);
                                }
                            }
                            try {
                                try {
                                    if (gn != Gn.OFFLINE) break block13;
                                    if (YK.C.V() != -1L) break block14;
                                }
                                catch (O_ o_3) {
                                    throw fg.a(o_3);
                                }
                                if (YK.C.P() != GA.REGISTERED) break block15;
                            }
                            catch (O_ o_4) {
                                throw fg.a(o_4);
                            }
                            yg2 = this.kJ;
                            break block13;
                        }
                        yg2 = YK.C.P() == GA.UNREGISTERED ? this.km : this.kq;
                        break block13;
                    }
                    yg2 = this.kx;
                }
                try {
                    if (gn != Gn.CONNECTING) break block16;
                    if (YK.C.V() != -1L) break block17;
                }
                catch (O_ o_5) {
                    throw fg.a(o_5);
                }
                yg2 = this.kR;
                break block16;
            }
            yg2 = this.kx;
        }
        try {
            if (yg2 != null) {
                yg2.O();
                this.k9.k();
                this.k9.n(yg2, new Object[0]);
            }
        }
        catch (O_ o_6) {
            throw fg.a(o_6);
        }
    }

    @Override
    public void G() {
        try {
            super.G();
            Ao.K.S().x(kd);
            Ao.K.S().x(this);
            if (this.G() != null) {
                Ao.K.S().G(this, this.G());
            }
        }
        catch (O_ o_2) {
            throw fg.a(o_2);
        }
        this.h(true);
        this.N().z();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        tb = new HashMap(13);
        long l10 = eb ^ 0x3E9D7D520F4L;
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
        String string = "[\u0092(\u00b6P\u00ac\u00f3|\u00b5\u001a\u00d74\u00c7\u00ca\u0019\u00a8";
        int n3 = "[\u0092(\u00b6P\u00ac\u00f3|\u00b5\u001a\u00d74\u00c7\u00ca\u0019\u00a8".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        rb = lArray;
        sb = new Integer[2];
        kW = new fg();
        kd = new fR();
    }

    public fg() {
        long l10 = eb ^ 0x2C607716D421L;
        super(a.cs((int)fg.e("p", (int)22836, (long)(0x24E6CCBB4EF3C640L ^ l10))), a.cs((int)fg.e("p", (int)4257, (long)(0x9EEC3084A8C8FD4L ^ l10))), false, false);
        this.k8 = false;
        this.kc = false;
        this.k9 = new yh(104.0);
        this.kH = new yH();
        this.kJ = new yW();
        this.kR = new yu();
        this.kx = new yI();
        this.km = new y7();
        this.kq = new yO();
        this.k5 = null;
        try {
            this.T(104.0);
            this.w(160.0);
            this.k9.i(false);
            n n2 = this.d();
            n2.o(false);
            n2.m(false);
            n2.y(false);
            n2.i(false);
            n2.v(false);
            this.L(true);
            this.N().U(true);
            this.N().x(104.0);
            this.N().n(0.75f);
            this.N().M().N(this::J);
            this.V(new yE(YK.C.q().f()), new yE(YK.C.q().v()), new yE(YK.C.q().T()), new yE(YK.C.q().B()));
            this.N().J(true);
            this.N().T(104.0);
            this.P(new SL(this));
            this.n(this.k9, new Object[0]);
            this.i(Gn.OFFLINE);
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    @Override
    protected void u(double d2, double d3) {
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fg.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

