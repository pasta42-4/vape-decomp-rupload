/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import a.wz;
import com.auth.tracking.AuthenticationStateTracker;
import com.exception.system.CustomSystemException;

class ResourceAllocationController1969
extends AuthenticationStateTracker {
    final wz n;

    @Override
    public Boolean s() {
        try {
            if (wz.e(this.n) == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationController1969.b(customSystemException);
        }
        return wz.e(this.n).h();
    }

    public void j(Boolean bl) {
        super.H(bl);
        wz.e(this.n).f(bl);
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ResourceAllocationController1969(wz wz2, Object object, String string, boolean bl) {
        this.n = wz2;
        super(object, string, bl);
    }
}

