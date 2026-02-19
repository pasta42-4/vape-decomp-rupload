/*
 * Decompiled with CFR 0.152.
 */
package com.system.parameters;

import a.kg;
import com.event.management.ContextualEventDispatcher;
import com.math.calculation.NumericCalculationEngine;
import com.math.computation.NumericComputationFramework;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.transaction.management.TransactionOrchestrator1017;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MultimodalParameterController {
    private double R;
    private float x;
    private NumericComputationFramework V;
    private boolean Z;
    private boolean D;
    private NetworkPacketInterceptor1107 N;
    private float l;
    private double T;
    private kg v;
    private double k;
    private kg f;
    private boolean p;

    public NumericCalculationEngine b() {
        return new NumericCalculationEngine(this.x, this.l);
    }

    public MultimodalParameterController(TransactionOrchestrator1017 transactionOrchestrator1017) {
        this.T = transactionOrchestrator1017.F();
        this.k = transactionOrchestrator1017.V();
        this.R = transactionOrchestrator1017.B();
        this.x = transactionOrchestrator1017.q();
        this.l = transactionOrchestrator1017.S();
        this.D = transactionOrchestrator1017.j();
        this.Z = transactionOrchestrator1017.H();
        this.p = transactionOrchestrator1017.o();
    }

    public boolean F() {
        return this.Z;
    }

    public kg J() {
        return new kg(this.T, this.k, this.R);
    }

    public void e(kg kg2) {
        this.v = kg2;
    }

    public double A() {
        return this.k;
    }

    public NetworkPacketInterceptor1107 U() {
        return this.N;
    }

    public double g() {
        return this.R;
    }

    public NumericComputationFramework M() {
        return this.V;
    }

    public boolean M() {
        return this.D;
    }

    public void D(NumericComputationFramework numericComputationFramework) {
        this.V = numericComputationFramework;
    }

    public float u() {
        return this.x;
    }

    public kg L() {
        return this.v;
    }

    public double z() {
        return this.T;
    }

    public ContextualEventDispatcher W() {
        return ContextualEventDispatcher.N(this.T, this.k, this.R);
    }

    public void I(NetworkPacketInterceptor1107 networkPacketInterceptor1107) {
        this.N = networkPacketInterceptor1107;
    }

    public boolean Z() {
        return this.p;
    }

    public void j(kg kg2) {
        this.f = kg2;
    }

    public kg E() {
        return this.f;
    }

    public float n() {
        return this.l;
    }
}

