/*
 * Decompiled with CFR 0.152.
 */
package com.transaction.management;

import com.event.management.ContextualEventDispatcher;
import com.finance.validation.TransactionValidationService;
import com.network.config.NetworkConfigurationManager1905;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.type.normalization.ParameterTypeNormalizer;

public class TransactionCoordinator2230
extends ObjectLifecycleTracker {
    public static TransactionCoordinator2230 T(ContextualEventDispatcher contextualEventDispatcher, ContextualEventDispatcher contextualEventDispatcher2, TransactionValidationService transactionValidationService, NetworkConfigurationManager1905 networkConfigurationManager1905, CryptographicTransformer cryptographicTransformer) {
        Object object = ParameterTypeNormalizer.P(TransactionCoordinator2230.U.u().dL, contextualEventDispatcher.M(), contextualEventDispatcher2.M(), transactionValidationService.M(), networkConfigurationManager1905.M(), cryptographicTransformer.M());
        return new TransactionCoordinator2230(object);
    }

    public TransactionCoordinator2230(Object object) {
        super(object);
    }
}

