/*
 * Decompiled with CFR 0.152.
 */
package com.system.reflection;

import com.app.element.management.ElementConflictManager;
import com.bytecode.exception.BytecodeProcessingException;
import com.core.exception.CustomRuntimeException;
import com.dataprocessing.transformation.DataTransformationEngine1936;
import com.debugging.analysis.ExceptionAnalyzer;
import com.dev.analysis.CompilationErrorAnalyzer;
import com.diagnostics.error.ExceptionTracker;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.mapping.ReflectionClassMapper;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ClassPathTraverser
extends DataTransformationEngine1936 {
    private DataTransformationEngine1936 Y;

    @Override
    protected CompilationErrorAnalyzer I(int n) {
        return this.Y.I(n + 1);
    }

    @Override
    public ExceptionAnalyzer r(int n) throws CustomRuntimeException {
        return this.Y.r(n + 1);
    }

    @Override
    public ElementConflictManager Z() {
        return null;
    }

    public DataTransformationEngine1936 v() {
        return this.Y;
    }

    @Override
    public String n() {
        return ClassPathTraverser.N(this.Y.n());
    }

    String j(Set<ExceptionAnalyzer> set) {
        return "[" + this.Y.j(set);
    }

    @Override
    public int N(List<ExceptionAnalyzer> list, int n, ClassPoolRegistry classPoolRegistry) throws CustomRuntimeException {
        return this.Y.N(list, n, classPoolRegistry);
    }

    public static String N(String string) {
        try {
            if (string.charAt(0) == '[') {
                return "[" + string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ClassPathTraverser.a(runtimeException);
        }
        return "[L" + string.replace('.', '/') + ";";
    }

    @Override
    public void e(String string, ClassPoolRegistry classPoolRegistry) throws BytecodeProcessingException {
        this.Y.e(ExceptionTracker.S(string), classPoolRegistry);
    }

    @Override
    public void O(ExceptionAnalyzer exceptionAnalyzer) {
        try {
            try {
                if (!exceptionAnalyzer.d()) {
                    this.Y.O(ExceptionTracker.B(exceptionAnalyzer));
                }
            }
            catch (RuntimeException runtimeException) {
                throw ClassPathTraverser.a(runtimeException);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new RuntimeException("fatal: " + bytecodeProcessingException);
        }
    }

    static ExceptionAnalyzer s(ExceptionAnalyzer exceptionAnalyzer) throws BytecodeProcessingException {
        block10: {
            try {
                if (exceptionAnalyzer instanceof ExceptionTracker) {
                    return ((ExceptionTracker)exceptionAnalyzer).K();
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ClassPathTraverser.a(bytecodeProcessingException);
            }
            try {
                if (exceptionAnalyzer instanceof DataTransformationEngine1936) {
                    return new ClassPathTraverser((DataTransformationEngine1936)exceptionAnalyzer);
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ClassPathTraverser.a(bytecodeProcessingException);
            }
            try {
                try {
                    if (!(exceptionAnalyzer instanceof ReflectionClassMapper) || exceptionAnalyzer.d()) break block10;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw ClassPathTraverser.a(bytecodeProcessingException);
                }
                return new ReflectionClassMapper(ClassPathTraverser.N(exceptionAnalyzer.n()));
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ClassPathTraverser.a(bytecodeProcessingException);
            }
        }
        throw new BytecodeProcessingException("bad AASTORE: " + exceptionAnalyzer);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private ClassPathTraverser(DataTransformationEngine1936 dataTransformationEngine1936) {
        this.Y = dataTransformationEngine1936;
    }

    @Override
    public boolean n() {
        return false;
    }
}

