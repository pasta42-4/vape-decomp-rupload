/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.resource.core.BaseResourceManager;

public class CryptographicEncoder
extends BaseResourceManager {
    int U;

    public CryptographicEncoder(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('B', bytecodeAnalyzer);
        this.U = n;
    }

    public byte R() {
        return (byte)this.R.N(this.U);
    }

    public String toString() {
        return Byte.toString(this.R());
    }
}

