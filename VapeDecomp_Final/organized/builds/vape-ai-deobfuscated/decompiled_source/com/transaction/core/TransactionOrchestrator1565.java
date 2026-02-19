/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.core;

import com.data.transformation.DataTransformationPipeline2502;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.transmission.TransmissionStateManager;
import com.reflection.metadata.ReflectionMetadataResolver;

public class TransactionOrchestrator1565
extends TransmissionStateManager {
    public int U() {
        block10: {
            block11: {
                try {
                    try {
                        if (GeometryCalculator.C() < 35) break block10;
                        if (!this.B(ReflectionMetadataResolver.Vo)) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw TransactionOrchestrator1565.a(customSystemException);
                    }
                    return 1;
                }
                catch (CustomSystemException customSystemException) {
                    throw TransactionOrchestrator1565.a(customSystemException);
                }
            }
            return 0;
        }
        if (GeometryCalculator.C() >= 23) {
            int n;
            DataTransformationPipeline2502 dataTransformationPipeline2502 = new DataTransformationPipeline2502(TransactionOrchestrator1565.U.u().N.l(this.M()));
            try {
                if (dataTransformationPipeline2502.Y()) {
                    return 0;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionOrchestrator1565.a(customSystemException);
            }
            try {
                n = TransactionOrchestrator1565.U.u().N.l(this.M()).equals(DataTransformationPipeline2502.l().M()) ? 0 : 1;
            }
            catch (CustomSystemException customSystemException) {
                throw TransactionOrchestrator1565.a(customSystemException);
            }
            return n;
        }
        return TransactionOrchestrator1565.U.u().N.H(this.M());
    }

    public float H() {
        return TransactionOrchestrator1565.U.u().N.J(this.M());
    }

    public float D() {
        try {
            if (GeometryCalculator.C() >= 37) {
                return TransactionOrchestrator1565.U.u().N.e(this.M(), 0.0f);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionOrchestrator1565.a(customSystemException);
        }
        return TransactionOrchestrator1565.U.u().N.S(this.M());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public TransactionOrchestrator1565(Object object) {
        super(object);
    }
}

