/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.data.compression.DataCompressionManager;
import com.performance.caching.CacheManager2621;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.util.Optional;

public class DataStreamProcessor1970
extends ObjectLifecycleTracker {
    public Optional<Object> Z(DataCompressionManager dataCompressionManager) {
        return DataStreamProcessor1970.U.u().GZ.u(this.M(), dataCompressionManager.M());
    }

    public CacheManager2621 r(DataCompressionManager dataCompressionManager) {
        return new CacheManager2621(DataStreamProcessor1970.U.u().GZ.o(this.M(), dataCompressionManager.M()));
    }

    public DataStreamProcessor1970(Object object) {
        super(object);
    }
}

