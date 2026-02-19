/*
 * Decompiled with CFR 0.152.
 */
package com.app.exceptions;

import com.system.resource.ResourceAllocationManager1058;

public class CustomApplicationException
extends Exception {
    private final ResourceAllocationManager1058 y;

    public ResourceAllocationManager1058 Z() {
        return this.y;
    }

    public CustomApplicationException(ResourceAllocationManager1058 resourceAllocationManager1058) {
        this.y = resourceAllocationManager1058;
    }
}

