/*
 * Decompiled with CFR 0.152.
 */
package com.core.management;

import com.analytics.metrics.AnalyticsMetricsProcessor;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.LinkedHashMap;

public class ResourceAllocator1845 {
    LinkedHashMap<Integer, Integer> J = new LinkedHashMap();
    public static ResourceAllocator1845 A = new ResourceAllocator1845();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int r(AnalyticsMetricsProcessor analyticsMetricsProcessor) {
        CryptographicParameterGenerator cryptographicParameterGenerator;
        try {
            if (this.J.containsKey(analyticsMetricsProcessor.hashCode())) {
                return this.J.get(analyticsMetricsProcessor.hashCode());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1845.a(customSystemException);
        }
        try {
            cryptographicParameterGenerator = analyticsMetricsProcessor.Q() ? TemporalMetadataResolver.h.W().u(analyticsMetricsProcessor.H(), false) : TemporalMetadataResolver.h.W().S(analyticsMetricsProcessor.H());
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1845.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
        int n = -2;
        if (cryptographicParameterGenerator2.D(analyticsMetricsProcessor.i()) <= analyticsMetricsProcessor.U()) {
            n = analyticsMetricsProcessor.i().length() - 1;
        } else {
            int n2 = (int)Math.ceil(analyticsMetricsProcessor.i().length() / 2) - 1;
            boolean bl = false;
            while (true) {
                try {
                    if (n2 < 0 || n2 >= analyticsMetricsProcessor.i().length()) break;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1845.a(customSystemException);
                }
                double d2 = cryptographicParameterGenerator2.D(analyticsMetricsProcessor.i().substring(0, n2));
                if (d2 > analyticsMetricsProcessor.U()) {
                    bl = true;
                    --n2;
                    continue;
                }
                try {
                    if (bl) {
                        break;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1845.a(customSystemException);
                }
                try {
                    if (n2 == analyticsMetricsProcessor.i().length() - 1) {
                        break;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocator1845.a(customSystemException);
                }
                ++n2;
            }
            n = n2;
        }
        try {
            if (n == -1) {
                --n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator1845.a(customSystemException);
        }
        this.J.put(analyticsMetricsProcessor.hashCode(), n);
        return n;
    }
}

