/*
 * Decompiled with CFR 0.152.
 */
package com.util.serialization;

import com.configuration.management.ConfigurationOrchestrator2115;
import com.reflection.registry.MetaclassDefinitionRegistry;

public abstract class SerializationUtility2100 {
    protected MetaclassDefinitionRegistry k;
    SerializationUtility2100 n;

    public abstract int A();

    protected abstract void r(StringBuilder var1);

    public abstract String I();

    protected SerializationUtility2100(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        this.k = metaclassDefinitionRegistry;
        this.n = null;
    }

    public MetaclassDefinitionRegistry E() {
        return this.k;
    }

    final SerializationUtility2100 Y() {
        return this.n;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.getClass().getName());
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(this.hashCode()));
        stringBuilder.append('[');
        stringBuilder.append(ConfigurationOrchestrator2115.c(this.A()));
        this.r(stringBuilder);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public abstract String l();
}

