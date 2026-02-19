/*
 * Decompiled with CFR 0.152.
 */
package com.app.transaction.management;

import a.V3;

public interface TransactionLifecycleContract {
    default public void M(float f, float f2, int n, int n2, float f3, boolean bl) {
        this.z(f, f2, n, n2, f3);
    }

    public void t(V3 var1);

    public void z(float var1, float var2, int var3, int var4, float var5);
}

