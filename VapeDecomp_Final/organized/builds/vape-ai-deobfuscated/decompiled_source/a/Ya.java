/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.database.QueryBuilder;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.calculation.NumericCalculationEngine;
import com.random.generation.RandomGenerationEngine;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Ya
extends RandomGenerationEngine {
    public float H;
    private boolean X;
    private boolean M;
    public static final float Y = -999.0f;
    private boolean L;
    private boolean C;
    private boolean D;
    public float a;
    private boolean G;

    @Override
    public void z(QueryBuilder queryBuilder) {
        if (this.e()) {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = queryBuilder.getThePlayer();
            try {
                if (systemConfigurationOrchestrator.q() != this.f) {
                    systemConfigurationOrchestrator.a(this.f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Ya.a(customSystemException);
            }
            try {
                if (systemConfigurationOrchestrator.A() != this.F) {
                    systemConfigurationOrchestrator.z(this.F);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Ya.a(customSystemException);
            }
            try {
                if (systemConfigurationOrchestrator.S() != this.n) {
                    systemConfigurationOrchestrator.f(this.n);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Ya.a(customSystemException);
            }
            try {
                if (systemConfigurationOrchestrator.Q() != this.U) {
                    systemConfigurationOrchestrator.G(this.U);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Ya.a(customSystemException);
            }
        }
    }

    public float I() {
        return this.a;
    }

    public boolean Y() {
        return this.D;
    }

    public void F(boolean bl) {
        this.X = bl;
    }

    public boolean L() {
        return this.M;
    }

    @Override
    public boolean q() {
        block17: {
            block21: {
                double d2;
                double d3;
                block19: {
                    float f;
                    block20: {
                        block22: {
                            double d4;
                            block18: {
                                block16: {
                                    try {
                                        if (this.a == -999.0f) {
                                            return true;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Ya.a(customSystemException);
                                    }
                                    float f2 = ConfigurationCalibrator.b.E();
                                    int n = (int)this.u;
                                    int n2 = (int)(-this.k);
                                    float f3 = f2 * 0.6f + 0.2f;
                                    float f4 = f3 * f3 * f3 * 8.0f;
                                    float f5 = (float)n * f4;
                                    float f6 = (float)n2 * f4;
                                    float f7 = (float)((double)this.A() + (double)f5 * 0.15);
                                    float f8 = (float)((double)this.L() - (double)f6 * 0.15);
                                    d3 = AdaptiveComputationEngine.a((this.a - f7) % 360.0f);
                                    double d5 = AdaptiveComputationEngine.a((this.H - f8) % 360.0f);
                                    d4 = Math.abs(d3);
                                    double d6 = Math.abs(d5);
                                    d2 = (double)this.e() * 0.25;
                                    double d7 = d4 / d6;
                                    try {
                                        if (!this.C || !(d7 < 1.0)) break block16;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Ya.a(customSystemException);
                                    }
                                    d2 *= d7;
                                }
                                float f9 = ConfigurationCalibrator.b.E();
                                float f10 = f9 * 0.6f + 0.2f;
                                float f11 = f10 * f10 * f10 * 8.0f;
                                f = (float)(0.0 + (double)f11 * 0.15);
                                try {
                                    if (Math.round(d4 / (double)f) <= (long)Math.max(Math.round(this.Z / f), 0)) break block17;
                                    if (!this.M) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Ya.a(customSystemException);
                                }
                                d2 *= (225.0 + d4) / 180.0;
                                break block22;
                            }
                            if (this.D) {
                                d2 += d4 * 0.05;
                            } else if (this.L) {
                                double d8 = d4 / 100.0;
                                double d9 = 0.4;
                                double d10 = 1.0;
                                double d11 = -0.7;
                                double d12 = d10 + 1.0;
                                d2 *= Math.min(Math.max(1.0, d9 + d12 * Math.pow(d8 - d11, 3.0) + d10 * Math.pow(d8 - d11, 2.0)), 4.0);
                            }
                        }
                        try {
                            try {
                                if (!this.X) break block19;
                                if (!(d3 > 0.0)) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Ya.a(customSystemException);
                            }
                            this.u = (float)((double)this.u + Math.min(d2, d3 / (double)f));
                            break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Ya.a(customSystemException);
                        }
                    }
                    this.u = (float)((double)this.u - Math.min(d2, Math.abs(d3 / (double)f)));
                    break block21;
                }
                try {
                    this.u = d3 > 0.0 ? (float)((double)this.u + d2) : (float)((double)this.u - d2);
                }
                catch (CustomSystemException customSystemException) {
                    throw Ya.a(customSystemException);
                }
            }
            return false;
        }
        return true;
    }

    public boolean o() {
        return this.L;
    }

    public void i(boolean bl) {
        this.C = bl;
    }

    public boolean s() {
        return this.X;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean e() {
        return this.G;
    }

    public boolean k() {
        return this.C;
    }

    public void u(boolean bl) {
        this.G = bl;
    }

    public void E(boolean bl) {
        this.M = bl;
    }

    public void v(boolean bl) {
        this.L = bl;
    }

    public Ya(float f, float f2) {
        this.a = f;
        this.H = f2;
    }

    public float G() {
        return this.H;
    }

    public void J(boolean bl) {
        this.D = bl;
    }

    public void v(float f, float f2) {
        this.a = f;
        this.H = f2;
        this.X(false);
    }

    public float L() {
        return ((CryptographicTransformer)ApplicationLifecycleManager.g()).S();
    }

    public void g(NumericCalculationEngine numericCalculationEngine) {
        this.v(numericCalculationEngine.D(), numericCalculationEngine.g());
    }

    @Override
    public boolean x() {
        block18: {
            block22: {
                double d2;
                double d3;
                block20: {
                    float f;
                    block21: {
                        block23: {
                            double d4;
                            block19: {
                                block17: {
                                    try {
                                        if (this.H == -999.0f) {
                                            return true;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Ya.a(customSystemException);
                                    }
                                    float f2 = this.L();
                                    if (f2 == -90.0f) {
                                        f2 = -89.99f;
                                    }
                                    float f3 = ConfigurationCalibrator.b.E();
                                    int n = (int)this.u;
                                    int n2 = (int)(-this.k);
                                    float f4 = f3 * 0.6f + 0.2f;
                                    float f5 = f4 * f4 * f4 * 8.0f;
                                    float f6 = (float)n * f5;
                                    float f7 = (float)n2 * f5;
                                    float f8 = (float)((double)this.A() + (double)f6 * 0.15);
                                    float f9 = (float)((double)f2 - (double)f7 * 0.15);
                                    double d5 = AdaptiveComputationEngine.v((this.a - f8) % 360.0f);
                                    d3 = AdaptiveComputationEngine.v((this.H - f9) % 360.0f);
                                    double d6 = Math.abs(d5);
                                    d4 = Math.abs(d3);
                                    d2 = (double)this.e() * 0.25;
                                    double d7 = d4 / d6;
                                    try {
                                        if (!this.C || !(d7 < 1.0)) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw Ya.a(customSystemException);
                                    }
                                    d2 *= d7;
                                }
                                float f10 = ConfigurationCalibrator.b.E();
                                float f11 = f10 * 0.6f + 0.2f;
                                float f12 = f11 * f11 * f11 * 8.0f;
                                f = (float)(0.0 + (double)f12 * 0.15);
                                try {
                                    if (Math.round(d4 / (double)f) <= (long)Math.max(Math.round(this.Z / f), 0)) break block18;
                                    if (!this.M) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw Ya.a(customSystemException);
                                }
                                d2 *= (135.0 + d4) / 90.0;
                                break block23;
                            }
                            if (this.D) {
                                d2 += d4 * 0.05;
                            } else if (this.L) {
                                double d8 = d4 / 75.0;
                                double d9 = 0.4;
                                double d10 = 1.0;
                                double d11 = -0.7;
                                double d12 = d10 + 1.0;
                                d2 *= Math.max(1.0, d9 + d12 * Math.pow(d8 - d11, 3.0) + d10 * Math.pow(d8 - d11, 2.0));
                            }
                        }
                        try {
                            try {
                                if (!this.X) break block20;
                                if (!(d3 > 0.0)) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw Ya.a(customSystemException);
                            }
                            this.k = (float)((double)this.k + Math.min(d2, d3 / (double)f));
                            break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw Ya.a(customSystemException);
                        }
                    }
                    this.k = (float)((double)this.k - Math.min(d2, Math.abs(d3 / (double)f)));
                    break block22;
                }
                try {
                    this.k = d3 > 0.0 ? (float)((double)this.k + d2) : (float)((double)this.k - d2);
                }
                catch (CustomSystemException customSystemException) {
                    throw Ya.a(customSystemException);
                }
            }
            return false;
        }
        return true;
    }

    public float A() {
        return ((CryptographicTransformer)ApplicationLifecycleManager.g()).q();
    }

    public Ya(NumericCalculationEngine numericCalculationEngine) {
        this.a = numericCalculationEngine.D();
        this.H = numericCalculationEngine.g();
    }
}

