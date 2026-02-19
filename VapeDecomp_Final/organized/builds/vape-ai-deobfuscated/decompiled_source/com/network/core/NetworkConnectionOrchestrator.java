/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package com.network.core;

import com.app.ui.UserInteractionManager;
import com.event.core.EventDispatchCenter2546;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.google.common.collect.ImmutableMap;
import com.integration.adaptation.InterfaceAdaptationManager;
import com.math.geometry.GeometryCalculator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class NetworkConnectionOrchestrator
extends ObjectLifecycleTracker {
    public TransactionCorrelationEngine I() {
        return new TransactionCorrelationEngine(NetworkConnectionOrchestrator.U.u().Lw.l(this.H));
    }

    public boolean O() {
        return NetworkConnectionOrchestrator.U.u().Lw.l(this.H);
    }

    public Object A(EventDispatchCenter2546 eventDispatchCenter2546) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return NetworkConnectionOrchestrator.U.u().Lw.a(this.H, eventDispatchCenter2546.M());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionOrchestrator.a(customSystemException);
        }
        ImmutableMap immutableMap = NetworkConnectionOrchestrator.U.u().Lw.e(this.H);
        for (Object e : immutableMap.keySet()) {
            if (!e.getClass().equals(eventDispatchCenter2546.M().getClass())) continue;
            Object object = immutableMap.get(e);
            return object;
        }
        if (immutableMap.containsKey(eventDispatchCenter2546.M())) {
            Object object = immutableMap.get(eventDispatchCenter2546.M());
            return object;
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean A() {
        return NetworkConnectionOrchestrator.U.u().Lw.C(this.H);
    }

    public boolean q() {
        return NetworkConnectionOrchestrator.U.u().Lw.I(this.H);
    }

    public NetworkConnectionOrchestrator(Object object) {
        super(object);
    }

    public boolean n() {
        return NetworkConnectionOrchestrator.U.u().Lw.w(this.H);
    }

    public UserInteractionManager s() {
        return new UserInteractionManager(InterfaceAdaptationManager.x(NetworkConnectionOrchestrator.U.u().Lw, this.H));
    }
}

