/*
 * Decompiled with CFR 0.152.
 */
package com.app.rendering;

import com.core.computation.AbstractComputationKernel;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

public class GraphicalStyleRenderer1687
extends AbstractComputationKernel {
    private Color V;
    private static AbstractComputationKernel[] R;

    public static AbstractComputationKernel[] U() {
        return R;
    }

    @Override
    public void G() {
        ConfigurationManager.C(this.G() + 1.0, this.W(), this.w() - 2.0, this.b(), this.l(), 1.0f);
    }

    public GraphicalStyleRenderer1687(int n, int n2) {
        this.V = GraphicalStyleRenderer1687.M.a;
        this.T(n);
        this.w(n2);
        this.Q(this.V);
    }

    static {
        if (GraphicalStyleRenderer1687.U() != null) {
            GraphicalStyleRenderer1687.z(new AbstractComputationKernel[2]);
        }
    }

    public static void z(AbstractComputationKernel[] abstractComputationKernelArray) {
        R = abstractComputationKernelArray;
    }
}

