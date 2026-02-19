/*
 * Decompiled with CFR 0.152.
 */
package com.event.propagation;

import com.app.entity.movement.EntityMovementController;
import com.exception.system.CustomSystemException;
import com.security.transform.CryptographicTransformer;

public class EventPropagationHandler
extends EntityMovementController {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public EventPropagationHandler(Object object) {
        super(new CryptographicTransformer(object));
    }

    @Override
    public boolean fire() {
        try {
            if (P.Y()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventPropagationHandler.a(customSystemException);
        }
        boolean bl = super.fire();
        P.T(EntityMovementController.access$300());
        return bl;
    }
}

