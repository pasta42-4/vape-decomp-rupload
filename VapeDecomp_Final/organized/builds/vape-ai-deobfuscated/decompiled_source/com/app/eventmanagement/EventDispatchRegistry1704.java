/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.app.eventmanagement;

import com.app.events.EventNotificationBroker2314;
import com.concurrency.tracking.ConcurrentRequestTracker;
import java.util.Collection;
import org.jetbrains.annotations.UnmodifiableView;

public class EventDispatchRegistry1704
implements EventNotificationBroker2314 {
    private static final ConcurrentRequestTracker x = new ConcurrentRequestTracker();
    private final Collection<String> I;

    @Override
    public ConcurrentRequestTracker getListeners() {
        return x;
    }

    public @UnmodifiableView Collection<String> getTags() {
        return this.I;
    }

    public EventDispatchRegistry1704(Collection<String> collection) {
        this.I = collection;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return x;
    }
}

