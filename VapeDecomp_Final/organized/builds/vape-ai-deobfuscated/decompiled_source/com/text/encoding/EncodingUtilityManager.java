/*
 * Decompiled with CFR 0.152.
 */
package com.text.encoding;

import com.collections.management.MultiContainerRegistry;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class EncodingUtilityManager {
    private static final long[] b;
    byte[] U;
    int I;
    private static final long a;
    private static final Map d;
    private static final Integer[] c;

    public EncodingUtilityManager T(long l) {
        int n = this.I;
        try {
            if (n + 8 > this.U.length) {
                this.e(8);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        byte[] byArray = this.U;
        int n2 = (int)(l >>> 32);
        byArray[n++] = (byte)(n2 >>> 24);
        byArray[n++] = (byte)(n2 >>> 16);
        byArray[n++] = (byte)(n2 >>> 8);
        byArray[n++] = (byte)n2;
        n2 = (int)l;
        byArray[n++] = (byte)(n2 >>> 24);
        byArray[n++] = (byte)(n2 >>> 16);
        byArray[n++] = (byte)(n2 >>> 8);
        byArray[n++] = (byte)n2;
        this.I = n;
        return this;
    }

    public EncodingUtilityManager(int n) {
        this.U = new byte[n];
    }

    final EncodingUtilityManager T(int n, int n2) {
        int n3 = this.I;
        try {
            if (n3 + 2 > this.U.length) {
                this.e(2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        byte[] byArray = this.U;
        byArray[n3++] = (byte)n;
        byArray[n3++] = (byte)n2;
        this.I = n3;
        return this;
    }

    public EncodingUtilityManager i(String string) {
        long l = a ^ 0x1B81BA8B93D8L;
        int n = string.length();
        try {
            if (n > EncodingUtilityManager.a(24355, 0x53331758D81D22B4L ^ l)) {
                throw new IllegalArgumentException("UTF8 string too large");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        int n2 = this.I;
        try {
            if (n2 + 2 + n > this.U.length) {
                this.e(2 + n);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        byte[] byArray = this.U;
        byArray[n2++] = (byte)(n >>> 8);
        byArray[n2++] = (byte)n;
        for (int i = 0; i < n; ++i) {
            block11: {
                char c = string.charAt(i);
                try {
                    try {
                        if (c < '\u0001' || c > '\u007f') break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw EncodingUtilityManager.a(illegalArgumentException);
                    }
                    byArray[n2++] = (byte)c;
                    continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw EncodingUtilityManager.a(illegalArgumentException);
                }
            }
            this.I = n2;
            return this.h(string, i, EncodingUtilityManager.a(9216, 0x495427A754A5D996L ^ l));
        }
        this.I = n2;
        return this;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    final EncodingUtilityManager h(String string, int n, int n2) {
        int n3;
        int n4;
        int n5 = string.length();
        int n6 = n;
        for (n4 = n; n4 < n5; ++n4) {
            block25: {
                n3 = string.charAt(n4);
                try {
                    try {
                        if (n3 < 1 || n3 > 127) break block25;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw EncodingUtilityManager.a(illegalArgumentException);
                    }
                    ++n6;
                    continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw EncodingUtilityManager.a(illegalArgumentException);
                }
            }
            try {
                if (n3 <= 2047) {
                    n6 += 2;
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw EncodingUtilityManager.a(illegalArgumentException);
            }
            n6 += 3;
        }
        try {
            if (n6 > n2) {
                throw new IllegalArgumentException("UTF8 string too large");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        n4 = this.I - n - 2;
        try {
            if (n4 >= 0) {
                this.U[n4] = (byte)(n6 >>> 8);
                this.U[n4 + 1] = (byte)n6;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        try {
            if (this.I + n6 - n > this.U.length) {
                this.e(n6 - n);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        n3 = this.I;
        for (int i = n; i < n5; ++i) {
            char c;
            block26: {
                c = string.charAt(i);
                try {
                    try {
                        if (c < '\u0001' || c > '\u007f') break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw EncodingUtilityManager.a(illegalArgumentException);
                    }
                    this.U[n3++] = (byte)c;
                    continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw EncodingUtilityManager.a(illegalArgumentException);
                }
            }
            try {
                if (c <= '\u07ff') {
                    this.U[n3++] = (byte)(0xC0 | c >> 6 & 0x1F);
                    this.U[n3++] = (byte)(0x80 | c & 0x3F);
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw EncodingUtilityManager.a(illegalArgumentException);
            }
            this.U[n3++] = (byte)(0xE0 | c >> 12 & 0xF);
            this.U[n3++] = (byte)(0x80 | c >> 6 & 0x3F);
            this.U[n3++] = (byte)(0x80 | c & 0x3F);
        }
        this.I = n3;
        return this;
    }

    public EncodingUtilityManager y(int n) {
        int n2 = this.I;
        try {
            if (n2 + 4 > this.U.length) {
                this.e(4);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        byte[] byArray = this.U;
        byArray[n2++] = (byte)(n >>> 24);
        byArray[n2++] = (byte)(n >>> 16);
        byArray[n2++] = (byte)(n >>> 8);
        byArray[n2++] = (byte)n;
        this.I = n2;
        return this;
    }

    public EncodingUtilityManager T(byte[] byArray, int n, int n2) {
        try {
            if (this.I + n2 > this.U.length) {
                this.e(n2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        try {
            if (byArray != null) {
                System.arraycopy(byArray, n, this.U, this.I, n2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        this.I += n2;
        return this;
    }

    public EncodingUtilityManager Z(int n) {
        int n2 = this.I;
        try {
            if (n2 + 1 > this.U.length) {
                this.e(1);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        this.U[n2++] = (byte)n;
        this.I = n2;
        return this;
    }

    private void e(int n) {
        int n2;
        try {
            if (this.I > this.U.length) {
                throw new AssertionError((Object)"Internal error");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        int n3 = 2 * this.U.length;
        int n4 = this.I + n;
        try {
            n2 = n3 > n4 ? n3 : n4;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        byte[] byArray = new byte[n2];
        System.arraycopy(this.U, 0, byArray, 0, this.I);
        this.U = byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-48845341310467086L, -3555399473211419587L, null).a(215055440696450L);
        d = new HashMap(13);
        long l = a ^ 0x4DB8060CAFF6L;
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
        String string = "3\u00fb\u00ad\u0083\u008c2s\u00b2\u00bfo\u0011\u00efBE\u0019\u0092";
        int n2 = "3\u00fb\u00ad\u0083\u008c2s\u00b2\u00bfo\u0011\u00efBE\u0019\u0092".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    final EncodingUtilityManager K(int n, int n2, int n3) {
        int n4 = this.I;
        try {
            if (n4 + 5 > this.U.length) {
                this.e(5);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        byte[] byArray = this.U;
        byArray[n4++] = (byte)n;
        byArray[n4++] = (byte)(n2 >>> 8);
        byArray[n4++] = (byte)n2;
        byArray[n4++] = (byte)(n3 >>> 8);
        byArray[n4++] = (byte)n3;
        this.I = n4;
        return this;
    }

    public EncodingUtilityManager() {
        this.U = new byte[64];
    }

    public EncodingUtilityManager f(int n) {
        int n2 = this.I;
        try {
            if (n2 + 2 > this.U.length) {
                this.e(2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        byte[] byArray = this.U;
        byArray[n2++] = (byte)(n >>> 8);
        byArray[n2++] = (byte)n;
        this.I = n2;
        return this;
    }

    final EncodingUtilityManager f(int n, int n2, int n3) {
        int n4 = this.I;
        try {
            if (n4 + 4 > this.U.length) {
                this.e(4);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        byte[] byArray = this.U;
        byArray[n4++] = (byte)n;
        byArray[n4++] = (byte)n2;
        byArray[n4++] = (byte)(n3 >>> 8);
        byArray[n4++] = (byte)n3;
        this.I = n4;
        return this;
    }

    EncodingUtilityManager(byte[] byArray) {
        this.U = byArray;
        this.I = byArray.length;
    }

    final EncodingUtilityManager I(int n, int n2) {
        int n3 = this.I;
        try {
            if (n3 + 3 > this.U.length) {
                this.e(3);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw EncodingUtilityManager.a(illegalArgumentException);
        }
        byte[] byArray = this.U;
        byArray[n3++] = (byte)n;
        byArray[n3++] = (byte)(n2 >>> 8);
        byArray[n3++] = (byte)n2;
        this.I = n3;
        return this;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5EC4;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/O0", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EncodingUtilityManager.c[n2] = n3;
        }
        return c[n2];
    }
}

