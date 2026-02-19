/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.config.ProtocolConfigurationManager;
import com.network.connection.ConnectionLifecycleHandler;
import com.security.context.SecurityContextManager2112;

public class AuthenticationTokenGenerator1948
extends ConnectionLifecycleHandler {
    public static AuthenticationTokenGenerator1948 c() {
        try {
            if (GeometryCalculator.C() >= 23) {
                return new AuthenticationTokenGenerator1948(ProtocolConfigurationManager.u(AuthenticationTokenGenerator1948.U.u().gM, SecurityContextManager2112.R().M()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenGenerator1948.a(customSystemException);
        }
        return new AuthenticationTokenGenerator1948(AuthenticationTokenGenerator1948.U.u().gM.M());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AuthenticationTokenGenerator1948(Object object) {
        super(object);
    }
}

