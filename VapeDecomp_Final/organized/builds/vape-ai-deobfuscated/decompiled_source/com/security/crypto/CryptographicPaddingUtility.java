/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.text.encoding.EncodingUtilityManager;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class CryptographicPaddingUtility {
    CryptographicPaddingUtility i;
    final String u;
    final CryptoKeyExchangeMapping F;
    private static final long b;
    final int W;
    final CryptoKeyExchangeMapping l;
    private static final long a;
    final CryptoKeyExchangeMapping t;

    static CryptographicPaddingUtility N(CryptographicPaddingUtility cryptographicPaddingUtility, CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2) {
        int n;
        int n2;
        block17: {
            block18: {
                int n3;
                int n4;
                block16: {
                    int n5;
                    long l = a ^ 0x28270529F8DBL;
                    try {
                        if (cryptographicPaddingUtility == null) {
                            return null;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicPaddingUtility.a(customSystemException);
                    }
                    cryptographicPaddingUtility.i = CryptographicPaddingUtility.N(cryptographicPaddingUtility.i, cryptoKeyExchangeMapping, cryptoKeyExchangeMapping2);
                    n4 = cryptographicPaddingUtility.F.n;
                    n2 = cryptographicPaddingUtility.t.n;
                    n3 = cryptoKeyExchangeMapping.n;
                    try {
                        n5 = cryptoKeyExchangeMapping2 == null ? (int)b : cryptoKeyExchangeMapping2.n;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicPaddingUtility.a(customSystemException);
                    }
                    n = n5;
                    try {
                        try {
                            if (n3 < n2 && n > n4) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptographicPaddingUtility.a(customSystemException);
                        }
                        return cryptographicPaddingUtility;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicPaddingUtility.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (n3 > n4) break block17;
                        if (n < n2) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptographicPaddingUtility.a(customSystemException);
                    }
                    return cryptographicPaddingUtility.i;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicPaddingUtility.a(customSystemException);
                }
            }
            return new CryptographicPaddingUtility(cryptographicPaddingUtility, cryptoKeyExchangeMapping2, cryptographicPaddingUtility.t);
        }
        try {
            if (n >= n2) {
                return new CryptographicPaddingUtility(cryptographicPaddingUtility, cryptographicPaddingUtility.F, cryptoKeyExchangeMapping);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicPaddingUtility.a(customSystemException);
        }
        cryptographicPaddingUtility.i = new CryptographicPaddingUtility(cryptographicPaddingUtility, cryptoKeyExchangeMapping2, cryptographicPaddingUtility.t);
        return new CryptographicPaddingUtility(cryptographicPaddingUtility, cryptographicPaddingUtility.F, cryptoKeyExchangeMapping);
    }

    static int S(CryptographicPaddingUtility cryptographicPaddingUtility) {
        return 2 + 8 * CryptographicPaddingUtility.p(cryptographicPaddingUtility);
    }

    CryptographicPaddingUtility(CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2, CryptoKeyExchangeMapping cryptoKeyExchangeMapping3, int n, String string) {
        this.F = cryptoKeyExchangeMapping;
        this.t = cryptoKeyExchangeMapping2;
        this.l = cryptoKeyExchangeMapping3;
        this.W = n;
        this.u = string;
    }

    static int p(CryptographicPaddingUtility cryptographicPaddingUtility) {
        int n = 0;
        CryptographicPaddingUtility cryptographicPaddingUtility2 = cryptographicPaddingUtility;
        while (cryptographicPaddingUtility2 != null) {
            ++n;
            cryptographicPaddingUtility2 = cryptographicPaddingUtility2.i;
        }
        return n;
    }

    static void P(CryptographicPaddingUtility cryptographicPaddingUtility, EncodingUtilityManager encodingUtilityManager) {
        encodingUtilityManager.f(CryptographicPaddingUtility.p(cryptographicPaddingUtility));
        CryptographicPaddingUtility cryptographicPaddingUtility2 = cryptographicPaddingUtility;
        while (cryptographicPaddingUtility2 != null) {
            encodingUtilityManager.f(cryptographicPaddingUtility2.F.n).f(cryptographicPaddingUtility2.t.n).f(cryptographicPaddingUtility2.l.n).f(cryptographicPaddingUtility2.W);
            cryptographicPaddingUtility2 = cryptographicPaddingUtility2.i;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(486679450608962777L, 380029314937619210L, null).a(175554759910339L);
        long l = a ^ 0x1D37F7A9CFACL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 2964095618514450273L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    CryptographicPaddingUtility(CryptographicPaddingUtility cryptographicPaddingUtility, CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2) {
        this(cryptoKeyExchangeMapping, cryptoKeyExchangeMapping2, cryptographicPaddingUtility.l, cryptographicPaddingUtility.W, cryptographicPaddingUtility.u);
        this.i = cryptographicPaddingUtility.i;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

