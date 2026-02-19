/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.app.transaction.sync.TransactionSynchronizationManager;
import com.system.resource.ResourceAllocator1647;

public class ResourceAllocator1807
extends TransactionSynchronizationManager {
    public ResourceAllocator1807(Object object) {
        super(object);
    }

    public int m() {
        return ResourceAllocator1807.U.u().gC.A(this.H);
    }

    public void W(int n) {
        ResourceAllocator1807.U.u().gC.v(this.H, n);
    }

    public ResourceAllocator1647 E() {
        return new ResourceAllocator1647(ResourceAllocator1807.U.u().gC.Y(this.H));
    }

    public void a(ResourceAllocator1647 resourceAllocator1647) {
        ResourceAllocator1807.U.u().gC.t(this.H, resourceAllocator1647.M());
    }
}

