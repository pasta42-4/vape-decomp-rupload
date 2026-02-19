/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.data.pipeline.TransformationPipelineManager616;
import com.event.core.EventDispatchCenter2546;
import com.financial.processing.TransactionCorrelationEngine;

public class EventDispatchResolver
extends TransactionCorrelationEngine {
    public EventDispatchResolver(Object object) {
        super(object);
    }

    public static EventDispatchCenter2546 V() {
        return new EventDispatchCenter2546(TransformationPipelineManager616.P(EventDispatchResolver.U.u().dT));
    }
}

