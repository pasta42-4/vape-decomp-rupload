/*
 * Decompiled with CFR 0.152.
 */
package com.sensor.processing;

import com.app.graphics.rendering.ColorPaletteRenderer;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.VisualRenderingController;
import com.security.crypto.CryptographicParameterGenerator;
import java.awt.Color;

public class SensorDataInterpreter
extends VisualRenderingController {
    protected String Jl;
    protected ColorPaletteRenderer L;
    protected boolean V;
    protected double J_;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ColorPaletteRenderer x() {
        return this.L;
    }

    @Override
    public void l(boolean bl) {
        try {
            if (this.T != bl) {
                this.L.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SensorDataInterpreter.a(customSystemException);
        }
        super.l(bl);
    }

    public void C(ColorPaletteRenderer colorPaletteRenderer) {
        this.L = colorPaletteRenderer;
    }

    public SensorDataInterpreter(String string, double d2, boolean bl, double d3, double d4, Color color, double d5) {
        super(d3, d4, color, d5);
        this.L = new ColorPaletteRenderer(0.15, SensorDataInterpreter.M.Z, SensorDataInterpreter.M.q);
        this.Jl = string;
        this.J_ = d2;
        this.V = bl;
    }

    public SensorDataInterpreter(String string, double d2, boolean bl, double d3, double d4, Color color) {
        super(d3, d4, color);
        this.L = new ColorPaletteRenderer(0.15, SensorDataInterpreter.M.Z, SensorDataInterpreter.M.q);
        this.Jl = string;
        this.J_ = d2;
        this.V = bl;
    }

    @Override
    public void G() {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            super.G();
            cryptographicParameterGenerator = this.V ? this.t(this.J_) : this.L(this.J_);
        }
        catch (CustomSystemException customSystemException) {
            throw SensorDataInterpreter.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        cryptographicParameterGenerator2.R(this.Jl, this.G() + this.w() / 2.0 - cryptographicParameterGenerator2.D(this.Jl) / 2.0, this.W() + this.b() / 2.0 - cryptographicParameterGenerator2.B(this.Jl) / 2.0, this.L.k());
    }
}

