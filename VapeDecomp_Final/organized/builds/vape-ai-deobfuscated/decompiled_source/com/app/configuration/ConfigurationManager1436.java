/*
 * Decompiled with CFR 0.152.
 */
package com.app.configuration;

import com.analytics.computation.MetricsCalculationEngine;
import com.exception.system.CustomSystemException;
import com.runtime.context.ContextualExecutionFramework;

class ConfigurationManager1436 {
    private boolean m;
    private float t;
    private MetricsCalculationEngine Q = null;
    private ContextualExecutionFramework c;
    private boolean R;

    public float z() {
        return this.t;
    }

    static float f(ConfigurationManager1436 configurationManager1436) {
        return configurationManager1436.t;
    }

    public void i(double d2, double d3, double d4, double d5) {
        try {
            if (this.Q == null) {
                this.Q = new MetricsCalculationEngine(d2, d3, d4, d5);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager1436.a(customSystemException);
        }
        this.Q.U(d2);
        this.Q.c(d3);
        this.Q.q(d4);
        this.Q.o(d5);
    }

    static boolean l(ConfigurationManager1436 configurationManager1436) {
        return configurationManager1436.R;
    }

    public void d(boolean bl) {
        this.m = bl;
    }

    static MetricsCalculationEngine i(ConfigurationManager1436 configurationManager1436, MetricsCalculationEngine metricsCalculationEngine) {
        configurationManager1436.Q = metricsCalculationEngine;
        return configurationManager1436.Q;
    }

    public boolean K() {
        return this.m;
    }

    static float a(ConfigurationManager1436 configurationManager1436, float f) {
        configurationManager1436.t = f;
        return configurationManager1436.t;
    }

    static boolean V(ConfigurationManager1436 configurationManager1436) {
        return configurationManager1436.m;
    }

    public void L(boolean bl) {
        this.R = bl;
    }

    public ConfigurationManager1436(ContextualExecutionFramework contextualExecutionFramework) {
        this.c = contextualExecutionFramework;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void H(float f) {
        this.t = f;
    }

    static MetricsCalculationEngine n(ConfigurationManager1436 configurationManager1436) {
        return configurationManager1436.Q;
    }
}

