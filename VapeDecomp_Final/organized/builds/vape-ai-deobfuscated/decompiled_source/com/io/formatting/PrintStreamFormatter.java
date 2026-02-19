/*
 * Decompiled with CFR 0.152.
 */
package com.io.formatting;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

abstract class PrintStreamFormatter
extends LogCompiler {
    int d;
    int D;

    protected abstract int M(BytecodeAnalyzer var1, int var2, int var3);

    public boolean equals(Object object) {
        if (object instanceof PrintStreamFormatter) {
            boolean bl;
            block8: {
                block7: {
                    PrintStreamFormatter printStreamFormatter = (PrintStreamFormatter)object;
                    try {
                        try {
                            try {
                                if (printStreamFormatter.D != this.D || printStreamFormatter.d != this.d) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PrintStreamFormatter.a(customSystemException);
                            }
                            if (printStreamFormatter.getClass() != this.getClass()) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PrintStreamFormatter.a(customSystemException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PrintStreamFormatter.a(customSystemException);
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
        printWriter.print(this.w() + " #");
        printWriter.print(this.D);
        printWriter.print(", name&type #");
        printWriter.println(this.d);
    }

    public PrintStreamFormatter(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.D = dataInputStream.readUnsignedShort();
        this.d = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.D << 16 ^ this.d;
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.Q());
        dataOutputStream.writeShort(this.D);
        dataOutputStream.writeShort(this.d);
    }

    public abstract String w();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public PrintStreamFormatter(int n, int n2, int n3) {
        super(n3);
        this.D = n;
        this.d = n2;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        int n = bytecodeAnalyzer.b(this.D).H(bytecodeAnalyzer, bytecodeAnalyzer2, map);
        int n2 = bytecodeAnalyzer.b(this.d).H(bytecodeAnalyzer, bytecodeAnalyzer2, map);
        return this.M(bytecodeAnalyzer2, n, n2);
    }
}

