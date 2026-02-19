/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.processing;

import com.app.network.NetworkConnectionHandler1792;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.security.crypto.CryptographicParameterOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.Collection;
import java.util.UUID;

public class TransactionSequenceManager
extends ObjectLifecycleTracker {
    public NetworkConnectionHandler1792 l(UUID uUID) {
        return new NetworkConnectionHandler1792(CryptographicParameterOrchestrator.R(TransactionSequenceManager.U.u().j, this.H, uUID));
    }

    public void B(double d2) {
        CryptographicParameterOrchestrator.K(TransactionSequenceManager.U.u().j, this.H, d2);
    }

    public double n() {
        return CryptographicParameterOrchestrator.G(TransactionSequenceManager.U.u().j, this.H);
    }

    public void h() {
        CryptographicParameterOrchestrator.o(TransactionSequenceManager.U.u().j, this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public TransactionSequenceManager(Object object) {
        super(object);
    }

    public void V(NetworkConnectionHandler1792 networkConnectionHandler1792) {
        CryptographicParameterOrchestrator.K(TransactionSequenceManager.U.u().j, this.H, networkConnectionHandler1792.M());
    }

    public Collection D() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return CryptographicParameterOrchestrator.J(TransactionSequenceManager.U.u().j, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionSequenceManager.a(customSystemException);
        }
        return CryptographicParameterOrchestrator.j(TransactionSequenceManager.U.u().j, this.H);
    }
}

