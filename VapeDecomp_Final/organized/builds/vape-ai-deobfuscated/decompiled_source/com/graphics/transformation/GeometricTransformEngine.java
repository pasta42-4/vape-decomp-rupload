/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.transformation;

import a.bE;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class GeometricTransformEngine
extends bE {
    private final double E;
    private final double R;
    private final Color B;

    @Override
    public void G() {
        super.G();
        ConfigurationManager.A(this.G() + this.R, this.W() + this.b() / 2.0 - this.E / 2.0, this.w() - this.R * 2.0, this.E, this.B);
    }

    public GeometricTransformEngine(double d2, double d3, double d4, double d5, Color color) {
        super(d2, d3);
        this.E = d4;
        this.R = d5;
        this.B = color;
    }
}

