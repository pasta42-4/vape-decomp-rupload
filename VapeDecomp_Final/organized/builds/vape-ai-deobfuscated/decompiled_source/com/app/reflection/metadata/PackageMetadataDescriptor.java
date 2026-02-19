/*
 * Decompiled with CFR 0.152.
 */
package com.app.reflection.metadata;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class PackageMetadataDescriptor
extends LogCompiler {
    int b;

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(20);
        dataOutputStream.writeShort(this.b);
    }

    public int hashCode() {
        return this.b;
    }

    public PackageMetadataDescriptor(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.b = dataInputStream.readUnsignedShort();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("Package #");
        printWriter.println(this.b);
    }

    public boolean equals(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(object instanceof PackageMetadataDescriptor) || ((PackageMetadataDescriptor)object).b != this.b) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PackageMetadataDescriptor.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw PackageMetadataDescriptor.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public int Q() {
        return 20;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        String string = bytecodeAnalyzer.Z(this.b);
        int n = bytecodeAnalyzer2.D(string);
        return bytecodeAnalyzer2.J(n);
    }
}

