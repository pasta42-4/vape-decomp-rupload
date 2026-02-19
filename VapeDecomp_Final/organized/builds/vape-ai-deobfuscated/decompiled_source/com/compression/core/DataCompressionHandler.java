/*
 * Decompiled with CFR 0.152.
 */
package com.compression.core;

import com.app.error.handling.ErrorRecoveryManager;
import com.event.core.EventDispatcher;
import com.event.management.ContextualEventDispatcher;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.AdaptiveConfigurationResolver;
import com.system.lifecycle.ObjectLifecycleTracker;

public class DataCompressionHandler
extends ObjectLifecycleTracker {
    public DataCompressionHandler(Object object) {
        super(object);
    }

    public float S() {
        return AdaptiveConfigurationResolver.g(DataCompressionHandler.U.u().Gz, this.H);
    }

    public float B() {
        return AdaptiveConfigurationResolver.B(DataCompressionHandler.U.u().Gz, this.H);
    }

    public CryptographicTransformer e() {
        return new CryptographicTransformer(AdaptiveConfigurationResolver.Z(DataCompressionHandler.U.u().Gz, this.H));
    }

    public EventDispatcher d() {
        return new EventDispatcher(AdaptiveConfigurationResolver.C(DataCompressionHandler.U.u().Gz, this.H));
    }

    public ContextualEventDispatcher w() {
        return new ContextualEventDispatcher(AdaptiveConfigurationResolver.B(DataCompressionHandler.U.u().Gz, this.H));
    }

    public ErrorRecoveryManager h() {
        return new ErrorRecoveryManager(AdaptiveConfigurationResolver.b(DataCompressionHandler.U.u().Gz, this.H));
    }
}

