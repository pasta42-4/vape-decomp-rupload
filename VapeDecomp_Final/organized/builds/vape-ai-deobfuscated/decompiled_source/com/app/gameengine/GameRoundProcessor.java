/*
 * Decompiled with CFR 0.152.
 */
package com.app.gameengine;

import com.caching.strategy.CacheInvalidationStrategy;
import com.network.connection.NetworkConnectionManager1945;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.util.conversion.TypeConversionUtility;
import java.util.stream.Stream;

public class GameRoundProcessor
extends ObjectLifecycleTracker {
    public Object e(int n) {
        return TypeConversionUtility.v(GameRoundProcessor.U.u().Gi, this.H, n);
    }

    public int i(Object object) {
        return TypeConversionUtility.a(GameRoundProcessor.U.u().Gi, this.H, object);
    }

    public CacheInvalidationStrategy w(Object object) {
        return new CacheInvalidationStrategy(TypeConversionUtility.U(GameRoundProcessor.U.u().Gi, this.H, object));
    }

    public Stream P() {
        return TypeConversionUtility.l(GameRoundProcessor.U.u().Gi, this.M());
    }

    public NetworkConnectionManager1945 p(Object object) {
        return new NetworkConnectionManager1945(TypeConversionUtility.o(GameRoundProcessor.U.u().Gi, this.H, object));
    }

    public GameRoundProcessor(Object object) {
        super(object);
    }
}

