/*
 * Decompiled with CFR 0.152.
 */
package com.state.management;

import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometricCalculator1575;
import com.reflection.metadata.ReflectionMetadataExtractor1376;
import com.runtime.mediation.RuntimeContextMediator;
import com.security.constants.CipherConfigurationMode;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;

public class ContextualStateManager
extends AbstractComputationKernel {
    private boolean b;
    private float n;
    private ReflectionMetadataExtractor1376 F;
    private boolean D;
    private CipherSessionManager Y = null;
    private String R;

    @Override
    public double z() {
        return 26.0;
    }

    public void l() {
        block13: {
            GeometricCalculator1575 geometricCalculator1575;
            block12: {
                try {
                    if (this.Y == null) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualStateManager.a(customSystemException);
                }
                this.Y.N(this.b);
                this.Y.s(true);
                this.Y.R();
                geometricCalculator1575 = ApplicationLifecycleManager.P();
                try {
                    try {
                        if (!(this.Y.W() > (double)geometricCalculator1575.Z()) && !(this.Y.W() < 0.0)) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualStateManager.a(customSystemException);
                    }
                    this.Y.M(geometricCalculator1575.Z() / 2);
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualStateManager.a(customSystemException);
                }
            }
            try {
                try {
                    if (!(this.Y.G() > (double)geometricCalculator1575.s()) && !(this.Y.G() < 0.0)) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualStateManager.a(customSystemException);
                }
                this.Y.b(geometricCalculator1575.s() / 2);
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualStateManager.a(customSystemException);
            }
        }
        if (this.Y instanceof RuntimeContextMediator) {
            RuntimeContextMediator runtimeContextMediator = (RuntimeContextMediator)this.Y;
            runtimeContextMediator.z();
            runtimeContextMediator.V().N(false);
        }
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        try {
            if (userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.LEFT_CLICK)) {
                this.y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualStateManager.a(customSystemException);
        }
    }

    @Override
    public void g() {
        this.D = true;
    }

    public ContextualStateManager y(CipherSessionManager cipherSessionManager) {
        this.Y = cipherSessionManager;
        return this;
    }

    @Override
    public void U() {
    }

    @Override
    public void G() {
        Color color;
        double d2;
        double d3;
        double d4;
        double d5;
        String string;
        block11: {
            block10: {
                Color color2;
                double d6;
                double d7;
                double d8;
                double d9;
                block9: {
                    block8: {
                        try {
                            d9 = this.G() + 5.0;
                            d8 = this.W();
                            d7 = this.w() - 3.0;
                            d6 = this.b() - 3.0;
                            if (!this.b) break block8;
                            color2 = M.j();
                            break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ContextualStateManager.a(customSystemException);
                        }
                    }
                    try {
                        color2 = this.D ? ContextualStateManager.M.S : ContextualStateManager.M.g;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualStateManager.a(customSystemException);
                    }
                }
                try {
                    try {
                        ConfigurationManager.S(d9, d8, d7, d6, color2);
                        string = this.R;
                        d5 = this.G() + this.w() / 2.0 + 3.0;
                        d4 = this.W() + this.b() / 2.0 - 2.0;
                        d3 = 8.0f * this.n;
                        d2 = 8.0f * this.n;
                        if (!this.b && !this.D) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualStateManager.a(customSystemException);
                    }
                    color = ContextualStateManager.M.q;
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualStateManager.a(customSystemException);
                }
            }
            color = ContextualStateManager.M.Z;
        }
        ConfigurationManager.x(string, d5, d4, d3, d2, color);
    }

    @Override
    public double e() {
        return 26.0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ContextualStateManager(ReflectionMetadataExtractor1376 reflectionMetadataExtractor1376) {
        this(reflectionMetadataExtractor1376, 1.0f);
    }

    private void D() {
        try {
            if (this.F.Z() != this.b) {
                this.y();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualStateManager.a(customSystemException);
        }
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    if (!this.D || this.s()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualStateManager.a(customSystemException);
                }
                this.D = false;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualStateManager.a(customSystemException);
            }
        }
        this.D();
    }

    public ContextualStateManager(ReflectionMetadataExtractor1376 reflectionMetadataExtractor1376, float f) {
        this.F = reflectionMetadataExtractor1376;
        this.R = reflectionMetadataExtractor1376.R();
        this.b = reflectionMetadataExtractor1376.Z();
        this.n = f;
    }

    private void y() {
        boolean bl;
        try {
            ContextualStateManager contextualStateManager = this;
            bl = !this.b;
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualStateManager.a(customSystemException);
        }
        try {
            contextualStateManager.b = bl;
            this.F.T(this.b);
            if (this.Y != null) {
                this.l();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualStateManager.a(customSystemException);
        }
    }
}

