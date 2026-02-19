/*
 * Decompiled with CFR 0.152.
 */
package com.analytics.computation;

import a.HD;
import a.Ne;
import a._Y;
import com.app.graphics.GraphicsRenderingUtility1454;
import com.app.math.NumericStreamProcessor;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericComputationEngine1131;
import com.math.conversion.NumericTransformationEngine1112;
import com.messaging.processing.MessageProcessingFilter;
import com.network.protocol.NetworkProtocolNegotiator;
import com.security.negotiation.CryptoContextNegotiator684;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.user.identity.UserIdentityManager;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class AnalyticsComputationEngine {
    private double m = 20.0;
    private double[] p;
    private long Q = Long.MAX_VALUE;
    private static String l;
    private double I = 6.0;
    private double a = 20.0;
    protected double[] A;
    private double[] J;
    private final UserIdentityManager L;
    private final List<NumericStreamProcessor> g = new ArrayList<NumericStreamProcessor>();
    private boolean c = true;

    public static void M(String string) {
        l = string;
    }

    public double[] l() {
        this.n();
        return this.p;
    }

    private double l(double[] dArray, double[] dArray2) {
        return Math.atan2(dArray[1] - dArray2[1], dArray[0] - dArray2[0]) * 57.29577951308232;
    }

    public double[] n() {
        return this.A;
    }

    public abstract NumericTransformationEngine1112 n();

    public boolean P() {
        boolean bl;
        try {
            bl = this.Q != Long.MAX_VALUE;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        return bl;
    }

    public long z() {
        return this.Z() - (System.currentTimeMillis() - this.Q);
    }

    private boolean N(double d2, double d3, double d4) {
        boolean bl;
        block11: {
            block10: {
                try {
                    try {
                        if (!(d2 <= this.Q()) && !(d2 >= this.I())) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AnalyticsComputationEngine.b(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw AnalyticsComputationEngine.b(customSystemException);
                }
            }
            try {
                try {
                    if (!(d3 > this.H()) && !(d3 < this.T())) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw AnalyticsComputationEngine.b(customSystemException);
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw AnalyticsComputationEngine.b(customSystemException);
            }
        }
        try {
            bl = d4 > 1.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        return bl;
    }

    public double d(double d2) {
        Object[] objectArray;
        double d3;
        double d4;
        double[] dArray;
        double[] dArray2 = this.p;
        double d5 = 100.0;
        double[] dArray3 = new double[]{this.p[0] + d5 * Math.cos(d2), this.p[1] + d5 * Math.sin(d2)};
        double d6 = dArray2[0] - this.y() / 2.0;
        double d7 = dArray2[0] + this.y() / 2.0;
        double d8 = dArray2[1] - this.C() / 2.0;
        double d9 = dArray2[1] + this.C() / 2.0;
        Double[] doubleArray = new Double[]{d6, d8};
        Double[] doubleArray2 = new Double[]{d7, d8};
        Double[] doubleArray3 = new Double[]{d6, d9};
        Double[] doubleArray4 = new Double[]{d7, d9};
        ArrayList arrayList = new ArrayList(Arrays.asList(new Double[][][]{{doubleArray, doubleArray2}, {doubleArray2, doubleArray4}, {doubleArray3, doubleArray4}, {doubleArray, doubleArray3}}));
        double d10 = Double.MAX_VALUE;
        for (Double[][] doubleArray5 : arrayList) {
            dArray = this.i(dArray2, dArray3, doubleArray5[0], doubleArray5[1]);
            try {
                if (dArray == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AnalyticsComputationEngine.b(customSystemException);
            }
            double d11 = _Y.z(dArray2[0], dArray2[1], dArray[0], dArray[1]);
            if (!(d11 < d10)) continue;
            d10 = d11;
        }
        d10 += 4.0;
        try {
            d4 = Math.min(this.y(), this.C());
            d3 = this.y() < this.C() ? this.y() / this.C() : this.C() / this.y();
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double d12 = d4 - d3 * d10;
        dArray = new double[]{this.p[0] + d5 * Math.cos(Math.toRadians(Math.toDegrees(d2) - d12)), this.p[1] + d5 * Math.sin(Math.toRadians(Math.toDegrees(d2) - d12))};
        double[] dArray4 = new double[]{this.p[0] + d5 * Math.cos(Math.toRadians(Math.toDegrees(d2) + d12)), this.p[1] + d5 * Math.sin(Math.toRadians(Math.toDegrees(d2) + d12))};
        double d13 = Double.MAX_VALUE;
        for (Double[][] doubleArray6 : arrayList) {
            Object object = this.i(dArray2, dArray, doubleArray6[0], doubleArray6[1]);
            try {
                if (object == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AnalyticsComputationEngine.b(customSystemException);
            }
            double d14 = _Y.z(dArray2[0], dArray2[1], (double)object[0], (double)object[1]);
            if (!(d14 < d13)) continue;
            d13 = d14;
        }
        double d15 = Double.MAX_VALUE;
        for (Double[][] doubleArray7 : arrayList) {
            objectArray = this.i(dArray2, dArray4, doubleArray7[0], doubleArray7[1]);
            try {
                if (objectArray == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AnalyticsComputationEngine.b(customSystemException);
            }
            double d16 = _Y.z(dArray2[0], dArray2[1], objectArray[0], objectArray[1]);
            if (!(d16 < d15)) continue;
            d15 = d16;
        }
        double d17 = 0.0;
        for (double d18 : objectArray = (Object[])new Double[]{d10, d13, d15}) {
            if (!(d18.doubleValue() > d17)) continue;
            d17 = d18.doubleValue();
        }
        return d17 - 0.009 * (d17 - d10 + (d17 - d13) + (d17 - d15)) / 2.0;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public double K() {
        return this.A[1];
    }

    public double Q() {
        return this.y() + this.g() * 3.0;
    }

    private double T() {
        return this.C() + this.g() * 3.0;
    }

    public boolean S(double[] dArray) {
        return this.h(dArray[0], dArray[1], dArray[2]);
    }

    public void m(double[] dArray) {
        this.A = dArray;
    }

    public double N() {
        return this.A[2];
    }

    public boolean f() {
        boolean bl;
        try {
            bl = System.currentTimeMillis() - this.Q >= this.Z();
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        return bl;
    }

    public boolean h(double d2, double d3, double d4) {
        boolean bl;
        try {
            bl = _Y.V(this.P(), this.K(), this.N(), d2, d3, d4) <= 0.25;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        return bl;
    }

    static {
        if (AnalyticsComputationEngine.S() == null) {
            AnalyticsComputationEngine.M("it9jvb");
        }
    }

    public AnalyticsComputationEngine(UserIdentityManager userIdentityManager, double[] dArray) {
        this.L = userIdentityManager;
        this.A = dArray;
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    public List<NumericStreamProcessor> g() {
        return this.g;
    }

    public void Z(double d2) {
        this.a = d2;
    }

    public double g() {
        return this.I;
    }

    public void a() {
        TemporalMetadataResolver.h.R().m(HD.L);
        NumericStreamProcessor numericStreamProcessor = new NumericStreamProcessor(1.0, 0.0, 1.0);
        numericStreamProcessor.o();
        this.g.add(numericStreamProcessor);
        numericStreamProcessor = new NumericStreamProcessor(1.0, 0.25, 0.0, 1.0);
        try {
            numericStreamProcessor.o();
            this.g.add(numericStreamProcessor);
            if (this.P()) {
                this.A();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
    }

    public UserIdentityManager d() {
        return this.L;
    }

    public String z() {
        String string;
        try {
            string = this.L != null ? this.L.j() : "";
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        return string;
    }

    public double[] H() {
        return this.J;
    }

    public double[] L() {
        return this.p;
    }

    protected float S(double d2, double d3, double d4, double d5) {
        return (float)Math.toDegrees(Math.atan2(d5 - d4, d3 - d2));
    }

    public long Z() {
        return TimeUnit.SECONDS.toMillis(4L);
    }

    private double I() {
        double d2 = ApplicationLifecycleManager.e();
        return d2 - (this.y() + this.g() * 3.0);
    }

    public void n() {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        float f;
        double d16;
        double d17;
        double d18;
        boolean bl;
        block33: {
            NumericComputationEngine1131 numericComputationEngine1131 = ApplicationLifecycleManager.r();
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                try {
                    if (systemConfigurationOrchestrator != null && numericComputationEngine1131 != null) break block33;
                }
                catch (CustomSystemException customSystemException) {
                    throw AnalyticsComputationEngine.b(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AnalyticsComputationEngine.b(customSystemException);
            }
        }
        double d19 = this.P();
        double d20 = this.K();
        double d21 = this.N();
        double d22 = NumericComputationEngine1131.b();
        double d23 = NumericComputationEngine1131.S() + (double)ApplicationLifecycleManager.U().E();
        double d24 = NumericComputationEngine1131.n();
        double d25 = _Y.V(d19, d20, d21, d22, d23, d24);
        double d26 = Math.min((38.0 - d25) / d25, 0.0);
        try {
            bl = d26 == 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        boolean bl2 = bl;
        try {
            d18 = bl2 ? d23 - (double)ApplicationLifecycleManager.U().E() : d23;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        d23 = d18;
        Double[] doubleArray = new Double[]{d19 - d22, d20 - d23, d21 - d24};
        Double[] doubleArray2 = new Double[]{doubleArray[0] * d26, doubleArray[1] * d26, doubleArray[2] * d26};
        Double[] doubleArray3 = new Double[]{doubleArray[0] + doubleArray2[0], doubleArray[1] + doubleArray2[1], doubleArray[2] + doubleArray2[2]};
        try {
            CryptoContextNegotiator684.Y();
            d17 = doubleArray3[0];
            d16 = doubleArray3[1];
            f = bl2 ? 0.0f : ApplicationLifecycleManager.U().E();
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double[] dArray = CryptoContextNegotiator684.E(d17, d16 + (double)f, doubleArray3[2]);
        try {
            CryptoContextNegotiator684.J();
            this.J = new double[]{dArray[0], (double)ApplicationLifecycleManager.b() - dArray[1], dArray[2]};
            this.p = this.J;
            if (!this.N(this.J[0], this.J[1], this.J[2])) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double d27 = ApplicationLifecycleManager.e();
        double d28 = ApplicationLifecycleManager.b();
        double d29 = this.I() - this.Q() + 4.0;
        double d30 = this.H() - this.T() + 6.0;
        double d31 = this.J[0] - d27 / 2.0;
        double d32 = this.J[1] - d28 / 2.0;
        double d33 = this.J[0] - d29 / 2.0 - (d27 - d29) / 2.0;
        double d34 = this.J[1] - d30 / 2.0 - (d28 - d30) / 4.0;
        try {
            d15 = d31 < 0.0 ? -d27 / 2.0 / d31 : d27 / 2.0 / d31;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double d35 = d15;
        try {
            d14 = d32 < 0.0 ? -d28 / 2.0 / d32 : d28 / 2.0 / d32;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double d36 = d14;
        try {
            d13 = d33 < 0.0 ? -d29 / 2.0 / d33 : d29 / 2.0 / d33;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double d37 = d13;
        try {
            d12 = d34 < 0.0 ? -d30 / 2.0 / d34 : d30 / 2.0 / d34;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double d38 = d12;
        try {
            d11 = Math.abs(d35) < Math.abs(d36) ? d35 : d36;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double d39 = d11;
        try {
            d10 = Math.abs(d37) < Math.abs(d38) ? d37 : d38;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double d40 = d10;
        try {
            d9 = d31;
            d8 = dArray[2] >= 1.0 ? -d39 : d39;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        d31 = d9 * d8;
        try {
            d7 = d32;
            d6 = dArray[2] >= 1.0 ? -d39 : d39;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        d32 = d7 * d6;
        try {
            d5 = d33;
            d4 = dArray[2] >= 1.0 ? -d40 : d40;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        d33 = d5 * d4;
        try {
            d3 = d34;
            d2 = dArray[2] >= 1.0 ? -d40 : d40;
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        d34 = d3 * d2;
        this.J = new double[]{d31 += d27 / 2.0, d32 += d28 / 2.0, this.J[2]};
        this.p = new double[]{d33 += d29 / 2.0 + (d27 - d29) / 2.0, d34 += d30 / 2.0 + (d28 - d30) / 4.0, this.J[2]};
    }

    public void R() {
        boolean bl;
        float f = MessageProcessingFilter.v();
        float f2 = 1.0f;
        float f3 = 2.0f;
        double d2 = this.p[0] / (double)f3 / (double)f2 / (double)f;
        double d3 = this.p[1] / (double)f / (double)f3 / (double)f2;
        try {
            bl = !this.J.equals(this.p);
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        boolean bl2 = bl;
        try {
            Ne.h.m(d2, d3, 0.0);
            this.D(bl2);
            if (bl2) {
                this.V();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        Ne.h.m(-d2, -d3, 0.0);
    }

    public double y() {
        return this.a;
    }

    public void w(double d2) {
        this.m = d2;
    }

    public void k(double d2) {
        this.I = d2;
    }

    private double H() {
        return (double)ApplicationLifecycleManager.b() - this.C() - this.g() - 60.0;
    }

    public void A() {
        TemporalMetadataResolver.h.R().m(HD.L);
        double d2 = 0.0;
        for (int i = 0; i < 1; ++i) {
            NumericStreamProcessor numericStreamProcessor = new NumericStreamProcessor(1.0, d2, 0.0, 1.0);
            numericStreamProcessor.o();
            this.g.add(numericStreamProcessor);
            d2 += 0.25;
        }
        this.Q = System.currentTimeMillis();
    }

    public abstract void G();

    public static String S() {
        return l;
    }

    public void i(NetworkProtocolNegotiator networkProtocolNegotiator) {
    }

    private double[] i(double[] dArray, double[] dArray2, Double[] doubleArray, Double[] doubleArray2) {
        double d2 = dArray2[1] - dArray[1];
        double d3 = dArray[0] - dArray2[0];
        double d4 = d2 * dArray[0] + d3 * dArray[1];
        double d5 = doubleArray2[1] - doubleArray[1];
        double d6 = doubleArray[0] - doubleArray2[0];
        double d7 = d5 * doubleArray[0] + d6 * doubleArray[1];
        double d8 = d2 * d6 - d5 * d3;
        try {
            if (d8 == 0.0) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AnalyticsComputationEngine.b(customSystemException);
        }
        double d9 = (d6 * d4 - d3 * d7) / d8;
        double d10 = (d2 * d7 - d5 * d4) / d8;
        return new double[]{d9, d10};
    }

    public abstract void D(boolean var1);

    public double P() {
        return this.A[0];
    }

    protected boolean C(double d2, double d3) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (!(d2 > this.Q()) || !(d2 < this.I())) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AnalyticsComputationEngine.b(customSystemException);
                            }
                            if (!(d3 > this.T())) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AnalyticsComputationEngine.b(customSystemException);
                        }
                        if (!(d3 < this.H())) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AnalyticsComputationEngine.b(customSystemException);
                    }
                    bl = true;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw AnalyticsComputationEngine.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void V() {
        float f = MessageProcessingFilter.v();
        Color color = GraphicsRenderingUtility1454.U(this.d());
        f *= 2.0f;
        double d2 = this.l(this.J, this.p);
        double d3 = Math.toRadians(d2 + 45.0);
        double d4 = Math.toRadians(d2 - 45.0);
        d2 = Math.toRadians(d2);
        double d5 = Math.min(this.y() / 2.0, this.d(d2));
        double d6 = (double)(1.0f / f) + (d5 + this.g()) * Math.cos(d2);
        double d7 = (double)(1.0f / f) + (d5 + this.g()) * Math.sin(d2);
        double d8 = d6 - this.g() * Math.cos(d3);
        double d9 = d7 - this.g() * Math.sin(d3);
        double d10 = d6 - this.g() * 0.6 * Math.cos(d2);
        double d11 = d7 - this.g() * 0.6 * Math.sin(d2);
        double d12 = d6 - this.g() * Math.cos(d4);
        double d13 = d7 - this.g() * Math.sin(d4);
        ConfigurationManager.F(d8, d9, d6, d7, d12, d13, d10, d11, new Color(0, 0, 0, 255));
        ConfigurationManager.F(d8, d9, d6, d7, d12, d13, d10, d11, color);
    }

    public double C() {
        return this.m;
    }

    public boolean Y() {
        return this.c;
    }
}

