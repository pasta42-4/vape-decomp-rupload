/*
 * Decompiled with CFR 0.152.
 */
package com.app.math;

import com.exception.system.CustomSystemException;
import com.validation.temporal.TimestampValidator;

public class NumericStreamProcessor
extends TimestampValidator<Double> {
    private double W;
    private double K;
    private double a;

    public NumericStreamProcessor(double d2, double d3, double d4, double d5, double d6) {
        super(d2, d3, d4);
        this.a = d5;
        this.W = d6;
        this.K = d6 - d5;
    }

    public NumericStreamProcessor(double d2, double d3, double d4, double d5) {
        super(d2, d3);
        this.a = d4;
        this.W = d5;
        this.K = d5 - d4;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public NumericStreamProcessor(double d2, double d3, double d4) {
        super(d2);
        this.a = d3;
        this.W = d4;
        this.K = d4 - d3;
    }

    public double p() {
        return this.W;
    }

    public Double t() {
        try {
            if (this.A() == 0L) {
                return this.W;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericStreamProcessor.a(customSystemException);
        }
        double d2 = this.k();
        try {
            if (d2 == 0.0) {
                return this.a;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericStreamProcessor.a(customSystemException);
        }
        try {
            if (d2 == 100.0) {
                return this.W;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericStreamProcessor.a(customSystemException);
        }
        return this.a + this.k() * this.K / 100.0;
    }

    public void m(double d2) {
        this.W = d2;
        this.K = d2 - this.a;
    }

    public double n() {
        return this.a;
    }
}

