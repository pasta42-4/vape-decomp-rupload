/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.data.filtering;

import com.app.discovery.services.ServiceDiscoveryRegistry;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

class PredicateFilter<T> {
    private final String[] a;
    @Nullable
    private Class[] E;
    private Predicate<T> U;

    @Nullable
    public Class[] J() {
        return this.E;
    }

    public Predicate<T> x() {
        return this.U;
    }

    public String[] D() {
        return this.a;
    }

    PredicateFilter(String[] stringArray, ServiceDiscoveryRegistry serviceDiscoveryRegistry) {
        this(stringArray);
    }

    public void E(Class[] classArray) {
        this.E = classArray;
    }

    public void y(Predicate<T> predicate) {
        this.U = predicate;
    }

    private PredicateFilter(String ... stringArray) {
        this.a = stringArray;
    }
}

