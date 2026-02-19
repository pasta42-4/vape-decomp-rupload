/*
 * Decompiled with CFR 0.152.
 */
package com.app.data.processing;

import a.Qh;
import a.qv;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.analysis.NetworkTrafficAnalyzer;
import com.network.protocol.NetworkProtocolNegotiator;
import com.resource.management.ResourceLifecycleManager1429;
import com.runtime.context.LightweightExecutionContext;
import com.security.auth.AuthorizationManager;
import com.security.context.SecurityContextManager2112;
import com.security.transform.CryptographicTransformer;
import com.system.lifecycle.ObjectLifecycleTracker;

public class StreamTransformationProcessor
extends ObjectLifecycleTracker {
    public AuthorizationManager u() {
        return new AuthorizationManager(qv.J(StreamTransformationProcessor.U.u().k1, this.H));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void Q() {
        StreamTransformationProcessor.U.u().k1.w(this.H);
    }

    public void R(Qh qh, CryptographicTransformer cryptographicTransformer) {
        qv.X(StreamTransformationProcessor.U.u().k1, this.H, qh.M(), cryptographicTransformer.M());
    }

    public boolean f() {
        return false;
    }

    public float T() {
        return qv.L(StreamTransformationProcessor.U.u().k1, this.H);
    }

    public boolean q() {
        return qv.E(StreamTransformationProcessor.U.u().k1, this.H);
    }

    public void D(Qh qh) {
        StreamTransformationProcessor.U.u().k1.O(this.H, qh.M());
    }

    public LightweightExecutionContext e(int n, int n2, int n3, int n4, Qh qh) {
        try {
            if (GeometryCalculator.C() >= 37) {
                StreamTransformationProcessor.U.u().k1.X(this.H, n, n2, n3, ResourceLifecycleManager1429.c[n4].M(), qh.M());
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamTransformationProcessor.a(customSystemException);
        }
        try {
            if (GeometryCalculator.C() >= 23) {
                return new LightweightExecutionContext(StreamTransformationProcessor.U.u().k1.X(this.H, n, n2, n3, ResourceLifecycleManager1429.c[n4].M(), qh.M()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamTransformationProcessor.a(customSystemException);
        }
        return new LightweightExecutionContext(StreamTransformationProcessor.U.u().k1.Q(this.H, n, n2, n3, n4, qh.M()));
    }

    public StreamTransformationProcessor(Object object) {
        super(object);
    }

    public void p() {
        qv.l(StreamTransformationProcessor.U.u().k1, this.H);
    }

    public boolean e(Qh qh, NetworkProtocolNegotiator networkProtocolNegotiator, LightweightExecutionContext lightweightExecutionContext) {
        if (GeometryCalculator.C() >= 23) {
            NetworkTrafficAnalyzer networkTrafficAnalyzer = new NetworkTrafficAnalyzer(StreamTransformationProcessor.U.u().k1.M(this.H, qh.M(), networkProtocolNegotiator.M(), SecurityContextManager2112.R().M()));
            return networkTrafficAnalyzer.equals(NetworkTrafficAnalyzer.L());
        }
        return StreamTransformationProcessor.U.u().k1.o(this.H, qh.M(), networkProtocolNegotiator.M(), lightweightExecutionContext.M());
    }

    public float y() {
        try {
            if (GeometryCalculator.C() >= 50) {
                return StreamTransformationProcessor.U.u().k1.L(ApplicationLifecycleManager.U().M());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamTransformationProcessor.a(customSystemException);
        }
        return StreamTransformationProcessor.U.u().k1.L(this.H);
    }
}

