/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.collections.management.MultiContainerRegistry;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationManager2254;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

abstract class CipherEncryptionWrapper
extends ConfigurationManager2254 {
    int x;
    private static final long b;
    int M;
    private static final long a;

    void w(int n, int n2, boolean bl) {
        block6: {
            try {
                block7: {
                    try {
                        try {
                            this.x = CipherEncryptionWrapper.g(this.p, this.x, n, n2, bl);
                            super.w(n, n2, bl);
                            if (this.M != 0) break block6;
                            if (this.x < Short.MIN_VALUE) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CipherEncryptionWrapper.c(customSystemException);
                        }
                        if (Short.MAX_VALUE >= this.x) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CipherEncryptionWrapper.c(customSystemException);
                    }
                }
                this.M = 1;
            }
            catch (CustomSystemException customSystemException) {
                throw CipherEncryptionWrapper.c(customSystemException);
            }
        }
    }

    abstract int W();

    boolean t() {
        long l = a ^ 0x11B8DD52FC1CL;
        try {
            if (this.M == 1) {
                this.M = (int)b;
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CipherEncryptionWrapper.c(customSystemException);
        }
        return false;
    }

    CipherEncryptionWrapper(int n, int n2) {
        super(n);
        this.x = n2;
        this.M = 0;
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    abstract void m(int var1, byte[] var2, int var3, byte[] var4);

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(5814259463312053564L, 1895811286446228875L, MethodHandles.lookup().lookupClass()).a(281398927268599L);
        long l = a ^ 0x213E5CD5F74EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -1904216316455792842L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    int g(int n, byte[] byArray, int n2, byte[] byArray2) {
        block3: {
            block2: {
                try {
                    if (this.M != 2) break block2;
                    this.m(n, byArray, n2, byArray2);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw CipherEncryptionWrapper.c(customSystemException);
                }
            }
            byArray2[n2] = byArray[n];
            ConfigurationManager2137.e(this.x, byArray2, n2 + 1);
        }
        return 3;
    }
}

