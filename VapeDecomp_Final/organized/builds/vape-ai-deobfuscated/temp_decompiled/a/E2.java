/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._H;
import a.a4;
import a.d8;
import a.eF;
import a.eR;
import a.zg;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class e2
extends eF
implements zg {
    protected int E;
    private static final long serialVersionUID = 1L;
    protected int R;
    private static final long a = d8.a(-2289444971885968623L, 7298714979946338293L, MethodHandles.lookup().lookupClass()).a(257915689783724L);
    private static final long b;

    public e2(int n2, int n3, eR eR2) {
        super(null, new eF(eR2));
        this.E = n2;
        this.R = n3;
    }

    @Override
    public void z(a4 a42) throws _H {
        a42.s(this);
    }

    public eR m() {
        return this.u().Z();
    }

    public int A() {
        return this.E;
    }

    @Override
    public String v() {
        return "cast:" + this.E + ":" + this.R;
    }

    public e2(eF eF2, int n2, eR eR2) {
        long l10 = a ^ 0x1AEE52CA5D8DL;
        super(eF2, new eF(eR2));
        this.E = (int)b;
        this.R = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x4A5447D5FAEDL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -7283826077729922845L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    @Override
    public eF l() {
        return (eF)this.Z();
    }

    public int P() {
        return this.R;
    }
}

