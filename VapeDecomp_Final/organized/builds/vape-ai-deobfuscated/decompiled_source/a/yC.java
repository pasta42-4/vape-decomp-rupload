/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.hQ;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.app.workflow.StateTrackingCoordinator;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class yC
extends hQ {
    private boolean NU = false;
    private float b = 0.8f;
    private boolean NJ = false;
    @Nullable
    private Color N8;
    private double L;
    private ColorPaletteRenderer D = null;
    private float Y = 2.0f;
    private double Ni;
    private double Nj;
    private double NO;
    private String V;

    public void k(float f) {
        this.b = f;
    }

    @Override
    public double z() {
        return 0.0;
    }

    public yC(String string, double d2, double d3, double d4, double d5, @Nullable Color color, @Nullable Color color2, @Nullable Color color3) {
        Color color4;
        yC yC2;
        this.V = string;
        this.T(d4);
        this.w(d5);
        this.NO = d2;
        this.Ni = d3;
        try {
            this.H(color != null ? color : yC.M.Z);
            yC2 = this;
            color4 = color2 != null ? color2 : yC.M.q;
        }
        catch (CustomSystemException customSystemException) {
            throw yC.a(customSystemException);
        }
        yC2.R(color4);
        this.N8 = color3;
    }

    @Override
    public double e() {
        return 0.0;
    }

    public void y(double d2) {
        this.Nj = d2;
    }

    public float z() {
        return this.Y;
    }

    public void X(double d2) {
        this.Ni = d2;
    }

    public void M(@Nullable Color color) {
        this.N8 = color;
    }

    public void c(double d2) {
        this.L = d2;
    }

    public void w(boolean bl) {
        this.NU = bl;
    }

    public void u(boolean bl) {
        this.NJ = bl;
    }

    public String r() {
        return this.V;
    }

    public void Y(float f) {
        this.Y = f;
    }

    @Override
    public void G() {
        block11: {
            Color color;
            double d2;
            double d3;
            double d4;
            double d5;
            block13: {
                block12: {
                    Color color2;
                    double d6 = this.G();
                    double d7 = this.W();
                    if (this.NU) {
                        d6 += this.w() / 2.0 - this.NO / 2.0;
                    }
                    d6 += this.Nj;
                    if (this.NJ) {
                        d7 += this.b() / 2.0 - this.Ni / 2.0;
                    }
                    d7 += this.L;
                    try {
                        if (this.D != null) {
                            this.D.C(this.s());
                            ConfigurationManager.o(this.G(), this.W(), this.w(), this.b(), this.D.k(), false, this.Y, 1.0f);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw yC.a(customSystemException);
                    }
                    try {
                        color2 = this.s() ? this.y() : this.H();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw yC.a(customSystemException);
                    }
                    try {
                        try {
                            StateTrackingCoordinator.B(color2, (int)d6, (int)d7, this.V, (float)this.NO, (float)this.Ni, false);
                            if (this.N8 == null) break block11;
                            d5 = this.G();
                            d4 = this.W();
                            d3 = this.w();
                            d2 = this.b();
                            if (!this.s()) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw yC.a(customSystemException);
                        }
                        color = this.N8.brighter();
                        break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw yC.a(customSystemException);
                    }
                }
                color = this.N8;
            }
            ConfigurationManager.U(d5, d4, d3, d2, color, this.Y, this.b, 1.0f);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void x(double d2) {
        this.NO = d2;
    }

    public void H(String string) {
        this.V = string;
    }

    public void a(Color color, Color color2) {
        try {
            if (color2 == null) {
                this.D = null;
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw yC.a(customSystemException);
        }
        this.D = new ColorPaletteRenderer(0.15, color, color2);
    }
}

