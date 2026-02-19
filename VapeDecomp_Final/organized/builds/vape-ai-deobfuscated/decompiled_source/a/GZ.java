/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.security.permissions.UserPermissionResolver;

public class GZ
extends UserPermissionResolver {
    String M;

    GZ(String string, int n, int n2) {
        this.M = string.substring(n, n2);
    }

    public String toString() {
        return this.M;
    }
}

