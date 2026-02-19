/*
 * Decompiled with CFR 0.152.
 */
package com.app.config;

import com.bytecode.analysis.BytecodeAnalyzer;
import com.exception.system.CustomSystemException;
import com.workflow.management.WorkflowOrchestrator1604;
import java.util.Map;

class ConfigurationManager1786
extends WorkflowOrchestrator1604 {
    private BytecodeAnalyzer T;
    private BytecodeAnalyzer B;
    private Map<String, String> z;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    protected int o(int n, int n2) {
        try {
            if (n == 7) {
                return this.T.X(n2, this.B, this.z);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationManager1786.a(customSystemException);
        }
        return n2;
    }

    public ConfigurationManager1786(BytecodeAnalyzer bytecodeAnalyzer, byte[] byArray, BytecodeAnalyzer bytecodeAnalyzer2, Map<String, String> map) {
        super(byArray);
        this.T = bytecodeAnalyzer;
        this.B = bytecodeAnalyzer2;
        this.z = map;
    }

    @Override
    protected int[] T(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[nArray2.length];
        int n = 0;
        while (true) {
            block6: {
                block5: {
                    try {
                        try {
                            if (n >= nArray2.length) break;
                            if (nArray[n] != 7) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConfigurationManager1786.a(customSystemException);
                        }
                        nArray3[n] = this.T.X(nArray2[n], this.B, this.z);
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConfigurationManager1786.a(customSystemException);
                    }
                }
                nArray3[n] = nArray2[n];
            }
            ++n;
        }
        return nArray3;
    }
}

