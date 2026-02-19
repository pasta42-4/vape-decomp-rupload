/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import com.app.diagnostics.ExceptionLogger;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionUtility;
import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.processing.BytecodeExceptionHandler;
import com.deobfuscation.bytecode.StackMapDescriptor;
import com.diagnostics.error.ExceptionDiagnosticHandler;
import com.exception.system.CustomSystemException;
import com.metadata.parsing.MetadataExtractor1468;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ClassMetadataExtractor;
import com.reflection.metadata.ClassMetadataExtractor654;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BytecodeInspectionEngine {
    int r;
    BytecodeAnalyzer c;
    String D;
    int G;
    List<ClassMetadataExtractor654> b;
    int z;
    public static boolean N = false;

    public void l(ClassMetadataExtractor654 classMetadataExtractor654) {
        try {
            if (this.b == null) {
                this.b = new ArrayList<ClassMetadataExtractor654>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeInspectionEngine.a(customSystemException);
        }
        ClassMetadataExtractor654.e(this.b, classMetadataExtractor654.n());
        this.b.add(classMetadataExtractor654);
    }

    public ClassMetadataExtractor654 j(String string) {
        return ClassMetadataExtractor654.J(this.b, string);
    }

    public void q(ClassPoolRegistry classPoolRegistry) throws BytecodeProcessingException {
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.Z();
        if (binaryCodeAnalyzer != null) {
            BytecodeExceptionHandler bytecodeExceptionHandler = ExceptionDiagnosticHandler.v(classPoolRegistry, this);
            binaryCodeAnalyzer.l(bytecodeExceptionHandler);
        }
    }

    public BinaryCodeAnalyzer Z() {
        ClassMetadataExtractor654 classMetadataExtractor654 = ClassMetadataExtractor654.J(this.b, "Code");
        return (BinaryCodeAnalyzer)classMetadataExtractor654;
    }

    public boolean O() {
        return this.C().equals("<init>");
    }

    public void u(BinaryCodeAnalyzer binaryCodeAnalyzer) {
        try {
            this.c();
            if (this.b == null) {
                this.b = new ArrayList<ClassMetadataExtractor654>();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeInspectionEngine.a(customSystemException);
        }
        this.b.add(binaryCodeAnalyzer);
    }

    public void D(int n) {
        this.r = n;
    }

    public String C() {
        try {
            if (this.D == null) {
                this.D = this.c.Z(this.z);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeInspectionEngine.a(customSystemException);
        }
        return this.D;
    }

    public void M(ClassPoolRegistry classPoolRegistry) throws BytecodeProcessingException {
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.Z();
        if (binaryCodeAnalyzer != null) {
            StackMapDescriptor stackMapDescriptor = ExceptionDiagnosticHandler.I(classPoolRegistry, this);
            binaryCodeAnalyzer.N(stackMapDescriptor);
        }
    }

    public void c() {
        ClassMetadataExtractor654.e(this.b, "Code");
    }

    void E(BytecodeAnalyzer bytecodeAnalyzer) {
        this.z = bytecodeAnalyzer.D(this.C());
        this.G = bytecodeAnalyzer.D(this.b());
        this.b = ClassMetadataExtractor654.X(this.b, bytecodeAnalyzer);
        this.c = bytecodeAnalyzer;
    }

    public int i(int n) {
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.Z();
        try {
            if (binaryCodeAnalyzer == null) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeInspectionEngine.a(customSystemException);
        }
        BytecodeInspectionUtility bytecodeInspectionUtility = (BytecodeInspectionUtility)binaryCodeAnalyzer.G("LineNumberTable");
        try {
            if (bytecodeInspectionUtility == null) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeInspectionEngine.a(customSystemException);
        }
        return bytecodeInspectionUtility.m(n);
    }

    public void w(ClassPoolRegistry classPoolRegistry, ClassMetadataExtractor classMetadataExtractor) throws BytecodeProcessingException {
        try {
            if (classMetadataExtractor.k() >= 50) {
                this.q(classPoolRegistry);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeInspectionEngine.a(bytecodeProcessingException);
        }
        try {
            if (N) {
                this.M(classPoolRegistry);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw BytecodeInspectionEngine.a(bytecodeProcessingException);
        }
    }

    private void F(DataInputStream dataInputStream) throws IOException {
        this.r = dataInputStream.readUnsignedShort();
        this.z = dataInputStream.readUnsignedShort();
        this.G = dataInputStream.readUnsignedShort();
        int n = dataInputStream.readUnsignedShort();
        this.b = new ArrayList<ClassMetadataExtractor654>();
        try {
            for (int i = 0; i < n; ++i) {
                this.b.add(ClassMetadataExtractor654.R(this.c, dataInputStream));
            }
        }
        catch (IOException iOException) {
            throw BytecodeInspectionEngine.a(iOException);
        }
    }

    void t(DataOutputStream dataOutputStream) throws IOException {
        block3: {
            block2: {
                try {
                    dataOutputStream.writeShort(this.r);
                    dataOutputStream.writeShort(this.z);
                    dataOutputStream.writeShort(this.G);
                    if (this.b != null) break block2;
                    dataOutputStream.writeShort(0);
                    break block3;
                }
                catch (IOException iOException) {
                    throw BytecodeInspectionEngine.a(iOException);
                }
            }
            dataOutputStream.writeShort(this.b.size());
            ClassMetadataExtractor654.E(this.b, dataOutputStream);
        }
    }

    public BytecodeInspectionEngine(BytecodeAnalyzer bytecodeAnalyzer, String string, String string2) {
        this(bytecodeAnalyzer);
        this.r = 0;
        this.z = bytecodeAnalyzer.D(string);
        this.D = string;
        this.G = this.c.D(string2);
    }

    public boolean R() {
        return this.C().equals("<clinit>");
    }

    BytecodeInspectionEngine(BytecodeAnalyzer bytecodeAnalyzer, DataInputStream dataInputStream) throws IOException {
        this(bytecodeAnalyzer);
        this.F(dataInputStream);
    }

    public ExceptionLogger I() {
        ClassMetadataExtractor654 classMetadataExtractor654 = ClassMetadataExtractor654.J(this.b, "Exceptions");
        return (ExceptionLogger)classMetadataExtractor654;
    }

    public String b() {
        return this.c.Z(this.G);
    }

    void Q(BytecodeAnalyzer bytecodeAnalyzer) {
        ClassMetadataExtractor654 classMetadataExtractor654;
        ClassMetadataExtractor654 classMetadataExtractor6542;
        ClassMetadataExtractor654 classMetadataExtractor6543;
        ArrayList<ClassMetadataExtractor654> arrayList = new ArrayList<ClassMetadataExtractor654>();
        ClassMetadataExtractor654 classMetadataExtractor6544 = this.j("RuntimeInvisibleAnnotations");
        if (classMetadataExtractor6544 != null) {
            classMetadataExtractor6544 = classMetadataExtractor6544.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor6544);
        }
        if ((classMetadataExtractor6543 = this.j("RuntimeVisibleAnnotations")) != null) {
            classMetadataExtractor6543 = classMetadataExtractor6543.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor6543);
        }
        if ((classMetadataExtractor6542 = this.j("RuntimeInvisibleParameterAnnotations")) != null) {
            classMetadataExtractor6542 = classMetadataExtractor6542.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor6542);
        }
        if ((classMetadataExtractor654 = this.j("RuntimeVisibleParameterAnnotations")) != null) {
            classMetadataExtractor654 = classMetadataExtractor654.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor654);
        }
        MetadataExtractor1468 metadataExtractor1468 = (MetadataExtractor1468)this.j("AnnotationDefault");
        try {
            if (metadataExtractor1468 != null) {
                arrayList.add(metadataExtractor1468);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeInspectionEngine.a(customSystemException);
        }
        ExceptionLogger exceptionLogger = this.I();
        try {
            if (exceptionLogger != null) {
                arrayList.add(exceptionLogger);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeInspectionEngine.a(customSystemException);
        }
        ClassMetadataExtractor654 classMetadataExtractor6545 = this.j("Signature");
        if (classMetadataExtractor6545 != null) {
            classMetadataExtractor6545 = classMetadataExtractor6545.O(bytecodeAnalyzer, null);
            arrayList.add(classMetadataExtractor6545);
        }
        this.b = arrayList;
        this.z = bytecodeAnalyzer.D(this.C());
        this.G = bytecodeAnalyzer.D(this.b());
        this.c = bytecodeAnalyzer;
    }

    public int Z() {
        return this.r;
    }

    private BytecodeInspectionEngine(BytecodeAnalyzer bytecodeAnalyzer) {
        this.c = bytecodeAnalyzer;
        this.b = null;
    }

    public BytecodeAnalyzer v() {
        return this.c;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public boolean F() {
        boolean bl;
        block5: {
            block4: {
                String string = this.C();
                try {
                    try {
                        if (string.equals("<init>") || string.equals("<clinit>")) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw BytecodeInspectionEngine.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw BytecodeInspectionEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public String toString() {
        return this.C() + " " + this.b();
    }
}

