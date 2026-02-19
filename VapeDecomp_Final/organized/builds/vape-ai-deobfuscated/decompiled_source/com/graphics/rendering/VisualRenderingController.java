/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.hQ;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class VisualRenderingController
extends hQ {
    protected Color Y;
    protected double D;
    protected ColorPaletteRenderer b;

    @Override
    public void U() {
    }

    public void p(ColorPaletteRenderer colorPaletteRenderer) {
        this.b = colorPaletteRenderer;
    }

    public VisualRenderingController(double d2, double d3, Color color) {
        this(d2, d3, color, 1.0);
    }

    @Override
    public void j() {
        this.b.c();
        super.j();
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void G() {
        ConfigurationManager.U(this.G(), this.W(), this.w(), this.b(), this.b.k(), 2.0f, (float)this.D, 1.0f);
        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), new ColorCompositionEngine(this.Y).I((int)(255.0f * this.b.H())));
    }

    public ColorPaletteRenderer J() {
        return this.b;
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.b.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw VisualRenderingController.b(customSystemException);
        }
        super.g();
    }

    public void t(Color color) {
        this.Y = color;
    }

    public Color k() {
        return this.Y;
    }

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public double e() {
        return 0.0;
    }

    public VisualRenderingController(double d2, double d3, Color color, double d4) {
        this.T(d2);
        this.w(d3);
        this.Y = color;
        this.b = new ColorPaletteRenderer(0.15, new Color(45, 45, 45), color);
        this.D = d4;
    }
}

