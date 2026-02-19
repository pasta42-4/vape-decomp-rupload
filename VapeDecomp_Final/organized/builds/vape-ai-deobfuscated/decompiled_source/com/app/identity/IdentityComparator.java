/*
 * Decompiled with CFR 0.152.
 */
package com.app.identity;

import com.data.compression.CompressionUtility;
import com.exception.system.CustomSystemException;
import com.system.config.AdaptiveConfigurationManager;
import java.util.Objects;

public class IdentityComparator
extends CompressionUtility {
    private int j;

    public IdentityComparator(double d2, double d3, double d4, int n) {
        super(d2, d3, d4);
        this.j = n;
    }

    public AdaptiveConfigurationManager c() {
        AdaptiveConfigurationManager adaptiveConfigurationManager;
        try {
            adaptiveConfigurationManager = this.j == -1 ? null : AdaptiveConfigurationManager.d(this.j);
        }
        catch (CustomSystemException customSystemException) {
            throw IdentityComparator.a(customSystemException);
        }
        return adaptiveConfigurationManager;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl;
        block12: {
            try {
                if (this == object) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw IdentityComparator.a(customSystemException);
            }
            try {
                try {
                    if (object != null && this.getClass() == object.getClass()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw IdentityComparator.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw IdentityComparator.a(customSystemException);
            }
        }
        try {
            if (!super.equals(object)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw IdentityComparator.a(customSystemException);
        }
        IdentityComparator identityComparator = (IdentityComparator)object;
        try {
            bl = this.j == identityComparator.j;
        }
        catch (CustomSystemException customSystemException) {
            throw IdentityComparator.a(customSystemException);
        }
        return bl;
    }

    public IdentityComparator(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.j = n4;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.j);
    }

    public int F() {
        return this.j;
    }

    public IdentityComparator(CompressionUtility compressionUtility, int n) {
        this(compressionUtility.z(), compressionUtility.h(), compressionUtility.A(), n);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

