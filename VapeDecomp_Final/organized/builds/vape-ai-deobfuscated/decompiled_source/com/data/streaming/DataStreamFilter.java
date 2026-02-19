/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.app.gameengine.GameRoundProcessor;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.security.exchange.SecureDataExchanger;
import com.security.protocol.SecurityProtocolHandler1908;
import com.system.lifecycle.ObjectLifecycleTracker;

public class DataStreamFilter
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String x() {
        if (GeometryCalculator.C() >= 50) {
            GameRoundProcessor gameRoundProcessor = SecurityProtocolHandler1908.R();
            return gameRoundProcessor.p(this.H).y();
        }
        try {
            if (GeometryCalculator.C() >= 35) {
                return SecureDataExchanger.C(DataStreamFilter.U.u().Gv, this.H);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamFilter.a(customSystemException);
        }
        return SecureDataExchanger.m(DataStreamFilter.U.u().Gv, this.H);
    }

    public DataStreamFilter(Object object) {
        super(object);
    }
}

