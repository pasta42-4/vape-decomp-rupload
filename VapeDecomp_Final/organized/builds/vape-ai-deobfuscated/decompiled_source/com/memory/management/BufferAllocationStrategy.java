/*
 * Decompiled with CFR 0.152.
 */
package com.memory.management;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class BufferAllocationStrategy
implements DataTransformationContract2366 {
    private int h;

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.e(this.h);
    }

    public int o() {
        return this.h;
    }

    public BufferAllocationStrategy() {
    }

    public BufferAllocationStrategy(int n) {
        this.h = n;
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.h = networkProtocolEncoder1013.U();
    }
}

