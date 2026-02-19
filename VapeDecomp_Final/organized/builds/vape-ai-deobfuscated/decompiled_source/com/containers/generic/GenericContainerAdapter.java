/*
 * Decompiled with CFR 0.152.
 */
package com.containers.generic;

import com.configuration.management.ConfigurationParameterManager1397;
import com.network.connection.NetworkConnectionManager1645;
import com.plugin.management.PluginRegistrar;
import com.policy.management.PolicyOrchestrator;
import com.resource.management.ComparativeResourceAllocator;

public class GenericContainerAdapter
extends ComparativeResourceAllocator<GenericContainerAdapter> {
    public PluginRegistrar x() {
        return NetworkConnectionManager1645.f(this);
    }

    public ConfigurationParameterManager1397 k() {
        return PolicyOrchestrator.x(this);
    }
}

