/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.executor;

import a.fH;
import com.app.core.interfaces.OperationExecutionInterface;
import com.auth.state.AuthenticationStateManager;
import com.distributed.resource.DistributedResourceTracker;
import com.exception.system.CustomSystemException;
import com.security.auth.AuthenticationTokenGenerator268;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;

class AsynchronousTaskExecutor1502
implements OperationExecutionInterface {
    final fH l;
    final AuthenticationStateManager o;

    AsynchronousTaskExecutor1502(AuthenticationStateManager authenticationStateManager, fH fH2) {
        this.o = authenticationStateManager;
        this.l = fH2;
    }

    @Override
    public void R() {
        block5: {
            block6: {
                try {
                    if (!AuthenticationStateManager.k(this.o)) break block5;
                    this.o.O();
                    if (AuthenticationStateManager.L(this.o) == null) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskExecutor1502.a(customSystemException);
                }
                AuthenticationTokenGenerator268 authenticationTokenGenerator268 = AuthenticationTokenGenerator268.I(AuthenticationStateManager.L(this.o));
                try {
                    if (TemporalMetadataResolver.h.E().b(AuthenticationStateManager.L(this.o)) != null) {
                        this.o.y("");
                        GraphicalRenderingController.d = null;
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousTaskExecutor1502.a(customSystemException);
                }
                GraphicalRenderingController.d = null;
                AuthenticationStateManager.s(this.o, new DistributedResourceTracker(this.l, authenticationTokenGenerator268));
                AuthenticationStateManager.G(this.o).a();
                this.o.o(AuthenticationStateManager.G(this.o));
            }
            this.o.y("");
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

