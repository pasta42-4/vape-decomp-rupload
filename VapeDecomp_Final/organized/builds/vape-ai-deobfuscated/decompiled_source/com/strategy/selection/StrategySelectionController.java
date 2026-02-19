/*
 * Decompiled with CFR 0.152.
 */
package com.strategy.selection;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.protocol.NetworkProtocolNegotiator;
import com.runtime.interceptor.ContextualDataInterceptor;
import com.security.transform.CryptographicTransformer;

public class StrategySelectionController
extends ConnectionLifecycleHandler {
    public int V() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ContextualDataInterceptor.J(StrategySelectionController.U.u().GR, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StrategySelectionController.a(customSystemException);
        }
        return ContextualDataInterceptor.s(StrategySelectionController.U.u().GR, this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public StrategySelectionController(Object object) {
        super(object);
    }

    public int W() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ContextualDataInterceptor.g(StrategySelectionController.U.u().GR, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StrategySelectionController.a(customSystemException);
        }
        return ContextualDataInterceptor.p(StrategySelectionController.U.u().GR, this.H);
    }

    public int G() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return ContextualDataInterceptor.k(StrategySelectionController.U.u().GR, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StrategySelectionController.a(customSystemException);
        }
        return ContextualDataInterceptor.Y(StrategySelectionController.U.u().GR, this.H);
    }

    public CryptographicTransformer c(NetworkProtocolNegotiator networkProtocolNegotiator) {
        return new CryptographicTransformer(ContextualDataInterceptor.u(StrategySelectionController.U.u().GR, this.H, networkProtocolNegotiator.M()));
    }
}

