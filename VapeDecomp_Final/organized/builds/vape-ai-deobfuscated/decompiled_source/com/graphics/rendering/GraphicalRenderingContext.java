/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.ui.rendering.VisualRenderContext;
import java.awt.Color;

public class GraphicalRenderingContext
extends VisualRenderContext {
    private Color D7;

    @Override
    public double z() {
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(this.Ol);
        return cryptographicParameterGenerator.B(this.OE);
    }

    public GraphicalRenderingContext(String string, double d2, Color color, Color color2) {
        super(string, d2);
        this.D7 = GraphicalRenderingContext.M.n;
        this.c(color);
        this.D7 = color2;
    }

    @Override
    public void G() {
        Color color;
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(this.Ol);
        double d2 = cryptographicParameterGenerator.B(this.OE);
        double d3 = cryptographicParameterGenerator.D(this.OE) + 1.0;
        double d4 = this.G() + this.w() / 2.0;
        double d5 = this.W() + this.b() / 2.0 - d2 / 2.0;
        try {
            color = this.s() ? this.C().brighter() : this.C();
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingContext.a(customSystemException);
        }
        Color color2 = color;
        cryptographicParameterGenerator.Q(this.OE, d4, d5, color2);
        int n = 0;
        try {
            while ((double)n < d3) {
                ConfigurationManager.T((double)((int)(d4 - d3 / 2.0) + n + 1), (double)((int)(d5 + d2)), 0.25, 1.0, color2);
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingContext.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public GraphicalRenderingContext(String string) {
        super(string);
        this.D7 = GraphicalRenderingContext.M.n;
    }

    public Color P() {
        return this.D7;
    }

    public GraphicalRenderingContext(String string, double d2, Color color) {
        super(string, d2);
        this.D7 = GraphicalRenderingContext.M.n;
        this.c(color);
        this.D7 = color;
    }

    public GraphicalRenderingContext(String string, double d2) {
        super(string, d2);
        this.D7 = GraphicalRenderingContext.M.n;
    }

    @Override
    public double e() {
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(this.Ol);
        return cryptographicParameterGenerator.D(this.OE);
    }
}

