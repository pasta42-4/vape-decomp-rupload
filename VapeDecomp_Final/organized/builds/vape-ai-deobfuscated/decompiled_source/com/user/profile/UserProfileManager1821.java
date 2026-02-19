/*
 * Decompiled with CFR 0.152.
 */
package com.user.profile;

import a.Ry;
import com.app.events.EventNotificationBroker2314;
import com.concurrency.tracking.ConcurrentRequestTracker;

public class UserProfileManager1821
implements EventNotificationBroker2314 {
    private static final ConcurrentRequestTracker g = new ConcurrentRequestTracker();
    private final Ry u;

    public Ry getProfile() {
        return this.u;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return g;
    }

    public UserProfileManager1821(Ry ry) {
        this.u = ry;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return g;
    }
}

