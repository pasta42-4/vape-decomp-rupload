/*
 * Decompiled with CFR 0.152.
 */
package com.vape.processing;

import a.DJ;
import a.DU;
import com.event.management.ContextualEventDispatcher;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;

public class VapeDataProcessor
extends ObjectLifecycleTracker {
    public static VapeDataProcessor Q(ContextualEventDispatcher contextualEventDispatcher, ContextualEventDispatcher contextualEventDispatcher2, DU dU, DJ dJ, CryptographicTransformer cryptographicTransformer) {
        return new VapeDataProcessor(VapeDataProcessor.U.u().Gt.y(contextualEventDispatcher.M(), contextualEventDispatcher2.M(), dU.M(), dJ.M(), cryptographicTransformer.M()));
    }

    public VapeDataProcessor(Object object) {
        super(object);
    }
}

