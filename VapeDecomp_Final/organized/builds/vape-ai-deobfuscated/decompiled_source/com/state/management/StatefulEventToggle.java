/*
 * Decompiled with CFR 0.152.
 */
package com.state.management;

import a.HK;
import com.app.algorithms.AlgorithmOrchestrator;
import com.exception.system.CustomSystemException;
import com.network.core.NetworkProtocolManager;
import java.util.HashMap;
import java.util.Map;

public class StatefulEventToggle
extends NetworkProtocolManager<StatefulEventToggle, HK> {
    private boolean x;
    private Class<?>[] K;
    private final Map<AlgorithmOrchestrator, Class[]> I = new HashMap<AlgorithmOrchestrator, Class[]>();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public HK M() {
        try {
            if (this.Y()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StatefulEventToggle.a(customSystemException);
        }
        return HK.I(this);
    }

    public StatefulEventToggle H(AlgorithmOrchestrator algorithmOrchestrator, Class ... classArray) {
        this.I.put(algorithmOrchestrator, classArray);
        return this;
    }

    public StatefulEventToggle l(boolean bl) {
        this.x = bl;
        return this;
    }

    public Class<?>[] I() {
        if (!this.I.isEmpty()) {
            for (Map.Entry<AlgorithmOrchestrator, Class[]> entry : this.I.entrySet()) {
                try {
                    if (!entry.getKey().m()) continue;
                    return entry.getValue();
                }
                catch (CustomSystemException customSystemException) {
                    throw StatefulEventToggle.a(customSystemException);
                }
            }
        }
        return this.K;
    }

    public StatefulEventToggle q(Class<?>[] classArray) {
        this.K = classArray;
        return this;
    }

    public boolean t() {
        return this.x;
    }
}

