/*
 * Decompiled with CFR 0.152.
 */
package com.data.repository;

import com.app.reflection.GenericTypeInspector;
import com.distributed.resources.DistributedResourceCoordinator;
import com.exception.system.CustomSystemException;
import com.transaction.adapter.TransactionalInterfaceAdapter;

class GenericRepositoryManager2099
extends GenericTypeInspector<DistributedResourceCoordinator> {
    final TransactionalInterfaceAdapter y;

    public boolean q(DistributedResourceCoordinator distributedResourceCoordinator) {
        try {
            if (distributedResourceCoordinator.g()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GenericRepositoryManager2099.a(customSystemException);
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    GenericRepositoryManager2099(TransactionalInterfaceAdapter transactionalInterfaceAdapter, Class clazz) {
        this.y = transactionalInterfaceAdapter;
        super(clazz);
    }
}

