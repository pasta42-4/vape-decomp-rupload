/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.game.interaction;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import org.jetbrains.annotations.Nullable;

public class EntityInteractionBroker
extends GameRenderContextBridge {
    private final Object E;
    private static final ConcurrentRequestTracker J = new ConcurrentRequestTracker();
    @Nullable
    private TransactionOrchestrator1017 H;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return J;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return J;
    }

    @Override
    public boolean fire() {
        try {
            if (!ReflectionMetadataResolver.rl.isInstance(this.E)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EntityInteractionBroker.a(customSystemException);
        }
        return super.fire();
    }

    EntityInteractionBroker(Object object) {
        this.E = object;
    }

    public TransactionOrchestrator1017 getEntity() {
        try {
            if (this.H == null) {
                this.H = new TransactionOrchestrator1017(this.E);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EntityInteractionBroker.a(customSystemException);
        }
        return this.H;
    }
}

