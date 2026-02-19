/*
 * Decompiled with CFR 0.152.
 */
package com.app.core.comparison;

import a._Y;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import java.util.Comparator;

public class QualityFactorComparator
implements Comparator<CryptographicTransformer> {
    public int a(CryptographicTransformer cryptographicTransformer, CryptographicTransformer cryptographicTransformer2) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        return Integer.compare(_Y.g(systemConfigurationOrchestrator, cryptographicTransformer), _Y.g(systemConfigurationOrchestrator, cryptographicTransformer2));
    }
}

