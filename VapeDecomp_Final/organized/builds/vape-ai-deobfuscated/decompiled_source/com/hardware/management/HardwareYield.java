/*
 * Decompiled with CFR 0.152.
 */
package com.hardware.management;

import com.app.graphics.rendering.ColorPaletteRenderer;
import com.exception.system.CustomSystemException;
import com.graphics.theme.GraphicalThemeRenderer;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class HardwareYield
extends GraphicalThemeRenderer {
    private final ColorPaletteRenderer II;

    public HardwareYield(String string, double d2, Color color, Color color2, double d3, double d4) {
        super(string, d2, d3, d4);
        this.II = new ColorPaletteRenderer(0.1, color, color2);
    }

    public HardwareYield(String string, double d2) {
        this(string, d2, new Color(0, 0, 0, 0), HardwareYield.M.w, 8.0, 8.0);
    }

    @Override
    public void G() {
        float f = (float)(this.w() * (double)((float)this.D));
        ConfigurationManager.T(this.G() + this.w() / 2.0 - (double)(f / 2.0f), this.W() + this.b() / 2.0 - (double)(f / 2.0f), (double)f, 1.0, this.II.k());
        super.G();
    }

    @Override
    public void j() {
        this.II.c();
        super.j();
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.II.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw HardwareYield.a(customSystemException);
        }
        super.g();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public HardwareYield(String string) {
        this(string, 1.0);
    }
}

