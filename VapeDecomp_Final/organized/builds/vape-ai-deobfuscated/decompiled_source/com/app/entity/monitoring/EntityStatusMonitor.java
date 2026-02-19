/*
 * Decompiled with CFR 0.152.
 */
package com.app.entity.monitoring;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;
import com.transaction.validation.TransactionValidator1298;

public class EntityStatusMonitor
extends GameRenderContextBridge {
    private CryptographicTransformer F;
    private final Object E;
    private boolean W;
    private TransactionValidator1298 t;
    private final Object Q;
    private static final ConcurrentRequestTracker G = new ConcurrentRequestTracker();

    public EntityStatusMonitor(Object object, Object object2) {
        this.Q = object;
        this.E = object2;
    }

    public boolean isActive() {
        return this.W;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public void setActive(boolean bl) {
        this.W = bl;
    }

    public CryptographicTransformer getEntity() {
        try {
            if (this.F == null) {
                this.F = new CryptographicTransformer(this.Q);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EntityStatusMonitor.a(customSystemException);
        }
        return this.F;
    }

    public TransactionValidator1298 getPotion() {
        try {
            if (this.t == null) {
                this.t = new TransactionValidator1298(this.E);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EntityStatusMonitor.a(customSystemException);
        }
        return this.t;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return G;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return G;
    }
}

