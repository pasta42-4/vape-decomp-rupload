/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.data.sync;

import com.notification.dispatch.NotificationDispatchInterface2673;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.ReplicableSecurityContext;
import java.util.List;
import org.jetbrains.annotations.UnmodifiableView;

public interface DataSynchronizationContract
extends NotificationDispatchInterface2673 {
    public @UnmodifiableView List<ReplicableSecurityContext> E();

    public boolean h(LightweightExecutionContext var1);

    @Override
    public String O();
}

