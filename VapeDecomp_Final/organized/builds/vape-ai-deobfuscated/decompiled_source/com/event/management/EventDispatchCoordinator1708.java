/*
 * Decompiled with CFR 0.152.
 */
package com.event.management;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.processing.BytecodeExceptionHandler;
import com.deobfuscation.configuration.ConfigurationManager2137;
import com.exception.system.CustomSystemException;
import java.io.ByteArrayOutputStream;

public class EventDispatchCoordinator1708 {
    int H;
    ByteArrayOutputStream F;

    public byte[] g() {
        byte[] byArray = this.F.toByteArray();
        ConfigurationManager2137.e(this.H, byArray, 0);
        return byArray;
    }

    private void J(int n) {
        this.F.write(n >>> 8 & 0xFF);
        this.F.write(n & 0xFF);
    }

    public BytecodeExceptionHandler x(BytecodeAnalyzer bytecodeAnalyzer) {
        return new BytecodeExceptionHandler(bytecodeAnalyzer, this.g());
    }

    private void W(int n, int n2) {
        block4: {
            try {
                try {
                    this.F.write(n);
                    if (n != 7 && n != 8) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1708.a(customSystemException);
                }
                this.J(n2);
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator1708.a(customSystemException);
            }
        }
    }

    public void M(int n, int[] nArray, int[] nArray2) {
        ++this.H;
        int n2 = nArray.length;
        this.F.write(n2 + 251);
        this.J(n);
        try {
            for (int i = 0; i < n2; ++i) {
                this.W(nArray[i], nArray2[i]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1708.a(customSystemException);
        }
    }

    public EventDispatchCoordinator1708(int n) {
        this.F = new ByteArrayOutputStream(n);
        this.H = 0;
        this.F.write(0);
        this.F.write(0);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void a(int n, int n2, int n3) {
        block3: {
            block2: {
                try {
                    ++this.H;
                    if (n >= 64) break block2;
                    this.F.write(n + 64);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1708.a(customSystemException);
                }
            }
            this.F.write(247);
            this.J(n);
        }
        this.W(n2, n3);
    }

    public void c(int n, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        int n2;
        ++this.H;
        this.F.write(255);
        this.J(n);
        int n3 = nArray.length;
        this.J(n3);
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                this.W(nArray[n2], nArray2[n2]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1708.a(customSystemException);
        }
        n3 = nArray3.length;
        this.J(n3);
        try {
            for (n2 = 0; n2 < n3; ++n2) {
                this.W(nArray3[n2], nArray4[n2]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator1708.a(customSystemException);
        }
    }

    public void G(int n, int n2) {
        ++this.H;
        this.F.write(251 - n2);
        this.J(n);
    }

    public void a(int n) {
        block3: {
            block2: {
                try {
                    ++this.H;
                    if (n >= 64) break block2;
                    this.F.write(n);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator1708.a(customSystemException);
                }
            }
            this.F.write(251);
            this.J(n);
        }
    }
}

