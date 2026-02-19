/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.resolver;

import com.app.resource.ResourceIdentifier;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.core.exception.CustomRuntimeException;
import com.exception.system.CustomSystemException;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.reflection.validation.MethodValidationProxy;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ReflectionConstructResolver
extends MethodValidationProxy {
    @Override
    public boolean g() {
        return super.g();
    }

    protected ReflectionConstructResolver(int n, BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) {
        super(n, bytecodeAnalysisEngine305, metaclassDefinitionRegistry, bytecodeInspectionEngine);
    }

    @Override
    public ResourceIdentifier n() throws CustomRuntimeException {
        throw new CustomRuntimeException("this is a constructor call.  Call getConstructor().");
    }

    @Override
    public String g() {
        String string;
        try {
            string = this.g() ? "super" : "this";
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionConstructResolver.a(customSystemException);
        }
        return string;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

