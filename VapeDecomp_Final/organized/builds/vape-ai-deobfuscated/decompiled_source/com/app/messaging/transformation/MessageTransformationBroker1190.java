/*
 * Decompiled with CFR 0.152.
 */
package com.app.messaging.transformation;

import a.N9;
import a.Zw;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.game.entity.EntityCollectionManager;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.ProtocolNegotiationStrategy;
import com.resource.management.ResourceAllocationTracker;
import com.session.management.MultiProtocolSessionManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.text.processing.PatternMatchingOrchestrator;
import java.util.HashSet;
import java.util.Vector;

class MessageTransformationBroker1190
implements ProtocolNegotiationStrategy<MultiProtocolSessionManager> {
    final EntityCollectionManager f;
    final HashSet C;
    final NetworkProtocolNegotiator i;
    final ResourceAllocationTracker U;
    final SystemConfigurationOrchestrator L;
    final HashSet K;

    @Override
    public int d(Vector<MultiProtocolSessionManager> vector) {
        return ResourceAllocationTracker.H(this.U, this.i, vector);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean O(N9 n9) {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (this.C.contains(n9) || this.f.E.contains(n9)) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MessageTransformationBroker1190.a(customSystemException);
                        }
                        if (!Zw.R(this.i, this.L, n9)) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MessageTransformationBroker1190.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageTransformationBroker1190.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public int B() {
        return 2;
    }

    @Override
    public boolean X(N9 n9) {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (this.K.contains(n9)) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageTransformationBroker1190.a(customSystemException);
                }
                TransactionCorrelationEngine transactionCorrelationEngine = this.i.N(n9.x(), n9.J(), n9.b());
                try {
                    try {
                        if (!PatternMatchingOrchestrator.u(transactionCorrelationEngine) || Zw.j(transactionCorrelationEngine)) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MessageTransformationBroker1190.a(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw MessageTransformationBroker1190.a(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        return bl2;
    }

    MessageTransformationBroker1190(ResourceAllocationTracker resourceAllocationTracker, HashSet hashSet, EntityCollectionManager entityCollectionManager, NetworkProtocolNegotiator networkProtocolNegotiator, SystemConfigurationOrchestrator systemConfigurationOrchestrator, HashSet hashSet2) {
        this.U = resourceAllocationTracker;
        this.C = hashSet;
        this.f = entityCollectionManager;
        this.i = networkProtocolNegotiator;
        this.L = systemConfigurationOrchestrator;
        this.K = hashSet2;
    }
}

