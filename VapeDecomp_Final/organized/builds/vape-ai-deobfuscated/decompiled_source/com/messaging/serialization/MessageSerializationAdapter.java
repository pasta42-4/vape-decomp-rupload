/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.serialization;

import com.core.computation.AbstractComputationKernel;
import com.data.protocol.DataProcessingProtocol;
import com.reflection.metadata.ClassMetadataExtractor1328;
import com.security.configuration.SecurityEnumRegistry;
import com.security.session.CipherSessionManager;
import com.ui.rendering.GraphicalRenderingController;
import java.awt.Point;

class MessageSerializationAdapter
implements DataProcessingProtocol {
    final ClassMetadataExtractor1328 b;
    final Class W;

    @Override
    public void B(Point point, SecurityEnumRegistry securityEnumRegistry) {
        Object t = GraphicalRenderingController.D(this.W);
        GraphicalRenderingController.W(this.W);
        ((CipherSessionManager)GraphicalRenderingController.D(this.W)).s(((AbstractComputationKernel)t).f());
    }

    MessageSerializationAdapter(ClassMetadataExtractor1328 classMetadataExtractor1328, Class clazz) {
        this.b = classMetadataExtractor1328;
        this.W = clazz;
    }
}

