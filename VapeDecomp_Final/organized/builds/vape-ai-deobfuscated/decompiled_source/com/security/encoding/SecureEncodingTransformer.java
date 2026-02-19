/*
 * Decompiled with CFR 0.152.
 */
package com.security.encoding;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.resource.core.BaseResourceManager;

public class SecureEncodingTransformer
extends BaseResourceManager {
    int Z;

    public SecureEncodingTransformer(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('F', bytecodeAnalyzer);
        this.Z = n;
    }

    public float K() {
        return this.R.F(this.Z);
    }

    public String toString() {
        return Float.toString(this.K());
    }
}

