/*
 * Decompiled with CFR 0.152.
 */
package com.caching.management;

import a.Cz;
import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;
import com.security.session.CipherSessionManager;
import com.ui.rendering.GraphicalRenderingController;

class CacheInvalidationManager
implements OperationExecutionInterface {
    final Cz C;
    final CipherSessionManager q;

    CacheInvalidationManager(Cz cz, CipherSessionManager cipherSessionManager) {
        this.C = cz;
        this.q = cipherSessionManager;
    }

    @Override
    public void R() {
        try {
            if (Cz.I(this.C) != null) {
                Cz.I(this.C).R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CacheInvalidationManager.a(customSystemException);
        }
        GraphicalRenderingController.a(this.q.getClass(), false);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

