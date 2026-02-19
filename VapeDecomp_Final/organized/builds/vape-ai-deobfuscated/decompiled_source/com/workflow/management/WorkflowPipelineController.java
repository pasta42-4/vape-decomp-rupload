/*
 * Decompiled with CFR 0.152.
 */
package com.workflow.management;

import com.dynamic.resolution.RuntimeMethodResolver;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.precision.PrecisionMathOrchestrator;

public class WorkflowPipelineController
extends GraphicalRenderEngine1082 {
    public WorkflowPipelineController() {
        super(100.0, 130.0);
        RuntimeMethodResolver runtimeMethodResolver = new RuntimeMethodResolver();
        this.n(new PrecisionMathOrchestrator(this.w() / 2.0 - runtimeMethodResolver.w() / 2.0, this.b() / 2.0 - runtimeMethodResolver.b() / 2.0 - 15.0, runtimeMethodResolver), new Object[0]);
    }
}

