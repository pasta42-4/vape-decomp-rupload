/*
 * Decompiled with CFR 0.152.
 */
package com.app.caching.core;

import com.exception.system.CustomSystemException;
import com.render.config.RenderConfigurationManager;
import com.ui.rendering.GraphicalRenderingController;
import com.workflow.adaptive.AdaptiveWorkflowController;

public class CacheInvalidationManager2335
extends RenderConfigurationManager {
    private void lambda$null$0(Runnable runnable, AdaptiveWorkflowController adaptiveWorkflowController) {
        runnable.run();
        this.e(true);
        adaptiveWorkflowController.F(this);
    }

    public CacheInvalidationManager2335(String string, double d2, boolean bl, AdaptiveWorkflowController adaptiveWorkflowController, Runnable runnable) {
        super(string, d2, bl);
        this.Z(true);
        this.C(() -> this.lambda$new$1(adaptiveWorkflowController, runnable));
        if (bl) {
            runnable.run();
            adaptiveWorkflowController.F(this);
        }
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public CacheInvalidationManager2335(String string, double d2, AdaptiveWorkflowController adaptiveWorkflowController, Runnable runnable) {
        this(string, d2, false, adaptiveWorkflowController, runnable);
    }

    private void lambda$new$1(AdaptiveWorkflowController adaptiveWorkflowController, Runnable runnable) {
        try {
            if (this.equals(adaptiveWorkflowController.o())) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CacheInvalidationManager2335.b(customSystemException);
        }
        GraphicalRenderingController.st.execute(() -> this.lambda$null$0(runnable, adaptiveWorkflowController));
    }
}

