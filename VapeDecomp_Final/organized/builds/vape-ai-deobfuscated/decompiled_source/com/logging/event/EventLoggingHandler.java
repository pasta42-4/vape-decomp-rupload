/*
 * Decompiled with CFR 0.152.
 */
package com.logging.event;

import com.security.cipher.CipherContextManager551;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class EventLoggingHandler
extends ObjectLifecycleTracker {
    public static void I(int n, int n2, IntBuffer intBuffer) {
        CipherContextManager551.f(EventLoggingHandler.U.u().kS, n, n2, intBuffer);
    }

    public EventLoggingHandler(Object object) {
        super(object);
    }

    public static void V(int n, boolean bl, FloatBuffer floatBuffer) {
        CipherContextManager551.y(EventLoggingHandler.U.u().kS, n, bl, floatBuffer);
    }
}

