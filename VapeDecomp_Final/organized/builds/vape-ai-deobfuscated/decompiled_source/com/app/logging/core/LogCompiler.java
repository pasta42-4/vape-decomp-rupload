/*
 * Decompiled with CFR 0.152.
 */
package com.app.logging.core;

import com.bytecode.analysis.BytecodeAnalyzer;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

abstract class LogCompiler {
    int f;

    public abstract void k(DataOutputStream var1) throws IOException;

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        this.u(printWriter);
        return byteArrayOutputStream.toString();
    }

    public abstract int Q();

    public LogCompiler(int n) {
        this.f = n;
    }

    public abstract int H(BytecodeAnalyzer var1, BytecodeAnalyzer var2, Map<String, String> var3);

    public abstract void u(PrintWriter var1);
}

