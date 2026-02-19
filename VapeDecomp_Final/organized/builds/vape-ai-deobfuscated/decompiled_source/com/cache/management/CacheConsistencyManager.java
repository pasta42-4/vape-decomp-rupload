/*
 * Decompiled with CFR 0.152.
 */
package com.cache.management;

import com.bytecode.processing.BytecodeExceptionHandler;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import com.resource.management.ResourceAllocationStrategy;

class CacheConsistencyManager
extends ResourceAllocationStrategy {
    CacheConsistencyManager(BytecodeExceptionHandler bytecodeExceptionHandler, int n, int n2) {
        super(bytecodeExceptionHandler, n, n2, false);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    void R(int n, int n2) {
        int n3;
        int n4;
        int n5 = this.o;
        try {
            CacheConsistencyManager cacheConsistencyManager = this;
            n4 = n5 + n2;
            n3 = n5 == 0 ? 0 : 1;
        }
        catch (CustomSystemException customSystemException) {
            throw CacheConsistencyManager.a(customSystemException);
        }
        cacheConsistencyManager.o = n4 + n3;
        int n6 = n2;
        if (this.v == this.o) {
            n6 = n2 - this.h;
        } else if (this.v == n5) {
            n6 = n2 + this.h;
        } else {
            return;
        }
        ConfigurationManager2137.e(n6, this.X, n + 1);
    }

    static byte[] w(byte[] byArray, int n, int n2) {
        n += n2;
        int n3 = byArray.length;
        byte[] byArray2 = new byte[n3 - n2];
        int n4 = 0;
        while (true) {
            block6: {
                int n5;
                block5: {
                    try {
                        try {
                            if (n4 >= n3) break;
                            byte[] byArray3 = byArray2;
                            int n6 = n4;
                            if (n4 >= n) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CacheConsistencyManager.a(customSystemException);
                        }
                        n5 = 0;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CacheConsistencyManager.a(customSystemException);
                    }
                }
                n5 = n2;
            }
            byArray3[n6 - n5] = byArray[n4];
            ++n4;
        }
        return byArray2;
    }

    void w(int n, int n2, int n3, int n4) {
        block14: {
            int n5;
            block12: {
                block13: {
                    int n6;
                    int n7;
                    int n8 = this.o;
                    try {
                        CacheConsistencyManager cacheConsistencyManager = this;
                        n7 = n8 + n2;
                        n6 = n8 == 0 ? 0 : 1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CacheConsistencyManager.a(customSystemException);
                    }
                    cacheConsistencyManager.o = n7 + n6;
                    n5 = n2;
                    if (this.v == this.o) {
                        n5 = n2 - this.h;
                    } else if (this.v == n8) {
                        n5 = n2 + this.h;
                    } else {
                        return;
                    }
                    try {
                        try {
                            if (n2 >= 64) break block12;
                            if (n5 >= 64) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CacheConsistencyManager.a(customSystemException);
                        }
                        this.X[n] = (byte)(n5 + n3);
                        break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CacheConsistencyManager.a(customSystemException);
                    }
                }
                byte[] byArray = CacheConsistencyManager.T(this.X, n, 2);
                byArray[n] = (byte)n4;
                ConfigurationManager2137.e(n5, byArray, n + 1);
                this.H = byArray;
                break block14;
            }
            if (n5 < 64) {
                byte[] byArray = CacheConsistencyManager.w(this.X, n, 2);
                byArray[n] = (byte)(n5 + n3);
                this.H = byArray;
            } else {
                ConfigurationManager2137.e(n5, this.X, n + 1);
            }
        }
    }
}

