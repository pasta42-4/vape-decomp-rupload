/*
 * Decompiled with CFR 0.152.
 */
package com.app.event.broker;

import a.jD;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;
import com.math.geometry.GeometryCalculator;
import com.network.core.NetworkConnectionOrchestrator;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.temporal.metadata.TemporalMetadataResolver;

public class EventBrokerRegistry
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker W = new ConcurrentRequestTracker();
    private Object L;
    private Object m;
    private Object i;
    private Object s;
    private boolean N;
    private Object a;
    private Object j;
    private boolean g;

    @Override
    public ConcurrentRequestTracker getListeners() {
        return W;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return W;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean fire() {
        jD jD2;
        block6: {
            jD2 = TemporalMetadataResolver.h.U().l();
            if (jD2 == null) return false;
            try {
                if (jD2.Z()) break block6;
                return false;
                catch (Exception exception) {
                    throw EventBrokerRegistry.a(exception);
                }
            }
            catch (Exception exception) {
                throw EventBrokerRegistry.a(exception);
            }
        }
        jD2.S(this);
        try {
            long l = GeometryCalculator.C() >= 23 ? AdaptiveComputationEngine.Q(new ReflectionUtilityBroker(this.a)) : 0L;
            this.N = TemporalMetadataResolver.h.u().dX.e(this.j, this.i, this.m, new NetworkConnectionOrchestrator(this.s).I().M(), this.s, this.a, this.L, this.g, l);
            return this.isCanceled();
        }
        catch (Exception exception) {
            // empty catch block
        }
        return this.isCanceled();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public boolean getResult() {
        return this.N;
    }

    public EventBrokerRegistry(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, boolean bl) {
        this.j = object;
        this.i = object2;
        this.m = object3;
        this.s = object4;
        this.a = object5;
        this.L = object6;
        this.g = bl;
    }
}

