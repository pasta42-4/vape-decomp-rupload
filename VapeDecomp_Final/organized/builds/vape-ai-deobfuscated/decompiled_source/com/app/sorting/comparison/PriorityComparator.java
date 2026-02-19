/*
 * Decompiled with CFR 0.152.
 */
package com.app.sorting.comparison;

import a.Qh;
import a.V3;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.pipeline.ObjectPipelineManager;
import java.util.Comparator;

public class PriorityComparator
implements Comparator<CryptographicTransformer> {
    private float V(CryptographicTransformer cryptographicTransformer) {
        float f = 0.0f;
        Qh qh = new Qh(cryptographicTransformer.M());
        if (qh.a().r()) {
            V3 v3;
            f += RuntimeResourceTracker.g(qh.a());
            if (qh.e(ObjectPipelineManager.G) && (v3 = qh.W(ObjectPipelineManager.G)).V() > 0) {
                f = (float)((double)f * (1.375 * (double)v3.y()));
            }
        }
        return f;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int N(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        block4: {
            try {
                try {
                    if (!cryptographicTransformer.B(ReflectionMetadataResolver.UQ) || !cryptographicTransformer2.B(ReflectionMetadataResolver.UQ)) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw PriorityComparator.a(customSystemException);
                }
                return Float.compare(this.V(cryptographicTransformer), this.V(cryptographicTransformer2));
            }
            catch (CustomSystemException customSystemException) {
                throw PriorityComparator.a(customSystemException);
            }
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        return Float.compare(systemConfigurationOrchestrator.y(cryptographicTransformer), systemConfigurationOrchestrator.y(cryptographicTransformer2));
    }
}

