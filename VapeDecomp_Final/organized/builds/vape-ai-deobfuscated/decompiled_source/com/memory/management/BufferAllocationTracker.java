/*
 * Decompiled with CFR 0.152.
 */
package com.memory.management;

import com.algorithm.processing.ComplexAlgorithmOrchestrator;
import com.deobfuscation.bytecode.StackMapDescriptor;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;

class BufferAllocationTracker
extends ComplexAlgorithmOrchestrator {
    private int q;
    private int v;

    @Override
    public int R(int n, int n2, int n3) {
        block6: {
            block5: {
                try {
                    if (this.v != n + n2) break block5;
                    ConfigurationManager2137.e(n2 - this.q, this.I, n - 4);
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw BufferAllocationTracker.a(customSystemException);
                }
            }
            try {
                if (this.v == n) {
                    ConfigurationManager2137.e(n2 + this.q, this.I, n - 4);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw BufferAllocationTracker.a(customSystemException);
            }
        }
        return super.R(n, n2, n3);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public BufferAllocationTracker(StackMapDescriptor stackMapDescriptor, int n, int n2) {
        super(stackMapDescriptor);
        this.v = n;
        this.q = n2;
    }
}

