/*
 * Decompiled with CFR 0.152.
 */
package com.request.management;

import com.system.lifecycle.ObjectLifecycleTracker;

public class RequestLifecycleInterceptor
extends ObjectLifecycleTracker {
    public void Q(boolean bl) {
        RequestLifecycleInterceptor.U.u().S.H(this.M(), bl);
    }

    public RequestLifecycleInterceptor(Object object) {
        super(object);
    }
}

