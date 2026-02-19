/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.app.routing.RequestRoutingController;
import com.network.protocol.NetworkProtocolInterceptor;
import com.security.authentication.AuthenticationTokenManager904;

class SecurityTokenGenerator2256
implements RequestRoutingController {
    final AuthenticationTokenManager904 G;
    final NetworkProtocolInterceptor P;

    SecurityTokenGenerator2256(AuthenticationTokenManager904 authenticationTokenManager904, NetworkProtocolInterceptor networkProtocolInterceptor) {
        this.G = authenticationTokenManager904;
        this.P = networkProtocolInterceptor;
    }

    @Override
    public void p(char c, int n) {
        this.P.j(AuthenticationTokenManager904.p(this.G).a());
    }
}

