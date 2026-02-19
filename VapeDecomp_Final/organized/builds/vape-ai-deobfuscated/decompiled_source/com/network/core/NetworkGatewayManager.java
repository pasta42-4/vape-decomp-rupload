/*
 * Decompiled with CFR 0.152.
 */
package com.network.core;

import a.Bj;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.performance.caching.CacheOptimizationStrategy;
import com.security.auth.AuthenticationTokenGenerator268;

class NetworkGatewayManager
implements Bj {
    final CacheOptimizationStrategy T;

    @Override
    public AuthenticationTokenGenerator268 h() {
        return this.T;
    }

    @Override
    public boolean I() {
        return true;
    }

    NetworkGatewayManager(CacheOptimizationStrategy cacheOptimizationStrategy) {
        this.T = cacheOptimizationStrategy;
    }

    @Override
    public void P() {
        ApplicationLifecycleManager.U().o(this.T.w());
    }
}

