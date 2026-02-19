/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.tasks;

import com.database.query.QueryExecutionHandler;
import com.messaging.async.AsynchronousMessageDispatcher;
import com.security.token.CryptographicTokenManager1032;
import com.temporal.metadata.TemporalMetadataResolver;

class AsynchronousTaskExecutor2063
extends Thread {
    final CryptographicTokenManager1032 e;

    @Override
    public void run() {
        while (!TemporalMetadataResolver.h.V()) {
            QueryExecutionHandler.q(50L);
            for (Integer n : CryptographicTokenManager1032.k(this.e).keySet()) {
                ((AsynchronousMessageDispatcher)CryptographicTokenManager1032.k(this.e).get(n)).u();
            }
        }
    }

    AsynchronousTaskExecutor2063(CryptographicTokenManager1032 cryptographicTokenManager1032) {
        this.e = cryptographicTokenManager1032;
    }
}

