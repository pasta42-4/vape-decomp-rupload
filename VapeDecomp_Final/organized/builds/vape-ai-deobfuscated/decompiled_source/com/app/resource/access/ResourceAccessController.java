/*
 * Decompiled with CFR 0.152.
 */
package com.app.resource.access;

import a.W;
import com.app.element.management.ElementConflictManager;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.core.exception.CustomRuntimeException;
import com.dataprocessing.transformation.DataTransformationEngine1936;
import com.debugging.analysis.ExceptionAnalyzer;
import com.dev.analysis.CompilationErrorAnalyzer;
import com.reflection.management.ClassPoolRegistry;
import com.system.resource.ResourceAllocationDispatcher;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ResourceAccessController
extends DataTransformationEngine1936 {
    protected ExceptionAnalyzer P;

    @Override
    public void e(String string, ClassPoolRegistry classPoolRegistry) throws BytecodeProcessingException {
        this.P.e(string, classPoolRegistry);
    }

    public ResourceAccessController(ResourceAllocationDispatcher resourceAllocationDispatcher) {
        this.P = resourceAllocationDispatcher;
    }

    @Override
    public boolean p() {
        return this.P.p();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    @Override
    public ExceptionAnalyzer r(int n) throws CustomRuntimeException {
        return this.P.r(n);
    }

    String j(Set<ExceptionAnalyzer> set) {
        return "";
    }

    @Override
    public int G() {
        return this.P.G();
    }

    @Override
    public boolean n() {
        return this.P.n();
    }

    @Override
    public boolean o(ExceptionAnalyzer exceptionAnalyzer) {
        return this.P.o(exceptionAnalyzer);
    }

    @Override
    public int C(BytecodeAnalyzer bytecodeAnalyzer) {
        return this.P.C(bytecodeAnalyzer);
    }

    @Override
    public String n() {
        return this.P.n();
    }

    @Override
    protected CompilationErrorAnalyzer I(int n) {
        return null;
    }

    public int l() {
        try {
            if (this.P instanceof ResourceAllocationDispatcher) {
                return ((ResourceAllocationDispatcher)this.P).G;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ResourceAccessController.a(runtimeException);
        }
        throw new RuntimeException("not available");
    }

    @Override
    public void O(ExceptionAnalyzer exceptionAnalyzer) {
        try {
            if (!exceptionAnalyzer.o(this.P)) {
                this.P = W.C;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ResourceAccessController.a(runtimeException);
        }
    }

    @Override
    public void j(int n) {
        this.P.j(n);
    }

    @Override
    public ElementConflictManager Z() {
        return this.P.Z();
    }

    @Override
    public ExceptionAnalyzer c() {
        return this.P.c();
    }
}

