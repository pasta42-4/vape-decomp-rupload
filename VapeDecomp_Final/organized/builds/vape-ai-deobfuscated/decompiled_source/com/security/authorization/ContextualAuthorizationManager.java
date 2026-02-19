/*
 * Decompiled with CFR 0.152.
 */
package com.security.authorization;

import com.network.negotiation.SecureContextNegotiator531;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.Set;

public class ContextualAuthorizationManager
extends ObjectLifecycleTracker {
    public ContextualAuthorizationManager(Object object) {
        super(object);
    }

    public Set K() {
        return ContextualAuthorizationManager.U.u().kc.g(this.H);
    }

    public Object D(Object object) {
        return SecureContextNegotiator531.G(ContextualAuthorizationManager.U.u().kc, this.H, object);
    }
}

