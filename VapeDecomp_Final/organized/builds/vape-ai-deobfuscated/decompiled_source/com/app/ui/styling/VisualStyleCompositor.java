/*
 * Decompiled with CFR 0.152.
 */
package com.app.ui.styling;

import com.app.workflow.StateTrackingCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class VisualStyleCompositor
extends AbstractComputationKernel {
    private String V;
    private float E;
    private Color D;
    private float b;

    @Override
    public void G() {
        float f = this.Q() / 2.0f;
        float f2 = this.u() / 2.0f;
        StateTrackingCoordinator.B(this.D, (float)this.G() + f, (float)this.W() + f2, this.V, this.E, this.b, false);
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    public void f(float f) {
        this.E = f;
    }

    public float u() {
        return this.b;
    }

    @Override
    public double e() {
        return this.E;
    }

    public void N(String string) {
        this.V = string;
    }

    @Override
    public double z() {
        return this.b;
    }

    @Override
    public void U() {
    }

    public void Y(Color color) {
        this.D = color;
    }

    public VisualStyleCompositor(String string, float f, float f2) {
        this(string, f, f2, Color.white);
    }

    public float Q() {
        return this.E;
    }

    public String g() {
        return this.V;
    }

    @Override
    public void g() {
    }

    public VisualStyleCompositor(String string, float f, float f2, Color color) {
        this.V = string;
        this.E = f;
        this.b = f2;
        this.D = color;
    }

    public void i(float f) {
        this.b = f;
    }

    public Color a() {
        return this.D;
    }

    @Override
    public void d() {
    }
}

