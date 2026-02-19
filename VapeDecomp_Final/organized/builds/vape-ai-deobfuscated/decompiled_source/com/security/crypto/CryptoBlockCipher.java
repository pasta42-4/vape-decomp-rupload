/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.i5;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
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

public class CryptoBlockCipher
extends CryptoSecurityManager1576 {
    public List<Integer> q;
    public List<ResourceLifecycleManager1859> p;
    private static final long m;
    private static final long d;
    public List<ResourceLifecycleManager1859> b;

    public CryptoBlockCipher(int n, ErrorDiagnosticTracker errorDiagnosticTracker, ResourceLifecycleManager1859[] resourceLifecycleManager1859Array, ResourceLifecycleManager1859[] resourceLifecycleManager1859Array2, int[] nArray, String string) {
        long l = d ^ 0x7A45FDAC45D4L;
        this((int)m, n, errorDiagnosticTracker, resourceLifecycleManager1859Array, resourceLifecycleManager1859Array2, nArray, string);
    }

    public void k(BytecodeInstrumentationEngine bytecodeInstrumentationEngine, boolean bl) {
        CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray = new CryptoKeyExchangeMapping[this.b.size()];
        CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray2 = new CryptoKeyExchangeMapping[this.p.size()];
        int[] nArray = new int[this.q.size()];
        int n = cryptoKeyExchangeMappingArray.length;
        try {
            for (int i = 0; i < n; ++i) {
                cryptoKeyExchangeMappingArray[i] = this.b.get(i).i();
                cryptoKeyExchangeMappingArray2[i] = this.p.get(i).i();
                nArray[i] = this.q.get(i);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoBlockCipher.a(customSystemException);
        }
        this.n(bytecodeInstrumentationEngine.h(this.v, this.X, cryptoKeyExchangeMappingArray, cryptoKeyExchangeMappingArray2, nArray, this.Z, bl));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = MultiContainerRegistry.a(-7020994597851007020L, -1124362879771850169L, null).a(86131418978894L);
        long l = d ^ 0x293092A8C721L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 5300896167993437668L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                m = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CryptoBlockCipher(int n, int n2, ErrorDiagnosticTracker errorDiagnosticTracker, ResourceLifecycleManager1859[] resourceLifecycleManager1859Array, ResourceLifecycleManager1859[] resourceLifecycleManager1859Array2, int[] nArray, String string) {
        super(n, n2, errorDiagnosticTracker, string);
        this.b = i5.Y(resourceLifecycleManager1859Array);
        this.p = i5.Y(resourceLifecycleManager1859Array2);
        this.q = i5.N(nArray);
    }
}

