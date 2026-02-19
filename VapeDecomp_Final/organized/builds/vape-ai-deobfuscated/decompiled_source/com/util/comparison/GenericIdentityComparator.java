/*
 * Decompiled with CFR 0.152.
 */
package com.util.comparison;

import com.exception.system.CustomSystemException;
import java.util.Objects;

class GenericIdentityComparator {
    int f;
    String S;

    public int hashCode() {
        return Objects.hash(this.Q(), this.S());
    }

    public boolean equals(Object object) {
        block6: {
            boolean bl;
            block8: {
                block7: {
                    try {
                        try {
                            try {
                                if (!(object instanceof GenericIdentityComparator)) break block6;
                                if (!((GenericIdentityComparator)object).Q().equals(this.Q())) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GenericIdentityComparator.a(customSystemException);
                            }
                            if (((GenericIdentityComparator)object).S() != this.S()) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GenericIdentityComparator.a(customSystemException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericIdentityComparator.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String Q() {
        return this.S;
    }

    public GenericIdentityComparator(String string, int n) {
        this.S = string;
        this.f = n;
    }

    public int S() {
        return this.f;
    }
}

