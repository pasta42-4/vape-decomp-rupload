/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import a.Qh;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.mediation.DynamicReferenceMediator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ResourceAllocator1647
extends ObjectLifecycleTracker {
    public static ResourceAllocator1647 G(Qh qh) {
        try {
            if (GeometryCalculator.C() >= 50) {
                return new ResourceAllocator1647(DynamicReferenceMediator.X(ResourceAllocator1647.U.u().LS, ApplicationLifecycleManager.c().r(), qh.M()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1647.a(customSystemException);
        }
        return new ResourceAllocator1647(DynamicReferenceMediator.X(ResourceAllocator1647.U.u().LS, null, qh.M()));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ResourceAllocator1647 s() {
        return new ResourceAllocator1647(DynamicReferenceMediator.K(ResourceAllocator1647.U.u().LS));
    }

    public ResourceAllocator1647(Object object) {
        super(object);
    }
}

