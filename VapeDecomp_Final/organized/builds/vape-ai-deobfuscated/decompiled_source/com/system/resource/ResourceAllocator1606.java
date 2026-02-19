/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.app.resources.ResourceLifecycleManager1543;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptoKeyGenerator;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.ArrayList;
import java.util.List;

public class ResourceAllocator1606
extends ObjectLifecycleTracker {
    public List<ResourceLifecycleManager1543> D() {
        List list = ResourceAllocator1606.U.u().v.v(this.H);
        ArrayList<ResourceLifecycleManager1543> arrayList = new ArrayList<ResourceLifecycleManager1543>();
        for (Object e : list) {
            arrayList.add(new ResourceLifecycleManager1543(e));
        }
        return arrayList;
    }

    public ResourceLifecycleManager1543 T(int n) {
        return new ResourceLifecycleManager1543(CryptoKeyGenerator.T(ResourceAllocator1606.U.u().v, this.H, n));
    }

    public int D() {
        return ResourceAllocator1606.U.u().v.Z(this.H);
    }

    public ResourceAllocator1606(Object object) {
        super(object);
    }

    public LightweightExecutionContext Q() {
        return new LightweightExecutionContext(CryptoKeyGenerator.F(ResourceAllocator1606.U.u().v, this.H));
    }
}

