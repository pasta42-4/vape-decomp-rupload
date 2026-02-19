/*
 * Decompiled with CFR 0.152.
 */
package com.app.security.validation;

import com.system.lifecycle.ObjectLifecycleTracker;

public class SecurityValidationService
extends ObjectLifecycleTracker {
    public SecurityValidationService(Object object) {
        super(object);
    }

    public static SecurityValidationService W() {
        return new SecurityValidationService(SecurityValidationService.U.u().Lf.E());
    }
}

