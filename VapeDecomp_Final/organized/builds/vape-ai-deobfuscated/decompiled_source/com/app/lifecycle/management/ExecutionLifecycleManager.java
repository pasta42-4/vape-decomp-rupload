/*
 * Decompiled with CFR 0.152.
 */
package com.app.lifecycle.management;

import com.app.core.interfaces.OperationExecutionInterface;
import com.data.compression.DataCompressionEngine;

class ExecutionLifecycleManager
implements OperationExecutionInterface {
    final DataCompressionEngine O;

    @Override
    public void R() {
        this.O.N(false);
    }

    ExecutionLifecycleManager(DataCompressionEngine dataCompressionEngine) {
        this.O = dataCompressionEngine;
    }
}

