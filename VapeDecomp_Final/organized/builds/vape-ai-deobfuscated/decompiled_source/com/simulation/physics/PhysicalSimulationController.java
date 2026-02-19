/*
 * Decompiled with CFR 0.152.
 */
package com.simulation.physics;

import com.ui.rendering.UIRenderingController1597;
import java.awt.Color;

public class PhysicalSimulationController
extends UIRenderingController1597 {
    private final float Q;

    public PhysicalSimulationController(int n, int n2, int n3, int n4, Color color, float f) {
        super(n, n2, n3, n4, color);
        this.Q = f;
    }

    public float A() {
        return this.Q;
    }
}

