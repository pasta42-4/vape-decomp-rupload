/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.concurrency.execution.HybridExecutionCoordinator;
import com.graphics.rendering.GraphicalRenderEngine1082;

class wB
extends GraphicalRenderEngine1082 {
    final HybridExecutionCoordinator ul;

    @Override
    public void E() {
        HybridExecutionCoordinator.E(this.ul);
        super.E();
    }

    wB(HybridExecutionCoordinator hybridExecutionCoordinator, double d2, double d3) {
        this.ul = hybridExecutionCoordinator;
        super(d2, d3);
    }
}

