/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import a.bE;
import com.core.computation.AbstractComputationKernel;

public class NetworkConnectionManager1865
extends bE {
    private final AbstractComputationKernel b;
    private final bE D;

    @Override
    public double b() {
        return this.b.b();
    }

    public NetworkConnectionManager1865(AbstractComputationKernel abstractComputationKernel, double d2, bE bE2) {
        super(d2, 0.0);
        this.b = abstractComputationKernel;
        this.D = bE2;
    }

    public NetworkConnectionManager1865(AbstractComputationKernel abstractComputationKernel, bE bE2) {
        this(abstractComputationKernel, 0.0, bE2);
    }

    @Override
    public double z() {
        return this.b.b();
    }

    @Override
    public void G() {
        super.G();
        this.D.b(this.G());
        this.D.M(this.W());
        this.D.P(-1.0);
        this.D.w(this.b());
        this.D.E();
    }
}

