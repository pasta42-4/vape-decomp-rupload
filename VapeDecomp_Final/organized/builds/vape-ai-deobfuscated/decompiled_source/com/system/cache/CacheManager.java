/*
 * Decompiled with CFR 0.152.
 */
package com.system.cache;

import com.math.geometry.GeometryCalculator;
import com.security.authentication.AuthenticationStateManager675;
import com.system.lifecycle.ObjectLifecycleTracker;

public class CacheManager
extends ObjectLifecycleTracker {
    public AuthenticationStateManager675 j() {
        return new AuthenticationStateManager675(CacheManager.U.u().g7.N(this.H));
    }

    public String J() {
        if (GeometryCalculator.C() >= 35) {
            AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(CacheManager.U.u().g7.K(this.H));
            return authenticationStateManager675.i();
        }
        return CacheManager.U.u().g7.R(this.H);
    }

    public CacheManager(Object object) {
        super(object);
    }

    public boolean d() {
        return CacheManager.U.u().g7.a(this.H);
    }
}

