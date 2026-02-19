/*
 * Decompiled with CFR 0.152.
 */
package com.app.communication;

import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.security.session.CryptographicSessionManager299;
import com.ui.rendering.GraphicalRenderingController;

class DataTransmissionHandler
implements OperationExecutionInterface {
    final String t;
    final CryptographicSessionManager299 G;

    @Override
    public void R() {
        boolean bl;
        CryptographicSessionManager299 cryptographicSessionManager299;
        try {
            cryptographicSessionManager299 = this.G;
            bl = !CryptographicSessionManager299.G(this.G);
        }
        catch (CustomSystemException customSystemException) {
            throw DataTransmissionHandler.a(customSystemException);
        }
        CryptographicSessionManager299.T(cryptographicSessionManager299, bl);
        CryptographicSessionManager299.I(this.G).c();
        GraphicalRenderingController.k(this.t);
    }

    DataTransmissionHandler(CryptographicSessionManager299 cryptographicSessionManager299, String string) {
        this.G = cryptographicSessionManager299;
        this.t = string;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

