/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.app.security;

import com.exception.system.CustomSystemException;
import com.resource.management.ResourceAllocationTracker127;
import com.user.identity.UserIdentityManager;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.jetbrains.annotations.Nullable;

public class CryptoUtilityService {
    private final Map<Long, ResourceAllocationTracker127> q;
    private final Map<Long, UserIdentityManager> E = new LinkedHashMap<Long, UserIdentityManager>();

    public UserIdentityManager O(long l, Supplier<UserIdentityManager> supplier) {
        UserIdentityManager userIdentityManager = this.w(l);
        try {
            if (userIdentityManager != null) {
                return userIdentityManager;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoUtilityService.a(customSystemException);
        }
        userIdentityManager = supplier.get();
        this.E.put(userIdentityManager.s().r(), userIdentityManager);
        return userIdentityManager;
    }

    public void Q() {
        this.E.clear();
        this.q.clear();
    }

    public Collection<UserIdentityManager> Z() {
        return this.E.values();
    }

    @Nullable
    public UserIdentityManager w(long l) {
        return this.E.get(l);
    }

    public CryptoUtilityService() {
        this.q = new LinkedHashMap<Long, ResourceAllocationTracker127>();
    }

    public ResourceAllocationTracker127 K(UserIdentityManager userIdentityManager, Supplier<ResourceAllocationTracker127> supplier) {
        long l = userIdentityManager.s().r();
        ResourceAllocationTracker127 resourceAllocationTracker127 = this.S(l);
        try {
            if (resourceAllocationTracker127 != null) {
                return resourceAllocationTracker127;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoUtilityService.a(customSystemException);
        }
        resourceAllocationTracker127 = supplier.get();
        this.q.put(l, resourceAllocationTracker127);
        return resourceAllocationTracker127;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Nullable
    public ResourceAllocationTracker127 S(long l) {
        return this.q.get(l);
    }
}

