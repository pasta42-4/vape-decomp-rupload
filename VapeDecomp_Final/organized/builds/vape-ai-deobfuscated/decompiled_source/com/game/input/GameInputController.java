/*
 * Decompiled with CFR 0.152.
 */
package com.game.input;

import a.Z3;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.runtime.context.ContextualExecutionFramework;
import com.system.lifecycle.SystemLifecycleController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import com.ui.rendering.GraphicalRenderingController;

public class GameInputController
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker o = new ConcurrentRequestTracker();
    private final boolean G;
    private final int V;

    @Override
    public ConcurrentRequestTracker getListeners() {
        return o;
    }

    public GameInputController(int n, boolean bl) {
        this.V = n;
        this.G = bl;
    }

    public int getKey() {
        return this.V;
    }

    public boolean isDown() {
        return this.G;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return o;
    }

    @Override
    public boolean fire() {
        block20: {
            block19: {
                block16: {
                    boolean bl;
                    block18: {
                        block17: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (GraphicalRenderingController.K.k() || !DynamicInvocationResolver1041.F(9)) break block16;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GameInputController.a(customSystemException);
                                        }
                                        if (!DynamicInvocationResolver1041.F(114)) break block16;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GameInputController.a(customSystemException);
                                    }
                                    if (Z3.X) break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GameInputController.a(customSystemException);
                                }
                                bl = true;
                                break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GameInputController.a(customSystemException);
                            }
                        }
                        bl = false;
                    }
                    Z3.X = bl;
                }
                try {
                    if (GraphicalRenderingController.K.k() || this.getKey() == 27) break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameInputController.a(customSystemException);
                }
                boolean bl = GraphicalRenderingController.K.p(this);
                return bl;
            }
            try {
                try {
                    if (this.V <= 0 || !this.G) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw GameInputController.a(customSystemException);
                }
                if (ApplicationLifecycleManager.X().M() != null) break block20;
            }
            catch (CustomSystemException customSystemException) {
                throw GameInputController.a(customSystemException);
            }
            for (TransactionDescriptor object : TemporalMetadataResolver.h.o().T()) {
                if (!object.d(this.V)) continue;
            }
        }
        for (ContextualExecutionFramework contextualExecutionFramework : TemporalMetadataResolver.h.U().q()) {
            contextualExecutionFramework.X(this);
        }
        SystemLifecycleController.C.q().v(this);
        return super.fire();
    }
}

