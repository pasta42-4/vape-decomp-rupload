/*
 * Decompiled with CFR 0.152.
 */
package com.caching.resource;

import com.exception.system.CustomSystemException;
import com.financial.transaction.TransactionValidator1827;
import com.math.geometry.GeometryCalculator;
import com.system.scheduling.TimelineSequencer;

public class ResourceCacheManager {
    private static TimelineSequencer A;

    public static TimelineSequencer E() {
        try {
            if (A == null) {
                A = ResourceCacheManager.Z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceCacheManager.a(customSystemException);
        }
        return A;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static TimelineSequencer Z() {
        TransactionValidator1827 transactionValidator1827 = null;
        switch (GeometryCalculator.C()) {
            case 35: {
                transactionValidator1827 = new TransactionValidator1827(35);
            }
        }
        return transactionValidator1827;
    }
}

