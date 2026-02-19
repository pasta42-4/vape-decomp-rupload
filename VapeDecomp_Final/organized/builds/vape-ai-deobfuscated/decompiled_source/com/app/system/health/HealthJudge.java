/*
 * Decompiled with CFR 0.152.
 */
package com.app.system.health;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;

public class HealthJudge
extends CollectionOrchestrator1895 {
    public int u;

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.n(this.Q, this.u);
        this.m(bytecodeInstrumentationEngine);
    }

    public HealthJudge(int n, int n2) {
        super(n);
        this.u = n2;
    }
}

