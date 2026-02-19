/*
 * Decompiled with CFR 0.152.
 */
package com.networking.traffic;

import a.UZ;
import com.network.protocol.ProtocolInteractionController;
import com.network.streaming.DataStreamProcessor1233;
import com.system.lifecycle.ObjectLifecycleTracker;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NetworkTrafficRegulator
extends ObjectLifecycleTracker {
    public NetworkTrafficRegulator(Object object) {
        super(object);
    }

    public static DataStreamProcessor1233 c() {
        return new DataStreamProcessor1233(UZ.l(NetworkTrafficRegulator.U.u().Lr));
    }

    public static ProtocolInteractionController c() {
        return new ProtocolInteractionController(UZ.P(NetworkTrafficRegulator.U.u().Lr));
    }
}

