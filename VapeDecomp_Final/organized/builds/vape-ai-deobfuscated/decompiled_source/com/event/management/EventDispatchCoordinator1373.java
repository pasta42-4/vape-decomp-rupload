/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import a.jD;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.temporal.metadata.TemporalMetadataResolver;

public class EventDispatchCoordinator1373
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker a = new ConcurrentRequestTracker();
    private Object Z;
    private int e;
    private int s;
    private boolean W;
    private int y;
    private Object S;

    public EventDispatchCoordinator1373(Object object, Object object2, int n, int n2, int n3) {
        this.S = object;
        this.Z = object2;
        this.e = n;
        this.s = n2;
        this.y = n3;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return a;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean isResult() {
        return this.W;
    }

    @Override
    public boolean fire() {
        jD jD2;
        block7: {
            jD2 = TemporalMetadataResolver.h.U().l();
            try {
                try {
                    if (jD2 != null && jD2.Z()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1373.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1373.a(customSystemException);
            }
        }
        try {
            jD2.A(this);
            if (this.isCanceled()) {
                this.W = TemporalMetadataResolver.h.u().kB.a.V(this.S, this.Z, this.e, this.s, this.y, Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(1.0f));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1373.a(customSystemException);
        }
        return this.isCanceled();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return a;
    }
}

