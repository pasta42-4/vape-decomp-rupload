/*
 * Decompiled with CFR 0.152.
 */
package com.math.geometry;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;

public class GeometricCalculator1575 {
    private final double z;
    private static int[] L;
    private int S = ApplicationLifecycleManager.e();
    private final double X;
    private int Z = 1;
    private int e = ApplicationLifecycleManager.b();

    public double j() {
        return this.z;
    }

    static {
        if (GeometricCalculator1575.o() == null) {
            GeometricCalculator1575.G(new int[1]);
        }
    }

    public static void G(int[] nArray) {
        L = nArray;
    }

    public GeometricCalculator1575() {
        boolean bl = false;
        int n = ApplicationLifecycleManager.N().p();
        if (n == 0) {
            n = 1000;
        }
        try {
            while (true) {
                try {
                    try {
                        if (this.Z >= n || this.S / (this.Z + 1) < 320) break;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricCalculator1575.a(customSystemException);
                    }
                    if (this.e / (this.Z + 1) < 240) break;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricCalculator1575.a(customSystemException);
                }
                ++this.Z;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeometricCalculator1575.a(customSystemException);
        }
        this.z = (double)this.S / (double)this.Z;
        this.X = (double)this.e / (double)this.Z;
        this.S = AdaptiveComputationEngine.j(this.z);
        this.e = AdaptiveComputationEngine.j(this.X);
    }

    public int J() {
        return this.Z;
    }

    public int s() {
        return this.S;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public double x() {
        return this.X;
    }

    public int Z() {
        return this.e;
    }

    public static int[] o() {
        return L;
    }
}

