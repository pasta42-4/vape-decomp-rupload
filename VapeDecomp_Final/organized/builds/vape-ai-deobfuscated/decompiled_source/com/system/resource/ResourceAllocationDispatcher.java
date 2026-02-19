/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.app.resource.access.ResourceAccessController;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.debugging.analysis.ExceptionAnalyzer;
import com.dev.analysis.CompilationErrorAnalyzer;
import com.exception.system.CustomSystemException;
import com.reflection.mapping.ReflectionClassMapper;
import java.util.Set;

public class ResourceAllocationDispatcher
extends ReflectionClassMapper {
    int G;
    boolean M;

    @Override
    public void j(int n) {
        try {
            if (n == this.G) {
                this.M = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationDispatcher.a(customSystemException);
        }
    }

    @Override
    public int C(BytecodeAnalyzer bytecodeAnalyzer) {
        return this.G;
    }

    @Override
    public ExceptionAnalyzer c() {
        try {
            if (this.M) {
                return new CompilationErrorAnalyzer(new ReflectionClassMapper(this.n()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationDispatcher.a(customSystemException);
        }
        return new ResourceAccessController(this.d());
    }

    public int F() {
        return this.G;
    }

    @Override
    public int G() {
        return 8;
    }

    ResourceAllocationDispatcher(int n, String string) {
        super(string);
        this.G = n;
        this.M = false;
    }

    String j(Set<ExceptionAnalyzer> set) {
        return this.n() + "," + this.G;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public boolean o(ExceptionAnalyzer exceptionAnalyzer) {
        if (exceptionAnalyzer instanceof ResourceAllocationDispatcher) {
            boolean bl;
            block6: {
                block5: {
                    ResourceAllocationDispatcher resourceAllocationDispatcher = (ResourceAllocationDispatcher)exceptionAnalyzer;
                    try {
                        try {
                            if (this.G != resourceAllocationDispatcher.G || !this.n().equals(resourceAllocationDispatcher.n())) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationDispatcher.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationDispatcher.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public ResourceAllocationDispatcher d() {
        return new ResourceAllocationDispatcher(this.G, this.n());
    }

    @Override
    public boolean p() {
        return true;
    }
}

