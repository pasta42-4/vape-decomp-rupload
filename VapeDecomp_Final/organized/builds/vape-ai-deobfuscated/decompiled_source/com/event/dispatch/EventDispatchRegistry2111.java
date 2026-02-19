/*
 * Decompiled with CFR 0.152.
 */
package com.event.dispatch;

import com.app.rendering.RenderContextManager1540;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.data.transformation.DataTransformationEngine1209;

public class EventDispatchRegistry2111
extends RenderContextManager1540 {
    private static final ConcurrentRequestTracker j = new ConcurrentRequestTracker();

    @Override
    public ConcurrentRequestTracker getListeners() {
        return j;
    }

    public EventDispatchRegistry2111(DataTransformationEngine1209 dataTransformationEngine1209, float f) {
        super(dataTransformationEngine1209, f);
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return j;
    }
}

