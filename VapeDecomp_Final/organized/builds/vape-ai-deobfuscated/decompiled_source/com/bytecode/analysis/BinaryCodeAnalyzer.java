/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import com.app.input.InputProcessor2508;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.processing.BytecodeExceptionHandler;
import com.data.persistence.PersistenceCollectionManager;
import com.deobfuscation.bytecode.StackMapDescriptor;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ClassMetadataExtractor654;
import com.transaction.management.TransactionStrategyResolver;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BinaryCodeAnalyzer
extends ClassMetadataExtractor654
implements TransactionStrategyResolver {
    private int E;
    private List<ClassMetadataExtractor654> T;
    private PersistenceCollectionManager p;
    private int J;

    @Override
    public void p(byte[] byArray) {
        throw new UnsupportedOperationException("CodeAttribute.set()");
    }

    @Override
    public byte[] p() {
        throw new UnsupportedOperationException("CodeAttribute.get()");
    }

    /*
     * Exception decompiling
     */
    private static InputProcessor2508 b(byte[] var0, int var1_1, int var2_2, BytecodeAnalyzer var3_3, byte[] var4_4, BytecodeAnalyzer var5_5, Map<String, String> var6_6) throws BytecodeProcessingException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[SWITCH]
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

    public PersistenceCollectionManager u() {
        return this.p;
    }

    public BinaryCodeAnalyzer(BytecodeAnalyzer bytecodeAnalyzer, int n, int n2, byte[] byArray, PersistenceCollectionManager persistenceCollectionManager) {
        super(bytecodeAnalyzer, "Code");
        this.E = n;
        this.J = n2;
        this.b = byArray;
        this.p = persistenceCollectionManager;
        this.T = new ArrayList<ClassMetadataExtractor654>();
    }

    public int i() {
        return this.J;
    }

    public ClassMetadataExtractor654 G(String string) {
        return ClassMetadataExtractor654.J(this.T, string);
    }

    public void D(int n) {
        this.E = n;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void l(BytecodeExceptionHandler bytecodeExceptionHandler) {
        try {
            ClassMetadataExtractor654.e(this.T, "StackMapTable");
            if (bytecodeExceptionHandler != null) {
                this.T.add(bytecodeExceptionHandler);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BinaryCodeAnalyzer.a(customSystemException);
        }
    }

    @Override
    public int Y() {
        return 18 + this.b.length + this.p.w() * 8 + ClassMetadataExtractor654.N(this.T);
    }

    public String S() {
        BytecodeAnalyzer bytecodeAnalyzer = this.K();
        return bytecodeAnalyzer.j();
    }

    void f(byte[] byArray) {
        super.p(byArray);
    }

    @Override
    public ClassMetadataExtractor654 O(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map) throws CustomSystemException {
        try {
            return new BinaryCodeAnalyzer(bytecodeAnalyzer, this, map);
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new CustomSystemException("bad bytecode. fatal?");
        }
    }

    private BinaryCodeAnalyzer(BytecodeAnalyzer bytecodeAnalyzer, BinaryCodeAnalyzer binaryCodeAnalyzer, Map<String, String> map) throws BytecodeProcessingException {
        super(bytecodeAnalyzer, "Code");
        this.E = binaryCodeAnalyzer.Q();
        this.J = binaryCodeAnalyzer.i();
        this.p = binaryCodeAnalyzer.u().z(bytecodeAnalyzer, map);
        this.T = new ArrayList<ClassMetadataExtractor654>();
        List<ClassMetadataExtractor654> list = binaryCodeAnalyzer.w();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            ClassMetadataExtractor654 classMetadataExtractor654 = list.get(i);
            this.T.add(classMetadataExtractor654.O(bytecodeAnalyzer, map));
        }
        this.b = binaryCodeAnalyzer.l(bytecodeAnalyzer, map, this.p, this);
    }

    public void J(int n) {
        this.J = n;
    }

    void f(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.z);
        dataOutputStream.writeInt(this.Y() - 6);
        dataOutputStream.writeShort(this.E);
        dataOutputStream.writeShort(this.J);
        dataOutputStream.writeInt(this.b.length);
        dataOutputStream.write(this.b);
        this.p.j(dataOutputStream);
        dataOutputStream.writeShort(this.T.size());
        ClassMetadataExtractor654.E(this.T, dataOutputStream);
    }

    public int O() {
        return this.b.length;
    }

    private static void S(int n, byte[] byArray, BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray2, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        int n2 = (byArray[n] & 0xFF) << 8 | byArray[n + 1] & 0xFF;
        n2 = bytecodeAnalyzer.X(n2, bytecodeAnalyzer2, map);
        byArray2[n] = (byte)(n2 >> 8);
        byArray2[n + 1] = (byte)n2;
    }

    public byte[] X() {
        return this.b;
    }

    public List<ClassMetadataExtractor654> w() {
        return this.T;
    }

    BinaryCodeAnalyzer(BytecodeAnalyzer bytecodeAnalyzer, int n, DataInputStream dataInputStream) throws IOException {
        super(bytecodeAnalyzer, n, (byte[])null);
        int n2 = dataInputStream.readInt();
        this.E = dataInputStream.readUnsignedShort();
        this.J = dataInputStream.readUnsignedShort();
        int n3 = dataInputStream.readInt();
        this.b = new byte[n3];
        dataInputStream.readFully(this.b);
        this.p = new PersistenceCollectionManager(bytecodeAnalyzer, dataInputStream);
        this.T = new ArrayList<ClassMetadataExtractor654>();
        int n4 = dataInputStream.readUnsignedShort();
        try {
            for (int i = 0; i < n4; ++i) {
                this.T.add(ClassMetadataExtractor654.R(bytecodeAnalyzer, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw BinaryCodeAnalyzer.a(iOException);
        }
    }

    private byte[] l(BytecodeAnalyzer bytecodeAnalyzer, Map<String, String> map, PersistenceCollectionManager persistenceCollectionManager, BinaryCodeAnalyzer binaryCodeAnalyzer) throws BytecodeProcessingException {
        int n = this.O();
        byte[] byArray = new byte[n];
        binaryCodeAnalyzer.b = byArray;
        InputProcessor2508 inputProcessor2508 = BinaryCodeAnalyzer.b(this.b, 0, n, this.K(), byArray, bytecodeAnalyzer, map);
        return InputProcessor2508.I(byArray, inputProcessor2508, persistenceCollectionManager, binaryCodeAnalyzer);
    }

    public int Q() {
        return this.E;
    }

    public void N(StackMapDescriptor stackMapDescriptor) {
        try {
            ClassMetadataExtractor654.e(this.T, "StackMap");
            if (stackMapDescriptor != null) {
                this.T.add(stackMapDescriptor);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BinaryCodeAnalyzer.a(customSystemException);
        }
    }

    public BytecodeAnalysisEngine305 h() {
        return new BytecodeAnalysisEngine305(this);
    }
}

