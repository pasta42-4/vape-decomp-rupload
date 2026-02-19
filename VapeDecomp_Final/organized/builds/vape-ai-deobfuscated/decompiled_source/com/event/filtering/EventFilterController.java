/*
 * Decompiled with CFR 0.152.
 */
package com.event.filtering;

import com.app.events.EventNotificationBroker2314;
import com.core.proxy.ServiceProxyDelegate;
import com.encoding.protocol.EncodingProtocolEnum;
import com.network.protocol.DataTransformationContract;

public class EventFilterController {
    private final DataTransformationContract q;
    private final EncodingProtocolEnum J;
    private final boolean L;
    private final ServiceProxyDelegate Y;

    public boolean w() {
        return this.L;
    }

    public EncodingProtocolEnum b() {
        return this.J;
    }

    public DataTransformationContract i() {
        return this.q;
    }

    public <T extends EventNotificationBroker2314> T q(T t) {
        this.q.f(t);
        return t;
    }

    public ServiceProxyDelegate P() {
        return this.Y;
    }

    public EventFilterController(ServiceProxyDelegate serviceProxyDelegate, EncodingProtocolEnum encodingProtocolEnum, boolean bl, DataTransformationContract dataTransformationContract) {
        this.Y = serviceProxyDelegate;
        this.J = encodingProtocolEnum;
        this.L = bl;
        this.q = dataTransformationContract;
    }
}

