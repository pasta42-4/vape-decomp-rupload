/*
 * Decompiled with CFR 0.152.
 */
package com.app.resource.allocation;

import a.Sc;
import a.fN;
import a.ff;
import a.vM;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.exception.system.CustomSystemException;
import com.messaging.security.SecureMessageBroker2609;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

class ResourceAllocationCoordinator1203
extends SecureMessageBroker2609 {
    private final ff B;
    private final vM R;
    private final ColorPaletteRenderer Y;
    final fN L;
    private final ColorPaletteRenderer b;
    private final Sc V;

    @Override
    public void I() {
        Color color;
        ColorPaletteRenderer colorPaletteRenderer;
        Color color2;
        ColorPaletteRenderer colorPaletteRenderer2;
        try {
            colorPaletteRenderer2 = this.Y;
            color2 = this.R.A().T() ? ResourceAllocationCoordinator1203.M.E : ResourceAllocationCoordinator1203.M.S;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationCoordinator1203.a(customSystemException);
        }
        try {
            colorPaletteRenderer2.B(color2);
            colorPaletteRenderer = this.Y;
            color = this.R.A().T() ? ResourceAllocationCoordinator1203.M.S : ResourceAllocationCoordinator1203.M.k;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationCoordinator1203.a(customSystemException);
        }
        colorPaletteRenderer.O(color);
    }

    ResourceAllocationCoordinator1203(fN fN2, Sc sc, vM vM2) {
        this.L = fN2;
        this.Y = new ColorPaletteRenderer(0.15, new Color(0, 0, 0, 0), ResourceAllocationCoordinator1203.M.S);
        this.b = new ColorPaletteRenderer(0.15, new Color(0, 0, 0, 0), ResourceAllocationCoordinator1203.M.K);
        this.V = sc;
        this.R = vM2;
        this.B = new ff(vM2);
        this.B.h(true);
        this.I();
        this.n(true);
        this.o(this.B);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void j() {
        this.Y.c();
        this.b.c();
    }

    @Override
    public double z() {
        return 32.0;
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.Y.c();
                this.b.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationCoordinator1203.a(customSystemException);
        }
    }

    @Override
    public void G() {
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        boolean bl = this.R.A().T();
        try {
            d5 = this.G() + 1.0;
            d4 = this.W() + 1.0;
            d3 = this.w() - 2.0;
            d2 = this.b() - 2.0;
            color = bl ? new Color(0, 0, 0, 127) : ResourceAllocationCoordinator1203.M.g;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationCoordinator1203.a(customSystemException);
        }
        ConfigurationManager.C(d5, d4, d3, d2, color, 2.0f);
        ConfigurationManager.U(this.G(), this.W(), this.w(), this.b(), this.Y.k(), 4.0f, 1.0f, 1.0f);
        this.B.b(this.G());
        this.B.M(this.W());
        this.B.T(this.w());
        this.B.w(this.b());
        if (!bl) {
            double d6 = 1.5;
            ConfigurationManager.T(this.G() + this.w() / 2.0 - 0.75, this.W() + this.b() - 4.0, 1.5, 1.0, this.b.k());
            ConfigurationManager.T(this.G() + this.w() / 2.0 - 0.75 - 3.0, this.W() + this.b() - 4.0, 1.5, 1.0, this.b.k());
            ConfigurationManager.T(this.G() + this.w() / 2.0 - 0.75 + 3.0, this.W() + this.b() - 4.0, 1.5, 1.0, this.b.k());
        }
    }

    @Override
    public double e() {
        return 32.0;
    }
}

