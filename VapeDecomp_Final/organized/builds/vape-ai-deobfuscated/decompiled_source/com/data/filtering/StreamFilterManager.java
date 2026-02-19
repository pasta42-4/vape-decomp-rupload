/*
 * Decompiled with CFR 0.152.
 */
package com.data.filtering;

import com.data.compression.DataCompressionManager;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.Optional;

public class StreamFilterManager
extends ObjectLifecycleTracker {
    public Object y(DataCompressionManager dataCompressionManager) {
        return StreamFilterManager.U.u().gA.k(this.M(), dataCompressionManager.M());
    }

    public StreamFilterManager(Object object) {
        super(object);
    }

    public Optional<Object> y(DataCompressionManager dataCompressionManager) {
        return StreamFilterManager.U.u().gA.X(this.M(), dataCompressionManager.M());
    }

    public Optional<Object> X(DataCompressionManager dataCompressionManager) {
        return StreamFilterManager.U.u().gA.G(this.M(), dataCompressionManager.M());
    }
}

