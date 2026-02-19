/*
 * Decompiled with CFR 0.152.
 */
package com.concurrency.execution;

import com.app.logging.interceptor.LoggingInterceptor2708;
import com.concurrency.tasks.AsynchronousTaskExecutor1485;
import com.network.clustering.ClusterNodeRegistry1151;
import com.performance.monitoring.TimedExecutionTracker;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.GraphicalRenderingController;
import java.util.ArrayList;
import java.util.Collections;

class AsynchronousTaskExecutor
extends Thread {
    final AsynchronousTaskExecutor1485 j;

    private AsynchronousTaskExecutor(AsynchronousTaskExecutor1485 asynchronousTaskExecutor1485) {
        this.j = asynchronousTaskExecutor1485;
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    AsynchronousTaskExecutor(AsynchronousTaskExecutor1485 asynchronousTaskExecutor1485, LoggingInterceptor2708 loggingInterceptor2708) {
        this(asynchronousTaskExecutor1485);
    }

    /*
     * Loose catch block
     */
    @Override
    public void run() {
        GraphicalRenderingController graphicalRenderingController = TemporalMetadataResolver.h.U().K(GraphicalRenderingController.class);
        TimedExecutionTracker timedExecutionTracker = ClusterNodeRegistry1151.W().E();
        long l = timedExecutionTracker.O();
        long l2 = SystemDiagnosticAnalyzer.Q();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = -1;
        int n2 = -1;
        while (true) {
            block44: {
                int n3;
                block43: {
                    block42: {
                        block41: {
                            try {
                                if (Thread.interrupted()) {
                                    this.j.o();
                                    return;
                                }
                            }
                            catch (InterruptedException interruptedException) {
                                throw AsynchronousTaskExecutor.a(interruptedException);
                            }
                            if (n == -1) break block41;
                            try {
                                if (!timedExecutionTracker.I(n)) {
                                    break;
                                }
                                break block41;
                                catch (InterruptedException interruptedException) {
                                    throw AsynchronousTaskExecutor.a(interruptedException);
                                }
                            }
                            catch (InterruptedException interruptedException) {
                                throw AsynchronousTaskExecutor.a(interruptedException);
                            }
                        }
                        if (n2 == -1) break block42;
                        try {
                            if (!SystemDiagnosticAnalyzer.A(n2)) {
                                break;
                            }
                            break block42;
                            catch (InterruptedException interruptedException) {
                                throw AsynchronousTaskExecutor.a(interruptedException);
                            }
                        }
                        catch (InterruptedException interruptedException) {
                            throw AsynchronousTaskExecutor.a(interruptedException);
                        }
                    }
                    try {
                        if (arrayList.size() >= 3) {
                            break;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        throw AsynchronousTaskExecutor.a(interruptedException);
                    }
                    try {
                        if (l == timedExecutionTracker.O() || !timedExecutionTracker.g()) break block43;
                    }
                    catch (InterruptedException interruptedException) {
                        throw AsynchronousTaskExecutor.a(interruptedException);
                    }
                    l = timedExecutionTracker.O();
                    n3 = timedExecutionTracker.a();
                    try {
                        if (arrayList.contains(n3)) {
                            continue;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        throw AsynchronousTaskExecutor.a(interruptedException);
                    }
                    arrayList.add(n3);
                    if (n == -1) {
                        n = n3;
                    }
                    try {
                        if (!graphicalRenderingController.sW.s().booleanValue()) break;
                    }
                    catch (InterruptedException interruptedException) {
                        throw AsynchronousTaskExecutor.a(interruptedException);
                    }
                }
                try {
                    if (timedExecutionTracker.I(160)) {
                        continue;
                    }
                }
                catch (InterruptedException interruptedException) {
                    throw AsynchronousTaskExecutor.a(interruptedException);
                }
                try {
                    if (l2 == SystemDiagnosticAnalyzer.Q() || !SystemDiagnosticAnalyzer.L()) break block44;
                }
                catch (InterruptedException interruptedException) {
                    throw AsynchronousTaskExecutor.a(interruptedException);
                }
                l2 = SystemDiagnosticAnalyzer.Q();
                try {
                    if (SystemDiagnosticAnalyzer.m() == 0) {
                        AsynchronousTaskExecutor1485.P(this.j).E(Collections.emptyList());
                        break;
                    }
                }
                catch (InterruptedException interruptedException) {
                    throw AsynchronousTaskExecutor.a(interruptedException);
                }
                n3 = -100 + SystemDiagnosticAnalyzer.m();
                if (n2 == -1) {
                    n2 = SystemDiagnosticAnalyzer.m();
                }
                try {
                    if (arrayList.contains(n3)) {
                        continue;
                    }
                }
                catch (InterruptedException interruptedException) {
                    throw AsynchronousTaskExecutor.a(interruptedException);
                }
                try {
                    arrayList.add(n3);
                    if (!graphicalRenderingController.sW.s().booleanValue()) break;
                }
                catch (InterruptedException interruptedException) {
                    throw AsynchronousTaskExecutor.a(interruptedException);
                }
            }
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        AsynchronousTaskExecutor1485.P(this.j).E(arrayList);
        this.j.o();
    }
}

