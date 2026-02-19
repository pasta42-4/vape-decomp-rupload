/*
 * Decompiled with CFR 0.152.
 */
package com.app.state.management;

import com.app.core.interfaces.OperationExecutionInterface;
import com.data.serialization.DataSerializationManager;

class StateTransitionHandler
implements OperationExecutionInterface {
    final DataSerializationManager D;

    @Override
    public void R() {
        this.D.V();
    }

    StateTransitionHandler(DataSerializationManager dataSerializationManager) {
        this.D = dataSerializationManager;
    }
}

