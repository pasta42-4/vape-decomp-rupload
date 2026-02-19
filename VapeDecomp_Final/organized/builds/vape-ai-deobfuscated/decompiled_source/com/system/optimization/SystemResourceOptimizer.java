/*
 * Decompiled with CFR 0.152.
 */
package com.system.optimization;

import com.reflection.handler.MethodIntrospectionHandler;
import com.system.lifecycle.ObjectLifecycleTracker;

public class SystemResourceOptimizer
extends ObjectLifecycleTracker {
    public static SystemResourceOptimizer k() {
        return new SystemResourceOptimizer(MethodIntrospectionHandler.O(SystemResourceOptimizer.U.u().dG));
    }

    public static SystemResourceOptimizer M() {
        return new SystemResourceOptimizer(MethodIntrospectionHandler.f(SystemResourceOptimizer.U.u().dG));
    }

    public SystemResourceOptimizer(Object object) {
        super(object);
    }

    public static SystemResourceOptimizer y() {
        return new SystemResourceOptimizer(MethodIntrospectionHandler.H(SystemResourceOptimizer.U.u().dG));
    }

    public static SystemResourceOptimizer H() {
        return new SystemResourceOptimizer(MethodIntrospectionHandler.N(SystemResourceOptimizer.U.u().dG));
    }

    public static SystemResourceOptimizer g() {
        return new SystemResourceOptimizer(MethodIntrospectionHandler.Y(SystemResourceOptimizer.U.u().dG));
    }
}

