/*
 * Decompiled with CFR 0.152.
 */
package com.network.optimization;

import com.security.authentication.AuthenticationStateManager675;
import com.system.lifecycle.ObjectLifecycleTracker;

public class NetworkConnectionOptimizer
extends ObjectLifecycleTracker {
    public AuthenticationStateManager675 l() {
        return new AuthenticationStateManager675(NetworkConnectionOptimizer.U.u().kn.a(this.H));
    }

    public void e(AuthenticationStateManager675 authenticationStateManager675) {
        NetworkConnectionOptimizer.U.u().kn.z(this.H, authenticationStateManager675.M());
    }

    public NetworkConnectionOptimizer(Object object) {
        super(object);
    }
}

