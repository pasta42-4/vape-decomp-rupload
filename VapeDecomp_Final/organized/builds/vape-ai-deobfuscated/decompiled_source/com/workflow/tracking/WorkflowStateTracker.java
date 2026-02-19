/*
 * Decompiled with CFR 0.152.
 */
package com.workflow.tracking;

import a.J0;
import a._c;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.data.persistence.PersistenceCollectionManager;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.registry.MetaclassDefinitionRegistry;

public class WorkflowStateTracker
extends J0 {
    private PersistenceCollectionManager o;
    private int W;
    private static String E = "$1";

    @Override
    public void N(String string) throws ContextualExceptionHandler {
        throw new RuntimeException("not implemented yet");
    }

    @Override
    public _c E() {
        return super.E();
    }

    protected WorkflowStateTracker(PersistenceCollectionManager persistenceCollectionManager, int n, BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) {
        super(persistenceCollectionManager.N(n), bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
        this.o = persistenceCollectionManager;
        this.W = n;
    }

    @Override
    public int H() {
        return super.H();
    }
}

