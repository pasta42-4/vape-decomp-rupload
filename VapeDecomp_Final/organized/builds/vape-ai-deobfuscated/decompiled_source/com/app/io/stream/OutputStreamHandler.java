/*
 * Decompiled with CFR 0.152.
 */
package com.app.io.stream;

import com.protocol.encoding.EncodingProtocolResolver;
import com.system.lifecycle.ObjectLifecycleTracker;

public class OutputStreamHandler
extends ObjectLifecycleTracker {
    public OutputStreamHandler(Object object) {
        super(object);
    }

    public static OutputStreamHandler x() {
        return new OutputStreamHandler(EncodingProtocolResolver.e(OutputStreamHandler.U.u().Gd));
    }
}

