/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.theme;

import a.hQ;
import com.app.workflow.StateTrackingCoordinator;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

@Deprecated
public class GraphicalThemeRenderer
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

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
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
        int n = GraphicalThemeRenderer.p();
        try {
            if (n == 0) {
                return 75;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalThemeRenderer.b(customSystemException);
        }
        return 0;
    }

    public void B(double d2) {
        this.D = d2;
    }

    public double u() {
        return this.D;
    }

    public GraphicalThemeRenderer(String string, double d2, Color color) {
        this(string, d2, 13.0, 13.0, null, null, color);
    }

    public GraphicalThemeRenderer(String string, double d2, double d3, double d4, Color color, Color color2, Color color3) {
        Color color4;
        GraphicalThemeRenderer graphicalThemeRenderer;
        this.Y = string;
        this.D = d2;
        this.T(d3);
        this.w(d4);
        try {
            this.H(color != null ? color : GraphicalThemeRenderer.M.Z);
            graphicalThemeRenderer = this;
            color4 = color2 != null ? color2 : GraphicalThemeRenderer.M.q;
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalThemeRenderer.b(customSystemException);
        }
        graphicalThemeRenderer.R(color4);
        this.NS = color3;
    }

    public GraphicalThemeRenderer(String string, double d2, Color color, Color color2, double d3, double d4) {
        this(string, d2, d3, d4, color, color2, null);
    }

    @Override
    public double e() {
        return 0.0;
    }

    public GraphicalThemeRenderer(String string) {
        this(string, 1.0, 13.0, 13.0, null, null, null);
    }

    public static void m(int n) {
        L = n;
    }

    public GraphicalThemeRenderer(String string, double d2) {
        this(string, d2, 13.0, 13.0, null, null, null);
    }

    @Override
    public double z() {
        return 0.0;
    }

    public String T() {
        return this.Y;
    }

    public GraphicalThemeRenderer(String string, double d2, double d3, double d4) {
        this(string, d2, d3, d4, null, null, null);
    }

    static {
        if (GraphicalThemeRenderer.p() == 0) {
            GraphicalThemeRenderer.m(103);
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
                        double d8;
                        double d9;
                        String string;
                        double d10;
                        double d11;
                        block10: {
                            if (this.b != -1.0) {
                                d11 = (double)((float)StateTrackingCoordinator.V(this.Y)) / this.b;
                                d10 = (double)((float)StateTrackingCoordinator.D(this.Y)) / this.b;
                            } else {
                                d11 = d10 = (double)(8.0f * (float)this.D);
                            }
                            try {
                                if (this.V == null) break block10;
                                ConfigurationManager.x(this.Y, this.G() + this.w() / 2.0, this.W() + this.b() / 2.0, d11, d10, this.V);
                                break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalThemeRenderer.b(customSystemException);
                            }
                        }
                        try {
                            string = this.Y;
                            d9 = this.G() + this.w() / 2.0;
                            d8 = this.W() + this.b() / 2.0;
                            d7 = d11;
                            d6 = d10;
                            color2 = this.s() ? this.y() : this.H();
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalThemeRenderer.b(customSystemException);
                        }
                        ConfigurationManager.x(string, d9, d8, d7, d6, color2);
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
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalThemeRenderer.b(customSystemException);
                        }
                        color = this.NS.brighter();
                        break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalThemeRenderer.b(customSystemException);
                    }
                }
                color = this.NS;
            }
            ConfigurationManager.U(d5, d4, d3, d2, color, 2.0f, 0.8f, 1.0f);
        }
    }
}

