/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocols;

import a.yy;
import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;

class NetworkProtocolHandler1846
implements OperationExecutionInterface {
    final yy n;

    @Override
    public void R() {
        try {
            if (!this.n.P().booleanValue()) {
                yy.F(this.n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkProtocolHandler1846.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    NetworkProtocolHandler1846(yy yy2) {
        this.n = yy2;
    }
}

