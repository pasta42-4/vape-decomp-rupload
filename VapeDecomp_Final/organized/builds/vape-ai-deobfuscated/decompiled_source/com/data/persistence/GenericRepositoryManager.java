/*
 * Decompiled with CFR 0.152.
 */
package com.data.persistence;

import com.app.reflection.GenericTypeInspector;
import com.core.computation.AbstractComputationKernel;
import com.security.transaction.TransactionalCipherManager;
import com.transaction.adapter.TransactionalInterfaceAdapter;
import java.util.ArrayList;
import java.util.Arrays;

class GenericRepositoryManager
extends GenericTypeInspector<TransactionalCipherManager> {
    final TransactionalInterfaceAdapter d;

    public boolean R(TransactionalCipherManager transactionalCipherManager) {
        return true;
    }

    @Override
    public ArrayList<AbstractComputationKernel> h(AbstractComputationKernel abstractComputationKernel) {
        if (this.g().isInstance(abstractComputationKernel)) {
            TransactionalCipherManager transactionalCipherManager = (TransactionalCipherManager)abstractComputationKernel;
            return new ArrayList<AbstractComputationKernel>(Arrays.asList(transactionalCipherManager.B()));
        }
        return null;
    }

    GenericRepositoryManager(TransactionalInterfaceAdapter transactionalInterfaceAdapter, Class clazz) {
        this.d = transactionalInterfaceAdapter;
        super(clazz);
    }
}

