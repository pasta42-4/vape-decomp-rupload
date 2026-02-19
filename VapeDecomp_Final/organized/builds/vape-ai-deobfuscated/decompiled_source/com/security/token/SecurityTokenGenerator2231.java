/*
 * Decompiled with CFR 0.152.
 */
package com.security.token;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.crypto.CryptographicKeyManager426;
import com.security.cryptography.EncryptionKeyGenerator;
import com.ui.rendering.GraphicalRenderingController;

class SecurityTokenGenerator2231
implements OperationExecutionInterface {
    final CryptographicKeyManager426 C;

    SecurityTokenGenerator2231(CryptographicKeyManager426 cryptographicKeyManager426) {
        this.C = cryptographicKeyManager426;
    }

    @Override
    public void R() {
        GraphicalRenderingController.a(EncryptionKeyGenerator.class, false);
        this.C.r(false, false);
    }
}

