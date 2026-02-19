/*
 * Decompiled with CFR 0.152.
 */
package com.vape.security;

import a.b3;
import a.fe;
import com.app.routing.RequestRoutingController;

class VapeAuthenticationManager
implements RequestRoutingController {
    final b3 S;
    final fe V;

    VapeAuthenticationManager(b3 b32, fe fe2) {
        this.S = b32;
        this.V = fe2;
    }

    @Override
    public void p(char c, int n) {
        this.V.N(b3.Y(this.S).a());
    }
}

