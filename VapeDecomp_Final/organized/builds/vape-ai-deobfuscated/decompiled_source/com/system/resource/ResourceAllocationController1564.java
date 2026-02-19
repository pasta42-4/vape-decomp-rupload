/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.system.resource;

import a.Qh;
import a.Ya;
import com.data.validation.DataStreamValidator;
import com.event.management.ContextualEventDispatcher;
import com.network.core.NetworkConnectionManager2538;
import com.system.resource.SystemResourceMediator1336;
import org.jetbrains.annotations.Nullable;

class ResourceAllocationController1564
extends SystemResourceMediator1336 {
    @Nullable
    private ContextualEventDispatcher Q = null;
    private final Ya c;

    private ResourceAllocationController1564(NetworkConnectionManager2538 networkConnectionManager2538, Qh qh, Ya ya) {
        super(networkConnectionManager2538, qh, null);
        this.c = ya;
    }

    private ResourceAllocationController1564(NetworkConnectionManager2538 networkConnectionManager2538, Qh qh, Ya ya, ContextualEventDispatcher contextualEventDispatcher) {
        this(networkConnectionManager2538, qh, ya);
        this.C(contextualEventDispatcher);
    }

    public ContextualEventDispatcher D() {
        return this.Q;
    }

    public void C(ContextualEventDispatcher contextualEventDispatcher) {
        this.Q = contextualEventDispatcher;
    }

    ResourceAllocationController1564(NetworkConnectionManager2538 networkConnectionManager2538, Qh qh, Ya ya, ContextualEventDispatcher contextualEventDispatcher, DataStreamValidator dataStreamValidator) {
        this(networkConnectionManager2538, qh, ya, contextualEventDispatcher);
    }

    static Ya h(ResourceAllocationController1564 resourceAllocationController1564) {
        return resourceAllocationController1564.c;
    }

    public Ya J() {
        return this.c;
    }
}

