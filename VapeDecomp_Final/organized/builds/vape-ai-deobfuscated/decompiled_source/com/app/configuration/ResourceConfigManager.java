/*
 * Decompiled with CFR 0.152.
 */
package com.app.configuration;

import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.runtime.resolution.DynamicClassResolver;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ResourceConfigManager
extends ObjectLifecycleTracker {
    private static TransactionCorrelationEngine t;
    private static TransactionCorrelationEngine d;
    private static TransactionCorrelationEngine x;
    private static TransactionCorrelationEngine r;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static TransactionCorrelationEngine W() {
        try {
            if (x == null) {
                x = new TransactionCorrelationEngine(DynamicClassResolver.a(ResourceConfigManager.U.u().GK));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceConfigManager.a(customSystemException);
        }
        return x;
    }

    public static TransactionCorrelationEngine g() {
        try {
            if (r == null) {
                r = new TransactionCorrelationEngine(DynamicClassResolver.U(ResourceConfigManager.U.u().GK));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceConfigManager.a(customSystemException);
        }
        return r;
    }

    public static TransactionCorrelationEngine D() {
        try {
            if (d == null) {
                d = new TransactionCorrelationEngine(DynamicClassResolver.h(ResourceConfigManager.U.u().GK));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceConfigManager.a(customSystemException);
        }
        return d;
    }

    public static TransactionCorrelationEngine H() {
        try {
            if (t == null) {
                t = new TransactionCorrelationEngine(DynamicClassResolver.u(ResourceConfigManager.U.u().GK));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceConfigManager.a(customSystemException);
        }
        return t;
    }

    public ResourceConfigManager(Object object) {
        super(object);
    }
}

