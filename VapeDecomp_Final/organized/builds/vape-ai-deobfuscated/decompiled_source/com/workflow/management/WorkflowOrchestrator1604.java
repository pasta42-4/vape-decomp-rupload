/*
 * Decompiled with CFR 0.152.
 */
package com.workflow.management;

import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.verification.StackFrameValidator;
import com.event.management.EventDispatchCoordinator1708;

class WorkflowOrchestrator1604
extends StackFrameValidator {
    private EventDispatchCoordinator1708 D;

    @Override
    public void V(int n, int n2) {
        this.D.a(n2);
    }

    public byte[] b() throws BytecodeProcessingException {
        this.c();
        return this.D.g();
    }

    @Override
    public void l(int n, int n2, int[] nArray, int[] nArray2) {
        this.D.M(n2, nArray, this.T(nArray, nArray2));
    }

    protected int[] T(int[] nArray, int[] nArray2) {
        return nArray2;
    }

    @Override
    public void h(int n, int n2, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        this.D.c(n2, nArray, this.T(nArray, nArray2), nArray3, this.T(nArray3, nArray4));
    }

    protected int o(int n, int n2) {
        return n2;
    }

    @Override
    public void D(int n, int n2, int n3, int n4) {
        this.D.a(n2, n3, this.o(n3, n4));
    }

    public WorkflowOrchestrator1604(byte[] byArray) {
        super(byArray);
        this.D = new EventDispatchCoordinator1708(byArray.length);
    }

    @Override
    public void g(int n, int n2, int n3) {
        this.D.G(n2, n3);
    }
}

