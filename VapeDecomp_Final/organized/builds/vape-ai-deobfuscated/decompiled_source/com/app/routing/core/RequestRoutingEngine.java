/*
 * Decompiled with CFR 0.152.
 */
package com.app.routing.core;

import com.app.core.compression.CompressionUtility2706;
import com.app.security.tokens.SecurityTokenGenerator2037;
import com.system.lifecycle.ObjectLifecycleTracker;

public class RequestRoutingEngine
extends ObjectLifecycleTracker {
    public SecurityTokenGenerator2037 g() {
        return new SecurityTokenGenerator2037(RequestRoutingEngine.U.u().dA.G(this.H), null);
    }

    private RequestRoutingEngine(Object object) {
        super(object);
    }

    RequestRoutingEngine(Object object, CompressionUtility2706 compressionUtility2706) {
        this(object);
    }
}

