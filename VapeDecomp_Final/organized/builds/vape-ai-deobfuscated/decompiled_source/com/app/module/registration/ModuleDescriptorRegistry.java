/*
 * Decompiled with CFR 0.152.
 */
package com.app.module.registration;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class ModuleDescriptorRegistry
extends LogCompiler {
    int d;

    public int hashCode() {
        return this.d;
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
                        if (!(object instanceof ModuleDescriptorRegistry) || ((ModuleDescriptorRegistry)object).d != this.d) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModuleDescriptorRegistry.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModuleDescriptorRegistry.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public ModuleDescriptorRegistry(int n, int n2) {
        super(n2);
        this.d = n;
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(19);
        dataOutputStream.writeShort(this.d);
    }

    @Override
    public int Q() {
        return 19;
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        String string = bytecodeAnalyzer.Z(this.d);
        int n = bytecodeAnalyzer2.D(string);
        return bytecodeAnalyzer2.J(n);
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("Module #");
        printWriter.println(this.d);
    }

    public ModuleDescriptorRegistry(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.d = dataInputStream.readUnsignedShort();
    }
}

