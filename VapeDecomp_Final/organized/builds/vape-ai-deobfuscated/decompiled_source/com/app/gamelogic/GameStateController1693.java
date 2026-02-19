/*
 * Decompiled with CFR 0.152.
 */
package com.app.gamelogic;

import com.security.authentication.AuthenticationStateManager675;
import com.security.context.SecureContextBroker;
import com.system.lifecycle.ObjectLifecycleTracker;

public class GameStateController1693
extends ObjectLifecycleTracker {
    public void u(AuthenticationStateManager675 authenticationStateManager675) {
        GameStateController1693.U.u().gH.G(this.H, authenticationStateManager675.M());
    }

    public AuthenticationStateManager675 Y() {
        return new AuthenticationStateManager675(GameStateController1693.U.u().gH.h(this.H));
    }

    public double J() {
        return SecureContextBroker.v(GameStateController1693.U.u().gH, this.H);
    }

    public GameStateController1693(Object object) {
        super(object);
    }

    public double B() {
        return SecureContextBroker.U(GameStateController1693.U.u().gH, this.H);
    }

    public double T() {
        return SecureContextBroker.J(GameStateController1693.U.u().gH, this.H);
    }
}

