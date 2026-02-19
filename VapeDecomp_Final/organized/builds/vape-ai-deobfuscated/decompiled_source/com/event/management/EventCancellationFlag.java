/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.app.event.core.EventCancellationProtocol;

public abstract class EventCancellationFlag
implements EventCancellationProtocol {
    private boolean p;

    @Override
    public boolean isCanceled() {
        return this.p;
    }

    @Override
    public void setCanceled(boolean bl) {
        this.p = bl;
    }
}

