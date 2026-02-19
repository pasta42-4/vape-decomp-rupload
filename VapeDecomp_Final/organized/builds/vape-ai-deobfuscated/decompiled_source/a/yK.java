/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.hQ;
import com.exception.system.CustomSystemException;
import com.network.protocol.ProtocolInteractionController;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class yK
extends hQ {
    private LightweightExecutionContext D;
    private boolean V;
    private double GH = 27.5;
    private Color Y;
    private int b;
    private Color L;

    @Override
    public void g() {
    }

    public yK(Color color, Color color2, LightweightExecutionContext lightweightExecutionContext) {
        this.L = color;
        this.Y = color2;
        if (lightweightExecutionContext != null) {
            try {
                if (lightweightExecutionContext.r()) {
                    this.D = lightweightExecutionContext;
                    this.b = lightweightExecutionContext.C().O();
                    this.g(lightweightExecutionContext.g());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yK.a(customSystemException);
            }
        }
    }

    public yK(Color color, Color color2, int n) {
        this.L = color;
        this.Y = color2;
        this.u(n);
    }

    public void u(int n) {
        this.b = n;
        ProtocolInteractionController protocolInteractionController = ProtocolInteractionController.Y(n);
        try {
            if (protocolInteractionController.r()) {
                this.D = LightweightExecutionContext.d(protocolInteractionController);
                this.g(this.D.g());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw yK.a(customSystemException);
        }
    }

    @Override
    public void G() {
        block7: {
            Color color;
            double d2;
            double d3;
            double d4;
            double d5;
            double d6 = this.b() / 2.0;
            try {
                if (this.V) {
                    ConfigurationManager.U(this.G() + 1.0, this.W() + 1.0, this.GH - 1.0, this.GH - 1.0, yK.M.k, 2.0f, 1.0f, 2.0f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yK.a(customSystemException);
            }
            try {
                d5 = this.G() + 1.0;
                d4 = this.W() + 1.0;
                d3 = this.GH - 2.0;
                d2 = this.GH - 2.0;
                color = this.s() ? this.Y : this.L;
            }
            catch (CustomSystemException customSystemException) {
                throw yK.a(customSystemException);
            }
            try {
                ConfigurationManager.S(d5, d4, d3, d2, color);
                if (this.D == null || !this.D.r()) break block7;
            }
            catch (CustomSystemException customSystemException) {
                throw yK.a(customSystemException);
            }
            double d7 = 1.0;
            double d8 = 8.0 * d7;
            ConfigurationManager.G(this.D, d7, this.G() + d6 - d8, this.W() + d6 - d8);
        }
    }

    public void z(LightweightExecutionContext lightweightExecutionContext) {
        block4: {
            try {
                try {
                    this.D = lightweightExecutionContext;
                    if (lightweightExecutionContext == null || !lightweightExecutionContext.r()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw yK.a(customSystemException);
                }
                this.g(lightweightExecutionContext.g());
            }
            catch (CustomSystemException customSystemException) {
                throw yK.a(customSystemException);
            }
        }
    }

    @Override
    public double e() {
        return this.GH;
    }

    public void p(boolean bl) {
        this.V = bl;
    }

    @Override
    public void U() {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double z() {
        return this.GH;
    }

    @Override
    public void d() {
    }
}

