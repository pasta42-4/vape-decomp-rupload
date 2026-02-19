/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.AF;
import a.AQ;
import a.Hz;
import a.OV;
import a.O_;
import a.Oq;
import a.Qg;
import a.SE;
import a.a;
import a.d8;
import a.jU;
import a.xY;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class xr
extends xY {
    private final AF w;
    private static final long b = d8.a(660832849354218739L, 9055673505001049945L, MethodHandles.lookup().lookupClass()).a(94674812534400L);
    private static final long e;

    @Override
    public boolean H() {
        return false;
    }

    public xr(AF aF2) {
        long l10 = b ^ 0x20E73A4D7752L;
        super(a.cs((int)e), 0, Oq.p);
        this.w = aF2;
        OV oV2 = new OV(Hz.LEFT, aF2.An, aF2.A, aF2.AW, aF2.AY, null, new jU((Object)null, "", false));
        this.u(oV2);
        this.T(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = b ^ 0x37EF8BCAEC24L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 8145642272025954639L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                e = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    @Override
    public boolean L() {
        boolean bl2;
        try {
            if (!this.w.Z()) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw xr.a(o_2);
        }
        try {
            bl2 = !this.w.W();
        }
        catch (O_ o_3) {
            throw xr.a(o_3);
        }
        return bl2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public boolean n(OV oV2, Qg qg2) {
        boolean bl2;
        block5: {
            block4: {
                AQ aQ2 = SE.h.U().K(AQ.class);
                try {
                    try {
                        if (aQ2 == null || !aQ2.L()) break block4;
                    }
                    catch (O_ o_2) {
                        throw xr.a(o_2);
                    }
                    bl2 = true;
                    break block5;
                }
                catch (O_ o_3) {
                    throw xr.a(o_3);
                }
            }
            bl2 = false;
        }
        return bl2;
    }
}

