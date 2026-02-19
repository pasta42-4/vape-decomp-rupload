/*
 * Decompiled with CFR 0.152.
 */
package com.vape.sorting;

import com.security.policy.PolicyEnforcementHandler;
import com.transaction.management.TransactionOrchestrator1017;
import java.util.Comparator;

class VapeProductComparator
implements Comparator<TransactionOrchestrator1017> {
    final PolicyEnforcementHandler R;

    public int J(TransactionOrchestrator1017 transactionOrchestrator1017, TransactionOrchestrator1017 transactionOrchestrator10172) {
        return Integer.compare(transactionOrchestrator1017.b(), transactionOrchestrator10172.b());
    }

    VapeProductComparator(PolicyEnforcementHandler policyEnforcementHandler) {
        this.R = policyEnforcementHandler;
    }
}

