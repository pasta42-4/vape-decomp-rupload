/*
 * Decompiled with CFR 0.152.
 */
package com.notification.dispatch;

import com.core.lifecycle.ObjectLifecycleManager;
import com.exception.system.CustomSystemException;
import com.text.processing.StringTokenContainer;

class NotificationDispatcher
extends StringTokenContainer {
    boolean g;
    final ObjectLifecycleManager F;

    @Override
    public void O() {
        try {
            if (this.g) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NotificationDispatcher.a(customSystemException);
        }
        this.g = true;
    }

    NotificationDispatcher(ObjectLifecycleManager objectLifecycleManager, Object object, String string, String string2) {
        this.F = objectLifecycleManager;
        super(object, string, string2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

