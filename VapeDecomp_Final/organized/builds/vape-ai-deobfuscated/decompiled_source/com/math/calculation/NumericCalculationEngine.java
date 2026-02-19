/*
 * Decompiled with CFR 0.152.
 */
package com.math.calculation;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;

public class NumericCalculationEngine {
    private static AbstractComputationKernel[] n;
    public static final double z = 57.29577951308232;
    private float j;
    private float k;
    public static final double C = Math.PI / 180;

    public boolean A(NumericCalculationEngine numericCalculationEngine) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.u(numericCalculationEngine) || !((double)Math.abs(this.k - numericCalculationEngine.k) < 0.1)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericCalculationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericCalculationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (NumericCalculationEngine.T() != null) {
            NumericCalculationEngine.H(new AbstractComputationKernel[1]);
        }
    }

    public NumericCalculationEngine(float f, float f2) {
        this.j = f;
        this.k = f2;
    }

    public boolean u(NumericCalculationEngine numericCalculationEngine) {
        boolean bl;
        block5: {
            block4: {
                float f = Math.abs(AdaptiveComputationEngine.v(this.j) - AdaptiveComputationEngine.v(numericCalculationEngine.j));
                try {
                    try {
                        if (!((double)f < 0.1) && !((double)f > 359.9)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericCalculationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericCalculationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public NumericCalculationEngine Z() {
        return new NumericCalculationEngine(AdaptiveComputationEngine.v(this.j), this.k);
    }

    public static void H(AbstractComputationKernel[] abstractComputationKernelArray) {
        n = abstractComputationKernelArray;
    }

    public float g() {
        return this.k;
    }

    public NumericCalculationEngine(double d2, double d3) {
        this((float)d2, (float)d3);
    }

    public boolean k(NumericCalculationEngine numericCalculationEngine, float f) {
        boolean bl;
        block7: {
            block6: {
                float f2 = Math.abs(AdaptiveComputationEngine.v(this.j) - AdaptiveComputationEngine.v(numericCalculationEngine.j));
                float f3 = Math.abs(this.k - numericCalculationEngine.k);
                try {
                    try {
                        try {
                            if (!(f2 < f) && !(f2 > 360.0f - f)) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw NumericCalculationEngine.a(customSystemException);
                        }
                        if (!(f3 < f)) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NumericCalculationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericCalculationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public NumericCalculationEngine Y(NumericCalculationEngine numericCalculationEngine) {
        return new NumericCalculationEngine(this.j - numericCalculationEngine.j, this.k - numericCalculationEngine.k);
    }

    public NumericCalculationEngine L(NumericCalculationEngine numericCalculationEngine) {
        return new NumericCalculationEngine(this.j + numericCalculationEngine.j, this.k + numericCalculationEngine.k);
    }

    public float D() {
        return this.j;
    }

    public static AbstractComputationKernel[] T() {
        return n;
    }

    public double u() {
        return Math.abs(this.j) + Math.abs(this.k);
    }
}

