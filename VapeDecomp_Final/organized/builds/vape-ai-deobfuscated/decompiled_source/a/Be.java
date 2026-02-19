/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.core.computation.AbstractComputationKernel;
import com.ui.events.UserInteractionEventDispatcher;

public class bE
extends AbstractComputationKernel {
    private double V;
    private static String[] v;
    private double n;

    public static void Z(String[] stringArray) {
        v = stringArray;
    }

    @Override
    public void T(double d2) {
        super.T(d2);
    }

    @Override
    public void U() {
    }

    static {
        if (bE.E() != null) {
            bE.Z(new String[2]);
        }
    }

    @Override
    public double e() {
        return this.V;
    }

    public bE(double d2, double d3) {
        this.V = d2;
        this.n = d3;
        this.T(d2);
        this.w(d3);
    }

    public static String[] E() {
        return v;
    }

    @Override
    public void g() {
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    @Override
    public double z() {
        return this.n;
    }

    @Override
    public void G() {
    }

    @Override
    public void w(double d2) {
        super.w(d2);
        this.P(d2);
        this.n = d2;
    }

    @Override
    public void d() {
    }
}

