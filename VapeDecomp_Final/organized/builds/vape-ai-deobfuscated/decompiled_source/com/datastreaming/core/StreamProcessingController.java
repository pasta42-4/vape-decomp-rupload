/*
 * Decompiled with CFR 0.152.
 */
package com.datastreaming.core;

import com.auth.tracking.AuthenticationStateTracker;
import com.core.lifecycle.ObjectLifecycleManager;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.cryptography.EncryptionKeyGenerator;
import java.awt.Color;

class StreamProcessingController
extends AdaptiveCipherEngine {
    final ObjectLifecycleManager Sa;
    final EncryptionKeyGenerator SM;

    StreamProcessingController(EncryptionKeyGenerator encryptionKeyGenerator, AuthenticationStateTracker authenticationStateTracker, ObjectLifecycleManager objectLifecycleManager) {
        this.SM = encryptionKeyGenerator;
        this.Sa = objectLifecycleManager;
        super(authenticationStateTracker);
    }

    @Override
    public Color l() {
        return StreamProcessingController.M.a;
    }

    @Override
    public boolean f() {
        return this.Sa.C.s();
    }
}

