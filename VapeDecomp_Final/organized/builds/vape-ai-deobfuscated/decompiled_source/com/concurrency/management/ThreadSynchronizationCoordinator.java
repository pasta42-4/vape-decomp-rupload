/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.management;

import com.app.reflection.ReflectionMetadataContainer;
import com.deobfuscation.reflection.WildcardTypeResolver;

public class ThreadSynchronizationCoordinator
extends ReflectionMetadataContainer {
    ReflectionMetadataContainer m;

    @Override
    public ReflectionMetadataContainer A() {
        return this.m;
    }

    ThreadSynchronizationCoordinator(String string, int n, int n2, WildcardTypeResolver[] wildcardTypeResolverArray, ReflectionMetadataContainer reflectionMetadataContainer) {
        super(string, n, n2, wildcardTypeResolverArray);
        this.m = reflectionMetadataContainer;
    }
}

