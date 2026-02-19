/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.config;

import a.hQ;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.security.crypto.CipherManager;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class RenderConfigurationManager1114
extends GraphicalRenderEngine1082 {
    private boolean dJ;
    private float dV = 2.0f;
    private Color df = null;
    private ColorPaletteRenderer dz;
    private float d0 = 1.0f;

    public RenderConfigurationManager1114(double d2, double d3, Color color, Color color2) {
        super(d2, d3);
        this.Q(color);
        this.dz = new ColorPaletteRenderer(0.15, this.l(), color2);
    }

    public float u() {
        return this.d0;
    }

    private AbstractComputationKernel f(AbstractComputationKernel abstractComputationKernel) {
        ArrayList<AbstractComputationKernel> arrayList = this.H(new ArrayList<AbstractComputationKernel>(Arrays.asList(abstractComputationKernel)), 0);
        for (AbstractComputationKernel abstractComputationKernel2 : arrayList) {
            try {
                block9: {
                    try {
                        try {
                            try {
                                if (!abstractComputationKernel2.f() || !abstractComputationKernel2.s()) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RenderConfigurationManager1114.b(customSystemException);
                            }
                            if (abstractComputationKernel2 instanceof hQ) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RenderConfigurationManager1114.b(customSystemException);
                        }
                        if (!(abstractComputationKernel2 instanceof CipherManager)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RenderConfigurationManager1114.b(customSystemException);
                    }
                }
                return abstractComputationKernel2;
            }
            catch (CustomSystemException customSystemException) {
                throw RenderConfigurationManager1114.b(customSystemException);
            }
        }
        return null;
    }

    public void c(ColorPaletteRenderer colorPaletteRenderer) {
        this.dz = colorPaletteRenderer;
    }

    @Override
    public void N() {
        super.N();
    }

    @Override
    public void d() {
        super.d();
    }

    public void c(float f) {
        this.d0 = f;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void g() {
        if (!this.s()) {
            // empty if block
        }
        super.g();
    }

    public void i(float f) {
        this.dV = f;
    }

    public ColorPaletteRenderer Z() {
        return this.dz;
    }

    @Override
    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        super.S(userInteractionEventDispatcher);
    }

    public float N() {
        return this.dV;
    }

    @Override
    public void j() {
        super.j();
    }

    public void V() {
        boolean bl;
        try {
            RenderConfigurationManager1114 renderConfigurationManager1114 = this;
            bl = !this.dJ;
        }
        catch (CustomSystemException customSystemException) {
            throw RenderConfigurationManager1114.b(customSystemException);
        }
        renderConfigurationManager1114.dJ = bl;
    }

    public RenderConfigurationManager1114(double d2, double d3) {
        super(d2, d3);
        this.Q(RenderConfigurationManager1114.M.g);
        this.dz = new ColorPaletteRenderer(0.15, this.l(), new Color(36, 35, 36));
    }

    @Override
    public void o(boolean bl) {
        boolean bl2;
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        try {
            if (!this.H()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RenderConfigurationManager1114.b(customSystemException);
        }
        try {
            d5 = this.G();
            d4 = this.W();
            d3 = this.w();
            d2 = bl ? this.G5 : this.b();
        }
        catch (CustomSystemException customSystemException) {
            throw RenderConfigurationManager1114.b(customSystemException);
        }
        try {
            color = this.dJ ? RenderConfigurationManager1114.M.K : this.dz.k();
        }
        catch (CustomSystemException customSystemException) {
            throw RenderConfigurationManager1114.b(customSystemException);
        }
        try {
            bl2 = this.Q() != null;
        }
        catch (CustomSystemException customSystemException) {
            throw RenderConfigurationManager1114.b(customSystemException);
        }
        ConfigurationManager.o(d5, d4, d3, d2, color, bl2, 2.0f, 1.0f);
    }

    public Color C() {
        return this.df;
    }

    public void H(Color color) {
        this.df = color;
    }
}

