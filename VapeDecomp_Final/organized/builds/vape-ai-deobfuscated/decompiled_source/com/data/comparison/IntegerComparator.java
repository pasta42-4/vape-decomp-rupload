/*
 * Decompiled with CFR 0.152.
 */
package com.data.comparison;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class IntegerComparator
extends LogCompiler {
    int r;

    @Override
    public int Q() {
        return 3;
    }

    public IntegerComparator(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.r = dataInputStream.readInt();
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("Integer ");
        printWriter.println(this.r);
    }

    public IntegerComparator(int n, int n2) {
        super(n2);
        this.r = n;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.Y(this.r);
    }

    public int hashCode() {
        return this.r;
    }

    public boolean equals(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(object instanceof IntegerComparator) || ((IntegerComparator)object).r != this.r) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw IntegerComparator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw IntegerComparator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeInt(this.r);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

