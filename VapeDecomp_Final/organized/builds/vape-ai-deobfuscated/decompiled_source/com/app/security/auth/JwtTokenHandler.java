/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.auth;

import com.auth.tracking.AuthenticationStateTracker;
import com.ui.rendering.GraphicalRenderingController;

class JwtTokenHandler
extends AuthenticationStateTracker {
    final GraphicalRenderingController a;

    JwtTokenHandler(GraphicalRenderingController graphicalRenderingController, Object object, String string, boolean bl) {
        this.a = graphicalRenderingController;
        super(object, string, bl);
    }

    public void h(Boolean bl) {
        super.H(bl);
    }
}

