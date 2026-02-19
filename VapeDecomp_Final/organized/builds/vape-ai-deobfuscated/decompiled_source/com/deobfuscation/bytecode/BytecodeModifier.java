/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.bytecode;

import a.b3;
import a.fe;
import com.app.core.interfaces.OperationExecutionInterface;
import com.ui.rendering.GraphicalRenderingController;

class BytecodeModifier
implements OperationExecutionInterface {
    final b3 b;

    BytecodeModifier(b3 b32) {
        this.b = b32;
    }

    @Override
    public void R() {
        GraphicalRenderingController.D(fe.class).I();
        GraphicalRenderingController.K.T(GraphicalRenderingController.F);
    }
}

