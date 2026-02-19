/*
 * Decompiled with CFR 0.152.
 */
package com.data.sorting;

import a.Qh;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.RuntimeResourceTracker;
import java.util.Comparator;

public class CustomObjectComparator
implements Comparator<CryptographicTransformer> {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private double g(CryptographicTransformer cryptographicTransformer) {
        double d2 = 0.0;
        for (Object object : new Qh(cryptographicTransformer.M()).l().G()) {
            LightweightExecutionContext lightweightExecutionContext = new LightweightExecutionContext(object);
            d2 += RuntimeResourceTracker.i(lightweightExecutionContext);
        }
        return d2;
    }

    public int h(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        block4: {
            try {
                try {
                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.UQ) || !cryptographicTransformer2.B(ReflectionMetadataResolver.UQ)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw CustomObjectComparator.a(customSystemException);
                }
                return Double.compare(this.g(cryptographicTransformer), this.g(cryptographicTransformer2));
            }
            catch (CustomSystemException customSystemException) {
                throw CustomObjectComparator.a(customSystemException);
            }
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        return Float.compare(systemConfigurationOrchestrator.y(cryptographicTransformer), systemConfigurationOrchestrator.y(cryptographicTransformer2));
    }
}

