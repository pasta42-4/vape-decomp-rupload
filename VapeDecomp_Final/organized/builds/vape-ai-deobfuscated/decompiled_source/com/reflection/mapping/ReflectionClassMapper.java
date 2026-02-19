/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.mapping;

import a.W;
import com.app.element.management.ElementConflictManager;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.core.exception.CustomRuntimeException;
import com.debugging.analysis.ExceptionAnalyzer;
import com.exception.system.CustomSystemException;
import com.reflection.management.ClassPoolRegistry;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ReflectionClassMapper
extends ExceptionAnalyzer {
    private String a;

    @Override
    public ElementConflictManager Z() {
        return null;
    }

    @Override
    public String n() {
        return this.a;
    }

    @Override
    public int G() {
        return 7;
    }

    @Override
    public void e(String string, ClassPoolRegistry classPoolRegistry) throws BytecodeProcessingException {
    }

    @Override
    public boolean o(ExceptionAnalyzer exceptionAnalyzer) {
        try {
            if (exceptionAnalyzer.p()) {
                return exceptionAnalyzer.o(this);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ReflectionClassMapper.a(customSystemException);
        }
        return this.a.equals(exceptionAnalyzer.n());
    }

    @Override
    public ExceptionAnalyzer r(int n) throws CustomRuntimeException {
        try {
            if (n == 0) {
                return this;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ReflectionClassMapper.a(customRuntimeException);
        }
        if (n > 0) {
            char[] cArray = new char[n];
            try {
                for (int i = 0; i < n; ++i) {
                    cArray[i] = 91;
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw ReflectionClassMapper.a(customRuntimeException);
            }
            String string = this.n();
            if (string.charAt(0) != '[') {
                string = "L" + string.replace('.', '/') + ";";
            }
            return new ReflectionClassMapper(new String(cArray) + string);
        }
        int n2 = 0;
        while (true) {
            block28: {
                try {
                    try {
                        if (n2 >= -n) break;
                        if (this.a.charAt(n2) == '[') break block28;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw ReflectionClassMapper.a(customRuntimeException);
                    }
                    throw new CustomRuntimeException("no " + n + " dimensional array type: " + this.n());
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw ReflectionClassMapper.a(customRuntimeException);
                }
            }
            ++n2;
        }
        n2 = this.a.charAt(-n);
        try {
            if (n2 == 91) {
                return new ReflectionClassMapper(this.a.substring(-n));
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ReflectionClassMapper.a(customRuntimeException);
        }
        try {
            if (n2 == 76) {
                return new ReflectionClassMapper(this.a.substring(-n + 1, this.a.length() - 1).replace('/', '.'));
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ReflectionClassMapper.a(customRuntimeException);
        }
        try {
            if (n2 == ElementConflictManager.u(W.w)) {
                return W.w;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ReflectionClassMapper.a(customRuntimeException);
        }
        try {
            if (n2 == ElementConflictManager.u(W.q)) {
                return W.q;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ReflectionClassMapper.a(customRuntimeException);
        }
        try {
            if (n2 == ElementConflictManager.u(W.Z)) {
                return W.Z;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ReflectionClassMapper.a(customRuntimeException);
        }
        return W.n;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public int C(BytecodeAnalyzer bytecodeAnalyzer) {
        return bytecodeAnalyzer.l(this.n());
    }

    public ReflectionClassMapper(String string) {
        this.a = string;
    }

    String j(Set<ExceptionAnalyzer> set) {
        return this.a;
    }
}

