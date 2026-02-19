/*
 * Decompiled with CFR 0.152.
 */
package com.app.ui;

import com.messaging.queue.QueueManagementService2545;
import com.network.protocol.NetworkProtocolNegotiator;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.system.lifecycle.ObjectLifecycleTracker;

public class UserInteractionManager
extends ObjectLifecycleTracker {
    public boolean F() {
        return UserInteractionManager.U.u().k2.Y(this.H);
    }

    public float c(NetworkProtocolNegotiator networkProtocolNegotiator, ReflectionUtilityBroker reflectionUtilityBroker) {
        return UserInteractionManager.U.u().k2.r(this.M(), networkProtocolNegotiator.M(), reflectionUtilityBroker.M());
    }

    public QueueManagementService2545 v() {
        return new QueueManagementService2545(UserInteractionManager.U.u().k2.Y(this.H));
    }

    public UserInteractionManager(Object object) {
        super(object);
    }

    public boolean b(Object object) {
        return UserInteractionManager.U.u().k2.T(this.M(), object);
    }
}

