/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.processing.BytecodeExceptionHandler;
import com.bytecode.verification.StackFrameValidator;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;

class ResourceAllocationStrategy
extends StackFrameValidator {
    int v;
    byte[] H;
    static final boolean r;
    boolean p;
    int h;
    int o;
    private BytecodeExceptionHandler j;

    static {
        boolean bl;
        try {
            bl = !BytecodeExceptionHandler.class.desiredAssertionStatus();
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceAllocationStrategy.a(customSystemException);
        }
        r = bl;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void g(int n, int n2, int n3) {
        this.R(n, n2);
    }

    public void s() throws BytecodeProcessingException {
        try {
            this.c();
            if (this.H != null) {
                this.j.p(this.H);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw ResourceAllocationStrategy.a(bytecodeProcessingException);
        }
    }

    static byte[] T(byte[] byArray, int n, int n2) {
        byte[] byArray2;
        block11: {
            int n3;
            block13: {
                block12: {
                    block10: {
                        n3 = byArray.length;
                        byArray2 = new byte[n3 + n2];
                        try {
                            if (n > 0) break block10;
                            System.arraycopy(byArray, 0, byArray2, n2, n3);
                            break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationStrategy.a(customSystemException);
                        }
                    }
                    try {
                        if (n < n3) break block12;
                        System.arraycopy(byArray, 0, byArray2, 0, n3);
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationStrategy.a(customSystemException);
                    }
                }
                try {
                    block14: {
                        try {
                            try {
                                if (r) break block13;
                                if (n <= 0) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationStrategy.a(customSystemException);
                            }
                            if (n < n3) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationStrategy.a(customSystemException);
                        }
                    }
                    throw new AssertionError();
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationStrategy.a(customSystemException);
                }
            }
            System.arraycopy(byArray, 0, byArray2, 0, n);
            System.arraycopy(byArray, n, byArray2, n + n2, n3 - n);
        }
        return byArray2;
    }

    public ResourceAllocationStrategy(BytecodeExceptionHandler bytecodeExceptionHandler, int n, int n2, boolean bl) {
        super(bytecodeExceptionHandler);
        this.j = bytecodeExceptionHandler;
        this.v = n;
        this.h = n2;
        this.o = 0;
        this.H = null;
        this.p = bl;
    }

    @Override
    public void h(int n, int n2, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        this.R(n, n2);
    }

    void w(int n, int n2, int n3, int n4) {
        block29: {
            boolean bl;
            block27: {
                boolean bl2;
                block26: {
                    int n5;
                    block21: {
                        boolean bl3;
                        block25: {
                            block24: {
                                int n6;
                                int n7;
                                n5 = this.o;
                                try {
                                    ResourceAllocationStrategy resourceAllocationStrategy = this;
                                    n7 = n5 + n2;
                                    n6 = n5 == 0 ? 0 : 1;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationStrategy.a(customSystemException);
                                }
                                try {
                                    block23: {
                                        try {
                                            try {
                                                block22: {
                                                    try {
                                                        try {
                                                            resourceAllocationStrategy.o = n7 + n6;
                                                            if (!this.p) break block21;
                                                            if (n5 != 0) break block22;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ResourceAllocationStrategy.a(customSystemException);
                                                        }
                                                        if (this.v == 0) break block23;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ResourceAllocationStrategy.a(customSystemException);
                                                    }
                                                }
                                                if (n5 >= this.v) break block24;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceAllocationStrategy.a(customSystemException);
                                            }
                                            if (this.v > this.o) break block24;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocationStrategy.a(customSystemException);
                                        }
                                    }
                                    bl3 = true;
                                    break block25;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceAllocationStrategy.a(customSystemException);
                                }
                            }
                            bl3 = false;
                        }
                        bl = bl3;
                        break block27;
                    }
                    try {
                        try {
                            if (n5 > this.v || this.v >= this.o) break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationStrategy.a(customSystemException);
                        }
                        bl2 = true;
                        break block27;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationStrategy.a(customSystemException);
                    }
                }
                bl2 = bl = false;
            }
            if (bl) {
                int n8;
                block30: {
                    int n9;
                    block28: {
                        n9 = this.X[n] & 0xFF;
                        n8 = n2 + this.h;
                        try {
                            this.o += this.h;
                            if (n8 >= 64) break block28;
                            this.X[n] = (byte)(n8 + n3);
                            break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceAllocationStrategy.a(customSystemException);
                        }
                    }
                    try {
                        if (n2 >= 64 || n9 == n4) break block30;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationStrategy.a(customSystemException);
                    }
                    byte[] byArray = ResourceAllocationStrategy.T(this.X, n, 2);
                    byArray[n] = (byte)n4;
                    ConfigurationManager2137.e(n8, byArray, n + 1);
                    this.H = byArray;
                    break block29;
                }
                ConfigurationManager2137.e(n8, this.X, n + 1);
            }
        }
    }

    @Override
    public void D(int n, int n2, int n3, int n4) {
        this.w(n, n2, 64, 247);
    }

    @Override
    public void l(int n, int n2, int[] nArray, int[] nArray2) {
        this.R(n, n2);
    }

    @Override
    public void V(int n, int n2) {
        this.w(n, n2, 0, 251);
    }

    void R(int n, int n2) {
        boolean bl;
        block23: {
            boolean bl2;
            block22: {
                int n3;
                block17: {
                    boolean bl3;
                    block21: {
                        block20: {
                            int n4;
                            int n5;
                            n3 = this.o;
                            try {
                                ResourceAllocationStrategy resourceAllocationStrategy = this;
                                n5 = n3 + n2;
                                n4 = n3 == 0 ? 0 : 1;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationStrategy.a(customSystemException);
                            }
                            try {
                                block19: {
                                    try {
                                        try {
                                            block18: {
                                                try {
                                                    try {
                                                        resourceAllocationStrategy.o = n5 + n4;
                                                        if (!this.p) break block17;
                                                        if (n3 != 0) break block18;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ResourceAllocationStrategy.a(customSystemException);
                                                    }
                                                    if (this.v == 0) break block19;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ResourceAllocationStrategy.a(customSystemException);
                                                }
                                            }
                                            if (n3 >= this.v) break block20;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceAllocationStrategy.a(customSystemException);
                                        }
                                        if (this.v > this.o) break block20;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceAllocationStrategy.a(customSystemException);
                                    }
                                }
                                bl3 = true;
                                break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceAllocationStrategy.a(customSystemException);
                            }
                        }
                        bl3 = false;
                    }
                    bl = bl3;
                    break block23;
                }
                try {
                    try {
                        if (n3 > this.v || this.v >= this.o) break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceAllocationStrategy.a(customSystemException);
                    }
                    bl2 = true;
                    break block23;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceAllocationStrategy.a(customSystemException);
                }
            }
            bl2 = bl = false;
        }
        if (bl) {
            int n6 = n2 + this.h;
            ConfigurationManager2137.e(n6, this.X, n + 1);
            this.o += this.h;
        }
    }
}

