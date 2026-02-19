/*
 * Decompiled with CFR 0.152.
 */
package com.app.scenarios;

import com.caching.strategy.CacheInvalidationStrategy;
import com.network.connection.NetworkConnectionManager1945;
import com.network.protocol.CommunicationProtocolAdapter;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ScenarioTemplateManager
extends ObjectLifecycleTracker {
    private static String v;

    public ScenarioTemplateManager(Object object) {
        super(object);
    }

    public static String f() {
        return v;
    }

    public static void v(String string) {
        v = string;
    }

    public static NetworkConnectionManager1945 T(CacheInvalidationStrategy cacheInvalidationStrategy) {
        return new NetworkConnectionManager1945(CommunicationProtocolAdapter.q(ScenarioTemplateManager.U.u().GW, cacheInvalidationStrategy.M()));
    }

    static {
        if (ScenarioTemplateManager.f() == null) {
            ScenarioTemplateManager.v("IyooH");
        }
    }
}

