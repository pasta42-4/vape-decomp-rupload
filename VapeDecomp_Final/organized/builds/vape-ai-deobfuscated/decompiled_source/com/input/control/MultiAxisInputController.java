/*
 * Decompiled with CFR 0.152.
 */
package com.input.control;

import a.jt;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.management.ResourceAllocationTracker;
import com.security.tokens.CryptographicTokenGenerator;
import com.simulation.core.ModelSimulationEngine;
import com.temporal.metadata.TemporalMetadataResolver;

public class MultiAxisInputController
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker z = new ConcurrentRequestTracker();
    private static jt G;
    private float J;
    private static ResourceAllocationTracker T;
    private static ModelSimulationEngine g;
    private static CryptographicTokenGenerator v;
    private Object h;

    @Override
    public boolean fire() {
        block11: {
            try {
                if (G == null) {
                    G = TemporalMetadataResolver.h.U().K(jt.class);
                    v = TemporalMetadataResolver.h.U().K(CryptographicTokenGenerator.class);
                    T = TemporalMetadataResolver.h.U().K(ResourceAllocationTracker.class);
                    g = TemporalMetadataResolver.h.U().K(ModelSimulationEngine.class);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiAxisInputController.a(customSystemException);
            }
            try {
                try {
                    try {
                        try {
                            if (G.Z() || v.Z()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MultiAxisInputController.a(customSystemException);
                        }
                        if (g.Z()) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiAxisInputController.a(customSystemException);
                    }
                    if (T.Z()) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiAxisInputController.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiAxisInputController.a(customSystemException);
            }
        }
        return ReflectionMetadataResolver.rl.isInstance(this.h);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return z;
    }

    public MultiAxisInputController(Object object, float f) {
        this.h = object;
        this.J = f;
    }

    public Object getVec() {
        Object object = TemporalMetadataResolver.h.u().ku.V.r(this.h, Float.valueOf(this.J));
        return object;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return z;
    }
}

