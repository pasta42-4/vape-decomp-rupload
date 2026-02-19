/*
 * Decompiled with CFR 0.152.
 */
package com.financial.transactions;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class TransactionValidator1768
implements DataTransformationContract2366 {
    private int K;

    public int W() {
        return this.K;
    }

    public TransactionValidator1768() {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.K = networkProtocolEncoder1013.e();
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.I(this.K);
    }

    public TransactionValidator1768(int n) {
        this.K = n;
    }
}

