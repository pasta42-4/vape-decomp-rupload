/*
 * Decompiled with CFR 0.152.
 */
package com.data.compression;

import com.data.streaming.DataStreamFilter;
import com.notification.service.NotificationBroker2532;
import com.runtime.interceptor.ParameterInterceptor;
import com.security.transform.CryptographicTransformer;

public class CompressionAlgorithm
extends NotificationBroker2532 {
    public DataStreamFilter j() {
        return new DataStreamFilter(ParameterInterceptor.V(CompressionAlgorithm.U.u().B, this.H));
    }

    public CryptographicTransformer P() {
        return new CryptographicTransformer(ParameterInterceptor.h(CompressionAlgorithm.U.u().B, this.H));
    }

    public CompressionAlgorithm(Object object) {
        super(object);
    }

    public void y(CryptographicTransformer cryptographicTransformer) {
        ParameterInterceptor.b(CompressionAlgorithm.U.u().B, this.H, cryptographicTransformer.M());
    }
}

