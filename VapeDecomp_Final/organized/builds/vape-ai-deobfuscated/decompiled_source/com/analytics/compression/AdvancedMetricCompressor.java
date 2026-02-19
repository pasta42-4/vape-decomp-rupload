/*
 * Decompiled with CFR 0.152.
 */
package com.analytics.compression;

import com.analytics.computation.MetricsCalculationEngine;
import com.app.math.NumericStreamProcessor;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.geospatial.calculation.GeographicalPositionCalculator;
import com.numeric.precision.NumericPrecisionTransformer;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.system.resources.ResourceAllocationCoordinator919;
import com.ui.events.UserInteractionEventDispatcher;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Key;
import java.text.DecimalFormat;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AdvancedMetricCompressor
extends GeographicalPositionCalculator {
    private NumericStreamProcessor dm;
    protected NumericStreamProcessor V;
    private ResourceAllocationCoordinator919 de;
    private Double dV;
    private double d9;
    private double E;
    private double dq;
    private NumericPrecisionTransformer dt;
    private double F;
    private boolean dD;
    private static final long bb;
    private String dR;
    private MetricsCalculationEngine di;
    private double dX;
    private static final long ab;
    private Color b;
    private int D;

    @Override
    public void g() {
        try {
            if (!this.dD) {
                this.V.c();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMetricCompressor.a(customSystemException);
        }
        this.dD = true;
    }

    private void a() {
        block8: {
            double d2;
            block10: {
                block9: {
                    try {
                        try {
                            if (!this.Y) break block8;
                            if (SystemDiagnosticAnalyzer.A(CipherConfigurationMode.LEFT_CLICK.ordinal())) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdvancedMetricCompressor.a(customSystemException);
                        }
                        this.Y = false;
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMetricCompressor.a(customSystemException);
                    }
                }
                double d3 = (double)this.L.X - this.G() + this.f() - this.J() - this.di.t() / 2.0;
                double d4 = this.G() + this.J() + this.di.t() / 2.0;
                double d5 = this.G() + this.w() - 5.0 - this.di.t() / 2.0;
                d2 = this.f(this.F, this.E, d4, d5, this.d9, d3);
                d2 = new BigDecimal("" + d2).setScale(this.D, RoundingMode.HALF_UP).doubleValue();
                try {
                    try {
                        if (this.dt == null) break block8;
                        if (!((Double)this.dt.J()).equals(this.dV)) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdvancedMetricCompressor.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMetricCompressor.a(customSystemException);
                }
            }
            this.dt.r(d2);
        }
    }

    public String A() {
        return this.dR;
    }

    @Override
    public double z() {
        return 25.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = MultiContainerRegistry.a(4413584158176892149L, 5234515388962871228L, MethodHandles.lookup().lookupClass()).a(18101776270430L);
        long l = ab ^ 0x45DD38DB0397L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -3759265387137092208L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                bb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public DecimalFormat V() {
        return this.dt.J();
    }

    public double D() {
        return this.E;
    }

    @Override
    public void G() {
        this.a();
        this.S();
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(this.dX);
        double d2 = cryptographicParameterGenerator.B(this.O());
        double d3 = this.V.t();
        double d4 = this.W() + 12.5 + d2;
        double d5 = this.G() + this.dm.t();
        cryptographicParameterGenerator.R(this.O(), this.G() + this.J(), this.W() + 5.0, this.b);
        this.de.b(this.G() + this.w() - 5.0 - this.de.w());
        this.de.M(this.W() + 5.0);
        this.di = this.K(d5, d4 + 0.5, this.V.p() / 2.0);
        double d6 = this.di.K() - this.G() - this.J();
        double d7 = this.G() + this.w() - this.di.K() - 5.0;
        try {
            if (d6 > 0.0) {
                ConfigurationManager.o(this.G() + this.J(), d4 + 0.5, d6 - 1.5, 1.0, M.j(), false, 0.5f, 1.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMetricCompressor.a(customSystemException);
        }
        try {
            if (d7 > 0.0) {
                ConfigurationManager.o(this.di.K() + 9.5, d4 + 0.5, d7 - 9.5, 1.0, AdvancedMetricCompressor.M.S, false, 0.5f, 1.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMetricCompressor.a(customSystemException);
        }
        ConfigurationManager.h((float)(d5 - d3 / 2.0), (float)(d4 + 0.5 - d3 / 2.0), (float)d3, 1.0f, M.j(), 0.0, this.l());
    }

    public double x() {
        return this.d9;
    }

    @Override
    public void Y(double d2) {
        try {
            if (this.w() == d2) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMetricCompressor.a(customSystemException);
        }
        super.Y(d2);
        this.y(true);
    }

    public double c() {
        return this.F;
    }

    public NumericPrecisionTransformer Q() {
        return this.dt;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        MetricsCalculationEngine metricsCalculationEngine = new MetricsCalculationEngine(this.G(), this.di.q(), this.w(), this.di.V());
        try {
            if (metricsCalculationEngine.O(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) {
                this.L = GraphicsBufferAllocator.b();
                this.Y = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMetricCompressor.a(customSystemException);
        }
    }

    private void lambda$new$0(NumericPrecisionTransformer numericPrecisionTransformer) {
        this.y(false);
    }

    @Override
    public double e() {
        return 110.0;
    }

    private double r(double d2) {
        double d3;
        try {
            double d4 = d3 = this.dt != null ? ((Double)this.dt.J() - this.F) / (this.E - this.F) : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMetricCompressor.a(customSystemException);
        }
        if (d3 > 1.0) {
            d3 = 1.0;
        } else if (d3 < 0.0) {
            d3 = 0.0;
        }
        return (d2 - this.V.p()) * d3 + this.J() + this.V.p() / 2.0;
    }

    public AdvancedMetricCompressor(NumericPrecisionTransformer numericPrecisionTransformer) {
        this(numericPrecisionTransformer.O(), numericPrecisionTransformer.q(), numericPrecisionTransformer.p(), numericPrecisionTransformer.o());
        this.dR = numericPrecisionTransformer.I();
        this.dt = numericPrecisionTransformer;
        if (numericPrecisionTransformer.d() != null) {
            this.g(numericPrecisionTransformer.d());
        }
        this.L(numericPrecisionTransformer);
        numericPrecisionTransformer.P(this::lambda$new$0);
        this.y(true);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AdvancedMetricCompressor(String string, double d2, double d3, double d4) {
        long l = ab ^ 0xD3B4B304EEL;
        super(string);
        this.dR = "";
        this.dX = 0.75;
        this.D = 1;
        this.di = new MetricsCalculationEngine(0.0, 0.0, 0.0, 0.0);
        this.dm = new NumericStreamProcessor(0.0, 0.0, 0.0);
        this.V = new NumericStreamProcessor(0.15, 7.0, 8.0);
        this.b = AdvancedMetricCompressor.M.n;
        this.dV = -1.0;
        this.F = d2;
        this.E = d3;
        this.d9 = d4;
        this.dq = (double)((int)(d3 * 100.0) - (int)(d2 * 100.0)) / 10000.0;
        this.de = new ResourceAllocationCoordinator919(this);
        this.o(this.de);
        if (d4 <= 0.01) {
            this.D = (int)bb;
        }
    }

    public void o(double d2) {
        this.E = d2;
    }

    public void C(double d2) {
        this.d9 = d2;
    }

    @Override
    public void d() {
        block4: {
            try {
                try {
                    if (!this.dD || this.s()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdvancedMetricCompressor.a(customSystemException);
                }
                this.V.c();
                this.dD = false;
            }
            catch (CustomSystemException customSystemException) {
                throw AdvancedMetricCompressor.a(customSystemException);
            }
        }
    }

    private void y(boolean bl) {
        double d2 = this.w() - (this.J() + 5.0);
        double d3 = this.r(d2);
        double d4 = this.dm.t();
        try {
            this.dm = new NumericStreamProcessor(0.05, d4, d3);
            this.dm.o();
            if (bl) {
                this.dm.L();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdvancedMetricCompressor.a(customSystemException);
        }
    }

    public void u(double d2) {
        this.F = d2;
    }
}

