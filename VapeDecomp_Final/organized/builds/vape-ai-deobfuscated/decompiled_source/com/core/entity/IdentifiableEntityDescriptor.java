/*
 * Decompiled with CFR 0.152.
 */
package com.core.entity;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.resource.core.BaseResourceManager;

public class IdentifiableEntityDescriptor
extends BaseResourceManager {
    int G;

    public IdentifiableEntityDescriptor(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('s', bytecodeAnalyzer);
        this.G = n;
    }

    public String Q() {
        return this.R.Z(this.G);
    }

    public String toString() {
        return "\"" + this.Q() + "\"";
    }
}

