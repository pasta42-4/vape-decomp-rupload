/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.app.correlation.management.UuidCorrelationManager;
import com.collections.management.MultiListAggregator;
import com.network.protocol.NetworkProtocolEncoder1013;

public class DataStreamProcessor1482
extends UuidCorrelationManager<MultiListAggregator> {
    private static int[] q;

    public static int[] S() {
        return q;
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
    }

    public static void Q(int[] nArray) {
        q = nArray;
    }

    static {
        if (DataStreamProcessor1482.S() != null) {
            DataStreamProcessor1482.Q(new int[5]);
        }
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
    }
}

