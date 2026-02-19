/*
 * Decompiled with CFR 0.152.
 */
package com.network.transmission;

import com.exception.system.CustomSystemException;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.system.lifecycle.ObjectLifecycleTracker;

public class TransmissionStateManager
extends ObjectLifecycleTracker {
    private static boolean m;

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int B() {
        try {
            if (m) {
                return TransmissionStateManager.U.u().L9.V(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransmissionStateManager.b(customSystemException);
        }
        return this.x().o();
    }

    public int t() {
        try {
            if (m) {
                return TransmissionStateManager.U.u().L9.i(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransmissionStateManager.b(customSystemException);
        }
        return this.x().j();
    }

    static boolean n(boolean bl) {
        m = bl;
        return m;
    }

    public TransmissionStateManager(Object object) {
        super(object);
    }

    public ReflectionUtilityBroker x() {
        return new ReflectionUtilityBroker(TransmissionStateManager.U.u().L9.q(this.H));
    }

    public int o() {
        try {
            if (m) {
                return TransmissionStateManager.U.u().L9.T(this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransmissionStateManager.b(customSystemException);
        }
        return this.x().q();
    }
}

