/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.io.formatting.PrintStreamFormatter;
import java.io.DataInputStream;
import java.io.IOException;

class LM
extends PrintStreamFormatter {
    @Override
    public int Q() {
        return 11;
    }

    public LM(DataInputStream dataInputStream, int n) throws IOException {
        super(dataInputStream, n);
    }

    @Override
    protected int M(BytecodeAnalyzer bytecodeAnalyzer, int n, int n2) {
        return bytecodeAnalyzer.l(n, n2);
    }

    public LM(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    public String w() {
        return "Interface";
    }
}

