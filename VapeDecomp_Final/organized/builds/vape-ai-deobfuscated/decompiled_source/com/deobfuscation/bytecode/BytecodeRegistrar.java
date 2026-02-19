/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.bytecode;

import a.fu;
import com.app.core.interfaces.OperationExecutionInterface;
import com.runtime.context.ContextualExecutionFramework;
import com.system.orchestration.SystemOrchestrationManager;
import com.temporal.metadata.TemporalMetadataResolver;

class BytecodeRegistrar
implements OperationExecutionInterface {
    final SystemOrchestrationManager D;
    final ContextualExecutionFramework b;
    final fu G;

    @Override
    public void R() {
        TemporalMetadataResolver.h.S().M(this.b);
        this.G.A();
    }

    BytecodeRegistrar(SystemOrchestrationManager systemOrchestrationManager, ContextualExecutionFramework contextualExecutionFramework, fu fu2) {
        this.D = systemOrchestrationManager;
        this.b = contextualExecutionFramework;
        this.G = fu2;
    }
}

