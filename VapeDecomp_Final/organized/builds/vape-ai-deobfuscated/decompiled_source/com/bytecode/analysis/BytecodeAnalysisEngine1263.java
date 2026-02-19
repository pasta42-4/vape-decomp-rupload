/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import com.app.configuration.management.ConfigurationStateTracker;
import com.bytecode.exception.BytecodeProcessingException;
import com.exception.system.CustomSystemException;

public class BytecodeAnalysisEngine1263 {
    protected boolean m;
    protected ConfigurationStateTracker B;
    protected int q;
    protected BytecodeAnalysisEngine1263[] s;
    protected int F;
    protected int C;

    /*
     * WARNING - void declaration
     */
    protected void J(StringBuilder stringBuilder) {
        void var2_4;
        stringBuilder.append("pos=").append(this.q).append(", len=").append(this.F).append(", in=").append(this.C).append(", exit{");
        if (this.s != null) {
            for (BytecodeAnalysisEngine1263 bytecodeAnalysisEngine1263 : this.s) {
                stringBuilder.append(bytecodeAnalysisEngine1263.q).append(',');
            }
        }
        stringBuilder.append("}, {");
        ConfigurationStateTracker configurationStateTracker = this.B;
        while (var2_4 != null) {
            stringBuilder.append('(').append(var2_4.G.q).append(", ").append(var2_4.e).append("), ");
            ConfigurationStateTracker configurationStateTracker2 = var2_4.B;
        }
        stringBuilder.append('}');
    }

    public static BytecodeAnalysisEngine1263 u(BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array, int n) throws BytecodeProcessingException {
        for (BytecodeAnalysisEngine1263 bytecodeAnalysisEngine1263 : bytecodeAnalysisEngine1263Array) {
            try {
                try {
                    if (bytecodeAnalysisEngine1263.q > n || n >= bytecodeAnalysisEngine1263.q + bytecodeAnalysisEngine1263.F) continue;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw BytecodeAnalysisEngine1263.b(bytecodeProcessingException);
                }
                return bytecodeAnalysisEngine1263;
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw BytecodeAnalysisEngine1263.b(bytecodeProcessingException);
            }
        }
        throw new BytecodeProcessingException("no basic block at " + n);
    }

    protected BytecodeAnalysisEngine1263(int n) {
        this.q = n;
        this.F = 0;
        this.C = 0;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        String string2 = this.getClass().getName();
        int n = string2.lastIndexOf(46);
        try {
            stringBuilder = stringBuilder2;
            string = n < 0 ? string2 : string2.substring(n + 1);
        }
        catch (CustomSystemException customSystemException) {
            throw BytecodeAnalysisEngine1263.b(customSystemException);
        }
        stringBuilder.append(string);
        stringBuilder2.append('[');
        this.J(stringBuilder2);
        stringBuilder2.append(']');
        return stringBuilder2.toString();
    }

    private static Exception b(Exception exception) {
        return exception;
    }
}

