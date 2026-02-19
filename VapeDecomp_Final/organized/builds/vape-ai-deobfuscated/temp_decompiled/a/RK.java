/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.rZ;

public class rk
extends rZ<Double> {
    private double W;
    private double K;
    private double a;

    public rk(double d2, double d3, double d4, double d5, double d6) {
        super(d2, d3, d4);
        this.a = d5;
        this.W = d6;
        this.K = d6 - d5;
    }

    public rk(double d2, double d3, double d4, double d5) {
        super(d2, d3);
        this.a = d4;
        this.W = d5;
        this.K = d5 - d4;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public rk(double d2, double d3, double d4) {
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
        catch (O_ o_2) {
            throw rk.a(o_2);
        }
        double d2 = this.k();
        try {
            if (d2 == 0.0) {
                return this.a;
            }
        }
        catch (O_ o_3) {
            throw rk.a(o_3);
        }
        try {
            if (d2 == 100.0) {
                return this.W;
            }
        }
        catch (O_ o_4) {
            throw rk.a(o_4);
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

