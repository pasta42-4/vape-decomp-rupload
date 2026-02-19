/*
 * Decompiled with CFR 0.152.
 */
package com.math.geometry;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.math.calculation.NumericCalculationEngine;
import com.security.crypto.CryptoParameterGenerator;
import com.system.configuration.ConfigurationCalibrator;

public class GeometricCalculator {
    public static final double b = Math.PI / 180;
    public static final double I = 57.29577951308232;

    public static NumericCalculationEngine k(ContextualEventDispatcher contextualEventDispatcher, ContextualEventDispatcher contextualEventDispatcher2, float f, float f2) {
        double d2 = contextualEventDispatcher.X() - contextualEventDispatcher2.X();
        double d3 = contextualEventDispatcher.F() - contextualEventDispatcher2.F();
        double d4 = contextualEventDispatcher.f() - contextualEventDispatcher2.f();
        double d5 = (double)CryptoParameterGenerator.o((float)d2, (float)(-d4)) * 57.29577951308232;
        double d6 = Math.sqrt(d2 * d2 + d4 * d4);
        double d7 = (double)CryptoParameterGenerator.o((float)d3, (float)d6) * 57.29577951308232;
        float f3 = ConfigurationCalibrator.b.E();
        float f4 = f3 * 0.6f + 0.2f;
        float f5 = f4 * f4 * f4 * 8.0f;
        float f6 = (float)(0.0 + (double)f5 * 0.15);
        float f7 = AdaptiveComputationEngine.v((float)(d5 - (double)f));
        int n = Math.round(f7 / f6);
        float f8 = AdaptiveComputationEngine.v((float)(d7 - (double)f2));
        int n2 = Math.round(f8 / f6);
        return new NumericCalculationEngine(f + f6 * (float)n, f2 + f6 * (float)n2);
    }

    public static NumericCalculationEngine l(ContextualEventDispatcher contextualEventDispatcher, ContextualEventDispatcher contextualEventDispatcher2, float f, boolean bl) {
        double d2;
        double d3;
        block2: {
            double[] dArray = new double[]{contextualEventDispatcher.X() - contextualEventDispatcher2.X(), contextualEventDispatcher.F() - contextualEventDispatcher2.F(), contextualEventDispatcher.f() - contextualEventDispatcher2.f()};
            d3 = Math.atan2(dArray[0], -dArray[2]);
            double d4 = Math.sqrt(dArray[0] * dArray[0] + dArray[2] * dArray[2]);
            d2 = Math.atan2(dArray[1], d4);
            double d5 = d3 * 57.29577951308232;
            double d6 = (int)((d5 - (double)f) % 360.0);
            d6 = Math.abs(AdaptiveComputationEngine.a(d6));
            try {
                if (!bl || !(d6 > 90.0)) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw GeometricCalculator.a(customSystemException);
            }
            d2 = 90.0;
        }
        return new NumericCalculationEngine((float)(d3 * 57.29577951308232), (float)(d2 * 57.29577951308232));
    }

    public static ContextualEventDispatcher B(NumericCalculationEngine numericCalculationEngine) {
        float f = AdaptiveComputationEngine.S(-numericCalculationEngine.D() * ((float)Math.PI / 180) - (float)Math.PI);
        float f2 = AdaptiveComputationEngine.D(-numericCalculationEngine.D() * ((float)Math.PI / 180) - (float)Math.PI);
        float f3 = -AdaptiveComputationEngine.S(-numericCalculationEngine.g() * ((float)Math.PI / 180));
        float f4 = AdaptiveComputationEngine.D(-numericCalculationEngine.g() * ((float)Math.PI / 180));
        return ContextualEventDispatcher.N(f2 * f3, f4, f * f3);
    }

    public static NumericCalculationEngine F(NumericCalculationEngine numericCalculationEngine, NumericCalculationEngine numericCalculationEngine2) {
        float f = AdaptiveComputationEngine.v(numericCalculationEngine2.D()) - AdaptiveComputationEngine.v(numericCalculationEngine.D());
        if (f <= -180.0f) {
            f += 360.0f;
        } else if (f > 180.0f) {
            f -= 360.0f;
        }
        return new NumericCalculationEngine(f, numericCalculationEngine2.g() - numericCalculationEngine.g());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

