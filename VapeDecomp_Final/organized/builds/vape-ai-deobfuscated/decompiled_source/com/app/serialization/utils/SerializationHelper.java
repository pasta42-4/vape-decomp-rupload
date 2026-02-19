/*
 * Decompiled with CFR 0.152.
 */
package com.app.serialization.utils;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.resource.core.BaseResourceManager;

public class SerializationHelper
extends BaseResourceManager {
    int m;

    public SerializationHelper(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('S', bytecodeAnalyzer);
        this.m = n;
    }

    public short v() {
        return (short)this.R.N(this.m);
    }

    public String toString() {
        return Short.toString(this.v());
    }
}

