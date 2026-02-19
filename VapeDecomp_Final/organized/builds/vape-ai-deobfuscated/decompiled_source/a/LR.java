/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.io.formatting.PrintStreamFormatter;
import java.io.DataInputStream;
import java.io.IOException;

class LR
extends PrintStreamFormatter {
    @Override
    public String w() {
        return "Method";
    }

    @Override
    protected int M(BytecodeAnalyzer bytecodeAnalyzer, int n, int n2) {
        return bytecodeAnalyzer.a(n, n2);
    }

    public LR(DataInputStream dataInputStream, int n) throws IOException {
        super(dataInputStream, n);
    }

    @Override
    public int Q() {
        return 10;
    }

    public LR(int n, int n2, int n3) {
        super(n, n2, n3);
    }
}

