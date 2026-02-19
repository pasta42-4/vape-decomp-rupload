/*
 * Decompiled with CFR 0.152.
 */
package com.security.authorization;

import com.app.core.interfaces.OperationExecutionInterface;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.spatial.mapping.CoordinateMapper;
import com.system.orchestration.SystemOrchestrationManager;
import com.ui.rendering.GraphicalRenderingController;

class AuthorizationResolver
implements OperationExecutionInterface {
    final SystemOrchestrationManager R;
    final SystemOrchestrationManager c;

    AuthorizationResolver(SystemOrchestrationManager systemOrchestrationManager, SystemOrchestrationManager systemOrchestrationManager2) {
        this.R = systemOrchestrationManager;
        this.c = systemOrchestrationManager2;
    }

    @Override
    public void R() {
        CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
        SystemOrchestrationManager.O(this.R, coordinateMapper.I);
        SystemOrchestrationManager.p(this.R, this.R.W());
        SystemOrchestrationManager.T(this.R, true);
        GraphicalRenderingController.d = this.c;
    }
}

