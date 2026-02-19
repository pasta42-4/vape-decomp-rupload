/*
 * Decompiled with CFR 0.152.
 */
package com.app.error.management;

import com.system.lifecycle.ObjectLifecycleTracker;

public class ErrorHandlingStrategy
extends ObjectLifecycleTracker {
    public static ErrorHandlingStrategy f(int n, int n2, int n3, int n4, int n5, int n6) {
        return new ErrorHandlingStrategy(ErrorHandlingStrategy.U.u().Ly.y(n, n2, n3, n4, n5, n6));
    }

    public ErrorHandlingStrategy(Object object) {
        super(object);
    }

    public boolean H(ErrorHandlingStrategy errorHandlingStrategy) {
        return ErrorHandlingStrategy.U.u().Ly.D(this.H, errorHandlingStrategy.M());
    }
}

