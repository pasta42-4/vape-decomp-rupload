/*
 * Decompiled with CFR 0.152.
 */
package com.concurrent.task;

import a.fH;
import com.app.routing.RequestRoutingController;
import com.auth.state.AuthenticationStateManager;
import com.distributed.resource.DistributedResourceTracker;
import com.exception.system.CustomSystemException;
import com.security.auth.AuthenticationTokenGenerator268;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;

class AsyncTaskDispatcher
implements RequestRoutingController {
    final AuthenticationStateManager k;
    final fH l;

    @Override
    public void p(char c, int n) {
        block5: {
            block6: {
                try {
                    if (!AuthenticationStateManager.k(this.k)) break block5;
                    this.k.O();
                    if (AuthenticationStateManager.L(this.k) == null) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsyncTaskDispatcher.a(customSystemException);
                }
                AuthenticationTokenGenerator268 authenticationTokenGenerator268 = AuthenticationTokenGenerator268.I(AuthenticationStateManager.L(this.k));
                try {
                    if (TemporalMetadataResolver.h.E().b(AuthenticationStateManager.L(this.k)) != null) {
                        this.k.y("");
                        GraphicalRenderingController.d = null;
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsyncTaskDispatcher.a(customSystemException);
                }
                GraphicalRenderingController.d = null;
                AuthenticationStateManager.s(this.k, new DistributedResourceTracker(this.l, authenticationTokenGenerator268));
                AuthenticationStateManager.G(this.k).a();
                this.k.o(AuthenticationStateManager.G(this.k));
            }
            this.k.y("");
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    AsyncTaskDispatcher(AuthenticationStateManager authenticationStateManager, fH fH2) {
        this.k = authenticationStateManager;
        this.l = fH2;
    }
}

