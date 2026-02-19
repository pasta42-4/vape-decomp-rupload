/*
 * Decompiled with CFR 0.152.
 */
package com.data.collection;

import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.core.computation.AbstractComputationKernel;
import com.security.crypto.CryptoSecurityManager1576;
import java.util.List;

public abstract class CollectionOrchestrator1895 {
    CollectionOrchestrator1895 x;
    CollectionOrchestrator1895 c;
    public List<CryptoSecurityManager1576> o;
    protected int Q;
    private static AbstractComputationKernel[] b;
    int p;
    public List<CryptoSecurityManager1576> C;

    public int K() {
        return this.Q;
    }

    public abstract void T(BytecodeInstrumentationEngine var1);

    public static void h(AbstractComputationKernel[] abstractComputationKernelArray) {
        b = abstractComputationKernelArray;
    }

    static {
        if (CollectionOrchestrator1895.b() == null) {
            CollectionOrchestrator1895.h(new AbstractComputationKernel[4]);
        }
    }

    protected final void m(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        CryptoSecurityManager1576 cryptoSecurityManager1576;
        int n;
        int n2;
        if (this.o != null) {
            n2 = this.o.size();
            for (n = 0; n < n2; ++n) {
                cryptoSecurityManager1576 = this.o.get(n);
                cryptoSecurityManager1576.n(bytecodeInstrumentationEngine.Q(cryptoSecurityManager1576.v, cryptoSecurityManager1576.X, cryptoSecurityManager1576.Z, true));
            }
        }
        if (this.C != null) {
            n2 = this.C.size();
            for (n = 0; n < n2; ++n) {
                cryptoSecurityManager1576 = this.C.get(n);
                cryptoSecurityManager1576.n(bytecodeInstrumentationEngine.Q(cryptoSecurityManager1576.v, cryptoSecurityManager1576.X, cryptoSecurityManager1576.Z, false));
            }
        }
    }

    protected CollectionOrchestrator1895(int n) {
        this.Q = n;
        this.p = -1;
    }

    public static AbstractComputationKernel[] b() {
        return b;
    }

    public CollectionOrchestrator1895 m() {
        return this.c;
    }
}

