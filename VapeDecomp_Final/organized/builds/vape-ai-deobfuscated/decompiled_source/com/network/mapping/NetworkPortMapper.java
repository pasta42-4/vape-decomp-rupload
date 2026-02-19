/*
 * Decompiled with CFR 0.152.
 */
package com.network.mapping;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class NetworkPortMapper
implements DataTransformationContract2366 {
    private int o;
    private int B;
    private int S;

    public NetworkPortMapper() {
    }

    public int p() {
        return this.o;
    }

    public int M() {
        return this.B;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.B = networkProtocolEncoder1013.e();
        this.o = networkProtocolEncoder1013.e();
        this.S = networkProtocolEncoder1013.e();
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.I(this.B);
        networkProtocolEncoder1013.I(this.o);
        networkProtocolEncoder1013.I(this.S);
    }

    public int Z() {
        return this.S;
    }

    public NetworkPortMapper(int n, int n2, int n3) {
        this.B = n;
        this.o = n2;
        this.S = n3;
    }
}

