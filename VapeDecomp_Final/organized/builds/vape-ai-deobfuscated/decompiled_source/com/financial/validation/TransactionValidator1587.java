/*
 * Decompiled with CFR 0.152.
 */
package com.financial.validation;

import com.event.clustering.ClusterEventBroadcaster;
import com.event.management.DomainEventAggregator;
import com.event.orchestration.ClusterEventOrchestrator;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ClassMetadataResolver731;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.util.ContextualReflectionUtility;
import com.resource.allocation.ResourceAllocationStrategy2242;
import com.security.auth.AuthenticationProtocol;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.event.UserInterfaceEventBroker;

public class TransactionValidator1587
extends ClassMetadataResolver731 {
    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public TransactionValidator1587() {
        super(ReflectionMetadataResolver.FF);
    }

    @Override
    public void y() {
        try {
            if (GeometryCalculator.C() < 50) {
                this.P(TemporalMetadataResolver.h.u().p.P, DomainEventAggregator.class, new AuthenticationProtocol[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator1587.a(customSystemException);
        }
        this.P(TemporalMetadataResolver.h.u().p.vd, UserInterfaceEventBroker.class, new ResourceAllocationStrategy2242(1, ContextualReflectionUtility.w(ReflectionMetadataResolver.VV)).s(Object.class));
        this.P(TemporalMetadataResolver.h.u().p.I, ClusterEventOrchestrator.class, new AuthenticationProtocol[0]);
        this.P(TemporalMetadataResolver.h.u().p.V, ClusterEventBroadcaster.class, new AuthenticationProtocol[0]);
    }
}

