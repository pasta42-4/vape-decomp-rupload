/*
 * Decompiled with CFR 0.152.
 */
package com.data.streaming;

import com.bytecode.processing.BytecodeExceptionHandler;
import com.bytecode.verification.StackFrameValidator;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;

class StreamTransformationAgent
extends StackFrameValidator {
    int w;
    int N;

    @Override
    public void k(int n, int n2, int n3) {
        block4: {
            try {
                try {
                    if (n != 8 || this.N > n2) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamTransformationAgent.a(customSystemException);
                }
                ConfigurationManager2137.e(n2 + this.w, this.X, n3);
            }
            catch (CustomSystemException customSystemException) {
                throw StreamTransformationAgent.a(customSystemException);
            }
        }
    }

    public StreamTransformationAgent(BytecodeExceptionHandler bytecodeExceptionHandler, int n, int n2) {
        super(bytecodeExceptionHandler);
        this.N = n;
        this.w = n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

