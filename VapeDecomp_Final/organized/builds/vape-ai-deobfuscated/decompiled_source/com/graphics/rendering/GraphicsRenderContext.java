/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.graphics.rendering;

import com.core.computation.AbstractComputationKernel;
import com.data.obfuscation.NumericScrambler;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

public class GraphicsRenderContext
extends AbstractComputationKernel {
    private NumericScrambler v;
    private float n;
    private boolean R;
    @Nullable
    private Color b;

    public void M(NumericScrambler numericScrambler) {
        this.v = numericScrambler;
    }

    @Override
    public void G() {
        this.v.p();
        if (this.R) {
            double d2 = 4.0;
            ConfigurationManager.T((double)((float)this.G() + this.n) - d2 / 2.0, (double)((float)this.W() + this.n) - d2 / 2.0, (double)((float)this.b() - this.n) + d2, 1.0, GraphicsRenderContext.M.S);
        }
        ConfigurationManager.c((float)this.G() + this.n, (float)this.W() + this.n, (float)this.b() - this.n, 1.0f, Color.WHITE, this.v);
    }

    public void G(@Nullable Color color) {
        this.b = color;
    }

    public NumericScrambler d() {
        return this.v;
    }

    @Override
    public double e() {
        return 8.0;
    }

    @Override
    public double z() {
        return 8.0;
    }

    @Nullable
    public Color I() {
        return this.b;
    }

    public void r(float f) {
        this.n = f;
    }

    public float m() {
        return this.n;
    }

    public void Y(boolean bl) {
        this.R = bl;
    }
}

