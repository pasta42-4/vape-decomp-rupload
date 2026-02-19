/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.routing;

import com.exception.system.CustomSystemException;
import com.security.access.ResourceAccessController1877;
import com.system.lifecycle.ObjectLifecycleTracker;

public class MessageRoutingController
extends ObjectLifecycleTracker {
    private ResourceAccessController1877 p = null;

    @Override
    public ResourceAccessController1877 M() {
        try {
            if (this.p == null) {
                this.p = new ResourceAccessController1877(MessageRoutingController.U.u().kD.x(this.H));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MessageRoutingController.a(customSystemException);
        }
        return this.p;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public MessageRoutingController(Object object) {
        super(object);
    }
}

