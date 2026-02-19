/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Hb;
import a.NV;
import a.O_;
import a.ac;
import a.d8;
import a.i5;
import a.lc;
import a.rh;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a3
extends ac {
    public List<Integer> q;
    public List<Hb> p;
    private static final long m;
    private static final long d;
    public List<Hb> b;

    public a3(int n2, rh rh2, Hb[] hbArray, Hb[] hbArray2, int[] nArray, String string) {
        long l10 = d ^ 0x7A45FDAC45D4L;
        this((int)m, n2, rh2, hbArray, hbArray2, nArray, string);
    }

    public void k(NV nV, boolean bl2) {
        lc[] lcArray = new lc[this.b.size()];
        lc[] lcArray2 = new lc[this.p.size()];
        int[] nArray = new int[this.q.size()];
        int n2 = lcArray.length;
        try {
            for (int i10 = 0; i10 < n2; ++i10) {
                lcArray[i10] = this.b.get(i10).i();
                lcArray2[i10] = this.p.get(i10).i();
                nArray[i10] = this.q.get(i10);
            }
        }
        catch (O_ o_2) {
            throw a3.a(o_2);
        }
        this.n(nV.h(this.v, this.X, lcArray, lcArray2, nArray, this.Z, bl2));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = d8.a(-7020994597851007020L, -1124362879771850169L, null).a(86131418978894L);
        long l10 = d ^ 0x293092A8C721L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 5300896167993437668L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                m = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public a3(int n2, int n3, rh rh2, Hb[] hbArray, Hb[] hbArray2, int[] nArray, String string) {
        super(n2, n3, rh2, string);
        this.b = i5.Y(hbArray);
        this.p = i5.Y(hbArray2);
        this.q = i5.N(nArray);
    }
}

