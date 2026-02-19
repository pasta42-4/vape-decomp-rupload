/*
 * Decompiled with CFR 0.152.
 */
package com.network.security;

import com.system.lifecycle.ObjectLifecycleTracker;
import com.transaction.security.TransactionSecurityOrchestrator;

public class SecureTransmissionHandler
extends ObjectLifecycleTracker {
    public SecureTransmissionHandler(Object object) {
        super(object);
    }

    public static SecureTransmissionHandler Q() {
        return new SecureTransmissionHandler(TransactionSecurityOrchestrator.o(SecureTransmissionHandler.U.u().Lj));
    }

    public static SecureTransmissionHandler K() {
        return new SecureTransmissionHandler(TransactionSecurityOrchestrator.J(SecureTransmissionHandler.U.u().Lj));
    }

    public double m(double d2, double d3, double d4) {
        return SecureTransmissionHandler.U.u().Lj.r(this.H, d2, d3, d4);
    }
}

