/*
 * Decompiled with CFR 0.152.
 */
package com.cache.management;

import com.exception.system.CustomSystemException;
import com.graphics.rendering.FontRenderManager;
import com.signal.processing.SignalParameterContainer;
import java.util.LinkedHashMap;
import java.util.Map;

class EvictionAwareCacheMap
extends LinkedHashMap {
    final FontRenderManager F;

    protected boolean removeEldestEntry(Map.Entry entry) {
        boolean bl;
        SignalParameterContainer signalParameterContainer = (SignalParameterContainer)entry.getValue();
        try {
            if (signalParameterContainer != null) {
                FontRenderManager.P(this.F, signalParameterContainer.b);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EvictionAwareCacheMap.a(customSystemException);
        }
        try {
            bl = this.size() > 200;
        }
        catch (CustomSystemException customSystemException) {
            throw EvictionAwareCacheMap.a(customSystemException);
        }
        return bl;
    }

    EvictionAwareCacheMap(FontRenderManager fontRenderManager, int n, float f, boolean bl) {
        this.F = fontRenderManager;
        super(n, f, bl);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

