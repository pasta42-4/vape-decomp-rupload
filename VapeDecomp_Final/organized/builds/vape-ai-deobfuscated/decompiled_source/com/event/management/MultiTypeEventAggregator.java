/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.event.management;

import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.logging.interceptor.LoggingInterceptor;
import com.network.config.NetworkConfigurationManager;
import com.security.context.ReplicableSecurityContext;
import java.util.List;
import org.jetbrains.annotations.UnmodifiableView;

public class MultiTypeEventAggregator
extends LoggingInterceptor {
    private final List<PluginLifecycleContract> o;
    private final List<ReplicableSecurityContext> X;

    @Override
    public List<ReplicableSecurityContext> E() {
        return this.X;
    }

    public @UnmodifiableView List<PluginLifecycleContract> B() {
        return this.o;
    }

    public static NetworkConfigurationManager g() {
        return new NetworkConfigurationManager();
    }

    MultiTypeEventAggregator(String string, List<ReplicableSecurityContext> list, List<PluginLifecycleContract> list2) {
        super(string);
        this.X = list;
        this.o = list2;
    }
}

