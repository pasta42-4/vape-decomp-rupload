/*
 * Decompiled with CFR 0.152.
 */
package com.financial.validation;

import a.Qh;
import a.Ya;
import com.math.calculation.NumericCalculationEngine;
import com.security.auth.AuthenticationHandler;
import com.simulation.core.ModelSimulationEngine;

class TransactionValidator1847
extends Ya {
    final ModelSimulationEngine e;
    final Qh A;

    @Override
    public float A() {
        return this.A.q();
    }

    @Override
    public void p(float f, float f2) {
        AuthenticationHandler.j(this.A, f, f2);
    }

    TransactionValidator1847(ModelSimulationEngine modelSimulationEngine, NumericCalculationEngine numericCalculationEngine, Qh qh) {
        this.e = modelSimulationEngine;
        this.A = qh;
        super(numericCalculationEngine);
    }

    @Override
    public float L() {
        return this.A.S();
    }
}

