/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.resource.core.BaseResourceManager;

public class NetworkConnectionManager1965
extends BaseResourceManager {
    int P;

    public int L() {
        return this.R.N(this.P);
    }

    public String toString() {
        return Integer.toString(this.L());
    }

    public NetworkConnectionManager1965(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('I', bytecodeAnalyzer);
        this.P = n;
    }
}

