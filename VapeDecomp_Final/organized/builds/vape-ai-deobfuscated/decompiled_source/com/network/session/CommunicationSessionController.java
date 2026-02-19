/*
 * Decompiled with CFR 0.152.
 */
package com.network.session;

import com.runtime.reflection.ReflectionParameterResolver;
import com.system.lifecycle.ObjectLifecycleTracker;

public class CommunicationSessionController
extends ObjectLifecycleTracker {
    public static CommunicationSessionController g() {
        return new CommunicationSessionController(ReflectionParameterResolver.O(CommunicationSessionController.U.u().dP));
    }

    public CommunicationSessionController(Object object) {
        super(object);
    }

    public boolean y() {
        return ReflectionParameterResolver.M(CommunicationSessionController.U.u().dP, this.H);
    }

    public int l() {
        return ReflectionParameterResolver.R(CommunicationSessionController.U.u().dP, this.H);
    }
}

