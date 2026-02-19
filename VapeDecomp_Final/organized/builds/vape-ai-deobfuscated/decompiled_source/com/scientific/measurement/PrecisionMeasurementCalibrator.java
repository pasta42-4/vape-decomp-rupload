/*
 * Decompiled with CFR 0.152.
 */
package com.scientific.measurement;

import com.core.computation.AbstractComputationKernel;
import com.security.crypto.CipherContextManager1101;

public class PrecisionMeasurementCalibrator
extends CipherContextManager1101 {
    private double Ar = 0.0;

    public void u(double d2) {
        this.Ar = d2;
    }

    @Override
    public void E() {
        double d2 = this.N().G() + this.N().w() / 2.0;
        double d3 = this.N().W() + this.N().b() / 2.0 + this.Ar / 2.0;
        double d4 = d2 - this.w() / 2.0;
        double d5 = d3 - this.b() / 2.0;
        this.b(d4);
        this.M(d5);
        this.A();
        super.E();
    }

    public PrecisionMeasurementCalibrator(AbstractComputationKernel abstractComputationKernel, AbstractComputationKernel abstractComputationKernel2) {
        super(abstractComputationKernel, abstractComputationKernel2);
    }
}

