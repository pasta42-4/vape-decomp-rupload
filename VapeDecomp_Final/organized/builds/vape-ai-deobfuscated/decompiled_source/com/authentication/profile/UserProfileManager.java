/*
 * Decompiled with CFR 0.152.
 */
package com.authentication.profile;

import a.Ry;
import com.app.events.EventNotificationBroker2314;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;

public class UserProfileManager
implements EventNotificationBroker2314 {
    private final Ry D;
    private static boolean V;
    private static final ConcurrentRequestTracker E;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return E;
    }

    static {
        E = new ConcurrentRequestTracker();
        UserProfileManager.J(false);
    }

    public Ry getProfile() {
        return this.D;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return E;
    }

    public static boolean M() {
        boolean bl = UserProfileManager.p();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw UserProfileManager.a(customSystemException);
        }
        return false;
    }

    public static void J(boolean bl) {
        V = bl;
    }

    public static boolean p() {
        return V;
    }

    public UserProfileManager(Ry ry) {
        this.D = ry;
    }
}

