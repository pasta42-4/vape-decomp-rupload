/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.Nullable
 */
package com.validation.state;

import com.exception.system.CustomSystemException;
import com.security.metadata.TimestampedSecurityDescriptor;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class StateValidator {
    private boolean s;
    private final boolean p;
    private final boolean V;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean T() {
        return this.s;
    }

    public void k(boolean bl) {
        this.s = bl;
    }

    public boolean C() {
        return this.V;
    }

    StateValidator(boolean bl, boolean bl2, boolean bl3) {
        this.p = bl;
        this.s = bl2;
        this.V = bl3;
    }

    static StateValidator T(TimestampedSecurityDescriptor timestampedSecurityDescriptor) {
        return StateValidator.s(timestampedSecurityDescriptor);
    }

    public boolean e() {
        return this.p;
    }

    @Nullable
    @Contract(value="!null -> !null; null -> null")
    private static StateValidator s(@Nullable TimestampedSecurityDescriptor timestampedSecurityDescriptor) {
        try {
            if (timestampedSecurityDescriptor == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StateValidator.a(customSystemException);
        }
        return new StateValidator(timestampedSecurityDescriptor.J(), timestampedSecurityDescriptor.n(), timestampedSecurityDescriptor.s());
    }
}

