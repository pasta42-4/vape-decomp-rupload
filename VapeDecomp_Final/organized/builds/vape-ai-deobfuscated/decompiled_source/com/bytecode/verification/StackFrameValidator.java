/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.verification;

import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.processing.BytecodeExceptionHandler;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;

public class StackFrameValidator {
    int d;
    byte[] X;

    private int H(int n, int n2) throws BytecodeProcessingException {
        int n3 = n2 - 251;
        int n4 = ConfigurationManager2137.M(this.X, n + 1);
        int[] nArray = new int[n3];
        int[] nArray2 = new int[n3];
        int n5 = n + 3;
        for (int i = 0; i < n3; ++i) {
            block5: {
                int n6 = this.X[n5] & 0xFF;
                try {
                    try {
                        nArray[i] = n6;
                        if (n6 != 7 && n6 != 8) break block5;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw StackFrameValidator.b(bytecodeProcessingException);
                    }
                    nArray2[i] = ConfigurationManager2137.M(this.X, n5 + 1);
                    this.k(n6, nArray2[i], n5 + 1);
                    n5 += 3;
                    continue;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw StackFrameValidator.b(bytecodeProcessingException);
                }
            }
            nArray2[i] = 0;
            ++n5;
        }
        this.l(n, n4, nArray, nArray2);
        return n5;
    }

    public void k(int n, int n2, int n3) {
    }

    public void l(int n, int n2, int[] nArray, int[] nArray2) throws BytecodeProcessingException {
    }

    private int W(int n, int n2, int[] nArray, int[] nArray2) {
        for (int i = 0; i < n2; ++i) {
            int n3 = this.X[n++] & 0xFF;
            try {
                try {
                    nArray[i] = n3;
                    if (n3 != 7 && n3 != 8) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw StackFrameValidator.b(customSystemException);
                }
                nArray2[i] = ConfigurationManager2137.M(this.X, n);
                this.k(n3, nArray2[i], n);
                n += 2;
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw StackFrameValidator.b(customSystemException);
            }
        }
        return n;
    }

    private int h(int n, int n2) throws BytecodeProcessingException {
        int n3;
        int n4;
        int n5;
        int n6;
        block4: {
            n6 = n;
            if (n2 < 128) {
                n5 = n2 - 64;
            } else {
                n5 = ConfigurationManager2137.M(this.X, n + 1);
                n += 2;
            }
            n4 = this.X[n + 1] & 0xFF;
            n3 = 0;
            try {
                if (n4 != 7 && n4 != 8) break block4;
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw StackFrameValidator.b(bytecodeProcessingException);
            }
            n3 = ConfigurationManager2137.M(this.X, n + 2);
            this.k(n4, n3, n + 2);
            n += 2;
        }
        this.D(n6, n5, n4, n3);
        return n + 2;
    }

    public void g(int n, int n2, int n3) throws BytecodeProcessingException {
    }

    public StackFrameValidator(BytecodeExceptionHandler bytecodeExceptionHandler) {
        this(bytecodeExceptionHandler.p());
    }

    int N(int n, int n2) throws BytecodeProcessingException {
        block14: {
            int n3;
            block13: {
                n3 = this.X[n] & 0xFF;
                try {
                    if (n3 >= 64) break block13;
                    this.V(n, n3);
                    ++n;
                    break block14;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw StackFrameValidator.b(bytecodeProcessingException);
                }
            }
            if (n3 < 128) {
                n = this.h(n, n3);
            } else {
                try {
                    if (n3 < 247) {
                        throw new BytecodeProcessingException("bad frame_type " + n3 + " in StackMapTable (pos: " + n + ", frame no.:" + n2 + ")");
                    }
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw StackFrameValidator.b(bytecodeProcessingException);
                }
                if (n3 == 247) {
                    n = this.h(n, n3);
                } else if (n3 < 251) {
                    int n4 = ConfigurationManager2137.M(this.X, n + 1);
                    this.g(n, n4, 251 - n3);
                    n += 3;
                } else if (n3 == 251) {
                    int n5 = ConfigurationManager2137.M(this.X, n + 1);
                    this.V(n, n5);
                    n += 3;
                } else {
                    n = n3 < 255 ? this.H(n, n3) : this.f(n);
                }
            }
        }
        return n;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public StackFrameValidator(byte[] byArray) {
        this.X = byArray;
        this.d = ConfigurationManager2137.M(byArray, 0);
    }

    private int f(int n) throws BytecodeProcessingException {
        int n2 = ConfigurationManager2137.M(this.X, n + 1);
        int n3 = ConfigurationManager2137.M(this.X, n + 3);
        int[] nArray = new int[n3];
        int[] nArray2 = new int[n3];
        int n4 = this.W(n + 5, n3, nArray, nArray2);
        int n5 = ConfigurationManager2137.M(this.X, n4);
        int[] nArray3 = new int[n5];
        int[] nArray4 = new int[n5];
        n4 = this.W(n4 + 2, n5, nArray3, nArray4);
        this.h(n, n2, nArray, nArray2, nArray3, nArray4);
        return n4;
    }

    public void h(int n, int n2, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) throws BytecodeProcessingException {
    }

    public void D(int n, int n2, int n3, int n4) throws BytecodeProcessingException {
    }

    public void c() throws BytecodeProcessingException {
        int n = this.d;
        int n2 = 2;
        for (int i = 0; i < n; ++i) {
            n2 = this.N(n2, i);
        }
    }

    public void V(int n, int n2) throws BytecodeProcessingException {
    }
}

