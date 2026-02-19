/*
 * Decompiled with CFR 0.152.
 */
package com.network.security;

import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.security.token.TokenLifecycleController;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ProtocolValidator
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ProtocolValidator(Object object) {
        super(object);
    }

    public static ProtocolValidator f() {
        try {
            if (GameVersionEnumerator.MC_1_21_0.H()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ProtocolValidator.a(customSystemException);
        }
        return new ProtocolValidator(TokenLifecycleController.Z(ProtocolValidator.U.u().dm));
    }
}

