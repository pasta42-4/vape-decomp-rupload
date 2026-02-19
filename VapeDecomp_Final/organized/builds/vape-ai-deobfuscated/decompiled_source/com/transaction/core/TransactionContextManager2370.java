/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.core;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;

public class TransactionContextManager2370
extends CollectionOrchestrator1895 {
    public Object U;

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.Z(this.U);
        this.m(bytecodeInstrumentationEngine);
    }

    public TransactionContextManager2370(Object object) {
        super(18);
        this.U = object;
    }
}

