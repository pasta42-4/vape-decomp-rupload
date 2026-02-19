/*
 * Decompiled with CFR 0.152.
 */
package com.app.event.dispatch;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.cryptography.EncryptionKeyGenerator;

class EventDispatchCoordinator2329
implements OperationExecutionInterface {
    final EncryptionKeyGenerator t;

    EventDispatchCoordinator2329(EncryptionKeyGenerator encryptionKeyGenerator) {
        this.t = encryptionKeyGenerator;
    }

    @Override
    public void R() {
        EncryptionKeyGenerator.d(this.t);
    }
}

