/*
 * Decompiled with CFR 0.152.
 */
package com.performance.caching;

import a.Bj;
import com.network.core.NetworkGatewayManager;
import com.security.auth.AuthenticationTokenGenerator268;

public class CacheOptimizationStrategy
extends AuthenticationTokenGenerator268 {
    @Override
    public Bj K() {
        return new NetworkGatewayManager(this);
    }

    public CacheOptimizationStrategy(String string) {
        super(string);
    }
}

