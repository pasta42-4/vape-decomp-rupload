/*
 * Decompiled with CFR 0.152.
 */
package com.security.crypto;

import com.app.network.connection.ConnectionPoolManager2710;
import com.concurrency.dispatch.TaskDispatchCoordinator;
import com.exception.system.CustomSystemException;
import com.system.resource.ResourceAllocationController1414;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class CryptographicProcessor {
    private final Map<Integer, TaskDispatchCoordinator> K = new ConcurrentHashMap<Integer, TaskDispatchCoordinator>();

    public void U() {
        for (Integer n : this.K.keySet()) {
            TaskDispatchCoordinator taskDispatchCoordinator = this.K.get(n);
            try {
                while (taskDispatchCoordinator.Q().size() > 0) {
                    taskDispatchCoordinator.Q().poll().D();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptographicProcessor.a(customSystemException);
            }
            while (taskDispatchCoordinator.H().size() > 0) {
                ResourceAllocationController1414 resourceAllocationController1414 = taskDispatchCoordinator.H().poll();
                resourceAllocationController1414.u();
                TaskDispatchCoordinator.d(taskDispatchCoordinator).remove(resourceAllocationController1414);
            }
        }
    }

    public void r() {
        for (Integer n : this.K.keySet()) {
            TaskDispatchCoordinator taskDispatchCoordinator = this.K.get(n);
            taskDispatchCoordinator.s();
        }
    }

    public void C() {
        this.K.clear();
    }

    public void P() {
        for (Integer n : this.K.keySet()) {
            TaskDispatchCoordinator taskDispatchCoordinator = this.K.get(n);
            taskDispatchCoordinator.a();
        }
    }

    public TaskDispatchCoordinator k(int n) {
        return this.K.get(n);
    }

    private CryptographicProcessor() {
    }

    CryptographicProcessor(ConnectionPoolManager2710 connectionPoolManager2710) {
        this();
    }

    public TaskDispatchCoordinator L(int n, double d2, double d3, double d4, float f, float f2) {
        try {
            if (!this.K.containsKey(n)) {
                this.K.put(n, new TaskDispatchCoordinator(n));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicProcessor.a(customSystemException);
        }
        TaskDispatchCoordinator taskDispatchCoordinator = this.K.get(n);
        taskDispatchCoordinator.x(d2, d3, d4, f, f2);
        return taskDispatchCoordinator;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int R(int n) {
        for (Integer n2 : this.K.keySet()) {
            TaskDispatchCoordinator taskDispatchCoordinator = this.K.get(n2);
            for (ResourceAllocationController1414 resourceAllocationController1414 : TaskDispatchCoordinator.d(taskDispatchCoordinator)) {
                try {
                    if (ResourceAllocationController1414.o(resourceAllocationController1414) != n) continue;
                    return n2;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptographicProcessor.a(customSystemException);
                }
            }
        }
        return -1;
    }
}

