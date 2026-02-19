/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import com.network.connection.ConnectionLifecycleHandler;
import com.system.config.SystemConfigurationManager;

public class AuthenticationTokenGenerator1968
extends ConnectionLifecycleHandler {
    public int h() {
        return AuthenticationTokenGenerator1968.U.u().gj.F(this.H);
    }

    public AuthenticationTokenGenerator1968(Object object) {
        super(object);
    }

    public SystemConfigurationManager R() {
        return new SystemConfigurationManager(AuthenticationTokenGenerator1968.U.u().gj.Y(this.H));
    }
}

