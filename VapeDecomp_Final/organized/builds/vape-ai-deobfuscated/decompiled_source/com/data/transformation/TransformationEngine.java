/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import com.app.resources.ResourceLifecycleManager1543;
import com.network.connection.NetworkConnectionManager1945;
import com.reflection.proxy.ReflectionProxyManager;
import com.security.event.SecureEventOrchestrator;
import com.system.resource.ResourceAllocator1606;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TransformationEngine
extends SecureEventOrchestrator {
    public ResourceAllocator1606 R() {
        return new ResourceAllocator1606(TransformationEngine.U.u().GU.D(this.H));
    }

    public ResourceLifecycleManager1543 I(int n, int n2) {
        return new ResourceLifecycleManager1543(ReflectionProxyManager.w(TransformationEngine.U.u().GU, this.H, n, n2));
    }

    public int R() {
        return ReflectionProxyManager.F(TransformationEngine.U.u().GU, this.H);
    }

    public ResourceLifecycleManager1543 y() {
        return new ResourceLifecycleManager1543(ReflectionProxyManager.d(TransformationEngine.U.u().GU, this.H));
    }

    public int V() {
        return ReflectionProxyManager.g(TransformationEngine.U.u().GU, this.H);
    }

    public static NetworkConnectionManager1945 U() {
        return new NetworkConnectionManager1945(TransformationEngine.U.u().GU.y());
    }

    public int H() {
        return ReflectionProxyManager.H(TransformationEngine.U.u().GU, this.H);
    }

    public int r() {
        return ReflectionProxyManager.y(TransformationEngine.U.u().GU, this.H);
    }

    public TransformationEngine(Object object) {
        super(object);
    }
}

