/*
 * Decompiled with CFR 0.152.
 */
package com.app.scheduling.execution;

import a.TL;
import com.app.correlation.management.UuidCorrelationManager;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.reflection.utils.ReflectionUtilityManager680;

public class TimedExecutionManager
extends UuidCorrelationManager<TL> {
    private long v;
    private boolean A;

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.Z(this.v);
        networkProtocolEncoder1013.W(this.A);
    }

    public long E() {
        return this.v;
    }

    public boolean f() {
        return this.A;
    }

    public TimedExecutionManager() {
    }

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.v = networkProtocolEncoder1013.S();
        this.A = networkProtocolEncoder1013.B();
    }

    public TimedExecutionManager(ReflectionUtilityManager680 reflectionUtilityManager680, boolean bl) {
        this.v = reflectionUtilityManager680.r();
        this.A = bl;
    }
}

