/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.data.transformation.DataTransformationEngine1209;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.security.transform.CryptographicTransformer;

public class RenderEventDispatcher
extends GameRenderContextBridge {
    private final double i;
    private DataTransformationEngine1209 F;
    private final double I;
    private static final ConcurrentRequestTracker k = new ConcurrentRequestTracker();
    private CryptographicTransformer f;
    private final Object g;
    private final double J;
    private final Object u;

    public double getZ() {
        return this.I;
    }

    public CryptographicTransformer getEntity() {
        try {
            if (this.f == null) {
                this.f = new CryptographicTransformer(this.u);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RenderEventDispatcher.a(customSystemException);
        }
        return this.f;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return k;
    }

    public double getY() {
        return this.i;
    }

    @Override
    public boolean fire() {
        return super.fire();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return k;
    }

    public RenderEventDispatcher(Object object, double d2, double d3, double d4, Object object2) {
        this.u = object;
        this.g = object2;
        this.J = d2;
        this.i = d3;
        this.I = d4;
    }

    public DataTransformationEngine1209 getMatrixStack() {
        try {
            if (this.F == null) {
                this.F = new DataTransformationEngine1209(this.g);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RenderEventDispatcher.a(customSystemException);
        }
        return this.F;
    }

    public double getX() {
        return this.J;
    }
}

