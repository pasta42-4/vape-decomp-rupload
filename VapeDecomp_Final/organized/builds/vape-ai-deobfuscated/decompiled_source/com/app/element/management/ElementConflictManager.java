/*
 * Decompiled with CFR 0.152.
 */
package com.app.element.management;

import a.W;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.core.exception.CustomRuntimeException;
import com.debugging.analysis.ExceptionAnalyzer;
import com.exception.system.CustomSystemException;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.mapping.ReflectionClassMapper;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ElementConflictManager
extends ExceptionAnalyzer {
    private String f;
    private char Z;
    private int e;

    @Override
    public ExceptionAnalyzer c() {
        try {
            if (this == W.C) {
                return this;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ElementConflictManager.a(customSystemException);
        }
        return super.c();
    }

    @Override
    public ExceptionAnalyzer r(int n) throws CustomRuntimeException {
        try {
            if (this == W.C) {
                return this;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ElementConflictManager.a(customRuntimeException);
        }
        try {
            if (n < 0) {
                throw new CustomRuntimeException("no element type: " + this.f);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ElementConflictManager.a(customRuntimeException);
        }
        try {
            if (n == 0) {
                return this;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ElementConflictManager.a(customRuntimeException);
        }
        char[] cArray = new char[n + 1];
        try {
            for (int i = 0; i < n; ++i) {
                cArray[i] = 91;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ElementConflictManager.a(customRuntimeException);
        }
        cArray[n] = this.Z;
        return new ReflectionClassMapper(new String(cArray));
    }

    @Override
    public int G() {
        return this.e;
    }

    @Override
    public boolean o(ExceptionAnalyzer exceptionAnalyzer) {
        boolean bl;
        try {
            bl = this == exceptionAnalyzer;
        }
        catch (CustomSystemException customSystemException) {
            throw ElementConflictManager.a(customSystemException);
        }
        return bl;
    }

    @Override
    public ElementConflictManager Z() {
        return this;
    }

    @Override
    public void e(String string, ClassPoolRegistry classPoolRegistry) throws BytecodeProcessingException {
        throw new BytecodeProcessingException("conflict: " + this.f + " and " + string);
    }

    @Override
    public boolean n() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.e != 4 && this.e != 3) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ElementConflictManager.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ElementConflictManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public int C(BytecodeAnalyzer bytecodeAnalyzer) {
        return 0;
    }

    public ElementConflictManager(String string, int n, char c) {
        this.f = string;
        this.e = n;
        this.Z = c;
    }

    @Override
    public String n() {
        return this.f;
    }

    String j(Set<ExceptionAnalyzer> set) {
        return this.f;
    }

    static char u(ElementConflictManager elementConflictManager) {
        return elementConflictManager.Z;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

