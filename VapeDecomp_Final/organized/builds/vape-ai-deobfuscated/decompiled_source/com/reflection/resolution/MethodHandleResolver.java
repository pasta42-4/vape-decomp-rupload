/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.resolution;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class MethodHandleResolver
extends LogCompiler {
    int L;
    int w;

    public MethodHandleResolver(int n, int n2, int n3) {
        super(n3);
        this.w = n;
        this.L = n2;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.X(this.w, bytecodeAnalyzer.b(this.L).H(bytecodeAnalyzer, bytecodeAnalyzer2, map));
    }

    @Override
    public int Q() {
        return 15;
    }

    public int hashCode() {
        return this.w << 16 ^ this.L;
    }

    public MethodHandleResolver(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.w = dataInputStream.readUnsignedByte();
        this.L = dataInputStream.readUnsignedShort();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("MethodHandle #");
        printWriter.print(this.w);
        printWriter.print(", index #");
        printWriter.println(this.L);
    }

    public boolean equals(Object object) {
        if (object instanceof MethodHandleResolver) {
            boolean bl;
            block6: {
                block5: {
                    MethodHandleResolver methodHandleResolver = (MethodHandleResolver)object;
                    try {
                        try {
                            if (methodHandleResolver.w != this.w || methodHandleResolver.L != this.L) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MethodHandleResolver.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MethodHandleResolver.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(15);
        dataOutputStream.writeByte(this.w);
        dataOutputStream.writeShort(this.L);
    }
}

