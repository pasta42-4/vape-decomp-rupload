/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import a.HK;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.protocol.CommunicationProtocolNegotiator1714;
import com.reflection.metadata.ClassMetadataResolver731;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.auth.AuthenticationProvider2618;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.validation.TransactionValidationProcessor;

public class AuthenticationHandler1695
extends ClassMetadataResolver731 {
    public AuthenticationHandler1695() {
        super(ReflectionMetadataResolver.rl);
    }

    @Override
    public void y() {
        this.P();
    }

    private void P() {
        try {
            if (GameVersionEnumerator.MC_1_21_10.Q()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationHandler1695.a(customSystemException);
        }
        HK hK = TemporalMetadataResolver.h.u().gw.M;
        this.P(hK, AuthenticationProvider2618.class, new CommunicationProtocolNegotiator1714(0).s(Object.class));
        this.l(hK, TransactionValidationProcessor.class, new CommunicationProtocolNegotiator1714(0).s(Object.class));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

