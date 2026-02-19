/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.bE;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class GraphicalRenderController
extends bE {
    private Color F;
    private double E;
    private double Y;

    @Override
    public void E() {
        super.E();
        double d2 = this.G() + (this.w() - this.E) / 2.0;
        double d3 = this.W() + (this.b() - this.Y) / 2.0;
        ConfigurationManager.A(d2, d3, this.E, this.Y, this.F);
    }

    public GraphicalRenderController(double d2, double d3, double d4, double d5, Color color) {
        super(d2, d3);
        this.F = color;
        this.E = d4;
        this.Y = d5;
    }

    public GraphicalRenderController(double d2, double d3, Color color) {
        super(d2, d3);
        this.F = color;
        this.E = d2;
        this.Y = d3;
    }
}

