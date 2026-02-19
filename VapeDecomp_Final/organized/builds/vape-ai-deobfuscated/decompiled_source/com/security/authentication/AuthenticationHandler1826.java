/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.app.communication.DataChannelMediator;
import com.event.core.EventDispatchOrchestrator1391;
import com.network.connection.NetworkConnectionManager1945;
import com.network.messaging.MessageTransmissionHandler2559;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.List;

public class AuthenticationHandler1826
extends ObjectLifecycleTracker {
    public static AuthenticationHandler1826 w(DataChannelMediator dataChannelMediator, MessageTransmissionHandler2559 messageTransmissionHandler2559, EventDispatchOrchestrator1391 eventDispatchOrchestrator1391, NetworkConnectionManager1945 networkConnectionManager1945) {
        return new AuthenticationHandler1826(AuthenticationHandler1826.U.u().kK.m(dataChannelMediator.M(), messageTransmissionHandler2559.M(), eventDispatchOrchestrator1391.M(), networkConnectionManager1945.M()));
    }

    public AuthenticationHandler1826(Object object) {
        super(object);
    }

    public List l() {
        return AuthenticationHandler1826.U.u().kK.f(this.H);
    }

    public void x(int n, int n2) {
        AuthenticationHandler1826.U.u().kK.R(this.H, n, n2);
    }
}

