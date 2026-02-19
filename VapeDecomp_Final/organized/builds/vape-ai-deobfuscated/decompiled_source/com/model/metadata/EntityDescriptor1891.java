/*
 * Decompiled with CFR 0.152.
 */
package com.model.metadata;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.resource.core.BaseResourceManager;

public class EntityDescriptor1891
extends BaseResourceManager {
    int C;
    int o;

    public String Q() {
        return ReflectionMetadataResolver933.B(this.R.Z(this.C));
    }

    public EntityDescriptor1891(int n, int n2, BytecodeAnalyzer bytecodeAnalyzer) {
        super('e', bytecodeAnalyzer);
        this.C = n;
        this.o = n2;
    }

    public String S() {
        return this.R.Z(this.o);
    }

    public String toString() {
        return this.Q() + "." + this.S();
    }
}

