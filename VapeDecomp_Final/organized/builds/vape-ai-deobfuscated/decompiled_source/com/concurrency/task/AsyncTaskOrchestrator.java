/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.task;

import a.z1;
import com.app.security.validation.DecompilationValidator;
import com.data.obfuscation.NumericScrambler;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.exception.system.CustomSystemException;
import com.security.exchange.SecureDataExchanger793;
import com.system.resources.ResourceAllocationTracker882;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class AsyncTaskOrchestrator {
    private DecompilationValidator j;
    private int e;
    private SecureDataExchanger793 d;
    private ArrayList<RuntimeInstrumentationEngine> S;
    private Supplier<Void> x;
    private float f;
    private List<Supplier<Void>> C = new ArrayList<Supplier<Void>>();
    private NumericScrambler Z;
    private ResourceAllocationTracker882 B;
    private z1 c;

    public ResourceAllocationTracker882 J() {
        return this.B;
    }

    public Supplier<Void> B() {
        return this.x;
    }

    public List<Supplier<Void>> N() {
        return this.C;
    }

    public DecompilationValidator O() {
        return this.j;
    }

    public void i(Supplier<Void> supplier) {
        try {
            if (supplier != null) {
                this.C.add(supplier);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsyncTaskOrchestrator.a(customSystemException);
        }
    }

    public void m(RuntimeInstrumentationEngine runtimeInstrumentationEngine) {
        this.S.add(runtimeInstrumentationEngine);
        this.i(runtimeInstrumentationEngine.e());
    }

    public void B(ResourceAllocationTracker882 resourceAllocationTracker882) {
        this.B = resourceAllocationTracker882;
    }

    public NumericScrambler P() {
        return this.Z;
    }

    public SecureDataExchanger793 g() {
        return this.d;
    }

    public int k() {
        return this.e;
    }

    public float q() {
        return this.f;
    }

    public z1 Z() {
        return this.c;
    }

    public boolean d() {
        boolean bl;
        try {
            bl = this.B != null;
        }
        catch (CustomSystemException customSystemException) {
            throw AsyncTaskOrchestrator.a(customSystemException);
        }
        return bl;
    }

    public AsyncTaskOrchestrator(RuntimeInstrumentationEngine runtimeInstrumentationEngine) {
        this.S = new ArrayList();
        this.Z = runtimeInstrumentationEngine.I();
        this.d = runtimeInstrumentationEngine.N;
        this.c = runtimeInstrumentationEngine.B();
        this.f = runtimeInstrumentationEngine.a();
        this.B = runtimeInstrumentationEngine.A();
        this.j = runtimeInstrumentationEngine.n();
        this.x = runtimeInstrumentationEngine.V();
        this.e = 1;
        if (runtimeInstrumentationEngine.e() != null) {
            this.C.add(runtimeInstrumentationEngine.e());
        } else {
            runtimeInstrumentationEngine.z = 0;
            runtimeInstrumentationEngine.y(runtimeInstrumentationEngine.B().name, 0);
        }
        this.S.add(runtimeInstrumentationEngine);
    }

    public void U() {
        ++this.e;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public ArrayList<RuntimeInstrumentationEngine> w() {
        return this.S;
    }
}

