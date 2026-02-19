/*
 * Decompiled with CFR 0.152.
 */
package com.structures.tree;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class RecursiveNodeTree
extends ObjectLifecycleTracker {
    private static RecursiveNodeTree e;
    private static RecursiveNodeTree k;
    private static RecursiveNodeTree A;

    public static RecursiveNodeTree V() {
        try {
            if (A == null) {
                A = new RecursiveNodeTree(RecursiveNodeTree.U.u().Lg.g());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTree.a(customSystemException);
        }
        return A;
    }

    public boolean y() {
        return RecursiveNodeTree.U.u().Lg.X(this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean c() {
        try {
            if (GeometryCalculator.C() >= GeometryCalculator.C) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTree.a(customSystemException);
        }
        return RecursiveNodeTree.U.u().Lg.e(this.H);
    }

    public boolean B() {
        return RecursiveNodeTree.U.u().Lg.x(this.H);
    }

    public boolean s() {
        return RecursiveNodeTree.U.u().Lg.J(this.H);
    }

    public RecursiveNodeTree(Object object) {
        super(object);
    }

    public boolean u() {
        return RecursiveNodeTree.U.u().Lg.M(this.H);
    }

    public static RecursiveNodeTree K() {
        try {
            if (e == null) {
                e = new RecursiveNodeTree(RecursiveNodeTree.U.u().Lg.p());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTree.a(customSystemException);
        }
        return e;
    }

    public static RecursiveNodeTree Q() {
        return new RecursiveNodeTree(RecursiveNodeTree.U.u().Lg.Q());
    }

    public static RecursiveNodeTree f() {
        try {
            if (k == null) {
                k = new RecursiveNodeTree(RecursiveNodeTree.U.u().Lg.L());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveNodeTree.a(customSystemException);
        }
        return k;
    }
}

