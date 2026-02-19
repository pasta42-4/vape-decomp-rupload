/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.data.encoding.DataStreamEncoder1955;
import com.data.encoding.StreamDataEncoder;
import com.network.analysis.NetworkTrafficAnalyzer;
import com.runtime.context.LightweightExecutionContext;

public class NetworkConnectionManager1705
extends NetworkTrafficAnalyzer {
    public static NetworkConnectionManager1705 Q(DataStreamEncoder1955 dataStreamEncoder1955, StreamDataEncoder streamDataEncoder) {
        return new NetworkConnectionManager1705(NetworkConnectionManager1705.U.u().k9.c(dataStreamEncoder1955.M(), streamDataEncoder.M()));
    }

    public NetworkConnectionManager1705(Object object) {
        super(object);
    }

    public boolean w() {
        return NetworkConnectionManager1705.U.u().k9.Z(this.M());
    }

    public NetworkConnectionManager1705 E() {
        return new NetworkConnectionManager1705(NetworkConnectionManager1705.U.u().k9.L(this.M()));
    }

    public NetworkConnectionManager1705 i(LightweightExecutionContext lightweightExecutionContext) {
        return new NetworkConnectionManager1705(NetworkConnectionManager1705.U.u().k9.s(this.M(), lightweightExecutionContext.M()));
    }

    public LightweightExecutionContext g() {
        return new LightweightExecutionContext(NetworkConnectionManager1705.U.u().k9.w(this.M()));
    }

    public boolean U() {
        return NetworkConnectionManager1705.U.u().k9.c(this.M());
    }
}

