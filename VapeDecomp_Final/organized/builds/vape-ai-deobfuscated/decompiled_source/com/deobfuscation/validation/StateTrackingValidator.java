/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.validation;

public class StateTrackingValidator<T> {
    private static int[] v;
    private T F;
    private boolean p = false;

    public static int[] d() {
        return v;
    }

    public static void n(int[] nArray) {
        v = nArray;
    }

    public boolean s() {
        return this.p;
    }

    public T f() {
        return this.F;
    }

    public void u(T t) {
        this.F = t;
        this.p = true;
    }

    public void j() {
        this.p = false;
    }

    static {
        if (StateTrackingValidator.d() == null) {
            StateTrackingValidator.n(new int[5]);
        }
    }
}

