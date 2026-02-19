/*
 * Decompiled with CFR 0.152.
 */
package com.data.serialization;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import com.resource.core.BaseResourceManager;

public class PersistentObjectSerializer
extends BaseResourceManager {
    BaseResourceManager[] x = null;
    BaseResourceManager i = null;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        if (this.x != null) {
            int n = 0;
            while (true) {
                block6: {
                    try {
                        try {
                            if (n >= this.x.length) break;
                            stringBuilder.append(this.x[n].toString());
                            if (n + 1 >= this.x.length) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PersistentObjectSerializer.b(customSystemException);
                        }
                        stringBuilder.append(", ");
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PersistentObjectSerializer.b(customSystemException);
                    }
                }
                ++n;
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public PersistentObjectSerializer(BytecodeAnalyzer bytecodeAnalyzer) {
        super('[', bytecodeAnalyzer);
    }

    public void R(BaseResourceManager[] baseResourceManagerArray) {
        block4: {
            try {
                try {
                    this.x = baseResourceManagerArray;
                    if (baseResourceManagerArray == null || baseResourceManagerArray.length <= 0) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw PersistentObjectSerializer.b(customSystemException);
                }
                this.i = baseResourceManagerArray[0];
            }
            catch (CustomSystemException customSystemException) {
                throw PersistentObjectSerializer.b(customSystemException);
            }
        }
    }
}

