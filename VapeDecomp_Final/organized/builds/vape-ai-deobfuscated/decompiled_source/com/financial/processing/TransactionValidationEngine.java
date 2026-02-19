/*
 * Decompiled with CFR 0.152.
 */
package com.financial.processing;

import com.game.configuration.GameVersionEnumerator;
import com.network.connection.ConnectionLifecycleHandler;
import com.system.config.SystemConfigurationManager;

public class TransactionValidationEngine
extends ConnectionLifecycleHandler {
    public int d() {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            SystemConfigurationManager systemConfigurationManager = this.Z();
            return (int)systemConfigurationManager.i().f();
        }
        return TransactionValidationEngine.U.u().gU.f(this.H);
    }

    public TransactionValidationEngine(Object object) {
        super(object);
    }

    public SystemConfigurationManager Z() {
        return new SystemConfigurationManager(TransactionValidationEngine.U.u().gU.f(this.H));
    }

    public int S() {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            SystemConfigurationManager systemConfigurationManager = this.Z();
            return (int)systemConfigurationManager.i().F();
        }
        return TransactionValidationEngine.U.u().gU.Q(this.H);
    }

    public int I() {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            SystemConfigurationManager systemConfigurationManager = this.Z();
            return (int)systemConfigurationManager.i().X();
        }
        return TransactionValidationEngine.U.u().gU.x(this.H);
    }

    public byte F() {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            SystemConfigurationManager systemConfigurationManager = this.Z();
            return (byte)systemConfigurationManager.X();
        }
        return TransactionValidationEngine.U.u().gU.R(this.H);
    }

    public byte T() {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            SystemConfigurationManager systemConfigurationManager = this.Z();
            return (byte)systemConfigurationManager.G();
        }
        return TransactionValidationEngine.U.u().gU.N(this.H);
    }

    public int K() {
        return TransactionValidationEngine.U.u().gU.l(this.H);
    }
}

