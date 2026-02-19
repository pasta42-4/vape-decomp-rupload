/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.app.core.interfaces.OperationExecutionInterface;
import com.network.protocol.NetworkProtocolDispatcher;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.AdaptiveConfigEngine;
import java.util.List;

class SecurityTokenValidator2093
implements OperationExecutionInterface {
    final List n;
    final NetworkProtocolDispatcher J;
    final int P;

    @Override
    public void R() {
        AdaptiveConfigEngine adaptiveConfigEngine = AdaptiveConfigEngine.A((LightweightExecutionContext)this.n.get(this.P));
        NetworkProtocolDispatcher.S(this.J).m().J().set(NetworkProtocolDispatcher.S(this.J).n(), adaptiveConfigEngine);
    }

    SecurityTokenValidator2093(NetworkProtocolDispatcher networkProtocolDispatcher, List list, int n) {
        this.J = networkProtocolDispatcher;
        this.n = list;
        this.P = n;
    }
}

