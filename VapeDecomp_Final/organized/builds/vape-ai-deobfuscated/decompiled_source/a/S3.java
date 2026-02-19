/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import com.app.events.EventNotificationBroker2314;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.transaction.model.TransactionDescriptor;
import org.jetbrains.annotations.Nullable;

public class S3
implements EventNotificationBroker2314 {
    @Nullable
    private final TransactionDescriptor U;
    private static final ConcurrentRequestTracker t = new ConcurrentRequestTracker();
    private final TransactionDescriptor h;

    @Override
    public ConcurrentRequestTracker getListeners() {
        return t;
    }

    public S3(@Nullable TransactionDescriptor transactionDescriptor, TransactionDescriptor transactionDescriptor2) {
        this.U = transactionDescriptor;
        this.h = transactionDescriptor2;
    }

    public static ConcurrentRequestTracker getEventListeners() {
        return t;
    }

    public TransactionDescriptor getPreviousProfile() {
        return this.U;
    }

    public TransactionDescriptor getNewProfile() {
        return this.h;
    }
}

