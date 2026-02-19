/*
 * Decompiled with CFR 0.152.
 */
package com.app.execution;

import com.deobfuscation.bytecode.BytecodeTransformer;
import com.identity.management.UniversalIdentityManager;
import com.network.protocol.NetworkPacketInterceptor;

public class TimedExecutionController
extends BytecodeTransformer {
    private static String[] G;
    private final long U;
    private final boolean p;

    public boolean d() {
        return this.p;
    }

    static {
        if (TimedExecutionController.P() == null) {
            TimedExecutionController.q(new String[5]);
        }
    }

    public static String[] P() {
        return G;
    }

    public long O() {
        return this.U;
    }

    public static void q(String[] stringArray) {
        G = stringArray;
    }

    public TimedExecutionController(NetworkPacketInterceptor networkPacketInterceptor, UniversalIdentityManager universalIdentityManager) {
        this(networkPacketInterceptor, universalIdentityManager.U(), universalIdentityManager.d());
    }

    public TimedExecutionController(NetworkPacketInterceptor networkPacketInterceptor, long l, boolean bl) {
        super(networkPacketInterceptor);
        this.U = l;
        this.p = bl;
    }
}

