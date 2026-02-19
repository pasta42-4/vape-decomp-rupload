/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.network.security.SecureTransmissionHandler;
import com.session.management.SessionLifecycleManager;
import com.system.config.AdaptiveConfigurationManager;

public class StreamProcessingEngine1677
extends AdaptiveConfigurationManager {
    public SecureTransmissionHandler J() {
        return new SecureTransmissionHandler(StreamProcessingEngine1677.U.u().ky.U(this.H));
    }

    public SessionLifecycleManager s() {
        return new SessionLifecycleManager(StreamProcessingEngine1677.U.u().ky.W(this.H));
    }

    public StreamProcessingEngine1677(Object object) {
        super(object);
    }

    public int I() {
        return StreamProcessingEngine1677.U.u().ky.x(this.H);
    }

    public int h() {
        return StreamProcessingEngine1677.U.u().ky.z(this.H);
    }

    public static StreamProcessingEngine1677 G(double d2, double d3, double d4) {
        return new StreamProcessingEngine1677(StreamProcessingEngine1677.U.u().ky.q(d2, d3, d4));
    }

    public int R() {
        return StreamProcessingEngine1677.U.u().ky.V(this.H);
    }
}

