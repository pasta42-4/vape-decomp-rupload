/*
 * Decompiled with CFR 0.152.
 */
package com.execution.strategy;

import com.data.protocol.DataProcessingProtocol;
import com.exception.system.CustomSystemException;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.configuration.SecurityEnumRegistry;
import com.security.crypto.CryptoAlgorithmResolver;
import java.awt.Point;

class StrategyExecutor
implements DataProcessingProtocol {
    final CryptoAlgorithmResolver D;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        boolean bl;
        AdaptiveCipherEngine adaptiveCipherEngine;
        try {
            adaptiveCipherEngine = CryptoAlgorithmResolver.b(this.D);
            bl = !CryptoAlgorithmResolver.b(this.D).f();
        }
        catch (CustomSystemException customSystemException) {
            throw StrategyExecutor.a(customSystemException);
        }
        adaptiveCipherEngine.N(bl);
    }

    StrategyExecutor(CryptoAlgorithmResolver cryptoAlgorithmResolver) {
        this.D = cryptoAlgorithmResolver;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

