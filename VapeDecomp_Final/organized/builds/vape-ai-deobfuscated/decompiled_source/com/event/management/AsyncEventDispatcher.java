/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.event.management.EventDispatchCoordinator1933;
import com.runtime.interception.RuntimeParameterInterceptor;

public class AsyncEventDispatcher
extends EventDispatchCoordinator1933 {
    public AsyncEventDispatcher(Object object) {
        super(object);
    }

    public static AsyncEventDispatcher Z() {
        return new AsyncEventDispatcher(RuntimeParameterInterceptor.o(AsyncEventDispatcher.U.u().d_));
    }
}

