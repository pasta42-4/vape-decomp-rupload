/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.AM;
import a.EB;
import a.EP;
import a.KB;
import a.Kq;
import a.OY;
import a.O_;
import a.Qg;
import a.Qt;
import a.XO;
import a.d8;
import a.eM;
import a.on;
import a.x4;
import a.xi;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xt
extends x4<AM> {
    private static final long e;
    private int B = -1;
    private boolean V = false;
    private static final long d;

    public xt(xi xi2, String string) {
        super(xi2, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = d8.a(4569242278414142327L, 7284119425941149575L, MethodHandles.lookup().lookupClass()).a(268287881534066L);
        long l10 = d ^ 0x36ED6A141C1CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -1438182566714708943L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                e = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    @OY
    public void p(Kq kq2) {
        try {
            if (this.G()) {
                kq2.setCanceled(true);
            }
        }
        catch (O_ o_2) {
            throw xt.a(o_2);
        }
    }

    public boolean G() {
        return this.V;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @OY
    public void e(KB kB2) {
        block20: {
            block21: {
                Qt qt2;
                block19: {
                    Qt qt3;
                    block18: {
                        block17: {
                            long l10 = d ^ 0x217BAE42E7C6L;
                            try {
                                if (this.B > 0) {
                                    --this.B;
                                    this.V = false;
                                    return;
                                }
                            }
                            catch (O_ o_2) {
                                throw xt.a(o_2);
                            }
                            on on2 = XO.b.B();
                            try {
                                try {
                                    if (!on2.r() || !on2.l().B(eM.Ut)) break block17;
                                }
                                catch (O_ o_3) {
                                    throw xt.a(o_3);
                                }
                                qt3 = new Qt(on2.l());
                                break block18;
                            }
                            catch (O_ o_4) {
                                throw xt.a(o_4);
                            }
                        }
                        qt3 = new Qt(null);
                    }
                    qt2 = qt3;
                    EB eB2 = EP.X();
                    try {
                        try {
                            if (!qt2.Y() || !eB2.Y()) break block19;
                        }
                        catch (O_ o_5) {
                            throw xt.a(o_5);
                        }
                        this.V = false;
                        return;
                    }
                    catch (O_ o_6) {
                        throw xt.a(o_6);
                    }
                }
                Qg qg2 = EP.U();
                try {
                    if (!qt2.r() || !qg2.j()) break block20;
                }
                catch (O_ o_7) {
                    throw xt.a(o_7);
                }
                int n2 = qt2.y();
                try {
                    try {
                        if (n2 <= 12) break block20;
                        if (((AM)this.n()).i()) break block21;
                    }
                    catch (O_ o_8) {
                        throw xt.a(o_8);
                    }
                    this.B = (int)e;
                }
                catch (O_ o_9) {
                    throw xt.a(o_9);
                }
            }
            this.V = true;
            return;
        }
        this.V = false;
    }
}

