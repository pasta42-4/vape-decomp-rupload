/*
 * Decompiled with CFR 0.152.
 */
package com.math.geometry;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericComputationEngine1131;
import java.util.Objects;

public class GeometricCoordinateCalculator {
    private final double Q;
    private final double A;
    private static AbstractComputationKernel[] e;
    private final double u;

    public int W() {
        return AdaptiveComputationEngine.Q(this.A);
    }

    public double c() {
        return this.u;
    }

    public double E() {
        return this.Q;
    }

    public static AbstractComputationKernel[] D() {
        return e;
    }

    public boolean equals(Object object) {
        boolean bl;
        block15: {
            block14: {
                block13: {
                    try {
                        if (this == object) {
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricCoordinateCalculator.a(customSystemException);
                    }
                    try {
                        try {
                            if (object != null && this.getClass() == object.getClass()) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricCoordinateCalculator.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricCoordinateCalculator.a(customSystemException);
                    }
                }
                GeometricCoordinateCalculator geometricCoordinateCalculator = (GeometricCoordinateCalculator)object;
                try {
                    try {
                        try {
                            if (this.A != geometricCoordinateCalculator.A || this.Q != geometricCoordinateCalculator.Q) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricCoordinateCalculator.a(customSystemException);
                        }
                        if (this.u != geometricCoordinateCalculator.u) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricCoordinateCalculator.a(customSystemException);
                    }
                    bl = true;
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricCoordinateCalculator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public GeometricCoordinateCalculator(int n, int n2, int n3) {
        this.A = n;
        this.Q = n2;
        this.u = n3;
    }

    public double C() {
        double d2 = NumericComputationEngine1131.n();
        return this.u - d2;
    }

    public double Z() {
        return this.A;
    }

    static {
        if (GeometricCoordinateCalculator.D() != null) {
            GeometricCoordinateCalculator.i(new AbstractComputationKernel[5]);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int H() {
        return AdaptiveComputationEngine.Q(this.u);
    }

    public double e() {
        double d2 = NumericComputationEngine1131.b();
        return this.A - d2;
    }

    public double R() {
        double d2 = NumericComputationEngine1131.S();
        return this.Q - d2;
    }

    public int hashCode() {
        return Objects.hash(this.A, this.Q, this.u);
    }

    public int n() {
        return AdaptiveComputationEngine.Q(this.Q);
    }

    public GeometricCoordinateCalculator(double d2, double d3, double d4) {
        this.A = d2;
        this.Q = d3;
        this.u = d4;
    }

    public static void i(AbstractComputationKernel[] abstractComputationKernelArray) {
        e = abstractComputationKernelArray;
    }
}

