/*
 * Decompiled with CFR 0.152.
 */
package com.math.strategy;

import com.graphics.palette.ColorPaletteGenerator1110;
import com.ui.events.UserInteractionEventDispatcher;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface MathematicalOperationStrategy {
    public static final double i = 110.0;
    public static final double t = 20.0;
    public static final ColorPaletteGenerator1110 M = new ColorPaletteGenerator1110();

    public void b(double var1);

    public double G();

    public boolean f();

    default public double e() {
        return 0.0;
    }

    public double b();

    public void T(double var1);

    default public void U() {
    }

    default public void g() {
    }

    default public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    default public double z() {
        return 0.0;
    }

    default public void R(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    public double W();

    default public void d() {
    }

    default public void j() {
    }

    public void M(double var1);

    default public void G() {
    }

    public void w(double var1);

    public double w();
}

