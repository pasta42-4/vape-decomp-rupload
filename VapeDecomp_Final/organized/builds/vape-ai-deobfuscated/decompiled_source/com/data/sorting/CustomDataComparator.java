/*
 * Decompiled with CFR 0.152.
 */
package com.data.sorting;

import com.middleware.interceptor.RequestContextInterceptor;
import com.runtime.context.ContextualExecutionFramework;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.resources.ResourceAllocationManager264;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.Comparator;

class CustomDataComparator
implements Comparator<ContextualExecutionFramework> {
    private CustomDataComparator() {
    }

    CustomDataComparator(RequestContextInterceptor requestContextInterceptor) {
        this();
    }

    public int c(ContextualExecutionFramework contextualExecutionFramework, ContextualExecutionFramework contextualExecutionFramework2) {
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().q();
        return Double.compare(cryptographicParameterGenerator.D(contextualExecutionFramework2.O() + contextualExecutionFramework2.G(ResourceAllocationManager264.v.p())), cryptographicParameterGenerator.D(contextualExecutionFramework.O() + contextualExecutionFramework.G(ResourceAllocationManager264.v.p())));
    }
}

