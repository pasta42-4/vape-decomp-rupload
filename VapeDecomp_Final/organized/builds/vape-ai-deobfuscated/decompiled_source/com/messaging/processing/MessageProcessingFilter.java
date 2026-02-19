/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.processing;

import com.data.transformation.DataTransformationEngine679;
import com.exception.system.CustomSystemException;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;

public class MessageProcessingFilter
extends ObjectLifecycleTracker {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public MessageProcessingFilter(Object object) {
        super(object);
    }

    public static float v() {
        try {
            if (!TemporalMetadataResolver.J) {
                return 1.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MessageProcessingFilter.a(customSystemException);
        }
        return DataTransformationEngine679.p(MessageProcessingFilter.U.u().gf);
    }
}

