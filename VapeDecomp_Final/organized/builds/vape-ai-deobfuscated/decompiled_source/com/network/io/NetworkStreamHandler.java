/*
 * Decompiled with CFR 0.152.
 */
package com.network.io;

import com.security.encryption.CryptographicSecurityManager547;
import com.system.lifecycle.ObjectLifecycleTracker;

public class NetworkStreamHandler
extends ObjectLifecycleTracker {
    public float B(boolean bl) {
        return CryptographicSecurityManager547.r(NetworkStreamHandler.U.u().LD, this.H, bl);
    }

    public float z() {
        return CryptographicSecurityManager547.F(NetworkStreamHandler.U.u().LD, this.H);
    }

    public NetworkStreamHandler(Object object) {
        super(object);
    }
}

