/*
 * Decompiled with CFR 0.152.
 */
package com.xml.processing;

import com.app.core.generics.GenericTypeResolver;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.data.transformation.XmlTransformer;

public class XmlHandler<K, T extends ConfigurationProfileResolver<K, T>>
extends XmlTransformer {
    private final GenericTypeResolver<T, K> m;

    public Object U() {
        return this.m.T();
    }

    public void b(Object object) {
        this.m.v(object);
    }

    public XmlHandler(GenericTypeResolver<T, K> genericTypeResolver, ConfigurationProfileResolver<K, T> configurationProfileResolver) {
        super(configurationProfileResolver);
        this.m = genericTypeResolver;
    }

    public Object b() {
        return this.m.T();
    }
}

