/*
 * Decompiled with CFR 0.152.
 */
package com.cache.management;

import com.auth.tracking.AuthenticationStateTracker;
import com.core.lifecycle.ObjectLifecycleManager;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.cryptography.EncryptionKeyGenerator;
import java.awt.Color;

class ResourceCacheValidator
extends AdaptiveCipherEngine {
    final EncryptionKeyGenerator F1;
    final ObjectLifecycleManager FN;

    @Override
    public Color l() {
        return ResourceCacheValidator.M.a;
    }

    ResourceCacheValidator(EncryptionKeyGenerator encryptionKeyGenerator, AuthenticationStateTracker authenticationStateTracker, ObjectLifecycleManager objectLifecycleManager) {
        this.F1 = encryptionKeyGenerator;
        this.FN = objectLifecycleManager;
        super(authenticationStateTracker);
    }

    @Override
    public boolean f() {
        return this.FN.C.s();
    }
}

