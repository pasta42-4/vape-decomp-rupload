/*
 * Decompiled with CFR 0.152.
 */
package com.app.cache;

import com.app.graphics.rendering.ColorPaletteRenderer;
import com.exception.system.CustomSystemException;
import com.graphics.theme.GraphicalThemeRenderer;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class CacheInvalidationManager1797
extends GraphicalThemeRenderer {
    private final ColorPaletteRenderer zo;

    public CacheInvalidationManager1797(String string, Color color, double d2, double d3, double d4) {
        super(string, d2, d3, d4);
        this.zo = new ColorPaletteRenderer(0.1, color, color.brighter());
    }

    @Override
    public void j() {
        this.zo.c();
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void G() {
        super.G();
        float f = (float)this.w();
        ConfigurationManager.r((float)(this.G() + this.w() / 2.0 - (double)(f / 2.0f)), (float)(this.W() + this.b() / 2.0 - (double)(f / 2.0f)), f, 1.5f, 1.0f, this.zo.k());
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.zo.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CacheInvalidationManager1797.c(customSystemException);
        }
        super.g();
    }
}

