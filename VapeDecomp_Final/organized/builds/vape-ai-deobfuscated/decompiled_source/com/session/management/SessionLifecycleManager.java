/*
 * Decompiled with CFR 0.152.
 */
package com.session.management;

import com.security.validation.SecureTokenValidator;
import com.system.lifecycle.ObjectLifecycleTracker;

public class SessionLifecycleManager
extends ObjectLifecycleTracker {
    public SessionLifecycleManager(Object object) {
        super(object);
    }

    public static SessionLifecycleManager m() {
        return new SessionLifecycleManager(SecureTokenValidator.J(SessionLifecycleManager.U.u().La));
    }
}

