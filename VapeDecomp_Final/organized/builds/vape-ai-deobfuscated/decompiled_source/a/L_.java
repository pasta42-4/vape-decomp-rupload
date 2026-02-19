/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.io.formatting.PrintStreamFormatter;
import java.io.DataInputStream;
import java.io.IOException;

class L_
extends PrintStreamFormatter {
    @Override
    public int Q() {
        return 9;
    }

    public L_(DataInputStream dataInputStream, int n) throws IOException {
        super(dataInputStream, n);
    }

    @Override
    protected int M(BytecodeAnalyzer bytecodeAnalyzer, int n, int n2) {
        return bytecodeAnalyzer.v(n, n2);
    }

    @Override
    public String w() {
        return "Field";
    }

    public L_(int n, int n2, int n3) {
        super(n, n2, n3);
    }
}

