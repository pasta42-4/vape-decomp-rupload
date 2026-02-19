/*
 * Decompiled with CFR 0.152.
 */
package com.cache.management;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;
import com.resource.management.ResourceLifecycleManager1859;

public class CacheInvalidationManager2353
extends CollectionOrchestrator1895 {
    public ResourceLifecycleManager1859 H;

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.r(this.Q, this.H.i());
        this.m(bytecodeInstrumentationEngine);
    }

    public CacheInvalidationManager2353(int n, ResourceLifecycleManager1859 resourceLifecycleManager1859) {
        super(n);
        this.H = resourceLifecycleManager1859;
    }
}

