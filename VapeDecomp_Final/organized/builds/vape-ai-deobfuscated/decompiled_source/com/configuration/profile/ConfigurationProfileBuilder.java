/*
 * Decompiled with CFR 0.152.
 */
package com.configuration.profile;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;

public class ConfigurationProfileBuilder
extends CollectionOrchestrator1895 {
    public int R;
    public String n;

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.s(this.n, this.R);
        this.m(bytecodeInstrumentationEngine);
    }

    public ConfigurationProfileBuilder(String string, int n) {
        super(197);
        this.n = string;
        this.R = n;
    }
}

