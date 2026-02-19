/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.concurrent.resource.ThreadSafeResourceCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.ui.rendering.UIRenderingCoordinator;
import java.awt.Color;

class ResourceAllocator2470
extends UIRenderingCoordinator {
    final ThreadSafeResourceCoordinator n;

    ResourceAllocator2470(ThreadSafeResourceCoordinator threadSafeResourceCoordinator, String string, double d2, double d3, double d4, double d5, boolean bl, boolean bl2, Color color, AbstractComputationKernel abstractComputationKernel) {
        this.n = threadSafeResourceCoordinator;
        super(string, d2, d3, d4, d5, bl, bl2, color, abstractComputationKernel);
    }

    @Override
    public double z() {
        return 17.0;
    }
}

