/*
 * Decompiled with CFR 0.152.
 */
package com.data.structures;

import com.computation.numeric.NumericComputationEngine534;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.temporal.metadata.TemporalMetadataResolver;
import java.math.BigDecimal;
import java.util.LinkedHashMap;

public class RecursiveSelfReferencingEntity {
    public static RecursiveSelfReferencingEntity L = new RecursiveSelfReferencingEntity();
    LinkedHashMap<String, Double> W = new LinkedHashMap();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public double v(NumericComputationEngine534 numericComputationEngine534) {
        try {
            if (this.W.containsKey(numericComputationEngine534.toString())) {
                return this.W.get(numericComputationEngine534.toString());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RecursiveSelfReferencingEntity.a(customSystemException);
        }
        double d2 = numericComputationEngine534.v();
        while (true) {
            CryptographicParameterGenerator cryptographicParameterGenerator;
            block11: {
                CryptographicParameterGenerator cryptographicParameterGenerator2;
                block10: {
                    try {
                        try {
                            try {
                                if (!(d2 >= numericComputationEngine534.w()) || !(d2 <= numericComputationEngine534.v())) break;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RecursiveSelfReferencingEntity.a(customSystemException);
                            }
                            if (!numericComputationEngine534.A()) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RecursiveSelfReferencingEntity.a(customSystemException);
                        }
                        cryptographicParameterGenerator2 = TemporalMetadataResolver.h.W().u(d2, false);
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RecursiveSelfReferencingEntity.a(customSystemException);
                    }
                }
                cryptographicParameterGenerator2 = cryptographicParameterGenerator = TemporalMetadataResolver.h.W().k(d2, false);
            }
            if (!(cryptographicParameterGenerator.D(numericComputationEngine534.t()) > numericComputationEngine534.x())) break;
            d2 = new BigDecimal(d2).subtract(BigDecimal.valueOf(numericComputationEngine534.c())).setScale(1, 4).doubleValue();
        }
        this.W.put(numericComputationEngine534.toString(), d2);
        return d2;
    }
}

