/*
 * Decompiled with CFR 0.152.
 */
package com.data.compression;

import a.bw;
import com.security.crypto.CryptographicTransformationService;
import com.transaction.management.TransactionOrchestrator1017;

class DataCompressionFilter
extends bw {
    final CryptographicTransformationService R;

    @Override
    public TransactionOrchestrator1017 K() {
        return this.R.s();
    }

    DataCompressionFilter(CryptographicTransformationService cryptographicTransformationService, double d2, double d3) {
        this.R = cryptographicTransformationService;
        super(d2, d3);
    }
}

