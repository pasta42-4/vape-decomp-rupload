/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import a.Qh;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.resource.ResourceAllocator1647;

public class AuthenticationServiceProvider
extends ObjectLifecycleTracker {
    public ResourceAllocator1647 t() {
        return new ResourceAllocator1647(AuthenticationServiceProvider.U.u().GC.Q(this.M()));
    }

    public ResourceAllocator1647 i(Qh qh) {
        return new ResourceAllocator1647(AuthenticationServiceProvider.U.u().GC.n(this.M(), qh.M()));
    }

    public AuthenticationServiceProvider(Object object) {
        super(object);
    }
}

