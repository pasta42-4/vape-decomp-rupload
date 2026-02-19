/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.math.geometry.GeometryCalculator;
import com.security.data.SecureDataTransformer273;
import com.system.lifecycle.ObjectLifecycleTracker;

public class NetworkProtocolHandler1842
extends ObjectLifecycleTracker {
    public NetworkProtocolHandler1842(Object object) {
        super(object);
    }

    public float h() {
        return SecureDataTransformer273.j(NetworkProtocolHandler1842.U.u().Ll, this.H);
    }

    public void z(float f) {
        if (GeometryCalculator.C() >= 23) {
            float f2 = 50.0f;
            SecureDataTransformer273.u(NetworkProtocolHandler1842.U.u().Ll, this.H, f2 / f);
            return;
        }
        SecureDataTransformer273.m(NetworkProtocolHandler1842.U.u().Ll, this.H, f);
    }

    public float R() {
        if (GeometryCalculator.C() >= 23) {
            float f = 50.0f;
            return f / NetworkProtocolHandler1842.U.u().Ll.s(this.H);
        }
        return SecureDataTransformer273.U(NetworkProtocolHandler1842.U.u().Ll, this.H);
    }

    public float v() {
        return SecureDataTransformer273.a(NetworkProtocolHandler1842.U.u().Ll, this.H);
    }
}

