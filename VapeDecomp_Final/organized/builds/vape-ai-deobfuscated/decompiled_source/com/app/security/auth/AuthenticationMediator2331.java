/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.auth;

import com.data.encoding.CrossPlatformEncoder;
import com.security.access.ResourceAccessController2350;

class AuthenticationMediator2331
implements ResourceAccessController2350 {
    final CrossPlatformEncoder N;

    AuthenticationMediator2331(CrossPlatformEncoder crossPlatformEncoder) {
        this.N = crossPlatformEncoder;
    }

    @Override
    public void f() {
        this.N.m();
    }
}

