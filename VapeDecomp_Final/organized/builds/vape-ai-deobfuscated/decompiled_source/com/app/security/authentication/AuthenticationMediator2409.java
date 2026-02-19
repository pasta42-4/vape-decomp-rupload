/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.authentication;

import com.network.monitoring.NetworkQualityMonitor;
import com.security.negotiation.SecureContextNegotiator852;
import com.system.lifecycle.ObjectLifecycleTracker;

public class AuthenticationMediator2409
extends ObjectLifecycleTracker {
    public AuthenticationMediator2409(Object object) {
        super(object);
    }

    public static void h(NetworkQualityMonitor networkQualityMonitor) {
        SecureContextNegotiator852.g(AuthenticationMediator2409.U.u().L6, networkQualityMonitor.M());
    }
}

