/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.system.state;

import a.Qh;
import com.app.analytics.MetricsCalculator;
import com.computation.metrics.MetricComputationEngine;
import com.data.comparison.ComparativeIdentifier;
import com.exception.system.CustomSystemException;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.SecureContextBroker572;
import com.system.lifecycle.SystemLifecycleController;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class SystemStateManager {
    private final ComparativeIdentifier[] t = new ComparativeIdentifier[4];
    private int u;
    private static boolean m;
    private boolean k;
    private int o;
    private final ComparativeIdentifier[] O = new ComparativeIdentifier[36];

    public int Z() {
        return this.u;
    }

    public static void h(boolean bl) {
        m = bl;
    }

    public ComparativeIdentifier[] I() {
        return this.O;
    }

    public void j(Map<Integer, ComparativeIdentifier> map) {
        HashMap<Integer, MetricsCalculator> hashMap = new HashMap<Integer, MetricsCalculator>();
        for (Map.Entry<Integer, ComparativeIdentifier> entry : map.entrySet()) {
            MetricsCalculator metricsCalculator;
            Integer n;
            HashMap<Integer, MetricsCalculator> hashMap2;
            try {
                hashMap2 = hashMap;
                n = entry.getKey();
                metricsCalculator = entry.getValue() != null ? entry.getValue().Z() : null;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemStateManager.a(customSystemException);
            }
            hashMap2.put(n, metricsCalculator);
        }
        SecureContextBroker572.h().c().j(hashMap);
    }

    public static boolean D() {
        boolean bl = SystemStateManager.F();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateManager.a(customSystemException);
        }
        return false;
    }

    static {
        if (!SystemStateManager.F()) {
            SystemStateManager.h(true);
        }
    }

    public void r() {
        ComparativeIdentifier comparativeIdentifier;
        int n;
        HashMap<Integer, @Nullable MetricsCalculator> hashMap = new HashMap<Integer, MetricsCalculator>();
        for (n = 0; n < this.t.length; ++n) {
            comparativeIdentifier = this.t[n];
            try {
                if (comparativeIdentifier == null) continue;
                hashMap.put(36 + n, comparativeIdentifier.Z());
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemStateManager.a(customSystemException);
            }
        }
        for (n = 0; n < this.O.length; ++n) {
            comparativeIdentifier = this.O[n];
            try {
                if (comparativeIdentifier == null) continue;
                hashMap.put(n, comparativeIdentifier.Z());
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemStateManager.a(customSystemException);
            }
        }
        SecureContextBroker572.h().c().Q(this.o, hashMap);
    }

    public boolean V() {
        return this.k;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Map<Integer, @Nullable ComparativeIdentifier> b(Qh qh, boolean bl) {
        ComparativeIdentifier comparativeIdentifier;
        int n;
        int n2;
        HashMap<Integer, ComparativeIdentifier> hashMap;
        block44: {
            int n3;
            Object[] objectArray;
            try {
                if (!this.k) {
                    this.k = true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SystemStateManager.a(customSystemException);
            }
            hashMap = new HashMap<Integer, ComparativeIdentifier>();
            Object[] objectArray2 = qh.l().G();
            for (n2 = 0; n2 < objectArray2.length; ++n2) {
                block43: {
                    ComparativeIdentifier comparativeIdentifier2 = this.t[n2];
                    objectArray = MetricComputationEngine.Y(new LightweightExecutionContext(objectArray2[n2]));
                    try {
                        try {
                            try {
                                try {
                                    if (comparativeIdentifier2 == null && objectArray == null) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateManager.a(customSystemException);
                                }
                                if (objectArray == null) break block43;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateManager.a(customSystemException);
                            }
                            if (objectArray.equals(comparativeIdentifier2)) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateManager.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateManager.a(customSystemException);
                    }
                }
                this.t[n2] = objectArray;
                hashMap.put(36 + n2, (ComparativeIdentifier)objectArray);
            }
            try {
                n3 = SystemLifecycleController.C.q().B().s() == false ? 1 : 0;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemStateManager.a(customSystemException);
            }
            n2 = n3;
            n = qh.l().v();
            try {
                this.o = n;
                if (!bl || n2 != 0) break block44;
            }
            catch (CustomSystemException customSystemException) {
                throw SystemStateManager.a(customSystemException);
            }
            objectArray = qh.l().C();
            for (int i = 0; i < objectArray.length; ++i) {
                ComparativeIdentifier comparativeIdentifier3;
                block45: {
                    ComparativeIdentifier comparativeIdentifier4 = this.O[i];
                    comparativeIdentifier3 = MetricComputationEngine.Y(new LightweightExecutionContext(objectArray[i]));
                    try {
                        try {
                            try {
                                try {
                                    if (comparativeIdentifier4 == null && comparativeIdentifier3 == null) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateManager.a(customSystemException);
                                }
                                if (comparativeIdentifier3 == null) break block45;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateManager.a(customSystemException);
                            }
                            if (comparativeIdentifier3.equals(comparativeIdentifier4)) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateManager.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateManager.a(customSystemException);
                    }
                }
                hashMap.put(i, comparativeIdentifier3);
                this.O[i] = comparativeIdentifier3;
            }
            return hashMap;
        }
        if (n2 != 0) {
            int n4 = 0;
            while (true) {
                block47: {
                    block48: {
                        block46: {
                            try {
                                try {
                                    if (n4 >= this.O.length) break;
                                    if (n4 != n) break block46;
                                    break block47;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SystemStateManager.a(customSystemException);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SystemStateManager.a(customSystemException);
                            }
                        }
                        comparativeIdentifier = this.O[n4];
                        try {
                            if (comparativeIdentifier != null) break block48;
                            break block47;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateManager.a(customSystemException);
                        }
                    }
                    this.O[n4] = null;
                    hashMap.put(n4, null);
                }
                ++n4;
            }
        }
        ComparativeIdentifier comparativeIdentifier5 = this.O[n];
        comparativeIdentifier = MetricComputationEngine.Y(qh.a());
        try {
            block49: {
                try {
                    try {
                        try {
                            if (comparativeIdentifier5 == null && comparativeIdentifier == null) return hashMap;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemStateManager.a(customSystemException);
                        }
                        if (comparativeIdentifier == null) break block49;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemStateManager.a(customSystemException);
                    }
                    if (comparativeIdentifier.equals(comparativeIdentifier5)) return hashMap;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemStateManager.a(customSystemException);
                }
            }
            hashMap.put(n, comparativeIdentifier);
            this.O[n] = comparativeIdentifier;
            return hashMap;
        }
        catch (CustomSystemException customSystemException) {
            throw SystemStateManager.a(customSystemException);
        }
    }

    public ComparativeIdentifier[] g() {
        return this.t;
    }

    public int p() {
        return this.o;
    }

    public void U() {
        this.k = false;
        this.u = 0;
        Arrays.fill(this.t, null);
        Arrays.fill(this.O, null);
    }

    public static boolean F() {
        return m;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void a(int n) {
        this.u = n;
    }
}

