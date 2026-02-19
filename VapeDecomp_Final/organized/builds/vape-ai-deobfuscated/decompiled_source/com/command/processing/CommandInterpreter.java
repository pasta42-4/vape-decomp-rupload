/*
 * Decompiled with CFR 0.152.
 */
package com.command.processing;

import com.app.transformation.TransformationPipelineFilter;
import com.configuration.management.ConfigurationParameterResolver;
import com.network.clustering.ClusterNodeRegistry1151;

public class CommandInterpreter
implements TransformationPipelineFilter {
    private static String[] W;

    static {
        if (CommandInterpreter.F() == null) {
            CommandInterpreter.Z(new String[5]);
        }
    }

    @Override
    public boolean c(long l, long l2) {
        int n = ConfigurationParameterResolver.q((int)l, (int)l2);
        ClusterNodeRegistry1151.W().E().V(n, false);
        return false;
    }

    public static String[] F() {
        return W;
    }

    public static void Z(String[] stringArray) {
        W = stringArray;
    }
}

