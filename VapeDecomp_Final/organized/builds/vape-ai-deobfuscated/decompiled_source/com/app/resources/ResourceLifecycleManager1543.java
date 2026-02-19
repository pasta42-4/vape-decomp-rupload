/*
 * Decompiled with CFR 0.152.
 */
package com.app.resources;

import com.exception.system.CustomSystemException;
import com.navigation.routing.NavigationPathfinder;
import com.resource.management.ResourceAllocationCoordinator;
import com.runtime.context.LightweightExecutionContext;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ResourceLifecycleManager1543
extends ObjectLifecycleTracker {
    public ResourceLifecycleManager1543(Object object) {
        super(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int G() {
        return ResourceAllocationCoordinator.s(ResourceLifecycleManager1543.U.u().Gb, this.M());
    }

    public LightweightExecutionContext y() {
        return new LightweightExecutionContext(ResourceLifecycleManager1543.U.u().Gb.G(this.M()));
    }

    public boolean H() {
        boolean bl;
        try {
            bl = ResourceLifecycleManager1543.U.u().Gb.G(this.M()) != null;
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceLifecycleManager1543.a(customSystemException);
        }
        return bl;
    }

    public NavigationPathfinder e() {
        return new NavigationPathfinder(ResourceAllocationCoordinator.S(ResourceLifecycleManager1543.U.u().Gb, this.M()));
    }

    public int b() {
        return ResourceAllocationCoordinator.l(ResourceLifecycleManager1543.U.u().Gb, this.M());
    }
}

