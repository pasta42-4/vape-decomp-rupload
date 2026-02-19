/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import com.core.exception.CustomRuntimeException;
import com.error.handling.ContextualExceptionHandler;

public interface TransmissionProtocolInterface<T> {
    public T s() throws ContextualExceptionHandler, CustomRuntimeException;
}

