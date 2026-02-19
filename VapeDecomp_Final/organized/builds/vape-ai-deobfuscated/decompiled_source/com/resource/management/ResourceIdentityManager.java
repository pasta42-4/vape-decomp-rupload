/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class ResourceIdentityManager
extends LogCompiler {
    int K;

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("String #");
        printWriter.println(this.K);
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(8);
        dataOutputStream.writeShort(this.K);
    }

    @Override
    public int Q() {
        return 8;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.N(bytecodeAnalyzer.Z(this.K));
    }

    public int hashCode() {
        return this.K;
    }

    public ResourceIdentityManager(int n, int n2) {
        super(n2);
        this.K = n;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean equals(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(object instanceof ResourceIdentityManager) || ((ResourceIdentityManager)object).K != this.K) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceIdentityManager.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceIdentityManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public ResourceIdentityManager(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.K = dataInputStream.readUnsignedShort();
    }
}

