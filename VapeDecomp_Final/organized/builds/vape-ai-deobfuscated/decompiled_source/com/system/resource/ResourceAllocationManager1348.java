/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.core.computation.AbstractComputationKernel;
import com.data.compression.DataCompressionNegotiator;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;

public class ResourceAllocationManager1348
extends AbstractComputationKernel {
    private final DataCompressionNegotiator E;

    @Override
    public void d() {
    }

    public String p() {
        return this.E.y();
    }

    @Override
    public void G() {
        this.E.b(this.G());
        this.E.M(this.W() + this.b() / 2.0 - this.E.b() / 2.0);
        this.E.T(this.w());
        this.E.w(this.b());
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), ResourceAllocationManager1348.M.m);
    }

    public void q(String string) {
        this.E.H(string);
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public double e() {
        double d2 = this.E.D();
        this.getClass();
        return d2 + 5.0 + 4.0;
    }

    @Override
    public void U() {
    }

    @Override
    public double z() {
        return 12.0;
    }

    @Override
    public void g() {
    }

    public ResourceAllocationManager1348(String string) {
        this.n(true);
        this.E = new DataCompressionNegotiator(string, 0.7);
        this.E.B(ResourceAllocationManager1348.M.n);
        this.o(this.E);
    }
}

