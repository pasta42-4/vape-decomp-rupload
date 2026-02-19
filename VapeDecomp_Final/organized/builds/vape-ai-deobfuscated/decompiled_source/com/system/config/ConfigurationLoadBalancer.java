/*
 * Decompiled with CFR 0.152.
 */
package com.system.config;

import com.event.management.ContextualEventDispatcher;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.security.transform.CryptographicTransformer;

public class ConfigurationLoadBalancer
extends NetworkPacketInterceptor1107 {
    public ConfigurationLoadBalancer(Object object) {
        super(object);
    }

    public static ConfigurationLoadBalancer s(CryptographicTransformer cryptographicTransformer, ContextualEventDispatcher contextualEventDispatcher) {
        return new ConfigurationLoadBalancer(ConfigurationLoadBalancer.U.u().kX.r(cryptographicTransformer.M(), contextualEventDispatcher.M()));
    }

    public CryptographicTransformer O() {
        return new CryptographicTransformer(ConfigurationLoadBalancer.U.u().kX.j(this.H));
    }
}

