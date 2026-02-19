/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import com.bytecode.analysis.BytecodeMetadataExtractor1871;
import com.bytecode.exception.BytecodeProcessingException;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.system.configuration.ConfigurationManager2254;

abstract class ResourceAllocator2149
extends ConfigurationManager2254 {
    BytecodeMetadataExtractor1871 U;
    int i;
    int G;
    int[] T;

    void e(int n, int n2) throws BytecodeProcessingException {
        try {
            this.U.d(this.p + n, n2);
            if (this.G == n) {
                this.G -= n2;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ResourceAllocator2149.a(bytecodeProcessingException);
        }
        int n3 = 0;
        while (true) {
            block8: {
                try {
                    try {
                        if (n3 >= this.T.length) break;
                        if (this.T[n3] != n) break block8;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw ResourceAllocator2149.a(bytecodeProcessingException);
                    }
                    int n4 = n3;
                    this.T[n4] = this.T[n4] - n2;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw ResourceAllocator2149.a(bytecodeProcessingException);
                }
            }
            ++n3;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    abstract int z();

    int S() {
        int n = 3 - (this.p & 3);
        if (n > this.i) {
            int n2 = n - this.i;
            this.i = n;
            return n2;
        }
        return 0;
    }

    void w(int n, int n2, boolean bl) {
        int n3 = this.p;
        this.G = ResourceAllocator2149.g(n3, this.G, n, n2, bl);
        int n4 = this.T.length;
        try {
            for (int i = 0; i < n4; ++i) {
                this.T[i] = ResourceAllocator2149.g(n3, this.T[i], n, n2, bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocator2149.a(customSystemException);
        }
        super.w(n, n2, bl);
    }

    int g(int n, byte[] byArray, int n2, byte[] byArray2) throws BytecodeProcessingException {
        int n3 = 3 - (this.p & 3);
        int n4 = this.i - n3;
        int n5 = 5 + (3 - (this.R & 3)) + this.z();
        try {
            if (n4 > 0) {
                this.e(n5, n4);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ResourceAllocator2149.a(bytecodeProcessingException);
        }
        byArray2[n2++] = byArray[n];
        try {
            while (n3-- > 0) {
                byArray2[n2++] = 0;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ResourceAllocator2149.a(bytecodeProcessingException);
        }
        ConfigurationManager2137.C(this.G, byArray2, n2);
        int n6 = this.q(n2 + 4, byArray2);
        n2 += n6 + 4;
        try {
            while (n4-- > 0) {
                byArray2[n2++] = 0;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ResourceAllocator2149.a(bytecodeProcessingException);
        }
        return 5 + (3 - (this.R & 3)) + n6;
    }

    int W() {
        return this.i - (3 - (this.R & 3));
    }

    abstract int q(int var1, byte[] var2);

    ResourceAllocator2149(int n, int n2, int[] nArray, BytecodeMetadataExtractor1871 bytecodeMetadataExtractor1871) {
        super(n);
        this.i = 3 - (n & 3);
        this.G = n2;
        this.T = nArray;
        this.U = bytecodeMetadataExtractor1871;
    }
}

