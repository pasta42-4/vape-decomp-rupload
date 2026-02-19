/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.management;

import com.exception.system.CustomSystemException;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransactionCoordinator2120
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public TransactionCoordinator2120(Object object) {
        super(object);
    }

    public static int o() {
        try {
            if (TransactionCoordinator2120.U.u().g3 == null) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionCoordinator2120.a(customSystemException);
        }
        return TransactionCoordinator2120.U.u().g3.z();
    }
}

