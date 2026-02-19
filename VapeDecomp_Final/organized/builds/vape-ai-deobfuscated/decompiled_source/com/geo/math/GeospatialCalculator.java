/*
 * Decompiled with CFR 0.152.
 */
package com.geo.math;

import a._Y;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationProtocol2153;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.random.generation.RandomGenerationEngine;

public class GeospatialCalculator
extends RandomGenerationEngine
implements DataTransformationProtocol2153 {
    private double Y;
    private double E;
    private double T;

    @Override
    public ContextualEventDispatcher N() {
        return ContextualEventDispatcher.N(this.A(), this.J(), this.v());
    }

    @Override
    public boolean x() {
        block6: {
            block8: {
                block7: {
                    double d2 = _Y.z(ApplicationLifecycleManager.U(), this.E, this.Y, this.T);
                    try {
                        try {
                            try {
                                if (!(d2 > (double)this.Z) && !(d2 < (double)(-this.Z))) break block6;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GeospatialCalculator.a(customSystemException);
                            }
                            if (!_Y.L(ApplicationLifecycleManager.U(), this.E, this.Y, this.T)) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeospatialCalculator.a(customSystemException);
                        }
                        this.k += this.e();
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeospatialCalculator.a(customSystemException);
                    }
                }
                this.k -= this.e();
            }
            return false;
        }
        return true;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public double v() {
        return this.T;
    }

    public double J() {
        return this.Y;
    }

    public void u(double d2) {
        this.Y = d2;
    }

    public void P(double d2) {
        this.E = d2;
    }

    @Override
    public boolean q() {
        block4: {
            block6: {
                block5: {
                    double d2 = _Y.A(ApplicationLifecycleManager.U(), this.E, this.T);
                    try {
                        try {
                            if (!(d2 > (double)this.Z)) break block4;
                            if (!_Y.N(ApplicationLifecycleManager.U(), this.E, this.T)) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GeospatialCalculator.a(customSystemException);
                        }
                        this.u -= this.e();
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GeospatialCalculator.a(customSystemException);
                    }
                }
                this.u += this.e();
            }
            return false;
        }
        return true;
    }

    public void T(double d2) {
        this.T = d2;
    }

    public GeospatialCalculator(double d2, double d3, double d4) {
        this.E = d2;
        this.Y = d3;
        this.T = d4;
    }

    @Override
    public void F(ContextualEventDispatcher contextualEventDispatcher) {
        this.E = contextualEventDispatcher.X();
        this.Y = contextualEventDispatcher.F();
        this.T = contextualEventDispatcher.f();
    }

    public double A() {
        return this.E;
    }
}

