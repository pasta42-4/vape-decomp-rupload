/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.encoding.protocol.EncodingProtocolManager;
import com.security.crypto.CryptographicKeyManager2528;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.Set;

public class ResourceAllocationManager1749
extends ObjectLifecycleTracker {
    public Set T() {
        return (Set)EncodingProtocolManager.G(ResourceAllocationManager1749.U.u().kp, this.H);
    }

    public boolean c(CryptographicKeyManager2528 cryptographicKeyManager2528) {
        return ResourceAllocationManager1749.U.u().kp.V(this.M(), cryptographicKeyManager2528.M());
    }

    public ResourceAllocationManager1749(Object object) {
        super(object);
    }

    public Object r(CryptographicKeyManager2528 cryptographicKeyManager2528) {
        return ResourceAllocationManager1749.U.u().kp.t(this.H, cryptographicKeyManager2528.M());
    }
}

