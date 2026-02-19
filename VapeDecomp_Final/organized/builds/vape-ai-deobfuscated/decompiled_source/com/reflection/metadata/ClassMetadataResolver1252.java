/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import com.reflection.metadata.ReflectionMetadataResolver933;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class ClassMetadataResolver1252
extends LogCompiler {
    int q;
    int D;

    @Override
    public int Q() {
        return 12;
    }

    public boolean equals(Object object) {
        if (object instanceof ClassMetadataResolver1252) {
            boolean bl;
            block6: {
                block5: {
                    ClassMetadataResolver1252 classMetadataResolver1252 = (ClassMetadataResolver1252)object;
                    try {
                        try {
                            if (classMetadataResolver1252.D != this.D || classMetadataResolver1252.q != this.q) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ClassMetadataResolver1252.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClassMetadataResolver1252.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("NameAndType #");
        printWriter.print(this.D);
        printWriter.print(", type #");
        printWriter.println(this.q);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(12);
        dataOutputStream.writeShort(this.D);
        dataOutputStream.writeShort(this.q);
    }

    public ClassMetadataResolver1252(int n, int n2, int n3) {
        super(n3);
        this.D = n;
        this.q = n2;
    }

    public ClassMetadataResolver1252(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.D = dataInputStream.readUnsignedShort();
        this.q = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.D << 16 ^ this.q;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        String string = bytecodeAnalyzer.Z(this.D);
        String string2 = bytecodeAnalyzer.Z(this.q);
        string2 = ReflectionMetadataResolver933.z(string2, map);
        return bytecodeAnalyzer2.N(bytecodeAnalyzer2.D(string), bytecodeAnalyzer2.D(string2));
    }
}

