/*
 * Decompiled with CFR 0.152.
 */
package com.ui.layout;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class StyleLayoutCalculator
extends LogCompiler {
    public StyleLayoutCalculator(int n) {
        super(n);
    }

    @Override
    public int Q() {
        return 0;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.k();
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.println("padding");
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
    }
}

