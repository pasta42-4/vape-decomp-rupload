/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.analytics.computation.MetricsCalculationEngine;
import com.exception.system.CustomSystemException;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;

public abstract class CryptographicKeyGenerator1474
extends CipherSessionManager {
    @Override
    public MetricsCalculationEngine C() {
        try {
            if (this.Gt) {
                return new MetricsCalculationEngine(this.G() - 5.0, this.W(), this.w() + 10.0, this.Q());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyGenerator1474.c(customSystemException);
        }
        return new MetricsCalculationEngine(this.G() - 5.0, this.W(), this.w() + 10.0, this.b());
    }

    @Override
    public void o(boolean bl) {
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            d5 = this.G() - 5.0;
            d4 = this.W();
            d3 = this.w() + 10.0;
            d2 = bl ? this.G5 + 2.0 : this.b() + 2.0;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicKeyGenerator1474.c(customSystemException);
        }
        ConfigurationManager.S(d5, d4, d3, d2, this.l());
    }

    @Override
    public void T(double d2) {
        super.T(d2 - 10.0);
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void a() {
        this.GH = new MetricsCalculationEngine(this.GH.K() + 5.0, this.GH.q(), this.GH.t(), this.GH.V());
        super.a();
    }

    @Override
    public void b(double d2) {
        super.b(d2 + 5.0);
    }
}

