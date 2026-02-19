/*
 * Decompiled with CFR 0.152.
 */
package com.config.setup;

import com.app.routing.RequestRoutingController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;

public class ConfigurationInitializer2518 {
    public static void a(char c, int n) {
        GraphicalRenderingController graphicalRenderingController = TemporalMetadataResolver.h.U().K(GraphicalRenderingController.class);
        if (GraphicalRenderingController.d != null) {
            for (RequestRoutingController requestRoutingController : GraphicalRenderingController.d.g()) {
                requestRoutingController.p(c, n);
            }
        }
    }
}

