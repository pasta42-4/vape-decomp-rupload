/*
 * Decompiled with CFR 0.152.
 */
package com.app.concurrency.management;

import a.bE;
import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationProfileManager;

class ThreadLifecycleManager
extends SymmetricCipherManager {
    final ConfigurationProfileManager YA;

    ThreadLifecycleManager(ConfigurationProfileManager configurationProfileManager, double d2) {
        this.YA = configurationProfileManager;
        super(d2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public double q() {
        double d2 = 0.0;
        try {
            if (!ConfigurationProfileManager.C(this.YA).f()) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ThreadLifecycleManager.a(customSystemException);
        }
        for (AbstractComputationKernel abstractComputationKernel : ConfigurationProfileManager.C(this.YA).A()) {
            if (abstractComputationKernel instanceof bE) continue;
            try {
                if (!abstractComputationKernel.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ThreadLifecycleManager.a(customSystemException);
            }
            d2 += abstractComputationKernel.w();
        }
        return d2 + 2.0;
    }
}

