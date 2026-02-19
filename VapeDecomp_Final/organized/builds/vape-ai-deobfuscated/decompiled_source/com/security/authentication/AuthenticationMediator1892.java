/*
 * Decompiled with CFR 0.152.
 */
package com.security.authentication;

import com.exception.system.CustomSystemException;
import com.network.connection.NetworkConnectionDescriptor;
import com.security.cipher.SecureStreamCipher;
import com.system.management.SystemStateController;

class AuthenticationMediator1892
extends SystemStateController {
    final SecureStreamCipher ud;
    final NetworkConnectionDescriptor ul;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    AuthenticationMediator1892(SecureStreamCipher secureStreamCipher, boolean bl, String string, NetworkConnectionDescriptor networkConnectionDescriptor) {
        this.ud = secureStreamCipher;
        this.ul = networkConnectionDescriptor;
        super(bl, string);
    }

    @Override
    public void O() {
        try {
            if (!this.E()) {
                this.y("");
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationMediator1892.a(customSystemException);
        }
        String string = this.a();
        this.ul.J(string, -1);
        this.ul.M();
        this.ud.X();
        this.y("");
    }
}

