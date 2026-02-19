/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.AttributeConstantResolver;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class BytecodeAnnotationExtractor {
    int L;
    BytecodeAnalyzer X;
    int M;
    String O;
    int G;
    List<ClassMetadataExtractor654> F;

    private BytecodeAnnotationExtractor(BytecodeAnalyzer bytecodeAnalyzer) {
        this.X = bytecodeAnalyzer;
        this.L = 0;
        this.F = null;
    }

    public String S() {
        return this.X.Z(this.M);
    }

    void y(BytecodeAnalyzer bytecodeAnalyzer) {
        this.G = bytecodeAnalyzer.D(this.Q());
        this.M = bytecodeAnalyzer.D(this.S());
        this.F = ClassMetadataExtractor654.X(this.F, bytecodeAnalyzer);
        this.X = bytecodeAnalyzer;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public String toString() {
        return this.Q() + " " + this.S();
    }

    public BytecodeAnalyzer H() {
        return this.X;
    }

    public ClassMetadataExtractor654 p(String string) {
        return ClassMetadataExtractor654.J(this.F, string);
    }

    void W(DataOutputStream dataOutputStream) throws IOException {
        block3: {
            block2: {
                try {
                    dataOutputStream.writeShort(this.L);
                    dataOutputStream.writeShort(this.G);
                    dataOutputStream.writeShort(this.M);
                    if (this.F != null) break block2;
                    dataOutputStream.writeShort(0);
                    break block3;
                }
                catch (IOException iOException) {
                    throw BytecodeAnnotationExtractor.a(iOException);
                }
            }
            dataOutputStream.writeShort(this.F.size());
            ClassMetadataExtractor654.E(this.F, dataOutputStream);
        }
    }

    public int w() {
        try {
            if ((this.L & 8) == 0) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnnotationExtractor.a(customSystemException);
        }
        AttributeConstantResolver attributeConstantResolver = (AttributeConstantResolver)this.p("ConstantValue");
        try {
            if (attributeConstantResolver == null) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnnotationExtractor.a(customSystemException);
        }
        return attributeConstantResolver.X();
    }

    BytecodeAnnotationExtractor(BytecodeAnalyzer bytecodeAnalyzer, DataInputStream dataInputStream) throws IOException {
        this(bytecodeAnalyzer);
        this.i(dataInputStream);
    }

    private void i(DataInputStream dataInputStream) throws IOException {
        this.L = dataInputStream.readUnsignedShort();
        this.G = dataInputStream.readUnsignedShort();
        this.M = dataInputStream.readUnsignedShort();
        int n = dataInputStream.readUnsignedShort();
        this.F = new ArrayList<ClassMetadataExtractor654>();
        try {
            for (int i = 0; i < n; ++i) {
                this.F.add(ClassMetadataExtractor654.R(this.X, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw BytecodeAnnotationExtractor.a(iOException);
        }
    }

    public int q() {
        return this.L;
    }

    public String Q() {
        try {
            if (this.O == null) {
                this.O = this.X.Z(this.G);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnnotationExtractor.a(customSystemException);
        }
        return this.O;
    }

    void T(BytecodeAnalyzer bytecodeAnalyzer) {
        int n;
        ClassMetadataExtractor654 classMetadataExtractor654;
        ClassMetadataExtractor654 classMetadataExtractor6542;
        ArrayList<ClassMetadataExtractor654> arrayList = new ArrayList<ClassMetadataExtractor654>();
        ClassMetadataExtractor654 classMetadataExtractor6543 = this.p("RuntimeInvisibleAnnotations");
        if (classMetadataExtractor6543 != null) {
            classMetadataExtractor6543 = classMetadataExtractor6543.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor6543);
        }
        if ((classMetadataExtractor6542 = this.p("RuntimeVisibleAnnotations")) != null) {
            classMetadataExtractor6542 = classMetadataExtractor6542.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor6542);
        }
        if ((classMetadataExtractor654 = this.p("Signature")) != null) {
            classMetadataExtractor654 = classMetadataExtractor654.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor654);
        }
        if ((n = this.w()) != 0) {
            n = this.X.X(n, bytecodeAnalyzer, null);
            arrayList.add(new AttributeConstantResolver(bytecodeAnalyzer, n));
        }
        this.F = arrayList;
        this.G = bytecodeAnalyzer.D(this.Q());
        this.M = bytecodeAnalyzer.D(this.S());
        this.X = bytecodeAnalyzer;
    }
}

