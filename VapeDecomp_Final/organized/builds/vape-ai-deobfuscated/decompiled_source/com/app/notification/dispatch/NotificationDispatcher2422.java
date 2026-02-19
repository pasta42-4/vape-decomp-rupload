/*
 * Decompiled with CFR 0.152.
 */
package com.app.notification.dispatch;

import com.event.management.ContextualEventDispatcher;
import com.rendering.context.ContextualRenderingMediator;
import com.security.auth.AuthenticationGateway;

class NotificationDispatcher2422
extends AuthenticationGateway {
    final ContextualRenderingMediator s;
    final Float y;

    @Override
    public void v(float f, float f2) {
        super.v(f, this.y.floatValue());
    }

    NotificationDispatcher2422(ContextualRenderingMediator contextualRenderingMediator, ContextualEventDispatcher contextualEventDispatcher, Float f) {
        this.s = contextualRenderingMediator;
        this.y = f;
        super(contextualEventDispatcher);
    }
}

