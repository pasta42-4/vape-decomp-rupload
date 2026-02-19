/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.i5;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.data.collection.CollectionOrchestrator1895;
import com.resource.management.ResourceLifecycleManager1859;
import java.util.List;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class Hx
extends CollectionOrchestrator1895 {
    public List<Object> Z;
    public List<Object> D;
    public int f;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private Hx() {
        super(-1);
    }

    public Hx(int n, int n2, Object[] objectArray, int n3, Object[] objectArray2) {
        super(-1);
        this.f = n;
        switch (n) {
            case -1: 
            case 0: {
                this.D = i5.L(n2, objectArray);
                this.Z = i5.L(n3, objectArray2);
                break;
            }
            case 1: {
                this.D = i5.L(n2, objectArray);
                break;
            }
            case 2: {
                this.D = i5.T(n2);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                this.Z = i5.L(1, objectArray2);
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    private static Object[] x(List<Object> list) {
        Object[] objectArray = new Object[list.size()];
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object object = list.get(i);
            if (object instanceof ResourceLifecycleManager1859) {
                object = ((ResourceLifecycleManager1859)object).i();
            }
            objectArray[i] = object;
        }
        return objectArray;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void T(BytecodeInstrumentationEngine var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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
}

