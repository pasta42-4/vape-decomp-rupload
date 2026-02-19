/*
 * Decompiled with CFR 0.152.
 */
package com.security.protocol;

import com.app.gameengine.GameRoundProcessor;
import com.core.computation.AbstractComputationKernel;
import com.resource.lifecycle.ResourceLifecycleManager315;
import com.temporal.metadata.TemporalMetadataResolver;

public class SecurityProtocolHandler1908 {
    private static AbstractComputationKernel[] r;

    public static GameRoundProcessor w() {
        return new GameRoundProcessor(ResourceLifecycleManager315.d(TemporalMetadataResolver.h.u().g8));
    }

    public static GameRoundProcessor g() {
        return new GameRoundProcessor(ResourceLifecycleManager315.j(TemporalMetadataResolver.h.u().g8));
    }

    public static void L(AbstractComputationKernel[] abstractComputationKernelArray) {
        r = abstractComputationKernelArray;
    }

    static {
        if (SecurityProtocolHandler1908.n() == null) {
            SecurityProtocolHandler1908.L(new AbstractComputationKernel[4]);
        }
    }

    public static GameRoundProcessor I() {
        return new GameRoundProcessor(ResourceLifecycleManager315.Q(TemporalMetadataResolver.h.u().g8));
    }

    public static AbstractComputationKernel[] n() {
        return r;
    }

    public static GameRoundProcessor q() {
        return new GameRoundProcessor(ResourceLifecycleManager315.c(TemporalMetadataResolver.h.u().g8));
    }

    public static GameRoundProcessor R() {
        return new GameRoundProcessor(ResourceLifecycleManager315.m(TemporalMetadataResolver.h.u().g8));
    }
}

