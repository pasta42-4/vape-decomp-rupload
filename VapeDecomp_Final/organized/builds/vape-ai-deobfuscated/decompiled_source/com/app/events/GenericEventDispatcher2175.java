/*
 * Decompiled with CFR 0.152.
 */
package com.app.events;

import com.app.context.transformation.ContextTransformationEngine;
import com.indexing.metadata.MetadataIndexingService;
import com.runtime.context.ContextualExecutionFramework;

public abstract class GenericEventDispatcher2175
extends ContextTransformationEngine<MetadataIndexingService> {
    public abstract boolean y();

    public GenericEventDispatcher2175(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }

    public boolean I() {
        return false;
    }
}

