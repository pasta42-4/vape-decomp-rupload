/*
 * Decompiled with CFR 0.152.
 */
package com.app.task.scheduling;

import com.app.core.interfaces.OperationExecutionInterface;
import com.graphics.rendering.GraphicsRenderingUtility;
import com.math.computation.NumericComputationResolver;

class ProcessingTaskScheduler
implements OperationExecutionInterface {
    final GraphicsRenderingUtility p;
    final NumericComputationResolver n;

    @Override
    public void R() {
        this.n.B();
    }

    ProcessingTaskScheduler(GraphicsRenderingUtility graphicsRenderingUtility, NumericComputationResolver numericComputationResolver) {
        this.p = graphicsRenderingUtility;
        this.n = numericComputationResolver;
    }
}

