/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.resource.core.BaseResourceManager;

public class ResourceAllocationTracker2053
extends BaseResourceManager {
    int E;

    public ResourceAllocationTracker2053(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('J', bytecodeAnalyzer);
        this.E = n;
    }

    public long q() {
        return this.R.v(this.E);
    }

    public String toString() {
        return Long.toString(this.q());
    }
}

