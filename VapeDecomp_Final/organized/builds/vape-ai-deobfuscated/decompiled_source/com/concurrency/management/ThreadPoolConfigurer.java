/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.management;

import com.exception.system.CustomSystemException;
import com.game.state.GameStateModulator;
import com.security.crypto.CryptographicTransformationService;

class ThreadPoolConfigurer
extends GameStateModulator {
    final CryptographicTransformationService F;

    ThreadPoolConfigurer(CryptographicTransformationService cryptographicTransformationService, int n, int n2) {
        this.F = cryptographicTransformationService;
        super(n, n2);
    }

    double k() {
        double d2;
        try {
            d2 = CryptographicTransformationService.b(this.F) ? 0.6 : super.k();
        }
        catch (CustomSystemException customSystemException) {
            throw ThreadPoolConfigurer.b(customSystemException);
        }
        return d2;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

