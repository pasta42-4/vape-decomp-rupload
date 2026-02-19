/*
 * Decompiled with CFR 0.152.
 */
package com.network.config;

import com.app.config.ConfigurationResolver2171;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.event.management.MultiTypeEventAggregator;
import com.security.context.ReplicableSecurityContext;
import java.util.ArrayList;
import java.util.List;

public class NetworkConfigurationManager {
    private String T;
    private final List<ReplicableSecurityContext> g = new ArrayList<ReplicableSecurityContext>();
    private final List<PluginLifecycleContract> e = new ArrayList<PluginLifecycleContract>();

    public NetworkConfigurationManager h(ConfigurationResolver2171 configurationResolver2171) {
        this.g.add(configurationResolver2171.X());
        return this;
    }

    public NetworkConfigurationManager b(PluginLifecycleContract pluginLifecycleContract) {
        this.e.add(pluginLifecycleContract);
        return this;
    }

    public MultiTypeEventAggregator G() {
        return new MultiTypeEventAggregator(this.T, this.g, this.e);
    }

    public NetworkConfigurationManager c(ReplicableSecurityContext replicableSecurityContext) {
        this.g.add(replicableSecurityContext);
        return this;
    }

    public NetworkConfigurationManager A(String string) {
        this.T = string;
        return this;
    }
}

