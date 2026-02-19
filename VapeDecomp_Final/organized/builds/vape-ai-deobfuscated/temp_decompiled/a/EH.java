/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a._H;
import a.a4;
import a.d8;
import a.e5;
import a.eF;
import a.eR;
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
public class eh
extends eF
implements zg {
    protected int w;
    private static final long serialVersionUID = 1L;
    protected int y;
    protected int l;
    private static final long a = d8.a(7067008697491019228L, -2451128387691132700L, MethodHandles.lookup().lookupClass()).a(44495608716977L);
    private static final long b;
    protected String J;

    public String u() {
        return this.J;
    }

    public void L(e5 e52) {
        this.M(e52);
    }

    @Override
    public void z(a4 a42) throws _H {
        a42.Q(this);
    }

    @Override
    public String v() {
        return "decl";
    }

    public int y() {
        return this.y;
    }

    public eh H(e5 e52, int n2, eR eR2) {
        eh eh2 = new eh(this.l, this.w + n2);
        eh2.J = this.J;
        eh2.M(e52);
        eh.c(eh2, eR2);
        return eh2;
    }

    public void L(int n2) {
        this.w += n2;
    }

    public int S() {
        return this.l;
    }

    public void R(String string) {
        this.J = string;
    }

    private static void w(StringBuilder stringBuilder, eF eF2, char c10) {
        while (true) {
            block10: {
                eR eR2;
                block9: {
                    eR2 = eF2.l();
                    try {
                        if (!(eR2 instanceof e5)) break block9;
                        stringBuilder.append(((e5)eR2).e());
                        break block10;
                    }
                    catch (O_ o_2) {
                        throw eh.a(o_2);
                    }
                }
                try {
                    if (eR2 instanceof eF) {
                        eh.w(stringBuilder, (eF)eR2, c10);
                    }
                }
                catch (O_ o_3) {
                    throw eh.a(o_3);
                }
            }
            eF2 = eF2.n();
            try {
                if (eF2 == null) {
                    break;
                }
            }
            catch (O_ o_4) {
                throw eh.a(o_4);
            }
            stringBuilder.append(c10);
        }
    }

    public eh(int n2, String string, int n3, int n4, e5 e52) {
        super(null);
        this.l = n2;
        this.w = n3;
        this.y = n4;
        this.J = string;
        this.M(e52);
        eh.c(this, null);
    }

    public void T(int n2) {
        this.y = n2;
    }

    public static String s(eF eF2, char c10) {
        try {
            if (eF2 == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw eh.a(o_2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        eh.w(stringBuilder, eF2, c10);
        return stringBuilder.toString();
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public eR S() {
        eF eF2 = this.n();
        try {
            if (eF2 != null) {
                return eF2.l();
            }
        }
        catch (O_ o_2) {
            throw eh.a(o_2);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l10 = a ^ 0x7C5CF4919954L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 1000802250339444038L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    public eh(int n2, int n3) {
        super(null);
        this.l = n2;
        this.w = n3;
        this.y = -1;
        this.J = null;
    }

    public int N() {
        return this.w;
    }

    public eh(eF eF2, int n2) {
        long l10 = a ^ 0x328FB82D3AE2L;
        super(null);
        this.l = (int)b;
        this.w = n2;
        this.y = -1;
        this.J = eh.s(eF2, '/');
    }
}

