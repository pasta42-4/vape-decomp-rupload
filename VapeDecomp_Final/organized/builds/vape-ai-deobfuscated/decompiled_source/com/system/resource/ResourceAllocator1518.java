/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import a.qL;
import com.app.gamelogic.GameStateController1693;
import com.network.connection.NetworkConnectionManager1945;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ResourceAllocator1518<T extends CryptographicTransformer>
extends ObjectLifecycleTracker {
    public NetworkConnectionManager1945 j(CryptographicTransformer cryptographicTransformer) {
        return new NetworkConnectionManager1945(qL.e(ResourceAllocator1518.U.u().dw, this.H, cryptographicTransformer.M()));
    }

    public ResourceAllocator1518(Object object) {
        super(object);
    }

    public void u(CryptographicTransformer cryptographicTransformer, double d2, double d3, double d4, float f, float f2) {
        qL.V(ResourceAllocator1518.U.u().dw, this.H, cryptographicTransformer.M(), d2, d3, d4, f, f2);
    }

    public GameStateController1693 j(CryptographicTransformer cryptographicTransformer, float f) {
        return new GameStateController1693(qL.q(ResourceAllocator1518.U.u().dw, this.H, cryptographicTransformer.M(), f));
    }
}

