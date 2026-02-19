/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.mapping;

import com.app.context.transformation.ContextTransformationEngine;
import com.runtime.context.ContextualExecutionFramework;
import com.security.authentication.AuthenticationGateway1860;

public class GenericComponentMapper<T extends ContextTransformationEngine>
extends AuthenticationGateway1860 {
    private final T P;

    public GenericComponentMapper(T t) {
        this(((ContextualExecutionFramework)t).O(), t);
    }

    public T c() {
        return this.P;
    }

    public GenericComponentMapper(String string, T t) {
        super(string);
        this.P = t;
    }
}

