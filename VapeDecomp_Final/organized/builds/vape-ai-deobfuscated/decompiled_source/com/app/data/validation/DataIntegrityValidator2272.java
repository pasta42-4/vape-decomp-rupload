/*
 * Decompiled with CFR 0.152.
 */
package com.app.data.validation;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.session.CipherSessionManager;

class DataIntegrityValidator2272
implements OperationExecutionInterface {
    final CipherSessionManager h;

    DataIntegrityValidator2272(CipherSessionManager cipherSessionManager) {
        this.h = cipherSessionManager;
    }

    @Override
    public void R() {
        this.h.x();
        this.h.D();
        this.h.A();
    }
}

