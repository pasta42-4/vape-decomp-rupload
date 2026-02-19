/*
 * Decompiled with CFR 0.152.
 */
package com.data.conversion;

import com.app.logging.core.LogCompiler;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

class FloatPrecisionMapper
extends LogCompiler {
    float a;

    public FloatPrecisionMapper(DataInputStream dataInputStream, int n) throws IOException {
        super(n);
        this.a = dataInputStream.readFloat();
    }

    @Override
    public void u(PrintWriter printWriter) {
        printWriter.print("Float ");
        printWriter.println(this.a);
    }

    public FloatPrecisionMapper(float f, int n) {
        super(n);
        this.a = f;
    }

    @Override
    public void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(4);
        dataOutputStream.writeFloat(this.a);
    }

    public boolean equals(Object object) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(object instanceof FloatPrecisionMapper) || ((FloatPrecisionMapper)object).a != this.a) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw FloatPrecisionMapper.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw FloatPrecisionMapper.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    @Override
    public int H(BytecodeAnalyzer bytecodeAnalyzer, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        return bytecodeAnalyzer2.G(this.a);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public int Q() {
        return 4;
    }
}

