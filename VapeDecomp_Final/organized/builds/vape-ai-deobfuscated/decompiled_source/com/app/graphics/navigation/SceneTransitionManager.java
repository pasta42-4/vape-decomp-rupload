/*
 * Decompiled with CFR 0.152.
 */
package com.app.graphics.navigation;

import com.security.authentication.AuthenticationTokenManager;
import com.security.crypto.CipherManager;

class SceneTransitionManager
extends CipherManager {
    final AuthenticationTokenManager O4;

    SceneTransitionManager(AuthenticationTokenManager authenticationTokenManager, String string) {
        this.O4 = authenticationTokenManager;
        super(string);
    }

    @Override
    public void O() {
    }

    @Override
    public double z() {
        return 18.0;
    }

    @Override
    public double e() {
        return 110.0;
    }
}

