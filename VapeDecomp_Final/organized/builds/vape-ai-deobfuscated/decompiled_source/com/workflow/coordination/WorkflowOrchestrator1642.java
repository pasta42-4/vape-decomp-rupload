/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.workflow.coordination;

import a.c0;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometricCalculator1977;
import com.network.protocol.NetworkProtocolEncoder1013;
import com.security.authentication.SessionTokenGenerator;
import org.jetbrains.annotations.Nullable;

public class WorkflowOrchestrator1642 {
    @Nullable
    private SessionTokenGenerator C;
    @Nullable
    private GeometricCalculator1977 G;
    @Nullable
    private c0 n;

    @Nullable
    public SessionTokenGenerator c() {
        return this.C;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Nullable
    public GeometricCalculator1977 T() {
        return this.G;
    }

    public void r(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        boolean bl;
        NetworkProtocolEncoder1013 networkProtocolEncoder10132;
        boolean bl2;
        NetworkProtocolEncoder1013 networkProtocolEncoder10133;
        boolean bl3;
        NetworkProtocolEncoder1013 networkProtocolEncoder10134;
        try {
            networkProtocolEncoder10134 = networkProtocolEncoder1013;
            bl3 = this.G != null;
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator1642.a(customSystemException);
        }
        try {
            networkProtocolEncoder10134.W(bl3);
            if (this.G != null) {
                this.G.p(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator1642.a(customSystemException);
        }
        try {
            networkProtocolEncoder10133 = networkProtocolEncoder1013;
            bl2 = this.n != null;
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator1642.a(customSystemException);
        }
        try {
            networkProtocolEncoder10133.W(bl2);
            if (this.n != null) {
                this.n.H(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator1642.a(customSystemException);
        }
        try {
            networkProtocolEncoder10132 = networkProtocolEncoder1013;
            bl = this.C != null;
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator1642.a(customSystemException);
        }
        try {
            networkProtocolEncoder10132.W(bl);
            if (this.C != null) {
                this.C.u(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator1642.a(customSystemException);
        }
    }

    public WorkflowOrchestrator1642(@Nullable GeometricCalculator1977 geometricCalculator1977, @Nullable c0 c02, @Nullable SessionTokenGenerator sessionTokenGenerator) {
        this.G = geometricCalculator1977;
        this.n = c02;
        this.C = sessionTokenGenerator;
    }

    public WorkflowOrchestrator1642(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        if (networkProtocolEncoder1013.B()) {
            this.G = new GeometricCalculator1977(networkProtocolEncoder1013);
        }
        try {
            if (networkProtocolEncoder1013.B()) {
                this.n = new c0(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator1642.a(customSystemException);
        }
        try {
            if (networkProtocolEncoder1013.B()) {
                this.C = new SessionTokenGenerator(networkProtocolEncoder1013);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw WorkflowOrchestrator1642.a(customSystemException);
        }
    }

    @Nullable
    public c0 P() {
        return this.n;
    }
}

