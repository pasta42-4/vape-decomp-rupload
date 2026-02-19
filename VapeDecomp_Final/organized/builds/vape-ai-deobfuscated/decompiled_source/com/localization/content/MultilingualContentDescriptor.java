/*
 * Decompiled with CFR 0.152.
 */
package com.localization.content;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.resource.management.ResourceLifecycleManager1859;

public class MultilingualContentDescriptor {
    public ResourceLifecycleManager1859 w;
    public String d;
    public ResourceLifecycleManager1859 n;
    public String C;
    public String Q;
    public int W;

    public void Y(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        bytecodeInstrumentationEngine.I(this.C, this.d, this.Q, this.n.i(), this.w.i(), this.W);
    }

    public MultilingualContentDescriptor(String string, String string2, String string3, ResourceLifecycleManager1859 resourceLifecycleManager1859, ResourceLifecycleManager1859 resourceLifecycleManager18592, int n) {
        this.C = string;
        this.d = string2;
        this.Q = string3;
        this.n = resourceLifecycleManager1859;
        this.w = resourceLifecycleManager18592;
        this.W = n;
    }
}

