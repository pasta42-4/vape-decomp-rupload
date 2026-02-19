/*
 * Decompiled with CFR 0.152.
 */
package com.state.management;

import com.core.computation.AbstractComputationKernel;

public class StateChangeMonitor {
    private static AbstractComputationKernel[] U;
    private boolean A = true;

    public void y() {
        this.A = false;
    }

    public static void g(AbstractComputationKernel[] abstractComputationKernelArray) {
        U = abstractComputationKernelArray;
    }

    public boolean D() {
        return this.A;
    }

    public static AbstractComputationKernel[] t() {
        return U;
    }

    public void c() {
        this.A = true;
    }

    static {
        if (StateChangeMonitor.t() != null) {
            StateChangeMonitor.g(new AbstractComputationKernel[4]);
        }
    }
}

