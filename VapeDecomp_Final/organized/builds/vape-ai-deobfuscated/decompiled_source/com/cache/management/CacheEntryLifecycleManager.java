/*
 * Decompiled with CFR 0.152.
 */
package com.cache.management;

import a.Oa;
import com.resource.binding.ResourceBinder;
import com.system.error.ErrorResilienceProtocol;

public class CacheEntryLifecycleManager
extends Oa<CacheEntryLifecycleManager> {
    private ErrorResilienceProtocol u;
    private int V;

    public CacheEntryLifecycleManager K(int n) {
        this.V = n;
        return this;
    }

    public ResourceBinder K() {
        return new ResourceBinder(this);
    }

    public ErrorResilienceProtocol E() {
        return this.u;
    }

    public CacheEntryLifecycleManager b(ErrorResilienceProtocol errorResilienceProtocol) {
        this.u = errorResilienceProtocol;
        return this;
    }

    public int h() {
        return this.V;
    }
}

