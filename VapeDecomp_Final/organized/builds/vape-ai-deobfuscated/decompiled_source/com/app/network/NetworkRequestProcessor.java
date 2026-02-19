/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.cryptography.SecurityCipherManager;

class NetworkRequestProcessor
implements OperationExecutionInterface {
    final SecurityCipherManager j;

    NetworkRequestProcessor(SecurityCipherManager securityCipherManager) {
        this.j = securityCipherManager;
    }

    @Override
    public void R() {
        SecurityCipherManager.W(this.j, 3);
    }
}

