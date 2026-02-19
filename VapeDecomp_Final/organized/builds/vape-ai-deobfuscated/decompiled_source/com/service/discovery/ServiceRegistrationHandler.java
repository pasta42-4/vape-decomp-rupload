/*
 * Decompiled with CFR 0.152.
 */
package com.service.discovery;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkProtocolDefinition;
import com.security.session.CipherSessionManager;
import com.system.dynamics.DynamicParameterManager;

class ServiceRegistrationHandler
implements OperationExecutionInterface {
    final DynamicParameterManager c;
    final CipherSessionManager J;

    ServiceRegistrationHandler(DynamicParameterManager dynamicParameterManager, CipherSessionManager cipherSessionManager) {
        this.c = dynamicParameterManager;
        this.J = cipherSessionManager;
    }

    @Override
    public void R() {
        try {
            if (this.J instanceof NetworkProtocolDefinition) {
                ((NetworkProtocolDefinition)((Object)this.J)).V();
                DynamicParameterManager.q(this.c, ((NetworkProtocolDefinition)((Object)this.J)).W());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ServiceRegistrationHandler.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

