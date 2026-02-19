/*
 * Decompiled with CFR 0.152.
 */
package com.data.compression;

import com.algorithm.processing.ComplexAlgorithmOrchestrator;
import com.deobfuscation.bytecode.StackMapDescriptor;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;

class AdaptiveCompressionEngine1681
extends ComplexAlgorithmOrchestrator {
    private int C;
    private boolean l;
    private int K;

    public AdaptiveCompressionEngine1681(StackMapDescriptor stackMapDescriptor, int n, int n2, boolean bl) {
        super(stackMapDescriptor);
        this.C = n;
        this.K = n2;
        this.l = bl;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int R(int var1_1, int var2_2, int var3_3) {
        block8: {
            block7: {
                try {
                    try {
                        if (!this.l) break block7;
                        if (this.C > var2_2) break block8;
                        ** GOTO lbl13
                    }
                    catch (CustomSystemException v0) {
                        throw AdaptiveCompressionEngine1681.a(v0);
                    }
                }
                catch (CustomSystemException v1) {
                    throw AdaptiveCompressionEngine1681.a(v1);
                }
            }
            try {
                if (this.C >= var2_2) break block8;
lbl13:
                // 2 sources

                ConfigurationManager2137.e(var2_2 + this.K, this.I, var1_1 - 4);
            }
            catch (CustomSystemException v2) {
                throw AdaptiveCompressionEngine1681.a(v2);
            }
        }
        return super.R(var1_1, var2_2, var3_3);
    }

    @Override
    public void H(int n, int n2) {
        try {
            if (this.C <= n2) {
                ConfigurationManager2137.e(n2 + this.K, this.I, n + 1);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCompressionEngine1681.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

