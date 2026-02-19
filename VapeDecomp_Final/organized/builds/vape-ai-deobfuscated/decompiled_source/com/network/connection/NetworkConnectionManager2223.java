/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.app.core.interfaces.OperationExecutionInterface;
import com.security.authentication.AuthenticationTokenManager;
import com.system.configuration.ConfigurationProfileManager257;

class NetworkConnectionManager2223
implements OperationExecutionInterface {
    final AuthenticationTokenManager n;
    final ConfigurationProfileManager257 F;

    NetworkConnectionManager2223(AuthenticationTokenManager authenticationTokenManager, ConfigurationProfileManager257 configurationProfileManager257) {
        this.n = authenticationTokenManager;
        this.F = configurationProfileManager257;
    }

    @Override
    public void R() {
        AuthenticationTokenManager.V(this.n).c(this.F.Y());
        AuthenticationTokenManager.Y(this.n);
    }
}

