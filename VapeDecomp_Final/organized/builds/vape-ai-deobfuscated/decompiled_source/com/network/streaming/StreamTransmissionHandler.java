/*
 * Decompiled with CFR 0.152.
 */
package com.network.streaming;

import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.cipher.CipherTransformationHandler599;
import com.system.lifecycle.ObjectLifecycleTracker;

public class StreamTransmissionHandler
extends ObjectLifecycleTracker {
    public boolean d() {
        block4: {
            try {
                try {
                    if (GeometryCalculator.C() < 35 || ReflectionMetadataResolver.rP.isInstance(this.M())) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamTransmissionHandler.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw StreamTransmissionHandler.a(customSystemException);
            }
        }
        return CipherTransformationHandler599.H(StreamTransmissionHandler.U.u().k5, this.H);
    }

    public StreamTransmissionHandler(Object object) {
        super(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

