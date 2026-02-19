/*
 * Decompiled with CFR 0.152.
 */
package com.resource.binding;

import com.app.network.protocol.NetworkProtocolHandler1163;
import com.cache.management.CacheEntryLifecycleManager;
import com.exception.system.CustomSystemException;
import com.resource.management.CloneableResourceDescriptor;
import com.runtime.context.LightweightExecutionContext;
import com.system.error.ErrorResilienceProtocol;

public class ResourceBinder
extends NetworkProtocolHandler1163 {
    private final ErrorResilienceProtocol r;
    private final int u;

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ResourceBinder(CacheEntryLifecycleManager cacheEntryLifecycleManager) {
        super(cacheEntryLifecycleManager);
        this.u = cacheEntryLifecycleManager.h();
        this.r = cacheEntryLifecycleManager.E();
    }

    @Override
    public boolean z(CloneableResourceDescriptor cloneableResourceDescriptor) {
        LightweightExecutionContext lightweightExecutionContext = cloneableResourceDescriptor.W();
        try {
            if (lightweightExecutionContext == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceBinder.b(customSystemException);
        }
        return this.r.W(lightweightExecutionContext.D(), this.u);
    }
}

