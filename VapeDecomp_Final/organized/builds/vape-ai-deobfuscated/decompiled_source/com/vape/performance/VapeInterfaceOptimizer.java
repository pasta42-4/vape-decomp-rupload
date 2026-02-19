/*
 * Decompiled with CFR 0.152.
 */
package com.vape.performance;

import com.app.core.interfaces.OperationExecutionInterface;
import com.core.computation.AbstractComputationKernel;
import com.security.crypto.CryptographicKeyManager426;
import com.security.cryptography.EncryptionKeyGenerator;

class VapeInterfaceOptimizer
implements OperationExecutionInterface {
    final EncryptionKeyGenerator V;
    final String m;

    VapeInterfaceOptimizer(EncryptionKeyGenerator encryptionKeyGenerator, String string) {
        this.V = encryptionKeyGenerator;
        this.m = string;
    }

    @Override
    public void R() {
        CryptographicKeyManager426 cryptographicKeyManager426 = EncryptionKeyGenerator.P(this.V, this.m);
        cryptographicKeyManager426.o((AbstractComputationKernel[])EncryptionKeyGenerator.j(this.V).get(this.m));
    }
}

