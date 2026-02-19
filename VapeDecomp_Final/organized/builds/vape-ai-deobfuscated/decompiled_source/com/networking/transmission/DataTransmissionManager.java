/*
 * Decompiled with CFR 0.152.
 */
package com.networking.transmission;

import com.app.transformation.TransformationPipelineFilter;
import com.network.clustering.ClusterNodeRegistry1151;
import com.spatial.geometry.GeometricTransformationCalculator;

public class DataTransmissionManager
implements TransformationPipelineFilter {
    @Override
    public boolean c(long l, long l2) {
        short s2 = GeometricTransformationCalculator.g(l);
        return ClusterNodeRegistry1151.W().Y().G(s2);
    }
}

