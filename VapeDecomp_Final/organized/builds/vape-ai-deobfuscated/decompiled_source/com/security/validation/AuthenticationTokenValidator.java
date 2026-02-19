/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.security.validation;

import com.exception.system.CustomSystemException;
import com.security.metadata.TimestampedSecurityDescriptor;
import com.validation.state.StateValidator;
import java.util.Date;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AuthenticationTokenValidator {
    @Nullable
    private String K;
    private final long l;
    private final Date D;
    private final StateValidator k;
    private final boolean R;

    @Nullable
    @Contract(value="!null -> !null; null -> null")
    public static AuthenticationTokenValidator i(@Nullable TimestampedSecurityDescriptor timestampedSecurityDescriptor) {
        try {
            if (timestampedSecurityDescriptor == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuthenticationTokenValidator.a(customSystemException);
        }
        return new AuthenticationTokenValidator(timestampedSecurityDescriptor.D(), timestampedSecurityDescriptor.V(), timestampedSecurityDescriptor.k(), timestampedSecurityDescriptor.i(), StateValidator.T(timestampedSecurityDescriptor));
    }

    public Date o() {
        return this.D;
    }

    public boolean Z() {
        return this.R;
    }

    public StateValidator e() {
        return this.k;
    }

    public void I(@NotNull String string) {
        this.K = string;
    }

    public long D() {
        return this.l;
    }

    AuthenticationTokenValidator(long l, @Nullable String string, Date date, boolean bl, StateValidator stateValidator) {
        this.l = l;
        this.K = string;
        this.D = date;
        this.R = bl;
        this.k = stateValidator;
    }

    @Nullable
    public String Y() {
        return this.K;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

