/*
 * Decompiled with CFR 0.152.
 */
package com.resource.allocation;

import com.auth.tracking.AuthenticationStateTracker;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.cryptography.EncryptionKeyGenerator;
import java.awt.Color;

class ResourceAllocationTracker2098
extends AdaptiveCipherEngine {
    final EncryptionKeyGenerator w1;

    @Override
    public boolean f() {
        return EncryptionKeyGenerator.L((EncryptionKeyGenerator)this.w1).s.s();
    }

    ResourceAllocationTracker2098(EncryptionKeyGenerator encryptionKeyGenerator, AuthenticationStateTracker authenticationStateTracker) {
        this.w1 = encryptionKeyGenerator;
        super(authenticationStateTracker);
    }

    @Override
    public Color l() {
        return ResourceAllocationTracker2098.M.a;
    }
}

