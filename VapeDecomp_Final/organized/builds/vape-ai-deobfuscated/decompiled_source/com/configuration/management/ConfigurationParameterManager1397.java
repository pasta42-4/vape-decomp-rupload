/*
 * Decompiled with CFR 0.152.
 */
package com.configuration.management;

import a.Z1;
import com.policy.management.PolicyOrchestrator;
import com.resource.management.ComparativeResourceAllocator;
import com.security.authentication.SecurityTokenManager2718;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationParameterManager1397
extends ComparativeResourceAllocator<ConfigurationParameterManager1397> {
    private final List<Class<?>> f = new ArrayList();
    private Z1 Q;

    ConfigurationParameterManager1397(ComparativeResourceAllocator comparativeResourceAllocator, SecurityTokenManager2718 securityTokenManager2718) {
        this(comparativeResourceAllocator);
    }

    public ConfigurationParameterManager1397 C(Class<?> clazz) {
        this.f.add(clazz);
        return this;
    }

    public List<Class<?>> r() {
        return this.f;
    }

    public Z1 r() {
        return this.Q;
    }

    public PolicyOrchestrator V() {
        return new PolicyOrchestrator(this);
    }

    private ConfigurationParameterManager1397(ComparativeResourceAllocator<?> comparativeResourceAllocator) {
        super(comparativeResourceAllocator);
    }

    public ConfigurationParameterManager1397 W(Z1 z12) {
        this.Q = z12;
        return this;
    }
}

