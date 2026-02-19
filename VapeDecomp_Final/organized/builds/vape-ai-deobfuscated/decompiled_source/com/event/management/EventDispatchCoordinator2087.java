/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.app.rendering.RenderContextManager1540;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.data.transformation.DataTransformationEngine1209;

public class EventDispatchCoordinator2087
extends RenderContextManager1540 {
    private static final ConcurrentRequestTracker D = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return D;
    }

    public EventDispatchCoordinator2087(DataTransformationEngine1209 dataTransformationEngine1209, float f) {
        super(dataTransformationEngine1209, f);
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return D;
    }
}

