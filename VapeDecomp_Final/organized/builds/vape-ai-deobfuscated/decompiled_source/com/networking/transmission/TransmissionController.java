/*
 * Decompiled with CFR 0.152.
 */
package com.networking.transmission;

import com.app.transformation.TransformationPipelineFilter;
import com.network.clustering.ClusterNodeRegistry1151;
import com.spatial.geometry.GeometricTransformationCalculator;

public class TransmissionController
implements TransformationPipelineFilter {
    @Override
    public boolean c(long l, long l2) {
        short s2 = GeometricTransformationCalculator.r(l2);
        short s3 = GeometricTransformationCalculator.g(l2);
        return ClusterNodeRegistry1151.W().Y().S(s2, s3);
    }
}

