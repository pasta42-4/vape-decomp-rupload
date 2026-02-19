/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import a.fe;
import com.app.core.interfaces.OperationExecutionInterface;
import com.resource.management.AssetStreamProcessor;
import com.system.configuration.AdaptiveConfigEngine;

class CryptographicKeyExchanger1707
implements OperationExecutionInterface {
    final int h;
    final AssetStreamProcessor w;
    final fe A;

    CryptographicKeyExchanger1707(AssetStreamProcessor assetStreamProcessor, fe fe2, int n) {
        this.w = assetStreamProcessor;
        this.A = fe2;
        this.h = n;
    }

    @Override
    public void O() {
        this.A.m().J().set(this.h, new AdaptiveConfigEngine(0));
    }

    @Override
    public void R() {
        this.A.P(this.h);
    }
}

