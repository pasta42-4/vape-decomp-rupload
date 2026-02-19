/*
 * Decompiled with CFR 0.152.
 */
package com.app.rendering.graphics;

import com.core.computation.AbstractComputationKernel;
import com.system.configuration.ConfigurationManager;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;

public class VisualizationRenderer
extends AbstractComputationKernel {
    double E = 110.0;
    private static String[] L;
    private double D;
    private Color V;

    @Override
    public void g() {
    }

    public static String[] R() {
        return L;
    }

    @Override
    public void U() {
        ConfigurationManager.A(this.G(), this.W(), this.w(), this.b(), this.V);
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public double b() {
        return this.z();
    }

    public VisualizationRenderer(Color color) {
        this(color, 0.5);
    }

    public VisualizationRenderer(Color color, double d2, double d3) {
        this.V = color;
        this.D = d2;
        this.E = d3;
    }

    public static void Z(String[] stringArray) {
        L = stringArray;
    }

    public VisualizationRenderer(Color color, double d2) {
        this.V = color;
        this.D = d2;
    }

    @Override
    public void G() {
        ConfigurationManager.A(this.G(), this.W(), this.w(), this.b(), this.V);
    }

    @Override
    public double z() {
        return this.D;
    }

    @Override
    public void d() {
    }

    static {
        if (VisualizationRenderer.R() != null) {
            VisualizationRenderer.Z(new String[4]);
        }
    }

    @Override
    public double e() {
        return this.E;
    }
}

