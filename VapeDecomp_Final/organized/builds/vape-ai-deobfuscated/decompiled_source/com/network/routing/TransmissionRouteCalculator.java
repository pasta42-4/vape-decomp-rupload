/*
 * Decompiled with CFR 0.152.
 */
package com.network.routing;

import com.security.cipher.CipherTransformationHandler897;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransmissionRouteCalculator
extends ObjectLifecycleTracker {
    public TransmissionRouteCalculator(Object object) {
        super(object);
    }

    public static TransmissionRouteCalculator J() {
        return new TransmissionRouteCalculator(CipherTransformationHandler897.e(TransmissionRouteCalculator.U.u().W));
    }
}

