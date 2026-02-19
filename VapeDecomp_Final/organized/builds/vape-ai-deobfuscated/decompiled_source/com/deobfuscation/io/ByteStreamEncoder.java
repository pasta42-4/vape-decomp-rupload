/*
 * Decompiled with CFR 0.152.
 */
package com.deobfuscation.io;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.deobfuscation.bytecode.StackMapDescriptor;
import com.exception.system.CustomSystemException;
import java.io.ByteArrayOutputStream;

public class ByteStreamEncoder {
    private ByteArrayOutputStream d = new ByteArrayOutputStream();

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public StackMapDescriptor G(BytecodeAnalyzer bytecodeAnalyzer) {
        return new StackMapDescriptor(bytecodeAnalyzer, this.d.toByteArray());
    }

    public void R(int n, int n2) {
        block4: {
            try {
                try {
                    this.d.write(n);
                    if (n != 7 && n != 8) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ByteStreamEncoder.a(customSystemException);
                }
                this.v(n2);
            }
            catch (CustomSystemException customSystemException) {
                throw ByteStreamEncoder.a(customSystemException);
            }
        }
    }

    public void v(int n) {
        this.d.write(n >>> 8 & 0xFF);
        this.d.write(n & 0xFF);
    }
}

