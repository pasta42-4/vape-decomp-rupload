/*
 * Decompiled with CFR 0.152.
 */
package com.resource.lifecycle;

import com.auth.tracking.AuthenticationStateTracker;
import com.core.lifecycle.ObjectLifecycleManager;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.cryptography.EncryptionKeyGenerator;
import java.awt.Color;

class ResourceLifecycleManager1951
extends AdaptiveCipherEngine {
    final EncryptionKeyGenerator QH;
    final ObjectLifecycleManager QS;

    @Override
    public Color l() {
        return ResourceLifecycleManager1951.M.a;
    }

    @Override
    public boolean f() {
        return this.QS.C.s();
    }

    ResourceLifecycleManager1951(EncryptionKeyGenerator encryptionKeyGenerator, AuthenticationStateTracker authenticationStateTracker, ObjectLifecycleManager objectLifecycleManager) {
        this.QH = encryptionKeyGenerator;
        this.QS = objectLifecycleManager;
        super(authenticationStateTracker);
    }
}

