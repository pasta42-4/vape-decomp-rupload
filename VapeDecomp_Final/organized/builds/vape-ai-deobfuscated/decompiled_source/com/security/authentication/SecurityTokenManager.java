/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import a.Sc;
import a.ff;
import com.app.graphics.rendering.ColorPaletteRenderer;
import com.concurrency.task.AsynchronousTaskOrchestrator;
import com.exception.system.CustomSystemException;
import com.messaging.security.SecureMessageBroker2609;
import com.system.configuration.ConfigurationManager;
import com.utils.reflection.ReflectionUtilityResolver;
import java.awt.Color;

class SecurityTokenManager
extends SecureMessageBroker2609 {
    final AsynchronousTaskOrchestrator V;
    private final ColorPaletteRenderer b;
    private final ff D;
    private final ColorPaletteRenderer F;

    @Override
    public void G() {
        ConfigurationManager.C(this.G(), this.W(), this.w(), this.b(), this.b.k(), (float)(this.w() / 2.0));
        ConfigurationManager.C(this.G() + 1.0, this.W() + 1.0, this.w() - 2.0, this.b() - 2.0, this.F.k(), (float)(this.w() / 2.0) - 2.0f);
        this.D.b(this.G());
        this.D.M(this.W());
        this.D.T(this.w());
        this.D.w(this.b());
    }

    @Override
    public void j() {
        this.b.c();
        this.F.c();
    }

    @Override
    public void I() {
        this.b.B(SecurityTokenManager.M.S);
        this.b.O(SecurityTokenManager.M.S.brighter());
        this.F.B(SecurityTokenManager.M.a);
        this.F.O(SecurityTokenManager.M.L);
    }

    @Override
    public void g() {
        try {
            if (!this.s()) {
                this.b.c();
                this.F.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenManager.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double e() {
        return 32.0;
    }

    @Override
    public double z() {
        return 32.0;
    }

    public SecurityTokenManager(AsynchronousTaskOrchestrator asynchronousTaskOrchestrator, Sc sc, ReflectionUtilityResolver reflectionUtilityResolver) {
        this.V = asynchronousTaskOrchestrator;
        this.b = new ColorPaletteRenderer(0.15, new Color(0, 0, 0, 0), SecurityTokenManager.M.S);
        this.F = new ColorPaletteRenderer(0.15, new Color(0, 0, 0, 0), SecurityTokenManager.M.S);
        this.D = new ff(reflectionUtilityResolver);
        this.I();
        this.n(true);
        this.o(this.D);
    }
}

