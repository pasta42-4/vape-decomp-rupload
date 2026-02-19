/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.ay;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoSecurityManager1576
extends ay {
    public int v;
    private static final long l;
    private static final long e;
    public ErrorDiagnosticTracker X;

    public CryptoSecurityManager1576(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string) {
        long l = e ^ 0x750FD4A309F0L;
        this((int)CryptoSecurityManager1576.l, n, errorDiagnosticTracker, string);
        if (this.getClass() != CryptoSecurityManager1576.class) {
            throw new IllegalStateException();
        }
    }

    public CryptoSecurityManager1576(int n, int n2, ErrorDiagnosticTracker errorDiagnosticTracker, String string) {
        super(n, string);
        this.v = n2;
        this.X = errorDiagnosticTracker;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = MultiContainerRegistry.a(-7290955972862710689L, -5572794952359667751L, null).a(256683490290005L);
        long l = e ^ 0x6B4FEB40FCB2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 6759257502140765297L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                CryptoSecurityManager1576.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

