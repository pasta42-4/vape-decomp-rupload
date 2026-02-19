/*
 * Decompiled with CFR 0.152.
 */
package com.dev.analysis;

import a.W;
import com.app.element.management.ElementConflictManager;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.core.exception.CustomRuntimeException;
import com.dataprocessing.resolution.TypeIdentificationResolver;
import com.dataprocessing.transformation.DataTransformationEngine1936;
import com.debugging.analysis.ExceptionAnalyzer;
import com.exception.system.CustomSystemException;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.mapping.ReflectionClassMapper;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CompilationErrorAnalyzer
extends DataTransformationEngine1936 {
    protected String k;
    protected List<ExceptionAnalyzer> r;
    private int g = 0;
    private boolean S;
    private boolean e = false;
    protected List<String> n = null;
    private int J = 0;
    private int t = 0;
    protected List<ExceptionAnalyzer> N = new ArrayList<ExceptionAnalyzer>(2);

    private MetaclassDefinitionRegistry q(List<ExceptionAnalyzer> list, ClassPoolRegistry classPoolRegistry, Set<ExceptionAnalyzer> set, MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CustomRuntimeException {
        try {
            if (list == null) {
                return metaclassDefinitionRegistry;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw CompilationErrorAnalyzer.a(customRuntimeException);
        }
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            CompilationErrorAnalyzer compilationErrorAnalyzer = (CompilationErrorAnalyzer)list.get(i);
            try {
                if (!set.add(compilationErrorAnalyzer)) {
                    return metaclassDefinitionRegistry;
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw CompilationErrorAnalyzer.a(customRuntimeException);
            }
            if (compilationErrorAnalyzer.n != null) {
                int n2 = compilationErrorAnalyzer.n.size();
                for (int j = 0; j < n2; ++j) {
                    MetaclassDefinitionRegistry metaclassDefinitionRegistry2 = classPoolRegistry.g(compilationErrorAnalyzer.n.get(j));
                    if (!metaclassDefinitionRegistry2.t(metaclassDefinitionRegistry)) continue;
                    metaclassDefinitionRegistry = metaclassDefinitionRegistry2;
                }
            }
            metaclassDefinitionRegistry = this.q(compilationErrorAnalyzer.r, classPoolRegistry, set, metaclassDefinitionRegistry);
        }
        return metaclassDefinitionRegistry;
    }

    @Override
    public int G() {
        try {
            if (this.k == null) {
                return this.N.get(0).G();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompilationErrorAnalyzer.a(customSystemException);
        }
        return super.G();
    }

    @Override
    public int C(BytecodeAnalyzer bytecodeAnalyzer) {
        try {
            if (this.k == null) {
                return this.N.get(0).C(bytecodeAnalyzer);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompilationErrorAnalyzer.a(customSystemException);
        }
        return super.C(bytecodeAnalyzer);
    }

    private static boolean p(MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CustomRuntimeException {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!metaclassDefinitionRegistry.p() || metaclassDefinitionRegistry.r().G() != null) break block4;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw CompilationErrorAnalyzer.a(customRuntimeException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw CompilationErrorAnalyzer.a(customRuntimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public ElementConflictManager Z() {
        try {
            if (this.k == null) {
                return this.N.get(0).Z();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompilationErrorAnalyzer.a(customSystemException);
        }
        return null;
    }

    @Override
    protected CompilationErrorAnalyzer I(int n) {
        this.g = n;
        return this;
    }

    @Override
    public boolean n() {
        try {
            if (this.k == null) {
                return this.S;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompilationErrorAnalyzer.a(customSystemException);
        }
        return false;
    }

    @Override
    public String n() {
        try {
            if (this.k == null) {
                return this.N.get(0).n();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompilationErrorAnalyzer.a(customSystemException);
        }
        return this.k;
    }

    /*
     * Exception decompiling
     */
    @Override
    public int N(List<ExceptionAnalyzer> var1_1, int var2_2, ClassPoolRegistry var3_3) throws CustomRuntimeException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [13[DOLOOP]], but top level block is 5[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void j(List<ExceptionAnalyzer> list, ExceptionAnalyzer exceptionAnalyzer) throws CustomRuntimeException {
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            CompilationErrorAnalyzer compilationErrorAnalyzer = (CompilationErrorAnalyzer)list.get(i);
            ExceptionAnalyzer exceptionAnalyzer2 = exceptionAnalyzer.r(-compilationErrorAnalyzer.g);
            try {
                if (exceptionAnalyzer2.Z() == null) {
                    compilationErrorAnalyzer.k = exceptionAnalyzer2.n();
                    continue;
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw CompilationErrorAnalyzer.a(customRuntimeException);
            }
            compilationErrorAnalyzer.N.clear();
            compilationErrorAnalyzer.N.add(exceptionAnalyzer2);
            compilationErrorAnalyzer.S = exceptionAnalyzer2.n();
        }
    }

    private String w(List<ExceptionAnalyzer> list, Set<String> set, ClassPoolRegistry classPoolRegistry) throws CustomRuntimeException {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry;
        block12: {
            Iterator<String> iterator = set.iterator();
            try {
                if (set.isEmpty()) {
                    return null;
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw CompilationErrorAnalyzer.a(customRuntimeException);
            }
            try {
                if (set.size() == 1) {
                    return iterator.next();
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw CompilationErrorAnalyzer.a(customRuntimeException);
            }
            metaclassDefinitionRegistry = classPoolRegistry.g(iterator.next());
            while (iterator.hasNext()) {
                metaclassDefinitionRegistry = CompilationErrorAnalyzer.f(metaclassDefinitionRegistry, classPoolRegistry.g(iterator.next()));
            }
            try {
                if (metaclassDefinitionRegistry.G() != null && !CompilationErrorAnalyzer.p(metaclassDefinitionRegistry)) break block12;
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw CompilationErrorAnalyzer.a(customRuntimeException);
            }
            metaclassDefinitionRegistry = this.q(list, classPoolRegistry, new HashSet<ExceptionAnalyzer>(), metaclassDefinitionRegistry);
        }
        try {
            if (metaclassDefinitionRegistry.p()) {
                return ReflectionMetadataResolver933.m(metaclassDefinitionRegistry);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw CompilationErrorAnalyzer.a(customRuntimeException);
        }
        return metaclassDefinitionRegistry.H();
    }

    @Override
    public void O(ExceptionAnalyzer exceptionAnalyzer) {
        try {
            this.N.add(exceptionAnalyzer);
            if (exceptionAnalyzer instanceof CompilationErrorAnalyzer) {
                ((CompilationErrorAnalyzer)exceptionAnalyzer).r.add(this);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompilationErrorAnalyzer.a(customSystemException);
        }
    }

    private void P(List<ExceptionAnalyzer> list, ClassPoolRegistry classPoolRegistry) throws CustomRuntimeException {
        block24: {
            HashSet<String> hashSet;
            block23: {
                hashSet = new HashSet<String>();
                boolean bl = false;
                ExceptionAnalyzer exceptionAnalyzer = null;
                int n = list.size();
                block16: for (int i = 0; i < n; ++i) {
                    CompilationErrorAnalyzer compilationErrorAnalyzer = (CompilationErrorAnalyzer)list.get(i);
                    List<ExceptionAnalyzer> list2 = compilationErrorAnalyzer.N;
                    int n2 = list2.size();
                    for (int j = 0; j < n2; ++j) {
                        ElementConflictManager elementConflictManager;
                        ExceptionAnalyzer exceptionAnalyzer2;
                        block21: {
                            block22: {
                                block19: {
                                    block20: {
                                        ExceptionAnalyzer exceptionAnalyzer3 = list2.get(j);
                                        exceptionAnalyzer2 = exceptionAnalyzer3.r(compilationErrorAnalyzer.g);
                                        elementConflictManager = exceptionAnalyzer2.Z();
                                        try {
                                            if (exceptionAnalyzer != null) break block19;
                                            if (elementConflictManager != null) break block20;
                                        }
                                        catch (CustomRuntimeException customRuntimeException) {
                                            throw CompilationErrorAnalyzer.a(customRuntimeException);
                                        }
                                        bl = false;
                                        exceptionAnalyzer = exceptionAnalyzer2;
                                        try {
                                            if (exceptionAnalyzer2.p()) {
                                                continue block16;
                                            }
                                            break block21;
                                        }
                                        catch (CustomRuntimeException customRuntimeException) {
                                            throw CompilationErrorAnalyzer.a(customRuntimeException);
                                        }
                                    }
                                    bl = true;
                                    exceptionAnalyzer = elementConflictManager;
                                    break block21;
                                }
                                try {
                                    try {
                                        try {
                                            if (elementConflictManager == null && bl) break block22;
                                        }
                                        catch (CustomRuntimeException customRuntimeException) {
                                            throw CompilationErrorAnalyzer.a(customRuntimeException);
                                        }
                                        if (elementConflictManager == null) break block21;
                                    }
                                    catch (CustomRuntimeException customRuntimeException) {
                                        throw CompilationErrorAnalyzer.a(customRuntimeException);
                                    }
                                    if (exceptionAnalyzer == elementConflictManager) break block21;
                                }
                                catch (CustomRuntimeException customRuntimeException) {
                                    throw CompilationErrorAnalyzer.a(customRuntimeException);
                                }
                            }
                            bl = true;
                            exceptionAnalyzer = W.C;
                            continue block16;
                        }
                        try {
                            try {
                                if (elementConflictManager != null || exceptionAnalyzer2.d()) continue;
                            }
                            catch (CustomRuntimeException customRuntimeException) {
                                throw CompilationErrorAnalyzer.a(customRuntimeException);
                            }
                            hashSet.add(exceptionAnalyzer2.n());
                            continue;
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw CompilationErrorAnalyzer.a(customRuntimeException);
                        }
                    }
                }
                try {
                    if (!bl) break block23;
                    this.S = exceptionAnalyzer.n();
                    this.j(list, exceptionAnalyzer);
                    break block24;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw CompilationErrorAnalyzer.a(customRuntimeException);
                }
            }
            String string = this.w(list, hashSet, classPoolRegistry);
            this.j(list, new ReflectionClassMapper(string));
        }
    }

    String j(Set<ExceptionAnalyzer> set) {
        block5: {
            set.add(this);
            if (this.N.size() > 0) {
                ExceptionAnalyzer exceptionAnalyzer = this.N.get(0);
                try {
                    try {
                        if (exceptionAnalyzer == null || set.contains(exceptionAnalyzer)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CompilationErrorAnalyzer.a(customSystemException);
                    }
                    return exceptionAnalyzer.j(set);
                }
                catch (CustomSystemException customSystemException) {
                    throw CompilationErrorAnalyzer.a(customSystemException);
                }
            }
        }
        return "?";
    }

    @Override
    public boolean p() {
        try {
            if (this.k == null) {
                return this.N.get(0).p();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompilationErrorAnalyzer.a(customSystemException);
        }
        return false;
    }

    @Override
    public boolean d() {
        try {
            if (this.k == null) {
                return this.N.get(0).d();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CompilationErrorAnalyzer.a(customSystemException);
        }
        return false;
    }

    @Override
    public void e(String string, ClassPoolRegistry classPoolRegistry) throws BytecodeProcessingException {
        try {
            if (this.n == null) {
                this.n = new ArrayList<String>();
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw CompilationErrorAnalyzer.a(bytecodeProcessingException);
        }
        this.n.add(string);
    }

    @Override
    public ExceptionAnalyzer r(int n) throws CustomRuntimeException {
        ElementConflictManager elementConflictManager;
        block7: {
            block8: {
                try {
                    if (n == 0) {
                        return this;
                    }
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw CompilationErrorAnalyzer.a(customRuntimeException);
                }
                elementConflictManager = this.Z();
                try {
                    try {
                        if (elementConflictManager != null) break block7;
                        if (!this.d()) break block8;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw CompilationErrorAnalyzer.a(customRuntimeException);
                    }
                    return new TypeIdentificationResolver();
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw CompilationErrorAnalyzer.a(customRuntimeException);
                }
            }
            return new ReflectionClassMapper(this.n()).r(n);
        }
        return elementConflictManager.r(n);
    }

    public CompilationErrorAnalyzer(ExceptionAnalyzer exceptionAnalyzer) {
        this.r = new ArrayList<ExceptionAnalyzer>(2);
        this.O(exceptionAnalyzer);
        this.k = null;
        this.S = exceptionAnalyzer.n();
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

