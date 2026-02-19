/*
 * Decompiled with CFR 0.152.
 */
package com.app.error.handling;

import com.network.connection.NetworkConnectionInitiator;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ErrorRecoveryManager
extends ObjectLifecycleTracker {
    public ErrorRecoveryManager(Object object) {
        super(object);
    }

    public NetworkConnectionInitiator M(ReflectionUtilityBroker reflectionUtilityBroker) {
        return new NetworkConnectionInitiator(ErrorRecoveryManager.U.u().Gm.I(this.H, reflectionUtilityBroker.M()));
    }
}

