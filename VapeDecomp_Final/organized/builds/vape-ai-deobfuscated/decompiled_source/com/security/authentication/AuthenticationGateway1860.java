/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.exception.system.CustomSystemException;
import com.network.connection.NetworkConnectionEstablisher;

public class AuthenticationGateway1860
extends NetworkConnectionEstablisher {
    private boolean B;

    public AuthenticationGateway1860(String string, double d2) {
        super(string);
    }

    public void F(boolean bl, AuthenticationGateway1860 authenticationGateway1860) {
        this.B = bl;
        this.r().U(authenticationGateway1860);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AuthenticationGateway1860(String string) {
        this(string, 1.0);
    }

    public boolean o() {
        try {
            if (this.r() == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationGateway1860.a(customSystemException);
        }
        return ((NetworkConnectionEstablisher)this.r().J()).equals(this);
    }

    @Override
    public boolean p() {
        return this.B;
    }
}

