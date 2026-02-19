/*
 * Decompiled with CFR 0.152.
 */
package com.data.stream;

import com.configuration.resolver.ConfigurationProfileResolver;
import com.data.transformation.XmlTransformer;

public class DataStreamInterceptor1614<K, T extends ConfigurationProfileResolver<K, T>>
extends XmlTransformer {
    public Object U() {
        return this.G().A();
    }

    public Object b() {
        return this.G().i();
    }

    public DataStreamInterceptor1614(ConfigurationProfileResolver<K, T> configurationProfileResolver) {
        super(configurationProfileResolver);
    }

    public void b(Object object) {
        this.G().d(object);
    }
}

