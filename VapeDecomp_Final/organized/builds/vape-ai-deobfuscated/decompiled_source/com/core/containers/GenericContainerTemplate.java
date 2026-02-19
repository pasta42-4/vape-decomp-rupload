/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.core.containers;

import com.security.config.CryptographicEnumRegistry913;
import com.system.configuration.GenericConfigurationResolver;
import org.jetbrains.annotations.Nullable;

class GenericContainerTemplate<T>
extends GenericConfigurationResolver<GenericContainerTemplate<T>> {
    @Nullable
    private T a = null;

    GenericContainerTemplate<T> w(@Nullable T t) {
        this.a = t;
        return this.T();
    }

    GenericContainerTemplate(CryptographicEnumRegistry913 cryptographicEnumRegistry913, @Nullable String string, @Nullable T t) {
        super(cryptographicEnumRegistry913, string);
        this.w(t);
    }

    @Nullable
    T L() {
        return this.a;
    }

    GenericContainerTemplate() {
        this(CryptographicEnumRegistry913.PENDING, null, null);
    }

    private GenericContainerTemplate<T> T() {
        return this;
    }
}

