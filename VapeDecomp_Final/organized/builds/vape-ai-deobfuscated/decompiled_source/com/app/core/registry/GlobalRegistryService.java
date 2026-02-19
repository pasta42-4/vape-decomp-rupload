/*
 * Decompiled with CFR 0.152.
 */
package com.app.core.registry;

import com.bytecode.instrumentation.ArgumentInterceptor;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.registry.MetaclassDefinitionRegistry;

public abstract class GlobalRegistryService {
    abstract int j(MetaclassDefinitionRegistry var1, String var2, ComplexEntityLifecycleManager var3, MetaclassDefinitionRegistry[] var4, ArgumentInterceptor var5) throws ContextualExceptionHandler;

    abstract int E(MetaclassDefinitionRegistry var1, String var2, ComplexEntityLifecycleManager var3, ArgumentInterceptor var4) throws ContextualExceptionHandler;
}

