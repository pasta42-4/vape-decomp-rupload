/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.security.crypto;

import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.financial.validation.TransactionValidator2109;
import com.notification.dispatch.NotificationDispatchInterface2673;
import com.resource.management.CloneableResourceDescriptor;
import com.runtime.context.LightweightExecutionContext;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public interface CryptographicInterface
extends NotificationDispatchInterface2673 {
    public @UnmodifiableView List<PluginLifecycleContract> V();

    public boolean z(CloneableResourceDescriptor var1);

    public String s();

    public static TransactionValidator2109 j() {
        return new TransactionValidator2109();
    }

    @Nullable
    public Comparator<LightweightExecutionContext> V();

    public String t();

    @Override
    public String O();
}

