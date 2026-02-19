/*
 * Decompiled with CFR 0.152.
 */
package com.utils.sorting;

import com.app.configuration.management.ConfigurationStateTracker;
import com.bytecode.analysis.BytecodeAnalysisEngine1263;
import com.exception.system.CustomSystemException;

class SortableIdentifier
implements Comparable<SortableIdentifier> {
    boolean V;
    int C;
    ConfigurationStateTracker u;
    int F;
    BytecodeAnalysisEngine1263 s;
    BytecodeAnalysisEngine1263[] Z;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    SortableIdentifier(int n) {
        this.F = n;
        this.s = null;
        this.Z = null;
        this.V = false;
        this.C = 0;
        this.u = null;
    }

    public int B(SortableIdentifier sortableIdentifier) {
        try {
            if (null == sortableIdentifier) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SortableIdentifier.a(customSystemException);
        }
        return this.F - sortableIdentifier.F;
    }

    void G(BytecodeAnalysisEngine1263[] bytecodeAnalysisEngine1263Array, int n, boolean bl) {
        this.Z = bytecodeAnalysisEngine1263Array;
        this.C = n;
        this.V = bl;
    }
}

