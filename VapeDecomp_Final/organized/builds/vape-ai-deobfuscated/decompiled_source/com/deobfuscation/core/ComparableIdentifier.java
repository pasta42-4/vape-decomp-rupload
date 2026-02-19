/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.core;

import com.exception.system.CustomSystemException;
import java.util.Objects;

public class ComparableIdentifier {
    private int X;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    try {
                        try {
                            if (!(object instanceof ComparableIdentifier)) break block4;
                            if (((ComparableIdentifier)object).H() != this.H()) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ComparableIdentifier.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ComparableIdentifier.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public ComparableIdentifier(int n) {
        this.X = n;
    }

    public int hashCode() {
        return Objects.hash(this.H());
    }

    public int H() {
        return this.X;
    }
}

