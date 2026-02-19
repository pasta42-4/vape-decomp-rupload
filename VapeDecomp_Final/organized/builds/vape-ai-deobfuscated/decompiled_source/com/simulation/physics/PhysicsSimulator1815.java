/*
 * Decompiled with CFR 0.152.
 */
package com.simulation.physics;

import com.exception.system.CustomSystemException;

public class PhysicsSimulator1815 {
    public float x;
    private static boolean W;
    public float R;
    public float h;
    public float I;
    public float m;
    public float P;
    public float j;
    public float q;
    public float w;

    public static boolean Q() {
        return W;
    }

    static {
        if (!PhysicsSimulator1815.Q()) {
            PhysicsSimulator1815.Q(true);
        }
    }

    public PhysicsSimulator1815(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.P = f;
        this.R = f3;
        this.j = f2;
        this.I = f4;
        this.h = f5;
        this.w = f7;
        this.q = f6;
        this.m = f8;
        this.x = f9;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void Q(boolean bl) {
        W = bl;
    }

    public static boolean u() {
        boolean bl = PhysicsSimulator1815.Q();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PhysicsSimulator1815.a(customSystemException);
        }
        return false;
    }
}

