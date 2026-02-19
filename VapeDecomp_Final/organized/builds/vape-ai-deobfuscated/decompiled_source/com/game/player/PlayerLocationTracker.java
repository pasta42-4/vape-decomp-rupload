/*
 * Decompiled with CFR 0.152.
 */
package com.game.player;

import com.app.events.EventTriggeringMechanism;
import com.graphics.rendering.RenderEventDispatcher;
import com.security.crypto.CipherKeyExchangeManager2564;
import com.transaction.management.TransactionOrchestrator1017;

public class PlayerLocationTracker
implements EventTriggeringMechanism {
    private final double b;
    private final double r;
    private final TransactionOrchestrator1017 Y;
    private final Object h;
    private final double u;

    public PlayerLocationTracker(Object object, double d2, double d3, double d4) {
        this(null, object, d2, d3, d4);
    }

    public PlayerLocationTracker(Object object, Object object2, double d2, double d3, double d4) {
        this.h = object;
        this.Y = new TransactionOrchestrator1017(object2);
        this.b = d2;
        this.r = d3;
        this.u = d4;
    }

    public double getPosY() {
        return this.r;
    }

    public TransactionOrchestrator1017 getClientPlayer() {
        return this.Y;
    }

    @Override
    public boolean fire() {
        boolean bl = new RenderEventDispatcher(this.Y, this.b, this.r, this.u, null).fire();
        if (this.h != null) {
            CipherKeyExchangeManager2564 cipherKeyExchangeManager2564 = new CipherKeyExchangeManager2564(this.h);
            cipherKeyExchangeManager2564.Q(bl);
        }
        return bl;
    }

    public double getPosZ() {
        return this.u;
    }

    public double getPosX() {
        return this.b;
    }

    public Object getForgeEvent() {
        return this.h;
    }
}

