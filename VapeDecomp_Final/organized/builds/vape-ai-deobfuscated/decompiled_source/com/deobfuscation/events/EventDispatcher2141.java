/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.events;

import com.graphics.rendering.RenderingPipelineController;
import com.security.authentication.AuthenticationStateManager675;
import com.system.resources.ResourceAllocator2619;

public class EventDispatcher2141
extends RenderingPipelineController {
    public RenderingPipelineController c(AuthenticationStateManager675 authenticationStateManager675) {
        return new RenderingPipelineController(EventDispatcher2141.U.u().dc.m(this.M(), authenticationStateManager675.M()));
    }

    public EventDispatcher2141(Object object) {
        super(object);
    }

    public RenderingPipelineController t(ResourceAllocator2619 resourceAllocator2619) {
        return new RenderingPipelineController(EventDispatcher2141.U.u().dc.t(this.M(), resourceAllocator2619.M()));
    }
}

