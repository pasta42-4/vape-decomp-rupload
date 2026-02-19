/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class Protocolnegotiator
extends ObjectLifecycleTracker {
    public void r(boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                this.u(this.m(), this.p(), this.z(), this.J(), this.u(), this.g(), bl);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Protocolnegotiator.a(customSystemException);
        }
        Protocolnegotiator.U.u().dq.g(this.H, bl);
    }

    public boolean l() {
        return Protocolnegotiator.U.u().dq.d(this.H);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void u(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        Protocolnegotiator protocolnegotiator = new Protocolnegotiator(Protocolnegotiator.U.u().dq.k(bl, bl2, bl3, bl4, bl5, bl6, bl7));
        this.H = protocolnegotiator.M();
        ApplicationLifecycleManager.U().W().C(protocolnegotiator);
    }

    public boolean J() {
        return Protocolnegotiator.U.u().dq.g(this.H);
    }

    public boolean z() {
        return Protocolnegotiator.U.u().dq.Q(this.H);
    }

    public void Y(boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                this.u(this.m(), this.p(), this.z(), this.J(), this.u(), bl, this.l());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Protocolnegotiator.a(customSystemException);
        }
        Protocolnegotiator.U.u().dq.e(this.H, bl);
    }

    public boolean g() {
        return Protocolnegotiator.U.u().dq.C(this.H);
    }

    public boolean u() {
        return Protocolnegotiator.U.u().dq.B(this.H);
    }

    public Protocolnegotiator(Object object) {
        super(object);
    }

    public boolean p() {
        return Protocolnegotiator.U.u().dq.k(this.H);
    }

    public boolean m() {
        return Protocolnegotiator.U.u().dq.H(this.H);
    }

    public void W(boolean bl) {
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                this.u(this.m(), this.p(), this.z(), this.J(), bl, this.g(), this.l());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Protocolnegotiator.a(customSystemException);
        }
        Protocolnegotiator.U.u().dq.n(this.H, bl);
    }
}

