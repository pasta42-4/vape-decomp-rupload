/*
 * Decompiled with CFR 0.152.
 */
package com.command.processing;

import a.fe;
import com.app.core.interfaces.OperationExecutionInterface;
import com.ui.rendering.GraphicalRenderingController;

class CommandExecutionHandler
implements OperationExecutionInterface {
    final fe Z;

    @Override
    public void R() {
        this.Z.I();
        GraphicalRenderingController.K.T(GraphicalRenderingController.F);
    }

    CommandExecutionHandler(fe fe2) {
        this.Z = fe2;
    }
}

