/*
 * Decompiled with CFR 0.152.
 */
package com.financial.verification;

import a.HK;
import com.event.dispatch.EventDispatchController1028;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.reflection.metadata.ClassMetadataResolver731;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.util.ContextualReflectionUtility;
import com.resource.allocation.ResourceAllocationStrategy2242;
import com.security.auth.AuthenticationProtocol;
import com.temporal.metadata.TemporalMetadataResolver;

public class PaymentVerificationService
extends ClassMetadataResolver731 {
    @Override
    public void y() {
        HK hK = TemporalMetadataResolver.h.u().GT.A;
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                this.P(hK, EventTriggerEngine.class, new ResourceAllocationStrategy2242(1, ContextualReflectionUtility.w(ReflectionMetadataResolver.YU)).s(Object.class));
                this.l(hK, EventDispatchController1028.class, new AuthenticationProtocol[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PaymentVerificationService.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public PaymentVerificationService() {
        super(ReflectionMetadataResolver.b5);
    }
}

