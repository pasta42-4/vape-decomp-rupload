/*
 * Decompiled with CFR 0.152.
 */
package com.debugging.analysis;

import a.W;
import com.app.element.management.ElementConflictManager;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.core.computation.AbstractComputationKernel;
import com.core.exception.CustomRuntimeException;
import com.dataprocessing.transformation.DataTransformationEngine1936;
import com.dev.analysis.CompilationErrorAnalyzer;
import com.diagnostics.error.ExceptionTracker;
import com.exception.system.CustomSystemException;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.mapping.ReflectionClassMapper;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.system.reflection.ClassPathTraverser;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ExceptionAnalyzer {
    private static AbstractComputationKernel[] L;

    public boolean p() {
        return false;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public static MetaclassDefinitionRegistry f(MetaclassDefinitionRegistry metaclassDefinitionRegistry, MetaclassDefinitionRegistry metaclassDefinitionRegistry2) throws CustomRuntimeException {
        block23: {
            block22: {
                block21: {
                    String string;
                    ClassPoolRegistry classPoolRegistry;
                    try {
                        if (metaclassDefinitionRegistry == metaclassDefinitionRegistry2) {
                            return metaclassDefinitionRegistry;
                        }
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw ExceptionAnalyzer.b(customRuntimeException);
                    }
                    try {
                        if (!metaclassDefinitionRegistry.p() || !metaclassDefinitionRegistry2.p()) break block21;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw ExceptionAnalyzer.b(customRuntimeException);
                    }
                    MetaclassDefinitionRegistry metaclassDefinitionRegistry3 = metaclassDefinitionRegistry.r();
                    MetaclassDefinitionRegistry metaclassDefinitionRegistry4 = metaclassDefinitionRegistry2.r();
                    MetaclassDefinitionRegistry metaclassDefinitionRegistry5 = ExceptionAnalyzer.f(metaclassDefinitionRegistry3, metaclassDefinitionRegistry4);
                    try {
                        if (metaclassDefinitionRegistry5 == metaclassDefinitionRegistry3) {
                            return metaclassDefinitionRegistry;
                        }
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw ExceptionAnalyzer.b(customRuntimeException);
                    }
                    try {
                        if (metaclassDefinitionRegistry5 == metaclassDefinitionRegistry4) {
                            return metaclassDefinitionRegistry2;
                        }
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw ExceptionAnalyzer.b(customRuntimeException);
                    }
                    try {
                        classPoolRegistry = metaclassDefinitionRegistry.K();
                        string = metaclassDefinitionRegistry5 == null ? "java.lang.Object" : metaclassDefinitionRegistry5.H() + "[]";
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw ExceptionAnalyzer.b(customRuntimeException);
                    }
                    return classPoolRegistry.g(string);
                }
                try {
                    try {
                        if (!metaclassDefinitionRegistry.m() && !metaclassDefinitionRegistry2.m()) break block22;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw ExceptionAnalyzer.b(customRuntimeException);
                    }
                    return null;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw ExceptionAnalyzer.b(customRuntimeException);
                }
            }
            try {
                try {
                    if (!metaclassDefinitionRegistry.p() && !metaclassDefinitionRegistry2.p()) break block23;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw ExceptionAnalyzer.b(customRuntimeException);
                }
                return metaclassDefinitionRegistry.K().g("java.lang.Object");
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw ExceptionAnalyzer.b(customRuntimeException);
            }
        }
        return ExceptionAnalyzer.l(metaclassDefinitionRegistry, metaclassDefinitionRegistry2);
    }

    protected ExceptionAnalyzer() {
    }

    abstract String j(Set<ExceptionAnalyzer> var1);

    public abstract String n();

    public abstract int C(BytecodeAnalyzer var1);

    public abstract void e(String var1, ClassPoolRegistry var2) throws BytecodeProcessingException;

    public static void g(ExceptionAnalyzer exceptionAnalyzer, ExceptionAnalyzer exceptionAnalyzer2, ClassPoolRegistry classPoolRegistry) throws BytecodeProcessingException {
        block11: {
            block13: {
                block12: {
                    block10: {
                        try {
                            try {
                                if (!(exceptionAnalyzer instanceof DataTransformationEngine1936) || exceptionAnalyzer2.d()) break block10;
                            }
                            catch (BytecodeProcessingException bytecodeProcessingException) {
                                throw ExceptionAnalyzer.b(bytecodeProcessingException);
                            }
                            ((DataTransformationEngine1936)exceptionAnalyzer).O(ClassPathTraverser.s(exceptionAnalyzer2));
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw ExceptionAnalyzer.b(bytecodeProcessingException);
                        }
                    }
                    try {
                        try {
                            if (!(exceptionAnalyzer2 instanceof DataTransformationEngine1936)) break block11;
                            if (!(exceptionAnalyzer instanceof DataTransformationEngine1936)) break block12;
                        }
                        catch (BytecodeProcessingException bytecodeProcessingException) {
                            throw ExceptionAnalyzer.b(bytecodeProcessingException);
                        }
                        ExceptionTracker.B(exceptionAnalyzer);
                        break block11;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw ExceptionAnalyzer.b(bytecodeProcessingException);
                    }
                }
                try {
                    if (!(exceptionAnalyzer instanceof ReflectionClassMapper)) break block13;
                    if (exceptionAnalyzer.d()) break block11;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw ExceptionAnalyzer.b(bytecodeProcessingException);
                }
                String string = ExceptionTracker.S(exceptionAnalyzer.n());
                exceptionAnalyzer2.e(string, classPoolRegistry);
                break block11;
            }
            throw new BytecodeProcessingException("bad AASTORE: " + exceptionAnalyzer);
        }
    }

    public abstract ElementConflictManager Z();

    public boolean d() {
        return false;
    }

    public int N(List<ExceptionAnalyzer> list, int n, ClassPoolRegistry classPoolRegistry) throws CustomRuntimeException {
        return n;
    }

    public void j(int n) {
    }

    public ExceptionAnalyzer c() {
        return new CompilationErrorAnalyzer(this);
    }

    public abstract int G();

    public abstract boolean n();

    public static ExceptionAnalyzer[] i(int n) {
        ExceptionAnalyzer[] exceptionAnalyzerArray = new ExceptionAnalyzer[n];
        try {
            for (int i = 0; i < n; ++i) {
                exceptionAnalyzerArray[i] = W.C;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExceptionAnalyzer.b(customSystemException);
        }
        return exceptionAnalyzerArray;
    }

    public abstract boolean o(ExceptionAnalyzer var1);

    public static MetaclassDefinitionRegistry l(MetaclassDefinitionRegistry metaclassDefinitionRegistry, MetaclassDefinitionRegistry metaclassDefinitionRegistry2) throws CustomRuntimeException {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry3;
        MetaclassDefinitionRegistry metaclassDefinitionRegistry4 = metaclassDefinitionRegistry;
        MetaclassDefinitionRegistry metaclassDefinitionRegistry5 = metaclassDefinitionRegistry3 = metaclassDefinitionRegistry2;
        MetaclassDefinitionRegistry metaclassDefinitionRegistry6 = metaclassDefinitionRegistry4;
        while (true) {
            block12: {
                try {
                    try {
                        if (!ExceptionAnalyzer.K(metaclassDefinitionRegistry4, metaclassDefinitionRegistry3) || metaclassDefinitionRegistry4.G() == null) break block12;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw ExceptionAnalyzer.b(customRuntimeException);
                    }
                    return metaclassDefinitionRegistry4;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw ExceptionAnalyzer.b(customRuntimeException);
                }
            }
            MetaclassDefinitionRegistry metaclassDefinitionRegistry7 = metaclassDefinitionRegistry4.G();
            MetaclassDefinitionRegistry metaclassDefinitionRegistry8 = metaclassDefinitionRegistry3.G();
            if (metaclassDefinitionRegistry8 == null) {
                metaclassDefinitionRegistry3 = metaclassDefinitionRegistry5;
                break;
            }
            if (metaclassDefinitionRegistry7 == null) {
                metaclassDefinitionRegistry4 = metaclassDefinitionRegistry6;
                metaclassDefinitionRegistry6 = metaclassDefinitionRegistry5;
                metaclassDefinitionRegistry5 = metaclassDefinitionRegistry4;
                metaclassDefinitionRegistry4 = metaclassDefinitionRegistry3;
                metaclassDefinitionRegistry3 = metaclassDefinitionRegistry5;
                break;
            }
            metaclassDefinitionRegistry4 = metaclassDefinitionRegistry7;
            metaclassDefinitionRegistry3 = metaclassDefinitionRegistry8;
        }
        while (true) {
            metaclassDefinitionRegistry4 = metaclassDefinitionRegistry4.G();
            try {
                if (metaclassDefinitionRegistry4 == null) {
                    break;
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw ExceptionAnalyzer.b(customRuntimeException);
            }
            metaclassDefinitionRegistry6 = metaclassDefinitionRegistry6.G();
        }
        metaclassDefinitionRegistry4 = metaclassDefinitionRegistry6;
        while (!ExceptionAnalyzer.K(metaclassDefinitionRegistry4, metaclassDefinitionRegistry3)) {
            metaclassDefinitionRegistry4 = metaclassDefinitionRegistry4.G();
            metaclassDefinitionRegistry3 = metaclassDefinitionRegistry3.G();
        }
        return metaclassDefinitionRegistry4;
    }

    public static void x(AbstractComputationKernel[] abstractComputationKernelArray) {
        L = abstractComputationKernelArray;
    }

    static boolean K(MetaclassDefinitionRegistry metaclassDefinitionRegistry, MetaclassDefinitionRegistry metaclassDefinitionRegistry2) {
        boolean bl;
        block10: {
            block9: {
                try {
                    block8: {
                        try {
                            try {
                                try {
                                    if (metaclassDefinitionRegistry == metaclassDefinitionRegistry2) break block8;
                                    if (metaclassDefinitionRegistry == null) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ExceptionAnalyzer.b(customSystemException);
                                }
                                if (metaclassDefinitionRegistry2 == null) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ExceptionAnalyzer.b(customSystemException);
                            }
                            if (!metaclassDefinitionRegistry.H().equals(metaclassDefinitionRegistry2.H())) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ExceptionAnalyzer.b(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw ExceptionAnalyzer.b(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static AbstractComputationKernel[] v() {
        return L;
    }

    public String toString() {
        return super.toString() + "(" + this.j(new HashSet<ExceptionAnalyzer>()) + ")";
    }

    public abstract ExceptionAnalyzer r(int var1) throws CustomRuntimeException;

    protected CompilationErrorAnalyzer I(int n) {
        return null;
    }

    static {
        if (ExceptionAnalyzer.v() == null) {
            ExceptionAnalyzer.x(new AbstractComputationKernel[4]);
        }
    }
}

