/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 */
package com.messaging.core;

import com.app.system.resources.VirtualResourceAllocator;
import com.data.validation.IntegratedDataValidator;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.connection.ConnectionLifecycleHandler;
import com.system.lifecycle.ObjectLifecycleTracker;
import io.netty.channel.Channel;

public class MessageInterceptor
extends ObjectLifecycleTracker {
    public Channel Z() {
        return this.z();
    }

    public void c(ConnectionLifecycleHandler connectionLifecycleHandler) {
        try {
            if (GeometryCalculator.C() >= GeometryCalculator.x) {
                IntegratedDataValidator.R(MessageInterceptor.U.u().LB, this.H, connectionLifecycleHandler.M(), null, true);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MessageInterceptor.a(customSystemException);
        }
        IntegratedDataValidator.i(MessageInterceptor.U.u().LB, this.H, connectionLifecycleHandler.M());
    }

    public VirtualResourceAllocator A() {
        return new VirtualResourceAllocator(IntegratedDataValidator.Z(MessageInterceptor.U.u().LB, this.H));
    }

    public Channel z() {
        return (Channel)IntegratedDataValidator.E(MessageInterceptor.U.u().LB, this.H);
    }

    public MessageInterceptor(Object object) {
        super(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

