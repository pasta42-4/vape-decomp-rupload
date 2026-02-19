/*
 * Decompiled with CFR 0.152.
 */
package com.financial.transaction;

import a.v1;
import com.data.compression.CompressionAlgorithmManager;
import com.exception.system.CustomSystemException;
import com.system.scheduling.TimelineSequencer;

public class TransactionValidator1827
extends TimelineSequencer {
    private static boolean z;

    public static void c(boolean bl) {
        z = bl;
    }

    @Override
    protected void Y() {
        this.i(CompressionAlgorithmManager.class, v1.class);
    }

    public static boolean W() {
        return z;
    }

    public static boolean y() {
        boolean bl = TransactionValidator1827.W();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1827.a(customSystemException);
        }
        return false;
    }

    public TransactionValidator1827(int n) {
        super(n);
    }

    static {
        if (TransactionValidator1827.y()) {
            TransactionValidator1827.c(true);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

