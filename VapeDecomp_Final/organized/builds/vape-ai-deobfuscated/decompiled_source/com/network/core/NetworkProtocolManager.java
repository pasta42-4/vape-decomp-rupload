/*
 * Decompiled with CFR 0.152.
 */
package com.network.core;

import com.app.algorithms.AlgorithmOrchestrator;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class NetworkProtocolManager<T extends NetworkProtocolManager, C> {
    private static AbstractComputationKernel[] g;
    private final Map<AlgorithmOrchestrator, String> V;
    private boolean f;
    private boolean D;
    private Class P;
    private final Map<AlgorithmOrchestrator, Class<?>> t;
    private boolean Q;
    private final Map<AlgorithmOrchestrator, Class> a = new LinkedHashMap<AlgorithmOrchestrator, Class>();
    private CryptoProtocolEngine m;
    private String d;
    private AlgorithmOrchestrator M;
    private final Map<AlgorithmOrchestrator, Boolean> u;
    private Class<?> L;

    public boolean Y() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.M == null || !this.M.m()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw NetworkProtocolManager.b(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolManager.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public Class<?> K() {
        if (!this.t.isEmpty()) {
            for (Map.Entry<AlgorithmOrchestrator, Class<?>> entry : this.t.entrySet()) {
                try {
                    if (!entry.getKey().m()) continue;
                    return entry.getValue();
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolManager.b(customSystemException);
                }
            }
        }
        return this.L;
    }

    public T e(AlgorithmOrchestrator algorithmOrchestrator, String string) {
        this.V.put(algorithmOrchestrator, string);
        return (T)this;
    }

    public CryptoProtocolEngine I() {
        return this.m;
    }

    public boolean u() {
        return this.f;
    }

    static {
        if (NetworkProtocolManager.Z() != null) {
            NetworkProtocolManager.q(new AbstractComputationKernel[5]);
        }
    }

    public boolean j() {
        if (!this.u.isEmpty()) {
            for (Map.Entry<AlgorithmOrchestrator, Boolean> entry : this.u.entrySet()) {
                try {
                    if (!entry.getKey().m()) continue;
                    return entry.getValue();
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolManager.b(customSystemException);
                }
            }
        }
        return this.D;
    }

    public String n() {
        if (!this.V.isEmpty()) {
            for (Map.Entry<AlgorithmOrchestrator, String> entry : this.V.entrySet()) {
                try {
                    if (!entry.getKey().m()) continue;
                    return entry.getValue();
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolManager.b(customSystemException);
                }
            }
        }
        return this.d;
    }

    public boolean k() {
        return this.Q;
    }

    public T F(Class clazz) {
        this.P = clazz;
        return (T)this;
    }

    public T V(AlgorithmOrchestrator algorithmOrchestrator, Class clazz) {
        this.a.put(algorithmOrchestrator, clazz);
        return (T)this;
    }

    public Class E() {
        if (!this.a.isEmpty()) {
            for (Map.Entry<AlgorithmOrchestrator, Class> entry : this.a.entrySet()) {
                try {
                    if (!entry.getKey().m()) continue;
                    return entry.getValue();
                }
                catch (CustomSystemException customSystemException) {
                    throw NetworkProtocolManager.b(customSystemException);
                }
            }
        }
        return this.P;
    }

    public T j(CryptoProtocolEngine cryptoProtocolEngine) {
        this.m = cryptoProtocolEngine;
        return (T)this;
    }

    public NetworkProtocolManager() {
        this.V = new LinkedHashMap<AlgorithmOrchestrator, String>();
        this.u = new LinkedHashMap<AlgorithmOrchestrator, Boolean>();
        this.t = new LinkedHashMap();
    }

    public T r(String string) {
        this.d = string;
        return (T)this;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public T c(Class<?> clazz) {
        this.L = clazz;
        return (T)this;
    }

    public T g(AlgorithmOrchestrator algorithmOrchestrator, Class<?> clazz) {
        this.t.put(algorithmOrchestrator, clazz);
        return (T)this;
    }

    public static AbstractComputationKernel[] Z() {
        return g;
    }

    public T g(AlgorithmOrchestrator algorithmOrchestrator) {
        this.M = algorithmOrchestrator;
        return (T)this;
    }

    public abstract C X();

    public T L(boolean bl) {
        this.f = bl;
        return (T)this;
    }

    public T h(boolean bl) {
        this.Q = bl;
        return (T)this;
    }

    public T g(boolean bl) {
        this.D = bl;
        return (T)this;
    }

    public T n(AlgorithmOrchestrator algorithmOrchestrator, boolean bl) {
        this.u.put(algorithmOrchestrator, bl);
        return (T)this;
    }

    public static void q(AbstractComputationKernel[] abstractComputationKernelArray) {
        g = abstractComputationKernelArray;
    }
}

