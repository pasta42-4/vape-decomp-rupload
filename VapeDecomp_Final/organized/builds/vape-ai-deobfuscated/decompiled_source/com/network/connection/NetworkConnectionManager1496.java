/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.concurrency.filtering.ConcurrentFilteringCoordinator;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.security.crypto.CipherManager;
import com.security.transform.GenericCryptoTransformer;
import com.temporal.metadata.TemporalMetadataResolver;

public class NetworkConnectionManager1496
extends CipherManager {
    private boolean mf = false;

    public NetworkConnectionManager1496(String string) {
        super(string);
        this.i(false);
    }

    @Override
    public void g() {
        try {
            if (this.mf) {
                this.Nf.c();
                this.mf = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1496.a(customSystemException);
        }
        super.g();
    }

    @Override
    public double z() {
        return 20.0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void O() {
        try {
            if (!this.E()) {
                this.y("");
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1496.a(customSystemException);
        }
        ConcurrentFilteringCoordinator concurrentFilteringCoordinator = new ConcurrentFilteringCoordinator(this.a(), EventDispatchCoordinator1159.u().getRGB());
        TemporalMetadataResolver.h.m().k(concurrentFilteringCoordinator);
        ((GenericCryptoTransformer)this.F()).Z();
        this.y("");
    }

    @Override
    public double e() {
        return 110.0;
    }

    @Override
    public double M() {
        return 110.0;
    }
}

