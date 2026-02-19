/*
 * Decompiled with CFR 0.152.
 */
package com.app.security;

import a.yy;
import com.app.core.interfaces.OperationExecutionInterface;
import com.exception.system.CustomSystemException;

class PermissionResolver
implements OperationExecutionInterface {
    final yy O;

    PermissionResolver(yy yy2) {
        this.O = yy2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void R() {
        try {
            if (this.O.P().booleanValue()) {
                yy.F(this.O);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PermissionResolver.a(customSystemException);
        }
    }
}

