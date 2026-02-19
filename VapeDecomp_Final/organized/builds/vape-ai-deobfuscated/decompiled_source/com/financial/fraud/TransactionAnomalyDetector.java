/*
 * Decompiled with CFR 0.152.
 */
package com.financial.fraud;

import com.metadata.mapping.ObjectMetadataMapper;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransactionAnomalyDetector
extends ObjectLifecycleTracker {
    public TransactionAnomalyDetector(Object object) {
        super(object);
    }

    public static TransactionAnomalyDetector F() {
        return new TransactionAnomalyDetector(ObjectMetadataMapper.b(TransactionAnomalyDetector.U.u().kZ));
    }

    public static TransactionAnomalyDetector M() {
        return new TransactionAnomalyDetector(ObjectMetadataMapper.B(TransactionAnomalyDetector.U.u().kZ));
    }
}

