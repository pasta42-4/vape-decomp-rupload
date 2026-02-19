/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.adapters.type.TypeAdapterRegistry;
import com.app.data.processing.DataTransformationHandler2028;
import com.app.error.handling.ErrorRecoveryManager;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransmissionProtocolHandler1868
extends ObjectLifecycleTracker {
    public DataTransformationHandler2028 U(ErrorRecoveryManager errorRecoveryManager, ReflectionUtilityBroker reflectionUtilityBroker) {
        return new DataTransformationHandler2028(TypeAdapterRegistry.e(TransmissionProtocolHandler1868.U.u().gn, this.H, errorRecoveryManager.M(), reflectionUtilityBroker.M()));
    }

    public boolean h(Object object, Object object2) {
        return TypeAdapterRegistry.l(TransmissionProtocolHandler1868.U.u().gn, this.H, object, object2);
    }

    public TransmissionProtocolHandler1868(Object object) {
        super(object);
    }
}

