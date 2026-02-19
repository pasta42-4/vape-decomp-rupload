/*
 * Decompiled with CFR 0.152.
 */
package com.logging.audit;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.identity.management.UniversalIdentityManager;
import com.network.protocol.NetworkPacketInterceptor;
import java.util.UUID;

public class AuditTraceLogger
extends BytecodeTransformer {
    private final String N;
    private final long W;
    private final UUID u;

    public String a() {
        return this.N;
    }

    public UUID S() {
        return this.u;
    }

    public long s() {
        return this.W;
    }

    public AuditTraceLogger(NetworkPacketInterceptor networkPacketInterceptor, UniversalIdentityManager universalIdentityManager) {
        this(networkPacketInterceptor, universalIdentityManager.U(), universalIdentityManager.q(), universalIdentityManager.v());
    }

    public AuditTraceLogger(NetworkPacketInterceptor networkPacketInterceptor, long l, UUID uUID, String string) {
        super(networkPacketInterceptor);
        this.W = l;
        this.u = uUID;
        this.N = string;
    }
}

