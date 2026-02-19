/*
 * Decompiled with CFR 0.152.
 */
package com.app.network;

import com.app.gameengine.GameRoundProcessor;
import com.caching.strategy.CacheInvalidationStrategy;
import com.data.conversion.TypeConversionOrchestrator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.authentication.AuthenticationStateManager675;
import com.security.protocol.SecurityProtocolHandler1908;
import com.system.lifecycle.ObjectLifecycleTracker;

public class CommunicationProtocolManager1453
extends ObjectLifecycleTracker {
    public boolean a() {
        Object object = this.H;
        if (this.B(ReflectionMetadataResolver.rM)) {
            object = new CacheInvalidationStrategy(this.H).b();
        }
        return TypeConversionOrchestrator.I(CommunicationProtocolManager1453.U.u().kJ, object);
    }

    public static int s(CommunicationProtocolManager1453 communicationProtocolManager1453) {
        if (GeometryCalculator.C() >= 50) {
            GameRoundProcessor gameRoundProcessor = SecurityProtocolHandler1908.g();
            CommunicationProtocolManager1453 communicationProtocolManager14532 = communicationProtocolManager1453;
            if (communicationProtocolManager1453.B(ReflectionMetadataResolver.rM)) {
                communicationProtocolManager14532 = new CommunicationProtocolManager1453(new CacheInvalidationStrategy(communicationProtocolManager1453.M()).b());
            }
            return gameRoundProcessor.i(communicationProtocolManager14532.M());
        }
        return TypeConversionOrchestrator.L(CommunicationProtocolManager1453.U.u().kJ, communicationProtocolManager1453.M());
    }

    public CommunicationProtocolManager1453(Object object) {
        super(object);
    }

    public static CommunicationProtocolManager1453 J(int n) {
        if (GeometryCalculator.C() >= 50) {
            GameRoundProcessor gameRoundProcessor = SecurityProtocolHandler1908.g();
            return new CommunicationProtocolManager1453(gameRoundProcessor.e(n));
        }
        return new CommunicationProtocolManager1453(CommunicationProtocolManager1453.U.u().kJ.Q(n));
    }

    public static CommunicationProtocolManager1453 R() {
        return CommunicationProtocolManager1453.J(9);
    }

    public String j() {
        Object object = this.H;
        if (this.B(ReflectionMetadataResolver.rM)) {
            object = new CacheInvalidationStrategy(this.H).b();
        }
        AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(TypeConversionOrchestrator.v(CommunicationProtocolManager1453.U.u().kJ, object));
        return authenticationStateManager675.i();
    }
}

