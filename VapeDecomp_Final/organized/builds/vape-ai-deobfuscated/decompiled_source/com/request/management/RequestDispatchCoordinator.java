/*
 * Decompiled with CFR 0.152.
 */
package com.request.management;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;

public class RequestDispatchCoordinator
extends ObjectLifecycleTracker {
    public static RequestDispatchCoordinator F() {
        try {
            if (GeometryCalculator.C() >= 50) {
                TemporalMetadataResolver.k();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RequestDispatchCoordinator.a(customSystemException);
        }
        return new RequestDispatchCoordinator(RequestDispatchCoordinator.U.u().kO.r());
    }

    public RequestDispatchCoordinator(Object object) {
        super(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

