/*
 * Decompiled with CFR 0.152.
 */
package com.system.config;

import com.event.management.ContextualEventDispatcher;
import com.system.lifecycle.ObjectLifecycleTracker;

public class SystemConfigurationManager
extends ObjectLifecycleTracker {
    public void W(float f) {
        SystemConfigurationManager.U.u().dz.v(this.H, f);
    }

    public SystemConfigurationManager(Object object) {
        super(object);
    }

    public float X() {
        return SystemConfigurationManager.U.u().dz.u(this.H);
    }

    public void A(float f) {
        SystemConfigurationManager.U.u().dz.O(this.H, f);
    }

    public ContextualEventDispatcher e() {
        return new ContextualEventDispatcher(SystemConfigurationManager.U.u().dz.s(this.H));
    }

    public ContextualEventDispatcher i() {
        return new ContextualEventDispatcher(SystemConfigurationManager.U.u().dz.H(this.H));
    }

    public float G() {
        return SystemConfigurationManager.U.u().dz.S(this.H);
    }
}

