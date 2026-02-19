/*
 * Decompiled with CFR 0.152.
 */
package com.data.encoding;

import com.runtime.context.LightweightExecutionContext;
import com.system.lifecycle.ObjectLifecycleTracker;

public class StreamDataEncoder
extends ObjectLifecycleTracker {
    public StreamDataEncoder(Object object) {
        super(object);
    }

    public static StreamDataEncoder j() {
        return new StreamDataEncoder(StreamDataEncoder.U.u().G5.K());
    }

    public static StreamDataEncoder o() {
        return new StreamDataEncoder(StreamDataEncoder.U.u().G5.x());
    }

    public static StreamDataEncoder J(boolean bl, LightweightExecutionContext lightweightExecutionContext) {
        return new StreamDataEncoder(StreamDataEncoder.U.u().G5.V(bl, lightweightExecutionContext.M()));
    }
}

