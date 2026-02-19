/*
 * Decompiled with CFR 0.152.
 */
package com.game.entity;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.data.compression.CompressionUtility2401;
import com.game.rendering.GameRenderContextBridge;
import com.math.geometry.GeometryCalculator;
import com.security.transform.CryptographicTransformer;

@Deprecated
public class EntityLifecycleEvent
extends GameRenderContextBridge {
    private final String J;
    private final CryptographicTransformer a;
    private static final ConcurrentRequestTracker r = new ConcurrentRequestTracker();

    public EntityLifecycleEvent(CryptographicTransformer cryptographicTransformer, Object object) {
        this.a = cryptographicTransformer;
        if (GeometryCalculator.C() >= 35) {
            CompressionUtility2401 compressionUtility2401 = new CompressionUtility2401(object);
            this.J = compressionUtility2401.u().y();
        } else {
            this.J = (String)object;
        }
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return r;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return r;
    }

    public CryptographicTransformer getEntity() {
        return this.a;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    public String getName() {
        return this.J;
    }
}

