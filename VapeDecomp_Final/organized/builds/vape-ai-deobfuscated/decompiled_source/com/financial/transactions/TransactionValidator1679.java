/*
 * Decompiled with CFR 0.152.
 */
package com.financial.transactions;

import com.app.network.NetworkProtocolHandler1444;
import com.crypto.keygen.CipherKeyGenerator;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransactionValidator1679
extends ObjectLifecycleTracker {
    public void K() {
        CipherKeyGenerator.o(TransactionValidator1679.U.u().db, this.H);
    }

    public TransactionValidator1679(Object object) {
        super(object);
    }

    public static TransactionValidator1679 B(NetworkProtocolHandler1444 networkProtocolHandler1444) {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1679.a(customSystemException);
        }
        return new TransactionValidator1679(CipherKeyGenerator.a(TransactionValidator1679.U.u().db, networkProtocolHandler1444.M()));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void d() {
        CipherKeyGenerator.J(TransactionValidator1679.U.u().db, this.H);
    }
}

