/*
 * Decompiled with CFR 0.152.
 */
package com.app.context;

import com.app.config.ConfigurationManager2677;
import com.exception.system.CustomSystemException;

final class ContextResolver {
    ConfigurationManager2677 L;
    int R;
    int x;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ContextResolver(int n) {
        this.R = n;
        this.x = 0;
        this.L = null;
    }

    void k(int n, int n2) {
        try {
            if (this.R < n) {
                this.R = n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextResolver.a(customSystemException);
        }
        try {
            if (this.x < n2) {
                this.x = n2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextResolver.a(customSystemException);
        }
    }
}

