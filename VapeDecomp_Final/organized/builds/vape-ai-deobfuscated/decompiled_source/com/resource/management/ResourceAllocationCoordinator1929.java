/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.transmission.TransmissionStateManager;

public class ResourceAllocationCoordinator1929
extends TransmissionStateManager {
    public float W() {
        try {
            if (GeometryCalculator.C() >= 37) {
                return ResourceAllocationCoordinator1929.U.u().ks.J(this.M(), 0.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationCoordinator1929.a(customSystemException);
        }
        return ResourceAllocationCoordinator1929.U.u().ks.j(this.M());
    }

    public float c() {
        return ResourceAllocationCoordinator1929.U.u().ks.f(this.M());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ResourceAllocationCoordinator1929(Object object) {
        super(object);
    }
}

