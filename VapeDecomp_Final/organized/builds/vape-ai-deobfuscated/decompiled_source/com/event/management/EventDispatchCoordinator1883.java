/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.security.configuration.CryptoConfigManager;
import com.system.lifecycle.ObjectLifecycleTracker;

public class EventDispatchCoordinator1883
extends ObjectLifecycleTracker {
    public void z(Object object) {
        CryptoConfigManager.Y(EventDispatchCoordinator1883.U.u().dC, this.H, object);
    }

    public void k(Object object) {
        EventDispatchCoordinator1883.U.u().dC.E(this.H, object);
    }

    public EventDispatchCoordinator1883(Object object) {
        super(object);
    }

    public Object C() {
        return CryptoConfigManager.R(EventDispatchCoordinator1883.U.u().dC, this.H);
    }
}

