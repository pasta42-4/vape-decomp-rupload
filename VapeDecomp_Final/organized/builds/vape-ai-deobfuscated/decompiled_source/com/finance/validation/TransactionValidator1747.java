/*
 * Decompiled with CFR 0.152.
 */
package com.finance.validation;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class TransactionValidator1747
implements DataTransformationContract2366 {
    private boolean s;

    public boolean C() {
        return this.s;
    }

    public TransactionValidator1747(boolean bl) {
        this.s = bl;
    }

    public TransactionValidator1747() {
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.W(this.s);
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.s = networkProtocolEncoder1013.B();
    }
}

