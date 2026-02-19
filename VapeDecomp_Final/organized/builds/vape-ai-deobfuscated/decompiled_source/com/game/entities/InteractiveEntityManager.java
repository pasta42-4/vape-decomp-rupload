/*
 * Decompiled with CFR 0.152.
 */
package com.game.entities;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.transform.CryptographicTransformer;

@Deprecated
public class InteractiveEntityManager
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker W = new ConcurrentRequestTracker();
    private final CryptographicTransformer B;

    public CryptographicTransformer getEntity() {
        return this.B;
    }

    @Override
    public boolean fire() {
        try {
            if (!this.B.B(ReflectionMetadataResolver.rl)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw InteractiveEntityManager.a(customSystemException);
        }
        return super.fire();
    }

    InteractiveEntityManager(Object object) {
        this.B = new CryptographicTransformer(object);
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return W;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return W;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

