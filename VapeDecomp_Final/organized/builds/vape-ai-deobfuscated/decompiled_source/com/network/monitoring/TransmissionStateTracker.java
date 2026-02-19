/*
 * Decompiled with CFR 0.152.
 */
package com.network.monitoring;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;

public class TransmissionStateTracker
extends CollectionOrchestrator1895 {
    public int R;

    public TransmissionStateTracker(int n, int n2) {
        super(n);
        this.R = n2;
    }

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.F(this.Q, this.R);
        this.m(bytecodeInstrumentationEngine);
    }
}

