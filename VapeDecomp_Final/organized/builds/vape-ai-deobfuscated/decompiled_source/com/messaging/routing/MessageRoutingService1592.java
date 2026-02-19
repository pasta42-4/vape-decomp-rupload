/*
 * Decompiled with CFR 0.152.
 */
package com.messaging.routing;

import a.Pi;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.RenderingPipelineController;
import com.math.geometry.GeometryCalculator;
import com.network.connections.NetworkConnectionManager1584;
import com.security.authentication.AuthenticationStateManager675;
import com.system.lifecycle.ObjectLifecycleTracker;

public class MessageRoutingService1592
extends ObjectLifecycleTracker {
    public String G() {
        try {
            if (GeometryCalculator.C() >= 35) {
                return this.H().i();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MessageRoutingService1592.a(customSystemException);
        }
        return Pi.p(MessageRoutingService1592.U.u().g0, this.H);
    }

    public AuthenticationStateManager675 H() {
        AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(Pi.d(MessageRoutingService1592.U.u().g0, this.H));
        return authenticationStateManager675;
    }

    public NetworkConnectionManager1584 f() {
        return new NetworkConnectionManager1584(Pi.B(MessageRoutingService1592.U.u().g0, this.H));
    }

    public MessageRoutingService1592(Object object) {
        super(object);
    }

    public RenderingPipelineController A() {
        return new RenderingPipelineController(Pi.g(MessageRoutingService1592.U.u().g0, this.H));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

