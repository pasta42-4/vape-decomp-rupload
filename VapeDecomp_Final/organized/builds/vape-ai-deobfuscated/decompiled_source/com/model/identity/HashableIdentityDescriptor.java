/*
 * Decompiled with CFR 0.152.
 */
package com.model.identity;

import com.exception.system.CustomSystemException;
import com.network.transmission.DataTransmissionManager2384;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.Objects;

public class HashableIdentityDescriptor {
    private final int O;
    boolean s = false;

    public int t() {
        return this.O;
    }

    public int hashCode() {
        return Objects.hash(this.t());
    }

    public HashableIdentityDescriptor(TransactionOrchestrator1017 transactionOrchestrator1017) {
        if (transactionOrchestrator1017 == null) {
            this.O = 0;
            return;
        }
        if (transactionOrchestrator1017.B(ReflectionMetadataResolver.Pr)) {
            DataTransmissionManager2384 dataTransmissionManager2384 = new DataTransmissionManager2384(transactionOrchestrator1017);
            this.O = dataTransmissionManager2384.B().M().hashCode();
        } else {
            this.O = transactionOrchestrator1017.M().getClass().hashCode();
        }
    }

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
                            if (!(object instanceof HashableIdentityDescriptor)) break block4;
                            if (((HashableIdentityDescriptor)object).t() != this.t()) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw HashableIdentityDescriptor.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw HashableIdentityDescriptor.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }
}

