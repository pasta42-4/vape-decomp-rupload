/*
 * Decompiled with CFR 0.152.
 */
package com.monitoring.analytics;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.core.abstraction.AbstractDataWrapper;
import com.execution.core.ExecutionOrchestrator1430;
import com.system.configuration.AbstractBaseConfiguration;
import java.util.Map;

class MetricAggregator
extends AbstractBaseConfiguration {
    AbstractDataWrapper W;

    int j(int n, int n2) throws Exception {
        this.t.U(n2);
        for (int i = 0; i < n2; ++i) {
            int n3 = this.F[n] & 0xFF;
            n = this.W.W(n + 1, n3);
            n = this.W.L(n);
            n = this.m(n);
        }
        return n;
    }

    MetricAggregator(byte[] byArray, BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        super(byArray, bytecodeAnalyzer, bytecodeAnalyzer2, map, false);
        ExecutionOrchestrator1430 executionOrchestrator1430 = new ExecutionOrchestrator1430(this.d, bytecodeAnalyzer2);
        this.t = executionOrchestrator1430;
        this.W = new AbstractDataWrapper(byArray, bytecodeAnalyzer, bytecodeAnalyzer2, map, executionOrchestrator1430);
    }
}

