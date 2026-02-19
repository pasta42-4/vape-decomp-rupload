/*
 * Decompiled with CFR 0.152.
 */
package com.data.compression;

import com.security.keyexchange.CryptoKeyExchangeManager;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.version.management.VersionController;

public class CompressionUtility1855
extends ObjectLifecycleTracker {
    public VersionController u(int n) {
        return new VersionController(CryptoKeyExchangeManager.B(CompressionUtility1855.U.u().Lm, this.H, n));
    }

    public CompressionUtility1855(Object object) {
        super(object);
    }

    public String c(int n) {
        return CryptoKeyExchangeManager.h(CompressionUtility1855.U.u().Lm, this.H, n);
    }

    public int Y() {
        return CryptoKeyExchangeManager.t(CompressionUtility1855.U.u().Lm, this.H);
    }
}

