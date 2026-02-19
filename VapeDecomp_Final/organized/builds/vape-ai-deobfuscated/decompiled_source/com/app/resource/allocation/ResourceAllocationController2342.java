/*
 * Decompiled with CFR 0.152.
 */
package com.app.resource.allocation;

import com.runtime.reflection.ReflectionUtilityBroker;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.SystemResourceMonitor;

public class ResourceAllocationController2342
extends ObjectLifecycleTracker {
    public ResourceAllocationController2342(Object object) {
        super(object);
    }

    public ReflectionUtilityBroker G() {
        return new ReflectionUtilityBroker(SystemResourceMonitor.L(ResourceAllocationController2342.U.u().n, this.H));
    }
}

