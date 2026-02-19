/*
 * Decompiled with CFR 0.152.
 */
package com.app.sorting;

import com.security.transform.CryptographicTransformer;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.Comparator;

public class QueueComparator
implements Comparator<CryptographicTransformer> {
    private float F(CryptographicTransformer cryptographicTransformer) {
        TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(cryptographicTransformer.M());
        return transactionOrchestrator1017.e();
    }

    public int X(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        return Float.compare(this.F(cryptographicTransformer), this.F(cryptographicTransformer2));
    }
}

