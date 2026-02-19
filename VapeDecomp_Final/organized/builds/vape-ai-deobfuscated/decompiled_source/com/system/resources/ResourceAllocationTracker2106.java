/*
 * Decompiled with CFR 0.152.
 */
package com.system.resources;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;

public class ResourceAllocationTracker2106
extends CollectionOrchestrator1895 {
    public int z;
    public int U;

    public ResourceAllocationTracker2106(int n, int n2) {
        super(132);
        this.z = n;
        this.U = n2;
    }

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.e(this.z, this.U);
        this.m(bytecodeInstrumentationEngine);
    }
}

