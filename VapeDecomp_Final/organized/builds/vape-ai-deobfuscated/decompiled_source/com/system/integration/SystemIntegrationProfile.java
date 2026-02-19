/*
 * Decompiled with CFR 0.152.
 */
package com.system.integration;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;

public class SystemIntegrationProfile
extends CollectionOrchestrator1895 {
    public String R;
    public String W;
    public String Y;

    public SystemIntegrationProfile(int n, String string, String string2, String string3) {
        super(n);
        this.Y = string;
        this.W = string2;
        this.R = string3;
    }

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.A(this.Q, this.Y, this.W, this.R);
        this.m(bytecodeInstrumentationEngine);
    }
}

