/*
 * Decompiled with CFR 0.152.
 */
package com.app.geometry.calculation;

import com.exception.system.CustomSystemException;

public class GeometricTransformCalculator2273 {
    public float g;
    public float N;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean r(GeometricTransformCalculator2273 geometricTransformCalculator2273) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.N != geometricTransformCalculator2273.N || this.g != geometricTransformCalculator2273.g) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeometricTransformCalculator2273.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeometricTransformCalculator2273.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public GeometricTransformCalculator2273(float f, float f2) {
        this.N = f;
        this.g = f2;
    }
}

