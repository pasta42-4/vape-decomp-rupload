/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.flow;

import com.app.network.NetworkProtocolHandler1444;
import com.concurrent.resource.MultithreadedResourceOrchestrator;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransactionFlowController
extends ObjectLifecycleTracker {
    public void G() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionFlowController.a(customSystemException);
        }
        MultithreadedResourceOrchestrator.E(TransactionFlowController.U.u().dy, this.H);
    }

    public static TransactionFlowController g() {
        return new TransactionFlowController(MultithreadedResourceOrchestrator.S(TransactionFlowController.U.u().dy));
    }

    public void n() {
        MultithreadedResourceOrchestrator.z(TransactionFlowController.U.u().dy, this.H);
    }

    public void p(int n) {
        MultithreadedResourceOrchestrator.R(TransactionFlowController.U.u().dy, this.H, n);
    }

    public TransactionFlowController(Object object) {
        super(object);
    }

    public void x(int n, int n2, int n3, int n4) {
        TransactionFlowController.U.u().dy.m(this.H, n, n2, n3, n4);
    }

    public NetworkProtocolHandler1444 D() {
        return new NetworkProtocolHandler1444(MultithreadedResourceOrchestrator.d(TransactionFlowController.U.u().dy, this.H));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void m(double d2, double d3, double d4, double d5, double d6) {
        MultithreadedResourceOrchestrator.c(TransactionFlowController.U.u().dy, this.H, d2, d3, d4, d5, d6);
    }

    public boolean F() {
        return TransactionFlowController.U.u().dy.k(this.H);
    }

    public void L(double d2, double d3, double d4) {
        MultithreadedResourceOrchestrator.E(TransactionFlowController.U.u().dy, this.H, d2, d3, d4);
    }
}

