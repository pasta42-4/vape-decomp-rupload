/*
 * Decompiled with CFR 0.152.
 */
package com.monitoring.diagnostics;

import com.app.security.crypto.CryptographicEncoder2712;
import com.bytecode.exception.BytecodeProcessingException;
import com.development.tools.DecompilationErrorHandler1089;

class DiagnosticEventRecorder {
    int R = 0;

    int v(String string, int n) throws BytecodeProcessingException {
        int n2 = string.indexOf(n, this.R);
        try {
            if (n2 < 0) {
                throw DecompilationErrorHandler1089.B(string);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw DiagnosticEventRecorder.a(bytecodeProcessingException);
        }
        this.R = n2 + 1;
        return n2;
    }

    private static BytecodeProcessingException a(BytecodeProcessingException bytecodeProcessingException) {
        return bytecodeProcessingException;
    }

    DiagnosticEventRecorder(CryptographicEncoder2712 cryptographicEncoder2712) {
        this();
    }

    private DiagnosticEventRecorder() {
    }
}

