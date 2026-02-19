/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.collaboration.management.CollaborativeResourceCoordinator;
import com.computation.adaptive.AdaptiveComputationEngine668;
import com.exception.system.CustomSystemException;
import com.processing.transformation.TransformationCoordinator;

class DataStreamProcessor1824
extends AdaptiveComputationEngine668 {
    final CollaborativeResourceCoordinator Na;

    DataStreamProcessor1824(CollaborativeResourceCoordinator collaborativeResourceCoordinator, String string, boolean bl, boolean bl2) {
        this.Na = collaborativeResourceCoordinator;
        super(string, bl, bl2);
    }

    @Override
    public void y(String string) {
        super.y(string);
        for (TransformationCoordinator transformationCoordinator : CollaborativeResourceCoordinator.C(this.Na)) {
            try {
                if (transformationCoordinator.G().O().toLowerCase().contains(CollaborativeResourceCoordinator.E(this.Na).a().toLowerCase())) {
                    transformationCoordinator.N(true);
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamProcessor1824.a(customSystemException);
            }
            transformationCoordinator.N(false);
        }
        try {
            if (CollaborativeResourceCoordinator.E(this.Na).a().isEmpty()) {
                CollaborativeResourceCoordinator.R(this.Na);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamProcessor1824.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

