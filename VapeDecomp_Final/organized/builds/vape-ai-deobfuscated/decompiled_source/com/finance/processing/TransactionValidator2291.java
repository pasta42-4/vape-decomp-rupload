/*
 * Decompiled with CFR 0.152.
 */
package com.finance.processing;

import com.bytecode.analysis.BytecodeMetadataExtractor1871;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.system.resource.ResourceAllocator2149;

class TransactionValidator2291
extends ResourceAllocator2149 {
    int y;
    int K;

    TransactionValidator2291(int n, int n2, int n3, int n4, int[] nArray, BytecodeMetadataExtractor1871 bytecodeMetadataExtractor1871) {
        super(n, n2, nArray, bytecodeMetadataExtractor1871);
        this.K = n3;
        this.y = n4;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    int q(int n, byte[] byArray) {
        ConfigurationManager2137.C(this.K, byArray, n);
        ConfigurationManager2137.C(this.y, byArray, n + 4);
        int n2 = this.T.length;
        n += 8;
        try {
            for (int i = 0; i < n2; ++i) {
                ConfigurationManager2137.C(this.T[i], byArray, n);
                n += 4;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TransactionValidator2291.a(customSystemException);
        }
        return 8 + 4 * n2;
    }

    int z() {
        return 8 + 4 * this.T.length;
    }
}

