/*
 * Decompiled with CFR 0.152.
 */
package com.workflow.management;

import com.core.computation.AbstractComputationKernel;
import com.data.compression.DataCompressionNegotiator;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;

public class WorkflowStateController
extends AbstractComputationKernel {
    private final DataCompressionNegotiator v;

    public void f(String string) {
        this.v.H(string);
    }

    @Override
    public double e() {
        double d2 = this.v.D();
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
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public void G() {
        this.v.b(this.G());
        this.v.M(this.W() + this.b() / 2.0 - this.v.b() / 2.0);
        this.v.T(this.w());
        this.v.w(this.b());
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), WorkflowStateController.M.m);
    }

    @Override
    public void g() {
    }

    public String R() {
        return this.v.y();
    }

    @Override
    public void d() {
    }

    public WorkflowStateController(String string) {
        this.n(true);
        this.v = new DataCompressionNegotiator(string, 0.7);
        this.v.B(WorkflowStateController.M.n);
        this.o(this.v);
    }
}

