/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.app.plugin.lifecycle;

import com.app.caching.CacheInvalidationTrigger;
import com.app.configuration.ConfigurationDescriptor;
import com.containers.generic.GenericContainerAdapter;
import com.inventory.management.InventoryReconciler;
import com.network.protocol.ProtocolInteractionController;
import com.notification.dispatch.NotificationDispatchInterface2673;
import com.runtime.context.LightweightExecutionContext;
import com.security.crypto.CryptographicInterface;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public interface PluginLifecycleContract
extends NotificationDispatchInterface2673,
CacheInvalidationTrigger {
    public static GenericContainerAdapter Y() {
        return new GenericContainerAdapter();
    }

    default public void G(CryptographicInterface cryptographicInterface) {
    }

    public ConfigurationDescriptor j();

    default public CryptographicInterface A() {
        return null;
    }

    @Nullable
    public Comparator<InventoryReconciler> k();

    public boolean L(LightweightExecutionContext var1, ProtocolInteractionController var2);

    @Nullable
    public String Y();

    default public boolean i(LightweightExecutionContext lightweightExecutionContext) {
        return this.L(lightweightExecutionContext, lightweightExecutionContext.C());
    }

    public String w();
}

