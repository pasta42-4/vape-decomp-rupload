/*
 * Decompiled with CFR 0.152.
 */
package com.data.processing;

import com.security.auth.AuthenticationTokenManager463;
import com.system.lifecycle.ObjectLifecycleTracker;

public class DataStreamEncoder
extends ObjectLifecycleTracker {
    public float A() {
        return AuthenticationTokenManager463.h(DataStreamEncoder.U.u().L3, this.H);
    }

    public DataStreamEncoder(Object object) {
        super(object);
    }

    public void i(float f) {
        AuthenticationTokenManager463.h(DataStreamEncoder.U.u().L3, this.H, f);
    }

    public float w() {
        return AuthenticationTokenManager463.Z(DataStreamEncoder.U.u().L3, this.H);
    }

    public void k(float f) {
        AuthenticationTokenManager463.D(DataStreamEncoder.U.u().L3, this.H, f);
    }
}

