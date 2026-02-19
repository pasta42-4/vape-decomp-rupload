/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.resource.management;

import com.app.configuration.ConfigurationDescriptor;
import com.exception.system.CustomSystemException;
import com.inventory.management.InventoryReconciler;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

public class ComparativeResourceAllocator<T extends ComparativeResourceAllocator<T>> {
    private String a;
    @Nullable
    private Comparator<InventoryReconciler> D;
    private String N;
    private String E;
    private static int g;
    private ConfigurationDescriptor r;
    @Nullable
    private String P;

    public T p(String string) {
        this.a = string;
        return (T)this;
    }

    protected ComparativeResourceAllocator() {
    }

    public T R(String string) {
        this.P = string;
        return (T)this;
    }

    public static int P() {
        int n = ComparativeResourceAllocator.Y();
        try {
            if (n == 0) {
                return 5;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ComparativeResourceAllocator.a(customSystemException);
        }
        return 0;
    }

    public T b(@Nullable Comparator<InventoryReconciler> comparator) {
        this.D = comparator;
        return (T)this;
    }

    protected ComparativeResourceAllocator(ComparativeResourceAllocator<?> comparativeResourceAllocator) {
        this.E = comparativeResourceAllocator.H();
        this.N = comparativeResourceAllocator.E();
        this.a = comparativeResourceAllocator.O();
        this.r = comparativeResourceAllocator.a();
        this.D = comparativeResourceAllocator.G();
    }

    public static void m(int n) {
        g = n;
    }

    public T t(String string) {
        this.N = string;
        return (T)this;
    }

    public String H() {
        return this.E;
    }

    public ConfigurationDescriptor a() {
        return this.r;
    }

    public T c(String string) {
        this.E = string;
        return (T)this;
    }

    public T n(ConfigurationDescriptor configurationDescriptor) {
        this.r = configurationDescriptor;
        return (T)this;
    }

    public String E() {
        return this.N;
    }

    @Nullable
    public Comparator<InventoryReconciler> G() {
        return this.D;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String U() {
        return this.P;
    }

    public String O() {
        return this.a;
    }

    static {
        if (ComparativeResourceAllocator.P() != 0) {
            ComparativeResourceAllocator.m(81);
        }
    }

    public static int Y() {
        return g;
    }
}

