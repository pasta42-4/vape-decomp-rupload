/*
 * Decompiled with CFR 0.152.
 */
package com.event.core;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.security.key.CryptographicKeyManager131;
import com.system.lifecycle.ObjectLifecycleTracker;

public class EventDispatchOrchestrator1391
extends ObjectLifecycleTracker {
    public void L() {
        CryptographicKeyManager131.e(EventDispatchOrchestrator1391.U.u().d0, this.H);
    }

    public void e(boolean bl) {
        CryptographicKeyManager131.Q(EventDispatchOrchestrator1391.U.u().d0, this.H, bl);
    }

    public void q() {
        CryptographicKeyManager131.O(EventDispatchOrchestrator1391.U.u().d0, this.H);
    }

    public void p() {
        CryptographicKeyManager131.S(EventDispatchOrchestrator1391.U.u().d0, this.H);
    }

    public void j(int n) {
        CryptographicKeyManager131.a(EventDispatchOrchestrator1391.U.u().d0, this.H, n);
    }

    public void B() {
        CryptographicKeyManager131.y(EventDispatchOrchestrator1391.U.u().d0, this.H);
    }

    public void p(int n, int n2) {
        try {
            if (GeometryCalculator.C() >= 35) {
                CryptographicKeyManager131.v(EventDispatchOrchestrator1391.U.u().d0, this.H, n, n2, false);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchOrchestrator1391.a(customSystemException);
        }
        CryptographicKeyManager131.n(EventDispatchOrchestrator1391.U.u().d0, this.H, n, n2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void C(int n, int n2) {
        CryptographicKeyManager131.x(EventDispatchOrchestrator1391.U.u().d0, this.H, n, n2);
    }

    public EventDispatchOrchestrator1391(Object object) {
        super(object);
    }

    public int D() {
        return CryptographicKeyManager131.q(EventDispatchOrchestrator1391.U.u().d0, this.H);
    }

    public static EventDispatchOrchestrator1391 t(int n, int n2, boolean bl) {
        try {
            if (GeometryCalculator.C() >= 37) {
                return new EventDispatchOrchestrator1391(CryptographicKeyManager131.B(EventDispatchOrchestrator1391.U.u().d0, n, n2, true));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchOrchestrator1391.a(customSystemException);
        }
        return new EventDispatchOrchestrator1391(CryptographicKeyManager131.B(EventDispatchOrchestrator1391.U.u().d0, n, n2, bl));
    }
}

