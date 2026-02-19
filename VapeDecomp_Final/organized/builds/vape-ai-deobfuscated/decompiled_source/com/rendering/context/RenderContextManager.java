/*
 * Decompiled with CFR 0.152.
 */
package com.rendering.context;

import a.Qh;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.event.management.EventSubscriptionRegistry;
import com.game.rendering.GameRenderContextBridge;

public class RenderContextManager
extends GameRenderContextBridge {
    private final EventSubscriptionRegistry Q;
    private static final ConcurrentRequestTracker u = new ConcurrentRequestTracker();
    private double o;
    private double Z;
    private final Qh f;
    private final DataTransformationEngine1209 e;
    private final float h;
    private double E;

    public double getX() {
        return this.o;
    }

    public DataTransformationEngine1209 getMatrixStack() {
        return this.e;
    }

    public RenderContextManager(Object object, Object object2, Object object3) {
        this.Q = new EventSubscriptionRegistry(object3);
        this.f = new Qh(object);
        this.e = new DataTransformationEngine1209(object2);
        this.h = ApplicationLifecycleManager.K().h();
        this.o = this.f.F();
        this.E = this.f.V();
        this.Z = this.f.B();
    }

    public float getPartialTicks() {
        return this.h;
    }

    public Qh getEntityPlayer() {
        return this.f;
    }

    public RenderContextManager(Object object, Object object2, float f, Object object3) {
        this.Q = new EventSubscriptionRegistry(object);
        this.f = new Qh(object2);
        this.h = f;
        this.e = new DataTransformationEngine1209(object3);
        this.o = this.f.F();
        this.E = this.f.V();
        this.Z = this.f.B();
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return u;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return u;
    }

    public double getZ() {
        return this.Z;
    }

    public EventSubscriptionRegistry getRenderer() {
        return this.Q;
    }

    public RenderContextManager(Object object, Object object2, double d2, double d3, double d4, float f) {
        this.Q = new EventSubscriptionRegistry(object);
        this.f = new Qh(object2);
        this.h = f;
        this.e = null;
        this.o = d2;
        this.E = d3;
        this.Z = d4;
    }

    public double getY() {
        return this.E;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }
}

