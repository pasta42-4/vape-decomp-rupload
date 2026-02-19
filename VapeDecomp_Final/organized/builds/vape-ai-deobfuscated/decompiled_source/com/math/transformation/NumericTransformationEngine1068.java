/*
 * Decompiled with CFR 0.152.
 */
package com.math.transformation;

import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.security.transform.CryptographicTransformer;

public class NumericTransformationEngine1068 {
    private static int[] f;
    private final long A = System.currentTimeMillis();
    private double T;
    private float k;
    private float s;
    private double U;
    private double M;

    public long u() {
        return this.A;
    }

    public static int[] t() {
        return f;
    }

    public double h() {
        return this.T;
    }

    public void W(double d2, double d3, double d4) {
        this.T = d2;
        this.U = d3;
        this.M = d4;
    }

    public void Z(double d2) {
        this.M = d2;
    }

    public double z(CryptographicTransformer cryptographicTransformer) {
        return AdaptiveComputationEngine.O(new double[]{cryptographicTransformer.F() - this.T, cryptographicTransformer.V() - this.U, cryptographicTransformer.B() - this.M});
    }

    public static void Y(int[] nArray) {
        f = nArray;
    }

    public static double d(NumericTransformationEngine1068 numericTransformationEngine1068, NumericTransformationEngine1068 numericTransformationEngine10682) {
        block4: {
            ContextualEventDispatcher contextualEventDispatcher = NumericTransformationEngine1068.G(numericTransformationEngine1068);
            float[] fArray = NumericTransformationEngine1068.J(numericTransformationEngine1068.h(), numericTransformationEngine1068.i(), numericTransformationEngine1068.I(), numericTransformationEngine10682.h(), numericTransformationEngine10682.i(), numericTransformationEngine10682.I());
            ContextualEventDispatcher contextualEventDispatcher2 = NumericTransformationEngine1068.g(fArray[0], fArray[1]);
            ContextualEventDispatcher contextualEventDispatcher3 = contextualEventDispatcher.A(contextualEventDispatcher2.X() * Double.MAX_VALUE, contextualEventDispatcher2.F() * Double.MAX_VALUE, contextualEventDispatcher2.f() * Double.MAX_VALUE);
            oQ oQ2 = NumericTransformationEngine1068.a(numericTransformationEngine10682.h(), numericTransformationEngine10682.i(), numericTransformationEngine10682.I()).B(0.1, 0.1, 0.1);
            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = oQ2.x(contextualEventDispatcher, contextualEventDispatcher3);
            try {
                try {
                    if (networkPacketInterceptor1107 == null || !networkPacketInterceptor1107.r()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine1068.a(customSystemException);
                }
                return contextualEventDispatcher.x(networkPacketInterceptor1107.i());
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine1068.a(customSystemException);
            }
        }
        return 0.0;
    }

    public void W(double d2) {
        this.T = d2;
    }

    public static ContextualEventDispatcher G(NumericTransformationEngine1068 numericTransformationEngine1068) {
        return ContextualEventDispatcher.N(numericTransformationEngine1068.h(), numericTransformationEngine1068.i() + 1.62, numericTransformationEngine1068.I());
    }

    public double i() {
        return this.U;
    }

    public float k() {
        return this.s;
    }

    public double K(NumericTransformationEngine1068 numericTransformationEngine1068) {
        return AdaptiveComputationEngine.O(numericTransformationEngine1068.T - this.T, numericTransformationEngine1068.M - this.M);
    }

    public float Z() {
        return this.k;
    }

    public double X(CryptographicTransformer cryptographicTransformer) {
        return AdaptiveComputationEngine.O(cryptographicTransformer.F() - this.T, cryptographicTransformer.B() - this.M);
    }

    public static oQ a(double d2, double d3, double d4) {
        return oQ.E(d2 - 0.3, d3, d4 - 0.3, d2 + 0.3, d3 + 1.8, d4 + 0.3);
    }

    private static ContextualEventDispatcher g(float f, float f2) {
        float f3 = AdaptiveComputationEngine.S(-f * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = AdaptiveComputationEngine.D(-f * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -AdaptiveComputationEngine.S(-f2 * ((float)Math.PI / 180));
        float f6 = AdaptiveComputationEngine.D(-f2 * ((float)Math.PI / 180));
        return ContextualEventDispatcher.N(f4 * f5, f6, f3 * f5);
    }

    public void y(float f) {
        this.k = f;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void T(double d2) {
        this.U = d2;
    }

    public NumericTransformationEngine1068(double d2, double d3, double d4, float f, float f2) {
        this.T = d2;
        this.U = d3;
        this.M = d4;
        this.k = f;
        this.s = f2;
    }

    public NumericTransformationEngine1068(double d2, double d3, double d4) {
        this.T = d2;
        this.U = d3;
        this.M = d4;
    }

    public double X(NumericTransformationEngine1068 numericTransformationEngine1068) {
        return AdaptiveComputationEngine.O(new double[]{numericTransformationEngine1068.T - this.T, numericTransformationEngine1068.U - this.U, numericTransformationEngine1068.M - this.M});
    }

    public void H(float f) {
        this.s = f;
    }

    public static float[] J(double d2, double d3, double d4, double d5, double d6, double d7) {
        float f;
        float f2;
        block5: {
            double d8;
            double d9;
            block4: {
                d9 = d5 - d2;
                double d10 = d6 - d3;
                d8 = d7 - d4;
                double d11 = AdaptiveComputationEngine.C(d9 * d9 + d8 * d8);
                f2 = (float)Math.toDegrees(-Math.atan(d9 / d8));
                f = (float)(-Math.toDegrees(Math.atan(d10 / d11)));
                try {
                    if (!(d8 < 0.0) || !(d9 < 0.0)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw NumericTransformationEngine1068.a(customSystemException);
                }
                f2 = (float)(90.0 + Math.toDegrees(Math.atan(d8 / d9)));
                break block5;
            }
            try {
                if (!(d8 < 0.0) || !(d9 > 0.0)) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw NumericTransformationEngine1068.a(customSystemException);
            }
            f2 = (float)(-90.0 + Math.toDegrees(Math.atan(d8 / d9)));
        }
        return new float[]{f2, f};
    }

    public double I() {
        return this.M;
    }

    static {
        if (NumericTransformationEngine1068.t() == null) {
            NumericTransformationEngine1068.Y(new int[3]);
        }
    }
}

