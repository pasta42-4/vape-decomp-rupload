/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.resource.core.BaseResourceManager;

public class ConnectionPoolMonitor
extends BaseResourceManager {
    int v;

    public double i() {
        return this.R.T(this.v);
    }

    public ConnectionPoolMonitor(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('D', bytecodeAnalyzer);
        this.v = n;
    }

    public String toString() {
        return Double.toString(this.i());
    }
}

