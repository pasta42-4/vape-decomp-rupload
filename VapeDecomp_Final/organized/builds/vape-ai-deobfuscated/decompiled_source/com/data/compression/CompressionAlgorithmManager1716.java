/*
 * Decompiled with CFR 0.152.
 */
package com.data.compression;

import com.routing.interceptor.InterceptorRoutingEngine;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class CompressionAlgorithmManager1716
extends ObjectLifecycleTracker {
    public CompressionAlgorithmManager1716(Object object) {
        super(object);
    }

    public static void H(int n, IntBuffer intBuffer) {
        InterceptorRoutingEngine.O(TemporalMetadataResolver.h.u().G3, n, intBuffer);
    }

    public static void h(int n, FloatBuffer floatBuffer) {
        InterceptorRoutingEngine.o(TemporalMetadataResolver.h.u().G3, n, floatBuffer);
    }

    public static void T(int n, int n2, FloatBuffer floatBuffer) {
        InterceptorRoutingEngine.b(TemporalMetadataResolver.h.u().G3, n, 5126, n2, floatBuffer);
    }

    public static void N(FloatBuffer floatBuffer) {
        InterceptorRoutingEngine.r(TemporalMetadataResolver.h.u().G3, floatBuffer);
    }
}

