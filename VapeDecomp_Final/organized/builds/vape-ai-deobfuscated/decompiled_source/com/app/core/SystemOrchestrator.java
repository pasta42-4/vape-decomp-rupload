/*
 * Decompiled with CFR 0.152.
 */
package com.app.core;

import com.system.resource.ResourceOrchestrationManager;

public class SystemOrchestrator {
    int o;
    int p;
    final ResourceOrchestrationManager v;

    public void W(int n) {
        this.p = n;
    }

    public SystemOrchestrator(ResourceOrchestrationManager resourceOrchestrationManager, int n, int n2) {
        this.v = resourceOrchestrationManager;
        this.o = n;
        this.p = n2;
    }

    public void P(int n) {
        this.o = n;
    }

    public int G() {
        return this.p;
    }

    public int M() {
        return this.o;
    }
}

