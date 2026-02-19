/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.O_;
import a.X_;
import a.hQ;
import java.awt.Color;

@Deprecated
public class hs
extends hQ {
    private Color V;
    private Color NS = null;
    private double b = -1.0;
    private String Y;
    private static int L;
    protected double D;

    public void p(double d2) {
        this.b = d2;
    }

    public Color t() {
        return this.V;
    }

    private static O_ b(O_ o_2) {
        return o_2;
    }

    public void N(Color color) {
        this.NS = color;
    }

    public void h(Color color) {
        this.V = color;
    }

    public void u(String string) {
        this.Y = string;
    }

    public static int p() {
        return L;
    }

    public static int y() {
        int n2 = hs.p();
        try {
            if (n2 == 0) {
                return 75;
            }
        }
        catch (O_ o_2) {
            throw hs.b(o_2);
        }
        return 0;
    }

    public void B(double d2) {
        this.D = d2;
    }

    public double u() {
        return this.D;
    }

    public hs(String string, double d2, Color color) {
        this(string, d2, 13.0, 13.0, null, null, color);
    }

    public hs(String string, double d2, double d3, double d4, Color color, Color color2, Color color3) {
        Color color4;
        hs hs2;
        this.Y = string;
        this.D = d2;
        this.T(d3);
        this.w(d4);
        try {
            this.H(color != null ? color : hs.M.Z);
            hs2 = this;
            color4 = color2 != null ? color2 : hs.M.q;
        }
        catch (O_ o_2) {
            throw hs.b(o_2);
        }
        hs2.R(color4);
        this.NS = color3;
    }

    public hs(String string, double d2, Color color, Color color2, double d3, double d4) {
        this(string, d2, d3, d4, color, color2, null);
    }

    @Override
    public double e() {
        return 0.0;
    }

    public hs(String string) {
        this(string, 1.0, 13.0, 13.0, null, null, null);
    }

    public static void m(int n2) {
        L = n2;
    }

    public hs(String string, double d2) {
        this(string, d2, 13.0, 13.0, null, null, null);
    }

    @Override
    public double z() {
        return 0.0;
    }

    public String T() {
        return this.Y;
    }

    public hs(String string, double d2, double d3, double d4) {
        this(string, d2, d3, d4, null, null, null);
    }

    static {
        if (hs.p() == 0) {
            hs.m(103);
        }
    }

    @Override
    public void G() {
        block12: {
            Color color;
            double d2;
            double d3;
            double d4;
            double d5;
            block14: {
                block13: {
                    block11: {
                        Color color2;
                        double d6;
                        double d7;
                        double d9;
                        double d10;
                        String string;
                        double d11;
                        double d12;
                        block10: {
                            if (this.b != -1.0) {
                                d12 = (double)((float)X_.V(this.Y)) / this.b;
                                d11 = (double)((float)X_.D(this.Y)) / this.b;
                            } else {
                                d12 = d11 = (double)(8.0f * (float)this.D);
                            }
                            try {
                                if (this.V == null) break block10;
                                F8.x(this.Y, this.G() + this.w() / 2.0, this.W() + this.b() / 2.0, d12, d11, this.V);
                                break block11;
                            }
                            catch (O_ o_2) {
                                throw hs.b(o_2);
                            }
                        }
                        try {
                            string = this.Y;
                            d10 = this.G() + this.w() / 2.0;
                            d9 = this.W() + this.b() / 2.0;
                            d7 = d12;
                            d6 = d11;
                            color2 = this.s() ? this.y() : this.H();
                        }
                        catch (O_ o_3) {
                            throw hs.b(o_3);
                        }
                        F8.x(string, d10, d9, d7, d6, color2);
                    }
                    try {
                        try {
                            if (this.NS == null) break block12;
                            d5 = this.G();
                            d4 = this.W();
                            d3 = this.w();
                            d2 = this.b();
                            if (!this.s()) break block13;
                        }
                        catch (O_ o_4) {
                            throw hs.b(o_4);
                        }
                        color = this.NS.brighter();
                        break block14;
                    }
                    catch (O_ o_5) {
                        throw hs.b(o_5);
                    }
                }
                color = this.NS;
            }
            F8.U(d5, d4, d3, d2, color, 2.0f, 0.8f, 1.0f);
        }
    }
}

