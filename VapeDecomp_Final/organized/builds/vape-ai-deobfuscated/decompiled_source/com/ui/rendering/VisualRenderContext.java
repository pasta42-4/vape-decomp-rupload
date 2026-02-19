/*
 * Decompiled with CFR 0.152.
 */
package com.ui.rendering;

import a.hQ;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class VisualRenderContext
extends hQ {
    protected String OE;
    protected double Ol;
    private Color D;
    private boolean b;
    private static int[] Y;
    private boolean L;
    private Color Og;
    private boolean Op;
    protected boolean V = true;

    public VisualRenderContext(String string, double d2, boolean bl, double d3, double d4) {
        this.Og = VisualRenderContext.M.n;
        this.D = null;
        this.OE = string;
        this.Ol = d2;
        this.V = bl;
        this.T(d3);
        this.w(d4);
    }

    @Override
    public double e() {
        return 0.0;
    }

    public VisualRenderContext f(boolean bl) {
        this.L = bl;
        return this;
    }

    public void I(boolean bl) {
        this.V = bl;
    }

    public static int[] D() {
        return Y;
    }

    public VisualRenderContext c(Color color) {
        this.Og = color;
        return this;
    }

    @Override
    public void U() {
    }

    @Override
    public void d() {
        try {
            if (this.w() < 0.0) {
                this.T(this.d());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw VisualRenderContext.c(customSystemException);
        }
    }

    public double g() {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            cryptographicParameterGenerator = this.L ? this.t(this.Ol) : this.L(this.Ol);
        }
        catch (CustomSystemException customSystemException) {
            throw VisualRenderContext.c(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        double d2 = cryptographicParameterGenerator2.B(this.OE);
        return this.W() + this.b() / 2.0 - d2 / 2.0;
    }

    public VisualRenderContext(String string) {
        this(string, 0.9);
    }

    public void d(boolean bl) {
        this.Op = bl;
    }

    public void d(double d2) {
        this.Ol = d2;
    }

    public VisualRenderContext a(boolean bl) {
        this.b = bl;
        return this;
    }

    public Color B() {
        return this.D;
    }

    public VisualRenderContext(String string, double d2, boolean bl, Color color) {
        this(string, d2, bl);
        this.D = color;
    }

    public VisualRenderContext(String string, double d2) {
        this.Og = VisualRenderContext.M.n;
        this.D = null;
        this.OE = string;
        this.Ol = d2;
    }

    public boolean k() {
        return this.b;
    }

    @Override
    public void G() {
        double d2;
        CryptographicParameterGenerator cryptographicParameterGenerator;
        String string;
        block26: {
            Color color;
            block25: {
                block22: {
                    Color color2;
                    double d3;
                    double d4;
                    double d5;
                    double d6;
                    block24: {
                        block23: {
                            Color color3;
                            block21: {
                                block19: {
                                    block20: {
                                        CryptographicParameterGenerator cryptographicParameterGenerator2;
                                        String string2;
                                        try {
                                            string2 = this.V ? this.OE.toUpperCase() : this.OE;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw VisualRenderContext.c(customSystemException);
                                        }
                                        string = string2;
                                        try {
                                            cryptographicParameterGenerator2 = this.L ? this.t(this.Ol) : this.L(this.Ol);
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw VisualRenderContext.c(customSystemException);
                                        }
                                        cryptographicParameterGenerator = cryptographicParameterGenerator2;
                                        d2 = this.g();
                                        try {
                                            try {
                                                if (this.Og == null) break block19;
                                                if (!this.s()) break block20;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw VisualRenderContext.c(customSystemException);
                                            }
                                            color3 = this.Og.brighter();
                                            break block21;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw VisualRenderContext.c(customSystemException);
                                        }
                                    }
                                    color3 = this.Og;
                                    break block21;
                                }
                                try {
                                    color3 = this.s() ? VisualRenderContext.M.c : VisualRenderContext.M.n;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw VisualRenderContext.c(customSystemException);
                                }
                            }
                            color = color3;
                            try {
                                try {
                                    if (this.D == null) break block22;
                                    cryptographicParameterGenerator.Q(string, this.G() + this.w() / 2.0, d2, color);
                                    d6 = this.G();
                                    d5 = this.W();
                                    d4 = this.w();
                                    d3 = this.b();
                                    if (!this.s()) break block23;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw VisualRenderContext.c(customSystemException);
                                }
                                color2 = this.D.brighter();
                                break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw VisualRenderContext.c(customSystemException);
                            }
                        }
                        color2 = this.D;
                    }
                    ConfigurationManager.U(d6, d5, d4, d3, color2, 1.5f, 0.75f, 1.0f);
                    return;
                }
                try {
                    if (!this.b) break block25;
                    cryptographicParameterGenerator.Q(string, this.G() + this.w() / 2.0, d2, color);
                    break block26;
                }
                catch (CustomSystemException customSystemException) {
                    throw VisualRenderContext.c(customSystemException);
                }
            }
            cryptographicParameterGenerator.R(string, this.G(), d2, color);
        }
        try {
            if (this.Op) {
                ConfigurationManager.B(this.G(), d2 + cryptographicParameterGenerator.B(string), this.w(), VisualRenderContext.M.n);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw VisualRenderContext.c(customSystemException);
        }
    }

    public boolean W() {
        return this.V;
    }

    public Color C() {
        return this.Og;
    }

    public static void A(int[] nArray) {
        Y = nArray;
    }

    public VisualRenderContext z(String string) {
        this.OE = string;
        this.T(this.d());
        return this;
    }

    static {
        if (VisualRenderContext.D() == null) {
            VisualRenderContext.A(new int[3]);
        }
    }

    public String O() {
        return this.OE;
    }

    public VisualRenderContext(String string, double d2, boolean bl) {
        this.Og = VisualRenderContext.M.n;
        this.D = null;
        this.OE = string;
        this.Ol = d2;
        this.V = bl;
    }

    public double S() {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            cryptographicParameterGenerator = this.L ? this.t(this.Ol) : this.L(this.Ol);
        }
        catch (CustomSystemException customSystemException) {
            throw VisualRenderContext.c(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        return cryptographicParameterGenerator2.B(this.OE.toUpperCase());
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public double d() {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            cryptographicParameterGenerator = this.L ? this.t(this.Ol) : this.L(this.Ol);
        }
        catch (CustomSystemException customSystemException) {
            throw VisualRenderContext.c(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        return cryptographicParameterGenerator2.D(this.OE.toUpperCase());
    }

    public boolean D() {
        return this.Op;
    }

    public boolean x() {
        return this.L;
    }

    public void x(Color color) {
        this.D = color;
    }

    @Override
    public double z() {
        return 0.0;
    }
}

