/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.core.computation.AbstractComputationKernel;
import com.event.management.ContextualEventDispatcher;

public class kg {
    public double O;
    public double K;
    private static AbstractComputationKernel[] e;
    public double w;

    public void y(double d2, double d3, double d4) {
        this.K = d2;
        this.w = d3;
        this.O = d4;
    }

    static {
        if (kg.S() != null) {
            kg.d(new AbstractComputationKernel[4]);
        }
    }

    public void H(double d2) {
        this.O = d2;
    }

    public double R() {
        return this.K;
    }

    public static void d(AbstractComputationKernel[] abstractComputationKernelArray) {
        e = abstractComputationKernelArray;
    }

    public kg() {
        this.K = 0.0;
        this.w = 0.0;
        this.O = 0.0;
    }

    public double e(kg kg2) {
        return this.K * kg2.K + this.w * kg2.w + this.O * kg2.O;
    }

    public void J(double d2, double d3, double d4) {
        this.K -= d2;
        this.w -= d3;
        this.O -= d4;
    }

    public void J() {
        double d2 = 1.0 / this.H();
        this.K *= d2;
        this.w *= d2;
        this.O *= d2;
    }

    public ContextualEventDispatcher l() {
        return ContextualEventDispatcher.N(this.K, this.w, this.O);
    }

    public void t(kg kg2) {
        this.K += kg2.K;
        this.w += kg2.w;
        this.O += kg2.O;
    }

    public kg(ContextualEventDispatcher contextualEventDispatcher) {
        this.K = contextualEventDispatcher.X();
        this.w = contextualEventDispatcher.F();
        this.O = contextualEventDispatcher.f();
    }

    public void n(float f) {
        float f2 = (float)Math.cos(f);
        float f3 = (float)Math.sin(f);
        double d2 = this.K * (double)f2 + this.O * (double)f3;
        double d3 = this.w;
        double d4 = this.O * (double)f2 - this.K * (double)f3;
        this.K = d2;
        this.w = d3;
        this.O = d4;
    }

    public void P(kg kg2) {
        this.K -= kg2.K;
        this.w -= kg2.w;
        this.O -= kg2.O;
    }

    public kg(double d2, double d3, double d4) {
        this.K = d2;
        this.w = d3;
        this.O = d4;
    }

    public void J(double d2) {
        this.K = d2;
    }

    public double L(kg kg2) {
        double d2 = this.K - kg2.K;
        double d3 = this.w - kg2.w;
        double d4 = this.O - kg2.O;
        return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
    }

    public void v(kg kg2, kg kg3) {
        double d2 = kg2.w * kg3.O - kg2.O * kg3.w;
        double d3 = kg3.K * kg2.O - kg3.O * kg2.K;
        this.O = kg2.K * kg3.w - kg2.w * kg3.K;
        this.K = d2;
        this.w = d3;
    }

    public void a(double d2, double d3, double d4) {
        this.K += d2;
        this.w += d3;
        this.O += d4;
    }

    public static AbstractComputationKernel[] S() {
        return e;
    }

    public double L() {
        return this.w;
    }

    public double U() {
        return this.O;
    }

    public void x(double d2) {
        this.K *= d2;
        this.w *= d2;
        this.O *= d2;
    }

    public void D(double d2) {
        this.w = d2;
    }

    public double H() {
        return Math.sqrt(this.K * this.K + this.w * this.w + this.O * this.O);
    }

    public void j(float f) {
        float f2 = (float)Math.cos(f);
        float f3 = (float)Math.sin(f);
        double d2 = this.K;
        double d3 = this.w * (double)f2 + this.O * (double)f3;
        double d4 = this.O * (double)f2 - this.w * (double)f3;
        this.K = d2;
        this.w = d3;
        this.O = d4;
    }
}

