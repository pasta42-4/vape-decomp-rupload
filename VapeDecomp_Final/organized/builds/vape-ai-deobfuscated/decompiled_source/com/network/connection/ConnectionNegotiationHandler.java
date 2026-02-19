/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.core.NetworkConnectionOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ConnectionNegotiationHandler
extends ObjectLifecycleTracker {
    public int o() {
        return ConnectionNegotiationHandler.U.u().kv.R(this.H);
    }

    public static Object t(int n, boolean bl) {
        try {
            if (GeometryCalculator.C() >= GeometryCalculator.C) {
                return ConnectionNegotiationHandler.U.u().kv.k(n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionNegotiationHandler.a(customSystemException);
        }
        return ConnectionNegotiationHandler.U.u().kv.P(n, bl);
    }

    public void w(int n, int n2, int n3, NetworkConnectionOrchestrator networkConnectionOrchestrator) {
        block3: {
            block2: {
                try {
                    if (GeometryCalculator.C() < GeometryCalculator.C) break block2;
                    ConnectionNegotiationHandler.U.u().kv.O(this.H, n, n2, n3, networkConnectionOrchestrator.M(), false);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConnectionNegotiationHandler.a(customSystemException);
                }
            }
            ConnectionNegotiationHandler.U.u().kv.p(this.H, n, n2, n3, networkConnectionOrchestrator.M());
        }
    }

    public ConnectionNegotiationHandler(Object object) {
        super(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public char[] v() {
        return ConnectionNegotiationHandler.U.u().kv.W(this.H);
    }
}

