/*
 * Decompiled with CFR 0.152.
 */
package com.app.analytics;

import com.network.protocol.NetworkProtocolEncoder1013;
import java.util.LinkedHashMap;
import java.util.Map;

public class MetricsCalculator {
    private final Map<Short, Short> Q;
    private static int[] x;
    private final int f;
    private final int H;
    private final int X;

    public int n() {
        return this.H;
    }

    public MetricsCalculator(int n, int n2, int n3, Map<Short, Short> map) {
        this.H = n;
        this.f = n2;
        this.X = n3;
        this.Q = map;
    }

    static {
        if (MetricsCalculator.b() == null) {
            MetricsCalculator.j(new int[3]);
        }
    }

    public static int[] b() {
        return x;
    }

    public void G(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.I(this.H);
        networkProtocolEncoder1013.I(this.f);
        networkProtocolEncoder1013.I(this.X);
        networkProtocolEncoder1013.e(this.Q.size());
        for (Map.Entry<Short, Short> entry : this.Q.entrySet()) {
            networkProtocolEncoder1013.z(entry.getKey());
            networkProtocolEncoder1013.z(entry.getValue());
        }
    }

    public int m() {
        return this.X;
    }

    public MetricsCalculator(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.H = networkProtocolEncoder1013.e();
        this.f = networkProtocolEncoder1013.e();
        this.X = networkProtocolEncoder1013.e();
        LinkedHashMap<Short, Short> linkedHashMap = new LinkedHashMap<Short, Short>();
        int n = networkProtocolEncoder1013.U();
        for (int i = 0; i < n; ++i) {
            short s2 = networkProtocolEncoder1013.u();
            short s3 = networkProtocolEncoder1013.u();
            linkedHashMap.put(s2, s3);
        }
        this.Q = linkedHashMap;
    }

    public int j() {
        return this.f;
    }

    public static void j(int[] nArray) {
        x = nArray;
    }

    public Map<Short, Short> N() {
        return this.Q;
    }
}

