/*
 * Decompiled with CFR 0.152.
 */
package com.financial.transaction;

import com.integration.interop.CrossPlatformInteroperabilityManager;
import com.network.session.ConnectionStateTracker2569;
import com.system.resource.ResourceAllocator1518;
import com.transaction.management.TransactionOrchestrator1017;
import java.nio.FloatBuffer;
import java.util.List;

public class TransactionGateway<T extends TransactionOrchestrator1017>
extends ResourceAllocator1518<T> {
    public TransactionGateway(Object object) {
        super(object);
    }

    public void m(List list) {
        CrossPlatformInteroperabilityManager.R(TransactionGateway.U.u().w, this.H, list);
    }

    public ConnectionStateTracker2569 Q() {
        return new ConnectionStateTracker2569(CrossPlatformInteroperabilityManager.l(TransactionGateway.U.u().w, this.H));
    }

    public FloatBuffer j() {
        return CrossPlatformInteroperabilityManager.C(TransactionGateway.U.u().w, this.H);
    }

    public List<Object> W() {
        return (List)CrossPlatformInteroperabilityManager.b(TransactionGateway.U.u().w, this.H);
    }
}

