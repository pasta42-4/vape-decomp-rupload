/*
 * Decompiled with CFR 0.152.
 */
package com.system.state;

import com.core.computation.AbstractComputationKernel;
import com.data.compression.DataCompressionNegotiator;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;

public class StateTransitionEngine
extends AbstractComputationKernel {
    private final DataCompressionNegotiator B;
    private final DataCompressionNegotiator D;

    public void X(double d2) {
        this.D.p(d2);
    }

    @Override
    public double e() {
        return 0.0;
    }

    public StateTransitionEngine(String string, String string2) {
        this.Q(StateTransitionEngine.M.y);
        this.D = new DataCompressionNegotiator(string2, 0.9);
        this.D.q(true);
        this.D.B(StateTransitionEngine.M.c);
        this.D.w(4.0);
        this.D.S(true);
        this.o(this.D);
        this.B = new DataCompressionNegotiator(string, 0.65);
        this.B.q(true);
        this.B.B(StateTransitionEngine.M.H);
        this.B.w(4.0);
        this.B.S(true);
        this.o(this.B);
    }

    public void n(double d2) {
        this.B.p(d2);
    }

    @Override
    public void d() {
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public void U() {
    }

    @Override
    public void G() {
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), this.l());
        double d2 = this.b() / 2.0;
        this.B.M(this.W() + d2 + this.B.R() / 2.0);
        this.D.M(this.W() + d2 - 7.0);
        for (AbstractComputationKernel abstractComputationKernel : this.A()) {
            abstractComputationKernel.b(this.G());
            abstractComputationKernel.T(this.w());
            abstractComputationKernel.G();
        }
        double d3 = this.B.w();
        this.getClass();
        this.B.C(d3 - 5.0);
        double d4 = this.D.w();
        this.getClass();
        this.D.C(d4 - 5.0);
    }

    @Override
    public void g() {
    }
}

