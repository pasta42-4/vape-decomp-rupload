/*
 * Decompiled with CFR 0.152.
 */
package com.tracking.entities;

import com.app.security.auth.AuthenticationProvider2704;
import com.exception.system.CustomSystemException;
import com.util.comparison.ComparisonUtility;

class TimestampedEntityTracker {
    private final ComparisonUtility L;
    private final long l;

    public ComparisonUtility f() {
        return this.L;
    }

    private TimestampedEntityTracker(ComparisonUtility comparisonUtility) {
        this.L = comparisonUtility;
        this.l = System.currentTimeMillis();
    }

    TimestampedEntityTracker(ComparisonUtility comparisonUtility, AuthenticationProvider2704 authenticationProvider2704) {
        this(comparisonUtility);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean o(long l) {
        boolean bl;
        long l2 = System.currentTimeMillis();
        try {
            bl = l2 - this.l > l;
        }
        catch (CustomSystemException customSystemException) {
            throw TimestampedEntityTracker.a(customSystemException);
        }
        return bl;
    }
}

