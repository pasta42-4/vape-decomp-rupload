/*
 * Decompiled with CFR 0.152.
 */
package com.ui.input;

import com.concurrency.tracking.ConcurrentRequestTracker;
import com.exception.system.CustomSystemException;
import com.game.rendering.GameRenderContextBridge;
import com.runtime.context.ContextualExecutionFramework;
import com.system.lifecycle.SystemLifecycleController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;

public class UserInputEventMapper
extends GameRenderContextBridge {
    public static int N;
    private final int a;
    private final boolean o;
    public static int l;
    private static final ConcurrentRequestTracker t;

    public static ConcurrentRequestTracker getEventListeners() {
        return t;
    }

    @Override
    public boolean fire() {
        int n = -100 + this.getButton();
        if (this.getButtonState()) {
            for (TransactionDescriptor object : TemporalMetadataResolver.h.o().T()) {
                try {
                    if (!object.d(n)) continue;
                    return this.isCanceled();
                }
                catch (CustomSystemException customSystemException) {
                    throw UserInputEventMapper.a(customSystemException);
                }
            }
        }
        for (ContextualExecutionFramework contextualExecutionFramework : TemporalMetadataResolver.h.U().q()) {
            try {
                try {
                    if (!this.getButtonState() || contextualExecutionFramework.C().Z().isEmpty()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw UserInputEventMapper.a(customSystemException);
                }
                contextualExecutionFramework.C().d(n);
            }
            catch (CustomSystemException customSystemException) {
                throw UserInputEventMapper.a(customSystemException);
            }
        }
        SystemLifecycleController.C.q().S(this);
        return super.fire();
    }

    public UserInputEventMapper(int n, boolean bl) {
        this.a = n;
        this.o = bl;
    }

    public int getButton() {
        return this.a;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public ConcurrentRequestTracker getListeners() {
        return t;
    }

    public boolean getButtonState() {
        return this.o;
    }

    static {
        l = 0;
        N = 1;
        t = new ConcurrentRequestTracker();
    }
}

