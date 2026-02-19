/*
 * Decompiled with CFR 0.152.
 */
package com.app.event.processing;

import com.network.transmission.TransmissionStateManager;
import com.runtime.conversion.TypeConvertor;
import com.service.lifecycle.ServiceLifecycleManager;

public class EventStreamProcessor2411
extends TransmissionStateManager {
    public EventStreamProcessor2411(Object object) {
        super(object);
    }

    public ServiceLifecycleManager j() {
        return new ServiceLifecycleManager(TypeConvertor.U(EventStreamProcessor2411.U.u().LN, this.H));
    }
}

