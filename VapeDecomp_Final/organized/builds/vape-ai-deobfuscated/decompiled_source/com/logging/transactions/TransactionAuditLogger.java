/*
 * Decompiled with CFR 0.152.
 */
package com.logging.transactions;

import com.app.security.access.SecurityAccessController;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.execution.scheduling.TimedExecutionCoordinator;

public class TransactionAuditLogger
extends TimedExecutionCoordinator {
    private long T;

    public TransactionAuditLogger K(String string) {
        this.Z(string);
        return this;
    }

    public TransactionAuditLogger D(String string) {
        ((SecurityAccessController)super.V()).y(string);
        return this;
    }

    public void L(long l) {
        this.T = l;
    }

    public TransactionAuditLogger Q() {
        this.I(this.T);
        this.R(-this.S());
        return this;
    }

    public TransactionAuditLogger(CryptoConfigurationRegistry383 cryptoConfigurationRegistry383, String string, String string2, long l) {
        super(cryptoConfigurationRegistry383, string, new SecurityAccessController(string2), 0.0, 0.0, l);
        this.T = l;
    }
}

