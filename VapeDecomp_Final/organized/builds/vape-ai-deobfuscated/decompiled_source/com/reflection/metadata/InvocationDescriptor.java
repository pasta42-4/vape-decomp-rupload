/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class InvocationDescriptor
extends LogCompiler {
    int V;
    int l;

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(18);
        dataOutputStream.writeShort(this.V);
        dataOutputStream.writeShort(this.l);
    }

    @Override
    public int Q() {
        return 18;
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("InvokeDynamic #");
        printWriter.print(this.V);
        printWriter.print(", name&type #");
        printWriter.println(this.l);
    }

    public int hashCode() {
        return this.V << 16 ^ this.l;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public InvocationDescriptor(int n, int n2, int n3) {
        super(n3);
        this.V = n;
        this.l = n2;
    }

    public InvocationDescriptor(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.V = dataInputStream.readUnsignedShort();
        this.l = dataInputStream.readUnsignedShort();
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.P(this.V, bytecodeAnalyzer.b(this.l).H(bytecodeAnalyzer, bytecodeAnalyzer2, map));
    }

    public boolean equals(Object object) {
        if (object instanceof InvocationDescriptor) {
            boolean bl;
            block6: {
                block5: {
                    InvocationDescriptor invocationDescriptor = (InvocationDescriptor)object;
                    try {
                        try {
                            if (invocationDescriptor.V != this.V || invocationDescriptor.l != this.l) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw InvocationDescriptor.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw InvocationDescriptor.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }
}

