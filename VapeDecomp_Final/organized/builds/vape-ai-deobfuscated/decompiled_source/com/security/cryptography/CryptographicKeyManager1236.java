/*
 * Decompiled with CFR 0.152.
 */
package com.security.cryptography;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.resource.management.ResourceLifecycleManager1859;
import com.security.crypto.CryptoSecurityManager1576;
import com.security.exchange.CryptoKeyExchangeMapping;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptographicKeyManager1236 {
    public List<CryptoSecurityManager1576> k;
    private static final long b;
    public List<CryptoSecurityManager1576> W;
    public String E;
    public ResourceLifecycleManager1859 h;
    private static final long a;
    public ResourceLifecycleManager1859 M;
    public ResourceLifecycleManager1859 u;

    public CryptographicKeyManager1236(ResourceLifecycleManager1859 resourceLifecycleManager1859, ResourceLifecycleManager1859 resourceLifecycleManager18592, ResourceLifecycleManager1859 resourceLifecycleManager18593, String string) {
        this.M = resourceLifecycleManager1859;
        this.u = resourceLifecycleManager18592;
        this.h = resourceLifecycleManager18593;
        this.E = string;
    }

    public void D(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        CryptoSecurityManager1576 cryptoSecurityManager1576;
        int n;
        int n2;
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping;
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping2;
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping3;
        BytecodeInstrumentationEngine bytecodeInstrumentationEngine2;
        try {
            bytecodeInstrumentationEngine2 = bytecodeInstrumentationEngine;
            cryptoKeyExchangeMapping3 = this.M.i();
            cryptoKeyExchangeMapping2 = this.u.i();
            cryptoKeyExchangeMapping = this.h == null ? null : this.h.i();
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyManager1236.a(customSystemException);
        }
        bytecodeInstrumentationEngine2.O(cryptoKeyExchangeMapping3, cryptoKeyExchangeMapping2, cryptoKeyExchangeMapping, this.E);
        if (this.k != null) {
            n2 = this.k.size();
            for (n = 0; n < n2; ++n) {
                cryptoSecurityManager1576 = this.k.get(n);
                cryptoSecurityManager1576.n(bytecodeInstrumentationEngine.E(cryptoSecurityManager1576.v, cryptoSecurityManager1576.X, cryptoSecurityManager1576.Z, true));
            }
        }
        if (this.W != null) {
            n2 = this.W.size();
            for (n = 0; n < n2; ++n) {
                cryptoSecurityManager1576 = this.W.get(n);
                cryptoSecurityManager1576.n(bytecodeInstrumentationEngine.E(cryptoSecurityManager1576.v, cryptoSecurityManager1576.X, cryptoSecurityManager1576.Z, false));
            }
        }
    }

    public void X(int n) {
        int n2;
        int n3;
        long l = a ^ 0xF1FC020F94FL;
        int n4 = (int)b | n << 8;
        if (this.k != null) {
            n3 = this.k.size();
            try {
                for (n2 = 0; n2 < n3; ++n2) {
                    this.k.get((int)n2).v = n4;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicKeyManager1236.a(customSystemException);
            }
        }
        if (this.W != null) {
            n3 = this.W.size();
            try {
                for (n2 = 0; n2 < n3; ++n2) {
                    this.W.get((int)n2).v = n4;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicKeyManager1236.a(customSystemException);
            }
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-3920801368858274742L, -1854715308012367678L, null).a(57181681681094L);
        long l = a ^ 0x595F3DEFAA98L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -2188077059784077816L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

