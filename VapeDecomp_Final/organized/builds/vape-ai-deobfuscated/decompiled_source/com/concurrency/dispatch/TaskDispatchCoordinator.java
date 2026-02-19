/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.dispatch;

import com.auth.token.SecurityTokenGenerator;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericalAnalysisEngine;
import com.system.resource.ResourceAllocationController1414;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class TaskDispatchCoordinator {
    private final Queue<ResourceAllocationController1414> B = new ConcurrentLinkedQueue<ResourceAllocationController1414>();
    private final Queue<ResourceAllocationController1414> d = new ConcurrentLinkedQueue<ResourceAllocationController1414>();
    private final Queue<ResourceAllocationController1414> n = new ConcurrentLinkedQueue<ResourceAllocationController1414>();
    private final int R;

    static Queue d(TaskDispatchCoordinator taskDispatchCoordinator) {
        return taskDispatchCoordinator.B;
    }

    public void a() {
        for (ResourceAllocationController1414 resourceAllocationController1414 : this.B) {
            this.n.add(resourceAllocationController1414);
        }
    }

    public Queue<ResourceAllocationController1414> Q() {
        return this.d;
    }

    public void s() {
        for (ResourceAllocationController1414 resourceAllocationController1414 : this.B) {
            long l = System.currentTimeMillis() - ResourceAllocationController1414.b(resourceAllocationController1414);
            try {
                if (l <= (long)(SecurityTokenGenerator.I() * 50)) continue;
                this.n.add(resourceAllocationController1414);
            }
            catch (CustomSystemException customSystemException) {
                throw TaskDispatchCoordinator.a(customSystemException);
            }
        }
    }

    public TaskDispatchCoordinator(int n) {
        this.R = n;
    }

    public int O() {
        return this.R;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void x(double d2, double d3, double d4, float f, float f2) {
        ResourceAllocationController1414 resourceAllocationController1414 = new ResourceAllocationController1414(new NumericalAnalysisEngine(this.R, d2, d3, d4, f, f2));
        try {
            this.d.add(resourceAllocationController1414);
            this.B.add(resourceAllocationController1414);
            if (this.B.size() > SecurityTokenGenerator.I()) {
                this.E();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TaskDispatchCoordinator.a(customSystemException);
        }
    }

    public Queue<ResourceAllocationController1414> H() {
        return this.n;
    }

    public void E() {
        ResourceAllocationController1414 resourceAllocationController1414 = this.B.poll();
        try {
            if (resourceAllocationController1414 != null) {
                this.n.add(resourceAllocationController1414);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw TaskDispatchCoordinator.a(customSystemException);
        }
    }
}

