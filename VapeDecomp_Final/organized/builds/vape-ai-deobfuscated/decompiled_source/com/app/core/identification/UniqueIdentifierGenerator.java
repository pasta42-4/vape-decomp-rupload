/*
 * Decompiled with CFR 0.152.
 */
package com.app.core.identification;

import com.exception.system.CustomSystemException;

class UniqueIdentifierGenerator {
    double M;
    double w;
    double i;
    double R;

    public int hashCode() {
        long l = Double.doubleToLongBits(this.M);
        long l2 = Double.doubleToLongBits(this.i);
        long l3 = Double.doubleToLongBits(this.w);
        return (int)(l ^ l >>> 32 ^ (l2 ^ l2 >>> 32) ^ (l3 ^ l3 >>> 32));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean equals(Object object) {
        boolean bl;
        block13: {
            block12: {
                try {
                    if (this == object) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw UniqueIdentifierGenerator.a(customSystemException);
                }
                try {
                    if (!(object instanceof UniqueIdentifierGenerator)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw UniqueIdentifierGenerator.a(customSystemException);
                }
                UniqueIdentifierGenerator uniqueIdentifierGenerator = (UniqueIdentifierGenerator)object;
                try {
                    try {
                        try {
                            if (Double.compare(this.M, uniqueIdentifierGenerator.M) != 0 || Double.compare(this.i, uniqueIdentifierGenerator.i) != 0) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw UniqueIdentifierGenerator.a(customSystemException);
                        }
                        if (Double.compare(this.w, uniqueIdentifierGenerator.w) != 0) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw UniqueIdentifierGenerator.a(customSystemException);
                    }
                    bl = true;
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw UniqueIdentifierGenerator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    UniqueIdentifierGenerator(double d2, double d3, double d4, double d5) {
        this.M = d2;
        this.i = d3;
        this.w = d4;
        this.R = d5;
    }
}

