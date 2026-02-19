/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.data.protocol.DataProcessingProtocol;
import com.distributed.cache.DistributedCacheOrchestrator;
import com.exception.system.CustomSystemException;
import java.awt.Point;

class EventDispatcher1808
implements DataProcessingProtocol {
    final DistributedCacheOrchestrator H;

    EventDispatcher1808(DistributedCacheOrchestrator distributedCacheOrchestrator) {
        this.H = distributedCacheOrchestrator;
    }

    @Override
    public boolean o(Point point) {
        boolean bl;
        try {
            bl = !this.H.C().T(point);
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatcher1808.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

