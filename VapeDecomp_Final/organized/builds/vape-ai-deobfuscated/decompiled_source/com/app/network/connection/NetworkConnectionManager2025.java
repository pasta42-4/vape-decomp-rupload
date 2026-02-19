/*
 * Decompiled with CFR 0.152.
 */
package com.app.network.connection;

import com.app.security.AuthenticationService;
import com.exception.system.CustomSystemException;
import com.security.permissions.UserPermissionResolver;

public class NetworkConnectionManager2025
extends UserPermissionResolver {
    AuthenticationService Z;
    int e;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.Z.toString());
        try {
            for (int i = 0; i < this.e; ++i) {
                stringBuilder.append("[]");
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager2025.a(customSystemException);
        }
        return stringBuilder.toString();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public NetworkConnectionManager2025(int n, AuthenticationService authenticationService) {
        this.e = n;
        this.Z = authenticationService;
    }
}

