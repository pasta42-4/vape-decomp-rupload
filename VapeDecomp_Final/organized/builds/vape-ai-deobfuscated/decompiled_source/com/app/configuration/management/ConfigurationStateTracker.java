/*
 * Decompiled with CFR 0.152.
 */
package com.app.configuration.management;

import com.bytecode.analysis.BytecodeAnalysisEngine1263;

public class ConfigurationStateTracker {
    public int e;
    public BytecodeAnalysisEngine1263 G;
    public ConfigurationStateTracker B;

    ConfigurationStateTracker(BytecodeAnalysisEngine1263 bytecodeAnalysisEngine1263, int n, ConfigurationStateTracker configurationStateTracker) {
        this.G = bytecodeAnalysisEngine1263;
        this.e = n;
        this.B = configurationStateTracker;
    }
}

