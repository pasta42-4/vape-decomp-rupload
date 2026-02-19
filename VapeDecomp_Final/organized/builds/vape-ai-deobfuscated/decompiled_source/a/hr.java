/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import com.app.graphics.rendering.ColorPaletteRenderer;
import com.core.computation.AbstractComputationKernel;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.ui.rendering.VisualRenderContext;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hr
extends VisualRenderContext {
    public static final float yl = 2.0f;
    private ColorPaletteRenderer y2;
    private Color yG;
    private float yY;
    private float yp;
    private Color yk;
    private float yf;
    private Color yX;
    @Nullable
    private String yJ;
    public static final float yN = 1.0f;
    private ColorPaletteRenderer y4;
    private boolean yC;
    private boolean ys;

    public hr Q(Color color, Color color2) {
        this.yX = color;
        this.y2 = new ColorPaletteRenderer(0.0375, color2, this.y2.Q());
        return this;
    }

    public ColorPaletteRenderer a() {
        return this.y2;
    }

    @Override
    public Color C() {
        Color color;
        try {
            color = this.yC ? this.y4.k() : this.yk;
        }
        catch (CustomSystemException customSystemException) {
            throw hr.a(customSystemException);
        }
        return color;
    }

    @Override
    public void G() {
        Color color;
        float f;
        double d2;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        block16: {
            block15: {
                try {
                    if (!this.H()) break block15;
                    ConfigurationManager.C(this.G(), this.W(), this.w(), this.b(), this.y2.k(), this.yp);
                    break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw hr.a(customSystemException);
                }
            }
            try {
                if (this.s()) {
                    ConfigurationManager.C(this.G(), this.W(), this.w(), this.b(), new Color(100, 100, 100, 10), this.yp);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw hr.a(customSystemException);
            }
        }
        try {
            if (this.yX != null) {
                ConfigurationManager.U(this.G(), this.W(), this.w(), this.b(), this.yX, this.yp, this.yY, 1.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw hr.a(customSystemException);
        }
        try {
            cryptographicParameterGenerator = this.x() ? this.t(this.Ol) : this.L(this.Ol);
        }
        catch (CustomSystemException customSystemException) {
            throw hr.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        double d3 = cryptographicParameterGenerator2.B(this.OE);
        try {
            d2 = this.G() + this.w() / 2.0;
            f = this.yJ != null ? this.yf / 2.0f : 0.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw hr.a(customSystemException);
        }
        double d4 = d2 + (double)f;
        double d5 = this.W() + this.b() / 2.0 - d3 / 2.0 + 0.5;
        try {
            color = this.ys ? EventDispatchCoordinator1159.Q(this.y2.k(), 70, 240) : this.C();
        }
        catch (CustomSystemException customSystemException) {
            throw hr.a(customSystemException);
        }
        Color color2 = color;
        cryptographicParameterGenerator2.Q(this.OE, d4, d5, color2);
        if (this.yJ != null) {
            float f2 = this.yf;
            double d6 = this.G() + this.w() / 2.0 - cryptographicParameterGenerator2.D(this.OE) / 2.0 - (double)(f2 / 2.0f);
            ConfigurationManager.x(this.yJ, d6, this.W() + this.b() / 2.0, f2, f2, color2);
        }
    }

    public void P(Color color) {
        this.yG = color;
        this.y4 = new ColorPaletteRenderer(0.0375, this.yk, color);
    }

    @Override
    public void l(boolean bl) {
        try {
            if (this.s() != bl) {
                this.y2.c();
                this.y4.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw hr.a(customSystemException);
        }
        super.l(bl);
    }

    public hr I(Color color) {
        this.yX = color;
        this.y2 = new ColorPaletteRenderer(0.0375, new Color(0, 0, 0, 0), this.y2.Q());
        return this;
    }

    public void q(boolean bl) {
        this.ys = bl;
    }

    public hr(String string, double d2, Color color, Color color2) {
        this(string, d2, color, color2, null, 2.0f, 1.0f, 0.0, 0.0);
    }

    @Override
    public double e() {
        return 0.0;
    }

    public hr(String string, Color color) {
        this(string, 0.9, null, color, null, 2.0f, 1.0f, 0.0, 0.0);
    }

    @Override
    public double z() {
        return 0.0;
    }

    public hr(String string, double d2, Color color, Color color2, Color color3, float f, float f2) {
        this(string, d2, color, color2, color3, f, f2, 0.0, 0.0);
    }

    public void u(float f) {
        this.yp = f;
    }

    public void G(boolean bl) {
        this.yC = bl;
    }

    public void G(float f) {
        this.yY = f;
    }

    public AbstractComputationKernel Q(Color color, Color color2) {
        this.y2 = new ColorPaletteRenderer(0.0375, color, color2);
        return super.Q(color);
    }

    public void N(String string) {
        this.yJ = string;
    }

    public hr A(Color color) {
        this.yk = color;
        this.y4 = new ColorPaletteRenderer(0.0375, color, this.yG);
        return this;
    }

    public hr(String string, double d2, Color color, Color color2, double d3, double d4) {
        this(string, d2, color, color2, null, 2.0f, 1.0f, d3, d4);
    }

    public hr(String string, Color color, Color color2) {
        this(string, 0.9, color, color2, null, 2.0f, 1.0f, 0.0, 0.0);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public hr(String string, double d2, Color color) {
        this(string, d2, null, color, null, 2.0f, 1.0f, 0.0, 0.0);
    }

    public void W(float f) {
        this.yf = f;
    }

    public hr(String string, double d2, Color color, Color color2, Color color3, float f, float f2, double d3, double d4) {
        block11: {
            super(string, d2);
            this.yk = hr.M.n;
            this.yG = hr.M.n;
            this.yX = null;
            this.yY = 1.0f;
            this.yp = 2.0f;
            this.ys = true;
            this.yf = 8.0f;
            this.yC = false;
            if (color != null) {
                this.Q(color);
            }
            try {
                try {
                    this.y2 = new ColorPaletteRenderer(0.0375, this.l(), color2);
                    this.y4 = new ColorPaletteRenderer(0.0375, this.yk, this.yG);
                    if (color3 == null || color == null) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw hr.a(customSystemException);
                }
                this.Q(color3, color);
            }
            catch (CustomSystemException customSystemException) {
                throw hr.a(customSystemException);
            }
        }
        try {
            this.yp = f;
            this.yY = f2;
            if (d3 != 0.0) {
                this.T(d3);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw hr.a(customSystemException);
        }
        try {
            if (d4 != 0.0) {
                this.w(d4);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw hr.a(customSystemException);
        }
    }
}

