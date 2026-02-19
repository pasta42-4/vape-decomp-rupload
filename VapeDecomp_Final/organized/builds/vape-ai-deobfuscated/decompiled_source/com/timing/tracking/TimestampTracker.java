/*
 * Decompiled with CFR 0.152.
 */
package com.timing.tracking;

import com.algorithm.optimization.AdaptiveComputationEngine;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionValidationEngine;
import com.game.configuration.GameVersionEnumerator;
import com.math.transformation.NumericTransformationEngine1068;
import com.security.auth.AuthenticationTokenGenerator1968;
import com.security.transform.CryptographicTransformer;
import com.strategy.selection.StrategySelectionController;

public class TimestampTracker {
    private long P;
    private long D;
    private long g;

    public NumericTransformationEngine1068 P() {
        return new NumericTransformationEngine1068((double)this.D / TimestampTracker.E(), (double)this.g / TimestampTracker.E(), (double)this.P / TimestampTracker.E());
    }

    public static TimestampTracker d(CryptographicTransformer cryptographicTransformer) {
        return new TimestampTracker(AdaptiveComputationEngine.Q(cryptographicTransformer.F() * TimestampTracker.E()), AdaptiveComputationEngine.Q(cryptographicTransformer.V() * TimestampTracker.E()), AdaptiveComputationEngine.Q(cryptographicTransformer.B() * TimestampTracker.E()));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static double E() {
        double d2;
        try {
            d2 = GameVersionEnumerator.MC_1_21_4.H() ? 4096.0 : 32.0;
        }
        catch (CustomSystemException customSystemException) {
            throw TimestampTracker.a(customSystemException);
        }
        return d2;
    }

    public void B(TransactionValidationEngine transactionValidationEngine) {
        this.D = transactionValidationEngine.I();
        this.g = transactionValidationEngine.S();
        this.P = transactionValidationEngine.d();
    }

    public TimestampTracker(int n, int n2, int n3) {
        this.D = n;
        this.g = n2;
        this.P = n3;
    }

    public void j(AuthenticationTokenGenerator1968 authenticationTokenGenerator1968) {
        ContextualEventDispatcher contextualEventDispatcher = authenticationTokenGenerator1968.R().e();
        this.D = AdaptiveComputationEngine.Q(contextualEventDispatcher.X() * TimestampTracker.E());
        this.g = AdaptiveComputationEngine.Q(contextualEventDispatcher.F() * TimestampTracker.E());
        this.P = AdaptiveComputationEngine.Q(contextualEventDispatcher.f() * TimestampTracker.E());
    }

    public void S(StrategySelectionController strategySelectionController) {
        this.D += (long)strategySelectionController.W();
        this.g += (long)strategySelectionController.V();
        this.P += (long)strategySelectionController.G();
    }
}

