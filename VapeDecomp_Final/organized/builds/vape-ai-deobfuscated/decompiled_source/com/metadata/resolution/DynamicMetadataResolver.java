/*
 * Decompiled with CFR 0.152.
 */
package com.metadata.resolution;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class DynamicMetadataResolver
extends LogCompiler {
    int y;
    int Q;

    public int hashCode() {
        return this.y << 16 ^ this.Q;
    }

    public DynamicMetadataResolver(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.y = dataInputStream.readUnsignedShort();
        this.Q = dataInputStream.readUnsignedShort();
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.B(this.y, bytecodeAnalyzer.b(this.Q).H(bytecodeAnalyzer, bytecodeAnalyzer2, map));
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("Dynamic #");
        printWriter.print(this.y);
        printWriter.print(", name&type #");
        printWriter.println(this.Q);
    }

    public DynamicMetadataResolver(int n, int n2, int n3) {
        super(n3);
        this.y = n;
        this.Q = n2;
    }

    public boolean equals(Object object) {
        if (object instanceof DynamicMetadataResolver) {
            boolean bl;
            block6: {
                block5: {
                    DynamicMetadataResolver dynamicMetadataResolver = (DynamicMetadataResolver)object;
                    try {
                        try {
                            if (dynamicMetadataResolver.y != this.y || dynamicMetadataResolver.Q != this.Q) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicMetadataResolver.a(customSystemException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicMetadataResolver.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public int Q() {
        return 17;
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(17);
        dataOutputStream.writeShort(this.y);
        dataOutputStream.writeShort(this.Q);
    }
}

