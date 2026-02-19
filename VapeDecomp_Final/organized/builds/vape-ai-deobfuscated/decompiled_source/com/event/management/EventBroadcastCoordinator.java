/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.app.event.EventTrigger;
import com.concurrency.execution.TaskDispatcherService;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.configuration.CryptoConfigurationManager;
import com.game.rendering.GameRenderContextBridge;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.runtime.context.DynamicContextBroker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;

public class EventBroadcastCoordinator
extends GameRenderContextBridge {
    private static int[] w;
    private static final ConcurrentRequestTracker o;
    public static final TaskDispatcherService k;
    public static final TaskDispatcherService W;

    public static void k(int[] nArray) {
        w = nArray;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return o;
    }

    static {
        W = new TaskDispatcherService();
        EventBroadcastCoordinator.k(new int[4]);
        k = new TaskDispatcherService();
        o = new ConcurrentRequestTracker();
    }

    public static int[] t() {
        return w;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean fire() {
        try {
            block20: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                try {
                                    if (TemporalMetadataResolver.h.U()) {
                                        GraphicalRenderingController.K.K();
                                        TemporalMetadataResolver.h.u(false);
                                    }
                                }
                                catch (Exception v0) {
                                    throw EventBroadcastCoordinator.a(v0);
                                }
                                try {
                                    if (ApplicationLifecycleManager.c().r()) {
                                        DynamicContextBroker.K = true;
                                    }
                                }
                                catch (Exception v1) {
                                    throw EventBroadcastCoordinator.a(v1);
                                }
                                if (DynamicInvocationResolver1041.F(163)) ** GOTO lbl28
                                if (DynamicInvocationResolver1041.F(162)) ** GOTO lbl28
                                break block21;
                                catch (Exception v2) {
                                    throw EventBroadcastCoordinator.a(v2);
                                }
                            }
                            if (!DynamicInvocationResolver1041.F(161)) break block20;
                            break block22;
                            catch (Exception v3) {
                                throw EventBroadcastCoordinator.a(v3);
                            }
                        }
                        if (!DynamicInvocationResolver1041.F(36)) break block20;
                        break block23;
                        catch (Exception v4) {
                            throw EventBroadcastCoordinator.a(v4);
                        }
                    }
                    if (!(this instanceof EventTrigger)) break block20;
                    break block24;
                    catch (Exception v5) {
                        throw EventBroadcastCoordinator.a(v5);
                    }
                }
                try {
                    block25: {
                        if (!ApplicationLifecycleManager.X().Y()) break block20;
                        break block25;
                        catch (Exception v6) {
                            throw EventBroadcastCoordinator.a(v6);
                        }
                    }
                    TemporalMetadataResolver.h.U().K(GraphicalRenderingController.class).m();
                }
                catch (Exception v7) {
                    throw EventBroadcastCoordinator.a(v7);
                }
            }
            CryptoConfigurationManager.v(-1);
        }
        catch (Exception var1_1) {
            TemporalMetadataResolver.W(var1_1);
        }
        return super.fire();
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return o;
    }
}

