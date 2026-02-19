/*
 * Decompiled with CFR 0.152.
 */
package com.resource.allocation;

import com.app.tasks.BackgroundTaskOrchestrator2688;
import com.exception.system.CustomSystemException;
import com.network.clustering.ClusterNodeCoordinator;
import com.network.protocol.ProtocolInteractionController;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.system.monitoring.RuntimeResourceTracker;
import java.util.ArrayList;

class MultiResourceAllocator {
    private BackgroundTaskOrchestrator2688 x;
    private BackgroundTaskOrchestrator2688 L;
    private ArrayList<Integer> K;
    private BackgroundTaskOrchestrator2688 l;
    private BackgroundTaskOrchestrator2688 A;
    private BackgroundTaskOrchestrator2688 e;
    private BackgroundTaskOrchestrator2688 B;
    private BackgroundTaskOrchestrator2688 j;
    private BackgroundTaskOrchestrator2688 g;
    private BackgroundTaskOrchestrator2688 M;
    final ClusterNodeCoordinator C;
    private BackgroundTaskOrchestrator2688 Z;

    ArrayList<Integer> C() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            if (this.Z.M != -1) {
                arrayList.add(this.Z.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        try {
            if (this.A.M != -1) {
                arrayList.add(this.A.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        try {
            if (this.e.M != -1) {
                arrayList.add(this.e.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        try {
            if (this.x.M != -1) {
                arrayList.add(this.x.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        try {
            if (this.j.M != -1) {
                arrayList.add(this.j.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        try {
            if (this.l.M != -1) {
                arrayList.add(this.l.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        try {
            if (this.L.M != -1) {
                arrayList.add(this.L.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        try {
            if (this.M.M != -1) {
                arrayList.add(this.M.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        try {
            if (this.B.M != -1) {
                arrayList.add(this.B.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        try {
            if (this.g.M != -1) {
                arrayList.add(this.g.M);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MultiResourceAllocator.a(customSystemException);
        }
        return arrayList;
    }

    MultiResourceAllocator(ClusterNodeCoordinator clusterNodeCoordinator) {
        this.C = clusterNodeCoordinator;
        this.Z = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.A = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.e = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.x = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.j = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.l = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.L = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.M = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.B = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.g = new BackgroundTaskOrchestrator2688(this, -1, -1.0);
        this.K = new ArrayList();
    }

    void u() {
        this.Z.M = -1;
        this.A.M = -1;
        this.e.M = -1;
        this.x.M = -1;
        this.j.M = -1;
        this.l.M = -1;
        this.L.M = -1;
        this.M.M = -1;
        this.B.M = -1;
        this.g.M = -1;
        this.Z.x = -1.0;
        this.A.x = -1.0;
        this.e.x = -1.0;
        this.x.x = -1.0;
        this.j.x = -1.0;
        this.l.x = -1.0;
        this.L.x = -1.0;
        this.M.x = -1.0;
        this.B.x = -1.0;
        this.g.x = -1.0;
    }

    boolean G(LightweightExecutionContext lightweightExecutionContext, int n) {
        block45: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block45;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiResourceAllocator.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw MultiResourceAllocator.a(customSystemException);
            }
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        if (RuntimeResourceTracker.l(protocolInteractionController)) {
            block47: {
                double d2;
                int n2;
                block49: {
                    block48: {
                        block46: {
                            n2 = ClusterNodeCoordinator.f(this.C, lightweightExecutionContext);
                            d2 = RuntimeResourceTracker.i(lightweightExecutionContext);
                            try {
                                try {
                                    if (n2 != 8) break block46;
                                    if (!(d2 > this.A.x)) break block47;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MultiResourceAllocator.a(customSystemException);
                                }
                                this.A.M = n;
                                this.A.x = d2;
                                break block47;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw MultiResourceAllocator.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                if (n2 != 7) break block48;
                                if (!(d2 > this.e.x)) break block47;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw MultiResourceAllocator.a(customSystemException);
                            }
                            this.e.M = n;
                            this.e.x = d2;
                            break block47;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MultiResourceAllocator.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (n2 != 6) break block49;
                            if (!(d2 > this.x.x)) break block47;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MultiResourceAllocator.a(customSystemException);
                        }
                        this.x.M = n;
                        this.x.x = d2;
                        break block47;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiResourceAllocator.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (n2 != 5 || !(d2 > this.j.x)) break block47;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MultiResourceAllocator.a(customSystemException);
                    }
                    this.j.M = n;
                    this.j.x = d2;
                }
                catch (CustomSystemException customSystemException) {
                    throw MultiResourceAllocator.a(customSystemException);
                }
            }
            return true;
        }
        if (RuntimeResourceTracker.a(protocolInteractionController)) {
            double d3 = RuntimeResourceTracker.U(lightweightExecutionContext);
            try {
                if (d3 > this.Z.x) {
                    this.Z.M = n;
                    this.Z.x = d3;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiResourceAllocator.a(customSystemException);
            }
            return true;
        }
        if (protocolInteractionController.B(ReflectionMetadataResolver.U6)) {
            double d4 = RuntimeResourceTracker.W(lightweightExecutionContext);
            try {
                if (d4 > this.g.x) {
                    this.g.M = n;
                    this.g.x = d4;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiResourceAllocator.a(customSystemException);
            }
            return true;
        }
        if (RuntimeResourceTracker.s(protocolInteractionController)) {
            double d5 = RuntimeResourceTracker.l(lightweightExecutionContext);
            try {
                if (d5 > this.l.x) {
                    this.l.M = n;
                    this.l.x = d5;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiResourceAllocator.a(customSystemException);
            }
            return true;
        }
        if (protocolInteractionController.B(ReflectionMetadataResolver.EL)) {
            double d6 = RuntimeResourceTracker.v(lightweightExecutionContext);
            try {
                if (d6 > this.L.x) {
                    this.L.M = n;
                    this.L.x = d6;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiResourceAllocator.a(customSystemException);
            }
            return true;
        }
        if (protocolInteractionController.B(ReflectionMetadataResolver.x)) {
            double d7 = RuntimeResourceTracker.g(lightweightExecutionContext);
            try {
                if (d7 > this.M.x) {
                    this.M.M = n;
                    this.M.x = d7;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiResourceAllocator.a(customSystemException);
            }
            return true;
        }
        if (protocolInteractionController.B(ReflectionMetadataResolver.b9)) {
            double d8 = RuntimeResourceTracker.Z(lightweightExecutionContext);
            try {
                if (d8 > this.B.x) {
                    this.B.M = n;
                    this.B.x = d8;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MultiResourceAllocator.a(customSystemException);
            }
            return true;
        }
        return false;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

