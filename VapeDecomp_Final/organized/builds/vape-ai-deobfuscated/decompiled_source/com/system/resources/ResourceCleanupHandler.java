/*
 * Decompiled with CFR 0.152.
 */
package com.system.resources;

import com.security.context.CipherContextManager489;
import com.system.lifecycle.ObjectLifecycleTracker;

public class ResourceCleanupHandler
extends ObjectLifecycleTracker {
    public ResourceCleanupHandler(Object object) {
        super(object);
    }

    public static ResourceCleanupHandler Y() {
        return new ResourceCleanupHandler(CipherContextManager489.l(ResourceCleanupHandler.U.u().dn));
    }

    public static ResourceCleanupHandler y() {
        return new ResourceCleanupHandler(CipherContextManager489.q(ResourceCleanupHandler.U.u().dn));
    }
}

