/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.execution.validation.ExecutionStateValidator;
import com.security.configuration.SecurityEnumRegistry;
import java.awt.Point;

class ConnectionNegotiator
implements DataProcessingProtocol {
    final ExecutionStateValidator O;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        block4: {
            try {
                try {
                    if (this.O.G() || ExecutionStateValidator.M(this.O).G()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConnectionNegotiator.a(customSystemException);
                }
                ExecutionStateValidator.x(this.O);
            }
            catch (CustomSystemException customSystemException) {
                throw ConnectionNegotiator.a(customSystemException);
            }
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ConnectionNegotiator(ExecutionStateValidator executionStateValidator) {
        this.O = executionStateValidator;
    }
}

