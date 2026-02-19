/*
 * Decompiled with CFR 0.152.
 */
package com.security.auth;

import com.app.core.interfaces.OperationExecutionInterface;
import com.async.scheduling.AsynchronousTaskScheduler685;
import com.security.streaming.StreamCipherTransformer;

class AuthenticationTokenResolver
implements OperationExecutionInterface {
    final AsynchronousTaskScheduler685 L;
    final StreamCipherTransformer w;

    @Override
    public void R() {
        this.w.g(false);
    }

    AuthenticationTokenResolver(AsynchronousTaskScheduler685 asynchronousTaskScheduler685, StreamCipherTransformer streamCipherTransformer) {
        this.L = asynchronousTaskScheduler685;
        this.w = streamCipherTransformer;
    }
}

