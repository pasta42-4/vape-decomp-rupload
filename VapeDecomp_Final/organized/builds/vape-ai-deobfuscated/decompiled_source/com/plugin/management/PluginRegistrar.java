/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.plugin.management;

import com.app.core.context.ContextualResolver;
import com.network.connection.NetworkConnectionManager1645;
import com.resource.management.ComparativeResourceAllocator;
import com.security.enums.SecurityStateEnum;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.UnmodifiableView;

public class PluginRegistrar
extends ComparativeResourceAllocator<PluginRegistrar> {
    private final Map<String, SecurityStateEnum> O = new LinkedHashMap<String, SecurityStateEnum>();

    public PluginRegistrar P(SecurityStateEnum securityStateEnum, String ... stringArray) {
        for (String string : stringArray) {
            this.O.put(string, securityStateEnum);
        }
        return this;
    }

    private PluginRegistrar(ComparativeResourceAllocator<?> comparativeResourceAllocator) {
        super(comparativeResourceAllocator);
    }

    public PluginRegistrar o(String string, SecurityStateEnum securityStateEnum) {
        this.O.put(string, securityStateEnum);
        return this;
    }

    public @UnmodifiableView Map<String, SecurityStateEnum> k() {
        return this.O;
    }

    PluginRegistrar(ComparativeResourceAllocator comparativeResourceAllocator, ContextualResolver contextualResolver) {
        this(comparativeResourceAllocator);
    }

    public NetworkConnectionManager1645 U() {
        return new NetworkConnectionManager1645(this);
    }
}

