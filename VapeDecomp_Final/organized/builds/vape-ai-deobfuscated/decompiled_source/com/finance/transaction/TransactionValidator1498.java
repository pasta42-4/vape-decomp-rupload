/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package com.finance.transaction;

import com.batch.processing.BatchWorker;
import com.exception.system.CustomSystemException;
import com.google.common.collect.ImmutableList;
import com.runtime.context.ContextualExecutionFramework;
import com.security.authentication.AuthenticationLifecycleManager;
import com.temporal.metadata.TemporalMetadataResolver;
import java.util.Collections;
import java.util.List;

public class TransactionValidator1498
extends AuthenticationLifecycleManager {
    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public List<Integer> Z() {
        return ImmutableList.copyOf(((BatchWorker)TemporalMetadataResolver.h.F().Z.J()).Z());
    }

    @Override
    public void E(List<Integer> list) {
        try {
            ((BatchWorker)TemporalMetadataResolver.h.F().Z.J()).E(list);
            if (!this.E()) {
                this.E(Collections.singletonList(161));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1498.c(customSystemException);
        }
    }

    @Override
    public boolean Y() {
        return false;
    }

    public TransactionValidator1498(ContextualExecutionFramework contextualExecutionFramework) {
        super(contextualExecutionFramework);
    }
}

