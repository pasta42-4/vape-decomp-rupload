/*
 * Decompiled with CFR 0.152.
 */
package com.random.generation;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.database.QueryBuilder;
import com.database.query.QueryExecutionHandler;
import com.event.dispatch.EventDispatchController1028;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import com.security.auth.AuthenticationHandler;
import com.security.event.SecureEventOrchestrator;
import com.simulation.calibration.SimulationParameterCalibrator;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class RandomGenerationEngine {
    float u;
    float f;
    private int N;
    private final Random S = new Random();
    private boolean p;
    private int c;
    float v = 1.0f;
    private NetworkConfigManager o;
    private int g;
    private boolean h;
    private int R;
    float U;
    private int J;
    float r;
    private static SimulationParameterCalibrator Q;
    float F;
    float K;
    private boolean W;
    float k;
    float n;
    float Z = 3.0f;
    private static int j;

    public float R() {
        return this.u;
    }

    public void z(QueryBuilder queryBuilder) {
    }

    public void Q(EventDispatchController1028 eventDispatchController1028) {
    }

    public void h(boolean bl) {
        this.p = bl;
    }

    public float u() {
        return this.r;
    }

    public boolean F() {
        return this.W;
    }

    static {
        if (RandomGenerationEngine.g() != 0) {
            RandomGenerationEngine.H(40);
        }
    }

    public static void H(int n) {
        j = n;
    }

    public void p(float f, float f2) {
        AuthenticationHandler.S(f, f2);
    }

    public boolean j() {
        return this.p;
    }

    public float N() {
        return this.k;
    }

    public abstract boolean x();

    public RandomGenerationEngine L(float f) {
        this.v = f;
        return this;
    }

    public boolean r() {
        return this.h;
    }

    public void P(EventTriggerEngine eventTriggerEngine) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventTriggerEngine.getThePlayer();
        this.f = systemConfigurationOrchestrator.q();
        this.n = systemConfigurationOrchestrator.S();
        this.F = systemConfigurationOrchestrator.A();
        this.U = systemConfigurationOrchestrator.Q();
    }

    private void Z() {
        block18: {
            try {
                ++this.N;
                if (this.N >= 250 + this.S.nextInt(50)) {
                    this.N = AdaptiveComputationEngine.B(this.S, -100, -50);
                    this.c = AdaptiveComputationEngine.B(this.S, -1, 2);
                    this.g = -AdaptiveComputationEngine.B(this.S, -1, 2);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGenerationEngine.c(customSystemException);
            }
            int n = this.c;
            int n2 = this.g;
            if (this.S.nextInt(10) < 2) {
                n = 0;
            }
            if (this.S.nextInt(10) < 2) {
                n2 = 0;
            }
            if (this.N < 0) {
                n = 0;
                n2 = 0;
            }
            try {
                if (this.S.nextInt(20) == 1) {
                    this.J += n;
                    this.R += n2;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGenerationEngine.c(customSystemException);
            }
            try {
                block17: {
                    try {
                        try {
                            try {
                                if (this.u > 0.0f && this.J < 0) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RandomGenerationEngine.c(customSystemException);
                            }
                            if (!(this.u < 0.0f)) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RandomGenerationEngine.c(customSystemException);
                        }
                        if (this.J <= 0) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RandomGenerationEngine.c(customSystemException);
                    }
                }
                this.J = 0;
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGenerationEngine.c(customSystemException);
            }
        }
    }

    public float e() {
        return this.v;
    }

    public void X(boolean bl) {
        this.W = bl;
    }

    public void q(boolean bl) {
        this.h = bl;
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean h(long l) {
        int n = 0;
        while (!this.F()) {
            QueryExecutionHandler.q(10L);
            if ((long)(++n) <= l / 10L) continue;
            return true;
        }
        return false;
    }

    public static int x() {
        int n = RandomGenerationEngine.g();
        try {
            if (n == 0) {
                return 81;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RandomGenerationEngine.c(customSystemException);
        }
        return 0;
    }

    public abstract boolean q();

    public void H(SystemConfigurationOrchestrator systemConfigurationOrchestrator, SecureEventOrchestrator secureEventOrchestrator) {
        block13: {
            block12: {
                try {
                    try {
                        if (!systemConfigurationOrchestrator.Y() && !secureEventOrchestrator.r()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RandomGenerationEngine.c(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw RandomGenerationEngine.c(customSystemException);
                }
            }
            boolean bl = this.q();
            boolean bl2 = this.x();
            try {
                try {
                    try {
                        try {
                            if (!bl || !bl2) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RandomGenerationEngine.c(customSystemException);
                        }
                        if (!(Math.abs(this.u) < 1.0f)) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RandomGenerationEngine.c(customSystemException);
                    }
                    if (!(Math.abs(this.k) < 1.0f)) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw RandomGenerationEngine.c(customSystemException);
                }
                this.W = true;
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGenerationEngine.c(customSystemException);
            }
        }
    }

    public void m(SecureEventOrchestrator secureEventOrchestrator) {
        float f;
        float f2;
        float f3;
        float f4;
        block24: {
            boolean bl;
            boolean bl2;
            block22: {
                block23: {
                    try {
                        try {
                            if (!this.p) break block22;
                            if (this.o != null) break block23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RandomGenerationEngine.c(customSystemException);
                        }
                        this.o = new NetworkConfigManager();
                        this.o.w(-1L);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RandomGenerationEngine.c(customSystemException);
                    }
                }
                long l = this.o.d();
                this.o.m();
                while (true) {
                    long l2 = l--;
                    try {
                        if (l2 <= 0L) break;
                        this.Z();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RandomGenerationEngine.c(customSystemException);
                    }
                }
                this.u += (float)this.J;
                this.k += (float)this.R;
            }
            int n = (int)this.u;
            int n2 = (int)this.k;
            f4 = this.u - (float)n;
            f3 = this.k - (float)n2;
            try {
                bl2 = Math.abs(n) > 0;
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGenerationEngine.c(customSystemException);
            }
            boolean bl3 = bl2;
            try {
                boolean bl4 = bl = Math.abs(n2) > 0;
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGenerationEngine.c(customSystemException);
            }
            if (!bl3) {
                n = 0;
            }
            if (!bl) {
                n2 = 0;
            }
            float f5 = ConfigurationCalibrator.b.E();
            float f6 = f5 * 0.6f + 0.2f;
            float f7 = f6 * f6 * f6 * 8.0f;
            f2 = (float)n * f7;
            f = (float)n2 * f7;
            int n3 = -1;
            try {
                if (Q == null) {
                    Q = TemporalMetadataResolver.h.U().K(SimulationParameterCalibrator.class);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGenerationEngine.c(customSystemException);
            }
            try {
                try {
                    try {
                        if (Q != null && Q.Z()) break block24;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RandomGenerationEngine.c(customSystemException);
                    }
                    if (!secureEventOrchestrator.Y()) break block24;
                }
                catch (CustomSystemException customSystemException) {
                    throw RandomGenerationEngine.c(customSystemException);
                }
                this.p(f2, f * (float)n3);
            }
            catch (CustomSystemException customSystemException) {
                throw RandomGenerationEngine.c(customSystemException);
            }
        }
        this.K = (float)((double)this.K + Math.abs((double)f2 * 0.15));
        this.r = (float)((double)this.r + Math.abs((double)f * 0.15));
        this.u = f4;
        this.k = f3;
        this.J = 0;
        this.R = 0;
    }

    public static int g() {
        return j;
    }

    public float p() {
        return this.K;
    }

    public RandomGenerationEngine N(float f) {
        this.Z = f;
        return this;
    }
}

