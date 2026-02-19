/*
 * Decompiled with CFR 0.152.
 */
package com.ui.rendering;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import java.awt.Color;
import java.util.concurrent.atomic.AtomicBoolean;

public class UIRenderingController1597 {
    public AtomicBoolean h;
    public int n;
    public Color Z;
    private static AbstractComputationKernel[] f;
    public int N;
    public int D;
    public int x;

    public boolean D() {
        try {
            if (this.h == null) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UIRenderingController1597.a(customSystemException);
        }
        return this.h.get();
    }

    static {
        if (UIRenderingController1597.R() != null) {
            UIRenderingController1597.U(new AbstractComputationKernel[2]);
        }
    }

    public static void U(AbstractComputationKernel[] abstractComputationKernelArray) {
        f = abstractComputationKernelArray;
    }

    public int g() {
        return this.N;
    }

    public UIRenderingController1597(int n, int n2, int n3, int n4, Color color) {
        this(n, n2, n3, n4, color, null);
    }

    public int c() {
        return this.D;
    }

    public UIRenderingController1597(int n, int n2, int n3, int n4, Color color, AtomicBoolean atomicBoolean) {
        this.N = n;
        this.n = n2;
        this.D = n3;
        this.x = n4;
        this.Z = color;
        this.h = atomicBoolean;
    }

    public static AbstractComputationKernel[] R() {
        return f;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int Z() {
        return this.n;
    }
}

