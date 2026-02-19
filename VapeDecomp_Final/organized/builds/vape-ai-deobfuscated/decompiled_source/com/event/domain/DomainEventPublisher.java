/*
 * Decompiled with CFR 0.152.
 */
package com.event.domain;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;

public class DomainEventPublisher
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker N;
    static int k;
    private static String[] E;

    public static String[] A() {
        return E;
    }

    public static void q(String[] stringArray) {
        E = stringArray;
    }

    static {
        k = 0;
        DomainEventPublisher.q(null);
        N = new ConcurrentRequestTracker();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return N;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return N;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean fire() {
        try {
            if (k > 0) {
                this.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DomainEventPublisher.a(customSystemException);
        }
        try {
            if (++k > 100) {
                k = 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DomainEventPublisher.a(customSystemException);
        }
        return super.fire();
    }
}

