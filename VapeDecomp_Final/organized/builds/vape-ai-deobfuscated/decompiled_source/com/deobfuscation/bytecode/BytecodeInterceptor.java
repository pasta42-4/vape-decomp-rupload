/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.bytecode;

import a.cA;
import com.app.core.interfaces.OperationExecutionInterface;
import com.security.cipher.SecureStreamCipher;
import com.security.decryption.CryptographicKeyDecoder;

class BytecodeInterceptor
implements OperationExecutionInterface {
    final SecureStreamCipher N;
    final CryptographicKeyDecoder l;

    @Override
    public void R() {
        ((cA)SecureStreamCipher.V(this.N)).U(this.l);
        SecureStreamCipher.V(this.N).M();
        this.N.X();
    }

    BytecodeInterceptor(SecureStreamCipher secureStreamCipher, CryptographicKeyDecoder cryptographicKeyDecoder) {
        this.N = secureStreamCipher;
        this.l = cryptographicKeyDecoder;
    }
}

