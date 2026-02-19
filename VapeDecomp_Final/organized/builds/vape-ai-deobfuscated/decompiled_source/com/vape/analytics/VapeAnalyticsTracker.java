/*
 * Decompiled with CFR 0.152.
 */
package com.vape.analytics;

import com.bytecode.transformation.BytecodeInstrumentationEngine;

public class VapeAnalyticsTracker {
    public String N;
    public int A;

    public VapeAnalyticsTracker(String string, int n) {
        this.N = string;
        this.A = n;
    }

    public void S(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.p(this.N, this.A);
    }
}

