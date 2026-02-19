/*
 * Decompiled with CFR 0.152.
 */
package com.app.data.repository;

import com.app.reflection.GenericTypeInspector;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;
import com.transaction.adapter.TransactionalInterfaceAdapter;

class GenericRepositoryManager2042
extends GenericTypeInspector<DistributedResourceCoordinator> {
    final TransactionalInterfaceAdapter n;

    public boolean Y(DistributedResourceCoordinator distributedResourceCoordinator) {
        try {
            if (distributedResourceCoordinator.g()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericRepositoryManager2042.a(customSystemException);
        }
        return false;
    }

    GenericRepositoryManager2042(TransactionalInterfaceAdapter transactionalInterfaceAdapter, Class clazz) {
        this.n = transactionalInterfaceAdapter;
        super(clazz);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

