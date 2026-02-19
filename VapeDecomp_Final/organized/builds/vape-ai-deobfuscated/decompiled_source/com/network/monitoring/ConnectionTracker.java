/*
 * Decompiled with CFR 0.152.
 */
package com.network.monitoring;

import a.a;
import com.app.transformation.TransformationPipelineFilter;
import com.config.setup.ConfigurationInitializer2518;
import com.configuration.management.ConfigurationParameterResolver;
import com.exception.system.CustomSystemException;
import com.network.clustering.ClusterNodeRegistry1151;
import com.performance.monitoring.TimedExecutionTracker;
import java.util.HashSet;
import java.util.Set;

public class ConnectionTracker
implements TransformationPipelineFilter {
    private final Set<Integer> d = new HashSet<Integer>();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean c(long l, long l2) {
        int n = a.mvk((int)l, 2);
        try {
            if (this.d.contains((int)l)) {
                ConfigurationInitializer2518.a((char)n, (int)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConnectionTracker.a(customSystemException);
        }
        int n2 = ConfigurationParameterResolver.q((int)l, (int)l2);
        TimedExecutionTracker timedExecutionTracker = ClusterNodeRegistry1151.W().E();
        timedExecutionTracker.V(n2, true);
        return timedExecutionTracker.I();
    }

    public ConnectionTracker() {
        this.d.add(37);
        this.d.add(39);
        this.d.add(36);
        this.d.add(35);
    }
}

