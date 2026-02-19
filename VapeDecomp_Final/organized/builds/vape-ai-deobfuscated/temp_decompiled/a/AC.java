/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.ay;
import a.d8;
import a.rh;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ac
extends ay {
    public int v;
    private static final long l;
    private static final long e;
    public rh X;

    public ac(int n2, rh rh2, String string) {
        long l10 = e ^ 0x750FD4A309F0L;
        this((int)l, n2, rh2, string);
        if (this.getClass() != ac.class) {
            throw new IllegalStateException();
        }
    }

    public ac(int n2, int n3, rh rh2, String string) {
        super(n2, string);
        this.v = n3;
        this.X = rh2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = d8.a(-7290955972862710689L, -5572794952359667751L, null).a(256683490290005L);
        long l10 = e ^ 0x6B4FEB40FCB2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 6759257502140765297L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }
}

