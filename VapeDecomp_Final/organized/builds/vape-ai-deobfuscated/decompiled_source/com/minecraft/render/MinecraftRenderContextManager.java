/*
 * Decompiled with CFR 0.152.
 */
package com.minecraft.render;

import a.Qh;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.event.management.EventSubscriptionRegistry;
import com.game.rendering.GameRenderContextBridge;

public class MinecraftRenderContextManager
extends GameRenderContextBridge {
    private final Qh C;
    private static final ConcurrentRequestTracker D = new ConcurrentRequestTracker();
    private final DataTransformationEngine1209 w;
    private final float o;
    private final EventSubscriptionRegistry Z;

    public Qh getEntityPlayer() {
        return this.C;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return D;
    }

    public MinecraftRenderContextManager(Object object, Object object2, float f) {
        this.Z = new EventSubscriptionRegistry(object);
        this.C = new Qh(object2);
        this.o = f;
        this.w = null;
    }

    public EventSubscriptionRegistry getRenderer() {
        return this.Z;
    }

    public MinecraftRenderContextManager(Object object, Object object2, float f, Object object3) {
        this.Z = new EventSubscriptionRegistry(object);
        this.C = new Qh(object2);
        this.o = f;
        this.w = new DataTransformationEngine1209(object3);
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public MinecraftRenderContextManager(Object object, Object object2, Object object3) {
        this.Z = new EventSubscriptionRegistry(object3);
        this.C = new Qh(object);
        this.w = new DataTransformationEngine1209(object2);
        this.o = ApplicationLifecycleManager.K().h();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return D;
    }

    public DataTransformationEngine1209 getMatrixStack() {
        return this.w;
    }

    public float getPartialTicks() {
        return this.o;
    }
}

