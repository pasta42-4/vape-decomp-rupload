/*
 * Decompiled with CFR 0.152.
 */
package com.app.simulation;

import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.resilience.ResiliencyEventProcessor;
import java.awt.Color;

class EnvironmentSimulator {
    public double q;
    final ResiliencyEventProcessor K;
    public String H;
    public Color u;
    public boolean R;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public double D() {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            cryptographicParameterGenerator = this.R ? this.K.t(this.q) : this.K.L(this.q);
        }
        catch (CustomSystemException customSystemException) {
            throw EnvironmentSimulator.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        return cryptographicParameterGenerator2.B(this.H);
    }

    public double O() {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            cryptographicParameterGenerator = this.R ? this.K.t(this.q) : this.K.L(this.q);
        }
        catch (CustomSystemException customSystemException) {
            throw EnvironmentSimulator.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        return cryptographicParameterGenerator2.D(this.H);
    }

    public EnvironmentSimulator(ResiliencyEventProcessor resiliencyEventProcessor, String string, double d2, Color color, boolean bl) {
        this.K = resiliencyEventProcessor;
        this.H = string;
        this.q = d2;
        this.u = color;
        this.R = bl;
    }

    public void w(double d2, double d3) {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            cryptographicParameterGenerator = this.R ? this.K.t(this.q) : this.K.L(this.q);
        }
        catch (CustomSystemException customSystemException) {
            throw EnvironmentSimulator.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        cryptographicParameterGenerator2.Y(this.H, d2, d3, this.u);
    }
}

