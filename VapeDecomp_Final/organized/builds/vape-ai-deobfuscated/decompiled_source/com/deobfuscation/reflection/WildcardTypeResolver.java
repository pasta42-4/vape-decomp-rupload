/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.reflection;

import com.exception.system.CustomSystemException;
import com.security.permissions.UserPermissionResolver;

public class WildcardTypeResolver {
    UserPermissionResolver K;
    char z;

    public String toString() {
        try {
            if (this.z == '*') {
                return "?";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WildcardTypeResolver.a(customSystemException);
        }
        String string = this.K.toString();
        try {
            if (this.z == ' ') {
                return string;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WildcardTypeResolver.a(customSystemException);
        }
        try {
            if (this.z == '+') {
                return "? extends " + string;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WildcardTypeResolver.a(customSystemException);
        }
        return "? super " + string;
    }

    public WildcardTypeResolver() {
        this(null, '*');
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    WildcardTypeResolver(UserPermissionResolver userPermissionResolver, char c) {
        this.K = userPermissionResolver;
        this.z = c;
    }
}

