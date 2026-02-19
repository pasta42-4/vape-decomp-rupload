/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.aX;
import com.collections.management.MultiContainerRegistry;
import com.crypto.utils.CipherEncryptionUtility;
import com.exception.system.CustomSystemException;
import com.metadata.analysis.MetadataExtractor;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.text.encoding.EncodingUtilityManager;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoContextManager1052 {
    private static final long b = MultiContainerRegistry.a(-4800376461648211450L, 3452177341739109835L, null).a(35846198659909L);
    CryptoContextManager1052 a;
    public final String H;
    private byte[] O;
    private static final Map e = new HashMap(13);
    private static final long[] c;
    private static final Integer[] d;

    static void F(aX aX2, int n, int n2, EncodingUtilityManager encodingUtilityManager) {
        long l;
        block10: {
            l = b ^ 0x109F7FD222D0L;
            try {
                try {
                    if ((n & 0x1000) == 0 || aX2.q() >= 49) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextManager1052.a(customSystemException);
                }
                encodingUtilityManager.f(aX2.j("Synthetic")).y(0);
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextManager1052.a(customSystemException);
            }
        }
        try {
            if (n2 != 0) {
                encodingUtilityManager.f(aX2.j("Signature")).y(2).f(n2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextManager1052.a(customSystemException);
        }
        try {
            if ((n & CryptoContextManager1052.a(22153, 0x1447321F57AD50C1L ^ l)) != 0) {
                encodingUtilityManager.f(aX2.j("Deprecated")).y(0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextManager1052.a(customSystemException);
        }
    }

    final int X(aX aX2) {
        byte[] byArray = null;
        boolean bl = false;
        int n = -1;
        int n2 = -1;
        return this.B(aX2, byArray, 0, -1, -1);
    }

    protected EncodingUtilityManager l(MetadataExtractor metadataExtractor, byte[] byArray, int n, int n2, int n3) {
        return new EncodingUtilityManager(this.O);
    }

    static int z(aX aX2, int n, int n2) {
        int n3;
        long l;
        block10: {
            l = b ^ 0x678FDDC9A7ADL;
            n3 = 0;
            try {
                try {
                    if ((n & 0x1000) == 0 || aX2.q() >= 49) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoContextManager1052.a(customSystemException);
                }
                aX2.j("Synthetic");
                n3 += 6;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoContextManager1052.a(customSystemException);
            }
        }
        try {
            if (n2 != 0) {
                aX2.j("Signature");
                n3 += 8;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextManager1052.a(customSystemException);
        }
        try {
            if ((n & CryptoContextManager1052.a(16933, 0x6A1FD38BF4764111L ^ l)) != 0) {
                aX2.j("Deprecated");
                n3 += 6;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoContextManager1052.a(customSystemException);
        }
        return n3;
    }

    final void G(aX aX2, byte[] byArray, int n, int n2, int n3, EncodingUtilityManager encodingUtilityManager) {
        MetadataExtractor metadataExtractor = aX2.M;
        CryptoContextManager1052 cryptoContextManager1052 = this;
        while (cryptoContextManager1052 != null) {
            EncodingUtilityManager encodingUtilityManager2 = cryptoContextManager1052.l(metadataExtractor, byArray, n, n2, n3);
            encodingUtilityManager.f(aX2.j(cryptoContextManager1052.H)).y(encodingUtilityManager2.I);
            encodingUtilityManager.T(encodingUtilityManager2.U, 0, encodingUtilityManager2.I);
            cryptoContextManager1052 = cryptoContextManager1052.a;
        }
    }

    final void y(aX aX2, EncodingUtilityManager encodingUtilityManager) {
        byte[] byArray = null;
        boolean bl = false;
        int n = -1;
        int n2 = -1;
        this.G(aX2, byArray, 0, -1, -1, encodingUtilityManager);
    }

    public boolean k() {
        return false;
    }

    final int f() {
        int n = 0;
        CryptoContextManager1052 cryptoContextManager1052 = this;
        while (cryptoContextManager1052 != null) {
            ++n;
            cryptoContextManager1052 = cryptoContextManager1052.a;
        }
        return n;
    }

    final int B(aX aX2, byte[] byArray, int n, int n2, int n3) {
        MetadataExtractor metadataExtractor = aX2.M;
        int n4 = 0;
        CryptoContextManager1052 cryptoContextManager1052 = this;
        while (cryptoContextManager1052 != null) {
            aX2.j(cryptoContextManager1052.H);
            n4 += 6 + cryptoContextManager1052.l((MetadataExtractor)metadataExtractor, (byte[])byArray, (int)n, (int)n2, (int)n3).I;
            cryptoContextManager1052 = cryptoContextManager1052.a;
        }
        return n4;
    }

    protected CryptoContextManager1052(String string) {
        this.H = string;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x743F;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/W7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoContextManager1052.d[n2] = n3;
        }
        return d[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x5E593153B6AFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u0087r\u00f4\u0093\u0081\u00e1`_\u0016u\u00ab\u007f\u00cd\u0086\u0005a";
        int n2 = "\u0087r\u00f4\u0093\u0081\u00e1`_\u0016u\u00ab\u007f\u00cd\u0086\u0005a".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
    }

    protected CryptoContextManager1052 E(CipherEncryptionUtility cipherEncryptionUtility, int n, int n2, char[] cArray, int n3, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        CryptoContextManager1052 cryptoContextManager1052 = new CryptoContextManager1052(this.H);
        cryptoContextManager1052.O = new byte[n2];
        System.arraycopy(cipherEncryptionUtility.I, n, cryptoContextManager1052.O, 0, n2);
        return cryptoContextManager1052;
    }
}

