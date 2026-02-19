/*
 * Decompiled with CFR 0.152.
 */
package com.diagnostics.error;

import com.app.element.management.ElementConflictManager;
import com.bytecode.exception.BytecodeProcessingException;
import com.core.exception.CustomRuntimeException;
import com.dataprocessing.transformation.DataTransformationEngine1936;
import com.debugging.analysis.ExceptionAnalyzer;
import com.dev.analysis.CompilationErrorAnalyzer;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.mapping.ReflectionClassMapper;
import com.system.reflection.ClassPathTraverser;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ExceptionTracker
extends DataTransformationEngine1936 {
    private DataTransformationEngine1936 X;

    @Override
    public String n() {
        return ExceptionTracker.f(this.X.n());
    }

    private ExceptionTracker(DataTransformationEngine1936 dataTransformationEngine1936) {
        this.X = dataTransformationEngine1936;
    }

    @Override
    public int N(List<ExceptionAnalyzer> list, int n, ClassPoolRegistry classPoolRegistry) throws CustomRuntimeException {
        return this.X.N(list, n, classPoolRegistry);
    }

    @Override
    public void O(ExceptionAnalyzer exceptionAnalyzer) {
        try {
            try {
                if (!exceptionAnalyzer.d()) {
                    this.X.O(ClassPathTraverser.s(exceptionAnalyzer));
                }
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionTracker.a(runtimeException);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new RuntimeException("fatal: " + bytecodeProcessingException);
        }
    }

    String j(Set<ExceptionAnalyzer> set) {
        return "*" + this.X.j(set);
    }

    private static String f(String string) {
        block8: {
            try {
                if (string.length() <= 1 || string.charAt(0) != '[') break block8;
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionTracker.a(runtimeException);
            }
            char c = string.charAt(1);
            try {
                if (c == 'L') {
                    return string.substring(2, string.length() - 1).replace('/', '.');
                }
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionTracker.a(runtimeException);
            }
            try {
                if (c == '[') {
                    return string.substring(1);
                }
            }
            catch (RuntimeException runtimeException) {
                throw ExceptionTracker.a(runtimeException);
            }
        }
        return "java.lang.Object";
    }

    @Override
    protected CompilationErrorAnalyzer I(int n) {
        return this.X.I(n - 1);
    }

    @Override
    public boolean n() {
        return false;
    }

    public static ExceptionAnalyzer B(ExceptionAnalyzer exceptionAnalyzer) throws BytecodeProcessingException {
        block10: {
            try {
                if (exceptionAnalyzer instanceof ClassPathTraverser) {
                    return ((ClassPathTraverser)exceptionAnalyzer).v();
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ExceptionTracker.a(bytecodeProcessingException);
            }
            try {
                if (exceptionAnalyzer instanceof DataTransformationEngine1936) {
                    return new ExceptionTracker((DataTransformationEngine1936)exceptionAnalyzer);
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ExceptionTracker.a(bytecodeProcessingException);
            }
            try {
                try {
                    if (!(exceptionAnalyzer instanceof ReflectionClassMapper) || exceptionAnalyzer.d()) break block10;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw ExceptionTracker.a(bytecodeProcessingException);
                }
                return new ReflectionClassMapper(ExceptionTracker.f(exceptionAnalyzer.n()));
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw ExceptionTracker.a(bytecodeProcessingException);
            }
        }
        throw new BytecodeProcessingException("bad AASTORE: " + exceptionAnalyzer);
    }

    static String S(String string) {
        return ExceptionTracker.f(string);
    }

    @Override
    public ExceptionAnalyzer r(int n) throws CustomRuntimeException {
        return this.X.r(n - 1);
    }

    @Override
    public void e(String string, ClassPoolRegistry classPoolRegistry) throws BytecodeProcessingException {
        this.X.e(ClassPathTraverser.N(string), classPoolRegistry);
    }

    @Override
    public ElementConflictManager Z() {
        return null;
    }

    public DataTransformationEngine1936 K() {
        return this.X;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

