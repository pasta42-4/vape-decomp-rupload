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

class LongValueComparator
extends LogCompiler {
    long l;

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.h(this.l);
    }

    public int hashCode() {
        return (int)(this.l ^ this.l >>> 32);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public int Q() {
        return 5;
    }

    public LongValueComparator(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.l = dataInputStream.readLong();
    }

    public LongValueComparator(long l, int n) {
        super(n);
        this.l = l;
    }

    public boolean equals(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(object instanceof LongValueComparator) || ((LongValueComparator)object).l != this.l) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw LongValueComparator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw LongValueComparator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("Long ");
        printWriter.println(this.l);
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(5);
        dataOutputStream.writeLong(this.l);
    }
}

