/*
 * Decompiled with CFR 0.152.
 */
package com.math.computation;

import com.cache.distributed.DistributedCacheManager135;
import com.compression.core.DataCompressionHandler;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.core.EventDispatcher;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.resource.ResourceAllocator1518;

public class NumericComputationEngine1131
extends ObjectLifecycleTracker {
    private static double T;
    private static double Q;
    private static double L;

    public static void d(float f) {
        Object object = ApplicationLifecycleManager.g();
        double d2 = ((CryptographicTransformer)object).b();
        double d3 = ((CryptographicTransformer)object).q();
        double d4 = ((CryptographicTransformer)object).I();
        try {
            Q = d2 + (((CryptographicTransformer)object).F() - d2) * (double)f;
            T = d3 + (((CryptographicTransformer)object).V() - d3) * (double)f;
            if (GeometryCalculator.C() >= 28) {
                T += (double)((CryptographicTransformer)object).E();
                T += ApplicationLifecycleManager.U().v().w().F() - T;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1131.a(customSystemException);
        }
        L = d4 + (((CryptographicTransformer)object).B() - d4) * (double)f;
    }

    public static double b() {
        return Q;
    }

    public double s() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.e().w().f();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1131.a(customSystemException);
        }
        return DistributedCacheManager135.l(NumericComputationEngine1131.U.u().dS, this.H);
    }

    public static double S() {
        return T;
    }

    public static NumericComputationEngine1131 a() {
        return new NumericComputationEngine1131(DistributedCacheManager135.c(NumericComputationEngine1131.U.u().dS));
    }

    public NumericComputationEngine1131(Object object) {
        super(object);
    }

    public float r() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.e().B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1131.a(customSystemException);
        }
        return DistributedCacheManager135.p(NumericComputationEngine1131.U.u().dS, this.H);
    }

    public DataCompressionHandler e() {
        return new DataCompressionHandler(DistributedCacheManager135.N(NumericComputationEngine1131.U.u().dS, this.H));
    }

    public double L() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.e().w().X();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1131.a(customSystemException);
        }
        return DistributedCacheManager135.b(NumericComputationEngine1131.U.u().dS, this.H);
    }

    public ResourceAllocator1518 D(CryptographicTransformer cryptographicTransformer) {
        return new ResourceAllocator1518(DistributedCacheManager135.g(NumericComputationEngine1131.U.u().dS, this.H, cryptographicTransformer.M()));
    }

    public float k() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.e().S();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1131.a(customSystemException);
        }
        return DistributedCacheManager135.f(NumericComputationEngine1131.U.u().dS, this.H);
    }

    public EventDispatcher O() {
        try {
            if (GameVersionEnumerator.MC_1_21_10.H()) {
                return this.e().d();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1131.a(customSystemException);
        }
        return new EventDispatcher(DistributedCacheManager135.f(NumericComputationEngine1131.U.u().dS, this.H));
    }

    public double D() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.e().w().F();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NumericComputationEngine1131.a(customSystemException);
        }
        return DistributedCacheManager135.Q(NumericComputationEngine1131.U.u().dS, this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static double n() {
        return L;
    }
}

