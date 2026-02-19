/*
 * Decompiled with CFR 0.152.
 */
package com.app.concurrency;

import a.Ux;
import com.network.core.NetworkConnectionManager2538;
import com.security.transform.CryptographicTransformer;

public class ThreadPoolConfigManager
extends NetworkConnectionManager2538 {
    public ThreadPoolConfigManager(Object object) {
        super(object);
    }

    public CryptographicTransformer L() {
        return new CryptographicTransformer(Ux.E(ThreadPoolConfigManager.U.u().dK, this.M()));
    }
}

