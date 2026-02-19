/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.transaction.validation;

import com.batch.processing.BatchWorker;
import com.core.lifecycle.ObjectLifecycleManager;
import com.crypto.streaming.CipherStreamProcessor;
import com.google.gson.JsonObject;

class TransactionValidationHandler
extends CipherStreamProcessor {
    final ObjectLifecycleManager d;

    TransactionValidationHandler(ObjectLifecycleManager objectLifecycleManager, Object object, String string, BatchWorker batchWorker) {
        this.d = objectLifecycleManager;
        super(object, string, batchWorker);
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public boolean C(JsonObject jsonObject) {
        boolean bl = super.C(jsonObject);
        return bl;
    }
}

