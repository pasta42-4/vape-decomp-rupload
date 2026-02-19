/*
 * Decompiled with CFR 0.152.
 */
package com.config.management;

import com.app.analytics.time.TimeSeriesAnalyzer;
import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;

public class ConfigurationTemplateManager
extends UuidCorrelationManager<TimeSeriesAnalyzer> {
    private static String[] A;
    private String k;

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.k = networkProtocolEncoder1013.b(16);
    }

    public String C() {
        return this.k;
    }

    public ConfigurationTemplateManager(String string) {
        this.k = string;
    }

    public static void y(String[] stringArray) {
        A = stringArray;
    }

    static {
        if (ConfigurationTemplateManager.W() == null) {
            ConfigurationTemplateManager.y(new String[1]);
        }
    }

    public static String[] W() {
        return A;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.J(this.k);
    }

    public ConfigurationTemplateManager() {
    }
}

