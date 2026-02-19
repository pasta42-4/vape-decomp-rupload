/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.DT;
import a.ht;

public class kg {
    public double O;
    public double K;
    private static ht[] e;
    public double w;

    public void y(double d2, double d3, double d4) {
        this.K = d2;
        this.w = d3;
        this.O = d4;
    }

    static {
        if (kg.S() != null) {
            kg.d(new ht[4]);
        }
    }

    public void H(double d2) {
        this.O = d2;
    }

    public double R() {
        return this.K;
    }

    public static void d(ht[] htArray) {
        e = htArray;
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

    public DT l() {
        return DT.N(this.K, this.w, this.O);
    }

    public void t(kg kg2) {
        this.K += kg2.K;
        this.w += kg2.w;
        this.O += kg2.O;
    }

    public kg(DT dT) {
        this.K = dT.X();
        this.w = dT.F();
        this.O = dT.f();
    }

    public void n(float f10) {
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        double d2 = this.K * (double)f11 + this.O * (double)f12;
        double d3 = this.w;
        double d4 = this.O * (double)f11 - this.K * (double)f12;
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

    public static ht[] S() {
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

    public void j(float f10) {
        float f11 = (float)Math.cos(f10);
        float f12 = (float)Math.sin(f10);
        double d2 = this.K;
        double d3 = this.w * (double)f11 + this.O * (double)f12;
        double d4 = this.O * (double)f11 - this.w * (double)f12;
        this.K = d2;
        this.w = d3;
        this.O = d4;
    }
}

