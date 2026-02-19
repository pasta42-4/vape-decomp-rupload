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

class OutputStreamFormatter
extends LogCompiler {
    String R;

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("UTF8 \"");
        printWriter.print(this.R);
        printWriter.println("\"");
    }

    public boolean equals(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(object instanceof OutputStreamFormatter) || !((OutputStreamFormatter)object).R.equals(this.R)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw OutputStreamFormatter.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw OutputStreamFormatter.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public OutputStreamFormatter(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.R = dataInputStream.readUTF();
    }

    public int hashCode() {
        return this.R.hashCode();
    }

    @Override
    public int Q() {
        return 1;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(1);
        dataOutputStream.writeUTF(this.R);
    }

    public OutputStreamFormatter(String string, int n) {
        super(n);
        this.R = string;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.D(this.R);
    }
}

