/*
 * Decompiled with CFR 0.152.
 */
package com.app.geospatial.math;

import com.app.network.NetworkConnectionOptimizer2322;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicsContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GeospatialCoordinateCalculator {
    public double J;
    public double t;
    final GraphicsContextBroker Z;
    public double w;
    public double l;
    private final List<LightweightExecutionContext> T;
    private static boolean X;
    private final List<Object> p;
    public double H;
    public double L;

    public GeospatialCoordinateCalculator(GraphicsContextBroker graphicsContextBroker, NetworkConnectionOptimizer2322 networkConnectionOptimizer2322) {
        this.Z = graphicsContextBroker;
        this.p = new ArrayList<Object>();
        this.T = new ArrayList<LightweightExecutionContext>();
        this.t = networkConnectionOptimizer2322.F();
        this.l = networkConnectionOptimizer2322.V();
        this.L = networkConnectionOptimizer2322.B();
        this.w = this.t;
        this.J = this.l;
        this.H = this.L;
        this.O(networkConnectionOptimizer2322);
    }

    public List<Object> c() {
        return this.p;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static {
        if (GeospatialCoordinateCalculator.O()) {
            GeospatialCoordinateCalculator.z(true);
        }
    }

    public void O(NetworkConnectionOptimizer2322 networkConnectionOptimizer2322) {
        block3: {
            block2: {
                try {
                    if (!this.p.isEmpty()) break block2;
                    this.t = networkConnectionOptimizer2322.F();
                    this.l = networkConnectionOptimizer2322.V();
                    this.L = networkConnectionOptimizer2322.B();
                    this.w = networkConnectionOptimizer2322.b();
                    this.J = networkConnectionOptimizer2322.q();
                    this.H = networkConnectionOptimizer2322.I();
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeospatialCoordinateCalculator.a(customSystemException);
                }
            }
            int n = this.p.size();
            this.t = (this.t * (double)n + networkConnectionOptimizer2322.F()) / (double)(n + 1);
            this.l = (this.l * (double)n + networkConnectionOptimizer2322.V()) / (double)(n + 1);
            this.L = (this.L * (double)n + networkConnectionOptimizer2322.B()) / (double)(n + 1);
        }
        this.p.add(networkConnectionOptimizer2322.M());
        this.n();
    }

    public void n() {
        this.T.clear();
        for (Object object : this.p) {
            LightweightExecutionContext lightweightExecutionContext;
            block4: {
                NetworkConnectionOptimizer2322 networkConnectionOptimizer2322 = new NetworkConnectionOptimizer2322(object);
                lightweightExecutionContext = networkConnectionOptimizer2322.y();
                try {
                    if (!lightweightExecutionContext.r()) continue;
                    if (!GraphicsContextBroker.m(this.Z).s().booleanValue()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw GeospatialCoordinateCalculator.a(customSystemException);
                }
                boolean bl = false;
                for (LightweightExecutionContext lightweightExecutionContext2 : this.T) {
                    if (!lightweightExecutionContext2.y(lightweightExecutionContext)) continue;
                    lightweightExecutionContext2.T(lightweightExecutionContext2.J() + lightweightExecutionContext.J());
                    bl = true;
                    break;
                }
                if (bl) continue;
                LightweightExecutionContext lightweightExecutionContext3 = LightweightExecutionContext.d(lightweightExecutionContext.C());
                lightweightExecutionContext3.r(lightweightExecutionContext.c());
                lightweightExecutionContext3.S(lightweightExecutionContext.b());
                lightweightExecutionContext3.T(lightweightExecutionContext.J());
                this.T.add(lightweightExecutionContext3);
                continue;
            }
            LightweightExecutionContext lightweightExecutionContext4 = LightweightExecutionContext.d(lightweightExecutionContext.C());
            lightweightExecutionContext4.r(lightweightExecutionContext.c());
            lightweightExecutionContext4.S(lightweightExecutionContext.b());
            lightweightExecutionContext4.T(lightweightExecutionContext.J());
            this.T.add(lightweightExecutionContext4);
        }
    }

    public static boolean q() {
        return X;
    }

    public Object r() {
        Object object;
        try {
            object = this.p.isEmpty() ? null : this.p.get(0);
        }
        catch (CustomSystemException customSystemException) {
            throw GeospatialCoordinateCalculator.a(customSystemException);
        }
        return object;
    }

    public boolean L() {
        return this.p.isEmpty();
    }

    public void a(GeospatialCoordinateCalculator geospatialCoordinateCalculator) {
        for (Object object : geospatialCoordinateCalculator.p) {
            try {
                if (this.p.contains(object)) continue;
                this.p.add(object);
            }
            catch (CustomSystemException customSystemException) {
                throw GeospatialCoordinateCalculator.a(customSystemException);
            }
        }
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        for (Object object : this.p) {
            NetworkConnectionOptimizer2322 networkConnectionOptimizer2322 = new NetworkConnectionOptimizer2322(object);
            d2 += networkConnectionOptimizer2322.F();
            d3 += networkConnectionOptimizer2322.V();
            d4 += networkConnectionOptimizer2322.B();
        }
        int n = this.p.size();
        this.t = d2 / (double)n;
        this.l = d3 / (double)n;
        this.L = d4 / (double)n;
        this.n();
    }

    public static void z(boolean bl) {
        X = bl;
    }

    public void e(List<Object> list, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        this.w = this.t;
        this.J = this.l;
        this.H = this.L;
        NetworkConnectionOptimizer2322 networkConnectionOptimizer2322 = new NetworkConnectionOptimizer2322(this.r());
        double d2 = systemConfigurationOrchestrator.y(networkConnectionOptimizer2322);
        double d3 = Math.max(1.5, d2 / 5.0);
        Iterator<Object> iterator = this.p.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            try {
                if (!list.contains(object)) {
                    iterator.remove();
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GeospatialCoordinateCalculator.a(customSystemException);
            }
            NetworkConnectionOptimizer2322 networkConnectionOptimizer23222 = new NetworkConnectionOptimizer2322(object);
            double d4 = networkConnectionOptimizer23222.F() - this.t;
            double d5 = networkConnectionOptimizer23222.V() - this.l;
            double d6 = networkConnectionOptimizer23222.B() - this.L;
            try {
                if (!(Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6) > d3)) continue;
                iterator.remove();
            }
            catch (CustomSystemException customSystemException) {
                throw GeospatialCoordinateCalculator.a(customSystemException);
            }
        }
        if (!this.p.isEmpty()) {
            double d7 = 0.0;
            double d8 = 0.0;
            double d9 = 0.0;
            for (Object object : this.p) {
                NetworkConnectionOptimizer2322 networkConnectionOptimizer23223 = new NetworkConnectionOptimizer2322(object);
                d7 += networkConnectionOptimizer23223.F();
                d8 += networkConnectionOptimizer23223.V();
                d9 += networkConnectionOptimizer23223.B();
            }
            int n = this.p.size();
            this.t = d7 / (double)n;
            this.l = d8 / (double)n;
            this.L = d9 / (double)n;
        }
        this.n();
    }

    public List<LightweightExecutionContext> O() {
        return this.T;
    }

    public static boolean O() {
        boolean bl = GeospatialCoordinateCalculator.q();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GeospatialCoordinateCalculator.a(customSystemException);
        }
        return false;
    }
}

