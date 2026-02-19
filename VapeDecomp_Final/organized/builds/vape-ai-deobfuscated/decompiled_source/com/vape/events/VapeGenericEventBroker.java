/*
 * Decompiled with CFR 0.152.
 */
package com.vape.events;

import com.configuration.resolver.ConfigurationProfileResolver;

public interface VapeGenericEventBroker<V extends ConfigurationProfileResolver<T, V>, T> {
    public boolean a(V var1, T var2, T var3);
}

