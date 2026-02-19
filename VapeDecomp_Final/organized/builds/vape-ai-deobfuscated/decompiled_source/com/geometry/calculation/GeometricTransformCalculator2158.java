/*
 * Decompiled with CFR 0.152.
 */
package com.geometry.calculation;

import com.exception.system.CustomSystemException;

public class GeometricTransformCalculator2158 {
    private float O;
    private float P;
    private float T;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public float G(float f, float f2) {
        block7: {
            block6: {
                this.O += f;
                f = (this.O - this.P) * f2;
                try {
                    try {
                        try {
                            this.T += (f - this.T) * 0.5f;
                            if (f > 0.0f && f > this.T) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeometricTransformCalculator2158.a(customSystemException);
                        }
                        if (!(f < 0.0f)) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricTransformCalculator2158.a(customSystemException);
                    }
                    if (!(f < this.T)) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricTransformCalculator2158.a(customSystemException);
                }
            }
            f = this.T;
        }
        this.P += f;
        return f;
    }
}

