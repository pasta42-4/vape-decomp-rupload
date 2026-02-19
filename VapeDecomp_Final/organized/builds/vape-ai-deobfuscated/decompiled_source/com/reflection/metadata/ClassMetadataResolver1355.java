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

class ClassMetadataResolver1355
extends LogCompiler {
    int Z;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ClassMetadataResolver1355(int n, int n2) {
        super(n2);
        this.Z = n;
    }

    public ClassMetadataResolver1355(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.Z = dataInputStream.readUnsignedShort();
    }

    public boolean equals(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(object instanceof ClassMetadataResolver1355) || ((ClassMetadataResolver1355)object).Z != this.Z) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ClassMetadataResolver1355.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ClassMetadataResolver1355.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public int Q() {
        return 7;
    }

    public int hashCode() {
        return this.Z;
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("Class #");
        printWriter.println(this.Z);
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(7);
        dataOutputStream.writeShort(this.Z);
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        String string;
        String string2 = bytecodeAnalyzer.Z(this.Z);
        if (map != null && (string = map.get(string2)) != null) {
            string2 = string;
        }
        return bytecodeAnalyzer2.l(string2);
    }
}

