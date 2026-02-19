/*
 * Decompiled with CFR 0.152.
 */
package com.data.access;

import a.FR;
import com.exception.system.CustomSystemException;
import com.geospatial.transformation.GeospatialCoordinateTransformer;
import com.math.computation.GeometricComputationEngine920;
import com.security.exchange.SecureDataExchanger793;

public class DataAccessMediator {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static GeospatialCoordinateTransformer v(FR fR, SecureDataExchanger793 secureDataExchanger793, SecureDataExchanger793 secureDataExchanger7932, SecureDataExchanger793 secureDataExchanger7933, int n, int n2) {
        SecureDataExchanger793 secureDataExchanger7934 = secureDataExchanger7932.E(secureDataExchanger793);
        SecureDataExchanger793 secureDataExchanger7935 = secureDataExchanger7933.E(secureDataExchanger7934);
        GeometricComputationEngine920 geometricComputationEngine920 = new GeometricComputationEngine920(fR.S, fR.p, fR.D, 1.0f);
        try {
            secureDataExchanger7935.f(geometricComputationEngine920, geometricComputationEngine920);
            if (geometricComputationEngine920.n <= 0.01f) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataAccessMediator.a(customSystemException);
        }
        float f = geometricComputationEngine920.F / geometricComputationEngine920.n;
        float f2 = geometricComputationEngine920.s / geometricComputationEngine920.n;
        float f3 = (f * 0.5f + 0.5f) * (float)n;
        float f4 = (1.0f - (f2 * 0.5f + 0.5f)) * (float)n2;
        return new GeospatialCoordinateTransformer(f3, f4);
    }
}

