/*
 * Decompiled with CFR 0.152.
 */
package com.network.connection;

import com.data.transformation.ResourceTransformationEngine;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.network.connection.ConnectionLifecycleHandler;

public class NetworkConnectionManager1286
extends ConnectionLifecycleHandler {
    public void U(double d2) {
        try {
            if (this.H == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        if (GameVersionEnumerator.MC_1_21_10.H()) {
            ContextualEventDispatcher contextualEventDispatcher = this.Q();
            contextualEventDispatcher.N(d2);
            ResourceTransformationEngine.z(NetworkConnectionManager1286.U.u().GB, this.H, contextualEventDispatcher.M());
            return;
        }
        ResourceTransformationEngine.D(NetworkConnectionManager1286.U.u().GB, this.H, (int)d2);
    }

    private ContextualEventDispatcher Q() {
        return new ContextualEventDispatcher(ResourceTransformationEngine.v(NetworkConnectionManager1286.U.u().GB, this.H));
    }

    public int h() {
        try {
            if (this.H == null) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        return ResourceTransformationEngine.F(NetworkConnectionManager1286.U.u().GB, this.H);
    }

    public int I() {
        try {
            if (this.H == null) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        try {
            if (GameVersionEnumerator.MC_1_21_10.H()) {
                return (int)(this.Q().F() * 8000.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        return ResourceTransformationEngine.U(NetworkConnectionManager1286.U.u().GB, this.H);
    }

    public int K() {
        try {
            if (this.H == null) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        try {
            if (GameVersionEnumerator.MC_1_21_10.H()) {
                return (int)(this.Q().X() * 8000.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        return ResourceTransformationEngine.x(NetworkConnectionManager1286.U.u().GB, this.H);
    }

    public int o() {
        try {
            if (this.H == null) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        try {
            if (GameVersionEnumerator.MC_1_21_10.H()) {
                return (int)(this.Q().f() * 8000.0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        return ResourceTransformationEngine.n(NetworkConnectionManager1286.U.u().GB, this.H);
    }

    public void Y(double d2) {
        try {
            if (this.H == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        if (GameVersionEnumerator.MC_1_21_10.H()) {
            ContextualEventDispatcher contextualEventDispatcher = this.Q();
            contextualEventDispatcher.F(d2);
            ResourceTransformationEngine.z(NetworkConnectionManager1286.U.u().GB, this.H, contextualEventDispatcher.M());
            return;
        }
        ResourceTransformationEngine.h(NetworkConnectionManager1286.U.u().GB, this.H, (int)d2);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void c(double d2) {
        try {
            if (this.H == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw NetworkConnectionManager1286.a(customSystemException);
        }
        if (GameVersionEnumerator.MC_1_21_10.H()) {
            ContextualEventDispatcher contextualEventDispatcher = this.Q();
            contextualEventDispatcher.Q(d2);
            ResourceTransformationEngine.z(NetworkConnectionManager1286.U.u().GB, this.H, contextualEventDispatcher.M());
            return;
        }
        ResourceTransformationEngine.M(NetworkConnectionManager1286.U.u().GB, this.H, (int)d2);
    }

    public NetworkConnectionManager1286(Object object) {
        super(object);
    }
}

