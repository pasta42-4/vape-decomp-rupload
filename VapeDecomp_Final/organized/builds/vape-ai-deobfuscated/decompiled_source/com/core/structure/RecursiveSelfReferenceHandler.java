/*
 * Decompiled with CFR 0.152.
 */
package com.core.structure;

import com.analytics.metrics.AnalyticsMetricsProcessor;
import com.exception.system.CustomSystemException;
import com.security.crypto.CryptographicParameterGenerator;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.LinkedHashMap;

public class RecursiveSelfReferenceHandler {
    LinkedHashMap<Integer, Integer> r = new LinkedHashMap();
    public static RecursiveSelfReferenceHandler b = new RecursiveSelfReferenceHandler();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int H(AnalyticsMetricsProcessor analyticsMetricsProcessor) {
        int n;
        block21: {
            CryptographicParameterGenerator cryptographicParameterGenerator;
            try {
                if (this.r.containsKey(analyticsMetricsProcessor.hashCode())) {
                    return this.r.get(analyticsMetricsProcessor.hashCode());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RecursiveSelfReferenceHandler.a(customSystemException);
            }
            try {
                cryptographicParameterGenerator = analyticsMetricsProcessor.Q() ? TemporalMetadataResolver.h.W().u(analyticsMetricsProcessor.H(), false) : TemporalMetadataResolver.h.W().S(analyticsMetricsProcessor.H());
            }
            catch (CustomSystemException customSystemException) {
                throw RecursiveSelfReferenceHandler.a(customSystemException);
            }
            CryptographicParameterGenerator cryptographicParameterGenerator2 = cryptographicParameterGenerator;
            n = -1;
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
                        throw RecursiveSelfReferenceHandler.a(customSystemException);
                    }
                    double d2 = cryptographicParameterGenerator2.D(analyticsMetricsProcessor.i().substring(0, n2) + analyticsMetricsProcessor.H());
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
                        throw RecursiveSelfReferenceHandler.a(customSystemException);
                    }
                    try {
                        if (n2 == analyticsMetricsProcessor.i().length() - 1) {
                            break;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RecursiveSelfReferenceHandler.a(customSystemException);
                    }
                    ++n2;
                }
                n = n2;
            }
            try {
                try {
                    if (n != -1 || !(cryptographicParameterGenerator2.D(analyticsMetricsProcessor.H()) > analyticsMetricsProcessor.U())) break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw RecursiveSelfReferenceHandler.a(customSystemException);
                }
                --n;
            }
            catch (CustomSystemException customSystemException) {
                throw RecursiveSelfReferenceHandler.a(customSystemException);
            }
        }
        this.r.put(analyticsMetricsProcessor.hashCode(), n);
        return n;
    }
}

