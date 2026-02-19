/*
 * Decompiled with CFR 0.152.
 */
package com.app.logging.core;

import com.network.streaming.StreamTransmissionHandler;
import com.system.lifecycle.ObjectLifecycleTracker;

public class LoggingInterceptor2041
extends ObjectLifecycleTracker {
    public static StreamTransmissionHandler E() {
        return new StreamTransmissionHandler(LoggingInterceptor2041.U.u().K.K());
    }

    public static String f(String string, Object ... objectArray) {
        return LoggingInterceptor2041.U.u().K.j(string, objectArray);
    }

    public LoggingInterceptor2041(Object object) {
        super(object);
    }
}

