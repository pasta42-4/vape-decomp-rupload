/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.graphics.rendering.ColorPaletteRenderer;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.ui.rendering.VisualRenderContext;
import java.awt.Color;

public class h6
extends VisualRenderContext {
    private Color HJ;
    private ColorPaletteRenderer Hw;
    private float Ho;

    @Override
    public double z() {
        return 0.0;
    }

    @Override
    public void G() {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            ConfigurationManager.U(this.G(), this.W(), this.w(), this.b(), this.Hw.k(), 2.0f, this.Ho, 1.0f);
            cryptographicParameterGenerator = this.x() ? this.t(this.Ol) : this.L(this.Ol);
        }
        catch (CustomSystemException customSystemException) {
            throw h6.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        double d2 = cryptographicParameterGenerator2.B(this.OE);
        double d3 = this.W() + this.b() / 2.0 - d2 / 2.0;
        cryptographicParameterGenerator2.Q(this.OE, this.G() + this.w() / 2.0, d3, this.C());
    }

    public h6 R(Color color) {
        this.HJ = color;
        return this;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void d(float f) {
        this.Ho = f;
    }

    public h6(String string, Color color) {
        super(string);
        this.HJ = h6.M.n;
        this.Ho = 1.0f;
        this.Hw = new ColorPaletteRenderer(0.15, color, color.brighter());
    }

    @Override
    public void l(boolean bl) {
        try {
            if (this.s() != bl) {
                this.Hw.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw h6.a(customSystemException);
        }
        super.l(bl);
    }

    public AbstractComputationKernel K(Color color, Color color2) {
        this.Hw = new ColorPaletteRenderer(0.15, color, color2);
        return super.Q(color);
    }

    @Override
    public Color C() {
        return this.HJ;
    }

    @Override
    public double e() {
        return 0.0;
    }
}

