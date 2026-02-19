/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.app.error.management.ErrorRecoveryHandler;
import com.data.transformation.ContextualTransformationEngine;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.network.connection.NetworkConnectionManager1986;
import com.runtime.context.LightweightExecutionContext;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.AbstractList;
import java.util.ArrayList;

public class AssetLoadBalancer
extends ObjectLifecycleTracker {
    public LightweightExecutionContext D() {
        return new LightweightExecutionContext(ContextualTransformationEngine.b(AssetLoadBalancer.U.u().Ln, this.H));
    }

    public AssetLoadBalancer(Object object) {
        super(object);
    }

    public int v() {
        return AssetLoadBalancer.U.u().Ln.V(this.H);
    }

    public LightweightExecutionContext F(int n) {
        return new LightweightExecutionContext(AssetLoadBalancer.U.u().Ln.E(this.H, n));
    }

    public void A(int n) {
        AssetLoadBalancer.U.u().Ln.M(this.H, n);
    }

    public Object[] C() {
        if (GeometryCalculator.C() >= 23) {
            AbstractList abstractList = AssetLoadBalancer.U.u().Ln.H(this.H);
            return abstractList.toArray();
        }
        return AssetLoadBalancer.U.u().Ln.v(this.H);
    }

    public Object[] G() {
        if (GameVersionEnumerator.MC_1_21_6.H()) {
            ArrayList<LightweightExecutionContext> arrayList = new ArrayList<LightweightExecutionContext>();
            for (Object e : NetworkConnectionManager1986.k().d()) {
                ErrorRecoveryHandler errorRecoveryHandler = new ErrorRecoveryHandler(e);
                arrayList.add(this.F(errorRecoveryHandler.R()));
            }
            return arrayList.toArray();
        }
        if (GeometryCalculator.C() >= 23) {
            AbstractList abstractList = ContextualTransformationEngine.Q(AssetLoadBalancer.U.u().Ln, this.H);
            return abstractList.toArray();
        }
        return ContextualTransformationEngine.y(AssetLoadBalancer.U.u().Ln, this.H);
    }
}

