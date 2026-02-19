/*
 * Decompiled with CFR 0.152.
 */
package com.data.compression;

import com.data.streaming.DataStreamProcessor1970;
import com.performance.caching.CacheManager2621;
import java.util.stream.Stream;

public class StreamCompressionEngine
extends DataStreamProcessor1970 {
    public Stream<CacheManager2621> E() {
        return StreamCompressionEngine.U.u().dU.T(this.M()).map(CacheManager2621::new);
    }

    public StreamCompressionEngine(Object object) {
        super(object);
    }
}

