/*
 * Decompiled with CFR 0.152.
 */
package com.core.registration;

import a.HK;
import com.event.management.EventDispatchCoordinator2607;
import com.game.configuration.GameVersionEnumerator;
import com.notification.distribution.NotificationDistributionManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.crypto.EncryptionTransformer;
import com.temporal.metadata.TemporalMetadataResolver;

public class ClassRegistrationHandler
extends EncryptionTransformer {
    public ClassRegistrationHandler() {
        super(ReflectionMetadataResolver.f);
    }

    @Override
    public void y() {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            try {
                HK hK = null;
                if (GameVersionEnumerator.MC_1_21_10.H()) {
                    hK = TemporalMetadataResolver.h.u().gY.Q;
                } else if (GameVersionEnumerator.MC_1_21_4.H()) {
                    hK = TemporalMetadataResolver.h.u().gY.d;
                }
                this.O(hK, EventDispatchCoordinator2607.class, "");
                this.w(hK, NotificationDistributionManager.class, "");
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
    }
}

