/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.runtime.typesystem.ParametricTypeInspector;
import com.system.lifecycle.ObjectLifecycleTracker;

public class SecureAuthenticationBroker
extends ObjectLifecycleTracker {
    public SecureAuthenticationBroker Y() {
        return new SecureAuthenticationBroker(ParametricTypeInspector.O(SecureAuthenticationBroker.U.u().d2));
    }

    public SecureAuthenticationBroker l() {
        return new SecureAuthenticationBroker(ParametricTypeInspector.K(SecureAuthenticationBroker.U.u().d2));
    }

    public SecureAuthenticationBroker(Object object) {
        super(object);
    }

    public SecureAuthenticationBroker q() {
        return new SecureAuthenticationBroker(ParametricTypeInspector.H(SecureAuthenticationBroker.U.u().d2));
    }
}

