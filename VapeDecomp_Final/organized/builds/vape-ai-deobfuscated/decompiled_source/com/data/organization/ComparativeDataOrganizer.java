/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.data.organization;

import com.app.configuration.ConfigurationDescriptor;
import com.app.plugin.lifecycle.PluginLifecycleContract;
import com.inventory.management.InventoryReconciler;
import com.resource.management.ComparativeResourceAllocator;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

public abstract class ComparativeDataOrganizer
implements PluginLifecycleContract {
    private final String l;
    @Nullable
    private final String g;
    private final ConfigurationDescriptor B;
    private final String G;
    @Nullable
    private final String Y;
    @Nullable
    private final Comparator<InventoryReconciler> z;

    @Override
    public String w() {
        return this.G;
    }

    @Override
    public ConfigurationDescriptor j() {
        return this.B;
    }

    @Override
    @Nullable
    public Comparator<InventoryReconciler> k() {
        return this.z;
    }

    @Override
    public String O() {
        return this.l;
    }

    public ComparativeDataOrganizer(ComparativeResourceAllocator<?> comparativeResourceAllocator) {
        this.G = comparativeResourceAllocator.H();
        this.l = comparativeResourceAllocator.E();
        this.Y = comparativeResourceAllocator.U();
        this.g = comparativeResourceAllocator.O();
        this.B = comparativeResourceAllocator.a();
        this.z = comparativeResourceAllocator.G();
    }

    @Override
    @Nullable
    public String Y() {
        return this.g;
    }

    @Override
    public String e() {
        return this.Y;
    }
}

