/*
 * Decompiled with CFR 0.152.
 */
package com.game.state;

import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.protocol.registry.ProtocolEnumerationRegistry;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import java.awt.Color;

class GameStateTracker1395
extends AbstractComputationKernel {
    private final ProtocolEnumerationRegistry v;

    @Override
    public double z() {
        return 20.0;
    }

    @Override
    public double e() {
        return 50.0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public GameStateTracker1395(ProtocolEnumerationRegistry protocolEnumerationRegistry) {
        this.v = protocolEnumerationRegistry;
    }

    @Override
    public void G() {
        CryptographicParameterGenerator cryptographicParameterGenerator = this.t(0.65);
        String string = this.v.O().toUpperCase();
        double d2 = 20.0;
        double d3 = this.G();
        this.getClass();
        double d4 = d3 - 5.0 / 2.0;
        try {
            if (this.v == ProtocolEnumerationRegistry.AND) {
                ConfigurationManager.A(d4 + d2 / 2.0, this.W() - 1.0, 1.0, 5.0, GameStateTracker1395.M.X);
                ConfigurationManager.A(d4 + d2 / 2.0, this.W() + this.b() / 2.0 + cryptographicParameterGenerator.B(string) + 2.0, 1.0, 5.0, GameStateTracker1395.M.X);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GameStateTracker1395.a(customSystemException);
        }
        double d5 = this.W() + this.b() / 2.0 - cryptographicParameterGenerator.B(string) / 2.0;
        this.getClass();
        double d6 = d5 - 5.0 / 2.0;
        double d7 = cryptographicParameterGenerator.B(string);
        this.getClass();
        ConfigurationManager.C(d4, d6, d2, d7 + 5.0, GameStateTracker1395.M.L, 1.0f);
        cryptographicParameterGenerator.Q(string, d4 + d2 / 2.0, this.W() + this.b() / 2.0 - cryptographicParameterGenerator.B(string) / 2.0, Color.WHITE);
    }
}

