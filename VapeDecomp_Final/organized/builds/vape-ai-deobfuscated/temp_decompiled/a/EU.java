/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a._H;
import a.a4;
import a.d8;
import a.eF;
import a.eR;
import a.ee;
import a.zg;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eu
extends eF
implements zg {
    protected boolean J;
    private static final long serialVersionUID = 1L;
    private static final long a = d8.a(5750303154577918765L, 8748934515013093335L, MethodHandles.lookup().lookupClass()).a(76605354445595L);
    private static final long b;
    protected int O;

    public eu(int n2, eF eF2, ee ee2) {
        super(null, new eF(eF2));
        this.J = true;
        this.O = n2;
        if (ee2 != null) {
            eu.c(this, ee2);
        }
    }

    public boolean b() {
        return this.J;
    }

    public eu(eF eF2, eF eF3) {
        long l10 = a ^ 0x7D40D747BFBAL;
        super(eF2, new eF(eF3));
        this.J = false;
        this.O = (int)b;
    }

    public eF b() {
        return (eF)this.Z();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public ee Z() {
        eR eR2 = this.u().u();
        try {
            if (eR2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eu.a(o_2);
        }
        return (ee)eR2.Z();
    }

    @Override
    public void z(a4 a42) throws _H {
        a42.K(this);
    }

    @Override
    protected String v() {
        String string;
        try {
            string = this.J ? "new[]" : "new";
        }
        catch (O_ o_2) {
            throw eu.a(o_2);
        }
        return string;
    }

    public int q() {
        return this.O;
    }

    public eF N() {
        return (eF)this.u().Z();
    }

    public eF F() {
        return this.N();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x58A28272541BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -2256447537601442740L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public static eu l(eF eF2, eF eF3, ee ee2) {
        eu eu2 = new eu(eF2, eF3);
        try {
            eu2.J = true;
            if (ee2 != null) {
                eu.c(eu2, ee2);
            }
        }
        catch (O_ o_2) {
            throw eu.a(o_2);
        }
        return eu2;
    }
}

