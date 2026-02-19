/*
 * Decompiled with CFR 0.152.
 */
package com.collection.management;

import com.app.reflection.GenericTypeInspector;
import com.core.computation.AbstractComputationKernel;

class GenericContainerManager
extends GenericTypeInspector<AbstractComputationKernel> {
    final Class T;

    @Override
    public boolean f(AbstractComputationKernel abstractComputationKernel) {
        return this.T.isInstance(abstractComputationKernel);
    }

    GenericContainerManager(Class clazz, Class clazz2) {
        this.T = clazz2;
        super(clazz);
    }
}

