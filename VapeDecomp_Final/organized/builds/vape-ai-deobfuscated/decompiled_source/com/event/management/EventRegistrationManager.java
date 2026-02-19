/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.security.encoding.SecureDataEncoder;

class EventRegistrationManager
implements OperationExecutionInterface {
    final SecureDataEncoder w;

    EventRegistrationManager(SecureDataEncoder secureDataEncoder) {
        this.w = secureDataEncoder;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void R() {
        try {
            if (SecureDataEncoder.k(this.w) != null) {
                SecureDataEncoder.u(this.w);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventRegistrationManager.a(customSystemException);
        }
    }
}

