/*
 * Decompiled with CFR 0.152.
 */
package com.network.pool;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;
import com.resource.management.ResourceLifecycleManager1859;

public class ConnectionPoolConfiguration
extends CollectionOrchestrator1895 {
    public ResourceLifecycleManager1859 A;
    public int Z;

    public void T(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.E(this.Z, this.A.i());
    }

    public ConnectionPoolConfiguration(int n, ResourceLifecycleManager1859 resourceLifecycleManager1859) {
        super(-1);
        this.Z = n;
        this.A = resourceLifecycleManager1859;
    }
}

