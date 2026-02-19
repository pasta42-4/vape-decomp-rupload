/*
 * Decompiled with CFR 0.152.
 */
package com.ui.rendering;

import com.app.document.DocumentProcessingHandler1545;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.game.rendering.GameRenderContextBridge;

public class RenderingContextManager1889
extends GameRenderContextBridge {
    private static final ConcurrentRequestTracker I = new ConcurrentRequestTracker();
    public final float r;
    private final Object a;

    @Override
    public ConcurrentRequestTracker getListeners() {
        return I;
    }

    public RenderingContextManager1889(Object object, float f) {
        this.a = object;
        this.r = f;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return I;
    }

    public DocumentProcessingHandler1545 getItemRenderer() {
        return new DocumentProcessingHandler1545(this.a);
    }
}

