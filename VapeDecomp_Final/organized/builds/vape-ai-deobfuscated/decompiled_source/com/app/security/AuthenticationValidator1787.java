/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import a.Cz;
import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;

class AuthenticationValidator1787
implements OperationExecutionInterface {
    final Cz D;

    @Override
    public void R() {
        try {
            if (Cz.G(this.D) != null) {
                Cz.G(this.D).R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationValidator1787.a(customSystemException);
        }
    }

    AuthenticationValidator1787(Cz cz) {
        this.D = cz;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

