/*
 * Decompiled with CFR 0.152.
 */
package com.app.event.core;

import a.Z3;
import com.app.events.EventNotificationBroker2314;
import com.exception.system.CustomSystemException;

public interface EventCancellationProtocol
extends EventNotificationBroker2314 {
    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void setCanceled(boolean var1);

    @Override
    default public boolean fire() {
        boolean bl;
        EventCancellationProtocol eventCancellationProtocol = Z3.s().k(this);
        try {
            bl = !eventCancellationProtocol.isCanceled();
        }
        catch (CustomSystemException customSystemException) {
            throw EventCancellationProtocol.b(customSystemException);
        }
        return bl;
    }

    public boolean isCanceled();
}

