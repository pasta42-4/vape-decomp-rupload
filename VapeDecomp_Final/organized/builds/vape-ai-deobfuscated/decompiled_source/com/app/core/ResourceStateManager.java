/*
 * Decompiled with CFR 0.152.
 */
package com.app.core;

import com.bytecode.analysis.BytecodeMetadataExtractor1871;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.system.resource.ResourceAllocator2149;

class ResourceStateManager
extends ResourceAllocator2149 {
    int[] A;

    int z() {
        return 4 + 8 * this.A.length;
    }

    ResourceStateManager(int n, int n2, int[] nArray, int[] nArray2, BytecodeMetadataExtractor1871 bytecodeMetadataExtractor1871) {
        super(n, n2, nArray2, bytecodeMetadataExtractor1871);
        this.A = nArray;
    }

    int q(int n, byte[] byArray) {
        int n2 = this.A.length;
        ConfigurationManager2137.C(n2, byArray, n);
        n += 4;
        try {
            for (int i = 0; i < n2; ++i) {
                ConfigurationManager2137.C(this.A[i], byArray, n);
                ConfigurationManager2137.C(this.T[i], byArray, n + 4);
                n += 8;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceStateManager.a(customSystemException);
        }
        return 4 + 8 * n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

