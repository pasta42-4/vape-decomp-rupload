/*
 * Decompiled with CFR 0.152.
 */
package com.caching.strategy;

import com.data.compression.DataCompressionManager;
import com.security.session.CryptoSessionNegotiator;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.Optional;

public class CacheInvalidationStrategy
extends ObjectLifecycleTracker {
    public Optional i() {
        return (Optional)CryptoSessionNegotiator.K(CacheInvalidationStrategy.U.u().q, this.H);
    }

    public boolean x(DataCompressionManager dataCompressionManager) {
        return CryptoSessionNegotiator.l(CacheInvalidationStrategy.U.u().q, this.H, dataCompressionManager.M());
    }

    public static CacheInvalidationStrategy g(Object object) {
        return new CacheInvalidationStrategy(CryptoSessionNegotiator.C(CacheInvalidationStrategy.U.u().q, object));
    }

    public CacheInvalidationStrategy(Object object) {
        super(object);
    }

    public Object b() {
        return CryptoSessionNegotiator.Y(CacheInvalidationStrategy.U.u().q, this.H);
    }
}

