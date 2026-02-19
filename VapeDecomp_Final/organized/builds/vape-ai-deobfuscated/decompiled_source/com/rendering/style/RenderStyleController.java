/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.rendering.style;

import com.app.concurrency.synchronization.ThreadSynchronizationHandler;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.graphics.theme.GraphicalThemeRenderer;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

public class RenderStyleController
extends GraphicalThemeRenderer {
    private float kX = 1.5f;
    private boolean kf;
    @Nullable
    private Color kR;
    private boolean kK;
    private float kv = 1.0f;
    private ColorPaletteRenderer kP;

    public float B() {
        return this.kX;
    }

    public void v(boolean bl) {
        this.kK = bl;
    }

    public void b(@Nullable Color color) {
        this.kR = color;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ColorPaletteRenderer b() {
        return this.kP;
    }

    public void U(boolean bl) {
        this.kf = bl;
    }

    @Nullable
    public Color E() {
        return this.kR;
    }

    public RenderStyleController(String string, double d2, Color color) {
        this(string, d2, null, color);
    }

    public RenderStyleController(String string, Color color) {
        this(string, 1.0, color);
    }

    public void b(float f) {
        this.kX = f;
    }

    public float I() {
        return this.kv;
    }

    public RenderStyleController(String string) {
        super(string);
        this.kP = new ThreadSynchronizationHandler(0.15, this.l());
    }

    public RenderStyleController(String string, double d2, Color color, Color color2) {
        super(string, d2);
        this.kP = new ColorPaletteRenderer(0.15, color == null ? this.l() : color, color2);
    }

    public void l(float f) {
        this.kv = f;
    }

    @Override
    public void G() {
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        block11: {
            block10: {
                double d6;
                block8: {
                    block9: {
                        d6 = 1.0;
                        try {
                            try {
                                if (!this.kf || !this.s()) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RenderStyleController.a(customSystemException);
                            }
                            if (!this.kK) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RenderStyleController.a(customSystemException);
                        }
                        d6 = 0.9;
                        break block8;
                    }
                    d6 = 0.5;
                }
                try {
                    if (!this.s() && !this.kK) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderStyleController.a(customSystemException);
                }
                Color color2 = this.kP.k();
                color2 = EventDispatchCoordinator1159.y(color2, (int)(d6 * 255.0));
                ConfigurationManager.S(this.G() + 0.5, this.W() + 0.5, this.w() - 1.0, this.b() - 1.0, color2);
                break block11;
            }
            ConfigurationManager.S(this.G() + 0.5, this.W() + 0.5, this.w() - 1.0, this.b() - 1.0, this.l());
        }
        try {
            d5 = this.G();
            d4 = this.W();
            d3 = this.w();
            d2 = this.b();
            color = this.kR != null ? this.kR : RenderStyleController.M.S;
        }
        catch (CustomSystemException customSystemException) {
            throw RenderStyleController.a(customSystemException);
        }
        ConfigurationManager.U(d5, d4, d3, d2, color, this.kX, this.kv, 1.0f);
        super.G();
    }

    @Override
    public void l(boolean bl) {
        block4: {
            try {
                try {
                    if (this.s() == bl || this.kK) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw RenderStyleController.a(customSystemException);
                }
                this.kP.c();
            }
            catch (CustomSystemException customSystemException) {
                throw RenderStyleController.a(customSystemException);
            }
        }
        super.l(bl);
    }
}

