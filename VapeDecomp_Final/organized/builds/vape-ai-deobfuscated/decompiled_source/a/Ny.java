/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.N9;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.entity.EntityCollectionManager;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.ProtocolNegotiationStrategy;
import com.resource.management.ResourceAllocationTracker;
import com.text.processing.PatternMatchingOrchestrator;
import java.util.Vector;

class Ny
implements ProtocolNegotiationStrategy<EntityCollectionManager> {
    final ResourceAllocationTracker P;
    final NetworkProtocolNegotiator O;

    @Override
    public int B() {
        return 4;
    }

    Ny(ResourceAllocationTracker resourceAllocationTracker, NetworkProtocolNegotiator networkProtocolNegotiator) {
        this.P = resourceAllocationTracker;
        this.O = networkProtocolNegotiator;
    }

    @Override
    public boolean X(N9 n9) {
        TransactionCorrelationEngine transactionCorrelationEngine = this.O.N(n9.x(), n9.J(), n9.b());
        return PatternMatchingOrchestrator.z(transactionCorrelationEngine);
    }

    @Override
    public int d(Vector<EntityCollectionManager> vector) {
        return ResourceAllocationTracker.c(this.P, this.O, vector);
    }
}

