/*
 * Decompiled with CFR 0.152.
 */
package com.app.core.config;

import com.bytecode.analysis.BytecodeInspectionEngine;
import com.exception.system.CustomSystemException;
import com.reflection.registry.MetaclassDefinitionRegistry;

public class ConfigurationManager2183 {
    public int f;
    public BytecodeInspectionEngine o;
    public MetaclassDefinitionRegistry a;

    public ConfigurationManager2183(MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine, int n) {
        this.a = metaclassDefinitionRegistry;
        this.o = bytecodeInspectionEngine;
        this.f = n;
    }

    public boolean k() {
        boolean bl;
        int n = this.o.Z();
        try {
            bl = (n & 8) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager2183.a(customSystemException);
        }
        return bl;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

