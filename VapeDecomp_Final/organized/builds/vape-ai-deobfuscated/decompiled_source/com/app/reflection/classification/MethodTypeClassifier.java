/*
 * Decompiled with CFR 0.152.
 */
package com.app.reflection.classification;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver933;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class MethodTypeClassifier
extends LogCompiler {
    int p;

    public MethodTypeClassifier(int n, int n2) {
        super(n2);
        this.p = n;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        String string = bytecodeAnalyzer.Z(this.p);
        string = ReflectionMetadataResolver933.z(string, map);
        return bytecodeAnalyzer2.s(bytecodeAnalyzer2.D(string));
    }

    @Override
    public int Q() {
        return 16;
    }

    public MethodTypeClassifier(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.p = dataInputStream.readUnsignedShort();
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(16);
        dataOutputStream.writeShort(this.p);
    }

    public int hashCode() {
        return this.p;
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("MethodType #");
        printWriter.println(this.p);
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    try {
                        try {
                            if (!(object instanceof MethodTypeClassifier)) break block4;
                            if (((MethodTypeClassifier)object).p != this.p) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MethodTypeClassifier.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MethodTypeClassifier.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }
}

