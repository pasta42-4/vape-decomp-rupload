/*
 * Decompiled with CFR 0.152.
 */
package com.networking.link;

import com.app.core.interfaces.OperationExecutionInterface;
import com.data.serialization.DataSerializationManager;

class DataLinkEstablisher
implements OperationExecutionInterface {
    final DataSerializationManager T;

    DataLinkEstablisher(DataSerializationManager dataSerializationManager) {
        this.T = dataSerializationManager;
    }

    @Override
    public void R() {
        this.T.Y();
    }
}

