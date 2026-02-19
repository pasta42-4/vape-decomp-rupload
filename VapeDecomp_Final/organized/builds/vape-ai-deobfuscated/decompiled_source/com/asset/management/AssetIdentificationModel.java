/*
 * Decompiled with CFR 0.152.
 */
package com.asset.management;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.resource.core.BaseResourceManager;

public class AssetIdentificationModel
extends BaseResourceManager {
    int e;

    public String toString() {
        return Character.toString(this.m());
    }

    public char m() {
        return (char)this.R.N(this.e);
    }

    public AssetIdentificationModel(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('C', bytecodeAnalyzer);
        this.e = n;
    }
}

