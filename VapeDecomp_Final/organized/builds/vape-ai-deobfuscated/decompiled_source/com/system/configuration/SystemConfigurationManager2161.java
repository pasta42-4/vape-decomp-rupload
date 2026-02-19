/*
 * Decompiled with CFR 0.152.
 */
package com.system.configuration;

import com.runtime.context.LightweightExecutionContext;

public class SystemConfigurationManager2161 {
    private boolean j;
    private final LightweightExecutionContext o;
    private final int W;

    public LightweightExecutionContext s() {
        return this.o;
    }

    public void o(boolean bl) {
        this.j = bl;
    }

    public SystemConfigurationManager2161(int n, LightweightExecutionContext lightweightExecutionContext) {
        this.W = n;
        this.o = lightweightExecutionContext;
    }

    public boolean c() {
        return this.j;
    }

    public int y() {
        return this.W;
    }
}

