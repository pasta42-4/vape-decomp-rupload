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

class DoubleValueComparator
extends LogCompiler {
    double r;

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.v(this.r);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public DoubleValueComparator(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.r = dataInputStream.readDouble();
    }

    public int hashCode() {
        long l = Double.doubleToLongBits(this.r);
        return (int)(l ^ l >>> 32);
    }

    public DoubleValueComparator(double d2, int n) {
        super(n);
        this.r = d2;
    }

    @Override
    public int Q() {
        return 6;
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(6);
        dataOutputStream.writeDouble(this.r);
    }

    public boolean equals(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(object instanceof DoubleValueComparator) || ((DoubleValueComparator)object).r != this.r) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DoubleValueComparator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DoubleValueComparator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("Double ");
        printWriter.println(this.r);
    }
}

