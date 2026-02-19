/*
 * Decompiled with CFR 0.152.
 */
package com.game.events;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.math.geometry.GeometryCalculator;
import com.messaging.routing.MessageRoutingService1592;
import com.security.resource.SecureResourceAllocator346;
import com.temporal.metadata.TemporalMetadataResolver;

public class GameplayEventDispatcher
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker e = new ConcurrentRequestTracker();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return e;
    }

    @Override
    public boolean fire() {
        SecureResourceAllocator346 secureResourceAllocator346 = TemporalMetadataResolver.h.U().K(SecureResourceAllocator346.class);
        this.setCanceled(secureResourceAllocator346.Z());
        return super.fire();
    }

    public GameplayEventDispatcher(Object object, int n, int n2, Object object2) {
        SecureResourceAllocator346 secureResourceAllocator346 = TemporalMetadataResolver.h.U().K(SecureResourceAllocator346.class);
        secureResourceAllocator346.Q(new MessageRoutingService1592(object));
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return e;
    }

    public GameplayEventDispatcher(Object object, Object object2) {
        block3: {
            SecureResourceAllocator346 secureResourceAllocator346;
            block2: {
                secureResourceAllocator346 = TemporalMetadataResolver.h.U().K(SecureResourceAllocator346.class);
                try {
                    if (GeometryCalculator.C() < 35) break block2;
                    secureResourceAllocator346.Q(new MessageRoutingService1592(object2));
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameplayEventDispatcher.a(customSystemException);
                }
            }
            secureResourceAllocator346.Q(new MessageRoutingService1592(object));
        }
    }
}

