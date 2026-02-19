/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.styling;

import a.hQ;
import com.app.concurrency.synchronization.ThreadSynchronizationHandler;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.validation.temporal.TimestampValidator;
import java.awt.Color;

public class GraphicalStyleRenderer
extends hQ {
    private boolean b;
    private double Y;
    private String q2;
    private String qI;
    private double D;
    private Color qe;
    private TimestampValidator<Color> qQ = new ThreadSynchronizationHandler(0.15, new Color(0, 0, 0, 0));
    private boolean qj;
    private Color qp;
    private boolean L;
    private boolean qD = true;
    private double V;
    private boolean qb;
    private Color q0;

    public GraphicalStyleRenderer(String string, boolean bl, boolean bl2, double d2, Color color, String string2, double d3, Color color2, Color color3) {
        this.qI = string;
        this.b = bl;
        this.qj = bl2;
        this.Y = d2;
        this.q0 = color;
        if (color == null) {
            this.q0 = GraphicalStyleRenderer.M.n;
        }
        try {
            if (this.q0.equals(M.j())) {
                this.qb = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalStyleRenderer.a(customSystemException);
        }
        try {
            this.q2 = string2;
            this.V = d3;
            this.qp = color2;
            if (color2 == null) {
                this.qp = GraphicalStyleRenderer.M.Z;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalStyleRenderer.a(customSystemException);
        }
        try {
            if (this.qp.equals(M.j())) {
                this.L = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalStyleRenderer.a(customSystemException);
        }
        this.qe = color3;
        this.w(20.0);
    }

    @Override
    public double z() {
        return 0.0;
    }

    public void k(double d2) {
        this.D = d2;
    }

    @Override
    public void G() {
        block40: {
            Color color;
            double d2;
            double d3;
            double d4;
            double d5;
            block42: {
                block41: {
                    block34: {
                        Color color2;
                        double d6;
                        CryptographicParameterGenerator cryptographicParameterGenerator;
                        block37: {
                            Color color3;
                            block39: {
                                block38: {
                                    Color color4;
                                    block36: {
                                        block35: {
                                            Color color5;
                                            float f;
                                            block31: {
                                                Color color6;
                                                block33: {
                                                    block32: {
                                                        Color color7;
                                                        block30: {
                                                            block29: {
                                                                block28: {
                                                                    CryptographicParameterGenerator cryptographicParameterGenerator2;
                                                                    try {
                                                                        cryptographicParameterGenerator2 = this.qj ? this.t(this.Y) : this.L(this.Y);
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GraphicalStyleRenderer.a(customSystemException);
                                                                    }
                                                                    cryptographicParameterGenerator = cryptographicParameterGenerator2;
                                                                    f = 8.0f * (float)this.V;
                                                                    d6 = this.G() + (double)(f / 2.0f) + 5.0 + this.D + this.J() - 5.0;
                                                                    try {
                                                                        try {
                                                                            if (!this.s() || !this.qD) break block28;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw GraphicalStyleRenderer.a(customSystemException);
                                                                        }
                                                                        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), M.j());
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw GraphicalStyleRenderer.a(customSystemException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (!this.s()) break block29;
                                                                    color7 = M.X();
                                                                    break block30;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw GraphicalStyleRenderer.a(customSystemException);
                                                                }
                                                            }
                                                            try {
                                                                color7 = this.L ? M.j() : this.qp;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw GraphicalStyleRenderer.a(customSystemException);
                                                            }
                                                        }
                                                        color5 = color7;
                                                        try {
                                                            try {
                                                                if (this.qD) break block31;
                                                                if (!this.s()) break block32;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw GraphicalStyleRenderer.a(customSystemException);
                                                            }
                                                            color6 = this.qp.brighter();
                                                            break block33;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw GraphicalStyleRenderer.a(customSystemException);
                                                        }
                                                    }
                                                    color6 = this.qp;
                                                }
                                                color5 = color6;
                                            }
                                            ConfigurationManager.x(this.q2, d6, this.W() + this.b() / 2.0, f, f, color5);
                                            d6 += 3.3333333333333335 + (double)(f / 2.0f);
                                            try {
                                                try {
                                                    if (this.q0 == null) break block34;
                                                    if (!this.s()) break block35;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw GraphicalStyleRenderer.a(customSystemException);
                                                }
                                                color4 = M.X();
                                                break block36;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw GraphicalStyleRenderer.a(customSystemException);
                                            }
                                        }
                                        try {
                                            color4 = this.qb ? M.j() : this.q0;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalStyleRenderer.a(customSystemException);
                                        }
                                    }
                                    color2 = color4;
                                    try {
                                        try {
                                            if (this.qD) break block37;
                                            if (!this.s()) break block38;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalStyleRenderer.a(customSystemException);
                                        }
                                        color3 = this.q0.brighter();
                                        break block39;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalStyleRenderer.a(customSystemException);
                                    }
                                }
                                color3 = this.q0;
                            }
                            color2 = color3;
                        }
                        this.r(cryptographicParameterGenerator, d6, color2);
                    }
                    try {
                        try {
                            if (this.qe == null) break block40;
                            d5 = this.G();
                            d4 = this.W();
                            d3 = this.w();
                            d2 = this.b();
                            if (!this.s()) break block41;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalStyleRenderer.a(customSystemException);
                        }
                        color = this.qe.brighter();
                        break block42;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalStyleRenderer.a(customSystemException);
                    }
                }
                color = this.qe;
            }
            ConfigurationManager.U(d5, d4, d3, d2, color, 1.5f, 0.75f, 1.0f);
        }
    }

    @Override
    public double e() {
        return 0.0;
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.qQ.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalStyleRenderer.a(customSystemException);
        }
        super.g();
    }

    @Override
    public void d() {
        block6: {
            String string;
            CryptographicParameterGenerator cryptographicParameterGenerator;
            double d2;
            GraphicalStyleRenderer graphicalStyleRenderer;
            block8: {
                block7: {
                    try {
                        try {
                            if (!(this.w() <= 0.0)) break block6;
                            graphicalStyleRenderer = this;
                            d2 = 8.0 * this.V;
                            if (!this.qj) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalStyleRenderer.a(customSystemException);
                        }
                        cryptographicParameterGenerator = this.t(this.Y);
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalStyleRenderer.a(customSystemException);
                    }
                }
                cryptographicParameterGenerator = this.L(this.Y);
            }
            try {
                string = this.b ? this.qI.toUpperCase() : this.qI;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalStyleRenderer.a(customSystemException);
            }
            graphicalStyleRenderer.T(d2 + cryptographicParameterGenerator.D(string) + 13.75);
        }
    }

    public void H(boolean bl) {
        this.qD = bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void E(double d2) {
        this.V = d2;
    }

    public void j(double d2) {
        this.Y = d2;
    }

    @Override
    public void j() {
        this.qQ.c();
        super.j();
    }

    private void r(CryptographicParameterGenerator cryptographicParameterGenerator, double d2, Color color) {
        String string;
        try {
            string = this.b ? this.qI.toUpperCase() : this.qI;
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalStyleRenderer.a(customSystemException);
        }
        String string2 = string;
        double d3 = cryptographicParameterGenerator.B(string2);
        double d4 = this.W() + this.b() / 2.0 - d3 / 2.0;
        cryptographicParameterGenerator.R(string2, d2, d4, color);
    }
}

