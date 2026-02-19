/*
 * Decompiled with CFR 0.152.
 */
package com.ui.configuration;

import a.tl;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.math.geometry.GeometryCalculator;
import com.system.configuration.ConfigurationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;

public class DisplayConfigurationManager
extends GameRenderContextBridge {
    private static int f;
    private static final ConcurrentRequestTracker Z;
    private static int Y;

    public static ConcurrentRequestTracker getEventListeners() {
        return Z;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return Z;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int getDisplayWidth() {
        return f;
    }

    static {
        Z = new ConcurrentRequestTracker();
    }

    public int getDisplayHeight() {
        return Y;
    }

    public static void create() {
        block4: {
            try {
                try {
                    if (GeometryCalculator.C() < 37 || !ApplicationLifecycleManager.U().Y()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DisplayConfigurationManager.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw DisplayConfigurationManager.a(customSystemException);
            }
        }
        f = ApplicationLifecycleManager.e();
        Y = ApplicationLifecycleManager.b();
        tl.l(770, 771, 1, 0);
        ConfigurationManager.R(f, Y);
        TemporalMetadataResolver.h.U().K(GraphicalRenderingController.class).X();
        DisplayConfigurationManager displayConfigurationManager = new DisplayConfigurationManager();
        displayConfigurationManager.fire();
        ConfigurationManager.f(f, Y);
    }
}

