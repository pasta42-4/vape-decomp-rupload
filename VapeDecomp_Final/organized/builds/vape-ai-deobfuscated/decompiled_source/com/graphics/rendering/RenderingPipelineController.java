/*
 * Decompiled with CFR 0.152.
 */
package com.graphics.rendering;

import a.oD;
import com.data.streaming.DataStreamProcessor1600;
import com.network.routing.PacketRoutingController;
import com.runtime.metadata.DynamicClassInspector;
import com.security.authentication.AuthenticationStateManager675;
import com.temporal.metadata.TemporalMetadataResolver;

public class RenderingPipelineController
extends AuthenticationStateManager675 {
    public RenderingPipelineController(Object object) {
        super(object);
    }

    public PacketRoutingController L() {
        return new PacketRoutingController(DynamicClassInspector.O(RenderingPipelineController.U.u().V, this.H));
    }

    public String A() {
        return (String)DynamicClassInspector.Y(RenderingPipelineController.U.u().V, this.H);
    }

    public RenderingPipelineController(oD oD2, String string) {
        super(new RenderingPipelineController(TemporalMetadataResolver.h.u().L2.s(oD2.M(), DataStreamProcessor1600.Y(string).M())).M());
    }

    public static RenderingPipelineController z(Object object) {
        return new RenderingPipelineController(DynamicClassInspector.f(RenderingPipelineController.U.u().V, object));
    }
}

