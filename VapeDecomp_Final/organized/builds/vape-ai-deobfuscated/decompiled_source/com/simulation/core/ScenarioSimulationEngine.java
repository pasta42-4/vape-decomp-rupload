/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.simulation.core;

import a.hQ;
import com.concurrency.management.AsyncExecutionCoordinator;
import com.math.transformation.NumericTransformationEngine;
import com.ui.rendering.GraphicalRenderingController;
import org.jetbrains.annotations.Nullable;

public class ScenarioSimulationEngine
extends hQ {
    @Nullable
    protected AsyncExecutionCoordinator D;
    private static int[] Y;
    protected final NumericTransformationEngine L;

    @Nullable
    public AsyncExecutionCoordinator J() {
        return this.D;
    }

    public static void b(int[] nArray) {
        Y = nArray;
    }

    public ScenarioSimulationEngine(NumericTransformationEngine numericTransformationEngine) {
        this.L = numericTransformationEngine;
        this.C(this::M);
    }

    public static int[] y() {
        return Y;
    }

    private void M() {
        this.D = GraphicalRenderingController.v(this, this.L, AsyncExecutionCoordinator.class);
        this.D.d(true);
    }

    public NumericTransformationEngine t() {
        return this.L;
    }

    static {
        if (ScenarioSimulationEngine.y() != null) {
            ScenarioSimulationEngine.b(new int[5]);
        }
    }
}

