/*
 * Decompiled with CFR 0.152.
 */
package com.validation.operations;

import com.data.contract.DataTransformationContract2366;
import com.network.protocol.NetworkProtocolEncoder1013;

public class OperationValidator
implements DataTransformationContract2366 {
    private boolean v;

    public OperationValidator() {
    }

    @Override
    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.v = networkProtocolEncoder1013.B();
    }

    @Override
    public void y(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.W(this.v);
    }

    public OperationValidator(boolean bl) {
        this.v = bl;
    }

    public boolean O() {
        return this.v;
    }
}

