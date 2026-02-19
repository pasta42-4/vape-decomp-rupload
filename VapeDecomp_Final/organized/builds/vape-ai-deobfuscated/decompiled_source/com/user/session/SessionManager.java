/*
 * Decompiled with CFR 0.152.
 */
package com.user.session;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.runtime.context.LightweightExecutionContext;
import com.system.lifecycle.ObjectLifecycleTracker;

public class SessionManager
extends ObjectLifecycleTracker {
    public SessionManager(Object object) {
        super(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public LightweightExecutionContext x() {
        try {
            if (GeometryCalculator.C() >= 23) {
                return ApplicationLifecycleManager.U().K();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SessionManager.a(customSystemException);
        }
        return new LightweightExecutionContext(SessionManager.U.u().LZ.q(this.H));
    }
}

