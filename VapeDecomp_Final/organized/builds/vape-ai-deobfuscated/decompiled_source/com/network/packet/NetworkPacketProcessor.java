/*
 * Decompiled with CFR 0.152.
 */
package com.network.packet;

import com.security.authentication.AuthenticationTokenManager;
import com.security.crypto.CipherManager;
import com.ui.rendering.GraphicalRenderingController;

class NetworkPacketProcessor
extends CipherManager {
    final AuthenticationTokenManager g_;

    @Override
    public double e() {
        return 110.0;
    }

    @Override
    public void O() {
        GraphicalRenderingController.d = AuthenticationTokenManager.h(this.g_);
    }

    NetworkPacketProcessor(AuthenticationTokenManager authenticationTokenManager, String string) {
        this.g_ = authenticationTokenManager;
        super(string);
    }

    @Override
    public double z() {
        return 18.0;
    }
}

