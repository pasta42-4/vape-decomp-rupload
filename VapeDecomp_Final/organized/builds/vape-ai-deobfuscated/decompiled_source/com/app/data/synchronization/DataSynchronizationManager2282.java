/*
 * Decompiled with CFR 0.152.
 */
package com.app.data.synchronization;

import a.hg;
import com.app.core.interfaces.OperationExecutionInterface;
import com.security.transform.GenericCryptoTransformer;

class DataSynchronizationManager2282
implements OperationExecutionInterface {
    final GenericCryptoTransformer v;
    final hg C;

    @Override
    public void R() {
        this.C.g(false);
    }

    DataSynchronizationManager2282(GenericCryptoTransformer genericCryptoTransformer, hg hg2) {
        this.v = genericCryptoTransformer;
        this.C = hg2;
    }
}

