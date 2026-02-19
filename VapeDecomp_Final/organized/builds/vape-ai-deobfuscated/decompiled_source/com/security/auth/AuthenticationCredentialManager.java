/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import com.app.core.interfaces.OperationExecutionInterface;
import com.app.workflow.StateTrackingCoordinator;
import com.finance.transaction.TransactionProcessor1417;
import com.security.crypto.CryptographicParameterGenerator;
import java.awt.Color;

class AuthenticationCredentialManager
extends TransactionProcessor1417 {
    private final String b;
    private final String E;

    @Override
    public void G() {
        super.G();
        StateTrackingCoordinator.B(Color.WHITE, (float)(this.G() + 10.0), (float)(this.W() + this.b() / 2.0 - 3.0), this.b, 6.0f, 6.0f, false);
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.8);
        cryptographicParameterGenerator.R(this.E, this.G() + 10.0 + 6.0 + 5.0, this.W() + this.b() / 2.0 - cryptographicParameterGenerator.B(this.E) / 2.0, AuthenticationCredentialManager.M.c);
    }

    public AuthenticationCredentialManager(String string, String string2, OperationExecutionInterface operationExecutionInterface) {
        super(operationExecutionInterface);
        this.E = string;
        this.b = string2;
    }
}

