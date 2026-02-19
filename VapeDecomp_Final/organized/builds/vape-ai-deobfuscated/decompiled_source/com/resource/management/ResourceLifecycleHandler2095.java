/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.auth.tracking.AuthenticationStateTracker;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.cryptography.EncryptionKeyGenerator;
import java.awt.Color;

class ResourceLifecycleHandler2095
extends AdaptiveCipherEngine {
    final EncryptionKeyGenerator bb;

    @Override
    public Color l() {
        return ResourceLifecycleHandler2095.M.a;
    }

    @Override
    public boolean f() {
        return EncryptionKeyGenerator.L((EncryptionKeyGenerator)this.bb).s.s();
    }

    ResourceLifecycleHandler2095(EncryptionKeyGenerator encryptionKeyGenerator, AuthenticationStateTracker authenticationStateTracker) {
        this.bb = encryptionKeyGenerator;
        super(authenticationStateTracker);
    }
}

