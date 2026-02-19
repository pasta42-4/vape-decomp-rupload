/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import a.Ya;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationProtocol2153;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.math.calculation.NumericCalculationEngine;
import com.math.geometry.GeometricCalculator;
import com.math.geometry.GeometryCalculator;
import com.security.event.SecureEventOrchestrator;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;

public class AuthenticationGateway
extends Ya
implements DataTransformationProtocol2153 {
    private boolean w = true;
    private ContextualEventDispatcher e;

    public boolean w() {
        return this.w;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AuthenticationGateway(double d2, double d3, double d4) {
        this(ContextualEventDispatcher.N(d2, d3, d4));
    }

    @Override
    public void H(SystemConfigurationOrchestrator systemConfigurationOrchestrator, SecureEventOrchestrator secureEventOrchestrator) {
        block4: {
            try {
                try {
                    if (!systemConfigurationOrchestrator.r() || !secureEventOrchestrator.Y()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuthenticationGateway.b(customSystemException);
                }
                this.l();
            }
            catch (CustomSystemException customSystemException) {
                throw AuthenticationGateway.b(customSystemException);
            }
        }
        super.H(systemConfigurationOrchestrator, secureEventOrchestrator);
    }

    @Override
    public void q(double d2, double d3, double d4) {
        this.F(ContextualEventDispatcher.N(d2, d3, d4));
    }

    public AuthenticationGateway(ContextualEventDispatcher contextualEventDispatcher) {
        super(((CryptographicTransformer)ApplicationLifecycleManager.g()).q(), ((CryptographicTransformer)ApplicationLifecycleManager.g()).S());
        this.e = contextualEventDispatcher;
        this.g(this.W(contextualEventDispatcher));
    }

    public void W(boolean bl) {
        this.w = bl;
    }

    @Override
    public ContextualEventDispatcher N() {
        return this.e;
    }

    @Override
    public void F(ContextualEventDispatcher contextualEventDispatcher) {
        this.e = contextualEventDispatcher;
    }

    public NumericCalculationEngine W(ContextualEventDispatcher contextualEventDispatcher) {
        double d2;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            d2 = GeometryCalculator.C() > GeometryCalculator.W ? (double)systemConfigurationOrchestrator.E() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationGateway.b(customSystemException);
        }
        double d3 = d2;
        ContextualEventDispatcher contextualEventDispatcher2 = ContextualEventDispatcher.N(contextualEventDispatcher.X(), contextualEventDispatcher.F(), contextualEventDispatcher.f());
        ContextualEventDispatcher contextualEventDispatcher3 = ContextualEventDispatcher.N(systemConfigurationOrchestrator.r(), systemConfigurationOrchestrator.y() + d3, systemConfigurationOrchestrator.D());
        return GeometricCalculator.l(contextualEventDispatcher3, contextualEventDispatcher2, this.A(), this.w());
    }

    public void l() {
        this.g(this.W(this.e));
    }
}

