/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.configuration.resolver.ConfigurationProfileResolver;

public abstract class XmlTransformer<K, T extends ConfigurationProfileResolver<K, T>> {
    private static String[] I;
    private final ConfigurationProfileResolver<K, T> n;

    public abstract K b();

    public abstract K U();

    public abstract void b(K var1);

    public XmlTransformer(ConfigurationProfileResolver<K, T> configurationProfileResolver) {
        this.n = configurationProfileResolver;
    }

    public static String[] M() {
        return I;
    }

    public static void U(String[] stringArray) {
        I = stringArray;
    }

    static {
        if (XmlTransformer.M() == null) {
            XmlTransformer.U(new String[1]);
        }
    }

    public ConfigurationProfileResolver<K, T> G() {
        return this.n;
    }
}

