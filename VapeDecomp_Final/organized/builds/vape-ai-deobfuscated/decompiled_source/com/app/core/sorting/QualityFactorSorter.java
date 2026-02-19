/*
 * Decompiled with CFR 0.152.
 */
package com.app.core.sorting;

import com.core.lifecycle.ApplicationLifecycleManager;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.util.Comparator;

public class QualityFactorSorter
implements Comparator<CryptographicTransformer> {
    public int P(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        return Float.compare(systemConfigurationOrchestrator.y(cryptographicTransformer), systemConfigurationOrchestrator.y(cryptographicTransformer2));
    }
}

