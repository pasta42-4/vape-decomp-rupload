/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.app.utils.UniversalIdentityComparator;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.resource.core.BaseResourceManager;

public class ResourceDescriptor2491
extends BaseResourceManager {
    UniversalIdentityComparator G;

    public ResourceDescriptor2491(UniversalIdentityComparator universalIdentityComparator, BytecodeAnalyzer bytecodeAnalyzer) {
        super('@', bytecodeAnalyzer);
        this.G = universalIdentityComparator;
    }

    public String toString() {
        return this.G.toString();
    }
}

