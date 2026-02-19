/*
 * Decompiled with CFR 0.152.
 */
package com.util.conversion;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import com.resource.core.BaseResourceManager;

public class BooleanStateConverter
extends BaseResourceManager {
    int J;

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public BooleanStateConverter(int n, BytecodeAnalyzer bytecodeAnalyzer) {
        super('Z', bytecodeAnalyzer);
        this.J = n;
    }

    public boolean i() {
        boolean bl;
        try {
            bl = this.R.N(this.J) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw BooleanStateConverter.b(customSystemException);
        }
        return bl;
    }

    public String toString() {
        String string;
        try {
            string = this.i() ? "true" : "false";
        }
        catch (CustomSystemException customSystemException) {
            throw BooleanStateConverter.b(customSystemException);
        }
        return string;
    }
}

