/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.strategy;

import com.network.core.NetworkConnectionManager2538;
import java.awt.Color;

public interface ExecutionStrategy {
    default public float r() {
        return 0.125f;
    }

    default public float Y() {
        return 0.25f;
    }

    public Color E(Object var1);

    public boolean D(NetworkConnectionManager2538 var1);
}

