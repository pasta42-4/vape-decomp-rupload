/*
 * Decompiled with CFR 0.152.
 */
package com.event.propagation;

import com.app.entity.movement.EntityMovementController;
import com.exception.system.CustomSystemException;
import com.security.transform.CryptographicTransformer;

public class EventPropagationDispatcher
extends EntityMovementController {
    @Override
    public boolean fire() {
        try {
            if (P.Y()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventPropagationDispatcher.a(customSystemException);
        }
        boolean bl = super.fire();
        try {
            EntityMovementController.access$302(P.o());
            if (EventPropagationDispatcher.shouldAlwaysSend()) {
                P.T(new CryptographicTransformer(null));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventPropagationDispatcher.a(customSystemException);
        }
        return bl;
    }

    public EventPropagationDispatcher(Object object) {
        super(new CryptographicTransformer(object));
        g = false;
        EntityMovementController.access$002(EntityMovementController.P.q());
        EntityMovementController.access$102(EntityMovementController.P.S());
        EntityMovementController.access$202(EntityMovementController.P.j());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

