/*
 * Decompiled with CFR 0.152.
 */
package com.core.utility;

import a.Ec;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.financial.fraud.TransactionAnomalyDetector;
import com.game.configuration.GameVersionEnumerator;

public class ContextualActionResolver {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void L() {
        try {
            if (GameVersionEnumerator.MC_1_21_6.Q()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualActionResolver.a(customSystemException);
        }
        Ec ec2 = ApplicationLifecycleManager.U();
        ec2.G().E(ec2.D().n(TransactionAnomalyDetector.M()));
    }
}

