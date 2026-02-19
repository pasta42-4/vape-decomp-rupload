/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.management;

import a.wF;
import com.app.core.interfaces.OperationExecutionInterface;

class TransactionRollbackManager
implements OperationExecutionInterface {
    final wF l;

    @Override
    public void R() {
        wF.F(this.l);
    }

    TransactionRollbackManager(wF wF2) {
        this.l = wF2;
    }
}

