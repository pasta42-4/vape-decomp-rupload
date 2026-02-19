/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.game.event;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.transform.CryptographicTransformer;
import org.jetbrains.annotations.Nullable;

public class GenericEntityEvent
extends GameRenderContextBridge {
    @Nullable
    private CryptographicTransformer r;
    private static final ConcurrentRequestTracker Y = new ConcurrentRequestTracker();
    private final Object f;

    public static ConcurrentRequestTracker getEventListeners() {
        return Y;
    }

    public CryptographicTransformer getEntity() {
        try {
            if (this.r == null) {
                this.r = new CryptographicTransformer(this.f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericEntityEvent.a(customSystemException);
        }
        return this.r;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return Y;
    }

    @Override
    public boolean fire() {
        try {
            if (!ReflectionMetadataResolver.rl.isInstance(this.f)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericEntityEvent.a(customSystemException);
        }
        return super.fire();
    }

    GenericEntityEvent(Object object) {
        this.f = object;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

